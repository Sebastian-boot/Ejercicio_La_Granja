package Zoologico;

public class Serpiente extends AnimalCarnivoro{

    private float longitud;

    public Serpiente(int codigo, String nombre, float peso, int edad, float longitud) {
        super(codigo, nombre, peso, edad);
        this.longitud = longitud;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    @Override
    public String mostrarDatos() {
        return "Serpiente{" + "codigo=" + getCodigo() + ", nombre=" + getNombre() +
                ", peso=" + getPeso() + ", edad=" + getEdad()+ ", longitud=" + longitud+'}';
    }

}
