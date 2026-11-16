public class Client {
    public static void main(String[] args) {

        //Manually building AST for 2 + 3 * 4
        Expression expression = new AdditionExpression(
                new NumberExpression(2),
                new MultiplicationExpression(new NumberExpression(3), new NumberExpression(4)
                )
        );

        int result = expression.interpret();
        System.out.println("Result: "+result);


    }
}
