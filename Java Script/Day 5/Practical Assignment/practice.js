console.log(window);
console.log(window.document);
console.dir(window.document);

console.log(document.querySelector("body"));
const bodyElement = document.querySelector("body");
const divElement= document.createElement("div");
bodyElement.appendChild(divElement);
divElement.style.backgroundColor="red";
divElement.style.width="500px";
divElement.textContent="hi i am Ritesh"