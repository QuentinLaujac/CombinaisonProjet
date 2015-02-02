package network;
import java.io.IOException;
public class RunCalculator
{
  public static void main(String[]args)
  {
   try
   {
	   Runtime runtime = Runtime.getRuntime();
	   runtime.exec(new String[] { "/home/m1miage/laujac/TestCombi/bin/Debug/TestCombi", "coucou" } );
   
    }
    catch(IOException e)
    {
    	System.err.println("ne fonctionne pas ");
    	e.printStackTrace();
    }
  }
}

