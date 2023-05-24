
package Poli;


public class RaspberryPi extends Computador {
    private int price;

    public RaspberryPi(int price, String marca, String modelo) {
        super(marca, modelo);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
    
    @Override
    public String mostrarDatos(){
        return "Marca: "+marca+"\nModelo: "+modelo+"\nPrecio: "+price;

    }
    
}
