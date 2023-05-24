
package Poli;


public class Computador {
    protected String marca;  
    protected String modelo;  

    public Computador(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    
    public String mostrarDatos(){
        return "Marca: "+marca+"\nModelo: "+modelo;
    }
}
