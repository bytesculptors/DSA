import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        System.out.println(stack.empty());

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");

        // System.out.println(stack.pop());
        System.out.println(stack.peek());

        System.out.println(stack.search("DOOM"));
        
        System.out.println(stack);
    }
}
