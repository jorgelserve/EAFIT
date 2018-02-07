const express = require('express')
const app = express()

app.use(express.static('public'))
app.set('view engine', 'pug')

app.get('*', (req, res) => {
	res.status(200).render('index')
})

app.listen(3000, () => console.log('escuchando en puerto 3000'))