package vraiment.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Orchestra LesCaraibes = new Orchestra("Reggae Fusion", "August",
                new Brass("Brass quartet", "Trombas", "Peter\n John\n James\n Levi\n", 4),
                new Percussion("Rhythm guys", "\nDrums \nTimpani \nXylophones \nShakers", false),
                new StringSection("Marathon Runners", "\nViolins\n Violas\n Cellos\n", "Cedulac"));

        System.out.println("Name of the orchestra: " + LesCaraibes.getNameOfOrchestra());
        System.out.println("Month of the concert: " + LesCaraibes.getConcertMonth());

        Scanner userInput = new Scanner(System.in);



        boolean displayDetails = false;

        while (!displayDetails) {
            System.out.println("Select options to Check the concert details: " +
                    "\n\t1. String Section" +
                    "\n\t2. Brass section" +
                    "\n\t3. Percussion" +
                    "\n\t4. Exit");

            //use the scanner to accept user selection
            int option = userInput.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Welcome aboard. These are the instruments of the string section.");
                    System.out.println(LesCaraibes.getStringSection().getMusicInstrument());

                    break;
                case 2:
//                    System.out.println("The power house of the Orchestra. Ladies and gentlemen, the brass section.");
                    System.out.println("Section name: " + LesCaraibes.getBrass().getSectionName());
//                    System.out.println("Brass players: " + LesCaraibes.getBrass().getPlayer());

                    System.out.println("Press 2 to continue.");
                    if (userInput.nextInt() == 2) {
                        System.out.println("Do you want to register your group performance?\n " +
                                "Enter the new number of players");
                        int newNoOfPlayers = userInput.nextInt();
                        LesCaraibes.getBrass().setNoOfPlayers(newNoOfPlayers);
                        System.out.println("The newly registered group performance is " + LesCaraibes.getBrass().getNoOfPlayers());

//                        System.out.println("That is great. What is the name of your group?");
//                        String newGroupName = userInput.nextLine();
//                        LesCaraibes.getBrass().setSectionName(newGroupName);
//                        System.out.println(LesCaraibes.getBrass().getSectionName() + "has been registered successfully.");
                    } else {
                        continue;
                    }

                    break;

                case 3:
                    System.out.println("The cool guys, the carriers of the rhythm and the bringer of vibes. Introducing " +
                            LesCaraibes.getPercussion().getSectionName());
                    LesCaraibes.getPercussion().getDetails();


                    break;

                case 4:
                    System.out.println("Are you sure you want to exit?");

                    System.out.println("\t1. Yes, I am sure. Exit.\n " +
                            "\t2. No, continue browsing.");

                    int exitCode = userInput.nextInt();

                    if (userInput.nextInt() == 1) {
                        System.out.println("Thank you for joining us this season.");
                        System.exit(0);
                    } else if (userInput.nextInt() == 2){
                        System.exit(1);
                        continue;
                    } else {
                        System.out.println("Select the correct option.");
                    }


                    break;

                default:
                    System.out.println("Select the correct option.");

                    break;

            }
        }
    }
}
