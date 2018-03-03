/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author Kevin Ortiz
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona apGente[] = new Persona[5];
        apGente[0] = new Persona(); //CONSTRUCTOR DEFAULT
        apGente[1] = new Persona("Juan", "Perez", 5); //CONSTRUCTOR CON PARÁMETROS
        apGente[2] = new Persona("Emilio", "Dominguez", 6); //CONSTRUCTOR CON PARÁMETROS
        apGente[3] = new Persona("Hernesto", "Sanchez", 7); //CONSTRUCTOR CON PARÁMETROS
        apGente[4] = new Persona("Saul", "Aguilar", 8); //CONSTRUCTOR CON PARÁMETROS
        System.out.println("Original");
        for (int i = 0; i < apGente.length; i++) {
            System.out.println("Nombre: " + apGente[i].getsNombre());
            System.out.println("Apellido: " + apGente[i].getsApellido());
            System.out.println("Edad: " + apGente[i].getiEdad());
        }

        //CREO LA COPIA
        Persona apCopiaGen[] = new Persona[5];
        for (int i = 0; i < apCopiaGen.length; i++) {
            //apCopiaGen[i] = apGente[i];//NO ES UN A COPIA DE DATOS
            //ESTO SI FUNCIONA
            apCopiaGen[i] = new Persona();//CREAR EL OBJETO
            apCopiaGen[i].setsNombre(apGente[i].getsNombre());// COPIAR LOS DATOS
            apCopiaGen[i].setsApellido(apGente[i].getsApellido());
            apCopiaGen[i].setiEdad(apGente[i].getiEdad());
        }
          //IMPRIMIR LA COPIA

        System.out.println("IMPRESIÓN DE LA COPIA");
        for (int i = 0; i < apCopiaGen.length; i++) {
            System.out.println("Nombre: " + apCopiaGen[i].getsNombre());
            System.out.println("Apellido: " + apCopiaGen[i].getsApellido());
            System.out.println("Edad: " + apCopiaGen[i].getiEdad());
        }

    }

}

class Persona {

    private String sNombre;
    private String sApellido;
    private int iEdad;

    public Persona() {
        sNombre = "Kevin";
        sApellido = "Ortiz";
        iEdad = 15;
    }

    public Persona(String sNombre, String sApellido, int iEdad) {
        this.sNombre = sNombre;
        this.sApellido = sApellido;
        this.iEdad = iEdad;
    }

    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public String getsApellido() {
        return sApellido;
    }

    public void setsApellido(String sApellido) {
        this.sApellido = sApellido;
    }

    public int getiEdad() {
        return iEdad;
    }

    public void setiEdad(int iEdad) {
        this.iEdad = iEdad;
    }

}
