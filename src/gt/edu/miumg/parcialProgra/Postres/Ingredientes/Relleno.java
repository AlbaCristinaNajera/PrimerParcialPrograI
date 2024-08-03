package gt.edu.miumg.parcialProgra.Postres.Ingredientes;

public class Relleno implements Ingrediente{
    private String sabor;
    private double cantidad;

    public Relleno(String sabor, double cantidad) {
        this.sabor = sabor;
        this.cantidad = cantidad;
    }

    @Override
    public void obtenernombre() {

    }

    @Override
    public void obtenerCantidad() {

    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
}
