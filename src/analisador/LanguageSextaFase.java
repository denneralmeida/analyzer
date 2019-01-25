/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisador;

/**
 *
 * @author D3NN3R_
 */
import java.io.IOException;
import java.io.StringReader;

public class LanguageSextaFase {
    /**
     * Classe não utilizada
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {

        String expr = "public static void main ; package"; //teste de codigo
        //System.out.println("<"+lexema+" , "+descricao+">");
        Lexers lexical = new Lexers(new StringReader(expr));//gerador de lexema
        lexical.yylex();//imprimi os tokens;

    }
}
