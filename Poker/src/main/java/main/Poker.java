package main;

public class Poker {

    public static void main(String[] args) {
        
        PaqueteDeCartas paqueteUno = new PaqueteDeCartas();
        
        for (int i = 0; i < 13; i++) {
            
            System.out.printf("%-20s%-20s%-20s%-20s\n",
                    paqueteUno.repartirCarta(),paqueteUno.repartirCarta(),
                    paqueteUno.repartirCarta(),paqueteUno.repartirCarta());
        }
        
        System.out.println("-----------------------------------------------------------");
        
        paqueteUno.barajar();
        
        for (int i = 0; i < 13; i++) {
            
            System.out.printf("%-20s%-20s%-20s%-20s\n",
                    paqueteUno.repartirCarta(),paqueteUno.repartirCarta(),
                    paqueteUno.repartirCarta(),paqueteUno.repartirCarta());
        }
    }
}
