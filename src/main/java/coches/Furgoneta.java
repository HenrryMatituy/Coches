package coches;

public class Furgoneta extends Vehiculo {//Herencia
    private int capacidad_carga;
    private int plazas_extra;

    public  Furgoneta(int plazas_extra,int capacitdad_carga){
        super(); //Llamar al constructor de la clase padre
        this.capacidad_carga=capacitdad_carga;
        this.plazas_extra=plazas_extra;
    }

    public String dimeDatosFurgoneta(){
        return "La capacidad de carga de la furgoneta es: " + capacidad_carga + " Y las plazas son " + plazas_extra;
    }


}
