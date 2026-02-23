import java.util.Scanner;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class VirtualPetRunner
{
// Prints menu and returns user choice
 public static int getChoice(Scanner input)
 {
   int selection = 0;
   while (selection < 1 || selection > 4)
   {
     System.out.println("------Virtual Pet Menu------");
     System.out.println("1. Get Pet Information");
     System.out.println("2. Feed Pet" );
     System.out.println("3. Play with Pet" );
     System.out.println("4. Quit" );
     System.out.print("Enter your choice ..... ");
     selection = input.nextInt();
   }
   return selection;
  }
}