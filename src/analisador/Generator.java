/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisador;
import java.io.File;
import java.nio.file.Paths;
/**
 * CLASSE QUE GERA O ARQUIVO LEXER.JAVA, OBS: NÃO UTILIZADA
 * @author D3NN3R_
 */
public class Generator {

    public static void main(String[] args) {

        String rootPath = Paths.get("").toAbsolutePath(). toString();
        String subPath = "/src/analisador/";

        String file = rootPath + subPath + "Minijava.lex";

        File sourceCode = new File(file);

        jflex.Main.generate(sourceCode);

    }
}