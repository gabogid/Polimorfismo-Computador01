
package Poli;


public class Laptop extends Computador{
    private String gama;

    public Laptop(String gama, String marca, String modelo) {
        super(marca, modelo);
        this.gama = gama;
    }

    public String getGama() {
        return gama;
    }
    
    @Override
    public String mostrarDatos(){
        return "Marca: "+marca+"\nModelo: "+modelo+"\nGama: "+gama;

    }
}
