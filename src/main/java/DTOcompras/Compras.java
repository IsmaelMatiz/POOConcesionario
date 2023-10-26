package DTOcompras;

import java.time.LocalDate;



public class Compras {
    private int idCompra;
    private LocalDate fechaCompra;
    private String cliente;
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

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
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
