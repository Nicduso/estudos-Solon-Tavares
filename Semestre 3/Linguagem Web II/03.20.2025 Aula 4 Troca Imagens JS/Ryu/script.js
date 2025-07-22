var ryu1 = "images/haduken01.gif";
var ryu2 = "images/haduken02.gif";


function swap() {
    var img = document.getElementById("image");
    img.src = ryu2;

    setTimeout(() => {
        img.src = ryu1;
    }, 1000);
}
