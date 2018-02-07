const page = require('page')
const empty = require('empty-element')
const yo = require('yo-yo')
const container = document.getElementById('container')
var toogle = false

page('/bienvenido', verificarUsuario, (ctx, next) => {
	var starCountRef = firebase.database().ref()
	starCountRef.child('parqueaderos').on('value', function(snapshot) {
		var element = yo`<div class="row">
		${snapshot.val().map(function (element) {
			return yo`<div class="col s12 m6">
				<div class="card">
					<div class="card-image">
						<img src="${element.url_img}">
						<span class="card-title">${element.titulo}</span>
					</div>
					<div class="card-content">
						${element.ocupadas}/${element.plazas}
						<div class="progress">
							<div class="determinate" style="width: ${(element.ocupadas*100)/element.plazas}%;" style="background-color: ${color((element.ocupadas*100)/element.plazas)}"></div>
						</div>
					</div>
					<div class="card-action">
						${
						
								parquear(element)
						}
					</div>
				</div>
			</div>`
		})}
	</div>`
		
	function parquear(element) {
		return yo`<button class="btn" onclick=${agregar}>Parquear</button>`
		function agregar () {
			
				firebase.auth().onAuthStateChanged(function(user) {
				
					if (user) {
						firebase.database().ref(`parqueaderos/${element.parqueadero}/`).set({
							ocupadas: element.ocupadas + 1,
							parqueadero: element.parqueadero,
							plazas: element.plazas,
							titulo: element.titulo,
							url_img: element.url_img
						});
					}
				})
		}
	}
	empty(container).appendChild(element)
	});
	
	
	
	function color(cantidad) {
		if(cantidad == 100) {
			return '#d50000'
		} else if (cantidad >= 50) {
			return '#ff6f00'
		} else if (cantidad >= 25) {
			return '#43a047'
		} else {
			return '#81c784'
		}
	}
	
})

function logout() {
	firebase.auth().signOut().then(function() {
		page('/')
	}, function(error) {
		alert('Ocurrio un error')
		console.log(error)
	});
}

function verificarUsuario(ctx, next) {
	firebase.auth().onAuthStateChanged(function(user) {
		if (user) {
			ctx.user = user
			next()
		} else {
			page('/signin')
		}
	})
}