package lk.rasheeda.model;


interface Expression{

    public int interpret();

}

class TerminalExpression implements Expression{

    private int value;

    public TerminalExpression(int value){
        this.value=value;
    }

    @Override
    public int interpret() {
        return this.value;
    }
}

class NonTerminalExpression1 implements Expression{

    private Expression e1;
    private Expression e2;

    public NonTerminalExpression1(Expression e1,Expression e2) {
        this.e1=e1;
        this.e2=e2;
    }


    @Override
    public int interpret() {
        return e1.interpret()+e2.interpret();
    }
}

class NonTerminalExpression2 implements Expression{

    private Expression e1;
    private Expression e2;

    public NonTerminalExpression2(Expression e1,Expression e2) {
        this.e1=e1;
        this.e2=e2;
    }


    @Override
    public int interpret() {
        return e1.interpret()-e2.interpret();
    }
}

public class Test {

    public static void main(String[] args) {

        Expression e1
                = new NonTerminalExpression1(new TerminalExpression(10),new TerminalExpression(20));

        Expression e2 = new NonTerminalExpression2(new NonTerminalExpression2
                (new TerminalExpression(10),new TerminalExpression(20))
                ,new TerminalExpression(50));

        System.out.println(e1.interpret());
        System.out.println(e2.interpret());

    }

}


