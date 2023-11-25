

import java.util.*;

class program12
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter number: ");
        int ino = sobj.nextInt();
        
        Numbers nobj = new Numbers();
        int iret = nobj.evenfact(ino);
        
        System.out.println("factorial is: "+iret);
    }
}

class Numbers
{
    public int evenfact(int ivalue)
    {
        int imult = 1;
        for(int icnt = 1;icnt <= ivalue;icnt++)
        {
            if(((ivalue % icnt) == 0) && ((icnt % 2) == 0))      // complexity n
            {
                imult = imult * icnt;              
            }
        }
        return imult;
    }
}
