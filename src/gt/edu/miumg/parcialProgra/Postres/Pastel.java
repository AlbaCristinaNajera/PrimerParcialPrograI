package gt.edu.miumg.parcialProgra.Postres;

import gt.edu.miumg.parcialProgra.Postres.Ingredientes.Cobertura;
import gt.edu.miumg.parcialProgra.Postres.Ingredientes.Masa;
import gt.edu.miumg.parcialProgra.Postres.Ingredientes.Relleno;

public class Pastel extends Postre{
    private String sabor;

    public Pastel(String nombre, String tamaño, double precio, Masa masa, Relleno relleno, Cobertura cobertura) {
        super(nombre, tamaño, precio, masa, relleno, cobertura);
    }


    @Override
    public void preparar() {

    }

    @Override
    public void servir() {

    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
}
