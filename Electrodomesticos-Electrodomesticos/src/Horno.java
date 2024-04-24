
public class Horno extends Electrodomestico {

    private int intensidad;

    private String modo;

    // Constructor de la clase Lampara

    public Horno() {

        super(true);

        this.intensidad = 50;

        this.modo = "pizza";

    }

    // Método para cambiar la intensidad del horno

    public void cambiarIntensidad(int nuevaIntensidad) {

        if (nuevaIntensidad >= 0 && nuevaIntensidad <= 100) {

            intensidad = nuevaIntensidad;

            System.out.println("Nueva intensidad ajustada a " + intensidad + ".");

        } else {

            System.out.println("Intensidad inválida. Debe estar entre 0 y 100.");

        }

    }

    // Método para cambiar el canal de la luz

    public void cambiarModo(String nuevoModo) {

        modo = nuevoModo;

        System.out.println("Modo del horno cambiado a " + modo + ".");

    }

    // Método para obtener el estado actual de la lámpara

    public String obtenerEstado() {

        return "Horno " + (this.isEncendido() ? "encendida" : "apagada") +

                ", Intensidad: " + intensidad + ", modo: " + modo;
    }
}
