var imgOff = "images/lampoff.png";
var imgOn = "images/lampon.png";
var message = document.getElementById("message");
var white = "#ffffff";
var black = "#000000"


function swap() {
    document.getElementById("image").src = imgOn;
    var aux = imgOn;
    imgOn = imgOff;
    imgOff = aux;

    document.body.style.backgroundColor = white;
    var aux1 = white;
    white = black;
    black = aux1;
}