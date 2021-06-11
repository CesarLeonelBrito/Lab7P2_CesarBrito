package lab7p2_cesarbrito;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_crear_artista = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rb_instrumental = new javax.swing.JRadioButton();
        rb_voz = new javax.swing.JRadioButton();
        tf_art_nombre = new javax.swing.JTextField();
        tf_art_disquera = new javax.swing.JTextField();
        tf_art_genero = new javax.swing.JTextField();
        tf_art_alias = new javax.swing.JTextField();
        jb_add_art = new javax.swing.JButton();
        jd_listar_artista = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_artistas = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        popup_artistas = new javax.swing.JPopupMenu();
        modificar_art = new javax.swing.JMenuItem();
        eliminar_art = new javax.swing.JMenuItem();
        add_playlist = new javax.swing.JMenuItem();
        ver_playlists = new javax.swing.JMenuItem();
        jd_mod_artista = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        rb_instrumental1 = new javax.swing.JRadioButton();
        rb_voz1 = new javax.swing.JRadioButton();
        tf_art_nombre1 = new javax.swing.JTextField();
        tf_art_disquera1 = new javax.swing.JTextField();
        tf_art_genero1 = new javax.swing.JTextField();
        tf_art_alias1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jb_mod_art = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jd_crear_album = new javax.swing.JDialog();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        rb_digital = new javax.swing.JRadioButton();
        rb_cd = new javax.swing.JRadioButton();
        tf_alb_nombre = new javax.swing.JTextField();
        tf_alb_genero = new javax.swing.JTextField();
        tf_alb_publicacion = new javax.swing.JTextField();
        tf_alb_productor = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jb_add_album = new javax.swing.JButton();
        jd_listar_album = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_albums = new javax.swing.JList<>();
        jLabel17 = new javax.swing.JLabel();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jd_crear_cancion = new javax.swing.JDialog();
        jLabel18 = new javax.swing.JLabel();
        Distribuidor = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        rb_si = new javax.swing.JRadioButton();
        rb_no = new javax.swing.JRadioButton();
        tf_cancion_nombre = new javax.swing.JTextField();
        tf_cancion_dist = new javax.swing.JTextField();
        tf_cancion_comp = new javax.swing.JTextField();
        tf_cancion_pro = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jb_add_cancion = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        tf_cancion_inv = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        tf_cancion_duracion = new javax.swing.JTextField();
        jd_listar_canciones = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        jl_canciones = new javax.swing.JList<>();
        jLabel24 = new javax.swing.JLabel();
        popup_albums = new javax.swing.JPopupMenu();
        add_cancion = new javax.swing.JMenuItem();
        listar_canciones = new javax.swing.JMenuItem();
        popup_canciones = new javax.swing.JPopupMenu();
        eliminar = new javax.swing.JMenuItem();
        modificar = new javax.swing.JMenuItem();
        reproducir = new javax.swing.JMenuItem();
        jd_mod_cancion = new javax.swing.JDialog();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        tf_cancion_inv1 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        rb_si1 = new javax.swing.JRadioButton();
        tf_cancion_duracion1 = new javax.swing.JTextField();
        rb_no1 = new javax.swing.JRadioButton();
        tf_cancion_nombre1 = new javax.swing.JTextField();
        tf_cancion_dist1 = new javax.swing.JTextField();
        tf_cancion_comp1 = new javax.swing.JTextField();
        tf_cancion_pro1 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jb_mod_cancion = new javax.swing.JButton();
        Distribuidor1 = new javax.swing.JLabel();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jb_crear_artista = new javax.swing.JButton();
        jb_listar_artistas = new javax.swing.JButton();

        jLabel1.setText("Nombre:");

        jLabel2.setText("Genero:");

        jLabel3.setText("Disquera:");

        jLabel4.setText("Alias:");

        jLabel5.setText("Rol:");

        buttonGroup1.add(rb_instrumental);
        rb_instrumental.setText("Instrumental");

        buttonGroup1.add(rb_voz);
        rb_voz.setText("Voz");

        jb_add_art.setText("Agregar");
        jb_add_art.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_add_artActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_crear_artistaLayout = new javax.swing.GroupLayout(jd_crear_artista.getContentPane());
        jd_crear_artista.getContentPane().setLayout(jd_crear_artistaLayout);
        jd_crear_artistaLayout.setHorizontalGroup(
            jd_crear_artistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crear_artistaLayout.createSequentialGroup()
                .addGroup(jd_crear_artistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jd_crear_artistaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jb_add_art, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_crear_artistaLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jd_crear_artistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jd_crear_artistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_crear_artistaLayout.createSequentialGroup()
                                .addComponent(rb_instrumental)
                                .addGap(18, 18, 18)
                                .addComponent(rb_voz))
                            .addComponent(tf_art_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_art_disquera, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_art_genero, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_art_alias, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jd_crear_artistaLayout.setVerticalGroup(
            jd_crear_artistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crear_artistaLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jd_crear_artistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_art_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crear_artistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_art_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crear_artistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_art_disquera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crear_artistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_art_alias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crear_artistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rb_instrumental)
                    .addComponent(rb_voz))
                .addGap(30, 30, 30)
                .addComponent(jb_add_art)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        jl_artistas.setModel(new DefaultListModel());
        jl_artistas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_artistasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jl_artistas);

        jLabel6.setText("POPUP MENU, RIGHT CLICK");

        javax.swing.GroupLayout jd_listar_artistaLayout = new javax.swing.GroupLayout(jd_listar_artista.getContentPane());
        jd_listar_artista.getContentPane().setLayout(jd_listar_artistaLayout);
        jd_listar_artistaLayout.setHorizontalGroup(
            jd_listar_artistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_listar_artistaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jd_listar_artistaLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(503, Short.MAX_VALUE))
        );
        jd_listar_artistaLayout.setVerticalGroup(
            jd_listar_artistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_listar_artistaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        modificar_art.setText("Modificar");
        modificar_art.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_artActionPerformed(evt);
            }
        });
        popup_artistas.add(modificar_art);

        eliminar_art.setText("Eliminar");
        eliminar_art.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_artActionPerformed(evt);
            }
        });
        popup_artistas.add(eliminar_art);

        add_playlist.setText("Agregar Playlist");
        add_playlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_playlistActionPerformed(evt);
            }
        });
        popup_artistas.add(add_playlist);

        ver_playlists.setText("Ver Playlist");
        ver_playlists.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ver_playlistsActionPerformed(evt);
            }
        });
        popup_artistas.add(ver_playlists);

        jLabel7.setText("Genero:");

        jLabel8.setText("Disquera:");

        jLabel9.setText("Alias:");

        jLabel10.setText("Rol:");

        buttonGroup2.add(rb_instrumental1);
        rb_instrumental1.setText("Instrumental");

        buttonGroup2.add(rb_voz1);
        rb_voz1.setText("Voz");

        jLabel11.setText("Nombre:");

        jb_mod_art.setText("Modificar");
        jb_mod_art.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_mod_artActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_mod_artistaLayout = new javax.swing.GroupLayout(jd_mod_artista.getContentPane());
        jd_mod_artista.getContentPane().setLayout(jd_mod_artistaLayout);
        jd_mod_artistaLayout.setHorizontalGroup(
            jd_mod_artistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_mod_artistaLayout.createSequentialGroup()
                .addGroup(jd_mod_artistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jd_mod_artistaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jb_mod_art, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_mod_artistaLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jd_mod_artistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jd_mod_artistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_mod_artistaLayout.createSequentialGroup()
                                .addComponent(rb_instrumental1)
                                .addGap(18, 18, 18)
                                .addComponent(rb_voz1))
                            .addComponent(tf_art_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_art_disquera1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_art_genero1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_art_alias1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jd_mod_artistaLayout.setVerticalGroup(
            jd_mod_artistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_mod_artistaLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jd_mod_artistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tf_art_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_mod_artistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_art_genero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_mod_artistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_art_disquera1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_mod_artistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tf_art_alias1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_mod_artistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(rb_instrumental1)
                    .addComponent(rb_voz1))
                .addGap(30, 30, 30)
                .addComponent(jb_mod_art)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        jLabel12.setText("Publicacion:");

        jLabel13.setText("Genero:");

        jLabel14.setText("Productor:");

        jLabel15.setText("Formato:");

        buttonGroup3.add(rb_digital);
        rb_digital.setText("Digital");

        buttonGroup3.add(rb_cd);
        rb_cd.setText("CD");

        jLabel16.setText("Nombre:");

        jb_add_album.setText("Agregar");
        jb_add_album.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_add_albumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_crear_albumLayout = new javax.swing.GroupLayout(jd_crear_album.getContentPane());
        jd_crear_album.getContentPane().setLayout(jd_crear_albumLayout);
        jd_crear_albumLayout.setHorizontalGroup(
            jd_crear_albumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crear_albumLayout.createSequentialGroup()
                .addGroup(jd_crear_albumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jd_crear_albumLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jb_add_album, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_crear_albumLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jd_crear_albumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jd_crear_albumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_crear_albumLayout.createSequentialGroup()
                                .addComponent(rb_digital)
                                .addGap(18, 18, 18)
                                .addComponent(rb_cd))
                            .addComponent(tf_alb_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_alb_genero, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_alb_publicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_alb_productor, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jd_crear_albumLayout.setVerticalGroup(
            jd_crear_albumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crear_albumLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jd_crear_albumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(tf_alb_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crear_albumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tf_alb_publicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crear_albumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tf_alb_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crear_albumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tf_alb_productor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crear_albumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(rb_digital)
                    .addComponent(rb_cd))
                .addGap(30, 30, 30)
                .addComponent(jb_add_album)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        jl_albums.setModel(new DefaultListModel());
        jl_albums.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_albumsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jl_albums);

        jLabel17.setText("POPUP MENU, RIGHT CLICK");

        javax.swing.GroupLayout jd_listar_albumLayout = new javax.swing.GroupLayout(jd_listar_album.getContentPane());
        jd_listar_album.getContentPane().setLayout(jd_listar_albumLayout);
        jd_listar_albumLayout.setHorizontalGroup(
            jd_listar_albumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_listar_albumLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(jd_listar_albumLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(503, Short.MAX_VALUE))
        );
        jd_listar_albumLayout.setVerticalGroup(
            jd_listar_albumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_listar_albumLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel18.setText("Compositor:");

        Distribuidor.setText("Distribuidor:");

        jLabel20.setText("Productor:");

        jLabel21.setText("Exclusico de Spotify:");

        buttonGroup4.add(rb_si);
        rb_si.setText("Si");

        buttonGroup4.add(rb_no);
        rb_no.setText("No");

        jLabel22.setText("Nombre:");

        jb_add_cancion.setText("Agregar");
        jb_add_cancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_add_cancionActionPerformed(evt);
            }
        });

        jLabel19.setText("Invitado(Si Hay):");

        jLabel23.setText("Duracion(Segundos):");

        javax.swing.GroupLayout jd_crear_cancionLayout = new javax.swing.GroupLayout(jd_crear_cancion.getContentPane());
        jd_crear_cancion.getContentPane().setLayout(jd_crear_cancionLayout);
        jd_crear_cancionLayout.setHorizontalGroup(
            jd_crear_cancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crear_cancionLayout.createSequentialGroup()
                .addGroup(jd_crear_cancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jd_crear_cancionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jb_add_cancion, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_crear_cancionLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jd_crear_cancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel21)
                            .addComponent(jLabel20)
                            .addComponent(Distribuidor)
                            .addComponent(jLabel18)
                            .addComponent(jLabel22)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jd_crear_cancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jd_crear_cancionLayout.createSequentialGroup()
                                .addComponent(rb_si)
                                .addGap(18, 18, 18)
                                .addComponent(rb_no))
                            .addComponent(tf_cancion_nombre)
                            .addComponent(tf_cancion_dist)
                            .addComponent(tf_cancion_comp)
                            .addComponent(tf_cancion_pro)
                            .addComponent(tf_cancion_inv)
                            .addComponent(tf_cancion_duracion, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jd_crear_cancionLayout.setVerticalGroup(
            jd_crear_cancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crear_cancionLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jd_crear_cancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(tf_cancion_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crear_cancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(tf_cancion_comp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crear_cancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Distribuidor)
                    .addComponent(tf_cancion_dist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crear_cancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(tf_cancion_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crear_cancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(rb_si)
                    .addComponent(rb_no))
                .addGap(18, 18, 18)
                .addGroup(jd_crear_cancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(tf_cancion_inv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crear_cancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(tf_cancion_duracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jb_add_cancion)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jl_canciones.setModel(new DefaultListModel());
        jl_canciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_cancionesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jl_canciones);

        jLabel24.setText("POPUP MENU, RIGHT CLICK");

        javax.swing.GroupLayout jd_listar_cancionesLayout = new javax.swing.GroupLayout(jd_listar_canciones.getContentPane());
        jd_listar_canciones.getContentPane().setLayout(jd_listar_cancionesLayout);
        jd_listar_cancionesLayout.setHorizontalGroup(
            jd_listar_cancionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_listar_cancionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
            .addGroup(jd_listar_cancionesLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(503, Short.MAX_VALUE))
        );
        jd_listar_cancionesLayout.setVerticalGroup(
            jd_listar_cancionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_listar_cancionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel24)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        add_cancion.setText("Agregar Cancion");
        add_cancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_cancionActionPerformed(evt);
            }
        });
        popup_albums.add(add_cancion);

        listar_canciones.setText("Listar Canciones");
        listar_canciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listar_cancionesActionPerformed(evt);
            }
        });
        popup_albums.add(listar_canciones);

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        popup_canciones.add(eliminar);

        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        popup_canciones.add(modificar);

        reproducir.setText("Reproducir");
        popup_canciones.add(reproducir);

        jLabel25.setText("Invitado(Si Hay):");

        jLabel26.setText("Productor:");

        jLabel27.setText("Exclusico de Spotify:");

        jLabel28.setText("Duracion(Segundos):");

        buttonGroup5.add(rb_si1);
        rb_si1.setText("Si");

        buttonGroup5.add(rb_no1);
        rb_no1.setText("No");

        jLabel29.setText("Nombre:");

        jLabel30.setText("Compositor:");

        jb_mod_cancion.setText("Modificar");
        jb_mod_cancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_mod_cancionActionPerformed(evt);
            }
        });

        Distribuidor1.setText("Distribuidor:");

        javax.swing.GroupLayout jd_mod_cancionLayout = new javax.swing.GroupLayout(jd_mod_cancion.getContentPane());
        jd_mod_cancion.getContentPane().setLayout(jd_mod_cancionLayout);
        jd_mod_cancionLayout.setHorizontalGroup(
            jd_mod_cancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_mod_cancionLayout.createSequentialGroup()
                .addGroup(jd_mod_cancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jd_mod_cancionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jb_mod_cancion, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_mod_cancionLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jd_mod_cancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel28)
                            .addComponent(jLabel27)
                            .addComponent(jLabel26)
                            .addComponent(Distribuidor1)
                            .addComponent(jLabel30)
                            .addComponent(jLabel29)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jd_mod_cancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jd_mod_cancionLayout.createSequentialGroup()
                                .addComponent(rb_si1)
                                .addGap(18, 18, 18)
                                .addComponent(rb_no1))
                            .addComponent(tf_cancion_nombre1)
                            .addComponent(tf_cancion_dist1)
                            .addComponent(tf_cancion_comp1)
                            .addComponent(tf_cancion_pro1)
                            .addComponent(tf_cancion_inv1)
                            .addComponent(tf_cancion_duracion1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jd_mod_cancionLayout.setVerticalGroup(
            jd_mod_cancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_mod_cancionLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jd_mod_cancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(tf_cancion_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_mod_cancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(tf_cancion_comp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_mod_cancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Distribuidor1)
                    .addComponent(tf_cancion_dist1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_mod_cancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(tf_cancion_pro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_mod_cancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(rb_si1)
                    .addComponent(rb_no1))
                .addGap(18, 18, 18)
                .addGroup(jd_mod_cancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(tf_cancion_inv1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_mod_cancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(tf_cancion_duracion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jb_mod_cancion)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main");

        jb_crear_artista.setText("Crear Artista");
        jb_crear_artista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_crear_artistaActionPerformed(evt);
            }
        });

        jb_listar_artistas.setText("Listar Artistas");
        jb_listar_artistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_listar_artistasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jb_crear_artista, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addComponent(jb_listar_artistas, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_crear_artista, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_listar_artistas, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(201, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_add_artActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_add_artActionPerformed
        // TODO add your handling code here:
        try {
            String nombre = tf_art_nombre.getText();
            String genero = tf_art_genero.getText();
            String disquera = tf_art_disquera.getText();
            String alias = tf_art_alias.getText();
            String rol = "";
            if (rb_instrumental.isSelected()) {
                rol = "Instrumental";
            } else if (rb_voz.isSelected()) {
                rol = "Voz";
            }
            Artista x = new Artista(nombre, genero, disquera, alias, rol);
            administratArtistas ap = new administratArtistas("./artistas.cbm");
            ap.cargarArchivo();
            ap.setArtista(x);
            ap.escribirArchivo();
            tf_art_nombre.setText("");
            tf_art_genero.setText("");
            tf_art_disquera.setText("");
            tf_art_alias.setText("");
            jd_crear_artista.hide();
            JOptionPane.showMessageDialog(this, "SE AGREGO EXITOSAMENTE");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_jb_add_artActionPerformed

    private void jb_crear_artistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_crear_artistaActionPerformed
        // TODO add your handling code here:
        jd_crear_artista.setModal(true);
        jd_crear_artista.pack();
        jd_crear_artista.setLocationRelativeTo(this);
        jd_crear_artista.setVisible(true);
    }//GEN-LAST:event_jb_crear_artistaActionPerformed

    private void jb_listar_artistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_listar_artistasActionPerformed
        // TODO add your handling code here:
        DefaultListModel modelo = (DefaultListModel) jl_artistas.getModel();
        modelo.removeAllElements();
        administratArtistas ap = new administratArtistas("./artistas.cbm");
        ap.cargarArchivo();
        for (int i = 0; i < ap.getListaArtistas().size(); i++) {
            modelo.addElement(ap.getListaArtistas().get(i));
        }
        jl_artistas.setModel(modelo);
        jd_listar_artista.setModal(true);
        jd_listar_artista.pack();
        jd_listar_artista.setLocationRelativeTo(this);
        jd_listar_artista.setVisible(true);
    }//GEN-LAST:event_jb_listar_artistasActionPerformed

    private void jl_artistasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_artistasMouseClicked
        // TODO add your handling code here:
        if (evt.isMetaDown()) {
            if (jl_artistas.getSelectedIndex() >= 0) {
                poArt = jl_artistas.getSelectedIndex();
                popup_artistas.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jl_artistasMouseClicked

    private void eliminar_artActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_artActionPerformed
        // TODO add your handling code here:
        try {
            int po = jl_artistas.getSelectedIndex();
            DefaultListModel modelo = (DefaultListModel) jl_artistas.getModel();
            modelo.remove(po);
            jl_artistas.setModel(modelo);
            administratArtistas ap = new administratArtistas("./artistas.cbm");
            ap.cargarArchivo();
            ap.getListaArtistas().remove(po);
            ap.escribirArchivo();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_eliminar_artActionPerformed

    private void modificar_artActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_artActionPerformed
        // TODO add your handling code here:
        try {
            int po = jl_artistas.getSelectedIndex();
            administratArtistas ap = new administratArtistas("./artistas.cbm");
            ap.cargarArchivo();
            Artista x = ap.getListaArtistas().get(po);
            tf_art_nombre1.setText(x.getNombre());
            tf_art_genero1.setText(x.getGenero());
            tf_art_disquera1.setText(x.getDisquera());
            tf_art_alias1.setText(x.getAlias());
            if (x.getRol().equals("Instrumental")) {
                rb_instrumental1.setSelected(true);
            } else if (x.getRol().equals("Voz")) {
                rb_voz1.setSelected(true);
            }
            jd_mod_artista.setModal(true);
            jd_mod_artista.pack();
            jd_mod_artista.setLocationRelativeTo(this);
            jd_mod_artista.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_modificar_artActionPerformed

    private void jb_mod_artActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_mod_artActionPerformed
        // TODO add your handling code here:
        try {
            int po = jl_artistas.getSelectedIndex();
            administratArtistas ap = new administratArtistas("./artistas.cbm");
            ap.cargarArchivo();
            String nombre = tf_art_nombre1.getText();
            String genero = tf_art_genero1.getText();
            String disquera = tf_art_disquera1.getText();
            String alias = tf_art_alias1.getText();
            String rol = "";
            if (rb_instrumental1.isSelected()) {
                rol = "Instrumental";
            } else if (rb_voz1.isSelected()) {
                rol = "Voz";
            }
            ap.getListaArtistas().get(po).setAlias(alias);
            ap.getListaArtistas().get(po).setDisquera(disquera);
            ap.getListaArtistas().get(po).setGenero(genero);
            ap.getListaArtistas().get(po).setNombre(nombre);
            ap.getListaArtistas().get(po).setRol(rol);
            ap.escribirArchivo();
            DefaultListModel modelo = (DefaultListModel) jl_artistas.getModel();
            modelo.set(po, ap.getListaArtistas().get(po));
            jl_artistas.setModel(modelo);
            jd_mod_artista.hide();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_jb_mod_artActionPerformed

    private void jb_add_albumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_add_albumActionPerformed
        // TODO add your handling code here:
        try {
            String nombre = tf_alb_nombre.getText();
            String publicacion = tf_alb_publicacion.getText();
            String genero = tf_alb_genero.getText();
            String productor = tf_alb_productor.getText();
            String formato = "";
            if (rb_cd.isSelected()) {
                formato = "CD";
            } else if (rb_digital.isSelected()) {
                formato = "Digital";
            }
            Album x = new Album(nombre, publicacion, genero, formato, productor);
            administratArtistas ap = new administratArtistas("./artistas.cbm");
            ap.cargarArchivo();
            ap.getListaArtistas().get(poArt).getAlbumes().add(x);
            ap.escribirArchivo();
            tf_alb_nombre.setText("");
            tf_alb_publicacion.setText("");
            tf_alb_genero.setText("");
            tf_alb_productor.setText("");
            jd_crear_album.hide();
            JOptionPane.showMessageDialog(this, "SE AGREGO EXITOSAMENTE");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_jb_add_albumActionPerformed

    private void jl_albumsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_albumsMouseClicked
        // TODO add your handling code here:
        if (evt.isMetaDown()) {
            if (jl_albums.getSelectedIndex() >= 0) {
                poAlb = jl_albums.getSelectedIndex();
                popup_albums.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jl_albumsMouseClicked

    private void add_playlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_playlistActionPerformed
        // TODO add your handling code here:
        jd_crear_album.setModal(true);
        jd_crear_album.pack();
        jd_crear_album.setLocationRelativeTo(this);
        jd_crear_album.setVisible(true);
    }//GEN-LAST:event_add_playlistActionPerformed

    private void ver_playlistsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ver_playlistsActionPerformed
        // TODO add your handling code here:
        DefaultListModel modelo = (DefaultListModel) jl_albums.getModel();
        modelo.removeAllElements();
        administratArtistas ap = new administratArtistas("./artistas.cbm");
        ap.cargarArchivo();
        for (int i = 0; i < ap.getListaArtistas().get(poArt).getAlbumes().size(); i++) {
            modelo.addElement(ap.getListaArtistas().get(poArt).getAlbumes().get(i));
        }
        jl_albums.setModel(modelo);        
        jd_listar_album.setModal(true);
        jd_listar_album.pack();
        jd_listar_album.setLocationRelativeTo(this);
        jd_listar_album.setVisible(true);
    }//GEN-LAST:event_ver_playlistsActionPerformed

    private void jb_add_cancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_add_cancionActionPerformed
        // TODO add your handling code here:
        try {
            String nombre = tf_cancion_nombre.getText();
            String compositor = tf_cancion_comp.getText();
            String distribuidor = tf_cancion_dist.getText();
            String productor = tf_cancion_pro.getText();
            String invitado = tf_cancion_inv.getText();
            int duracion = Integer.parseInt(tf_cancion_duracion.getText());
            boolean exclusivo = true;
            if (rb_si.isSelected()) {
                exclusivo = true;
            } else if (rb_no.isSelected()) {
                exclusivo = false;
            }
            Cancion x = new Cancion(nombre, compositor, distribuidor, productor, invitado, exclusivo, duracion);
            administratArtistas ap = new administratArtistas("./artistas.cbm");
            ap.cargarArchivo();
            ap.getListaArtistas().get(poArt).getAlbumes().get(poAlb).getCanciones().add(x);
            ap.escribirArchivo();
            tf_cancion_nombre.setText("");
            tf_cancion_comp.setText("");
            tf_cancion_dist.setText("");
            tf_cancion_pro.setText("");
            tf_cancion_inv.setText("");
            tf_cancion_duracion.setText("");
            jd_crear_cancion.hide();
            JOptionPane.showMessageDialog(this, "SE AGREGO EXITOSAMENTE");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_jb_add_cancionActionPerformed

    private void add_cancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_cancionActionPerformed
        // TODO add your handling code here:
        jd_crear_cancion.setModal(true);
        jd_crear_cancion.pack();
        jd_crear_cancion.setLocationRelativeTo(this);
        jd_crear_cancion.setVisible(true);
    }//GEN-LAST:event_add_cancionActionPerformed

    private void listar_cancionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listar_cancionesActionPerformed
        // TODO add your handling code here:
        DefaultListModel modelo = (DefaultListModel) jl_canciones.getModel();
        modelo.removeAllElements();
        administratArtistas ap = new administratArtistas("./artistas.cbm");
        ap.cargarArchivo();
        for (int i = 0; i < ap.getListaArtistas().get(poArt).getAlbumes().get(poAlb).getCanciones().size(); i++) {
            modelo.addElement(ap.getListaArtistas().get(poArt).getAlbumes().get(poAlb).getCanciones().get(i));
        }
        jl_canciones.setModel(modelo);        
        jd_listar_canciones.setModal(true);
        jd_listar_canciones.pack();
        jd_listar_canciones.setLocationRelativeTo(this);
        jd_listar_canciones.setVisible(true);
    }//GEN-LAST:event_listar_cancionesActionPerformed

    private void jl_cancionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_cancionesMouseClicked
        // TODO add your handling code here:
        if (evt.isMetaDown()) {
            if (jl_canciones.getSelectedIndex() >= 0) {
                popup_canciones.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jl_cancionesMouseClicked

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
        try {
            int po = jl_canciones.getSelectedIndex();
            DefaultListModel modelo = (DefaultListModel) jl_canciones.getModel();
            modelo.remove(po);
            jl_canciones.setModel(modelo);
            administratArtistas ap = new administratArtistas("./artistas.cbm");
            ap.cargarArchivo();
            ap.getListaArtistas().get(poArt).getAlbumes().get(poAlb).getCanciones().remove(po);
            ap.escribirArchivo();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        // TODO add your handling code here:
        try {
            int po = jl_canciones.getSelectedIndex();
            administratArtistas ap = new administratArtistas("./artistas.cbm");
            ap.cargarArchivo();
            Cancion x = ap.getListaArtistas().get(poArt).getAlbumes().get(poAlb).getCanciones().get(po);
            tf_cancion_nombre1.setText(x.getNombre());
            tf_cancion_comp1.setText(x.getCompositor());
            tf_cancion_dist1.setText(x.getDistribuidor());
            tf_cancion_pro1.setText(x.getProductor());
            tf_cancion_inv1.setText(x.getInvitado());
            tf_cancion_duracion1.setText(String.valueOf(x.getDuracion()));
            if (x.isExclusivo() == true) {
                rb_si1.setSelected(true);
            } else if (x.isExclusivo() == false) {
                rb_no1.setSelected(true);
            }
            
            jd_mod_cancion.setModal(true);
            jd_mod_cancion.pack();
            jd_mod_cancion.setLocationRelativeTo(this);
            jd_mod_cancion.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_modificarActionPerformed

    private void jb_mod_cancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_mod_cancionActionPerformed
        // TODO add your handling code here:
        try {
            int po = jl_canciones.getSelectedIndex();
            administratArtistas ap = new administratArtistas("./artistas.cbm");
            ap.cargarArchivo();
            String nombre = tf_cancion_nombre1.getText();
            String compositor = tf_cancion_comp1.getText();
            String distribuidor = tf_cancion_dist1.getText();
            String productor = tf_cancion_pro1.getText();
            String invitado = tf_cancion_inv1.getText();
            int duracion = Integer.parseInt(tf_cancion_duracion1.getText());
            boolean exclusivo = true;
            if (rb_si1.isSelected()) {
                exclusivo = true;
            } else if (rb_no1.isSelected()) {
                exclusivo = false;
            }
            ap.getListaArtistas().get(poArt).getAlbumes().get(poAlb).getCanciones().get(po).setCompositor(compositor);
            ap.getListaArtistas().get(poArt).getAlbumes().get(poAlb).getCanciones().get(po).setDistribuidor(distribuidor);
            ap.getListaArtistas().get(poArt).getAlbumes().get(poAlb).getCanciones().get(po).setDuracion(duracion);
            ap.getListaArtistas().get(poArt).getAlbumes().get(poAlb).getCanciones().get(po).setExclusivo(exclusivo);
            ap.getListaArtistas().get(poArt).getAlbumes().get(poAlb).getCanciones().get(po).setInvitado(invitado);
            ap.getListaArtistas().get(poArt).getAlbumes().get(poAlb).getCanciones().get(po).setNombre(nombre);
            ap.getListaArtistas().get(poArt).getAlbumes().get(poAlb).getCanciones().get(po).setProductor(productor);
            ap.escribirArchivo();
            DefaultListModel modelo = (DefaultListModel) jl_canciones.getModel();
            modelo.set(po, ap.getListaArtistas().get(poArt).getAlbumes().get(poAlb).getCanciones().get(po));
            jl_canciones.setModel(modelo);
            jd_mod_cancion.hide();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_jb_mod_cancionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Distribuidor;
    private javax.swing.JLabel Distribuidor1;
    private javax.swing.JMenuItem add_cancion;
    private javax.swing.JMenuItem add_playlist;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JMenuItem eliminar;
    private javax.swing.JMenuItem eliminar_art;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jb_add_album;
    private javax.swing.JButton jb_add_art;
    private javax.swing.JButton jb_add_cancion;
    private javax.swing.JButton jb_crear_artista;
    private javax.swing.JButton jb_listar_artistas;
    private javax.swing.JButton jb_mod_art;
    private javax.swing.JButton jb_mod_cancion;
    private javax.swing.JDialog jd_crear_album;
    private javax.swing.JDialog jd_crear_artista;
    private javax.swing.JDialog jd_crear_cancion;
    private javax.swing.JDialog jd_listar_album;
    private javax.swing.JDialog jd_listar_artista;
    private javax.swing.JDialog jd_listar_canciones;
    private javax.swing.JDialog jd_mod_artista;
    private javax.swing.JDialog jd_mod_cancion;
    private javax.swing.JList<String> jl_albums;
    private javax.swing.JList<String> jl_artistas;
    private javax.swing.JList<String> jl_canciones;
    private javax.swing.JMenuItem listar_canciones;
    private javax.swing.JMenuItem modificar;
    private javax.swing.JMenuItem modificar_art;
    private javax.swing.JPopupMenu popup_albums;
    private javax.swing.JPopupMenu popup_artistas;
    private javax.swing.JPopupMenu popup_canciones;
    private javax.swing.JRadioButton rb_cd;
    private javax.swing.JRadioButton rb_digital;
    private javax.swing.JRadioButton rb_instrumental;
    private javax.swing.JRadioButton rb_instrumental1;
    private javax.swing.JRadioButton rb_no;
    private javax.swing.JRadioButton rb_no1;
    private javax.swing.JRadioButton rb_si;
    private javax.swing.JRadioButton rb_si1;
    private javax.swing.JRadioButton rb_voz;
    private javax.swing.JRadioButton rb_voz1;
    private javax.swing.JMenuItem reproducir;
    private javax.swing.JTextField tf_alb_genero;
    private javax.swing.JTextField tf_alb_nombre;
    private javax.swing.JTextField tf_alb_productor;
    private javax.swing.JTextField tf_alb_publicacion;
    private javax.swing.JTextField tf_art_alias;
    private javax.swing.JTextField tf_art_alias1;
    private javax.swing.JTextField tf_art_disquera;
    private javax.swing.JTextField tf_art_disquera1;
    private javax.swing.JTextField tf_art_genero;
    private javax.swing.JTextField tf_art_genero1;
    private javax.swing.JTextField tf_art_nombre;
    private javax.swing.JTextField tf_art_nombre1;
    private javax.swing.JTextField tf_cancion_comp;
    private javax.swing.JTextField tf_cancion_comp1;
    private javax.swing.JTextField tf_cancion_dist;
    private javax.swing.JTextField tf_cancion_dist1;
    private javax.swing.JTextField tf_cancion_duracion;
    private javax.swing.JTextField tf_cancion_duracion1;
    private javax.swing.JTextField tf_cancion_inv;
    private javax.swing.JTextField tf_cancion_inv1;
    private javax.swing.JTextField tf_cancion_nombre;
    private javax.swing.JTextField tf_cancion_nombre1;
    private javax.swing.JTextField tf_cancion_pro;
    private javax.swing.JTextField tf_cancion_pro1;
    private javax.swing.JMenuItem ver_playlists;
    // End of variables declaration//GEN-END:variables
    int poArt;
    int poAlb;
}
