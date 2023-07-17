import java.util.Scanner;

public class Check_Bit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int bit = scanner.nextInt();
        System.out.println(bitter(number,bit));

}

    static int bitter(int number, int bit) {
        if(number==(number|(1<<bit))){
            return 1;
        }
        else{
            return 0;
        }
    }
}
