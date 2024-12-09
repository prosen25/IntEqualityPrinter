//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
    }

    public static void printEqual(int arg1, int arg2, int arg3) {

        if (arg1 < 0 || arg2 < 0 || arg3 < 0) {

            System.out.println("Invalid Value");
        } else {

            if (arg1 == arg2 && arg2 == arg3) {

                System.out.println("All numbers are equal");
            } else if (arg1 != arg2 && arg2 != arg3 && arg1 != arg3) {

                System.out.println("All numbers are different");
            } else {

                System.out.println("Neither all are equal or different");
            }
        }
    }
}