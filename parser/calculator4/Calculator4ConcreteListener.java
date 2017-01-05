package calculator4;
 
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
 
import calculator4.Calculator4Parser.AddOrSubtractContext;
import calculator4.Calculator4Parser.ArgContext;
import calculator4.Calculator4Parser.AssignmentContext;
import calculator4.Calculator4Parser.IntegerContext;
import calculator4.Calculator4Parser.MultOrDivContext;
import calculator4.Calculator4Parser.PrintContext;
 
public class Calculator4ConcreteListener extends Calculator4BaseListener
{
  public Stack<Integer>       stack = new Stack<Integer>();
  public Map<String, Integer> sym   = new HashMap<String, Integer>();
 
  public void exitPrint(PrintContext ctx)
  {
    for (ArgContext argCtx : ctx.arg())
    {
      if (argCtx.ID() != null)
      {
        System.out.print(sym.get(argCtx.ID().getText()));
      }
      else
      {
        System.out.print(argCtx.STRING().getText().replaceAll("^\"|\"$", ""));
      }
    }
    System.out.println();
  }
 
  public void exitAssignment(AssignmentContext ctx)
  {
    sym.put(ctx.ID().getText(), stack.pop());
  }
 
  public void exitInteger(IntegerContext ctx)
  {
    stack.push(new Integer(ctx.INT().getText()));
  }
 
  public void exitAddOrSubtract(AddOrSubtractContext ctx)
  {
    Integer op1 = stack.pop();
    Integer op2 = stack.pop();
    if (ctx.getChild(1).getText().equals("-"))
    {
      stack.push(op2 - op1);
    }
    else
    {
      stack.push(op1 + op2);
    }
  }
 
  public void exitMultOrDiv(MultOrDivContext ctx)
  {
    Integer op1 = stack.pop();
    Integer op2 = stack.pop();
    if (ctx.getChild(1).getText().equals("/"))
    {
      stack.push(op2 / op1);
    }
    else
    {
      stack.push(op2 * op1);
    }
  }
}
