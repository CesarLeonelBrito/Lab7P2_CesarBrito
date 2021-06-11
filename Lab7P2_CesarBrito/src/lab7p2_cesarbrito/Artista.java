package lab7p2_cesarbrito;

import java.io.Serializable;
import java.util.ArrayList;

public class Artista implements Serializable {

    private String nombre;
    private String genero;
    private String disquera;
    private String alias;
    private String rol;
    private ArrayList<Album> albumes = new ArrayList();

    private static final long SerialVersionUID = 555L;

    public Artista(String nombre, String genero, String disquera, String alias, String rol) {
        this.nombre = nombre;
        this.genero = genero;
        this.disquera = disquera;
        this.alias = alias;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDisquera() {
        return disquera;
    }

    public void setDisquera(String disquera) {
        this.disquera = disquera;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public ArrayList<Album> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(ArrayList<Album> albumes) {
        this.albumes = albumes;
    }

    @Override
    public String toString() {
        return nombre + " - " + alias;
    }

}
