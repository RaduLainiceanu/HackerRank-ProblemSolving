import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the timeInWords function below.
    static String timeInWords(int h, int m) {
        String theTimeIs = "";
        if( m==00 ){
            switch(h){
                case 1:
                    theTimeIs = "one o' clock";
                    break;
                case 2:
                    theTimeIs = "two o' clock";
                    break;
                case 3:
                    theTimeIs = "three o' clock";
                    break;
                case 4:
                    theTimeIs = "four o' clock";
                    break;
                case 5:
                    theTimeIs = "five o' clock";
                    break;
                case 6:
                    theTimeIs = "six o' clock";
                    break;
                case 7:
                    theTimeIs = "seven o' clock";
                    break;
                case 8:
                    theTimeIs = "eight o' clock";
                    break;
                case 9:
                    theTimeIs = "nine o' clock";
                    break;
                case 10:
                    theTimeIs = "ten o' clock";
                    break;
                case 11:
                    theTimeIs = "eleven o' clock";
                    break;
                case 12:
                    theTimeIs = "twelve o' clock";
                    break;
            }
        }
        else if( m <= 30 ){
            switch(m){
                case 1:
                    theTimeIs += "one minute past";
                    break;
                case 2:
                    theTimeIs += "two minutes past";
                    break;
                case 3:
                    theTimeIs += "three minutes past";
                    break;
                case 4:
                    theTimeIs += "four minutes past";
                    break;
                case 5:
                    theTimeIs += "five minutes past";
                    break;
                case 6:
                    theTimeIs += "six minutes past";
                    break;
                case 7:
                    theTimeIs += "seven minutes past";
                    break;
                case 8:
                    theTimeIs += "eight minutes past";
                    break;
                case 9:
                    theTimeIs += "nine minutes past";
                    break;
                case 10:
                    theTimeIs += "ten minutes past";
                    break;
                case 11:
                    theTimeIs += "eleven minutes past";
                    break;
                case 12:
                    theTimeIs += "twelve minutes past";
                    break;
                case 13:
                    theTimeIs += "thirteen minutes past";
                    break;
                case 14:
                    theTimeIs += "fourteen minutes past";
                    break;
                case 15:
                    theTimeIs += "quarter past";
                    break;
                case 16:
                    theTimeIs += "sixteen minutes past";
                    break;
                case 17:
                    theTimeIs += "seventeen minutes past";
                    break;
                case 18:
                    theTimeIs += "eighteen minutes past";
                    break;
                case 19:
                    theTimeIs += "nineteen minutes past";
                    break;
                case 20:
                    theTimeIs += "twenty minutes past";
                    break;
                case 21:
                    theTimeIs += "twenty one minutes past";
                    break;
                case 22:
                    theTimeIs += "twenty two minutes past";
                    break;
                case 23:
                    theTimeIs += "twenty three minutes past";
                    break;
                case 24:
                    theTimeIs += "twenty four minutes past";
                    break;
                case 25:
                    theTimeIs += "twenty five minutes past";
                    break;
                case 26:
                    theTimeIs += "twenty six minutes past";
                    break;
                case 27:
                    theTimeIs += "twenty seven minutes past";
                    break;
                case 28:
                    theTimeIs += "twenty eight minutes past";
                    break;
                case 29:
                    theTimeIs += "twenty nine minutes past";
                    break;
                case 30:
                    theTimeIs += "half past";
                    break;
            }
            switch(h){
                case 1:
                    theTimeIs += " one";
                    break;
                case 2:
                    theTimeIs += " two";
                    break;
                case 3:
                    theTimeIs += " three";
                    break;
                case 4:
                    theTimeIs += " four";
                    break;
                case 5:
                    theTimeIs += " five";
                    break;
                case 6:
                    theTimeIs += " six";
                    break;
                case 7:
                    theTimeIs += " seven";
                    break;
                case 8:
                    theTimeIs += " eight";
                    break;
                case 9:
                    theTimeIs += " nine";
                    break;
                case 10:
                    theTimeIs += " ten";
                    break;
                case 11:
                    theTimeIs += " eleven";
                    break;
                case 12:
                    theTimeIs += " twelve";
                    break;
            }
        }
        else{
            switch(m){
                case 31:
                    theTimeIs += "twenty nine minutes to";
                    break;
                case 32:
                    theTimeIs += "twenty eight minutes to";
                    break;
                case 33:
                    theTimeIs += "twenty seven minutes to";
                    break;
                case 34:
                    theTimeIs += "twenty six minutes to";
                    break;
                case 35:
                    theTimeIs += "twenty five minutes to";
                    break;
                case 36:
                    theTimeIs += "twenty four minutes to";
                    break;
                case 37:
                    theTimeIs += "twenty three minutes to";
                    break;
                case 38:
                    theTimeIs += "twenty two minutes to";
                    break;
                case 39:
                    theTimeIs += "twenty one minutes to";
                    break;
                case 40:
                    theTimeIs += "twenty minutes to";
                    break;
                case 41:
                    theTimeIs += "nineteen minutes to";
                    break;
                case 42:
                    theTimeIs += "eighteen minutes to";
                    break;
                case 43:
                    theTimeIs += "seventeen minutes to";
                    break;
                case 44:
                    theTimeIs += "sixteen minutes to";
                    break;
                case 45:
                    theTimeIs += "quarter to";
                    break;
                case 46:
                    theTimeIs += "fourteen minutes to";
                    break;
                case 47:
                    theTimeIs += "thirteen minutes to";
                    break;
                case 48:
                    theTimeIs += "twelve minutes to";
                    break;
                case 49:
                    theTimeIs += "eleven minutes to";
                    break;
                case 50:
                    theTimeIs += "ten minutes to";
                    break;
                case 51:
                    theTimeIs += "nine minutes to";
                    break;
                case 52:
                    theTimeIs += "eight minutes to";
                    break;
                case 53:
                    theTimeIs += "seven minutes to";
                    break;
                case 54:
                    theTimeIs += "six minutes to";
                    break;
                case 55:
                    theTimeIs += "five minutes to";
                    break;
                case 56:
                    theTimeIs += "four minutes to";
                    break;
                case 57:
                    theTimeIs += "three minutes to";
                    break;
                case 58:
                    theTimeIs += "two minutes to";
                    break;
                case 59:
                    theTimeIs += "one minute to";
                    break;
            }
            switch(h){
                case 1:
                    theTimeIs += " two";
                    break;
                case 2:
                    theTimeIs += " three";
                    break;
                case 3:
                    theTimeIs += " four";
                    break;
                case 4:
                    theTimeIs += " five";
                    break;
                case 5:
                    theTimeIs += " six";
                    break;
                case 6:
                    theTimeIs += " seven";
                    break;
                case 7:
                    theTimeIs += " eight";
                    break;
                case 8:
                    theTimeIs += " nine";
                    break;
                case 9:
                    theTimeIs += " ten";
                    break;
                case 10:
                    theTimeIs += " eleven";
                    break;
                case 11:
                    theTimeIs += " twelve";
                    break;
                case 12:
                    theTimeIs += " one";
                    break;
            }
        }
        return theTimeIs;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int h = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = timeInWords(h, m);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
