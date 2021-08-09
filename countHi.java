import java.util.Scanner;

public class countHi {
    public static void main(String[] args) {
        System.out.println("Enter the string :");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Enter the 2 letter character sequence you want to find: ");
        Scanner sc1= new Scanner(System.in);
        String str1 = sc1.nextLine();
        char finder[]=str1.toCharArray();
        int counter=0;
        char temp[]= str.toCharArray();
        for(int j=0;j<str.length()-1;j++){
            if(temp[j]==finder[0] && temp[j+1]==finder[1]){
                counter = counter+1;
            }else{
                counter = counter+0;
            }}
        System.out.println("'"+str1+"'"+ " repeated " +counter + " time(s)");
        }
    }
