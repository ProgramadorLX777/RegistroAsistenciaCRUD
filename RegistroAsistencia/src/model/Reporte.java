package model;

public class Reporte {
    
    private int idReporte;
    private int idUsuarioReporte;
    private boolean ingresoTrabajador;
    private String fechaActual;
    private String horaActual;
    private String diasAtrasados;

    public Reporte() {
    }

    public Reporte(int idReporte, int idUsuarioReporte, boolean ingresoTrabajador, String fechaActual, String horaActual, String diasAtrasados) {
        this.idReporte = idReporte;
        this.idUsuarioReporte = idUsuarioReporte;
        this.ingresoTrabajador = ingresoTrabajador;
        this.fechaActual = fechaActual;
        this.horaActual = horaActual;
        this.diasAtrasados = diasAtrasados;
    }

    public int getIdReporte() {
        return idReporte;
    }

    public int getIdUsuarioReporte() {
        return idUsuarioReporte;
    }

    public boolean isIngresoTrabajador() {
        return ingresoTrabajador;
    }

    public String getFechaActual() {
        return fechaActual;
    }

    public String getHoraActual() {
        return horaActual;
    }

    public String getDiasAtrasados() {
        return diasAtrasados;
    }

    public void setIdReporte(int idReporte) {
        this.idReporte = idReporte;
    }

    public void setIdUsuarioReporte(int idUsuarioReporte) {
        this.idUsuarioReporte = idUsuarioReporte;
    }

    public void setIngresoTrabajador(boolean ingresoTrabajador) {
        this.ingresoTrabajador = ingresoTrabajador;
    }

    public void setFechaActual(String fechaActual) {
        this.fechaActual = fechaActual;
    }

    public void setHoraActual(String horaActual) {
        this.horaActual = horaActual;
    }

    public void setDiasAtrasados(String diasAtrasados) {
        this.diasAtrasados = diasAtrasados;
    }

    @Override
    public String toString() {
        return "Reporte{" + "idReporte=" + idReporte + ", idUsuarioReporte=" + idUsuarioReporte + ", ingresoTrabajador=" + ingresoTrabajador + ", fechaActual=" + fechaActual + ", horaActual=" + horaActual + ", diasAtrasados=" + diasAtrasados + '}';
    }

    
    
}
