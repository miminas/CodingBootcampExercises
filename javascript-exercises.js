// javascript exercises

// Create a variable with name greeting and value Hello world!

var greeting = 'Hello world!';

// You are provided with two variables (you don’t have to declare them):
//
// A number: n (you can control it’s value using the input below)
// A boolean: isZero
// If the value of n equals 0, then assign the value true to isZero.
//
// If the value of n does not equal 0, then assign the value false to isZero.

if (n === 0){
  isZero = true;
} else {
  isZero = false;
}

// You are provided with a variable named counter and value 0 (you don’t have to declare it).
//
// Create either a for or a while loop that will run 5 times and will increment the value of counter by 1 during each step.
//
// The final value of counter should be 5.

for (counter; counter<=4; counter++) {
  counter++;
}

// Declare a function named cube that receives a single argument named n and returns n³.
//
// The value of n can be controled using the input below.
//
// Value of n

function cube(n) {
  return n * n * n;
}

// Create a <img></img> element and append it to the element with id parent.

var img = document.createElement('img');

var parent = document.getElementById('parent');

parent.appendChild(img);

// Modify the src attribute of the img element with id avatar to https://github.com/parisk.png

var avatar = document.getElementById('avatar');

avatar.src = 'https://github.com/parisk.png';
