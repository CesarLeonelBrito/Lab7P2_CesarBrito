package lab7p2_cesarbrito;

import java.io.Serializable;

public class Cancion implements Serializable{

    private String nombre;
    private String compositor;
    private String distribuidor;
    private String productor;
    private String invitado;
    private boolean exclusivo;
    private int duracion;

    private static final long SerialVersionUID = 777L;

    public Cancion(String nombre, String compositor, String distribuidor, String productor, String invitado, boolean exclusivo, int duracion) {
        this.nombre = nombre;
        this.compositor = compositor;
        this.distribuidor = distribuidor;
        this.productor = productor;
        this.invitado = invitado;
        this.exclusivo = exclusivo;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public String getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(String distribuidor) {
        this.distribuidor = distribuidor;
    }

    public String getProductor() {
        return productor;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    public String getInvitado() {
        return invitado;
    }

    public void setInvitado(String invitado) {
        this.invitado = invitado;
    }

    public boolean isExclusivo() {
        return exclusivo;
    }

    public void setExclusivo(boolean exclusivo) {
        this.exclusivo = exclusivo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
