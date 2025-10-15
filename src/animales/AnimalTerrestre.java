package animales;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author poo02alu09
 */
public class AnimalTerrestre extends Animal {
    private int numPatas;

    AnimalTerrestre(){
    }
    public AnimalTerrestre(String nombre, String lugarOrigen, String color, int numPatas) {
        super(nombre, lugarOrigen, color);
        this.numPatas = numPatas;
    }

    public int getNumPatas() {
        return numPatas;
    }
    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }


    public void correr(){
        System.out.println("'Corriendo por la pradera'");
    }
    public void comer(){
        System.out.println("'Comiendo'");
    }


}
