package gt.edu.miumg.parcialProgra.Postres;

import gt.edu.miumg.parcialProgra.Postres.Ingredientes.Cobertura;
import gt.edu.miumg.parcialProgra.Postres.Ingredientes.Masa;
import gt.edu.miumg.parcialProgra.Postres.Ingredientes.Relleno;

public class Crepa extends Postre{
    private String tipoMasa;

    public Crepa(String nombre, String tamaño, double precio, Masa masa, Relleno relleno, Cobertura cobertura) {
        super(nombre, tamaño, precio, masa, relleno, cobertura);
    }


    @Override
    public void preparar() {

    }

    @Override
    public void servir() {

    }

    public String getTipoMasa() {
        return tipoMasa;
    }

    public void setTipoMasa(String tipoMasa) {
        this.tipoMasa = tipoMasa;
    }
}
