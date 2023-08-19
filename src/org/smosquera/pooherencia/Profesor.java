package org.smosquera.pooherencia;

public class Profesor extends Persona {

    public Profesor () {
        System.out.println("Profesor: Inicializando cosntructor");
    }

    public  Profesor (String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Profesor(String nombre, String apellido, String asignatrua) {
        super(nombre, apellido);
        this.asignatrua=asignatrua;
    }



    public String getAsignatrua() {
        return asignatrua;
    }

    public void setAsignatrua(String asignatrua) {
        this.asignatrua = asignatrua;
    }

    private String asignatrua;

}
