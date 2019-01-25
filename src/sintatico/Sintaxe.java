/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sintatico;

import java.awt.Dimension;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.gui.TreeViewer;

/**
 *
 * @author User
 */
public class Sintaxe {

    public boolean verificarSintaxe() throws IOException {

        CharStream charStream = CharStreams.fromFileName("TesteSintatico.java");
        Java8Lexer java8Lexer = new Java8Lexer(charStream);

        CommonTokenStream commonTokenStream = new CommonTokenStream(java8Lexer);
        Java8Parser java8Parser = new Java8Parser(commonTokenStream);
        
        java8Parser.compilationUnit();
        
        return(java8Parser.getNumberOfSyntaxErrors() == 0);
//        ParseTree parseTree = java8Parser.compilationUnit();
//        
//            JFrame frame = new JFrame("Gerador Arvore Sintática");
//            
//            JPanel panel = new JPanel();
//            JScrollPane js = new JScrollPane(panel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
//            js.setPreferredSize(new Dimension(500, 500));
//            TreeViewer viewr = new TreeViewer(Arrays.asList(
//                    java8Parser.getRuleNames()), parseTree);
//            
//            viewr.setScale(1.5);
//            panel.add(viewr);
//            
//            
//            frame.add(js);
//            
//            
//            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
//            frame.setVisible(true);
            
//        if (java8Parser.getNumberOfSyntaxErrors() == 0) {
//            CharStream cs = CharStreams.fromFileName("TesteSintatico.java");
//            Java8Lexer lexer = new Java8Lexer(charStream);
//
//            CommonTokenStream cts = new CommonTokenStream(java8Lexer);
//            Java8Parser parser = new Java8Parser(commonTokenStream);
//
//           
//            ParseTree parseTree = parser.interfaceType();
//
//            JFrame frame = new JFrame("Analisador Sintático");
//            JPanel panel = new JPanel();
//            TreeViewer viewr = new TreeViewer(Arrays.asList(
//                    parser.getRuleNames()), parseTree);
//            viewr.setScale(1.5);
//            JButton plus = new JButton("+");
//            plus.setSize(20, 20);
//            plus.setLocation(panel.getWidth(), 0);
//            panel.add(viewr);
//            frame.add(panel);
//            panel.add(plus);
//            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
//            frame.setVisible(true);
//        }

    }

}
