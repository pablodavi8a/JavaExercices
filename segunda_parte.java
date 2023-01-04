public class Main {
    public static void main(String[] args) {

        coche myCoche = new coche();
        myCoche.inc_puertas();          // añado una puerta

        System.out.println(myCoche.n_puertas);

    }
}

class coche {
    public int n_puertas; // Variabler para almacenar el numero de puertas

    // Funcion para incrementar el numero de puertas
    public void inc_puertas(){
        this.n_puertas++;
    }
}
