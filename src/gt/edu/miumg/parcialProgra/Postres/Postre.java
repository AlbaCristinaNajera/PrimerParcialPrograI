package gt.edu.miumg.parcialProgra.Postres;

import gt.edu.miumg.parcialProgra.Postres.Ingredientes.Cobertura;
import gt.edu.miumg.parcialProgra.Postres.Ingredientes.Masa;
import gt.edu.miumg.parcialProgra.Postres.Ingredientes.Relleno;

public abstract class Postre {
    private String nombre;
    private String tamaño;
    private double precio;
    private Masa masa;
    private Relleno relleno;
    private Cobertura cobertura;

    public Postre(String nombre, String tamaño, double precio, Masa masa, Relleno relleno, Cobertura cobertura) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.precio = precio;
        this.masa = masa;
        this.relleno = relleno;
        this.cobertura = cobertura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public abstract void preparar();
    public abstract void servir();


}
