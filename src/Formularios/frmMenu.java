/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

/**
 *
 * @author damacena
 */
public class frmMenu extends javax.swing.JFrame {

    /**
     * Creates new form frmMenu
     */
    public frmMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BarraMenuVertical = new javax.swing.JPanel();
        VendasMenuPrincipal = new javax.swing.JButton();
        ClientesMenuPrincipal = new javax.swing.JButton();
        CaixaMenuPrincipal = new javax.swing.JButton();
        ProdutosMenuPrincipal = new javax.swing.JButton();
        FornecedoresMenuPrincipal = new javax.swing.JButton();
        EstatisticasMenuPrincipal = new javax.swing.JButton();
        UsuariosMenuPrincipal = new javax.swing.JButton();
        PainelDesktop = new javax.swing.JPanel();
        Desktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        BarraMenuHorizontal = new javax.swing.JMenuBar();
        ArquivoMenuPrincipal = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        ExibirMenuPrincipal = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        AjudaMenuPrincipal = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Comercial Ver. 1.0");
        setAutoRequestFocus(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarraMenuVertical.setBackground(new java.awt.Color(255, 255, 255));
        BarraMenuVertical.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        VendasMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/021-calculator.png"))); // NOI18N
        VendasMenuPrincipal.setText("Vendas");
        VendasMenuPrincipal.setBorder(null);
        VendasMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VendasMenuPrincipalActionPerformed(evt);
            }
        });

        ClientesMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/007-call center.png"))); // NOI18N
        ClientesMenuPrincipal.setText("Clientes");
        ClientesMenuPrincipal.setBorder(null);
        ClientesMenuPrincipal.setPreferredSize(new java.awt.Dimension(99, 99));
        ClientesMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientesMenuPrincipalActionPerformed(evt);
            }
        });

        CaixaMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/033-fast delivery.png"))); // NOI18N
        CaixaMenuPrincipal.setText("Caixa");
        CaixaMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaixaMenuPrincipalActionPerformed(evt);
            }
        });

        ProdutosMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/041-forklift.png"))); // NOI18N
        ProdutosMenuPrincipal.setText("Produtos");
        ProdutosMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdutosMenuPrincipalActionPerformed(evt);
            }
        });

        FornecedoresMenuPrincipal.setFont(new java.awt.Font("Lucida Grande", 0, 8)); // NOI18N
        FornecedoresMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/044-courier.png"))); // NOI18N
        FornecedoresMenuPrincipal.setText("Fornecedores");
        FornecedoresMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FornecedoresMenuPrincipalActionPerformed(evt);
            }
        });

        EstatisticasMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/045-presentation.png"))); // NOI18N
        EstatisticasMenuPrincipal.setText("Relatorios");
        EstatisticasMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstatisticasMenuPrincipalActionPerformed(evt);
            }
        });

        UsuariosMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/006-tracking.png"))); // NOI18N
        UsuariosMenuPrincipal.setText("Usuários");
        UsuariosMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuariosMenuPrincipalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BarraMenuVerticalLayout = new javax.swing.GroupLayout(BarraMenuVertical);
        BarraMenuVertical.setLayout(BarraMenuVerticalLayout);
        BarraMenuVerticalLayout.setHorizontalGroup(
            BarraMenuVerticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraMenuVerticalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BarraMenuVerticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(VendasMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ClientesMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ProdutosMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FornecedoresMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CaixaMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UsuariosMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EstatisticasMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        BarraMenuVerticalLayout.setVerticalGroup(
            BarraMenuVerticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraMenuVerticalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VendasMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ClientesMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ProdutosMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FornecedoresMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CaixaMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UsuariosMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EstatisticasMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        getContentPane().add(BarraMenuVertical, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));

        PainelDesktop.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Desktop.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/logo.png"))); // NOI18N

        Desktop.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DesktopLayout.createSequentialGroup()
                .addContainerGap(1023, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(21, 21, 21))
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DesktopLayout.createSequentialGroup()
                .addContainerGap(571, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout PainelDesktopLayout = new javax.swing.GroupLayout(PainelDesktop);
        PainelDesktop.setLayout(PainelDesktopLayout);
        PainelDesktopLayout.setHorizontalGroup(
            PainelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelDesktopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Desktop))
        );
        PainelDesktopLayout.setVerticalGroup(
            PainelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop)
        );

        getContentPane().add(PainelDesktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 0, 1180, 720));

        ArquivoMenuPrincipal.setText("Arquivo");

        jMenuItem1.setText("jMenuItem1");
        ArquivoMenuPrincipal.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem2");
        ArquivoMenuPrincipal.add(jMenuItem2);

        jMenuItem3.setText("jMenuItem3");
        ArquivoMenuPrincipal.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem4.setText("Sair");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        ArquivoMenuPrincipal.add(jMenuItem4);

        BarraMenuHorizontal.add(ArquivoMenuPrincipal);

        ExibirMenuPrincipal.setText("Exibir");

        jMenuItem5.setText("jMenuItem5");
        ExibirMenuPrincipal.add(jMenuItem5);

        jMenuItem6.setText("jMenuItem6");
        ExibirMenuPrincipal.add(jMenuItem6);

        jMenuItem7.setText("jMenuItem7");
        ExibirMenuPrincipal.add(jMenuItem7);

        jMenuItem8.setText("jMenuItem8");
        ExibirMenuPrincipal.add(jMenuItem8);

        BarraMenuHorizontal.add(ExibirMenuPrincipal);

        AjudaMenuPrincipal.setText("Ajuda");

        jMenuItem9.setText("jMenuItem9");
        AjudaMenuPrincipal.add(jMenuItem9);

        BarraMenuHorizontal.add(AjudaMenuPrincipal);

        setJMenuBar(BarraMenuHorizontal);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ClientesMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientesMenuPrincipalActionPerformed
        // Aqui chamo a tela clientes 
        frmClientesPesquisa clientes = new frmClientesPesquisa();
        clientes.setVisible(true);
        Desktop.add(clientes);
        

    }//GEN-LAST:event_ClientesMenuPrincipalActionPerformed

    private void ProdutosMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdutosMenuPrincipalActionPerformed
        // Aqui chamo a tela de produtos
        frmProdutos produtos = new frmProdutos();
        produtos.setVisible(true);
        Desktop.add(produtos);
    }//GEN-LAST:event_ProdutosMenuPrincipalActionPerformed

    private void VendasMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VendasMenuPrincipalActionPerformed
        // Aqui chamo a tela de vendas
        frmVendas vendas = new frmVendas();
        vendas.setVisible(true);
        Desktop.add(vendas);

    }//GEN-LAST:event_VendasMenuPrincipalActionPerformed

    private void FornecedoresMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FornecedoresMenuPrincipalActionPerformed
        // aqui chamo a tela de fornecedores 
        frmFornecedoresView fornecedoresview = new  frmFornecedoresView();
        fornecedoresview.setVisible(true);
        Desktop.add(fornecedoresview);
    }//GEN-LAST:event_FornecedoresMenuPrincipalActionPerformed

    private void CaixaMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaixaMenuPrincipalActionPerformed
        // aqui chamo a tela de caixa
        frmCaixa caixa = new frmCaixa();
        caixa.setVisible(true);
        Desktop.add(caixa);
    }//GEN-LAST:event_CaixaMenuPrincipalActionPerformed

    private void UsuariosMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariosMenuPrincipalActionPerformed
        // aqui chamo a tela Usuarios
        frmUsuarios usuarios = new frmUsuarios();
        usuarios.setVisible(true);
        Desktop.add(usuarios);
    }//GEN-LAST:event_UsuariosMenuPrincipalActionPerformed

    private void EstatisticasMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstatisticasMenuPrincipalActionPerformed
        // Aqui chamo a tela estatisticas
        frmEstatisticas estatisticas = new frmEstatisticas();
        estatisticas.setVisible(true);
        Desktop.add(estatisticas);
    }//GEN-LAST:event_EstatisticasMenuPrincipalActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // sair 
        this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AjudaMenuPrincipal;
    private javax.swing.JMenu ArquivoMenuPrincipal;
    private javax.swing.JMenuBar BarraMenuHorizontal;
    private javax.swing.JPanel BarraMenuVertical;
    private javax.swing.JButton CaixaMenuPrincipal;
    private javax.swing.JButton ClientesMenuPrincipal;
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JButton EstatisticasMenuPrincipal;
    private javax.swing.JMenu ExibirMenuPrincipal;
    private javax.swing.JButton FornecedoresMenuPrincipal;
    private javax.swing.JPanel PainelDesktop;
    private javax.swing.JButton ProdutosMenuPrincipal;
    private javax.swing.JButton UsuariosMenuPrincipal;
    private javax.swing.JButton VendasMenuPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
