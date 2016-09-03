/**
 * 
 */
//topic: Variables
//var school;
//document.write("<p>school before initialized: " + school + "</p>");
//school = "SJSU";
//document.write("<p>school after initialized: " + school + "</p>");
//school = 10;
//document.write("school after 2nd assignment: " + school);

//topic: Object
//function Employee(name, dob, salary_per_hour) {
//	this.name = name;
//	this.dob = dob;
//	this.salary_per_hour = salary_per_hour;
//	this.calMonthlySalary = calMonthlySalary;
//}
//
//function calMonthlySalary(num_of_hours) {
//	return this.salary_per_hour * num_of_hours;
//}
//
//var player1 = new Employee("Wayne Rooney", "10/24/1985", 200);
//var player2 = new Employee("Cristiano Ronaldo", "02/05/1985", 260);
//var player3 = new Employee("Lionel Messi", "06/24/1987", 280);
//
//document.write("<p>Salary of the players this month:" + "</p>");
//document.write("<p>" + player1.name + "&emsp;" + player1.dob + "&emsp;" + player1.calMonthlySalary(40) + "</p>");
//document.write("<p>" + player2.name + "&emsp;" + player2.dob + "&emsp;" + player2.calMonthlySalary(35) + "</p>");
//document.write("<p>" + player3.name + "&emsp;" + player3.dob + "&emsp;" + player3.calMonthlySalary(38) + "</p>");

//topic Function
//var nums = [4, 4, 7, 23, 65, 78, 79, 95, 100, 110, 245, 678];
//
//function find(i, j, num) {
//	if (i >= j) {
//		if (nums[i] == num) {
//			return true;
//		}
//	} else {
//		var k = ((i + j) / 2) | 0;
//		var part1 = find(i, k, num);
//		return part1 ? part1 : find(k+1, j, num);
//	}
//	return false;
//}
//document.write("nums = [4, 4, 7, 23, 65, 78, 79, 95, 100, 110, 245, 678]");
//document.write("<p>" + "7 is in the nums?" + "&emsp;" + find(0, nums.length -1 , 7) + "</p>");
//document.write("<p>" + "101 is in the nums?" + "&emsp;" + find(0, nums.length -1, 101) + "</p>");

//topic Event
function showSchool() {
	document.getElementById("hovertext").innerHTML = "My School is San Jose State University :-)";
}

//topic Array
//var stringArray = ["WayNe", "RoONey", "CriStiAnO", "RonalDo", "LiOnEl", "Messi"];
//function lowerCase(str) {
//	return str.toLowerCase();
//}
//
//var lowerCaseStringArray = stringArray.map(lowerCase);
//document.write("<p>" + lowerCaseStringArray + "</p>");

//topic Inheritance
var Vehicle = function(name, velocity) {
	this.name = name;
	this.velocity = velocity;
}

Vehicle.prototype.run = function() {
	document.write("<p>" + this.name + " runs with the speed of " + "&emsp;" + this.velocity + "&emsp;mph" + "</p>");
}

var setInheritance = function(child, parent) {
	child.prototype = Object.create(parent.prototype);
}

var Car = function(name, velocity) {
	this.name = name;
	this.velocity = velocity;
}

setInheritance(Car, Vehicle);

var Truck = function(name, velocity) {
	this.name = name;
	this.velocity = velocity;
}

setInheritance(Truck, Vehicle);

var car = new Car("Car", 35);
var truck = new Truck("Truck", 25);

//car.run();
//truck.run();

//topic Condition
var numList = [6, -3, 14, 5, -6, 2, 3];
var greatestNum = numList[0];
var smallestNum = numList[0];
var compare = function(item, index) {
	if (greatestNum < item) {
		greatestNum = item;
	} else if (smallestNum > item) {
		smallestNum = item;
	}
}
numList.forEach(compare);
//document.write("<p>numList = [6, -3, 14, 5, -6, 2, 3]</p>");
//document.write("<p>" + "The greatest number is: " + greatestNum + "&emsp;" + "The smalles number is: " + smallestNum + "</p>");

//topic Regular Expression
var files = ["resume.txt", "financial.csv", "book.ltxt", "employee.txt", "habit.pdf", "abctxt"];
var txtFile = [];

var txtReg = new RegExp("\\.txt$");

for (var i = 0; i < files.length; i++) {
	if (null != files[i].match(txtReg)) {
		txtFile.push(files[i]);
	}
}
//document.write("<p>files = [\"resume.txt\", \"financial.csv\", \"book.ltxt\", \"employee.txt\", \"habit.pdf\", \"abctxt\"]</p>");
//document.write("<p>List txt files: " + txtFile +  "</p>");


//topic Strict mode
var strictFunction = function() {
	"use strict";
	var y = 4;
	document.write("<p> y: " + y + "</p>");
	
	x = 3;
	document.write("<p> x: " + x + "</p>");
}

//strictFunction();


//topic Error
function testRuntimeError() {
	try {
		document.write("<p>I am trying to call undeclare funtion: workHard()</p>");
		workHard();
	} catch (e) {
		document.write("<p>Error catched: " + e.description + "</p>");
	}
}

//testRuntimeError();

//topic Type conversion
var formular1 = "200+400";
var formular2 = "500-50";

var cal = function(formular) {
	var addIndex = formular.indexOf('+');
	var minusIndex = formular.indexOf("-");
	var timeIndex = formular.indexOf("*");
	var devideIndex = formular.indexOf("/");
	
	if (addIndex != -1 || minusIndex != -1 || timeIndex != -1 || devideIndex != -1) {
		var operatorIndex = addIndex + minusIndex + timeIndex + devideIndex + 3;
		var firstOperand = Number(formular.substr(0, operatorIndex)); //type conversion
		var secondOperand = Number(formular.substr(operatorIndex+1, formular.length - (operatorIndex+1))); //type conversion
		if (addIndex != -1) {
			return firstOperand + secondOperand;
		} else if (minusIndex |= -1) {
			return firstOperand - secondOperand;
		} else if (timeIndex != -1) {
			return firstOperand * secondOperand;
		} else if (devideIndex != -1) {
			return firstOperand - secondOperand;
		}
	}
	return null;
}

//document.write("<p>calculate 200+400= " + cal(formular1) + "</p>");
//document.write("<p>calculate 500-50= " + cal(formular2) + "</p>");

//topic JSON
var reqs = "{\"requests\":[" + 
				"{\"client\":\"Chrome\",\"time\":\"Fri Sep 02 2016 21:14:55 GMT-0700 (PDT)\"}," +
				"{\"client\":\"FireFox\",\"time\":\"Fri Sep 02 2016 21:13:55 GMT-0700 (PDT)\"}]}";

try {
	var reqObj = JSON.parse(reqs);
	var now = new Date().getTime() / 1000;
	for (var i = 0; i < reqObj.requests.length; i++) {
		var clientName = reqObj.requests[i].client;
		var time = new Date(reqObj.requests[i].time).getTime() / 1000;
		document.write("<p>Client: " + clientName + " time received: " +  reqObj.requests[i].time + "-->" + (now - time > 60 ? "timeout" : "valid") + "</p>");
	}
} catch (e) {
	// TODO: handle exception
	alert("ERROR: " + e.description);
}
				
				