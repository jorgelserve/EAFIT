const express = require('express')
const app = express()

app.use(express.static('public'))
app.set('view engine', 'pug')

app.get('*', (req, res) => {
	res.status(200).render('index')
})

var port = process.env.PORT || 3000

app.listen(port, () => console.log(`escuchando en puerto ${port}`))