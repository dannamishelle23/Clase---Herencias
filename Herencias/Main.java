package Herencias;

//Crear una clase principal llamada Main
public class Main {
    public static void main(String [] args) {
        //Crear las instancias de cada tipo de jugador
        Portero portero1 = new Portero("Hernan", "Tri Ecuador", 25, 1, 5);
        Defensa defensa1 = new Defensa("Jeremy", "Tri Ecuador", 27, 3);
        Delantero delantero1 = new Delantero("Kevin", "Tri Ecuador", 29);

        //Mostrar la informacion correspondiente
        System.out.println("Informacion del Portero: ");
        portero1.MostrarInfo();
        System.out.println();         //Salto de linea

        System.out.println("Informacion del Defensa: ");
        defensa1.MostrarInfo();
        System.out.println();

        System.out.println("Informacion del Delantero: ");
        delantero1.MostrarInfo();
    }
}
