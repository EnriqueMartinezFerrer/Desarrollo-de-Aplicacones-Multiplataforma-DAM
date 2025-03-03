package clases;

public class Surtidor {
    //ATRIBUTOS
    private int capacidadTotal, capacidadActual;
    private String tipoGasolina;
    private boolean funcionar;

    //MÉTODOS GET
    public int getCapacidadTotal() {
        return capacidadTotal;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public String getTipoGasolina() {
        return tipoGasolina;
    }

    public boolean isFuncionar() {
        return funcionar;
    }

    //MÉTODOS SET
    public void setCapacidadTotal(int capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public void setTipoGasolina(String tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
    }

    public void setFuncionar(boolean funcionar) {
        this.funcionar = funcionar;
    }

    //CONSTRUCTOR
    public Surtidor(int capacidadTotal, String tipoGasolina){
        this.capacidadTotal = capacidadTotal;
        this.capacidadActual = capacidadTotal;
        this.tipoGasolina = tipoGasolina;
        this.funcionar = true;
    }

    public Surtidor(String tipoGasolina){
        this.tipoGasolina = tipoGasolina;
        this.capacidadTotal = 0;
        this.capacidadActual = 0;
        this.funcionar = false;
    }

    //MÉTODOS
    public void arreglar(){
        this.funcionar = true;
    }

    public void rellenar(int litros){
        this.capacidadActual += litros;
    }

    public void quitarGasolina(int litros){
        this.capacidadActual -= litros;
    }
}