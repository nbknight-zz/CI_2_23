//Global Variables
var fgImage = null;
var bgImage = null;
var fgCanvas;
var bgCanvas;
var greenThreshold = 240;
// var forCanvas = document.getElementById("canvas");
// var bacCanvas = document.getElementById("can2");

//upload image
function loadForegroundImage() {

    var foregroundImage = document.getElementById("fgfile");
    fgCanvas = document.getElementById("canvas");
    // var grayCanvas = document.getElementById("can2");
    fgImage = new SimpleImage(foregroundImage);
    // grayImage = new SimpleImage(fileinput);
    fgImage.drawTo(fgCanvas);
    // grayImage.drawTo(grayCanvas);
}

function loadBackgroundImage() {
    var backgroundImage = document.getElementById("bgfile");
    bgCanvas = document.getElementById("can2");
    bgImage = new SimpleImage(backgroundImage);
    bgImage.drawTo(bgCanvas);
}

//make it gray
function makeGray() {
    for (var pixel of grayImage.values()) {
        var avg = (pixel.getRed() + pixel.getGreen() + pixel.getBlue()) / 3;
        pixel.setRed(avg);
        pixel.setGreen(avg);
        pixel.setBlue(avg);
    }
    var imageCanvas = document.getElementById("can2");
    grayImage.drawTo(imageCanvas);
}


function createComposite() {

    var output = new SimpleImage(fgImage.getWidth(), fgImage.getHeight());
    var fgCanvas = document.getElementById("canvas");
    for (var pixel of fgImage.values()) {
        var x = pixel.getX();
        var y = pixel.getY();
        if (pixel.getGreen() > greenThreshold) {
            var bgPixel = bgImage.getPixel(x, y);
            output.setPixel(x, y, bgPixel);
        }
        else {
            output.setPixel(x, y, pixel);
        }

    } return output;
}

function doGreenScreen() {
    if (fgImage == null || !fgImage.complete()) {
        alert("foreground not loaded");
        // return;
    }
    if (bgImage == null || !bgImage.complete()) {
        alert("background not loaded");
        // return;
    }
    clearCanvas();
    var finalImage = createComposite();
    finalImage.drawTo(fgCanvas);
}
//clear hte canvas
function clearCanvas() {
    doClear(fgCanvas);
    doClear(bgCanvas);
}

// create doClear
function doClear(canvas) {
    var context = canvas.getContext("2d");
    context.clearRect(0, 0, canvas.width, canvas.height);
}
