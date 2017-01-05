package calculator4;
 
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
 
public class Calculator4
{
  public static void main(String[] args) throws Exception
  {
    Calculator4Lexer lexer = new Calculator4Lexer(new ANTLRFileStream(args[0]));
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    Calculator4Parser p = new Calculator4Parser(tokens);
    p.setBuildParseTree(true);
    p.addParseListener(new Calculator4ConcreteListener());
    //ParserRuleContext<Token> t = p.program();
    ParserRuleContext t = p.program();
  }
}
