package coches;

public class Vehiculo {
    private Integer ruedas;
    private Integer motor;
    private Integer largo;
    private Integer ancho;
    private Integer peso;

    private String color;
    int peso_total;

    private boolean asientos_cuero, aire_acondicionado;

    public Vehiculo() {
        ruedas = 4;
        motor = 1600;
        largo = 500;
        ancho = 180;
        peso = 500;
    }

    public String dime_largo() {//Este es un método getter
        return "El largo del auto es: " + largo;
    }

    public void establece_color(String xcolor) { //Este es un método setter
        color = xcolor;
    }

    public String dime_color() {//Este es un método getter
        return "El color del auto es: " + color;
    }

      public String dime_datos_gnerales() {//Este es un método getter
        return "La plataforma del vehículo tiene: " + ruedas + " llantas. " + largo + " centímetros de largo y " + ancho + " de ancho";
    }

    public void configure_asientos(String asientos_cuero) {//SETTER
        if (asientos_cuero == "si") {
            this.asientos_cuero = true;
        } else {
            this.asientos_cuero = false;
        }
    }

    public String dime_asientos() { //GETTER
        if (asientos_cuero == true) {
            return "El vehículo tiene asientos de cuero";
        }else{
            return "El vehículo tiene asientos de serie";
        }

    }
    public void configure_aire(String aire_acondicionado) {//SETTER
        if (aire_acondicionado == "si") {//Argumento
            this.aire_acondicionado = true;//atributo de la clase
        } else {
            this.aire_acondicionado = false;
        }
    }
    public String dime_aire() { //GETTER
        if (aire_acondicionado == true) {
            return "El vehículo tiene aire acondicionado";
        }else{
            return "El vehículo no tiene aire acondicionado";
        }

    }
}