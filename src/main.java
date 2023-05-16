public class main {
    public static void main(String[] args) {
//      testing question 1
        System.out.println("---------------question 1-----------------------");
        String[] inputs_1 = { "0", "1", "00", "01", "10", "11", "000", "001", "010", "011", "100", "101", "110", "111"};
        boolean[] expectedOutputs_1 = { false, false, true, false, false, true, false, false, false, false, false, false, false, false};
        for (int i = 0; i < inputs_1.length; i++) {
            boolean actualOutput = assignment.question1(inputs_1[i]);
            if (actualOutput == expectedOutputs_1[i]) {
                System.out.println("Input: " + inputs_1[i] + ", Expected Output: " + expectedOutputs_1[i] + ", Actual Output: " + actualOutput + " - Test Passed");
            } else {
                System.out.println("Input: " + inputs_1[i] + ", Expected Output: " + expectedOutputs_1[i] + ", Actual Output: " + actualOutput + " - Test Failed");
            }
        }
//        testing question 2
        System.out.println("----------question 2 ----------------------");
        String[] inputs_2 = { "0", "1", "00", "01", "10", "11", "000", "001", "010", "011", "100", "101", "110", "111","0001","10001","00001","00010001","00011"};
        boolean[] expected_2 = { false, false, false, false, false, false, false, false, false, false, false, false, false, false,true,true,false,true,true};
        for (int i = 0; i < inputs_2.length; i++) {
            boolean actualOutput = assignment.question2(inputs_2[i]);
            if (actualOutput == expected_2[i]) {
                System.out.println("Input: " + inputs_2[i] + ", Expected Output: " + expected_2[i] + ", Actual Output: " + actualOutput + " - Test Passed");
            } else {
                System.out.println("Input: " + inputs_2[i] + ", Expected Output: " + expected_2[i] + ", Actual Output: " + actualOutput + " - Test Failed");
            }
        }
//        testing question 3
        System.out.println("----------question 3 ----------------------");
//        String[] inputs_3 = { "0","00","01","101","1001", "0011","madam" };
        String[] inputs_3 = { "abba","madam","osos","alla","koooko" };
        boolean[] expected_3 = { true,true,false,true,false,};
        for (int i = 0; i < inputs_3.length; i++) {
            boolean actualOutput = assignment.question3(inputs_3[i]);
            if (actualOutput == expected_3[i]) {
                System.out.println("Input: " + inputs_3[i] + ", Expected Output: " + expected_3[i] + ", Actual Output: " + actualOutput + " - Test Passed");
            } else {
                System.out.println("Input: " + inputs_3[i] + ", Expected Output: " + expected_3[i] + ", Actual Output: " + actualOutput + " - Test Failed");
            }
        }
    }
}
