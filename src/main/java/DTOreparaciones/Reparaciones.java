package DTOreparaciones;

import java.time.LocalDate;

public class Reparaciones {
    private int idReparacion;
    private LocalDate fechaReparacion;

    private int horasReparacion;

    private String cedulaMecanico;

    private String autos;

    public int getIdReparacion() {
        return idReparacion;
    }

    public void setIdReparacion(int idReparacion) {
        this.idReparacion = idReparacion;
    }

    public LocalDate getFechaReparacion() {
        return fechaReparacion;
    }

    public void setFechaReparacion(LocalDate fechaReparacion) {
        this.fechaReparacion = fechaReparacion;
    }

    public int getHorasReparacion() {
        return horasReparacion;
    }

    public void setHorasReparacion(int horasReparacion) {
        this.horasReparacion = horasReparacion;
    }

    public String getCedulaMecanico() {
        return cedulaMecanico;
    }

    public void setCedulaMecanico(String cedulaMecanico) {
        this.cedulaMecanico = cedulaMecanico;
    }

    public String getAutos() {
        return autos;
    }

    public void setAutos(String autos) {
        this.autos = autos;
    }
}

