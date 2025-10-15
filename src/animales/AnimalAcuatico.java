/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author poo02alu09
 */
public class AnimalAcuatico extends Animal{
    private int numAletas;

    public AnimalAcuatico(){
    }
    public AnimalAcuatico(String nombre, String lugarOrigen, String color, int numAletas) {
        super(nombre, lugarOrigen, color);
        this.numAletas = numAletas;
    }

    public int getNumAletas() {
        return numAletas;
    }
    public void setNumAletas(int numAletas) {
        this.numAletas = numAletas;
    }


    public void nadar(){
        System.out.println("'Nadando'");
    }
    public void comer(){
        System.out.println("'Comiendo'");
    }
}
