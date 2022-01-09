package loboh67;

public class Montanha extends Destino {

    private int altitude;

    @Override
    public String tipoDestino() {
        return "Montanha";
    }

    public Montanha(String nome, String pais, int altitude) {
        super(nome, pais);
        this.altitude = altitude;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }
}
