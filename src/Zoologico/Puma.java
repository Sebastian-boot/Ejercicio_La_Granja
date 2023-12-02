
package Zoologico;


public class Puma extends AnimalCarnivoro{
    
    private float velocidad;

    public Puma(int codigo, String nombre, float peso, int edad, float velocidad) {
        super(codigo, nombre, peso, edad);
        this.velocidad = velocidad;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }
    
    @Override
    public String mostrarDatos() {
        return "Puma{" + "codigo=" + getCodigo() + ", nombre=" + getNombre() + 
                ", peso=" + getPeso() + ", edad=" + getEdad()+ ", velocidad=" + velocidad+'}';
    }
    
}
