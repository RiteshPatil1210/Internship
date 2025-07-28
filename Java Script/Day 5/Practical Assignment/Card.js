


console.log(window);
console.log(window.document);
console.dir(window.document);

console.log(document.querySelector("body"));

const bodyElement = document.querySelector("body");

const divElement = document.createElement("div");



bodyElement.style.backgroundColor="rgb(185,227,247)";
bodyElement.style.display="flex";
bodyElement.style.justifyContent="center";

bodyElement.appendChild(divElement);

divElement.style.backgroundColor="rgb(219,241,252)";
divElement.style.border= "1px solid black";
divElement.style.width="600px";
divElement.style.height="350px";
divElement.style.borderRadius="20px"

const navigate=document.createElement("nav");

divElement.appendChild(navigate);

navigate.style.display="flex";

const imgElement=document.createElement("img");

navigate.appendChild(imgElement);

imgElement.src="/Users/riteshpatil/Documents/Internship/Java Script/Day 5/Practical Assignment/WhatsApp Image 2025-07-06 at 10.39.20 copy.jpeg";
imgElement.style.height="90px";
imgElement.style.width="160px";
imgElement.style.border="5px solid white";
imgElement.style.borderRadius="50%"
imgElement.style.objectFit="cover";
imgElement.style.marginTop="40px";
imgElement.style.marginLeft="30px";

const textElement=document.createElement("h1");

navigate.appendChild(textElement);

textElement.textContent="Ritesh Patil";
textElement.style.marginTop="50px";
textElement.style.marginLeft="40px";
textElement.style.fontSize="32px";

const tElement=document.createElement("h6");

textElement.appendChild(tElement);

tElement.textContent="@ritesh_1210_";
tElement.style.marginTop="2px"
tElement.style.color="#444747";

const cElement=document.createElement("h4");
textElement.appendChild(cElement);

cElement.textContent="I’m a Front-End Developer. Follow me to stay updated with my latest projects and creative work.";
cElement.style.marginTop="-30px";
cElement.style.fontSize="19px"
cElement.style.fontFamily="Bahnschrift SemiBold SemiConden";
cElement.style.color="#585d5e";

const s1Element=document.createElement("span");

textElement.appendChild(s1Element);
s1Element.textContent="100K";
s1Element.style.fontSize="24px"
s1Element.style.fontWeight="bold"
s1Element.style.fontFamily="Arial Black"

const s2Element=document.createElement("span");
textElement.appendChild(s2Element);
s2Element.textContent="82 ";
s2Element.style.fontSize="24px"
s2Element.style.paddingLeft="70px"
s2Element.style.fontWeight="bold"
s2Element.style.fontFamily="Arial Black"

const s3Element=document.createElement("span");
textElement.appendChild(s3Element);
s3Element.textContent="1M ";
s3Element.style.fontSize="24px"
s3Element.style.paddingLeft="70px"
s3Element.style.fontWeight="bold"
s3Element.style.fontFamily="Arial Black"

const h2Element=document.createElement("h2");

textElement.appendChild(h2Element);
h2Element.style.display="flex";
h2Element.style.marginTop="1px"

const s4Element=document.createElement("span");

h2Element.appendChild(s4Element);
s4Element.textContent="Views";
s4Element.style.fontSize="17px"
s4Element.style.fontFamily="Arial Black"
// s4Element.style.fontWeight="90px";


const s5Element=document.createElement("span");

h2Element.appendChild(s5Element);
s5Element.textContent="Projects";
s5Element.style.fontSize="17px"
s5Element.style.paddingLeft="53px";
s5Element.style.fontFamily="Arial Black"
const s6Element=document.createElement("span");

h2Element.appendChild(s6Element);
s6Element.textContent="Followers";
s6Element.style.fontSize="17px"
s6Element.style.paddingLeft="28px";
s6Element.style.fontFamily="Arial Black"

const button=document.createElement("span");
textElement.appendChild(button);
button.style.marginTop="-20px";
button.style.display="flex";
button.style.gap="10px"

const bt1=document.createElement("button");
button.appendChild(bt1);

bt1.textContent="Follow";
bt1.style.backgroundColor="black"
bt1.style.color="white";
bt1.style.padding="12px 37px"
bt1.style.fontSize="16px"
bt1.style.borderRadius="9px"
bt1.style.fontWeight="bold"
bt1.addEventListener("click",function(){
    alert("Button clicked");
});

const bt2=document.createElement("button");
button.appendChild(bt2);

bt2.textContent="View profile";
bt2.style.backgroundColor="rgb(219,241,252)"
bt2.style.color="black";
bt2.style.padding="12px 27px"
bt2.style.fontSize="16px"
bt2.style.borderRadius="9px"
bt2.style.fontWeight="bold"
bt2.style.fontFamily="Bahnschrift SemiBold SemiConden";
bt2.addEventListener("click",function(){
    alert("Button clicked");
});






