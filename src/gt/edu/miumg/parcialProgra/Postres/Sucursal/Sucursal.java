package gt.edu.miumg.parcialProgra.Postres.Sucursal;

import gt.edu.miumg.parcialProgra.Postres.Ingredientes.Ingrediente;
import gt.edu.miumg.parcialProgra.Postres.Postre;

import java.util.List;

public abstract class Sucursal {
    private String nombre;
    private String direccion;
    private List<Empleado> empleados;
    private List<Ingrediente> ingredientes;
    private List<Equipo> equipos;
    private List<Postre> postres;

    public Sucursal(String nombre, String direccion, List<Empleado> empleados, List<Ingrediente> ingredientes, List<Equipo> equipos, List<Postre> postres) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.empleados = empleados;
        this.ingredientes = ingredientes;
        this.equipos = equipos;
        this.postres = postres;
    }

    public abstract void agregarEmpleado();
    public abstract void agregarEquipo();
    public abstract void agregarIngrediente();
    public abstract void agregarEspecialidad();
}
