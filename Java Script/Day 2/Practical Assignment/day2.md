
# JavaScript Basics 
---

## Variables

Think of variables like containers that hold data. In JavaScript, you can create a variable using let, var, or const.

Example:
let name = "Ritesh";


---

## Keywords: let, var, const

- **let** – Block-scoped. You can reassign values.
- **var** – Function-scoped. Old-school JS, not used much nowadays.
- **const** – Block-scoped. Can’t be reassigned after it's set.

let age = 21;
var city = "Mumbai";
const country = "India";


---

## Strings

Strings are just text inside quotes.

let message = "Hello, World!";


---

## String Methods (Some Common Ones)

- length – Tells you how long the string is.
- toUpperCase() – Converts to uppercase.
- toLowerCase() – Converts to lowercase.
- slice(start, end) – Cuts out a part of the string.
- includes() – Checks if a string contains something.


let name = "JavaScript";
console.log(name.length); 
console.log(name.includes("Script")); 

---

## Loops

Loops let you run the same block of code multiple times.

### for loop

for(let i = 0; i < 5; i++) {
  console.log(i);
}


### while loop

let i = 0;
while(i < 5) {
  console.log(i);
  i++;
}


---

##  Operators

Operators help you do things like math or comparisons.

- Arithmetic: +, -, *, /, %
- Comparison: ==, ===, !=, <,>, <=, >=
- Logical: &&, ||, !


let sum = 10 + 5; // 15
console.log(5 > 2);


---

##  if...else

Used for decision-making.


let age = 18;

if(age >= 18) {
  console.log("You're an adult.");
} else {
  console.log("You're a minor.");
}


---

##  Arrays

Arrays are like lists that can hold multiple values.


let fruits = ["apple", "banana", "mango"];


You can access items using index numbers (starts from 0).


console.log(fruits[1]); 


---

## 🛠️ Some Array Methods

push() – Adds item to the end
pop() – Removes last item
unshift() – Adds item to the beginning
shift() – Removes first item


fruits.push("orange");


---
