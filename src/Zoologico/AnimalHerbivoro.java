
package Zoologico;


public abstract class AnimalHerbivoro extends Animal{
    
    private float altura;

    public AnimalHerbivoro(int codigo, String nombre, float peso, float altura) {
        super(codigo, nombre, peso);
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public abstract String mostrarDatos();
    

    
}
