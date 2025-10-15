package poop7;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author poo02alu09
 */
public class Gerente extends Empleado{
    private double presupuesto;

    public Gerente() {
    }
    public Gerente(double presupuesto, String nombre, int numEmpleado, double sueldo) {
        super(nombre, numEmpleado, sueldo);
        this.presupuesto = presupuesto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }
    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public void asignarPresupuesto(double presupuesto){
        setPresupuesto(presupuesto);
    }
    
    @Override
    public String toString(){
       return super.toString()+"Empleado {" + "nombre="+ getNombre() +", numEmpleado: "+getNumEmpleado()+", Presupuesto:"+presupuesto+'}';
    }
}
