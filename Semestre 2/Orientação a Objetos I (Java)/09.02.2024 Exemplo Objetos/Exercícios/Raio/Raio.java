package radious;

class Raio {
    Double raio, altura, volume;

    public void calculo() {
        this.volume = (Math.PI * this.raio * this.altura) / 3;
    }
        
    public void imprimir() {
        calculo();
        System.out.println("O volume do cone é: "+this.volume);
    }

        
}
