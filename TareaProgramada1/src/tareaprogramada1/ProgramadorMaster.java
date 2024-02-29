package tareaprogramada1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author indir
 */
public class ProgramadorMaster extends Empleado {

    private int lineasDeCodigoPorHora;
    private String lenguajeDominante;
    private double bono;
    private int experiencia;

    public ProgramadorMaster( String nombre, String cedula, int edad, boolean casado,double salario, int lineasDeCodigoPorHora, String lenguajeDominante, double bono, int experiencia){
           
        super( nombre, cedula, edad, casado,salario);
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
        this.bono = bono;
        this.experiencia = experiencia;
    }

//    public ProgramadorMaster(int lineasDeCodigoPorHora, String lenguajeDominante, double bono, int experiencia) {
//        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
//        this.lenguajeDominante = lenguajeDominante;
//        this.bono = bono;
//        this.experiencia = experiencia;
//    }

   
    
    

    public ProgramadorMaster() {
        this.lineasDeCodigoPorHora = 0;
        this.lenguajeDominante = "";
        this.bono = 0;
        this.experiencia = 0;
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

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    @Override
    public double Bono() {
        return this.lineasDeCodigoPorHora * (super.getSalario() * 0.007);
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nLineas de Codigo por Hora: " + this.getLineasDeCodigoPorHora()
                + "\n Lenguaje Dominante:" + this.getLenguajeDominante()
                + "\nAnnios de experiencia " + this.getExperiencia()
                + "\n Bono " + Bono() + "colones";

    }
}
