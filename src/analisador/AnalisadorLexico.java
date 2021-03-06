/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisador;

import java.awt.Dimension;
import java.io.StringReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import sintatico.Java8Lexer;
import sintatico.Java8Parser;
import sintatico.Sintaxe;

/**
 *
 * @author D3NN3R_
 */
public class AnalisadorLexico extends javax.swing.JFrame {

    /**
     * Creates new form AnalisadorLexico
     */
    public AnalisadorLexico() {
        initComponents();
        btnGerarArvore.setVisible(false);
        path = "saidaAnalisador.txt";
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
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEntrada = new javax.swing.JTextArea();
        btnNovo = new javax.swing.JButton();
        btnProcurar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtSaida = new javax.swing.JTextArea();
        btnIniciar = new javax.swing.JButton();
        btnVefSintaxe = new javax.swing.JButton();
        txtResult = new javax.swing.JLabel();
        btnGerarArvore = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Analisador Léxico - Compiladores");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtEntrada.setColumns(20);
        txtEntrada.setRows(5);
        txtEntrada.setEnabled(false);
        txtEntrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEntradaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txtEntrada);

        btnNovo.setText("NOVO");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnProcurar.setText("PROCURAR");
        btnProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarActionPerformed(evt);
            }
        });

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProcurar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtSaida.setColumns(20);
        txtSaida.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtSaida.setRows(5);
        txtSaida.setEnabled(false);
        jScrollPane2.setViewportView(txtSaida);

        btnIniciar.setText("INICIAR");
        btnIniciar.setEnabled(false);
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        btnVefSintaxe.setText("Verificar Sintaxe");
        btnVefSintaxe.setEnabled(false);
        btnVefSintaxe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVefSintaxeActionPerformed(evt);
            }
        });

        btnGerarArvore.setText("Gerar Árvore");
        btnGerarArvore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarArvoreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVefSintaxe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGerarArvore)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(7, 7, 7))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnGerarArvore)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVefSintaxe, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        
        btnCancelarActionPerformed(evt);
        txtEntrada.setEnabled(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void txtEntradaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEntradaKeyReleased
        if (txtEntrada.getText().trim().length() > 0) {//se contiver caracteres no campo entrada
            btnIniciar.setEnabled(true);//habilita botão iniciar
            btnProcurar.setEnabled(false);/*desabilita o botão procurar*/
        } else {
            btnIniciar.setEnabled(false);
            btnProcurar.setEnabled(true);
        }
    }//GEN-LAST:event_txtEntradaKeyReleased

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        limparArquivo();//limpa o arquivo de saida que é lido para mostrar os tokens no campo saida
        Lexers lexical = new Lexers(new StringReader(txtEntrada.getText()));//pega o codigo do campo de entrada
        try {
            lexical.yylex();//gera um arquivo de saida com os tokens
        } catch (IOException ex) {
            Logger.getLogger(AnalisadorLexico.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scanner line = null;
        try {
            line = new Scanner(new BufferedReader(new FileReader("saidaAnalisador.txt")));//lê o arquivo saida 
            while (line.useDelimiter("\n").hasNext()) {
                txtSaida.setText(txtSaida.getText() + line.nextLine() + '\n');//printa a saida de tokens no campo de saida
            }

            if (!txtSaida.getText().contains("Erro")) {
                btnVefSintaxe.setEnabled(true);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AnalisadorLexico.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            line.close();
        }

        escreverCodigo();
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarActionPerformed
        JFileChooser fc = new JFileChooser();//seletor de arquivos
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);//apenas arquivos serão lidos e não pastar
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Arquivo texto *.txt", "txt");//regra para apenas arquivos txt
        fc.setFileFilter(filtro);//aplicando o filtro
        int escolha = fc.showOpenDialog(this);
        if (escolha == JFileChooser.APPROVE_OPTION) {//se o arquivo foi selecionado
            txtEntrada.setText(null);//limpa o campo entrada
            btnNovo.setEnabled(false);//desabilita o botão novo
            btnIniciar.setEnabled(true);//habilita o botão iniciar
            txtEntrada.setEnabled(false);//desabilita o campo de entrada para não ser modificado o codigo do arquivo
            this.path = fc.getSelectedFile().getPath();//getPath retorn o caminho do arquivo escolhido
            Scanner line = null;
            try {
                line = new Scanner(new BufferedReader(new FileReader(this.path)));
                while (line.hasNext()) {
                    txtEntrada.setText(txtEntrada.getText() + line.nextLine() + '\n');//preenche a entrada com o texto que esta dentro do arquivo
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(AnalisadorLexico.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                line.close();
            }

        }
    }//GEN-LAST:event_btnProcurarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtSaida.setText(null);
        txtEntrada.setText(null);
        btnIniciar.setEnabled(false);
        btnNovo.setEnabled(true);
        txtEntrada.setEnabled(false);
        btnProcurar.setEnabled(true);
        btnVefSintaxe.setEnabled(false);
        btnGerarArvore.setVisible(false);
        txtResult.setText(null);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnVefSintaxeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVefSintaxeActionPerformed
        try {
            if (new Sintaxe().verificarSintaxe()) {
                txtResult.setText("Não existe erros sintáticos!");
                btnGerarArvore.setVisible(true);
            } else {
                txtResult.setText("O código contém erros sintáticos!");
                btnGerarArvore.setVisible(false);
            }
        } catch (IOException ex) {
            Logger.getLogger(AnalisadorLexico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnVefSintaxeActionPerformed

    private void btnGerarArvoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarArvoreActionPerformed
        try {
            gerarArvore();
        } catch (IOException ex) {
            Logger.getLogger(AnalisadorLexico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGerarArvoreActionPerformed
    /**
     * Método para limpar o arquivo de saída para não repetir os tokens
     */
    private void limparArquivo() {
        txtSaida.setText(null);
        BufferedWriter br = null;
        try {
            br = new BufferedWriter(new FileWriter("saidaAnalisador.txt", false));
            br.write("");
        } catch (IOException ex) {
            Logger.getLogger(AnalisadorLexico.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.flush();
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(AnalisadorLexico.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    private void escreverCodigo() {
        BufferedWriter br = null;

        try {
            br = new BufferedWriter(new FileWriter(new File("TesteSintatico.java"), false));
            br.write(txtEntrada.getText());
        } catch (IOException ex) {
            Logger.getLogger(AnalisadorLexico.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.flush();
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(AnalisadorLexico.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    private void gerarArvore() throws IOException {
        CharStream cs = CharStreams.fromFileName("TesteSintatico.java");
        Java8Lexer lexer = new Java8Lexer(cs);

        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        Java8Parser parser = new Java8Parser(commonTokenStream);
        ParseTree parseTree = parser.compilationUnit();

        JFrame frame = new JFrame("Gerador Arvore Sintática");

        JPanel panel = new JPanel();
        JScrollPane js = new JScrollPane(panel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        js.setPreferredSize(new Dimension(500, 500));
        TreeViewer viewr = new TreeViewer(Arrays.asList(
                parser.getRuleNames()), parseTree);

        viewr.setScale(1.5);
        panel.add(viewr);

        frame.add(js);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setMinimumSize(new Dimension(800,800));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
////        try {
////            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
////                if ("Nimbus".equals(info.getName())) {
////                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
////                    break;
////                }
////            }
////        } catch (ClassNotFoundException ex) {
////            java.util.logging.Logger.getLogger(AnalisadorLexico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        } catch (InstantiationException ex) {
////            java.util.logging.Logger.getLogger(AnalisadorLexico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        } catch (IllegalAccessException ex) {
////            java.util.logging.Logger.getLogger(AnalisadorLexico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
////            java.util.logging.Logger.getLogger(AnalisadorLexico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    UIManager.setLookAndFeel(new com.jtattoo.plaf.mcwin.McWinLookAndFeel());
                    AnalisadorLexico.setDefaultLookAndFeelDecorated(true);
                } catch (Exception e) {
                    System.err.print("Não Carregado");
                }
                new AnalisadorLexico().setVisible(true);
            }
        });
    }
    private String path;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGerarArvore;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnProcurar;
    private javax.swing.JButton btnVefSintaxe;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtEntrada;
    private javax.swing.JLabel txtResult;
    private javax.swing.JTextArea txtSaida;
    // End of variables declaration//GEN-END:variables
}
