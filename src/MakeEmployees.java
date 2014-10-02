import TerminalIO.*;

public class MakeEmployees {

    public static void main(String[] args) {
        KeyboardReader kr = new KeyboardReader();
        String name = kr.readLine("Enter your name: ");
        System.out.println("Hello " + name);
    }
    
}
