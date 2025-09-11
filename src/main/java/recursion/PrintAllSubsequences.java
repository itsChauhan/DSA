package recursion;

public class PrintAllSubsequences {

    public static void solve(String inputString, String outputString){
        if(inputString!= null && inputString.isEmpty()){
            System.out.println(outputString);
            return;
        }

        String output2 = outputString;

        output2 = outputString.concat(String.valueOf(inputString.charAt(0)));
        inputString = inputString.substring(1);
        solve(inputString, outputString);
        solve(inputString,output2);
    }

    public static void printAllSubsequences(String inputString){
        solve(inputString, "");
    }

    public static void main(String[] args) {
        String s = "cool";
        printAllSubsequences(s);
    }
}
