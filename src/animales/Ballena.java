package animales;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author poo02alu09
 */
public class Ballena extends AnimalAcuatico{
    private int largo;

    public Ballena() {
    }
    public Ballena(String nombre, String lugarOrigen, String color, int numAletas, int largo) {
        super(nombre, lugarOrigen, color, numAletas);
        this.largo = largo;
    }

    public int getLargo() {
        return largo;
    }
    public void setLargo(int largo) {
        this.largo = largo;
    }


    public void pelearconPinocho(){
        System.out.println("Pinocho termina dentro de la ballena");
    }

    @Override
    public String toString(){
        return super.toString()+", " + "largo en metros = " + largo + '}';
    }
}
