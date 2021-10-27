public class Main {
    public static void main(String[] args) {

        Vehiculo vehiculo = new Vehiculo("ASD1323", Vehiculo.MarcaDeVehiculo.FORD);
        Vehiculo vehiculo2 = new Vehiculo("QWE123", Vehiculo.MarcaDeVehiculo.RENAULT);
        Vehiculo vehiculo3 = new Vehiculo("RTY234", Vehiculo.MarcaDeVehiculo.TOYOTA);

        System.out.println("El Automóvil " + vehiculo.marca + " tiene " + vehiculo.getMatricula() + " Matricula.");
        System.out.println("El Automóvil " + vehiculo2.marca + " tiene " + vehiculo2.getMatricula() + " Matricula.");
        System.out.println("El Automóvil " + vehiculo3.marca + " tiene " + vehiculo3.getMatricula() + " Matricula.");

        //ejemplo_enum
        System.out.println("\t- En este programa de ejemplo vamos a traducir la constante:");
        System.out.println(Ejemplo_enum.Day.MONDAY);
        System.out.println(Ejemplo_enum.Day.MONDAY.getSpanish());
    }
}
