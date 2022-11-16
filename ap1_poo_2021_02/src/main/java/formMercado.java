
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andre Alves e Marco Antonio Martins
 */
public class formMercado extends javax.swing.JFrame {
    ArrayList<mercado> produtos = new ArrayList();
    ArrayList<Vendas> itens = new ArrayList();
    ArrayList<VendasRealizadas> Venda = new ArrayList();

    /**
     * Creates new form formMercado
     */
    public formMercado() {
        initComponents();
        CriaObjetos();
    }
    
    public void CriaObjetos(){
        produtos.add(new mercado(1,50,"Arroz","Alimentício",40.50));
        produtos.add(new mercado(2,50,"Feijão","Alimentício",20.00));
        produtos.add(new mercado(3,30,"Detergente em Pó","Limpeza",14.90));
        produtos.add(new mercado(4,40,"Pano de Prato","Bazar",10.00));
        
        itens.add(new Vendas(1,2,"Arroz",48.5));
        itens.add(new Vendas(2,2,"Arroz",24.5));
        itens.add(new Vendas(3,4,"Detergente em Pó",12.0));
        itens.add(new Vendas(4,2,"Pano de Prato",18.0));
        
        Venda.add(new VendasRealizadas(1,250.00,"Dinheiro"));
        Venda.add(new VendasRealizadas(2,40.95,"Cartao"));
        Venda.add(new VendasRealizadas(3,300.05,"Dinheiro"));
        Venda.add(new VendasRealizadas(4,200.00,"Cartao"));
                
    }
    public void Limpar(){
         tfcodigo.setText(null);
         tfDescricao.setText(null);
         tfValor.setText(null);
         tfEstoque.setText(null);
         tfQuantidade.setText(null);
         tfcodigo.requestFocus();
    }
    public void LimparSaida(){
        taSaida.setText(null);
    }
    public mercado existeProduto(int codigo){
        for(mercado p:produtos){
            if(p.getCodigo() == codigo){
                return p;
            }
        }
        return null;
    }
    public void Pesquisa(){
        try{
            int cod = Integer.parseInt(tfcodigo.getText());
            mercado p = existeProduto(cod);
            if(p!=null){
                tfDescricao.setText(p.getProduto());
                tfValor.setText(Double.toString(p.CalculaVenda()));
                tfEstoque.setText(Integer.toString(p.getEstoque()));
            }else{
                JOptionPane.showMessageDialog(null,"Produto nao encontrado");
            }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Digite o codigo!!");
        }
    }
    public void Inserir(){
        try{
            if(("0".equals(tfQuantidade.getText()))){
                JOptionPane.showMessageDialog(null,"Impossivel adicionar 0 produtos");
            }
            else{  
            itens.add(new Vendas(Integer.parseInt(tfcodigo.getText()),Integer.parseInt(tfQuantidade.getText()),tfDescricao.getText(),Double.parseDouble(tfValor.getText())));
            Limpar();
            Imprimir();}
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Preencha todos os campos!");
        }
        
        
    
    }
    
    public void Imprimir(){
        double ValorCompra = 0;
        LimparSaida();
        int pos = 1;
        taSaida.setText("Venda: \n");
        taSaida.setText("Item - Codigo - Descrição - Quantidade - Valor -  Total \n");
        for(Vendas v:itens){
            
            taSaida.append(pos+"-"+v.getCodigo()+" - "+ 
                           v.getProduto()+" - "+ 
                           v.getQuantidade() +" - "+
                           v.getValorItem() +" - "+
                           v.CalculaItem()+"\n");
            ValorCompra += v.CalculaItem();
            pos += 1;
        }
        taSaida.append("Valor da Compra: " + ValorCompra);    
    }
    
    public void Finalizar(){
        if(itens.isEmpty()){
            JOptionPane.showMessageDialog(null,"Lista Vazia");
        }else{
            int cupom = 1;
            double valorVenda = 0;
            for(Vendas v:itens){
                valorVenda += v.CalculaItem();
            cupom += 1;
            }
            if(rbDinheiro.isSelected()){
                Venda.add(new VendasRealizadas(cupom,valorVenda,"Dinheiro"));
            }else if(rbCartao.isSelected()){
                Venda.add(new VendasRealizadas(cupom,valorVenda,"Cartao"));
            }
            LimparSaida();
            itens.clear();
        }
    }
    public void RelatorioVendas(){
        if(rbVendaTotal.isSelected()){
            LimparSaida();
            double TotalVendas = 0;
            taSaida.setText("Relatorio de Vendas: \n");
            for(VendasRealizadas vr:Venda){
                taSaida.append("Cupom: "+vr.getCupom() + 
                               " - Valor Cupom: " + vr.getValorCupom()+
                               " - Forma de Pagamento: "+vr.getFormaPagamento() +"\n");
                TotalVendas += vr.getValorCupom();
            }
            taSaida.append("Valor Total de vendas realizadas: "+ TotalVendas);
        }else if(rbSoCartao.isSelected()){
            LimparSaida();
            double TotalVendas = 0; // Converter double
            for(VendasRealizadas vr:Venda){
                if(vr.getFormaPagamento().equals("Cartao")){
                    taSaida.append("Cupom: "+vr.getCupom() + 
                               " - Valor Cupom: " + vr.getValorCupom()+
                               " - Forma de Pagamento: "+vr.getFormaPagamento() +"\n");
                    TotalVendas += vr.getValorCupom();
                }
            }
            taSaida.append("Valor Total de vendas realizadas: "+ TotalVendas);
        }else if(rbSoDinheiro.isSelected()){
            LimparSaida();
            double TotalVendas = 0; // Converter double
            for(VendasRealizadas vr:Venda){
                if(vr.getFormaPagamento().equals("Dinheiro")){
                    taSaida.append("Cupom: "+vr.getCupom() + 
                               " - Valor Cupom: " + vr.getValorCupom()+
                               " - Forma de Pagamento: "+vr.getFormaPagamento() +"\n");
                    TotalVendas += vr.getValorCupom();
                }
            }
            taSaida.append("Valor Total de vendas realizadas: "+ TotalVendas);
            
        }else{
            JOptionPane.showMessageDialog(null,"Selecione uma opçao!");
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        GrbRelatorioVenda = new javax.swing.ButtonGroup();
        btImprimir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfcodigo = new javax.swing.JTextField();
        btPesquisa = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfDescricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfValor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfEstoque = new javax.swing.JTextField();
        btInserir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taSaida = new javax.swing.JTextArea();
        btFinalizar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        tfQuantidade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rbDinheiro = new javax.swing.JRadioButton();
        rbCartao = new javax.swing.JRadioButton();
        btRelatorioVendas = new javax.swing.JButton();
        rbVendaTotal = new javax.swing.JRadioButton();
        rbSoDinheiro = new javax.swing.JRadioButton();
        rbSoCartao = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btImprimir.setText("Catalogo de Produtos");
        btImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btImprimirActionPerformed(evt);
            }
        });

        jLabel1.setText("Codigo:");

        btPesquisa.setText("Pesquisa");
        btPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisaActionPerformed(evt);
            }
        });

        jLabel2.setText("Descrição:");

        jLabel3.setText("Valor:");

        jLabel4.setText("Estoque:");

        btInserir.setText("Inserir");
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        jLabel5.setText("Itens:");

        taSaida.setColumns(20);
        taSaida.setRows(5);
        jScrollPane1.setViewportView(taSaida);

        btFinalizar.setText("Finalizar");
        btFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFinalizarActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        jLabel6.setText("Quantidade:");

        buttonGroup1.add(rbDinheiro);
        rbDinheiro.setText("Dinheiro");
        rbDinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDinheiroActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbCartao);
        rbCartao.setText("Cartão");
        rbCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCartaoActionPerformed(evt);
            }
        });

        btRelatorioVendas.setText("Relatorios de Vendas");
        btRelatorioVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelatorioVendasActionPerformed(evt);
            }
        });

        GrbRelatorioVenda.add(rbVendaTotal);
        rbVendaTotal.setText("Venda Total");

        GrbRelatorioVenda.add(rbSoDinheiro);
        rbSoDinheiro.setText("So Dinheiro");

        GrbRelatorioVenda.add(rbSoCartao);
        rbSoCartao.setText("So Cartao");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbDinheiro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbCartao)
                        .addGap(62, 62, 62)
                        .addComponent(btFinalizar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(667, 667, 667)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(btInserir)
                        .addGap(18, 18, 18)
                        .addComponent(btLimpar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(tfcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(44, 44, 44)
                                    .addComponent(btPesquisa))
                                .addComponent(tfEstoque, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btImprimir, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rbVendaTotal)
                                .addComponent(btRelatorioVendas)
                                .addComponent(rbSoDinheiro)
                                .addComponent(rbSoCartao)))
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btPesquisa))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btInserir)
                                .addComponent(btLimpar))
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btImprimir)
                        .addGap(18, 18, 18)
                        .addComponent(btRelatorioVendas)
                        .addGap(26, 26, 26)
                        .addComponent(rbVendaTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbSoDinheiro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbSoCartao)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btFinalizar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbDinheiro)
                            .addComponent(rbCartao))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btImprimirActionPerformed
        String saida = "";
        for (mercado pd:produtos){
            saida += "Codigo: "+pd.getCodigo()
                    +" Produto: "+ pd.getProduto()
                    +" Estoque: "+ pd.getEstoque() 
                    +" Categoria: "+ pd.getCategoria()
                    +" Valor compra: "+ pd.getValorCompra()
                    +" Valor de venda: "+ pd.CalculaVenda()+ "\n";
            
        }
        
        JOptionPane.showMessageDialog(null,saida);
    }//GEN-LAST:event_btImprimirActionPerformed

    private void btPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisaActionPerformed
        Pesquisa();
    }//GEN-LAST:event_btPesquisaActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        Limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        Inserir();
        
    }//GEN-LAST:event_btInserirActionPerformed

    private void btRelatorioVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelatorioVendasActionPerformed
       RelatorioVendas();
    }//GEN-LAST:event_btRelatorioVendasActionPerformed

    private void btFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFinalizarActionPerformed
        Finalizar();
    }//GEN-LAST:event_btFinalizarActionPerformed

    private void rbDinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDinheiroActionPerformed
        
    }//GEN-LAST:event_rbDinheiroActionPerformed

    private void rbCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCartaoActionPerformed
        
    }//GEN-LAST:event_rbCartaoActionPerformed

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
            java.util.logging.Logger.getLogger(formMercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formMercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formMercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formMercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formMercado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrbRelatorioVenda;
    private javax.swing.JButton btFinalizar;
    private javax.swing.JButton btImprimir;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btPesquisa;
    private javax.swing.JButton btRelatorioVendas;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rbCartao;
    private javax.swing.JRadioButton rbDinheiro;
    private javax.swing.JRadioButton rbSoCartao;
    private javax.swing.JRadioButton rbSoDinheiro;
    private javax.swing.JRadioButton rbVendaTotal;
    private javax.swing.JTextArea taSaida;
    private javax.swing.JTextField tfDescricao;
    private javax.swing.JTextField tfEstoque;
    private javax.swing.JTextField tfQuantidade;
    private javax.swing.JTextField tfValor;
    private javax.swing.JTextField tfcodigo;
    // End of variables declaration//GEN-END:variables
}
