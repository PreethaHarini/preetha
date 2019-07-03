import java.util.*;
public class small1 
{

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        StringBuffer sf=new StringBuffer();
        sf.append(sc.nextLine());
        int i=0;

        while( i<sf.length())
        {
            int j=1+i;
            while(j<sf.length())
            {   

                if(sf.charAt(i)==sf.charAt(j))
                {
                    sf.deleteCharAt(j);
                }
                else
                {
                    j=j+1;
                }
            }
            i=i+1;
        }
        int ss=sf.length();

        System.out.println(ss);
    }
}
