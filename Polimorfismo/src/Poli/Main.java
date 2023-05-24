
package Poli;

public class Main {

    
    public static void main(String[] args) {
        Computador computador[] = new Computador[3];
        
        computador[0]= new Computador("Apple","M1");
        computador[1]= new RaspberryPi(499,"iPad","Air");
        computador[2]= new Laptop("Gama Media","LG","gram 15Z990-V");
    
        for(Computador Dexcomputador: computador){
            System.out.println(Dexcomputador.mostrarDatos());
            System.out.println("");
        }
    }
    
}
