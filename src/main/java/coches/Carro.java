package coches;

public class Carro {
    public static void main(String[] args) {
        Vehiculo miAuto=new Vehiculo();
        miAuto.establece_color("Rojo");
      //  miAuto.color="Verde";


    // System.out.println("Este Auto tiene " + miAuto.asientos_cuero + " ruedas.");
     // System.out.println("Este Auto tiene un motor " + miAuto.aire_acondicionado);
//        System.out.println("Este Auto tiene un largo de: "+ miAuto.dime_largo());
//        System.out.println("Este Auto tiene un largo de: "+ miAuto.dime_color());
//
//        System.out.println("Este Auto tiene un largo de: "+ miAuto.dime_datos_gnerales());
//        miAuto.configure_asientos("no");
//        System.out.println(miAuto.dime_asientos());
        Vehiculo micoche1=new Vehiculo();
        micoche1.establece_color("Rojo");
        Furgoneta miFurgoneta1=new Furgoneta(7,580);
        miFurgoneta1.establece_color("Azul");
        miFurgoneta1.configure_asientos("si");
        miFurgoneta1.configure_aire("si");
        System.out.println(micoche1.dime_datos_gnerales()+" "+ micoche1.dime_color());
        System.out.println(miFurgoneta1.dime_datos_gnerales()+miFurgoneta1.dimeDatosFurgoneta());

    }
}
