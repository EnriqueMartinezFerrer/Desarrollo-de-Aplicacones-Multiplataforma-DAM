package clases;

public class Coche {
    //ATRIBUTOS
    private String tipoGasolina;
    private int litrosDeposito;

    //MÉTODOS GET
    public String getTipoGasolina() {
        return tipoGasolina;
    }

    public int getLitrosDeposito() {
        return litrosDeposito;
    }

    //MÉTODOS SET
    public void setTipoGasolina(String tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
    }

    public void setLitrosDeposito(int litrosDeposito) {
        this.litrosDeposito = litrosDeposito;
    }

    //CONSTRUCTOR
    public Coche(String tipoGasolina){
        this.tipoGasolina = tipoGasolina;
        this.litrosDeposito = 0;
    }

    //MÉTODOS
    public void ponerGasolina(Surtidor surtidor, int litrosRepostar){

        if(surtidor.getCapacidadActual() == 0 || surtidor.getCapacidadActual() < litrosRepostar){
            System.out.println("El surtidor está vacío o la cantidad no es válida...");
            return;
        }

        if(!surtidor.isFuncionar()){
            System.out.println("El surtidor está averiado...");
            return;
        }

        if(!surtidor.getTipoGasolina().equals(this.tipoGasolina)){
            System.out.println("El tipo de gasolina no es válido...");
            return;
        }

        surtidor.quitarGasolina(litrosRepostar);
        this.litrosDeposito += litrosRepostar;
    }
}