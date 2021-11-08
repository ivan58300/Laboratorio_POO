import java.util.ArrayList;
import java.util.Date;

public class Vehiculo {

    public enum MarcaDeVehiculo { FORD,TOYOTA, SUZUKI, RENAULT, SEAT}

    private String matricula;
    MarcaDeVehiculo marca;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public MarcaDeVehiculo getMarca() {
        return marca;
    }

    public void setMarca(MarcaDeVehiculo marca) {
        this.marca = marca;
    }

    public Vehiculo(String matricula, MarcaDeVehiculo marca) {
        this.matricula = matricula;
        this.marca = marca;
    }


}
