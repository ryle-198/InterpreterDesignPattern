public class MultiplicationExpression implements Expression{
    private Expression left;
    private Expression right;

    public MultiplicationExpression(Expression left, Expression right){
        this.left=left;
        this.right=right;
    }

    @Override
    public int interpret() {
        return left.interpret() * right.interpret();
    }
}
