function sum() {
    var f = document.form;
    var a = parseFloat(f.valueA.value);
    var b = parseFloat(f.valueB.value);

    var x1 = document.getElementById("value");
    var x2 = document.getElementById("text");

    x1.innerHTML = f.opt.text;
    x2.innerHTML = f.opt.value;

    if (f.opt.value == "1") {
        x1.innerHTML = "Você escolheu somar.";
        var s = a + b;
    } else if (f.opt.value == "2") {
        x1.innerHTML = "Você escolheu subtrair.";
        var s = a - b;
    } else if (f.opt.value == "3") {
        x1.innerHTML = "Você escolheu multiplicar.";
        var s = a * b;
    } else if (f.opt.value == "4") {
        x1.innerHTML = "Você escolheu dividir.";
        var s = a / b;
    } else {
        x1.innerHTML = "Escolha uma das operações.";
    }

    f.result.value = s;
}