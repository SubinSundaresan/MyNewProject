import java.util.Scanner;
public class Family {
    String fatherName;
    String motherName;
    String daughterName;
    String sonName;
    int fathersalary;
    int mothersalary;
    int daughterfee;
    int sonfee;
    int grocery = 500;
    static int totalsalary;
    static int totalfee;
    static int totalsavings;
    public Family(String f,String m, String d,String s){
        fatherName = f;
        motherName = m;
        daughterName = d;
        sonName = s;
    }
    public Family(int fsalary,int msalary, int dfee,int sfee){
        fathersalary = fsalary;
        mothersalary = msalary;
        daughterfee = dfee;
        sonfee = sfee;
    }
    void displayName(){
        System.out.println("Family Members are: " + "Father:" +fatherName + " Mother:" + motherName + " Daughter:" + daughterName + " Son:"+ sonName);}
    void getTotalSalary(){
        totalsalary = fathersalary+mothersalary;
        System.out.println("total salary =" + totalsalary);
    }
    void getTotalFees(){
        totalfee = daughterfee+sonfee;
        System.out.println("Total fee : " +totalfee); }
    void getSavings(){
        totalsavings=totalsalary - grocery - totalfee;
        System.out.println("Total savings is: " + totalsavings);
    }
    void congrats(){
        if (totalsavings>=1000){
            System.out.println("Congratulations!! " + fatherName + " you saved" + totalsavings);}
        else{
            System.out.println("Dear " + fatherName + "!! try to save for next month");
        }
    }
    public static void main(String[] args) {
        Family details = new Family("VINIL","JENNY","SANTRA","JACK");
        Family salary = new Family(4500,4500,5000,2500);
        details.displayName();
        salary.getTotalSalary();
        salary.getTotalFees();
        salary.getSavings();
        details.congrats();
    }}