import java.util.Scanner;

public class AddNumbyMtd {
    int add(int a, int b){
        int ans = a + b;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Enter two numbers to get their sum:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        AddNumbyMtd obj = new AddNumbyMtd(); // create object
        int sum = obj.add(a, b); // call the method

        System.out.println("Sum is: " + sum);
    }
}
