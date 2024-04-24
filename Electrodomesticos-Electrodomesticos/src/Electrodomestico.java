//Encima primero/padre en jerarquia porque generico conjunto que engloba



public class Electrodomestico {

    private boolean encendido; // Indica si la lámpara está encendida o apagada

    // Método para encender la electrodomestico

    public void encender() {

        encendido = true;

        System.out.println("Electrodomestico encendida.");

    }

    // Método para apagar electrodomestico

    public void apagar() {

        encendido = false;

        System.out.println("Electrodomestico apagada.");


    }
//constructor
    public Electrodomestico(boolean encendido) {
        this.encendido = encendido;

    }
//
    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
}
