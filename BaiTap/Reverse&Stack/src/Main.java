import java.util.Scanner;

public class Main {
    private static void StackOfInteger(){
        MyStack<Integer> stack = new MyStack();
        int[] number = new int[5];
        for(int i = 0; i < number.length; i++){
            number[i] = i+1;
            System.out.print(number[i]);
        }
        System.out.println("");
        for(int j = 0; j < number.length; j++){
            stack.push(number[j]);
        }
        for (int k = 0; k < number.length; k++){
            number[k] = stack.pop();
        }

        for (int x : number) {
            System.out.print(x);
        }
    }

    private static void StackOfString(){
        MyStack<String> string = new MyStack();
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("nhap 1 chuoi");
        String str = scanner.nextLine();
        String[] arrStr = str.split("");
        for (int i = 0; i < arrStr.length; i++){
            string.push(arrStr[i]);
        }
        for (int i = 0; i < arrStr.length; i++){
            arrStr[i] = string.pop();
        }
        for (String x : arrStr) {
            System.out.print(x);
        }
    }
    public static void main(String[] args) {
        StackOfInteger();
        StackOfString();
    }
}
