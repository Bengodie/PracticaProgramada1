/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaprogramada1;

/**
 *
 * @author indir
 */
public class Programador extends Empleado{
    
   private int lineasDeCodigoPorHora ; 
   
    private String lenguajeDominante;

    public Programador(int lineasDeCodigoPorHora, String lenguajeDominante, String nombre, int edad, String cedula, boolean casado, double salario) {
        super(nombre, edad, cedula, casado, salario);
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }

    public Programador() {
        this.lineasDeCodigoPorHora = 0;
        this.lenguajeDominante = "";
    }

    public int getLineasDeCodigoPorHora() {
        return lineasDeCodigoPorHora;
    }

    public void setLineasDeCodigoPorHora(int lineasDeCodigoPorHora) {
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
    }

    public String getLenguajeDominante() {
        return lenguajeDominante;
    }

    public void setLenguajeDominante(String lenguajeDominante) {
        this.lenguajeDominante = lenguajeDominante;
    }
    
   @Override
     public String toString (){
        return super.toString()
                +"\nLineas de Codigo por Hora: "+ this.lineasDeCodigoPorHora
                +"\n Lenguaje Dominante:"+this.lenguajeDominante    ;
    }
    
    
    
    
    
}
