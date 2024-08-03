package gt.edu.miumg.parcialProgra.Postres.Ingredientes;

public class Cobertura implements Ingrediente{
    private String tipo;
    private double cantidad;

    public Cobertura(String tipo, double cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    @Override
    public void obtenernombre() {

    }

    @Override
    public void obtenerCantidad() {

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
}
