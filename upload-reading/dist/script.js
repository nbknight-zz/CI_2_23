var image;
function upload() {
  // var tinput = document.getElementById("tinput").value;
  var fileInput = document.getElementById("finput");
  var canvas = document.getElementById("can");
  image = new SimpleImage(fileInput);
  image.drawTo(canvas);
  // alert("File name is " + tinput);
}

function makeGray(){
  //start with the image
  
  //for each pixel in the image
  for (var pixel of image.values()) {
  //1. Get the pixel's rgb values
    //2. calculate the average value
    var avg = (pixel.getRed()+pixel.getGreen()+pixel.getBlue())/3
  // 3. set rgb to average
    pixel.setRed(avg);
    pixel.setBlue(avg);
    pixel.setGreen(avg);
  //display the final image
    var imgcanvas = document.getElementById("can");
    image.drawTo(imgcanvas);
}
}