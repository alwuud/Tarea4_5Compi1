

package tarea4_5;
import java_cup.runtime.Symbol; 

%% 



%class Lexico
%public 
%line 
%char 
%column
%cup 
%unicode





 
FinLinea = \r|\n|\r\n
Espacio    =  [ \t\f\b\012]

n=(\-)?[0-9]+





%%


<YYINITIAL>{

    {Espacio} {} 
    {FinLinea} {yycolumn=1;}
 
    "(" {return new Symbol(sym.parIzq,yyline,yycolumn, yytext());} 
    ")" {return new Symbol(sym.parDer,yyline,yycolumn, yytext());} 
    "," {return new Symbol(sym.coma, yyline, yycolumn, yytext());}
    {n} {return new Symbol(sym.num, yyline, yycolumn, yytext());}
    . { System.out.println("Error Lexico");}
}


