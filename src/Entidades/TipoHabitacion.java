package Entidades;

public class TipoHabitacion {
    private int idTipo;
    private String nombre;
    private int capacidad;
    private int cantCamas;
    private String tipoCamas;
    private double precioNoche;

    public TipoHabitacion() {
    }

    public TipoHabitacion(int idTipo, String nombre, int capacidad, int cantCamas, String tipoCamas, double precioNoche) {
        this.idTipo = idTipo;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.cantCamas = cantCamas;
        this.tipoCamas = tipoCamas;
        this.precioNoche = precioNoche;
    }

    public TipoHabitacion(String nombre, int capacidad, int cantCamas, String tipoCamas, double precioNoche) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.cantCamas = cantCamas;
        this.tipoCamas = tipoCamas;
        this.precioNoche = precioNoche;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCantCamas() {
        return cantCamas;
    }

    public void setCantCamas(int cantCamas) {
        this.cantCamas = cantCamas;
    }

    public String getTipoCamas() {
        return tipoCamas;
    }

    public void setTipoCamas(String tipoCamas) {
        this.tipoCamas = tipoCamas;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    @Override
    public String toString() {
        return nombre + ", para " + capacidad;
    }
}