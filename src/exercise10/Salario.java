package exercise10;
    import exercise10.SalarioPrincipal;
public class Salario {
    public static void main(String[] args) {
    SalarioPrincipal salario1= new SalarioPrincipal("juan", 14);

        System.out.println("Señor "+salario1.empleado+ " el nuemro de horas es "+salario1.horasTrabajadas+" y su salario equivale a:  "+ salario1.salario);
    }
}
