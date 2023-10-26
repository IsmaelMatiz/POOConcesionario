import DTOAutos.TipoAuto;
import DTOClientes.Clientes;
import DTOcompras.Compras;
import DTOMecanicos.Mecanicos;
import DTOreparaciones.Reparaciones;
import DTOAutos.Autos;

import java.time.LocalDate;

public class ObjectInstances {
    public static void main(String[] args) {
        // Crear un cliente
        Clientes clienteAmaury = new Clientes();
        clienteAmaury.Setcedula("1234567890");
        clienteAmaury.Setnombre("Amaury");
        clienteAmaury.Setapellidos("González");
        clienteAmaury.Setdireccion("123 Calle Principal");
        clienteAmaury.Settelefono("555-123-4567");

        // Crear un automóvil
        Autos auto1 = new Autos();
        auto1.SetMatricula("ABC123");
        auto1.setModelo("Sedan");
        auto1.setMarca("Toyota");
        auto1.setColor("Azul");
        auto1.setTipo(TipoAuto.USADO);
        auto1.setUnidadesDisponibles(1);
        auto1.setKilometrajeRecorrido(50000);

        // Crear una compra
        Compras compra1 = new Compras();
        compra1.setIdCompra(1);
        compra1.setFechaCompra(LocalDate.now());
        compra1.setCliente(clienteAmaury);
        compra1.setAutos("ABC123");
        compra1.setTotal(15000.0);

        // Crear un mecánico
        Mecanicos mecanicoJuan = new Mecanicos();
        mecanicoJuan.Setcedula("9876543210");
        mecanicoJuan.Setnombre("Juan");
        mecanicoJuan.Setapellidos("Pérez");
        mecanicoJuan.Setfechadecontratacion(LocalDate.now());
        mecanicoJuan.Setsalario(3000.0);

        // Crear una reparación
        Reparaciones reparacion1 = new Reparaciones();
        reparacion1.setIdReparacion(1);
        reparacion1.setFechaReparacion(LocalDate.now());
        reparacion1.setHorasReparacion(5);
        reparacion1.setCedulaMecanico("9876543210");
        reparacion1.setAutos("ABC123");

        // Imprimir información
        System.out.println("Información de la Compra:");
        System.out.println("ID de Compra: " + compra1.getIdCompra());
        System.out.println("Fecha de Compra: " + compra1.getFechaCompra());
        System.out.println("Cliente: " + compra1.getCliente().Getnombre());
        System.out.println("Autos Comprados: " + compra1.getAutos());
        System.out.println("Total: $" + compra1.getTotal());

        System.out.println("\nInformación del Mecánico:");
        System.out.println("Cédula: " + mecanicoJuan.Getcedula());
        System.out.println("Nombre: " + mecanicoJuan.Getnombre());
        System.out.println("Fecha de Contratación: " + mecanicoJuan.Getfechadecontratacion());
        System.out.println("Salario: $" + mecanicoJuan.Getsalario());

        System.out.println("\nInformación de la Reparación:");
        System.out.println("ID de Reparación: " + reparacion1.getIdReparacion());
        System.out.println("Fecha de Reparación: " + reparacion1.getFechaReparacion());
        System.out.println("Horas de Reparación: " + reparacion1.getHorasReparacion());
        System.out.println("Mecánico Responsable: " + reparacion1.getCedulaMecanico());
        System.out.println("Autos Reparados: " + reparacion1.getAutos());
    }
}
