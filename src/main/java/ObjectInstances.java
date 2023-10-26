import DTOClientes.Clientes;
import DTOcompras.Compras;

public class ObjectInstances {
    public static void main(String[] args) {
        Clientes Amaury = new Clientes();

        Compras compra1 = new Compras();

        compra1.setCliente(Amaury);
    }
}
