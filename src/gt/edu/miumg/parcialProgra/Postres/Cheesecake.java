package gt.edu.miumg.parcialProgra.Postres;

import gt.edu.miumg.parcialProgra.Postres.Ingredientes.Cobertura;
import gt.edu.miumg.parcialProgra.Postres.Ingredientes.Masa;
import gt.edu.miumg.parcialProgra.Postres.Ingredientes.Relleno;

public class Cheesecake extends Postre{

    private String tipoQueso;

    public Cheesecake(String nombre, String tamaño, double precio, Masa masa, Relleno relleno, Cobertura cobertura) {
        super(nombre, tamaño, precio, masa, relleno, cobertura);
    }


    @Override
    public void preparar() {

    }

    @Override
    public void servir() {

    }

    public String getTipoQueso() {
        return tipoQueso;
    }

    public void setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
    }
}
