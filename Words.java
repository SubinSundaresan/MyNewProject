import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import javafx.util.converter.LocalDateTimeStringConverter;
import javafx.util.converter.TimeStringConverter;

import java.time.*;
import java.util.Arrays;
import java.util.Locale;

public class Words {

    public static void main(String[] args) {
       /* Stringlengths obj1 = new Stringlengths();
        char name[] = {'S', 'u', 'b', 'i', 'n'};
        String str1 = new String(name);
        System.out.println("name: " + str1.concat(" Sundaresan"));
        System.out.println(str1.length());
        System.out.println(str1.substring(0, 2));
        StringBuilder str3= new StringBuilder();
        System.out.println(str3.toString());
        System.out.println(str3.append("ffffff"));
        System.out.println(str3.capacity());
        System.out.println(name.hashCode());
Stringlengths obj2= new Stringlengths();
        System.out.println(DayOfWeek.of(5));*/

        String sample = "So, the Delta variant is a variant of concern that WHO is tracking and monitoring around the world. It's a variant of concern because we know it has increased transmissibility. This has been demonstrated by several countries. And we know that where the Delta variant is identified, it really rapidly takes off and spreads between people more efficiently than even the Alpha variant that was first detected around December, January 2021. As of today, the Delta variant has been reported in 96 countries and we expect that the Delta variant will continue to spread. There are a number of factors that are contributing to increased transmission around the world. The first are these variants of concern, including the Delta variant. The second factor is that we have increased social mixing and increased social mobility, which increases the number of contacts that individuals have. The third factor is the relaxation or the inappropriate use of public health and social measures. Proven public health and social measures that we know prevent infections, reduce the spread of somebody who is infected with the virus to others and save lives. And the fourth factor is the uneven and inequitable distribution of vaccines";
        int counter1=0;
        String lowerstrng = sample.toLowerCase();
        String splitl[]=lowerstrng.split(" ");
        System.out.println("Words starting with 'c' : ");
        for(int j=0;j<= splitl.length-1;j++){
            boolean check = splitl[j].startsWith("c");
            if(check==true){
                System.out.println(splitl[j]);
                counter1 = counter1+1;
            }else{
                continue;
            }
        }
        System.out.println(counter1+" words starting with 'c'");

        String slower = sample.toLowerCase();
        int len = sample.length() - 1;
        char temp1[]=sample.toCharArray();
        int counter = 0;
        boolean scontain;
        String sn;
        for (int i = 0; i < sample.length(); i++) {
            if(temp1[i]== 'c'){
                counter = counter+1;
            }else{
                continue;
            }}System.out.println("genkin");//added a new change to commit
        System.out.println("letter 'c' repeated "+counter+" times");}}



