/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaprogramada1;

/**
 *
 * @author indir
 */
public class Programador extends Empleado {

    private int lineasDeCodigoPorHora;
    private String lenguajeDominante;
    private  double bono;

    public Programador(String nombre, String cedula, int edad, boolean casado, double salario, String clasificar, int lineasDeCodigoPorHora, String lenguajeDominante, double bono) {
        super(nombre, cedula, edad, casado, salario, clasificar);
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
        this.bono = bono;
    }

//    public Programador(int lineasDeCodigoPorHora, String lenguajeDominante, double bono) {
//        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
//        this.lenguajeDominante = lenguajeDominante;
//        this.bono = bono;
//    }

   

    public Programador() {
        this.lineasDeCodigoPorHora = 0;
        this.lenguajeDominante = "";
        this.bono=0.0;
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
    public double Bono() {
        return this.lineasDeCodigoPorHora * (super.getSalario() * 0.007);
    }
    
  
    public void setBono(double bono) {
        this.bono = bono;
    }
    
    
@Override
     public String toString() {
        return super.toString()
                +"\nLineas de Codigo por Hora: " + this.getLineasDeCodigoPorHora()
                +"\n Lenguaje Dominante:" + this.getLenguajeDominante()    
                +"\n Bono "+Bono()+" colones" ;
}

    public double getBono() {
        return bono;
    }
}
