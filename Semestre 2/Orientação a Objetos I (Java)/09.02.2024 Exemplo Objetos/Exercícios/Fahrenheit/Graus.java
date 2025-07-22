package fahrenheit;

class Graus {
    Double f, c;

    public void calculo() {
        c = (f - 32) * 5 / 9;
    }

    public void imprimir() {
        calculo();
        System.out.println(f + "ºF são " + c + "ºC.");
    }

}