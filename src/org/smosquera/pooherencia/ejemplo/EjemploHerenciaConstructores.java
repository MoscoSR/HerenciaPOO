package org.smosquera.pooherencia.ejemplo;

import org.smosquera.pooherencia.Alumno;
import org.smosquera.pooherencia.AlumnoInternacional;
import org.smosquera.pooherencia.Persona;
import org.smosquera.pooherencia.Profesor;

public class EjemploHerenciaConstructores {
    public static void main(String[] args) {
         Alumno alumno = new Alumno("Santiago", "Guzman", 21, "Instituto Nacional");
         alumno.setNotaSpanish(5.5);
         alumno.setNotaHistory(6.3);
         alumno.setNotaMath(4.9);

        AlumnoInternacional alumnoInternacional = new AlumnoInternacional("Peter", "Gosling", "Australia");
        alumnoInternacional.setNotaIdiomas(6.8);
        alumnoInternacional.setNotaSpanish(4.8);
        alumnoInternacional.setNotaSpanish(5.0);
        alumnoInternacional.setEmail("correo@correo.com");


        Profesor profesor = new Profesor("Luci", "Perez", "Matematicas");
        profesor.setEdad(37);

        printObject(alumno);
        printObject(alumnoInternacional);
        printObject(profesor);

    }

    public  static void  printObject(Persona persona) {
        System.out.println("Imprimeindo datos en comun del tipo persona");
        System.out.println( persona.getNombre()
                + ", apellido:  " + persona.getApellido()
                + ", edad: " + persona.getEdad()
                + ", email: " + persona.getEmail());



        if(persona instanceof Alumno) {
            System.out.println("Imprimeindo los datos del tipo alumno");
            System.out.println("Institucion: " + ((Alumno) persona).getInstitution());
            System.out.println("Nota Matematicas: " + ((Alumno) persona).getNotaMath());
            System.out.println("Nota historia: " + ((Alumno) persona).getNotaHistory());
            System.out.println("Nota castellano: " + ((Alumno) persona).getNotaSpanish());

            System.out.println("Imprimiendo los datos del tipo alumnoInternacional ");

            if (persona instanceof  AlumnoInternacional) {
                System.out.println("Impriemiendo datos del Alumno internacional ");
                System.out.println("Nota idioma: " + ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println(((AlumnoInternacional) persona).getPais());
            }
        }

        if (persona instanceof Profesor) {
            System.out.println("Imprimiendo datos del profesor: ");
            System.out.println("Asignatura: " + ((Profesor) persona).getAsignatrua());

        }

    }
}
