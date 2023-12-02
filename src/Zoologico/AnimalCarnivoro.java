
package Zoologico;

public abstract class AnimalCarnivoro extends Animal{
    
    private int edad;

    public AnimalCarnivoro(int codigo, String nombre, float peso, int edad) {
        super(codigo, nombre, peso);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public abstract String mostrarDatos();
    
}
