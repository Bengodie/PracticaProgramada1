/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaprogramada1;

import javax.swing.JOptionPane;

/**
 *
 * @author indir
 */
public class Empleado extends Persona {

    private double salario;
    private String clasificar;

    public Empleado(String nombre, String cedula, int edad, boolean casado, double salario, String clasificar) {
        super(nombre, cedula, edad, casado);
        this.salario = salario;
        this.clasificar=clasificar;
    }

    public Empleado() {
        this.salario = 0.0;
        this.clasificar="";
    }

    @Override
    public double Bono() {
        return 0;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
       public String getClasificar() {
        return clasificar;
    }

    public void setClasificar(String clasificar) {
        this.clasificar = clasificar;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nSalario = " + this.getSalario() 
                + "\nClasificar = " + this.getClasificar() ;
    }

    
       public String clasificarEdad() {
        if (super.getEdad() <= 21) {
            return "Principiante";
        } else if (super.getEdad() >= 22 && super.getEdad() <= 35) {
            return "Intermedio";
        } else {
            return "Senior";
        }
    }
       public double aumentarSalario( double porcentajeAumento) {
           
        double aumento = salario * (porcentajeAumento / 100);
        double total=salario +aumento;
        salario=total;
        return salario ;
    }
   
}
