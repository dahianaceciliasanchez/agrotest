/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agro;

import Modelo.usuarios;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Dahiana Sanchez G
 */
public class Menu extends javax.swing.JFrame {

    Conexion conn = new Conexion();
    Calendar fechaactual = new GregorianCalendar();
    //  Acceso mod;
    usuarios mod;

    public Menu() {
        initComponents();
        fecha.setText(fecha());

    }

    public Menu(usuarios mod) {
        initComponents();
        setLocationRelativeTo(null);
        this.mod = mod;

        lblnombre.setText(mod.getNombre());
        lblRol.setText(mod.getNombre_tipo());

        if (mod.getIdtipo() == 1) {
            menureferenciales.setVisible(true);
            menucompra.setEnabled(true);
            menuia.setEnabled(true);
            menuservicios.setEnabled(true);
            menureportes.setEnabled(true);
            
        } else if (mod.getIdtipo() == 2) {
            subplanificacionia.setEnabled(false);
            subregistroia.setEnabled(false);
            subajustestockia.setEnabled(false);
            subsolicitudia.setEnabled(false);
            menureferenciales.setEnabled(false);
            menucompra.setEnabled(true);
            subajustep.setEnabled(false);
            subcredito.setEnabled(false);
            subdebito.setEnabled(false);
            subfactura.setEnabled(false);
            subpresupuesto.setEnabled(false);
            subordencompra.setEnabled(false);
            subfiscalizacion.setEnabled(false);
            subpreñes.setEnabled(true);
            subpedido.setEnabled(false);
            subsuplementos.setEnabled(false);
            reporteIA.setEnabled(false);
            reporteC.setEnabled(false);
            reporteSV.setEnabled(false);
            subprotocoloia.setEnabled(true);
            subregistroa.setEnabled(false);
            subetapas.setEnabled(false);
            subtarjeta.setEnabled(false);
            subremision.setEnabled(false);
            subengorde.setEnabled(false);

        } else if (mod.getIdtipo() == 3) {

            subplanificacionia.setEnabled(true);
            subregistroia.setEnabled(true);
            subajustestockia.setEnabled(true);
            subsolicitudia.setEnabled(true);
            menureferenciales.setEnabled(false);
            menucompra.setEnabled(true);
            subajustep.setEnabled(false);
            subcredito.setEnabled(false);
            subdebito.setEnabled(false);
            subfactura.setEnabled(false);
            subpresupuesto.setEnabled(false);
            subordencompra.setEnabled(false);
            subfiscalizacion.setEnabled(false);
            subpreñes.setEnabled(false);
            subpedido.setEnabled(false);
            subsuplementos.setEnabled(false);
            reporteIA.setEnabled(true);
            reporteC.setEnabled(false);
            reporteSV.setEnabled(false);
            subprotocoloia.setEnabled(false);
            subregistroa.setEnabled(false);
            subetapas.setEnabled(false);
            subtarjeta.setEnabled(false);
            subremision.setEnabled(false);
            subengorde.setEnabled(false);
            
        } else if (mod.getIdtipo() == 4) {
            menuservicios.setEnabled(false);
            subplanificacionia.setEnabled(false);
            subregistroia.setEnabled(false);
            subajustestockia.setEnabled(false);
            subsolicitudia.setEnabled(false);
            menureferenciales.setEnabled(false);
            menucompra.setEnabled(false);
        } else if (mod.getIdtipo() == 5) {
            menuservicios.setEnabled(false);
            subplanificacionia.setEnabled(false);
            subregistroia.setEnabled(false);
            subajustestockia.setEnabled(false);
            subsolicitudia.setEnabled(false);
            menureferenciales.setEnabled(false);
            menucompra.setEnabled(false);
        } else if (mod.getIdtipo() == 6) {
            menuservicios.setEnabled(false);
            subplanificacionia.setEnabled(false);
            subregistroia.setEnabled(false);
            subajustestockia.setEnabled(false);
            subsolicitudia.setEnabled(false);
            menureferenciales.setEnabled(false);
            menucompra.setEnabled(false);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        lblRol = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menureferenciales = new javax.swing.JMenu();
        subComprador = new javax.swing.JMenu();
        Personal = new javax.swing.JMenu();
        Cargo = new javax.swing.JMenu();
        Ciudad = new javax.swing.JMenu();
        Vitaminas = new javax.swing.JMenu();
        Razas = new javax.swing.JMenu();
        jMenu22 = new javax.swing.JMenu();
        Alimentacion = new javax.swing.JMenu();
        Veterinario = new javax.swing.JMenu();
        Frigorifico = new javax.swing.JMenu();
        Animal = new javax.swing.JMenu();
        Vacunas = new javax.swing.JMenu();
        jMenu37 = new javax.swing.JMenu();
        jMenu38 = new javax.swing.JMenu();
        jMenu39 = new javax.swing.JMenu();
        jMenu40 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        menuia = new javax.swing.JMenu();
        subplanificacionia = new javax.swing.JMenu();
        subprotocoloia = new javax.swing.JMenu();
        subsolicitudia = new javax.swing.JMenu();
        subregistroia = new javax.swing.JMenu();
        subajustestockia = new javax.swing.JMenu();
        subpreñes = new javax.swing.JMenu();
        menuservicios = new javax.swing.JMenu();
        subregistroa = new javax.swing.JMenu();
        subsuplementos = new javax.swing.JMenu();
        subengorde = new javax.swing.JMenu();
        subetapas = new javax.swing.JMenu();
        subfiscalizacion = new javax.swing.JMenu();
        subtarjeta = new javax.swing.JMenu();
        menucompra = new javax.swing.JMenu();
        subpedido = new javax.swing.JMenu();
        subpresupuesto = new javax.swing.JMenu();
        subordencompra = new javax.swing.JMenu();
        subfactura = new javax.swing.JMenu();
        subcredito = new javax.swing.JMenu();
        subdebito = new javax.swing.JMenu();
        subremision = new javax.swing.JMenu();
        subajustep = new javax.swing.JMenu();
        menureportes = new javax.swing.JMenu();
        reporteIA = new javax.swing.JMenu();
        jMenu15 = new javax.swing.JMenu();
        jMenu16 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        reporteSV = new javax.swing.JMenu();
        jMenu17 = new javax.swing.JMenu();
        jMenu23 = new javax.swing.JMenu();
        jMenu18 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu21 = new javax.swing.JMenu();
        jMenu24 = new javax.swing.JMenu();
        jMenu27 = new javax.swing.JMenu();
        reporteC = new javax.swing.JMenu();
        jMenu19 = new javax.swing.JMenu();
        jMenu28 = new javax.swing.JMenu();
        jMenu30 = new javax.swing.JMenu();
        jMenu20 = new javax.swing.JMenu();
        jMenu31 = new javax.swing.JMenu();
        jMenu32 = new javax.swing.JMenu();
        jMenu33 = new javax.swing.JMenu();
        jMenu34 = new javax.swing.JMenu();
        jMenu36 = new javax.swing.JMenu();
        jMenu35 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(235, 230, 231));

        lbl.setFont(new java.awt.Font("Bodoni MT Black", 0, 36)); // NOI18N
        lbl.setForeground(new java.awt.Color(102, 102, 102));
        lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl.setText("BIENVENIDO ");

        fecha.setBackground(new java.awt.Color(255, 255, 255));
        fecha.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        fecha.setForeground(new java.awt.Color(51, 51, 51));
        fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fecha.setText("dd/MM/yyyy");

        lblnombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblnombre.setText("Usuario");

        lblRol.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRol.setText("Rol");

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\dahia\\OneDrive\\Documents\\NetBeansProjects\\Agro\\Imagenes\\image.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(204, 204, 204))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblnombre)
                        .addGap(32, 32, 32)
                        .addComponent(lblRol, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1)
                        .addGap(46, 46, 46)
                        .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(212, 212, 212)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblnombre)
                            .addComponent(lblRol)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(736, 736, 736)
                        .addComponent(jLabel7)))
                .addGap(794, 794, 794))
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));
        jMenuBar1.setBorder(null);
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        menureferenciales.setText("REFERENCIALES");
        menureferenciales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menureferencialesMousePressed(evt);
            }
        });

        subComprador.setText("PROVEEDORES");
        subComprador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                subCompradorMousePressed(evt);
            }
        });
        menureferenciales.add(subComprador);

        Personal.setText("EMPLEADOS");
        Personal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PersonalMousePressed(evt);
            }
        });
        menureferenciales.add(Personal);

        Cargo.setText("PRODUCTOS");
        Cargo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CargoMousePressed(evt);
            }
        });
        menureferenciales.add(Cargo);

        Ciudad.setText("CIUDAD");
        Ciudad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CiudadMousePressed(evt);
            }
        });
        menureferenciales.add(Ciudad);

        Vitaminas.setText("CATEGORIAS");
        Vitaminas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VitaminasMousePressed(evt);
            }
        });
        menureferenciales.add(Vitaminas);

        Razas.setText("VACUNAS");
        Razas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RazasMousePressed(evt);
            }
        });
        menureferenciales.add(Razas);

        jMenu22.setText("RAZAS");
        jMenu22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu22MousePressed(evt);
            }
        });
        menureferenciales.add(jMenu22);

        Alimentacion.setText("METODO IA");
        Alimentacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AlimentacionMousePressed(evt);
            }
        });
        menureferenciales.add(Alimentacion);

        Veterinario.setText("MOTIVO AJUSTE");
        Veterinario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VeterinarioMousePressed(evt);
            }
        });
        menureferenciales.add(Veterinario);

        Frigorifico.setText("CARGO");
        menureferenciales.add(Frigorifico);

        Animal.setText("TIMBRADO");
        Animal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AnimalMousePressed(evt);
            }
        });
        menureferenciales.add(Animal);

        Vacunas.setText("DIA_REACTIVO");
        Vacunas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VacunasMousePressed(evt);
            }
        });
        menureferenciales.add(Vacunas);

        jMenu37.setText("MARCA");
        menureferenciales.add(jMenu37);

        jMenu38.setText("ETAPA_VACUNACION");
        menureferenciales.add(jMenu38);

        jMenu39.setText("RESULTADO_PREÑES");
        menureferenciales.add(jMenu39);

        jMenu40.setText("TIPO_VACUNA");
        menureferenciales.add(jMenu40);

        jMenuBar1.add(menureferenciales);
        jMenuBar1.add(jMenu3);

        menuia.setText("INSEMINACION ARTIFICIAL");

        subplanificacionia.setText("PLANIFICACION IA");
        subplanificacionia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                subplanificacioniaMousePressed(evt);
            }
        });
        menuia.add(subplanificacionia);

        subprotocoloia.setText("PROTOCOLOS IA");
        subprotocoloia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                subprotocoloiaMousePressed(evt);
            }
        });
        menuia.add(subprotocoloia);

        subsolicitudia.setText("SOLICITUD DE IA");
        subsolicitudia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                subsolicitudiaMousePressed(evt);
            }
        });
        menuia.add(subsolicitudia);

        subregistroia.setText("REGISTRO IA");
        subregistroia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                subregistroiaMousePressed(evt);
            }
        });
        menuia.add(subregistroia);

        subajustestockia.setText("AJUSTE DE STOCK");
        subajustestockia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                subajustestockiaMousePressed(evt);
            }
        });
        menuia.add(subajustestockia);

        subpreñes.setText("PREÑES");
        subpreñes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                subpreñesMousePressed(evt);
            }
        });
        menuia.add(subpreñes);

        jMenuBar1.add(menuia);

        menuservicios.setText("SERVICIOS VETERINARIOS");

        subregistroa.setText("REGISTRO ANIMAL");
        subregistroa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                subregistroaMousePressed(evt);
            }
        });
        menuservicios.add(subregistroa);

        subsuplementos.setText("SUPLEMENTOS");
        subsuplementos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                subsuplementosMousePressed(evt);
            }
        });
        menuservicios.add(subsuplementos);

        subengorde.setText("PLAN DE ENGORDE");
        subengorde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                subengordeMousePressed(evt);
            }
        });
        menuservicios.add(subengorde);

        subetapas.setText("PLAN Y ETAPAS DE VACUNACION");
        subetapas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                subetapasMousePressed(evt);
            }
        });
        menuservicios.add(subetapas);

        subfiscalizacion.setText("FISCALIZACION");
        subfiscalizacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                subfiscalizacionMousePressed(evt);
            }
        });
        menuservicios.add(subfiscalizacion);

        subtarjeta.setText("TARJETA VACUNACION");
        subtarjeta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                subtarjetaMousePressed(evt);
            }
        });
        menuservicios.add(subtarjeta);

        jMenuBar1.add(menuservicios);

        menucompra.setText("COMPRAS");

        subpedido.setText("PEDIDOS");
        subpedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                subpedidoMousePressed(evt);
            }
        });
        menucompra.add(subpedido);

        subpresupuesto.setText("PRESUPUESTO");
        subpresupuesto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                subpresupuestoMousePressed(evt);
            }
        });
        menucompra.add(subpresupuesto);

        subordencompra.setText("ORDEN DE COMPRA");
        subordencompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                subordencompraMousePressed(evt);
            }
        });
        menucompra.add(subordencompra);

        subfactura.setText("FACTURA");
        subfactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                subfacturaMousePressed(evt);
            }
        });
        menucompra.add(subfactura);

        subcredito.setText("NOTA CREDITO");
        subcredito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                subcreditoMousePressed(evt);
            }
        });
        menucompra.add(subcredito);

        subdebito.setText("NOTA DEBITO");
        subdebito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                subdebitoMousePressed(evt);
            }
        });
        menucompra.add(subdebito);

        subremision.setText("NOTA REMISION");
        subremision.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                subremisionMousePressed(evt);
            }
        });
        menucompra.add(subremision);

        subajustep.setText("AJUSTE DE PRODUCTOS");
        subajustep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                subajustepMousePressed(evt);
            }
        });
        menucompra.add(subajustep);

        jMenuBar1.add(menucompra);

        menureportes.setText("REPORTES");

        reporteIA.setText("INSEMINACION ARTIFICIAL");
        reporteIA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                reporteIAMousePressed(evt);
            }
        });

        jMenu15.setText("PLANIFICACION IA");
        reporteIA.add(jMenu15);

        jMenu16.setText("PROTOCOLO IA");
        reporteIA.add(jMenu16);

        jMenu2.setText("SOLICITUD IA");
        reporteIA.add(jMenu2);

        jMenu4.setText("REGISTRO IA");
        reporteIA.add(jMenu4);

        jMenu5.setText("AJUSTE DE STOCK SEMEN");
        reporteIA.add(jMenu5);

        jMenu6.setText("PREÑES");
        reporteIA.add(jMenu6);

        menureportes.add(reporteIA);

        reporteSV.setText("SERVICIOS VETERINARIOS");

        jMenu17.setText("REGISTRO ANIMAL");
        reporteSV.add(jMenu17);

        jMenu23.setText("SOLICTUD DE TRABAJO");
        reporteSV.add(jMenu23);

        jMenu18.setText("SUPLEMENTOS");
        reporteSV.add(jMenu18);

        jMenu7.setText("PLAN DE ENGORDE");
        reporteSV.add(jMenu7);

        jMenu21.setText("PLAN DE VACUNACION");
        reporteSV.add(jMenu21);

        jMenu24.setText("REGISTRO FISCALIZACION");
        reporteSV.add(jMenu24);

        jMenu27.setText("TARJETA VACUNACION");
        reporteSV.add(jMenu27);

        menureportes.add(reporteSV);

        reporteC.setText("COMPRAS");

        jMenu19.setText("PEDIDOS");

        jMenu28.setText("jMenu28");

        jMenu30.setText("jMenu30");
        jMenu28.add(jMenu30);

        jMenu19.add(jMenu28);

        reporteC.add(jMenu19);

        jMenu20.setText("PRESUPUESTO PROVEEDOR");
        reporteC.add(jMenu20);

        jMenu31.setText("ORDEN DE COMPRA");
        reporteC.add(jMenu31);

        jMenu32.setText("FACTURA PROVEEDOR");
        reporteC.add(jMenu32);

        jMenu33.setText("NOTA CREDITO");
        reporteC.add(jMenu33);

        jMenu34.setText("NOTA DEBITO");
        reporteC.add(jMenu34);

        jMenu36.setText("NOTA REMISION");
        reporteC.add(jMenu36);

        jMenu35.setText("AJUSTE DE PRODUCTOS");
        reporteC.add(jMenu35);

        menureportes.add(reporteC);

        jMenuBar1.add(menureportes);

        jMenu9.setText("AYUDA");

        jMenu12.setText("INGRESAR");
        jMenu12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu12MousePressed(evt);
            }
        });
        jMenu12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenu12KeyPressed(evt);
            }
        });
        jMenu9.add(jMenu12);

        jMenuBar1.add(jMenu9);

        jMenu8.setText("SALIR");
        jMenu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu8MousePressed(evt);
            }
        });
        jMenu8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu8ActionPerformed(evt);
            }
        });
        jMenu8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenu8KeyPressed(evt);
            }
        });
        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menureferencialesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menureferencialesMousePressed

    }//GEN-LAST:event_menureferencialesMousePressed

    private void jMenu8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu8ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenu8ActionPerformed

    private void subCompradorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subCompradorMousePressed
        new Proveedores().setVisible(true);
    }//GEN-LAST:event_subCompradorMousePressed

    private void jMenu8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenu8KeyPressed
        dispose();
    }//GEN-LAST:event_jMenu8KeyPressed

    private void jMenu8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu8MousePressed
        dispose();
    }//GEN-LAST:event_jMenu8MousePressed

    private void PersonalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PersonalMousePressed
        new Personales().setVisible(true);
    }//GEN-LAST:event_PersonalMousePressed

    private void CargoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargoMousePressed
        new Cargo().setVisible(true);
    }//GEN-LAST:event_CargoMousePressed

    private void subplanificacioniaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subplanificacioniaMousePressed
        new PlanificacionIA().setVisible(true);
    }//GEN-LAST:event_subplanificacioniaMousePressed

    private void subprotocoloiaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subprotocoloiaMousePressed
        new ProtocolosIA().setVisible(true);
    }//GEN-LAST:event_subprotocoloiaMousePressed

    private void reporteIAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteIAMousePressed

    }//GEN-LAST:event_reporteIAMousePressed

    private void VitaminasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VitaminasMousePressed
        new Vitaminas().setVisible(true);
    }//GEN-LAST:event_VitaminasMousePressed

    private void RazasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RazasMousePressed
        new Categorias().setVisible(true);
    }//GEN-LAST:event_RazasMousePressed

    private void jMenu22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu22MousePressed
//       new Proveedor().setVisible(true);
    }//GEN-LAST:event_jMenu22MousePressed

    private void AlimentacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlimentacionMousePressed
        new Suplementos().setVisible(true);
    }//GEN-LAST:event_AlimentacionMousePressed

    private void VeterinarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VeterinarioMousePressed
        new Veterinarios().setVisible(true);
    }//GEN-LAST:event_VeterinarioMousePressed

    private void AnimalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnimalMousePressed
        new RegistroAnimal().setVisible(true);
    }//GEN-LAST:event_AnimalMousePressed

    private void VacunasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VacunasMousePressed

    }//GEN-LAST:event_VacunasMousePressed

    private void subregistroiaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subregistroiaMousePressed
        new RegistroIA().setVisible(true);
    }//GEN-LAST:event_subregistroiaMousePressed

    private void subpedidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpedidoMousePressed
        new PedidosCompra().setVisible(true);
    }//GEN-LAST:event_subpedidoMousePressed

    private void subpresupuestoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpresupuestoMousePressed
        new PresupuestoProveedor().setVisible(true);
    }//GEN-LAST:event_subpresupuestoMousePressed

    private void subordencompraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subordencompraMousePressed
        new OrdenCompra().setVisible(true);
    }//GEN-LAST:event_subordencompraMousePressed

    private void subregistroaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subregistroaMousePressed
        new RegistroAnimal().setVisible(true);
    }//GEN-LAST:event_subregistroaMousePressed

    private void subsuplementosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subsuplementosMousePressed
        new Suplementos().setVisible(true);
    }//GEN-LAST:event_subsuplementosMousePressed

    private void subengordeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subengordeMousePressed
        new PLandeEngorde().setVisible(true);
    }//GEN-LAST:event_subengordeMousePressed

    private void CiudadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CiudadMousePressed
        new Ciudades().setVisible(true);
    }//GEN-LAST:event_CiudadMousePressed

    private void jMenu12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenu12KeyPressed

    }//GEN-LAST:event_jMenu12KeyPressed

    private void jMenu12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu12MousePressed
        abrirarchivo("C:\\Users\\dahia\\OneDrive\\Documents\\NetBeansProjects\\Agro\\src\\usuario.pdf");
    }//GEN-LAST:event_jMenu12MousePressed

    private void subetapasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subetapasMousePressed
        new PlanVacunacion().setVisible(true);
    }//GEN-LAST:event_subetapasMousePressed

    private void subfiscalizacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subfiscalizacionMousePressed
//        new RegistroFiscalizacion().setVisible(true);
    }//GEN-LAST:event_subfiscalizacionMousePressed

    private void subtarjetaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subtarjetaMousePressed
        new TarjetadeVacunacion().setVisible(true);
    }//GEN-LAST:event_subtarjetaMousePressed

    private void subsolicitudiaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subsolicitudiaMousePressed
        new SolictudIA().setVisible(true);
    }//GEN-LAST:event_subsolicitudiaMousePressed

    private void subajustestockiaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subajustestockiaMousePressed
        new AjustedeStockdeSemen().setVisible(true);
    }//GEN-LAST:event_subajustestockiaMousePressed

    private void subpreñesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpreñesMousePressed
        new Preñes().setVisible(true);
    }//GEN-LAST:event_subpreñesMousePressed

    private void subfacturaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subfacturaMousePressed
        new FacturaProveedor().setVisible(true);
    }//GEN-LAST:event_subfacturaMousePressed

    private void subcreditoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subcreditoMousePressed
        new NotaCredito().setVisible(true);
    }//GEN-LAST:event_subcreditoMousePressed

    private void subdebitoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subdebitoMousePressed
        new NotaDebito().setVisible(true);
    }//GEN-LAST:event_subdebitoMousePressed

    private void subremisionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subremisionMousePressed
        new NotaRemision().setVisible(true);
    }//GEN-LAST:event_subremisionMousePressed

    private void subajustepMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subajustepMousePressed
        new AjustedeProductos().setVisible(true);
    }//GEN-LAST:event_subajustepMousePressed
    public void abrirarchivo(String archivo) {

        try {

            File objetofile = new File(archivo);
            Desktop.getDesktop().open(objetofile);

        } catch (IOException ex) {

            System.out.println(ex);
        }
    }

    private void reportes() {
        try {
            String fileName = "C:\\Users\\dahia\\OneDrive\\Documents\\NetBeansProjects\\Agro\\src\\Reportes\\IA.jasper";
            JasperPrint jasperPrint = JasperFillManager.fillReport(fileName, null, conn.conexion);
            JasperViewer ventana = new JasperViewer(jasperPrint, false);//
            ventana.setTitle("Empleados Registrados");
            ventana.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @return
     */
    public static String fecha() {
        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        return formatofecha.format(fecha);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Alimentacion;
    private javax.swing.JMenu Animal;
    private javax.swing.JMenu Cargo;
    private javax.swing.JMenu Ciudad;
    private javax.swing.JMenu Frigorifico;
    private javax.swing.JMenu Personal;
    private javax.swing.JMenu Razas;
    private javax.swing.JMenu Vacunas;
    private javax.swing.JMenu Veterinario;
    private javax.swing.JMenu Vitaminas;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu18;
    private javax.swing.JMenu jMenu19;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu20;
    private javax.swing.JMenu jMenu21;
    private javax.swing.JMenu jMenu22;
    private javax.swing.JMenu jMenu23;
    private javax.swing.JMenu jMenu24;
    private javax.swing.JMenu jMenu27;
    private javax.swing.JMenu jMenu28;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu30;
    private javax.swing.JMenu jMenu31;
    private javax.swing.JMenu jMenu32;
    private javax.swing.JMenu jMenu33;
    private javax.swing.JMenu jMenu34;
    private javax.swing.JMenu jMenu35;
    private javax.swing.JMenu jMenu36;
    private javax.swing.JMenu jMenu37;
    private javax.swing.JMenu jMenu38;
    private javax.swing.JMenu jMenu39;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu40;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lblRol;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JMenu menucompra;
    private javax.swing.JMenu menuia;
    private javax.swing.JMenu menureferenciales;
    private javax.swing.JMenu menureportes;
    private javax.swing.JMenu menuservicios;
    private javax.swing.JMenu reporteC;
    private javax.swing.JMenu reporteIA;
    private javax.swing.JMenu reporteSV;
    private javax.swing.JMenu subComprador;
    private javax.swing.JMenu subajustep;
    private javax.swing.JMenu subajustestockia;
    private javax.swing.JMenu subcredito;
    private javax.swing.JMenu subdebito;
    private javax.swing.JMenu subengorde;
    private javax.swing.JMenu subetapas;
    private javax.swing.JMenu subfactura;
    private javax.swing.JMenu subfiscalizacion;
    private javax.swing.JMenu subordencompra;
    private javax.swing.JMenu subpedido;
    private javax.swing.JMenu subplanificacionia;
    private javax.swing.JMenu subpresupuesto;
    private javax.swing.JMenu subpreñes;
    private javax.swing.JMenu subprotocoloia;
    private javax.swing.JMenu subregistroa;
    private javax.swing.JMenu subregistroia;
    private javax.swing.JMenu subremision;
    private javax.swing.JMenu subsolicitudia;
    private javax.swing.JMenu subsuplementos;
    private javax.swing.JMenu subtarjeta;
    // End of variables declaration//GEN-END:variables
}
