package org.smosquera.pooherencia.ejemplo;

import org.smosquera.pooherencia.Alumno;
import org.smosquera.pooherencia.AlumnoInternacional;
import org.smosquera.pooherencia.Profesor;

public class EjemploHerencia {
    public static void main(String[] args) {
         Alumno alumno = new Alumno();
         alumno.setNombre("Santiago");
         alumno.setApellido("Mosquera");
         alumno.setInstitution("Institucion educativa San Rafael"); // Asi se castea un objeto.
         alumno.setNotaSpanish(5.5);
         alumno.setNotaHistory(6.3);
         alumno.setNotaMath(4.9);

        AlumnoInternacional alumnoInternacional = new AlumnoInternacional();

        alumnoInternacional.setNombre("Peter");
        alumnoInternacional.setApellido("Gosling");
        alumnoInternacional.setPais("Australia");
        alumnoInternacional.setInstitution("Educativa de EE.UU");
        alumnoInternacional.setNotaIdiomas(6.8);
        alumnoInternacional.setNotaSpanish(4.8);
        alumnoInternacional.setNotaSpanish(5.0);


        Profesor profesor = new Profesor();
        profesor.setNombre("Luci");
        profesor.setApellido("Perez");
        profesor.setAsignatrua("Matematicas");

        System.out.println(alumno.getNombre() + " " + alumno.getApellido());
        System.out.println("Profesor: " + profesor.getAsignatrua() + ": " +
                profesor.getNombre() + "  " +
                alumno.getApellido());


       Class claseAlumnoInternacional = alumnoInternacional.getClass();
        while (claseAlumnoInternacional.getSuperclass() != null) {
            String hija = claseAlumnoInternacional.getName();
            String padre = claseAlumnoInternacional.getSuperclass().getName();
            System.out.println(hija + "Es una clase hija de la clase padre: " +  padre);
            claseAlumnoInternacional  = claseAlumnoInternacional.getSuperclass(); 
        }


    }
}
