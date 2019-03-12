const five = require("johnny-five")
const express = require('express')
const app = express()
const server = require('http').Server(app)
const io = require('socket.io')(server)

app.use(express.static('public'))
var board = new five.Board()

app.get('/', (req, res) => {
	res.status(200).send('hello word')
})

board.on("ready", function() {
	io.on('connection', (socket) => {
		var accelerometer = new five.Accelerometer({
			controller: "ADXL345",
			// Optionally set the range to one of
			// 2, 4, 8, 16 (±g)
			// Defaults to ±2g
			// range: ...
		})

		accelerometer.on("change", function() {
			io.sockets.emit('gyro', {
				x: this.x,
				y: this.y,
				z: this.z
			})
			// console.log("accelerometer")
			// console.log("  x            : ", this.x)
			// console.log("  y            : ", this.y)
			// console.log("  z            : ", this.z)
			// console.log("  pitch        : ", this.pitch)
			// console.log("  roll         : ", this.roll)
			// console.log("  acceleration : ", this.acceleration)
			// console.log("  inclination  : ", this.inclination)
			// console.log("  orientation  : ", this.orientation)
			// console.log("--------------------------------------")
		})
	})
})


var port = process.env.PORT || 8080
server.listen(port, () => console.log(`escuchando en el puerto ${port}`))