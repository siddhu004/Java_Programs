
import java.util.*;

class program54
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter string: ");
        String str = sobj.nextLine();

        str = str.replaceAll("\\s+"," ");
        str = str.trim();
        int icount = 0;
        String arr[] = str.split(" ");
        for(int icnt = 0;icnt < arr.length;icnt++)
        {
            if(arr[icnt].equals("india"))
            {
                icount++;
            }
        }        
        System.out.println("frequency of india is: "+icount);
    }
}