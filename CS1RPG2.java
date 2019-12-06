//import calsses go here
import java.util.Random;
import java.util.Scanner;

class CS1RPG2{
    //diego as an apponent
    public static int diegoHp = 500;
    public static int deigoAttack = 50;

    //logan as an apponent
    public static int loganHp = 800;
    public static int loganAttack = 55;

    //Dalia as an opponent 
    //catchfrase Dalia: please shake your heads 
    public static int daliaHp = 200;
    public static int daliaAttack = 100;

    //esteban as an opponent 
    //esteban catchprase 
    public static int estebanHp = 300;
    public static int estebanAttack = 30;

    



    //student as a person
    public static int studentHp = 100;
    public static int studentAttack = 25;
    public static int studentDefend = 30;


    //this method enables that when clicked enter it will display th enext line in the text
    //this method could also be done with an external file and next line
    //damm you really did challenge diego
    public static void challengeDiego(){
        System.out.println("Diego's HP: " + diegoHp);
        System.out.println("Student: " + studentHp);
        System.out.println("What are you going to do?");
        System.out.println("| a.FIGHT | b.DEFEND |");
    }

    public static String make_enter(String verify){
        System.out.println("");
        return verify = "";

    }
    //this method will display a set of options
    public static void printOptions(){//rename this variable
        System.out.println("| a. raise your hand | b. stay quiet |");
    }

    //this is a fighting menu and will return an int value that will attack
    // the fighting menu can be changed by passing on th eproffessors hp and anem
    public static int fightingMenu(){
        System.out.println("");
        System.out.println("student used a boolean statement");
        int returnValue = studentAttack;
        return returnValue;
    }

    //this is a defending menu and will give back a defend method 
    public static int defendMenu(){
        System.out.println("");
        System.out.println("Student defended with a wallMethod");
        int returnValue = studentDefend;
        return returnValue;
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////Start of diegos methods
    //this method will contain the story line if you choose diego as your proffessor
    public static int deigoAttackstudent(){
        Random dice = new Random();
        int number = 0;

        for(int i = 1; i < 2; i++){
            number = dice.nextInt(deigoAttack);
            System.out.println("Diego used what does this code do?");
            return number;
        }
        return number;
    }

    public static void ProffeDiego(String studentName){
        //elements initiated
        Scanner scnr = new Scanner(System.in);
        String nextLineInStory; //what this variable will do is initiate the next text line when clicked enter
        String proffesorName;
        String yourChoice;

        System.out.print("Diego: firts of all Who here wants to make a bet?");
        nextLineInStory = scnr.nextLine();
        make_enter(nextLineInStory);

        System.out.println("\n----------------------------------------------------");
        printOptions();
        System.out.print("what will you choose a/b: ");
        yourChoice = scnr.nextLine();
        yourChoice = yourChoice.toLowerCase();
        System.out.println("\n----------------------------------------------------");

        if(yourChoice.equals("b")){
            //when testing i will use user make sure to change that after you are done
            System.out.println("Student: stayed quiet");
            System.out.println("Diego: very well lets continue with the lecture");
        }
        else{
            System.out.println("");


            System.out.print("Diego: you raised your hand");
            nextLineInStory = scnr.nextLine();
            make_enter(nextLineInStory);

            System.out.print("Diego: a challenge, I like bets");
            nextLineInStory = scnr.nextLine();
            make_enter(nextLineInStory);

            //this while loop will kekep the battle until it reaches an outcome
            while(diegoHp > 0 && studentHp > 0){
                System.out.println("\n----------------------------------------------------");
                System.out.println(studentName + " has challenged Diego ayyy viene la musica epica");
                challengeDiego();//System.out.println("| a.FIGHT | b.DEFEND | c.ITEM | d.RUN |");
                //as of now you can break the code using the option c 
                System.out.println("");
                System.out.print(studentName + " make a choice: ");
                yourChoice = scnr.nextLine();
                System.out.println("\n----------------------------------------------------");
                switch(yourChoice){
                    case "a"://attack
                        fightingMenu();
                        diegoHp -= studentAttack;
                         //diego attacks here
                        studentHp -= deigoAttackstudent();
                    break;

                    case "b"://defend
                        defendMenu();
                        studentHp += (studentDefend - deigoAttackstudent());
                    break;
                 }
                }
                //you maybe seperate the following code with a switch statement here maybe ?????
                //studentHp -= deigosAttack();
                if(diegoHp < 0 || diegoHp == 0){
                System.out.println("");
                System.out.println("Diego: Well I am at awe, I lost this bet but there will always be another one");
                }
                if(studentHp < 0 || studentHp == 0){
                System.out.println("Student lost");
                nextLineInStory = scnr.nextLine();
                make_enter(nextLineInStory);

                System.out.println("Diego: thank you for the callenge pero ya paso");
                nextLineInStory = scnr.nextLine();
                make_enter(nextLineInStory);

                }   
         }
    }//this is the end of the method proffeDiego
////////////////////////////////The end of diegos methods?////////////////////////////////////////////////////////

/////////////The start of logans methods///////////////////
    public static void proffeLogan(String studentName){
        Scanner scnr = new Scanner(System.in);
        String nextLineInStory; //what this variable will do is initiate the next text line when clicked enter
        String proffesorName;
        String yourChoice;


        System.out.print("Logan: morning guys today you will learn a little bit about programming ");
        nextLineInStory = scnr.nextLine();
        make_enter(nextLineInStory);
    }//the emd of proffeLogan

/////////////////////////////////this is the end opf proffe logan smethods

    public static void main(String[] args){
        //elements initiated
        Scanner scnr = new Scanner(System.in);
        String nextLineInStory; //what this variable will do is initiate the next text line when clicked enter
        String studentName;
        String proffesorName;
        String yourChoice;
 
        System.out.println("\tThe Rules");
        System.out.println("any dialog: to read the next line all that is needed is to hit ENTER");
        System.out.println("If ant any time you break the code please inform me at meny_nexi@outlook.com");
        System.out.println("this game is assuming that you know a litle bit of java");
        System.out.println("it is possible to beat the game without interactions but it is harder");
        System.out.println("");
        nextLineInStory = scnr.nextLine();
        make_enter(nextLineInStory);


        System.out.print("welcome to Computer Science @ UTEP");
        nextLineInStory = scnr.nextLine();
        make_enter(nextLineInStory);

        System.out.print("You will now be embarking on an epic journey to pass three exams choose your professor and your companions whisely ");
        nextLineInStory = scnr.nextLine();
        make_enter(nextLineInStory);

        System.out.print("before we begin please input your studentname: ");
        studentName = scnr.nextLine();

        System.out.print("Welcome " + studentName + ", to the University of Texas at El Paso ");
        nextLineInStory = scnr.nextLine();
        make_enter(nextLineInStory);

//make this into a method when you come back /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n----------------------------------------------------");
        System.out.println("Please Choose who you will take your CS1 Class with (This will effect the difficulty of the game and the path you will take)");
        System.out.println("Logan - Hard mode");
        System.out.println("Diego - Normal mode");
        System.out.print("Professor: ");
        proffesorName = scnr.nextLine();
        proffesorName = proffesorName.toLowerCase();
        System.out.println("\n----------------------------------------------------");

        if(proffesorName.equals("logan")){
            proffesorName = "Logan: This is exiting right? ";
            System.out.println("You have chosen: " + proffesorName);
            proffesorName ="logan";
            System.out.println("");
        }
        else{
            proffesorName = "Diego: Does this make sense guys? ";
            System.out.println("Dalia: please shake your heads guys");
            System.out.println("You have chosen: " + proffesorName);
            proffesorName = "diego";
            System.out.println("");
        }

        //add a fuinction here that cheaks if this is correct
        ////this wil later turn maybe intp a switch statement 
       if(proffesorName.equals("logan")){
           proffeLogan(studentName);
        }

        else{
            ProffeDiego(studentName);
        }

    }//this is the end of public static main
}//this is the end of Class CS!RPG2