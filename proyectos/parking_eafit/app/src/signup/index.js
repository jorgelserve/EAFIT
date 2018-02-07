const page = require('page')
const empty = require('empty-element')
const yo = require('yo-yo')
const container = document.getElementById('container')

page('/signup', (ctx, next) => {
	empty(container).appendChild(yo`<div class="row">
		<br><br>
		Crear una cuenta
		<form class="col s12" onsubmit=${crearUsuario}>
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

			<button class="btn waves-effect waves-light sign" type="submit">Crear Cuenta
				<i class="material-icons right">send</i>
			 </button>
		</form>
	</div>`)

	function crearUsuario(env) {
		env.preventDefault()
		let email = document.getElementById('email').value
		let password = document.getElementById('password').value
		firebase.auth().createUserWithEmailAndPassword(email, password)

			.then(function(){
				page('/bienvenido')
			})

			.catch(function(error) {
				// Handle Errors here.
				var errorCode = error.code
				var errorMessage = error.message
				// ...
			})
	}
})