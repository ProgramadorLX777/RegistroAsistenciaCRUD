package model;

public class Usuario {
    
    private int idUsuario;
    private String rut;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String direccion;
    private String fono;
    private String fechaNacimiento;
    private String passUsuario;

    public Usuario() {
    }

    public Usuario(int idUsuario, String rut, String nombre, String apellidoPaterno, String apellidoMaterno, String direccion, String fono, String fechaNacimiento, String passUsuario) {
        this.idUsuario = idUsuario;
        this.rut = rut;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.direccion = direccion;
        this.fono = fono;
        this.fechaNacimiento = fechaNacimiento;
        this.passUsuario = passUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getFono() {
        return fono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getPassUsuario() {
        return passUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setFono(String fono) {
        this.fono = fono;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setPassUsuario(String passUsuario) {
        this.passUsuario = passUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", rut=" + rut + ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", direccion=" + direccion + ", fono=" + fono + ", fechaNacimiento=" + fechaNacimiento + ", passUsuario=" + passUsuario + '}';
    }
    
}
