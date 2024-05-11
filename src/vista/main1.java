package vista;

import modelo.Persona;

/**
 *
 * @author 59397
 */
//1.-consumiendo objetos
public class main1 {
    //2.- llamado a metodo main traductor
    //o interpretacion del codigo
    //psvm
    public static void main(String[] args) {
        //1.-crear/intaciar/declarar objeto
        //nobre Clase nobreObjeto=new nombreClase();
        Persona richard=new Persona();
        //2.-darle/inicalizar datos
        //nombreObletos.atributo/variablre="datos"
        //acceder alos atributos
        richard.idPersona=001;
        richard.nombre="Richar";
        richard.apellido="Ortega";
        richard.etnia="Mestizo";
        richard.cedula=1003088778;
        richard.numeroTelefono=9992346;
        //acceder a los metodos
        richard.saludar();
        richard.saludarEdad(30);
        richard.horoscopo("Aries");
        
                
    }
    
}
