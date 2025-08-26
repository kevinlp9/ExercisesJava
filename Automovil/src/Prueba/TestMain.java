package Prueba;

import Clases.Automovil;
import Clases.Persona;

public class TestMain {
    public static void main(String[] args) {
        Automovil automovil=new Automovil();
        Persona  persona=new Persona();
        automovil.Color="rojo";
        automovil.year=2015;
        System.out.println(automovil.Color);
        System.out.println(automovil.year);
        System.out.println(automovil.Marca);
        persona.crearAuto();
    }
}
