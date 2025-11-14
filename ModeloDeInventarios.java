package modelodeinventarios;

import java.util.Scanner;

import javafx.scene.control.Menu;

public class ModeloDeInventarios {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int opcion = 0;
        int k, d, y, to, diasSobreTo, dias, le, pr, tcu;
        double h;

        do {
            System.out.println("Menu");
            System.out.println("1. Modelo de inventarios clasico");
            System.out.println("2. Modelo de inventarios con descuento");
            System.out.println("3. Salir");
            System.out.println("Opcion: ");
            opcion = lector.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("MODELO DE INVENTARIOS CLASICO");
                    System.out.println("Teclea el costo de pedido");
                    k = lector.nextInt();
                    System.out.println("Teclea el valor de la demanda");
                    d = lector.nextInt();
                    System.out.println("Teclea el valor de cada unidad");
                    h = lector.nextDouble();

                    y = (int) Math.sqrt((2 * k * d) / h);

                    System.out.println("Valor de y* " + y);

                    to = y / d;
                    System.out.println("El valor de to es: "+ to);

                    System.out.println("Tecle el tiempo en el que se hace y recibe el pedido");
                    dias = lector.nextInt();

                    diasSobreTo = dias / to;

                    le = dias - diasSobreTo * (to);

                    System.out.println("Valor de Le es: " + le);

                    pr = le * d;

                    System.out.println("Valor de punto de reorden es: " + pr);

                    tcu = (int) ((k / y / d) + (h * (y / 2)));

                    System.out.println("El valor de TCU es: " + tcu);

                    


                case 3:
                    System.out.println("Saliendo");
                    break;

                default:

                    break;
            }
        } while (opcion != 3);
    }
}