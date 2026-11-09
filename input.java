import java.util.Scanner;

public class input{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("enter your name: ");
        String userName = userInput.nextLine();
        System.out.println("what is your last name: ");
        String lastName = userInput.nextLine();
        System.out.println("enter your age: ");
        int age = userInput.nextInt();
        userInput.close();
        System.out.print(userName + " " + lastName + " is " + age + " years old.");

        while(age < 18){
            System.out.println(userName + " " + lastName + " is not old enough to vote");
            System.out.println(age);
            age++;
        }
        for(int i = 1; i < 6; i++){
            System.out.println("this is print number " + i + "/5");
        }
    }
}