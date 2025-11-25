package main;

import java.util.Random;

public class PaqueteDeCartas {
    
    private Carta paquete[];
    private int cartaActual;
    private final int numeroDeCartas = 52;
    private final Random numerosAleatorios;
    
    public PaqueteDeCartas(){
        
        String caras[] = {"As","2","3","4","5","6","7","8","9","10","J","Q","K",};
        String palos[] = {"Corazones","Diamantes","Tréboles","Espadas"};
        
        paquete = new Carta[numeroDeCartas];
        cartaActual = 0;
        numerosAleatorios = new Random();
        
        for (int cuenta = 0; cuenta < paquete.length; cuenta++) {
            
            paquete[cuenta] = new Carta(caras[cuenta % 13], palos[cuenta / 13]);
        }
    }
    
    public void barajar() {
        
        cartaActual = 0;
        for (int primera = 0; primera < paquete.length; primera++) {
            
            int segunda = numerosAleatorios.nextInt(numeroDeCartas);
            
            Carta temp = paquete[primera];
            paquete[primera] = paquete[segunda];
            paquete[segunda] = temp;
        }
    }
    
    public Carta repartirCarta() {
        
        if (cartaActual < paquete.length) {
            
            return paquete[cartaActual++];
        } else {
            
            return null;
        }
    }
}
