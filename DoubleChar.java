import java.util.Locale;
import java.util.Scanner;

public class DoubleChar {
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        int i;
        char temp[] = new char[str1.length() * 2];
        temp = str1.toCharArray();
        char result[] = new char[str1.length()*2];
        int k=0;
        for (i=0;i<=str1.length()-1;i++){
            for(int j=k;j<=k;){
            result[j]=temp[i];
            result[j+1]=temp[i];
            j=j+2;
            k=j;
            break;}}
        System.out.println(result);

    }}