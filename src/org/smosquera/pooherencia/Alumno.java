package org.smosquera.pooherencia;


/*Alumno es una subclase de persona, persona seria la clase padre*/
public class Alumno extends Persona{


    public Alumno () {
        super();
        System.out.println("Alumno: Inicilizando constructor");
    }

    public Alumno(String nombre, String apellido) {
        super(nombre, apellido);

    }

    public  Alumno (String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public  Alumno (String nombre, String apellido, int edad, String institution) {
        this(nombre, apellido, edad);
        this.institution = institution;
    }

    public  Alumno (String nombre, String apellido, int edad, String institution, double notaMath, double notaHistory, double notaSpanish) {
       this(nombre, apellido, edad, institution);
       this.notaMath = notaMath;
       this.notaHistory = notaHistory;
       this.notaSpanish = notaSpanish;
    }


    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public double getNotaMath() {
        return notaMath;
    }

    public void setNotaMath(double notaMath) {
        this.notaMath = notaMath;
    }

    public double getNotaSpanish() {
        return notaSpanish;
    }

    public void setNotaSpanish(double notaSpanish) {
        this.notaSpanish = notaSpanish;
    }

    public double getNotaHistory() {
        return notaHistory;
    }

    public void setNotaHistory(double notaHistory) {
        this.notaHistory = notaHistory;
    }

    private String institution;
    private double notaMath;
    private double notaSpanish;
    private double notaHistory;

}
