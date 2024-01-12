package Entidades;

public class Huesped {
    
    private int idHuesped;
    private String nombre,apellido, domicilio, correo;
    private int dni; 
    private long celular; 
            
    private boolean estado;

    public Huesped() {
    }

    public Huesped(String nombre,String apellido, String domicilio, String correo, int dni, long celular, boolean estado) {
        this.nombre = nombre;
        this.apellido=apellido;
        this.domicilio = domicilio;
        this.correo = correo;
        this.dni = dni;
        this.celular = celular;
        this.estado = estado;
    }

    public Huesped(int idHuesped, String nombre,String apellido, String domicilio, String correo, int dni, long celular, boolean estado) {
        this.idHuesped = idHuesped;
        this.nombre = nombre;
        this.apellido=apellido;
        this.domicilio = domicilio;
        this.correo = correo;
        this.dni = dni;
        this.celular = celular;
        this.estado = estado;
    }

    public int getIdHuesped() {
        return idHuesped;
    }

    public void setIdHuesped(int idHuesped) {
        this.idHuesped = idHuesped;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Huesped{" + "idHuesped=" + idHuesped + ", nombre=" + nombre + ", apellido=" + apellido + ", domicilio=" + domicilio + ", correo=" + correo + ", dni=" + dni + ", celular=" + celular + ", estado=" + estado + '}';
    }

  
    
    
    
    
    
    
            
    
}