import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Utility {
	   public static int addNumbers(int n1, int n2){
	        int sum = 0;
	        sum = n1 + n2 ;
	        return sum;
	   }
	   public static int subtractNumbers(int n1, int n2)
	   {
	        int diff = 0;
	        diff = n1 - n2;
	        return diff;
	    }
	    public static int multiplyNumbers(int n1, int n2){
	        int product = 0;
	        product = n1 * n2 ;
	        return product;
	    }
	    public static int divideNumbers(int n1, int n2){
	        int quotient = 0;
            if (n2 == 0) {
        throw new ArithmeticException("Cannot divide by zero");
    }
	        quotient = n1 / n2 ;
	        return quotient;
	    }
	}
class Tester {
    public static void main(String[] arr){
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        List<Integer> numbers = Arrays.stream(inputString.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int n1 = numbers.get(0);
        int n2 =  numbers.get(1);
        int sum = Utility.addNumbers(n1,n2);
        int diff = Utility.subtractNumbers(n1,n2);
        int product = Utility.multiplyNumbers(n1,n2);
        int quotient = Utility.divideNumbers(n1,n2);
        System.out.println(sum+" "+diff+" "+product+" "+quotient);
		in.close();
    }
}