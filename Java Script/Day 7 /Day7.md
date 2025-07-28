# Day 7: JavaScript Concepts

## Event Flow
Event flow in JavaScript describes how events move through the Document Object Model (DOM) when an event occurs. It consists of three phases: capturing, target, and bubbling. During the capturing phase, the event travels from the root of the DOM down to the target element. The target phase is when the event reaches the intended element. Finally, in the bubbling phase, the event moves back up from the target to the root. By default, most event listeners respond during the bubbling phase, but developers can choose to handle events during the capturing phase if needed.

---

## Callback
A callback is a function that is passed as an argument to another function and is executed after a certain event or operation has completed. Callbacks are widely used in JavaScript, especially for asynchronous tasks such as API requests, timers, and event handling. They allow developers to specify what should happen once a particular task is finished, making code more flexible and responsive.

---

## .then()
The .then() method is associated with Promises in JavaScript and is used to handle asynchronous operations. When a Promise is resolved, the function provided to .then() is executed, allowing developers to process the result or perform additional actions. This method can be chained to handle multiple asynchronous steps in a readable and organized way.

---

## setInterval()
The setInterval() function repeatedly executes a specified function at fixed time intervals, defined in milliseconds. It is useful for tasks that need to run continuously, such as updating a clock, polling for data, or performing regular checks. The interval continues until it is explicitly stopped using clearInterval().

---

## setTimeout()
The setTimeout() function executes a specified function once after a set delay, measured in milliseconds. It is commonly used to schedule tasks to run after a certain period, such as displaying a message, triggering an animation, or delaying an operation. Unlike setInterval(), setTimeout() runs the function only once.

---

## Synchronous vs Asynchronous
Synchronous programming in JavaScript means that code is executed line-by-line, with each line waiting for the previous one to finish before running. This can lead to delays if a task takes a long time to complete. Asynchronous programming, on the other hand, allows certain operations to run in the background, enabling the rest of the code to continue executing without waiting. Functions like setTimeout, setInterval, Promises, and API calls are examples of asynchronous operations, making JavaScript efficient for handling tasks that require waiting or can be performed independently.

---

## API (Application Programming Interface)
An API is a set of rules and protocols that enables different software systems to communicate with each other. In web development, APIs are commonly used to fetch or send data to a server, allowing applications to interact with external services or databases. REST APIs typically return data in JSON format, which can be processed and displayed in web applications. APIs are essential for building dynamic, interactive, and connected web experiences.