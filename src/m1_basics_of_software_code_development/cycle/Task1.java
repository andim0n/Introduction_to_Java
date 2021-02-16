package m1_basics_of_software_code_development.cycle;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter positive number: ");
        int number = scanner.nextInt();
        int sum = 0;
        for(int i = 0; i < number; i++){
            sum += i;
        }
        System.out.print(sum);
    }
}
