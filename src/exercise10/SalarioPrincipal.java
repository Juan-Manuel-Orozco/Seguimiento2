package exercise10;

public class SalarioPrincipal {
    public float salario;
    public String empleado;
    public float valorHoras;
    public int horasTrabajadas;

    public SalarioPrincipal(String empleado, int horasTrabajadas) {
        this.empleado = empleado;
        this.horasTrabajadas = horasTrabajadas;
        if (this.horasTrabajadas > 10) {
            this.valorHoras = 33000;
        } else {
            this.valorHoras = 30000;
        }
        this.salario = calcularSalario();
    }

    public float calcularSalario(){
        return this.horasTrabajadas * this.valorHoras;
    }
}
