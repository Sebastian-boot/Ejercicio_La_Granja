
package Zoologico;

public class Elefante extends AnimalHerbivoro{
    
    private float precio;

    public Elefante(int codigo, String nombre, float peso, float altura, float precio) {
        super(codigo, nombre, peso, altura);
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
     @Override
    public String mostrarDatos() {
        return "Elefante{" + "codigo=" + getCodigo() + ", nombre=" + getNombre() + 
                ", peso=" + getPeso() + ", altura=" + getAltura()+ ", precio=" + precio+'}';
    }
    
}
