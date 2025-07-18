const person = {
    name : "Yatin",
    age : 23,
    "person hobbie" : ["Football","Cricket","Swimming"]
}

for(let key in person){
    console.log(key," : " ,person[key]);
}

for(let key in person){
    console.log(`${key} : ${person[key]}`);
}

console.log(Object.keys(person));

console.log(Object.values(person));