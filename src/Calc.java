/**
 * калькулятор для вычисления обратной польской последовательности 
 * + реализована унарная операция
 */
import java.util.regex.*;
public class Calc {
    public static void main (String[] args){
     execEq ee = new execEq(10); 
     ee.setActions(new Action[]{new APlus(),new AMinus()
                  ,new AMult(), new ADiv()
                  ,new AChgS()
                  });
     System.out.println(
     ee.calcArray(args)
     );
     
    }
}
class Turn{
    protected int top;
    protected int maxSize;
    double[] stack;
    public Turn(int sizeOfStack){
        stack  = new double[sizeOfStack];
        maxSize = sizeOfStack;
        top = 0;
    }
    void push(double value){
        if (top >= maxSize){
            error("Small buffer size!");
        }else{
        stack[top++] = value;
debug("push("+stack[top-1]+")");            
        }
    }
    double pop(){
        double rv = Double.POSITIVE_INFINITY;
        if (top<=0){
             error("buffer is empty");
        }else{
            rv = stack[--top];
debug("pop("+stack[top]+")");            
        }
        return rv;
    }
    void error(String error){
        System.out.println(error);
    }
    void debug(String d){
        System.out.println(d);
    }
};
class execEq extends Turn{
    private Action[] action;
    public static final Pattern pat = 
    Pattern.compile("[+|-]{0,1}\\d{0,20}(\\.\\d{0,20}){0,1}([e|E][+|-]{0,1}){0,1}\\d{1,20}");
    public execEq(int sizeOfStack){
        super(sizeOfStack);
    }
    public void setActions(Action[] act){
        action = act;
        for(Action a: action){
 //debug("set init for "+ a.getToken());
            a.init(this);
        }
    }
    public double calcArray(String [] elements){
        for(String e : elements){
            Matcher m = pat.matcher(e);
            if(m.matches()){
//                debug("THe diggit "+ e);
                push(Double.parseDouble(e));
            }else{
//                debug("This is not a diggit "+e);
                execComm(e);
            }
        }
       return pop(); 
    }
    public void execComm(String cmd){
        boolean wellKnown = false;
        for(Action a :action){
            wellKnown = (a.exec(cmd)> 0);
            if (wellKnown){
                break;
            };
        }
        if (!wellKnown){
            error("Unknown operation '"+cmd+"'");
        }
    };
}

interface operator{
    int exec(String cmd);
}

class Action implements  operator{
    String token;
    Turn turn;
    int  paramCount;
    int  retCount;
    void init(Turn ipTurn){
        turn = ipTurn;
    }
    double[] getParam(){
        double[] arg = new double[paramCount];
        for(int i=0;i<paramCount;i++){
            arg[paramCount-i-1]=turn.pop();
        }
        return arg;
    }
    void setResult(double[]res){
        for(double r : res){
            turn.push(r);
        }
    }
    public int exec(String cmd){
        int rv = 0;
//turn.debug("compare "+ token + " vs "+ cmd);
        if(token.equals(cmd)){
//turn.debug("it's me");
            setResult(runIt(getParam()));
            rv++;
        }
        return rv;
    }
    public double[] runIt(double[]arg){
        return new double[0];
    };
    String getToken(){
        return token;
    }
}

class APlus extends Action{
    public APlus(){
        token = "+";
        paramCount = 2;
        retCount = 1;
    }
    public double[] runIt(double[]arg){
        double[] rv= new double[retCount];
        rv[0] = arg[0] + arg[1];
turn.debug("> "+arg[0]+" + "+arg[1]+" = "+rv[0]);
        return rv;
    };
}
class AMinus extends Action{
    public AMinus(){
        token = "-";
        paramCount = 2;
        retCount = 1;
    }
    public double[] runIt(double[]arg){
        double[] rv= new double[retCount];
        rv[0] = arg[0] - arg[1];
turn.debug("> "+arg[0]+" - "+arg[1]+" = "+rv[0]);
        return rv;
    };
}
class AMult extends Action{
    public AMult(){
        token = "*";
        paramCount = 2;
        retCount = 1;
    }
    public double[] runIt(double[]arg){
        double[] rv= new double[retCount];
        rv[0] = arg[0] * arg[1];
turn.debug("> "+arg[0]+" * "+arg[1]+" = "+rv[0]);        
        return rv;
    };
}
class ADiv extends Action{
    public ADiv(){
        token = "/";
        paramCount = 2;
        retCount = 1;
    }
    public double[] runIt(double[]arg){
        double[] rv= new double[retCount];
        rv[0] = arg[0] / arg[1];
turn.debug("> "+arg[0]+" / "+arg[1]+" = "+rv[0]);        
        return rv;
    };
}
class AChgS extends Action{
    public AChgS(){
        token = "~";
        paramCount = 1;
        retCount = 1;
    }
    public double[] runIt(double[]arg){
        double[] rv= new double[retCount];
        rv[0] = -arg[0];
turn.debug("> "+arg[0]+" * -1  = "+rv[0]);              
        return rv;
    };
}
