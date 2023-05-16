import java.util.Stack;

public class assignment {
    public static boolean question1(String input){
        int currentState = 0;
        for(int i = 0; i < input.length(); i++){
            switch (currentState){
                case 0:
                    if(input.charAt(i) == '0'){
                        currentState = 1;
                    }else if(input.charAt(i) == '1'){
                        currentState = 2;
                    }else{
                        currentState = 4;
                    }
                    break;
                case 1:
                    if(input.charAt(i) == '0'){
                        currentState = 0;
                    }else{
                        currentState = 4;
                    }
                    break;
                case 2:
                    if(input.charAt(i) == '1'){
                        currentState = 3;
                    }else{
                        currentState = 4;
                    }
                    break;
                case 3:
                    if(input.charAt(i) == '1'){
                        currentState = 2;
                    }else{
                        currentState = 4;
                    }
                    break;
            }
        }
        return (currentState == 3 || currentState == 0);
    }
    public static boolean question2(String input){
        int currentState = 0;
        for(int i = 0; i < input.length(); i++){
            switch (currentState){
                case 0:
                    if(input.charAt(i) == '0'){
                        currentState = 1;
                    }else if(input.charAt(i) == '1'){
                        currentState = 0;
                    }else{
                        currentState = 5;
                    }
                    break;
                case 1:
                    if(input.charAt(i) == '0'){
                        currentState = 2;
                    }else{
                        currentState = 5;
                    }
                    break;
                case 2:
                    if(input.charAt(i) == '0'){
                        currentState = 3;
                    }else{
                        currentState = 5;
                    }
                    break;
                case 3:
                    if(input.charAt(i) == '1'){
                        currentState = 4;
                    }else{
                        currentState = 5;
                    }
                    break;
                case 4:
                    if(input.charAt(i) == '1'){
                        currentState = 4;
                    }else if(input.charAt(i) == '0'){
                        currentState = 1;
                    }else{
                        currentState = 5;
                    }
                    break;
            }
        }
        return (currentState == 4);
    }

    public static boolean question3(String input){
        Stack<Character> stack = new Stack<>();

        // Push the first half of the input onto the stack
        int length = input.length();
        for (int i = 0; i < length / 2; i++) {
            stack.push(input.charAt(i));
        }

        // Pop characters from the stack and compare with the second half of the input
        int i = length % 2 == 0 ? length / 2 : length / 2 + 1;
        while (i < length) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
            i++;
        }

        return true;
    }
}
