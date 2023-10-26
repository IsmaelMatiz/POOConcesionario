package DTOMecanicos;

import java.time.LocalDate;

public class Mecanicos {

    private String cedula;
    private String nombre;
    private String apellidos;
    private LocalDate fechadecontratacion;
    private Float salario;


    public String Getcedula(){
        return this.cedula;
    }

    public void Setcedula(String cedula){
        this.cedula = cedula;
    }

    public String Getnombre(){
        return this.nombre;
    }

    public void Setnombre(String nombre){
        this.nombre = nombre;
    }

    public String Getapellidos(){
        return this.apellidos;
    }

    public void Setapellidos(String apellidos){
        this.apellidos = apellidos;
    }

    public LocalDate Getfechadecontratacion(){
        return this.fechadecontratacion;
    }

    public void Setfechadecontratacion(LocalDate fechadecontratacion){
        this.fechadecontratacion = fechadecontratacion;
    }

    public Float Getsalario(){
        return this.salario;
    }

    public void Setsalario(Float salario){
        this.salario = salario;
    }

}
