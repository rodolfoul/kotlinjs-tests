package com.rl.scaleapp

import ext.date_fns.format
import kotlin.js.Date


fun main() {
//	document.bgColor = "red"
	println("fewoiv")
	val d = Date()
	val s = format(d, "'Today is a' iiii")

	println("date-fns: $s")
}