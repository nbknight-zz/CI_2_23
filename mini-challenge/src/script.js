//Global Variables
var file;
var canvas;
var originalImage = null;
var filter1 = null;
var filter2 = null;
var filter3 = null;
// upload
/*
When a user clicks a button and select an image file your web page will create a SimpleImage variable of the image file and draw it to the canvas
*/
function uploadImage() {
  canvas = document.getElementById("can1");
  file = document.getElementById("fileInput");
  originalImage = new SimpleImage(file);
  filter1 = new SimpleImage(file);
  filter2 = new SimpleImage(file);
  filter3 = new SimpleImage(file);
  originalImage.drawTo(canvas);
}

//is the image loaded?
function imageIsLoaded(image) {
  if (image == null || !image.complete()) {
    return false;
  }
  console.log("Image is loaded");
  return true;
}

// clear

// grayScale
function grayScale() {
  for (var pixel of filter1.values()) {
    var avg = pixel.getRed() + pixel.getGreen() + pixel.getBlue() / 3;
    pixel.setRed(avg);
    pixel.setGreen(avg);
    pixel.setBlue(avg);
  }
}

function doGray() {
  if (imageIsLoaded(filter1)) {
    grayScale();
    canvas = document.getElementById("can1");
    filter1.drawTo(canvas);
  } else {
    alert("No image loaded");
  }
}

// red filter
function redFilter() {
  for (var pixel of filter2.values()) {
    var avg = pixel.getRed() + pixel.getGreen() + pixel.getBlue() / 3;
    if (avg < 128) {
      pixel.setRed(avg * 2);
      pixel.setGreen(0);
      pixel.setBlue(0);
    } else {
      pixel.setRed(255);
      pixel.setGreen((avg * 2) - 255);
      pixel.setBlue((avg * 2) - 255);

    }
  }
}

function doRed() {
  if (imageIsLoaded(filter2)) {
    redFilter();
    canvas = document.getElementById("can1");
    filter2.drawTo(canvas);
  } else {
    alert("No image loaded");
  }
}

function alter() {
  for (var pixel of filter3.values()) {
    var red = pixel.getRed();
    var green = pixel.getGreen();
    var blue = pixel.getBlue();
    pixel.setRed(255 - red);
    pixel.setGreen(255 - green);
    pixel.setBlue(255 - blue);
  }
}

function invert() {
  if (imageIsLoaded(filter3)) {
    alter();
    canvas = document.getElementById("can1");
    filter3.drawTo(canvas);
  } else {
    alert("No image loaded");
  }
}





function clearCanvas() {
  // doClear(canvas);
  // filter1 = new SimpleImage(originalImage);
  // filter2 = new SimpleImage(originalImage);
  // filter3 = new SimpleImage(originalImage);
  if (imageIsLoaded(originalImage)) {
    originalImage.drawTo(canvas);
    filter1 = new SimpleImage(originalImage);
    filter2 = new SimpleImage(originalImage);
    filter3 = new SimpleImage(originalImage);
  } else {
    alert("You have to pick an image first")
  }
}

function doClear(oldCanvas) {
  //Is the original image loaded?
  if (imageIsLoaded(originalImage)) {
    originalImage.drawTo(oldCanvas);
  } else {
    alert("You have to pick an image first")
  }
}