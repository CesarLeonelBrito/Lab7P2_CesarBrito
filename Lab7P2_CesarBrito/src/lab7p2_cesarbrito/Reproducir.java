package lab7p2_cesarbrito;

import java.util.ArrayList;
import javax.swing.JProgressBar;

public class Reproducir extends Thread {

    private JProgressBar progBar;
    private Album album;
    private int po;
    private boolean avanzar;
    private boolean vive;

    public Reproducir(JProgressBar progBar) {
        this.progBar = progBar;
        avanzar = true;
        vive = true;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public void setPo(int po) {
        this.po = po;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public void setVida(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        while (vive) {
            if (avanzar) {
                Cancion x = album.getCanciones().get(po);
                progBar.setString(x.getNombre());
                progBar.setMaximum(x.getDuracion());
                while (progBar.getValue() <= x.getDuracion()) {
                    progBar.setValue(progBar.getValue() + 1);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                    }
                }
                po += 1;
                if (po >= album.getCanciones().size()) {
                    po = 0;
                }
            }
        }

    }

}
