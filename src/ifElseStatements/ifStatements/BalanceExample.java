package ifElseStatements.ifStatements;

public class BalanceExample {
    public static void main(String[] args) {

        double balance = 150;
        // you can use relational and logical operators
        // expression which is gonna be true if balance is less than 0
        boolean isBalanceLessThan0 = balance > 0; // output false
        boolean isBalanceEquals100 = balance == 0; // false
        boolean isBalanceBiggerOrEqualThan100 = balance >= 1000; //false

        //Create an expression for checking if balance is not equals to -1

        boolean bal = balance != -1; //true

        if(bal){ //if it is true execute, otherwise skip. We use it when we have a condition
            System.out.println("Your balance is not equal to -1");
        }




    }
}
