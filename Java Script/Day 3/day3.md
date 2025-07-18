##  Dot vs Bracket Notation

Used to access object properties.


const person = { name: "Ritesh", age: 18 };

console.log(person.name);      
console.log(person["age"]);     


Use bracket notation when the key is stored in a variable or has special characters.

---

##  Intro to Objects

Objects are used to group related data and functions.


const car = {
  brand: "Toyota",
  year: 2021
};


---

##  Nested Destructuring

You can pull out values from inside nested objects or arrays.


const user = {
  name: "Ritesh",
  address: {
    city: "Pune",
    zip: 411001
  }
};

const { address: { city } } = user;
console.log(city); // Pune


---

##  Object Inside Array

An array can store objects too.


const users = [
  { id: 1, name: "Om" },
  { id: 2, name: "Sai" }
];

console.log(users[0].name); 


---

##  Spread Operator

Used to copy or combine arrays/objects.


const nums = [1, 2, 3];
const newNums = [...nums, 4]; 



const obj = { a: 1 };
const newObj = { ...obj, b: 2 }; 


---

##  Arrow Function

A shorter way to write functions.


const add = (a, b) => a + b;


---

##  Block Scope

Variables declared with let and const are limited to the block they’re in.

{
  let x = 10;
  console.log(x); 
}
 console.log(x); 


---

## Lexical Scope

Functions can access variables from the place where they were defined.


function outer() {
  let a = 5;
  function inner() {
    console.log(a); // 5
  }
  inner();
}
outer();


---

##  Callback Function

Passing one function into another to run later.


function greet(name, callback) {
  callback(name);
}

greet("Aditi", (n) => {
  console.log("Hello, " + n);
});


---

##  Default Parameter

Function parameters can have default values.


function greet(name = "Guest") {
  console.log("Hello, " + name);
}

greet();


---

##  Function Declaration

Standard way to define a function.


function sayHi() {
  console.log("Hi!");
}


---

## 🔄 Function Inside Function

Yes, functions can be nested.


function outer() {
  function inner() {
    console.log("Inside inner");
  }
  inner();
}


---

##  Hoisting (Intro)

Function and var declarations are moved to the top of their scope.


sayHello(); // Works

function sayHello() {
  console.log("Hello");
}


---

## Parameter Destructuring

You can unpack values directly in the function parameters.


const user = { name: "Dev", age: 25 };

function showInfo({ name, age }) {
  console.log(name, age);
}

showInfo(user);


---

