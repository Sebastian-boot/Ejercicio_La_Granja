
package Zoologico;


public class Jirafa extends AnimalHerbivoro{
    
    
    private String color;

    public Jirafa(int codigo, String nombre, float peso, float altura, String color) {
        super(codigo, nombre, peso, altura);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String mostrarDatos() {
        return "Jirafa{" + "codigo=" + getCodigo() + ", nombre=" + getNombre() + 
                ", peso=" + getPeso() + ", altura=" + getAltura()+ ", color=" + color+'}';
    }
    
  
    

    
        
    
}
