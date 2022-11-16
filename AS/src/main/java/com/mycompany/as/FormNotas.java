/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.as;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author marco
 */
public class FormNotas extends javax.swing.JFrame {
    
   ArrayList<Aluno> alunos = new ArrayList();
   ArrayList<Professor> professores = new ArrayList();
   ArrayList<Materia> materias = new ArrayList();
   ArrayList<Notas> notas = new ArrayList();
   private int codAlunos=1;   
   private int codProfessores=1;
   private int codMaterias=1;
   private int codNotas=1;
   public int codAluno(){
       int cod = codAlunos;
       codAlunos+=1;
       return cod;
   }
   public int codProfessor(){
       int cod = codProfessores;
       codProfessores+=1;
       return cod;
   }
   public int codMateria(){
       int cod = codMaterias;
       codMaterias+=1;
       return cod;
   }
   public int codNota(){
       int cod = codNotas;
       codNotas+=1;
       return cod;
   }

    /**
     * Creates new form FormNotas
     */
    public FormNotas() {
        initComponents();
        diretoNoCodigo();
        preenchecombo();
    }
    public void diretoNoCodigo() {
        alunos.add(new Aluno(codAluno(), "Marco", true));
        alunos.add(new Aluno(codAluno(), "Francisco", true));
        alunos.add(new Aluno(codAluno(), "Ravier", false));
        alunos.add(new Aluno(codAluno(), "Ana", false));
        alunos.add(new Aluno(codAluno(), "Leonidas", true));
        alunos.add(new Aluno(codAluno(), "Eduardo", true));
        alunos.add(new Aluno(codAluno(), "Fernando", false));
        alunos.add(new Aluno(codAluno(), "Lucas", true));
        
        professores.add(new Professor(codProfessor(), "Madianita", true));
        professores.add(new Professor(codProfessor(), "Fabiano", true));
        professores.add(new Professor(codProfessor(), "Fernanda", true));
        professores.add(new Professor(codProfessor(), "Raquel", false));
        
        materias.add(new Materia(codMateria(), "Banco de Dados", professores.get(0), alunos.get(0)));
        materias.add(new Materia(codMateria(), "Estrutura de Dados", professores.get(1), alunos.get(0)));
        materias.add(new Materia(codMateria(), "Engenharia de Software", professores.get(2), alunos.get(0)));
        materias.add(new Materia(codMateria(), "Inteligência Artificial", professores.get(3), alunos.get(0)));
        
        materias.get(0).setAlunos(alunos.get(1));
        materias.get(0).setAlunos(alunos.get(2));
        materias.get(0).setAlunos(alunos.get(3));
        materias.get(0).setAlunos(alunos.get(4));
        materias.get(0).setAlunos(alunos.get(5));
        materias.get(0).setAlunos(alunos.get(6));
        materias.get(0).setAlunos(alunos.get(7));
        
        materias.get(1).setAlunos(alunos.get(2));
        materias.get(1).setAlunos(alunos.get(3));
               
        materias.get(2).setAlunos(alunos.get(2));
        materias.get(2).setAlunos(alunos.get(4));
        materias.get(2).setAlunos(alunos.get(6));
        
        materias.get(3).setAlunos(alunos.get(1));
        materias.get(3).setAlunos(alunos.get(3));
        materias.get(3).setAlunos(alunos.get(5));
        materias.get(3).setAlunos(alunos.get(7));
        
        /*ADD CERTO*/
        notas.add(new Notas(codNota(), 9.8, materias.get(0), alunos.get(0), professores.get(0).getNome()));
        notas.add(new Notas(codNota(), 10.0, materias.get(1), alunos.get(0), professores.get(1).getNome()));
        notas.add(new Notas(codNota(), 9.7, materias.get(2), alunos.get(0), professores.get(2).getNome()));
        notas.add(new Notas(codNota(), 9.9, materias.get(3), alunos.get(0), professores.get(3).getNome()));
        
        notas.add(new Notas(codNota(), 7.8, materias.get(0), alunos.get(1), professores.get(0).getNome()));
        notas.add(new Notas(codNota(), 8.9, materias.get(3), alunos.get(1), professores.get(3).getNome()));
       
        notas.add(new Notas(codNota(), 5.6, materias.get(0), alunos.get(2), professores.get(0).getNome()));
        notas.add(new Notas(codNota(), 7.6, materias.get(1), alunos.get(2), professores.get(1).getNome()));
        notas.add(new Notas(codNota(), 6.9, materias.get(2), alunos.get(2), professores.get(2).getNome()));
              
        notas.add(new Notas(codNota(), 10.0, materias.get(0), alunos.get(3), professores.get(0).getNome()));
        notas.add(new Notas(codNota(), 10.0, materias.get(1), alunos.get(3), professores.get(1).getNome()));
        notas.add(new Notas(codNota(), 10.0, materias.get(3), alunos.get(3), professores.get(3).getNome()));
        
        notas.add(new Notas(codNota(), 9.8, materias.get(0), alunos.get(4), professores.get(0).getNome()));
        notas.add(new Notas(codNota(), 9.7, materias.get(2), alunos.get(4), professores.get(2).getNome()));
        
        notas.add(new Notas(codNota(), 7.5, materias.get(0), alunos.get(5), professores.get(0).getNome()));
        
        notas.add(new Notas(codNota(), 6.2, materias.get(0), alunos.get(6), professores.get(1).getNome()));
        notas.add(new Notas(codNota(), 6.7, materias.get(2), alunos.get(6), professores.get(1).getNome()));
        
        notas.add(new Notas(codNota(), 0.0, materias.get(0), alunos.get(7), professores.get(2).getNome())); 
        notas.add(new Notas(codNota(), 0.0, materias.get(3), alunos.get(7), professores.get(2).getNome()));       
              
    }
        private void preenchecombo(){
            
            for(Aluno a : alunos){ 
            cbAluno.addItem(a.getNome());}

            for(Professor p : professores){ 
            cbProfessor.addItem(p.getNome());}
            
            for(Materia m : materias){ 
            cbMateria.addItem(m.getNome());}
        }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbProfessor = new javax.swing.JComboBox<>();
        cbAluno = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbMateria = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btConsultarNotas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taSaida = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        tfNota = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btLimpar = new javax.swing.JButton();
        cbImprimir = new javax.swing.JCheckBox();
        cbSituacao = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbProfessor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProfessorActionPerformed(evt);
            }
        });

        cbAluno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Professor:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Aluno:");

        cbMateria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Materia:");

        btConsultarNotas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btConsultarNotas.setText("Consultar notas do aluno");
        btConsultarNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarNotasActionPerformed(evt);
            }
        });

        taSaida.setColumns(20);
        taSaida.setRows(5);
        jScrollPane1.setViewportView(taSaida);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Consultar nota aluno em uma matéria");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Adicionar/Alterar nota");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tfNota.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Nota:");

        btLimpar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        cbImprimir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbImprimir.setText("Imprimir histórico de alterações de notas");
        cbImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbImprimirActionPerformed(evt);
            }
        });

        cbSituacao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbSituacao.setText("Imprimir situação do aluno");

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setText("Quantidade de alunos por matéria");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btLimpar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbAluno, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbMateria, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbProfessor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(150, 150, 150)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(tfNota, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbImprimir)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btConsultarNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(cbSituacao))
                        .addGap(0, 62, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConsultarNotas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbImprimir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbSituacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)))
                .addComponent(btLimpar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbProfessorActionPerformed

    private void btConsultarNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarNotasActionPerformed
        /*Apresente as notas do aluno em todas as matérias, uma de cada vez*/
        /*Caso a opção de "Imprimir histórico de alterações de notas" esteja selecionada, imprima o histórico de alteração de notas*/
        /*Caso a opção de "Imprimir situação do aluno" esteja selecionada, imprima a situalção do aluno (se está cursando e se passou na matéria)*/
        boolean encontrou=false;
        for(Notas n : notas){
        if(n.getAluno().getNome().equals(cbAluno.getSelectedItem())){
            if(cbImprimir.isSelected()){
                if(cbSituacao.isSelected()){      
                    if(n.isaprovado()){
                        taSaida.append("Aluno foi aprovado na matéria de " + n.getMateria().getNome() + "!!!\n");
                    }
                    else{taSaida.append("Aluno não alcançou a média na matéria de "+ n.getMateria().getNome() +"!!!\n");
                    }
                    
                    taSaida.append("Nome: " + n.getAluno().getNome() + " Nota: " + n.getNota()+ "\nHistórico de alterações de notas: " + n.getHistorico() + "\nSituação do aluno: " + n.getAluno().situacao() + "\n\n");
                }
                else{
                    taSaida.append("Nome: " + n.getAluno().getNome() + " Materia: " + n.getMateria().getNome() + " Nota: " + n.getNota()+ "\nHistórico de alterações de notas: " + n.getHistorico() +"\n\n");
                }
            }
            else{
                if(cbSituacao.isSelected()){
                    if(n.isaprovado()){
                        taSaida.append("Aluno foi aprovado na matéria de " + n.getMateria().getNome() + "!!!\n");
                    }
                    else{taSaida.append("Aluno não alcançou a média na matéria de "+ n.getMateria().getNome() +"!!!\n");
                    }
                    taSaida.append("Nome: " + n.getAluno().getNome() + " Nota: " + n.getNota() + "\nSituação do aluno: " + n.getAluno().situacao() + "\n\n");
                    }
                else{taSaida.append("Nome: " + n.getAluno().getNome() + " Materia: " + n.getMateria().getNome() + " Nota: " + n.getNota() + "\n\n");
                }
            }            
            encontrou=true;}}
        if(!encontrou){JOptionPane.showMessageDialog(null,"Aluno ainda não possui nota cadastrada em nenhuma matéria");}
    }//GEN-LAST:event_btConsultarNotasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /*Apresente a nota do aluno na matéria selecionada*/
        /*Caso a opção de "Imprimir histórico de alterações de notas" esteja selecionada, imprima o histórico de alteração de notas*/
        /*Caso a opção de "Imprimir situação do aluno" esteja selecionada, imprima a situalção do aluno (se está cursando e se passou na matéria)*/
        boolean encontrou=false;
        for(Notas n : notas){
        if(n.getAluno().getNome().equals(cbAluno.getSelectedItem())){
            if(n.getMateria().getNome().equals(cbMateria.getSelectedItem())){            
            if(cbImprimir.isSelected()){
                if(cbSituacao.isSelected()){
                    if(n.isaprovado()){
                        taSaida.append("Aluno foi aprovado na matéria de " + n.getMateria().getNome() + "!!!\n");
                    }
                    else{taSaida.append("Aluno não alcançou a média na matéria de "+ n.getMateria().getNome() +"!!!\n");
                    }
                    taSaida.append("Nome: " + n.getAluno().getNome() + " Nota: " + n.getNota()+ "\nHistórico de alterações de notas: " + n.getHistorico() + "\nSituação do aluno: " + n.getAluno().situacao() + "\n\n");
                }
                else{taSaida.append("Nome: " + n.getAluno().getNome() + " Materia: " + n.getMateria().getNome() + " Nota: " + n.getNota()+ "\nHistórico de alterações de notas: " + n.getHistorico() + "\n\n");}
            }
            else{
                if(cbSituacao.isSelected()){
                    if(n.isaprovado()){
                        taSaida.append("Aluno foi aprovado na matéria de " + n.getMateria().getNome() + "!!!\n");
                    }
                    else{taSaida.append("Aluno não alcançou a média na matéria de "+ n.getMateria().getNome() +"!!!\n");
                    }
                    taSaida.append("Nome: " + n.getAluno().getNome() + " Nota: " + n.getNota() + "\nSituação do aluno: " + n.getAluno().situacao() +"\n\n");
                }
                else{taSaida.append("Nome: " + n.getAluno().getNome() + " Materia: " + n.getMateria().getNome() + " Nota: " + n.getNota()+"\n\n");}                
            }
            encontrou=true;}}}
        if(!encontrou){JOptionPane.showMessageDialog(null,"Aluno ainda não possui nota cadastrada nessa matéria");}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        /*Adicione (caso o aluno não tenha nota cadastrada na matéria) ou altere (caso ele tenha) a nota para o aluno selecionado da matéria selecionada*/
        if(tfNota.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor, digite uma nota para ser adicionada ou alterada");
        }
        else{
            Materia mat = null;
            Aluno al = null;
            boolean jaExiste=false;
            for(Materia m : materias){
            if(m.getNome().equals(cbMateria.getSelectedItem())){
                mat=m;}
            }
            for(Aluno a : alunos){
            if(a.getNome().equals(cbAluno.getSelectedItem())){
                al=a;}
            }       
            if(al != null && mat != null){
                if(al.isIsAtivo()){
                    for(Notas n : notas){                  
                        if(n.getAluno().getNome().equals(al.getNome()) && n.getMateria().getNome().equals(mat.getNome())){
                            jaExiste=true;
                            n.setNota(Double.parseDouble(tfNota.getText()), (String) cbProfessor.getSelectedItem());
                            JOptionPane.showMessageDialog(null, "Nota alterada com sucesso!!!");
                        }                    
                        if(jaExiste==false){
                        notas.add(new Notas(codNota(), Double.parseDouble(tfNota.getText()), mat, al, (String) cbProfessor.getSelectedItem()));
                        JOptionPane.showMessageDialog(null, "Nota adicionada com sucesso!!!");
                        }                
                    }
                    }
                  else{JOptionPane.showMessageDialog(null, "Esse aluno não estuda mais conosco, impossível adicionar nota à ele!!!");}                  
                }
            }          
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        taSaida.setText(null);
        tfNota.setText(null);
    }//GEN-LAST:event_btLimparActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        /*Apresente a quantidade total de alunos registrados nessa matéria:*/
        Materia m=null;
        for(Notas n : notas){
            if(n.getMateria().getNome().equals(cbMateria.getSelectedItem())){  
                m=n.getMateria();  
            }            
        }        
        taSaida.append("Quantidade total de alunos registrados na matéria de " + m.getNome() + ": " +Integer.toString(m.qtMateria(m))+"\n");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cbImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbImprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbImprimirActionPerformed

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
            java.util.logging.Logger.getLogger(FormNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormNotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsultarNotas;
    private javax.swing.JButton btLimpar;
    private javax.swing.JComboBox<String> cbAluno;
    private javax.swing.JCheckBox cbImprimir;
    private javax.swing.JComboBox<String> cbMateria;
    private javax.swing.JComboBox<String> cbProfessor;
    private javax.swing.JCheckBox cbSituacao;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taSaida;
    private javax.swing.JTextField tfNota;
    // End of variables declaration//GEN-END:variables

    private void JOptionPane(String aluno_ainda_não_possui_nota_cadastrada_em) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
