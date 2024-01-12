package Entidades;

public class Habitacion {
    private int idHabitacion;
    private TipoHabitacion tipoHabitacion;
    private boolean estado;

    public Habitacion() {
    }

    public Habitacion(int idHabitacion, TipoHabitacion tipoHabitacion, boolean estado) {
        this.idHabitacion = idHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.estado = estado;
    }

    public Habitacion(TipoHabitacion tipoHabitacion, boolean estado) {
        this.tipoHabitacion = tipoHabitacion;
        this.estado = estado;
    }

    public int getidHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;

    }

    public TipoHabitacion gettipoHabitacion() {
        return tipoHabitacion;
    }

    public void settipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "idHabitacion=" + idHabitacion + ", tipoHabitacion=" + tipoHabitacion + ", estado=" + estado + '}';
    }
}
