(function e(t,n,r){function s(o,u){if(!n[o]){if(!t[o]){var a=typeof require=="function"&&require;if(!u&&a)return a(o,!0);if(i)return i(o,!0);var f=new Error("Cannot find module '"+o+"'");throw f.code="MODULE_NOT_FOUND",f}var l=n[o]={exports:{}};t[o][0].call(l.exports,function(e){var n=t[o][1][e];return s(n?n:e)},l,l.exports,e,t,n,r)}return n[o].exports}var i=typeof require=="function"&&require;for(var o=0;o<r.length;o++)s(r[o]);return s})({1:[function(require,module,exports){
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
},{}]},{},[1]);
