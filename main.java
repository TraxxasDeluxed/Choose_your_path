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
                randomEvent();
                if (choosechoice()){
                    System.out.println("You feel drawn to it, sensing it might hold clues about the forest.");
                    randomEvent();
                }else{
                    System.out.println("You push on, determined to reach your destination.");
                }
            }else{
                System.out.println("You find a deserted car? do you drive it or not");
                randomEvent();
                if(choosechoice()){
                    System.out.println("Do you have a license? yes or no");
                    if(choosechoice()){
                        System.out.println("You get to drive Redwood safely");
                    }
                    else{
                        System.out.println("You get pulled over by a cop and get sentenced to jail, at least you got a roof over your head!");
                        randomEvent();
                    }
                }else{
                    System.out.println("You call for help");
                    randomEvent();
                }
            }
        } else {
            System.out.println("You feel compelled to explore Mt. Tam further, intrigued by its secrets.");
            System.out.println("You see a pool of water shimmering in the distance. Do you want to approach it? (yes or no)");
            if (choosechoice()) {
                System.out.println("The water seems strange, reflecting not just your face, but memories long forgotten. You decide to take a closer look...");
            } else {
                System.out.println("You wander away from the pool and find yourself on an abandoned campus. Do you search the campus? (yes or no)");
                if (choosechoice()) {
                    System.out.println("The campus feels eerie, but something tells you there are secrets here waiting to be uncovered...");
                } else {
                    System.out.println("You leave the campus behind and continue your journey, unsure of what lies ahead.");
                }
            }
        }

       
        scanner.close();
   
    }
    
    // function to get the user input 
    public static boolean choosechoice(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim().toLowerCase();
        return input.equals("yes");
        
    }

    public static void randomEvent() {
        // Add random events or consequences based on choices.
        int event = (int) (Math.random() * 3);
        switch (event) {
            case 0:
                System.out.println("A wild animal appears in your path! You quickly hide behind a tree until it passes.");
                break;
            case 1:
                System.out.println("You find an old compass in the dirt. This might help you on your journey.");
                break;
            case 2:
                System.out.println("The weather takes a turn for the worse, and a storm rolls in. You must find shelter quickly.");
                break;
        }

    
      
   
    

   
}
}