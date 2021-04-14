//Global Variables
var file;
var canvas;
var originalImage;
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
  originalImage = new SimpleImage (file);
  filter1 = new SimpleImage(file);
  filter2 = new SimpleImage(file);
  filter3 = new SimpleImage(file);
  originalImage.drawTo(canvas);
}

//is the image loaded?
function imageIsLoaded(image) {
  if(image == null || !image.complete()) {
    alert("Image is not loaded");
  }
  clearCanvas();
}
// clear

// grayScale
function grayScale() {
  for (var pixel of filter1.values()) {
    var avg = pixel.getRed() + pixel.getGreen() + pixel.getBlue() /3;
    pixel.setRed(avg);
    pixel.setGreen(avg);
    pixel.setBlue(avg);
  }
}

function doGray() {
  if(imageIsLoaded(filter1)) {
    grayScale();
    var grayCanvas = document.getElementById("can1");
    filter1.drawTo(grayCanvas);
  }
}

function clearCanvas() {
  var canvas = document.getElementById("can1");
  doClear(canvas);
}

function doClear(all){
  var context = all.getContext("2d");
  context.clearRect(0,0,all.width,all.height);
}