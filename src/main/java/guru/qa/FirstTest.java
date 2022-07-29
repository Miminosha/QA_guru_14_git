package guru.qa;

public class FirstTest {
    public static void main (String[] args){
        int num1 = 5, num2 = 4;
        if (num1 == num2){
            System.out.println("У вас равенство");
        } else if (num1 > num2){
            System.out.println("У вас неравенство, первое число больше второго");
        } else {
            System.out.println("У вас неравенство, второе число больше первого");
        }
    }
}
