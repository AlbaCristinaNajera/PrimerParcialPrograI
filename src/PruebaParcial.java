import gt.edu.miumg.parcialProgra.Postres.Ingredientes.Cobertura;
import gt.edu.miumg.parcialProgra.Postres.Ingredientes.Ingrediente;
import gt.edu.miumg.parcialProgra.Postres.Ingredientes.Masa;
import gt.edu.miumg.parcialProgra.Postres.Ingredientes.Relleno;
import gt.edu.miumg.parcialProgra.Postres.Pastel;
import gt.edu.miumg.parcialProgra.Postres.Postre;
import gt.edu.miumg.parcialProgra.Postres.Sucursal.Empleado;
import gt.edu.miumg.parcialProgra.Postres.Sucursal.Equipo;

import java.util.ArrayList;
import java.util.List;

public class PruebaParcial {
    public static void main(String[] args) {


        // Empleados
        Empleado empleado1 = new Empleado("Juan Perez", "Cocinero", 5000.0);
        Empleado empleado2 = new Empleado("Maria Gomez", "Pastelera", 5500.0);

        //Ingredintes
        Ingrediente masa = new Masa("Hojaldre", 10.0);
        Ingrediente relleno = new Relleno("Crema", 5.0);
        Ingrediente cobertura = new Cobertura("Chocolate", 2.0);

        // Crear algunos equipos
        Equipo equipo1 = new Equipo("Horno", "Operativo");
        Equipo equipo2 = new Equipo("Batidora", "Operativo");

        Postre pastel = new Pastel("Pastel de Chocolate", "Grande", 150.0, (Masa) masa, (Relleno) relleno, (Cobertura) cobertura);



        // Crear listas
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(empleado1);
        empleados.add(empleado2);

        List<Ingrediente> ingredientes = new ArrayList<>();
        ingredientes.add(masa);
        ingredientes.add(relleno);
        ingredientes.add(cobertura);

        List<Equipo> equipos = new ArrayList<>();
        equipos.add(equipo1);
        equipos.add(equipo2);

        List<Postre> postres = new ArrayList<>();
        postres.add(pastel);

        // Imprimir información en pantalla
        System.out.println("Empleados:");
        for (Empleado emp : empleados) {
            System.out.println("- Nombre: " + emp.getNombre() + ", Puesto: " + emp.getPuesto() + ", Salario: " + emp.getSalario());
        }

        System.out.println("\nIngredientes:");
        for (Ingrediente ing : ingredientes) {
            if (ing instanceof Masa) {
                Masa m = (Masa) ing;
                System.out.println("- Masa: " + m.getTipo() + ", Cantidad: " + m.getCantidad());
            } else if (ing instanceof Relleno) {
                Relleno r = (Relleno) ing;
                System.out.println("- Relleno: " + r.getSabor() + ", Cantidad: " + r.getCantidad());
            } else if (ing instanceof Cobertura) {
                Cobertura c = (Cobertura) ing;
                System.out.println("- Cobertura: " + c.getTipo() + ", Cantidad: " + c.getCantidad());
            }
        }

        System.out.println("\nEquipos:");
        for (Equipo eq : equipos) {
            System.out.println("- Tipo: " + eq.getTipo() + ", Estado: " + eq.getEstado());
        }

        System.out.println("\nPostres:");
        for (Postre p : postres) {
            System.out.println("- Nombre: " + p.getNombre() + ", Tamaño: " + p.getTamaño() + ", Precio: " + p.getPrecio());
        }
    }
}
