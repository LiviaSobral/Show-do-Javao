/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.show.view;

import com.mycompany.show.controller.PerguntaController;

/**
 *
 * @author TALITANAIBERTDACOSTA
 */
public class tela_javao extends javax.swing.JFrame {

    /**
     * Creates new form tela_javao
     */
    public tela_javao() {
        initComponents();
        String[] respostas1 = {"Põe batata", "Põe Farofa", "Põe peixe", "Não põe nada"};
        String[] respostas2 = {"Edward Jenner", "Louis Pasteur", "Albert Einstein", "Socrates"};
        String[] respostas3 = {"Brasileiro indicado ao Prêmio Nobel da Paz 2018", "Militar e político brasileiro", "Escritor e poeta português", "Escritor e poeta espanhol"};
        String[] respostas4 = {"Doom 2", "Call of Duty", "Alienígena: Isolamento", "Mario kart"};
        String[] respostas5 = {"Java", "Jogos Rockstar", "Bethesda", "Pythom"};
        String[] respostas6 = {"Halo ce", "Fallout: new vegas", "the Elder Scrolls IV: Oblivion", "The Elder Scrolls V: Skyrim"};
        String[] respostas7 = {"Ta bom", "22,8 °C e uma máxima de 30,2 °C", "-22,8 °C e uma máxima de 30,2 °C", "3.7 °C e uma máxima de 10.2 °C"};
        String[] respostas8 = {"Deus me livre", "SIM", "Misericordia", "Não"};
        String[] respostas9 = {"1.6.4", "1.7.10", "1.8.2", "1.5.2"};
        String[] respostas10 = {"Os dinosauros", "A galinha", "O ovo", "Os dois"};
        
        PerguntaController.adicionar("Complete o trecho da musica: Põe tapioca Põe, farinha d'água, Põe açúcar ....", respostas1, 4);
        PerguntaController.adicionar("Quem foi o inventor da vacina?", respostas2, 1);
        PerguntaController.adicionar("Quem é Luiz Gabriel Tiago?", respostas3, 1);
        PerguntaController.adicionar("Em qual jogo de terror espacial os jogadores escapam de um perigoso Xenomorfo?", respostas4, 3);
        PerguntaController.adicionar("Qual grande desenvolvedor estava envolvido na controvérsia do “Café Quente”?", respostas5, 2);
        PerguntaController.adicionar("“Arrow to the Knee” é uma frase associada a qual RPG da Bethesda?", respostas6, 4);
        PerguntaController.adicionar("Considerando o estado politico da Indonesia fale sobre o clima", respostas7, 1);
        PerguntaController.adicionar("Você gosta de Java", respostas8, 2);
        PerguntaController.adicionar("Qual a versão do minecraft onde eles adicionaram gatos", respostas9, 4);
        PerguntaController.adicionar("quem naceu primeiro o ovo ou a galinha", respostas10, 1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botãoEntrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("jogo do javão");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\git\\Show-do-Javao\\daraj8q-744f0563-d3f2-4a25-98a7-377abba7dc7b.png")); // NOI18N
        jLabel2.setText(".");
        jLabel2.setMaximumSize(new java.awt.Dimension(1207, 1200));
        jLabel2.setMinimumSize(new java.awt.Dimension(1207, 1200));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\git\\Show-do-Javao\\200_d.gif")); // NOI18N
        jLabel3.setText("jLabel3");

        botãoEntrar.setBackground(new java.awt.Color(153, 0, 0));
        botãoEntrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botãoEntrar.setForeground(new java.awt.Color(255, 255, 255));
        botãoEntrar.setText("entrar");
        botãoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botãoEntrarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("bem vindo ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("ao");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botãoEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(jLabel1)
                .addGap(0, 376, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(365, 365, 365)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(458, 458, 458)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botãoEntrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(193, 193, 193))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botãoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botãoEntrarActionPerformed
        new tela2().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botãoEntrarActionPerformed

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
            java.util.logging.Logger.getLogger(tela_javao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_javao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_javao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_javao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_javao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botãoEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
