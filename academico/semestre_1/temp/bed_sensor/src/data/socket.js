var socket = io.connect('http://localhost:8080', { 'forceNew': true })

var smoothie = new SmoothieChart()
smoothie.streamTo(document.getElementById("mycanvas"))

// Data
var x = new TimeSeries()
var y = new TimeSeries()
var z = new TimeSeries()

// Add a random value to each line every second
socket.on('gyro', function (data) {
	// console.log(data)
	x.append(new Date().getTime(), data.x)
	y.append(new Date().getTime(), data.y)
	z.append(new Date().getTime(), data.z)
})

// // Add to SmoothieChart
smoothie.addTimeSeries(x)
smoothie.addTimeSeries(y)
smoothie.addTimeSeries(z)