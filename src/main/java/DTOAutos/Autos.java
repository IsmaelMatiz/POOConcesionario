package DTOAutos;


public class Autos {
    private String matricula;
    private String modelo;
    private String marca;
    private String color;
    private TipoAuto tipo;
    private Integer unidadesDisponibles;
    private Integer kilometrajeRecorrido;

    public String GetMatricula(){
        return this.matricula;
    }
    
    public void SetMatricula(String matricula){
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public TipoAuto getTipo() {
        return tipo;
    }

    public void setTipo(TipoAuto tipo) {
        this.tipo = tipo;
    }

    public Integer getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(Integer unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public Integer getKilometrajeRecorrido() {
        return kilometrajeRecorrido;
    }

    public void setKilometrajeRecorrido(Integer kilometrajeRecorrido) {
        this.kilometrajeRecorrido = kilometrajeRecorrido;
    }
}
