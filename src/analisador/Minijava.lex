package analisador;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



%%
%{

    private void imprimir(String descricao, String lexema) {
        BufferedWriter saida= null;
        try {
            saida = new BufferedWriter(new FileWriter("saidaAnalisador.txt",true));
            saida.write("<" + lexema + " , " + descricao + ">\n");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao escrever arquivo texto:\n" + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            try {
                saida.flush();
                saida.close();
            } catch (IOException ex) {
                Logger.getLogger(LexerOld.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }
%}
%line
%column
%unicode
%standalone
%public
%class Lexers

letter          = [A-Z|a-z]
digit           = [0-9]
/*number	= ({integer}+)("."{digit}*)?*/
integer         = [1-9]{digit}+|{digit}
alphanumeric    = {letter}|{digit}
identifier      = ( _|{letter})( _|{alphanumeric})*
whitespace      = [ \n\t]
comment 	= "/*" [^*] ~"*/"
literal 	= "\"" [^*] ~"\""
commentSimple   = "//".*   
jdoc          = "/**" [^*] ~"*/"                      
%%


";"|"."|"="|"("|")"|"{"|"}"|"["|"]"|"," 
	{ imprimir("SIMBOLO SIMPLES",yytext()); }
"||"| "&&"| "=="| "!="|"<"| "<="|">"| ">="|"+"|"-"|"*"|"/"|"%"| "!" 
	{ imprimir("OPERADOR",yytext()); }
"class"| "public"| "extends"| "static"| "void"| "int"| "boolean"| 
"while"| "if"| "else"| "return"| "false"| "true"| "this"| "new" 
	{ imprimir("PALAVRA RESERVADA",yytext());  }
{identifier}    { imprimir("IDENTIFICADOR",yytext());  }
{integer}       { imprimir("INTEIRO",yytext()); }
{whitespace}    { /* Ignorar whitespace. */ }
{comment}	{ /* Ignorar Comment */ }
{commentSimple} { /* DO NOTHING */ }
{jdoc} { /* DO NOTHING */ }
{literal}        {imprimir("LITERAL",yytext()); }
     
"\\"            { imprimir("Erro Léxico: ",yytext()+ " linha: " + yyline + ", coluna: " + yycolumn);}

"/"            { imprimir("Erro Léxico: ",yytext()+ " linha: " + yyline + ", coluna: " + yycolumn); }

.            { imprimir("Erro Léxico: ",yytext()+ " linha: " + yyline + ", coluna: " + yycolumn);}