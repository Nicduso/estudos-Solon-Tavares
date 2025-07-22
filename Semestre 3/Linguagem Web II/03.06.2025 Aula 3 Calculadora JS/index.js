document.addEventListener("DOMContentLoaded", () => {
    const display = document.getElementById("data");
    const numberButtons = document.querySelectorAll(".button-number");
    const operatorButtons = document.querySelectorAll(".key-operator");
    const clearButton = document.getElementById("button-ac");
    const decimalButton = document.getElementById("button-point");
    const equalsButton = document.getElementById("result");

    let firstValue = "";
    let operator = "";
    let waitingForSecondValue = false;

    numberButtons.forEach(button => {
        button.addEventListener("click", () => {
            if (display.value === "0" || waitingForSecondValue) {
                display.value = button.innerText;
                waitingForSecondValue = false;
            } else {
                display.value += button.innerText;
            }
        });
    });

    operatorButtons.forEach(button => {
        button.addEventListener("click", () => {
            if (firstValue && operator && !waitingForSecondValue) {
                display.value = calculate(firstValue, display.value, operator);
            }
            firstValue = display.value;
            operator = button.dataset.action;
            waitingForSecondValue = true;
        });
    });

    decimalButton.addEventListener("click", () => {
        if (!display.value.includes(".")) {
            display.value += ".";
        }
    });

    clearButton.addEventListener("click", () => {
        display.value = "0";
        firstValue = "";
        operator = "";
        waitingForSecondValue = false;
    });

    equalsButton.addEventListener("click", () => {
        if (firstValue && operator) {
            display.value = calculate(firstValue, display.value, operator);
            firstValue = "";
            operator = "";
        }
    });
    
    function calculate(a, b, operator) {
        const numA = parseFloat(a);
        const numB = parseFloat(b);
        switch (operator) {
            case "add":
                return numA + numB;
            case "subtract":
                return numA - numB;
            case "multiply":
                return numA * numB;
            case "divide":
                return numB !== 0 ? numA / numB : "Erro";
            default:
                return numB;
        }
    }
});
