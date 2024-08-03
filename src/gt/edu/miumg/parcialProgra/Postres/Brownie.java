package gt.edu.miumg.parcialProgra.Postres;

import gt.edu.miumg.parcialProgra.Postres.Ingredientes.Cobertura;
import gt.edu.miumg.parcialProgra.Postres.Ingredientes.Masa;
import gt.edu.miumg.parcialProgra.Postres.Ingredientes.Relleno;

public class Brownie extends Postre{
    private String tipoChocolate;

    public Brownie(String nombre, String tamaño, double precio, Masa masa, Relleno relleno, Cobertura cobertura) {
        super(nombre, tamaño, precio, masa, relleno, cobertura);
    }

    @Override
    public void preparar() {

    }

    @Override
    public void servir() {

    }

    public String getTipoChocolate() {
        return tipoChocolate;
    }

    public void setTipoChocolate(String tipoChocolate) {
        this.tipoChocolate = tipoChocolate;
    }
}
