package Char_remove;
import java.util.Scanner;
public class Remove_char
{
public static void main(String args[])
{
System.out.println("Enter a string:");
Scanner s=new Scanner(System.in);
String s1=s.next();
s1=s1.toUpperCase();
boolean ch=true;
for(int l=0;l<s1.length();l++)
{
   char char1=s1.charAt(l);
   if(!(char1>='A' && char1<='Z'))
   {
                ch=false;
       break;
   }
}
if(ch==true)
{
  if(s1.length()>=2)
  {
    String string1=""; //string1 is a substring of string that contains first two characters of string
    for(int i=0;i<=1;i++)
    {
        string1=string1+s1.charAt(i);
    }
    String string2=""; //string2 is the other substring of string that contains remaining characters of string
    for(int i=2;i<s1.length();i++)
    {
        string2=string2+s1.charAt(i);
    }
if(string1.contains("A"))
     {
       string1=string1.replace("A","");
     }//System.out.println("\""+(string1+string2)+"\"");  
  else if(s1.length()<=1)
  {
if(s1.charAt(0)=='A')
{
String string_single_char=""; //string_single_char is the substring of string when string has only one character
string_single_char=string_single_char.replace("A","");
System.out.println("\""+string_single_char+"\"");
}
else
System.out.println(s1);
}
}
else
{
System.out.println("Enter a valid string");
}
}
}
}
