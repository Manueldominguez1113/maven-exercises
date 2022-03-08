import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;
public class input {

    public static void run(int input) {
        System.out.println(input + " hm.. this is a number!");
    }

    public static void run(String input) {
        System.out.println(input + " hm.. this is a String!");
        System.out.println("FlipCase!: " + StringUtils.swapCase(input));
        System.out.println("Reversed!: "+StringUtils.reverse(input));
}


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter something");
        String input = scanner.next();
        run(input);

    }


}
