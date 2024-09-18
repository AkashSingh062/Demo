
import java.util.*;
class loop_TIC_TAC_TAO_GAME
{
    public static void main(String[] args) 
    {
        Scanner ak=new Scanner(System.in);
        char a=' ',s=' ',d=' ',f=' ',g=' ',h=' ',j=' ',k=' ',l=' ';
        System.out.println("");
        System.out.println("PRESS 1 TO PUT CROSS 'X' AT PLACE OF 1");
        System.out.println("PRESS 2 TO PUT CROSS 'X' AT PLACE OF 2\n..........\nPRESS 9 TO PUT CROSS 'X' AT PLACE OF 9");
        int q=0,Z=0;
        System.out.println("LET's PLAY");
        for(;q<=9;)
        {
            System.out.println("");
            switch(q)
            {
                case 1:
                if(a!='O'&&a!='X')
                a='O';
                else
                {
                    System.out.println("ERROR!\n you entered on existing value");
                    try{
                        Thread.sleep(12000);
                    }catch(Exception e)
                    {
                        System.out.println("An exception occured");
                    }
                    System.exit(0);
                }
                break;
                case 2:
                if(s!='O' && s!='X')
                s='O';
                else
                {
                    System.out.println("ERROR!\n you entered on existing value");
                    try{
                        Thread.sleep(12000);
                    }catch(Exception e)
                    {
                        System.out.println("An exception occured");
                    }
                    System.exit(0);
                }
                break;
                case 3:
                if(d!='O'&&d!='X')
                d='O';
                else
                {
                    System.out.println("ERROR!\n you entered on existing value");
                    try{
                        Thread.sleep(12000);
                    }catch(Exception e)
                    {
                        System.out.println("An exception occured");
                    }
                    System.exit(0);
                }
                break;
                case 4:
                if(f!='O'&&f!='X')
                f='O';
                else
                {
                    System.out.println("ERROR!\n you entered on existing value");
                    try{
                        Thread.sleep(12000);
                    }catch(Exception e)
                    {
                        System.out.println("An exception occured");
                    }
                    System.exit(0);
                }
                break;
                case 5:
                if(g!='O'&&g!='X')
                g='O';
                else
                {
                    System.out.println("ERROR!\n you entered on existing value");
                    try{
                        Thread.sleep(12000);
                    }catch(Exception e)
                    {
                        System.out.println("An exception occured");
                    }
                    System.exit(0);
                }
                break;
                case 6:
                if(h!='O'&&h!='X')
                h='O';
                else
                {
                    System.out.println("ERROR!\n you entered on existing value");
                    try{
                        Thread.sleep(12000);
                    }catch(Exception e)
                    {
                        System.out.println("An exception occured");
                    }
                    System.exit(0);
                }
                break;
                case 7:
                if(j!='O'&&j!='X')
                j='O';
                else
                {
                    System.out.println("ERROR!\n you entered on existing value");
                    try{
                        Thread.sleep(12000);
                    }catch(Exception e)
                    {
                        System.out.println("An exception occured");
                    }
                    System.exit(0);
                }
                break;
                case 8:
                if(k!='O'&&k!='X')
                k='O';
                else
                {
                    System.out.println("ERROR!\n you entered on existing value");
                    try{
                        Thread.sleep(12000);
                    }catch(Exception e)
                    {
                        System.out.println("An exception occured");
                    }
                    System.exit(0);
                }
                break;
                case 9:
                if(l!='O'&&l!='X')
                l='O';
                else
                {
                    System.out.println("ERROR!\n you entered on existing value");
                    try{
                        Thread.sleep(12000);
                    }catch(Exception e)
                    {
                        System.out.println("An exception occured");
                    }
                    System.exit(0);
                }
                break;
            }
            System.out.println(a+" | "+s+" | "+d);
            System.out.println("----------");
            System.out.println(f+" | "+g+" | "+h);
            System.out.println("----------");
            System.out.println(j+" | "+k+" | "+l);
            if(a==s&&a==d&&s==d&&a!=' '&&s!=' '&&d!=' '||a==g&&a==l&&g==l&&a!=' '&&g!=' '&&l!=' '||a==f&&a==j&&f==j&&a!=' '&&f!=' '&&j!=' '||s==g&&s==k&&g==k&&s!=' '&&g!=' '&&k!=' ')
            {
                System.out.println("PLAYER 2 wins");
                try{
                        Thread.sleep(12000);
                    }catch(Exception e)
                    {
                        System.out.println("An exception occured");
                    }
                System.exit(0);
            }
            else if(d==h&&d==l&&h==l&&h!=' '&&d!=' '&&l!=' '||d==g&&d==j&&g==j&&d!=' '&&g!=' '&&j!=' '||j==k&&j==l&&k==l&&j!=' '&&k!=' '&&l!=' '||f==g&&f==h&&g==h&&f!=' '&&g!=' '&&h!=' ')
            {
                System.out.println("PLAYER 2 wins");
                try{
                        Thread.sleep(12000);
                    }catch(Exception e)
                    {
                        System.out.println("An exception occured");
                    }
                System.exit(0);
            }
            System.out.println("\n");
            System.out.println("1st PLAYER CHANCE");
            System.out.println("Your choice: ");
            Z++; System.out.println("");q=ak.nextInt();System.out.println("");
            switch(q)
            {
                case 1:
                if(a!='O'&&a!='X')
                a='X';
                else
                {
                    System.out.println("ERROR!\n you entered on existing value");
                    try{
                        Thread.sleep(12000);
                    }catch(Exception e)
                    {
                        System.out.println("An exception occured");
                    }
                    System.exit(0);
                }
                break;
                case 2:
                if(s!='O'&&s!='X')
                s='X';
                else
                {
                    System.out.println("ERROR!\n you entered on existing value");
                    try{
                        Thread.sleep(12000);
                    }catch(Exception e)
                    {
                        System.out.println("An exception occured");
                    }
                    System.exit(0);
                }
                break;
                case 3:
                if(d!='O'&&d!='X')
                d='X';
                else
                {
                    System.out.println("ERROR!\n you entered on existing value");
                    try{
                        Thread.sleep(12000);
                    }catch(Exception e)
                    {
                        System.out.println("An exception occured");
                    }
                    System.exit(0);
                }
                break;
                case 4:
                if(f!='O'&&f!='X')
                f='X';
                else
                {
                    System.out.println("ERROR!\n you entered on existing value");
                    try{
                        Thread.sleep(12000);
                    }catch(Exception e)
                    {
                        System.out.println("An exception occured");
                    }
                    System.exit(0);
                }
                break;
                case 5:
                if(g!='O'&&g!='X')
                g='X';
                else
                {
                    System.out.println("ERROR!\n you entered on existing value");
                    try{
                        Thread.sleep(12000);
                    }catch(Exception e)
                    {
                        System.out.println("An exception occured");
                    }
                    System.exit(0);
                }
                break;
                case 6:
                if(h!='O'&&h!='X')
                h='X';
                else
                {
                    System.out.println("ERROR!\n you entered on existing value");
                    try{
                        Thread.sleep(12000);
                    }catch(Exception e)
                    {
                        System.out.println("An exception occured");
                    }
                    System.exit(0);
                }
                break;
                case 7:
                if(j!='O'&&j!='X')
                j='X';
                else
                {
                    System.out.println("ERROR!\n you entered on existing value");
                    try{
                        Thread.sleep(12000);
                    }catch(Exception e)
                    {
                        System.out.println("An exception occured");
                    }
                    System.exit(0);
                }
                break;
                case 8:
                if(k!='O'&&k!='X')
                k='X';
                else
                {
                    System.out.println("ERROR!\n you entered on existing value");
                    try{
                        Thread.sleep(12000);
                    }catch(Exception e)
                    {
                        System.out.println("An exception occured");
                    }
                    System.exit(0);
                }
                break;
                case 9:
                if(l!='O'&&l!='X')
                l='X';
                else
                {
                    System.out.println("ERROR!\n you entered on existing value");
                    try{
                        Thread.sleep(12000);
                    }catch(Exception e)
                    {
                        System.out.println("An exception occured");
                    }
                    System.exit(0);
                }
                break;
            }
            System.out.println(a+" | "+s+" | "+d);
            System.out.println("----------");
            System.out.println(f+" | "+g+" | "+h);
            System.out.println("----------");
            System.out.println(j+" | "+k+" | "+l);
            if(a==s&&a==d&&s==d&&a!=' '&&s!=' '&&d!=' '||a==g&&a==l&&g==l&&a!=' '&&g!=' '&&l!=' '||a==f&&a==j&&f==j&&a!=' '&&f!=' '&&j!=' '||s==g&&s==k&&g==k&&s!=' '&&g!=' '&&k!=' ')
            {
                System.out.println("PLAYER 1 wins");
                try{
                        Thread.sleep(12000);
                    }catch(Exception e)
                    {
                        System.out.println("An exception occured");
                    }
                System.exit(0);
            }
            else if(d==h&&d==l&&h==l&&h!=' '&&d!=' '&&l!=' '||d==g&&d==j&&g==j&&d!=' '&&g!=' '&&j!=' '||j==k&&j==l&&k==l&&j!=' '&&k!=' '&&l!=' '||f==g&&f==h&&g==h&&f!=' '&&g!=' '&&h!=' ')
            {
                System.out.println("PLAYER 1 wins");
                try{
                        Thread.sleep(12000);
                    }catch(Exception e)
                    {
                        System.out.println("An exception occured");
                    }
                System.exit(0);
            }
            else if(Z==9)
            {
                System.out.println("MATCH IS TIED");
                try{
                        Thread.sleep(12000);
                    }catch(Exception e)
                    {
                        System.out.println("An exception occured");
                    }
                System.exit(0);
            }
            System.out.println("\n");
            System.out.println("2nd PLAYER CHANCE");
            System.out.println("Your choice: ");
            Z++;System.out.println("");q=ak.nextInt();System.out.println("");
            ak.close();
        }
    }
}
