import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result 
{

    /*
     * Complete the 'gamingArray' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static String gamingArray(List<Integer> arr)
    {
    // Write your code here
        int max=-1;
        int count=0;
        for(int i=0;i<arr.size();i++)
        {
            if(arr.get(i)>max)
            {
                max=arr.get(i);
                count++;
            }
        }
        return count%2==0?"ANDY":"BOB";
    }
}
public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int count=sc.nextInt();
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<count;j++)
            {
                list.add(sc.nextInt());
            }
            System.out.println(Result.gamingArray(list));
        }
        sc.close();
    }

}

