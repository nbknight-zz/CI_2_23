// var a;

// a = "Nick";
// console.log(a);

// let b;

// b = a;
// console.log(b);

// const c = 3.14;
// console.log(c);

// let noun = "Happy";
// let noun2 = "Birthday";

// console.log(noun + " " + noun2);

// var hit = "This has double quotes"; //This is a string
// var sq = 'This has single quotes';
// var bt = `This has backticks`

// var yes = 7;
// yes = 7.8; // This is a number

// let z = true;
// let y = false;

// let abc = "abc";
// console.log(typeof abc);

// abc = 13;
// console.log(typeof abc);

// let x = 7 + 7 + 7;
// x = 7 + 7 + "7"
// console.log(x);

// let y = "hello";
// let z = "world";
// y = y + z;
// console.log(y);

// let amountRaisedSoFor = 1000;
// let donation = prompt("How much would you like to donate");

// amountRaisedSoFor = Number(donation) + amountRaisedSoFor;

// console.log("We have now raised: " + amountRaisedSoFor + "!");

// let x = parseInt("10");
// let y = toString(10.55);
// console.log(typeof y);

// s

//create 3 variabls
//at least 1 string and 1 number
//create another variable and assign the concatenation of the first three.
//print in the console.

// let dog = "buscuit";
// let goodDog = true;
// let age = 2;

// let final = dog + " " + age + " is a good dog?\n" + goodDog;
// console.log(final);

// let something;
// console.log(typeof something);

// let n = null;
// console.log(n);

// console.log(typeof n);


//Simple if statement
// let temp = 44;

// if (temp >= 45) {
//     console.log("I'm going hiking!");
// } else {
//     console.log("It's too cold to go hiking");
// }

// > greater than
// < less than
// >= greater than or equal to
// <= less than or equal to

// let x = 10;
// if (x != '10') { //Type coersion is happening here!
//     console.log(true); //true
// }

// if (x === '10') {
//     console.log(true); //false
// } else {
//     console.log(false);
// }

// Stores the number of cups (that a person has consumed) in a variable
// let cups = 2;
// // If the person has had *less than* 3 cups
// if (cups < 3 || cups > 1 || cups != 2 || ) {
//     console.log("Yes I'll take another cup of coffee.");
// } else if (cups > 7{
//     console.log("I think I'm okay for now.");
// }
// Log a message to the console saying: ("Yes I'll take another cup of coffee.")
// If not
// Log a message to the console saying ("I think I'm okay for now.") 




// Create a variable for the temperature and set it to 80
// Write a statement that outputs the temperature as "The temperature is 80 degrees."
// If the temp is greater than 80, output "time to swim" (set temp to 60, 90) and test.
// Create a precipitation variable and set it to false.
// Only output "time to swim" if temp is greater than 80 and it's not raining.
// Set the precipitation variable to "raining" or "snowing" and only output "time to swim" if there is no precipitation.
// Create an "indoors" variable and set it to true.
// If indoors, then output "time to swim" regardless of the temp and precipitation.

//I need a variable called temp and set to 80
// let temp = 79;
// let precipitation = false;
// let indoors = true;
// console.log("The temp is " + temp);
// if (temp > 80 && precipitation === false || indoors) { //if the temp is above 80 and no precip
//     console.log("time to swim");
// }


// let bottle = 0;

// for (bottle; bottle <= 99; bottle++) {
//     if (bottle === 99) {
//         console.log("Go buy more root beer");
//     } else {
//         console.log(bottle + " bottle of root beer on the wall")
//     }

// }


// let x = 3
// switch (x) {
//     case 3:
//         console.log('three')
//     case 1:
//         console.log(1);
//     // break;
//     case 2:
//         console.log(2);
//     // break;
//     default:
//         console.log('default')
// }

// console.log(test); //console: undefined
// if (!test) { //true
//     var test = true; //create and assign test
//     console.log(test); //console: true
// }
// console.log(test); //this is dangerous! 


// for (let i = 0; i < 10; i++) {
//     console.log(i); // possible because i is within the scope
// }
// console.log(i); // undefined because i only existed in the loop

for (var i = 0; i < 10; i++) {
    console.log(i); //
}
console.log(i); // will log 9, the final value of i in the for loop, 
              //because var declared it globally