import java.util.Scanner;

public class ElizaChat {

    public static void main(String [] args){
        Scanner keybd= new Scanner(System.in);
        String name, response1, response2;

        System.out.println("Welcome to ElizaChats! My name is Eliza, What's your name?");
        name= keybd.nextLine();
        System.out.println("Nice to meet you, "+name+", How has your day been?");
        response1=keybd.nextLine();
        System.out.println("Okay, Anything in particular that makes you feel that It has been a splendid day! ?");
        response2=keybd.nextLine();
        System.out.println("Okay, Well it has been my pleasure to speak with you. Have a nice day!");

        System.out.println("Here are your responses: "+name+" "+ response1+" "+ response2);


    }
}
