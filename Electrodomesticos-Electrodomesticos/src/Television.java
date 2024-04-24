//public class Television extends Electrodomestico
//1.public class Television
//Jerarquia -> Electrodomestico a Lampara - Horno - Television

public class Television extends Electrodomestico {

    private int intensidad;

    private String canal;

    // Constructor de la clase Television

    public Television() {


        super(true);

        this.intensidad = 50;

        this.canal = "telecinco";

    }

    // Método para cambiar la intensidad de la luz de la pantalla

    public void cambiarIntensidad(int nuevaIntensidad) {

        if (nuevaIntensidad >= 0 && nuevaIntensidad <= 100) {

            intensidad = nuevaIntensidad;

            System.out.println("Nueva intensidad ajustada a " + intensidad + ".");

        } else {

            System.out.println("Intensidad inválida. Debe estar entre 0 y 100.");

        }

    }

    // Método para cambiar el canal

    public void cambiarCanal(String nuevoCanal) {

        canal = nuevoCanal;

        System.out.println("Canal de la television cambiado a " + canal + ".");

    }

    // Método para obtener el estado actual de la lámpara

    public String obtenerEstado() {

        return "Television " + (this.isEncendido() ? "encendida" : "apagada") +

                ", Intensidad: " + intensidad + ", canal: " + canal;




    }
}