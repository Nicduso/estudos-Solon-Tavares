function sum() {
    var w = parseFloat(document.getElementById("weight").value);
    var h = parseFloat(document.getElementById("height").value);

    var imc = w / (h * h);

    var tit = document.getElementById("IMCtitle");
    var res = document.getElementById("result");

    res.innerHTML = imc.toFixed(2);

    var gen = document.getElementById("opt").value;

    if (gen == 0) {
        if (imc <= 21.9) {
            tit.innerHTML = "Cuidado! Você está abaixo do peso.";
        } else if (imc >= 22.0 && imc <= 27.0) {
            tit.innerHTML = "Parabéns, seu peso é o ideal.";
        } else if (imc >= 27.1 && imc <= 30.0) {
            tit.innerHTML = "Você está um pouco acima do peso.";
        } else if (imc >= 30.1 && imc <= 35.0) {
            tit.innerHTML = "Cuidado! Você está obeso.";
        } else if (imc >= 35.1 && imc <= 39.9) {
            tit.innerHTML = "Cuidado! Você está obeso.";
        } else if (imc >= 40.0) {
            tit.innerHTML = "Urgente! Você está obeso mórbido.";
        }
    } else if (gen == 1) {
        if (imc <= 21.9) {
            tit.innerHTML = "Cuidado! Você está abaixo do peso.";
        } else if (imc >= 22.0 && imc <= 27.0) {
            tit.innerHTML = "Parabéns, seu peso é o ideal.";
        } else if (imc >= 27.1 && imc <= 32.0) {
            tit.innerHTML = "Você está um pouco acima do peso.";
        } else if (imc >= 32.1 && imc <= 37.0) {
            tit.innerHTML = "Cuidado! Você está obeso.";
        } else if (imc >= 37.1 && imc <= 41.9) {
            tit.innerHTML = "Cuidado! Você está obeso.";
        } else if (imc >= 42.0) {
            tit.innerHTML = "Urgente! Você está obeso mórbido.";
        }
    }

}