const page = require('page')
const empty = require('empty-element')
const yo = require('yo-yo')
const container = document.getElementById('container')

page('/signin', (ctx, next) => {
	firebase.auth().onAuthStateChanged(function(user) {
		if (user) {
			page('/bienvenido')
		}
	});
	empty(container).appendChild(yo`<div class="row">
		<br><br>
		Inicia sesión 
		<form class="col s12" onsubmit=${iniciarUsuario}>
			<div class="row">
				<div class="input-field col s6">
					<input id="email" type="email" class="validate"/>
					<label for="email">email</label>
				</div>
				<div class="input-field col s6">
					<input id="password" type="password" class="validate"/>
					<label for="password">Contraseña</label>
				</div>
			</div>

			<button class="btn waves-effect waves-light" type="submit">Inicia sesión
				<i class="material-icons right">send</i>
			 </button>
		</form>
	</div>`)

	function iniciarUsuario(env) {
		env.preventDefault()

		let email = document.getElementById('email').value
		let password = document.getElementById('password').value
		firebase.auth().signInWithEmailAndPassword(email, password)
			.then(function () {
				page('/bienvenido')
			})

			.catch(function(error) {
				alert('Ocurrio un error')
			});

		
		
	}
})
