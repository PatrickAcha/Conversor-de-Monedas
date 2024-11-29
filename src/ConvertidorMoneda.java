public class ConvertidorMoneda {

    public double convertir(double cantidad, double tasaOrigen, double tasaDestino) {
        double resultado = cantidad * (tasaDestino / tasaOrigen);
        System.out.println("Convirtiendo: " + cantidad + " usando tasas " + tasaOrigen + " a " + tasaDestino + " = " + resultado);
        return resultado;
    }
}



