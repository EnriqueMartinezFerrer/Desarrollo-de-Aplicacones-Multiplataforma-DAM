package modelo;

public class Coche {
    private String marca, modelo, bastidor;
    private int cv;
    private double cc;
    private int velocidad, km;



    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCv() {
        return cv;
    }

    public double getCc() {
        return cc;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getKm() {
        return km;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public void setCc(double cc) {
        this.cc = cc;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setKm(int km) {
        this.km = km;
    }

    //Constructores
        // marca modelo
        // marca modelo cv cc
        // marca modelo cv cc bastidor

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Coche(String marca, String modelo, int cv, double cc) {
        this.marca = marca;
        this.modelo = modelo;
        this.cv = cv;
        this.cc = cc;
    }

    public Coche(String marca, String modelo, String bastidor, int cv, double cc) {
        this.marca = marca;
        this.modelo = modelo;
        this.bastidor = bastidor;
        this.cv = cv;
        this.cc = cc;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", bastidor='" + bastidor + '\'' +
                ", cv=" + cv +
                ", cc=" + cc +
                ", velocidad=" + velocidad +
                ", km=" + km +
                '}';
    }
}
