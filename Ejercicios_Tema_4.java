public class Main {
    public static void main(String[] args) {
        // EJERCICIO 1
        System.out.println("EJERCICIO 1");

        int numeroif = 0;
        if (numeroif > 0){
            System.out.println("El número es positivo");
        }else if( numeroif < 0){
            System.out.println("El número es Negativo");
        }else {
            System.out.println("El número es igual a 0");
        }

        // EJERCICIO 2
        System.out.println("EJERCICIO 2");

        int numeroWhile = 0;
        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        // EJERCICIO 3
        System.out.println("EJERCICIO 3");

        do{
            System.out.println(numeroWhile);
            numeroWhile++;
        }while (numeroWhile<3);

        // EJERCICIO 4
        System.out.println("EJERCICIO 4");

        for (int numeroFor = 0; numeroFor <=3; numeroFor ++){
            System.out.println(numeroFor);
        }
        // EJERCICIO 5
        System.out.println("EJERCICIO 5");

        var estacion ="invierno";

        switch (estacion){
            case "verano":
                System.out.println("Es verano");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "otoño":
                System.out.println("Es otonoño");
                break;
            default:
                System.out.println("La variable no es estación");
                break;

        }
    }
}
