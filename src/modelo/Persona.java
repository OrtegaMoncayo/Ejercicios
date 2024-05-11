package modelo;

/**
 *
 * @author 59397
 */
//1.-estableciendo el nombre de la clase:
public class Persona {

    //2.-Atributos -> claracion global de variables 
    //public- private-protected
    public int idPersona;
    public String nombre;
    public String apellido;
    public String etnia;
    public int cedula;
    public int numeroTelefono;

    //3.-metodos /acciones /comportamiento
    //public- private
    //metodo no retorno
    //son secciones de codigo
    //variables locales
    public void saludar() {
        System.out.println("Hola:" + nombre);

    }

    public void saludarEdad(int edad) {
        if (edad > 18) {
            System.out.println("Hola mayor de edad");

        } else {
            System.out.println("Hola menor de edad");
        }
    }

    public void horoscopo(String signoZodiaco) {
        if (signoZodiaco == "Aries") {
            System.out.println("Hoy es un buendia para comer manzanas");
        } else if (signoZodiaco == "Tauro") {
            System.out.println("Hoy es un buendia para comer guatita");
        } else if (signoZodiaco == "Géminis") {
            System.out.println("Hoy es un dia malo para salir");
        } else if (signoZodiaco == "Cáncer") {
            System.out.println("Hoy es un buendia salir abailar");
        } else if (signoZodiaco == "Leo") {
            System.out.println("Hoy es un buendia para leer un libro");
        } else if (signoZodiaco == "Virgo") {
            System.out.println("Hoy es un dia malo para los examen");
        } else if (signoZodiaco == "Libra ") {
            System.out.println("Hoy es un buendia para salir a correr");
        } else if (signoZodiaco == "Escorpio ") {
            System.out.println("Hoy es un dia malo para programar");
        } else if (signoZodiaco == "Sagitario ") {
            System.out.println("Hoy es un buendia para comer manzanas");
        } else if (signoZodiaco == "Capricornio ") {
            System.out.println("Hoy es un buendia para comer manzanas");
        } else if (signoZodiaco == "Acuario ") {
            System.out.println("Hoy es un buendia para comer manzanas");
        } else if (signoZodiaco == "Piscis ") {
            System.out.println("Hoy es un buendia para comer manzanas");
        } else {
            System.out.println("No se reconoce el signo del zodíaco proporcionado");
        }

    }
}
