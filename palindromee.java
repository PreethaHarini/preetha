import java.util.Scanner;
class palindromee
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str,rev="";
        str=sc.nextLine();
        System.out.println("Enter a String:");
        int length=str.length();
        for(int i=length-1;i>=0;i--)
        rev=rev+str.charAt(i);
        if(str.equals(rev))
        System.out.println(str+"\t" + "is Palindrome");
        else
        System.out.println(str + "is not Palindrome");
    }
}
