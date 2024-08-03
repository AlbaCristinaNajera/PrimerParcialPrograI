package gt.edu.miumg.parcialProgra.Postres.Sucursal;

public class Empleado  {
    private String nombre;
    private String puesto;
    private double salario;

    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void trabajar(){
        System.out.println("El empleado " + nombre + " está trabajando");

    }

    public void tomarOrden(){
        System.out.println("El empleado " + nombre + " está tomando tu orden;");

    }
}
