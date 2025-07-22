package locadora;

public class Veiculo {
    private String placa, modelo;

    public String getPlaca() {
        return this.placa;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void buzina() {
        System.out.println("Buzina: Fom! Fom!");
    }
    public void motor() {
        System.out.println("Vrrrruuuuummmm...");
    }



}