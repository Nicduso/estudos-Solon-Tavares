function sum() {

    var name = document.getElementById("name").value;
    var i = parseFloat(document.getElementById("i").value);
    var t = parseFloat(document.getElementById("t").value);
    var c = parseFloat(document.getElementById("deposit").value);
    var j = c * (i/100) * (t/12);
    var total = c + j;

    var resultFees = document.getElementById("resultFees");
    var resultTotal = document.getElementById("resultTotal");
    var rFees = document.getElementById("rFees");
    var rTotal = document.getElementById("rTotal");

    resultFees.innerHTML = "O juros total é de: ";
    rFees.innerHTML = j.toFixed(2) + " %";
    resultTotal.innerHTML = "E o montante que terá no final do período é de: ";
    rTotal.innerHTML = "R$ " + total.toFixed(2);
    
}