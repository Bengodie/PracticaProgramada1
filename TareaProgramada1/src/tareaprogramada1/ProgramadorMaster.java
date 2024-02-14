package tareaprogramada1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author indir
 */
public class ProgramadorMaster extends Programador{
    
   private int experiencia ;

    public ProgramadorMaster(int experiencia, int lineasDeCodigoPorHora, String lenguajeDominante, String nombre, int edad, String cedula, boolean casado, double salario) {
        super(lineasDeCodigoPorHora, lenguajeDominante, nombre, edad, cedula, casado, salario);
        this.experiencia = experiencia;
    }

    public ProgramadorMaster() {
        this.experiencia = 0;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

   @Override
     public String toString (){
        return super.toString()
                +"\nAnnios de experiencia "+ this.getExperiencia()  ;
    }
    

   
           
           
    
}
