const page = require('page')
const empty = require('empty-element')
const yo = require('yo-yo')
const container = document.getElementById('container')

page('/', (ctx, next) => {
	empty(container).appendChild(yo`<div>
		<h2>Que es EAFIT park ?</h2>
		<p class="flow-text">Es una pequeña Web app para que no tengas que volver a perder la ida a alguno de los parqueaderos de la universidad por que están llenos, pues EAFIT park te dirá si lo están antes de que este ahí</p>
		<a href="/signup">Crear una cuenta</a>
		ó
		<br>
		Ya tienes una cuenta 
		<a href="/signin">Inicia sesión </a>
	</div>`)
})