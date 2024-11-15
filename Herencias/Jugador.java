package Herencias;

//Definir la superclase
public class Jugador {
    //Definir los atributos de la clase padre
    protected String nombre, equipo;
    protected int edad;

        //Metodo constructor de la clase
    public Jugador(String nombre, String equipo, int edad) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.edad = edad;
    }

        //Metodo personalizado de la clase para mostrar la informacion del jugador
    public void MostrarInfo() {
         System.out.println("Nombre del Jugador: " + nombre);
         System.out.println("Equipo al que pertenece: " + equipo);
         System.out.println("Edad del jugador: " + edad);
    }
}

//Definir la subclase llamada Portero
class Portero extends Jugador{

    //Añadir atributos especificos
    private int atajadas;
    private int GolesRecibidos;

    //Metodo constructor de la subclase
    public Portero(String nombre, String equipo, int edad, int atajadas, int GolesRecibidos) {
        //Tomar los atributos de la clase padre
        super(nombre, equipo, edad);
        //Asignar un parametro a la clase hijo
        this.atajadas = atajadas;
        this.GolesRecibidos = GolesRecibidos;
    }

    /*Metodo mostrarInfo() que sobrescribe el de la superclase
    para mostrar los atributos adicionales */
    @Override
    public void MostrarInfo() {
        super.MostrarInfo();    //Tomar el metodo de la clase padre
        System.out.println("Atajadas: " + atajadas);
        System.out.println("Numero de Goles: " + GolesRecibidos);
    }
}

//Definir la subclase llamada Defensa
class Defensa extends Jugador {
    //Añadir atributos especificos
    private int numBloqueos;

    //Metodo constructor
    public Defensa(String nombre, String equipo, int edad, int numBloqueos) {
        super(nombre, equipo, edad);
        this.numBloqueos = numBloqueos;
    }
    /*Metodo mostrarInfo() que sobrescribe el metodo de la superclase para mostrar los atributos adicionales.*/
    @Override     //Redefinir un metodo que ya existe en una superclase
    public void MostrarInfo() {
        super.MostrarInfo();
        System.out.println("Numero de bloqueos: " + numBloqueos);
    }
}

//Definir la subclase Delantero
class Delantero extends Jugador {
    //Se heredan los atributos de la clase padre y no se añaden nuevos

    //Metodo constructor
    public Delantero(String nombre, String equipo, int edad) {
        super(nombre, equipo, edad);
    }
    /*Metodo mostrarInfo() que utiliza el metodo de la superclase para mostrar la informacion.*/
    @Override
    public void MostrarInfo() {
        super.MostrarInfo();
    }
}
