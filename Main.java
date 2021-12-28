import java.util.*;

public class Main
{
   
    public static boolean isNumeric(String str) {
  try {  
    Integer.parseInt(str);  
    return true;
  }
  catch(NumberFormatException e){  
    return false;  
  }  
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String s1=sc.nextLine();
String s2=sc.nextLine();
String []l1=s1.split(" ");
String []l2=s2.split(" ");
for(int i=0;i<l1.length;i++)
{
    String temp="";
    String []k=l1[i].split("");
    int n=k.length;
    for(int j=0;j<k.length;j++)
    {
        if(",.".contains(k[j]))
        {
            k[j]="";
        }
    }
    l1[i]=String.join("",k).toLowerCase();
}
for(int i=0;i<l2.length;i++)
{
    String temp="";
    String []k=l2[i].split("");
    int n=k.length;
    for(int j=0;j<k.length;j++)
    {
        if(",.".contains(k[j]))
        {
            k[j]="";
        }
    }
    l2[i]=String.join("",k).toLowerCase();
}
int a=0;
int b=0;

for(String i:l1){
   if(i.length()>7){
       a=a+3;
   }
   else if((i.length()>=5) && (i.length()<8)){
       a=a+1;
   }
   else if(isNumeric(i)){
       a=a+4;
   }
}
for(String i:l2){
   if(i.length()>7 && Arrays.asList(l1).contains(i)){
       b=b+3;
   }
   else if(i.length()>=5 && i.length()<8 && Arrays.asList(l1).contains(i)){
       b=b+1;
   }
   else if(isNumeric(i) && Arrays.asList(l1).contains(i)){
       b=b+4;
   }
}
double result=((b*100.0)/a);
double roundOff = Math.round(result * 100.0) / 100.0;
System.out.println(roundOff);
}
}