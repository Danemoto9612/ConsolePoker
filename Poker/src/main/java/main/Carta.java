package main;

public class Carta {
    
    String cara;
    String palo;
    
    public Carta(String caraCarta, String paloCarta) {
        
        this.cara = caraCarta;
        this.palo = paloCarta;
    }
    
    @Override
    public String toString() {
        
        return cara + " de " + palo;
    }
}
