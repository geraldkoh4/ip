import java.util.Scanner;
public class Duke {
    public static void main(String[] args) {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n"
                + "__________________________\n";
        System.out.println("Hello from\n" + logo);
        System.out.println("Hello! Do you need anything from me?\n"
                + "I have only been trained to greet and echo you so far.\n"
                + "Once my owner is more proficient in what he does, he will give me more functions!");
        //To be added to make sure user input is read.

        String line;
        Scanner in = new Scanner(System.in);
        line = in.nextLine();
        while (!line.equals("Bye")) {
            System.out.println(line);
            line = in.nextLine();
        }
        System.out.println("That's all from me! Goodbye!");
    }
}
