package fabril;

class Fabrica {
    int tempo, horas, min, seg;

    public void converterTempo() {
        horas = tempo / 3600;
        tempo = tempo % 3600;
        min = tempo / 60;
        seg = tempo % 60;
    }

    public void imprimir() {
        converterTempo();
        System.out.println("O tempo em horas, minutos e segundos é: " + horas + ":" + min + ":" + seg);
    }
}