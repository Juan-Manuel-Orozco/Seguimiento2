package Exercise6;

public class PagoEmpleado {
    public String codEmpleado;
    private float salarioBasico;
    public int horasExtra;
    private int numeroHoras;
    private float descuento;
    private float bonificacion;
    private float neto;

    public PagoEmpleado(String codEmpleado, float salarioBasico, int horasExtra,
                        int numeroHoras, float descuento, float bonificacion) {
        super();
        this.codEmpleado = codEmpleado;
        this.salarioBasico = salarioBasico;
        this.horasExtra = horasExtra;
        this.numeroHoras = numeroHoras;
        this.descuento = descuento;
        this.bonificacion = bonificacion;
    }

    public float calcularValorHE(){
        int numeroHorasTotalesTrabajadasAlMes = this.numeroHoras * 30;
        float valorHora = this.salarioBasico / numeroHorasTotalesTrabajadasAlMes;
        float valorHorasExtra = this.horasExtra * valorHora;

        return valorHorasExtra;
    }

    public float calcularDevengado(){
        return this.salarioBasico + calcularValorHE() + this.bonificacion;
    }

    public float calcularDeducido(){
        return calcularDevengado() * this.descuento;
    }

    public float calcularNeto(){
        this.neto = calcularDevengado() - calcularDeducido();
        float neto1 = this.neto;
        return this.neto;
    }

}
