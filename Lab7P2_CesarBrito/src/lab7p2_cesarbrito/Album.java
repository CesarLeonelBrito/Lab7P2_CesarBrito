package lab7p2_cesarbrito;

import java.io.Serializable;
import java.util.ArrayList;

public class Album implements Serializable{

    private String nombre;
    private String publicacion;
    private String genero;
    private String formato;
    private String productor;
    private ArrayList<Cancion> canciones = new ArrayList();

    private static final long SerialVersionUID = 666L;

    public Album(String nombre, String publicacion, String genero, String formato, String productor) {
        this.nombre = nombre;
        this.publicacion = publicacion;
        this.genero = genero;
        this.formato = formato;
        this.productor = productor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(String publicacion) {
        this.publicacion = publicacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getProductor() {
        return productor;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
