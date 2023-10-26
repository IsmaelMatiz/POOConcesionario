package DTOcompras;

import DTOClientes.Clientes;

import java.time.LocalDate;



public class Compras {
    private int idCompra;
    private LocalDate fechaCompra;
    private Clientes cliente;
    private String autos;
    private double total;


    public int GetidCompra(){
        return this.idCompra;
    }

    public void setidCompra(String idcompra){
        this.idCompra = idCompra;

    }
    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public String getAutos() {
        return autos;
    }

    public void setAutos(String autos) {
        this.autos = autos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
