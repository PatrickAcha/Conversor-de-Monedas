import java.util.Scanner;
import com.google.gson.JsonObject;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        ClienteTasaCambio clienteTasa = new ClienteTasaCambio();
        ConvertidorMoneda convertidor = new ConvertidorMoneda();
        JsonObject tasas;

        try {
            tasas = clienteTasa.obtenerTasasCambio();
        } catch (IOException | InterruptedException e) {
            System.out.println("No se pudieron obtener las tasas de cambio: " + e.getMessage());
            return;
        }

        double pesoArgentino = tasas.get("ARS").getAsDouble();
        double boliviano = tasas.get("BOB").getAsDouble();
        double realBrasileno = tasas.get("BRL").getAsDouble();
        double pesoChileno = tasas.get("CLP").getAsDouble();
        double pesoColombiano = tasas.get("COP").getAsDouble();
        double dolarEstadounidense = tasas.get("USD").getAsDouble();

        while (true) {
            System.out.println("Conversor de Monedas");
            System.out.println("1. Convertir USD (Dólar estadounidense) a Peso argentino");
            System.out.println("2. Convertir USD (Dólar estadounidense) a Boliviano");
            System.out.println("3. Convertir USD (Dólar estadounidense) a Real brasileño");
            System.out.println("4. Convertir USD (Dólar estadounidense) a Peso chileno");
            System.out.println("5. Convertir USD (Dólar estadounidense) a Peso colombiano");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = escaner.nextInt();

            if (opcion == 6) {
                System.out.println("Gracias por usar el conversor de monedas. ¡Adiós!");
                break;
            }

            System.out.print("Introduce la cantidad en USD (Dólar estadounidense): ");
            double cantidadUSD = escaner.nextDouble();
            double cantidadConvertida;

            switch (opcion) {
                case 1:
                    cantidadConvertida = convertidor.convertir(cantidadUSD, dolarEstadounidense, pesoArgentino);
                    System.out.println(cantidadUSD + " USD (Dólar estadounidense) = " + cantidadConvertida + " ARS (Peso argentino)");
                    break;
                case 2:
                    cantidadConvertida = convertidor.convertir(cantidadUSD, dolarEstadounidense, boliviano);
                    System.out.println(cantidadUSD + " USD (Dólar estadounidense) = " + cantidadConvertida + " BOB (Boliviano)");
                    break;
                case 3:
                    cantidadConvertida = convertidor.convertir(cantidadUSD, dolarEstadounidense, realBrasileno);
                    System.out.println(cantidadUSD + " USD (Dólar estadounidense) = " + cantidadConvertida + " BRL (Real brasileño)");
                    break;
                case 4:
                    cantidadConvertida = convertidor.convertir(cantidadUSD, dolarEstadounidense, pesoChileno);
                    System.out.println(cantidadUSD + " USD (Dólar estadounidense) = " + cantidadConvertida + " CLP (Peso chileno)");
                    break;
                case 5:
                    cantidadConvertida = convertidor.convertir(cantidadUSD, dolarEstadounidense, pesoColombiano);
                    System.out.println(cantidadUSD + " USD (Dólar estadounidense) = " + cantidadConvertida + " COP (Peso colombiano)");
                    break;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }

            System.out.println("**************************************************************");
        }

        escaner.close();
    }
}

