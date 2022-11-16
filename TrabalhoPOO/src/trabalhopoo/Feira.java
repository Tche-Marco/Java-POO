/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Mario, Stéfano e Marco Antônio
 */
public class Feira extends javax.swing.JFrame {
    double calculo = 0, pagtotal = 0, vgerente = 0, vatendente = 0;
    int gerente = 0, atendente = 0, totaltrab = 0;
    
    
    ArrayList<String> listaNomes = new ArrayList();
    ArrayList<String> listaCpf = new ArrayList();
    ArrayList<String> listaCargos = new ArrayList();
    ArrayList<Double> listaCH = new ArrayList();
    /**
     * Creates new form Feira
     */
    public Feira() {
        initComponents();
    }
public int eCPF (String cpf){
    for (int i=0; i<listaCpf.size();i++){
        if (listaCpf.get(i).equals(cpf)){
            return i;
    }
    }
    return -1;
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfnome = new javax.swing.JTextField();
        tfcpf = new javax.swing.JTextField();
        tfch = new javax.swing.JTextField();
        rbSim = new javax.swing.JRadioButton();
        rbNao = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taSaida = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("CPF:");

        jLabel2.setText("Nome:");

        jLabel3.setText("É gerente:");

        jLabel4.setText("Carga horária:");

        tfnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnomeActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbSim);
        rbSim.setText("Sim");

        buttonGroup2.add(rbNao);
        rbNao.setSelected(true);
        rbNao.setText("Não");

        jButton1.setText("Todas as Pessoas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Pessoa específica");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Números");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("LIMPAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Inserir dados");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        taSaida.setColumns(20);
        taSaida.setRows(5);
        jScrollPane1.setViewportView(taSaida);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfch, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(216, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfnome, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(tfcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbSim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbNao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbSim)
                        .addComponent(rbNao)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        if("".equals(tfnome.getText())){
            JOptionPane.showMessageDialog(null,"Campo NOME está vazio!");
        }
        else if("".equals(tfcpf.getText())){
            JOptionPane.showMessageDialog(null,"Campo CPF está vazio!");
        }
        else if(!"".equals(tfch.getText())){
            // Se o campo não for vazio //
            double ch = Double.parseDouble(tfch.getText());
            if(ch >= 21 && ch <= 59){
                if(eCPF(tfcpf.getText()) == -1){
                listaCH.add(ch);
                listaNomes.add(tfnome.getText());
                listaCpf.add(tfcpf.getText());
                
                if(rbSim.isSelected()){
                listaCargos.add("Gerente");
                gerente += 1;
                totaltrab +=1;
                }
                else if(rbNao.isSelected()){
                    listaCargos.add("Atendente");
                    atendente +=1;
                    totaltrab +=1;
                }
                
                tfch.setText(null);
                tfcpf.setText(null);
                tfnome.setText(null);
                tfnome.requestFocusInWindow();
                taSaida.setText(null);
            }
                else{
                    JOptionPane.showMessageDialog(null, "O CPF já se encontra adicionado! na posição: "+eCPF(tfcpf.getText()));
                }
                }
                

            else{
                JOptionPane.showMessageDialog(null,"O valor de carga horaria está fora do intervalo aceitavel!");
            }
        }
        else{
            // Se o campo estiver vazio //
            JOptionPane.showMessageDialog(null,"Carga Horaria está vazia!");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

        
    private void tfnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfnomeActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        tfch.setText(null);
        tfcpf.setText(null);
        tfnome.setText(null);
        tfnome.requestFocusInWindow();
        taSaida.setText(null);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (listaNomes.isEmpty()){
            JOptionPane.showMessageDialog(null, "Array Vazia");
            taSaida.setText("Array Vazia!!");
        }
        else{
            
            int qtTotal = 0; 
            taSaida.append("Nomes na lista:");
            for (int i=0;i<listaNomes.size();i++){
                if("Gerente".equals(listaCargos.get(i))){
                    calculo = listaCH.get(i) * 100;
                    pagtotal += calculo;
                }
                else if("Atendente".equals(listaCargos.get(i))){
                    calculo = listaCH.get(i) * 50;
                    pagtotal += calculo;
                }
                qtTotal += 1;
                taSaida.append("\n-------------------"+"\n"+"Posição no Array:"+i+"\nNome: "+listaNomes.get(i)+"\nCPF: "+listaCpf.get(i)+"\nCargo: "+listaCargos.get(i)+"\nCH: "+listaCH.get(i)+"\nPagamento: "+calculo+"\n"+"-------------------\n");    
            }
            taSaida.append("Quantidade total de pessoas: "+qtTotal+"\nValor total de pagamentos: "+ pagtotal);
            pagtotal = 0;

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        for (int i=0;i<listaNomes.size();i++){
            if("Gerente".equals(listaCargos.get(i))){
                calculo = listaCH.get(i) * 100;
                pagtotal += calculo;
                vgerente += calculo;
            }
            else if("Atendente".equals(listaCargos.get(i))){
                calculo = listaCH.get(i) * 50;
                pagtotal += calculo;
                vatendente += calculo;
            }
        }
              
                   
        taSaida.append("\n-------------------"+"\n"+"qtgerentes: "+gerente+"\nqtAtendentes: "+atendente+"\nqtTotal de trabalhadores: "+totaltrab+"\nValor total gerentes: "+vgerente+"\nValor total atendentes: "+vatendente+"\nValor total Pag: "+pagtotal+"\n"+"-------------------");
        pagtotal = 0;
        vgerente = 0;
        vatendente = 0;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    if (tfcpf.getText().isBlank()){
        JOptionPane.showMessageDialog(null, "Não foi digitado nenhum CPF");
    }
    else if(eCPF(tfcpf.getText()) != -1 ){
         if("Gerente".equals(listaCargos.get(eCPF(tfcpf.getText())))){
               taSaida.append("\n-------------------\nNome: "+listaNomes.get(eCPF(tfcpf.getText()))+"\nValor do pagamento: "+listaCH.get(eCPF(tfcpf.getText()))*100);
            }
            else{
                taSaida.append("\nNome: "+listaNomes.get(eCPF(tfcpf.getText()))+"\nValor do pagamento: "+listaCH.get(eCPF(tfcpf.getText()))*50);
            }
    }
    else{
         JOptionPane.showMessageDialog(null, "Esse CPF não foi encontrado!");
    }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Feira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Feira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Feira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Feira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Feira().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbNao;
    private javax.swing.JRadioButton rbSim;
    private javax.swing.JTextArea taSaida;
    private javax.swing.JTextField tfch;
    private javax.swing.JTextField tfcpf;
    private javax.swing.JTextField tfnome;
    // End of variables declaration//GEN-END:variables
}
