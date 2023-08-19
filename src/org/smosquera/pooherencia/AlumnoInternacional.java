package org.smosquera.pooherencia;

public class AlumnoInternacional  extends Alumno{
    public  AlumnoInternacional () {
        System.out.println("AlumnoI: inicializando constructor ");
    }

    public AlumnoInternacional (String nombre, String apellido) {
        super(nombre, apellido);
    }

    public AlumnoInternacional(String nombre, String apellido, String pais){
        super(nombre, apellido);
        this.pais=pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }

    private String pais;
    private double notaIdiomas;

}
