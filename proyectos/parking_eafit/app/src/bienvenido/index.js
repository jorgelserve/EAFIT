const page = require('page')
const empty = require('empty-element')
const yo = require('yo-yo')
const container = document.getElementById('container')

page('/bienvenido', verificarUsuario, (ctx, next) => {
	var starCountRef = firebase.database().ref('parqueaderos/0');
	empty(container).appendChild(yo`<div>
		<h2>Bienvenido ${ctx.user.email}</h2> <button class="btn waves-effect waves-light logout" onclick=${logout}>Cerrar sesión</button>
		<br><br>
		<div class="row">
			<div class="div col s8 offset-s2">
				<div class="progress">
					<div class="determinate" style="width: 70%"></div>
				</div>
			</div>
		</div>



	</div>`)

	starCountRef.on('value', function(snapshot) {
	  console.log(snapshot.val())
	});
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
			var displayName = user.displayName
			var email = user.email
			var emailVerified = user.emailVerified
			var photoURL = user.photoURL
			var isAnonymous = user.isAnonymous
			var uid = user.uid
			var providerData = user.providerData
			// ...
		} else {
			page('/signin')
		}
	})
}