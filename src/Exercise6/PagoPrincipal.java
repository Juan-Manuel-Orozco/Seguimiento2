package Exercise6;
import Exercise6.PagoEmpleado;
import Exercise4.Semaforo;
import Exercise1.User;

public class PagoPrincipal {
    public static void main(String[] args) {
        PagoEmpleado pago1 = new PagoEmpleado("1", 1000000 , 5, 8, (float) 0.05, 200000);

        System.out.println("Valor Horas Extra: $"+ pago1.calcularValorHE());
        System.out.println("Total Devengado: $"+ pago1.calcularDevengado());
        System.out.println("Total Deducido: $"+ pago1.calcularDeducido());
        System.out.println("Total Neto: $"+ pago1.calcularNeto());

        PagoEmpleado pago2 = new PagoEmpleado("2", 2500000 , 14, 5, (float) 0.15, 300000);

        System.out.println("\nValor Horas Extra: $"+ pago2.calcularValorHE());
        System.out.println("Total Devengado: $"+ pago2.calcularDevengado());
        System.out.println("Total Deducido: $"+ pago2.calcularDeducido());
        System.out.println("Total Neto: $"+ pago2.calcularNeto());
    }

}
