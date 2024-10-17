import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("You woke up in the middle of the Tam, you want to go back to Redwood, do you want to go back? yes or no");

      

        //System.out.println(choice);

        if (choosechoice()) {
            System.out.println("You find that there only 2 paths to reach Redwood, the river or the road, do you want to continue embarking to Redwood? yes or no");
            if (choosechoice()){
                System.out.println("As you walk, the air becomes cooler, and the sounds of the forest shift. After a while, you come across an old, crumbling stone marker. Do you want to explore it?");
                if (choosechoice()){
                    System.out.println("You feel drawn to it, sensing it might hold clues about the forest.");
                }else{
                    System.out.println("You push on, determined to reach your destination.");
                }
            }else{
                System.out.println("You find a deserted car? do you drive it or not");
                if(choosechoice()){
                    System.out.println("Do you have a license? yes or no");
                    if(choosechoice()){
                        System.out.println("You get to drive Redwood safely");
                    }
                    else{
                        System.out.println("You get pulled over by a cop and get sentenced to jail, at least you got a roof over your head!");
                    }
                }else{
                    System.out.println("You call for help");
                }
            }
        } 
        else {
           System.out.println("You feel compelled to explore the Tam further, intrigued by its secrets.");
           if(choosechoice()){
            System.out.println("You see a pool or you search the campus");
           }
        }
        scanner.close();
    }

   

    public static boolean choosechoice(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim().toLowerCase();
        return input.equals("yes");
        
    }

    
      
   
    

   
}