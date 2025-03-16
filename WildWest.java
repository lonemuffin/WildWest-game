//Start of the code
//Made by Kyle Klees and Jack Cooper
import java.util.Random;
import java.util.Scanner;


public class WildWest { 
    
    public static int fame = 0;
    
    public static void hat(Scanner in) {

        //Hat picker		
        System.out.println("Your first choice of the game - which hat will you pick?");
System.out.println("---Pick a Hat---");
System.out.println("1. Ten Gallon Hat");
System.out.println("2. Telescopic Gambler Hat");
System.out.println("3. Sombrero");
System.out.println("4. Bolero Hat");

String Hat = in.nextLine();
if(Hat.equals("1")) {
	System.out.println("Nice choice! You chose the Ten Gallon Hat!");
	fame = fame + 50;
}
else if(Hat.equals("2")) {
	System.out.println("Nice choice! You chose the Telescopic Gambler Hat!");
	fame = fame + 50;
}
else if(Hat.equals("3"))	{
	System.out.println("Nice choice! You chose the Sombrero!");
	fame = fame + 25;
}
else if(Hat.equals("4")) {
	System.out.println("Nice choice! You chose the Bolero Hat!");
	fame = fame + 25;
}
else if(Hat.equals("Raccoon Hat"))	{
	System.out.println("Ah...I see that you are a man of culture as well. You will not regret that choice");
	fame = fame + 750;
}
else if(Hat.equals("Cowboy Hat"))	{
	System.out.println("I HATE YOU I HATE YOU!! IT'S NOT CALLED A COWBOY HAT. PICK A CHOICE FROM THE MENU YOU HAD ONE JOB!!!!! You know what? Minus 1000 fame for you!...and you die of typhoid fever! please pretend you lost, I cannot find a way to keep it from looping. :(");
	fame = fame - 1000;
	death();
}

else {
	System.out.println("Invalid command!");
	hat(in);
    }
}





    public static void pa (Scanner in) {
        //Pap = clintfight string
System.out.println("What do you say to your Pa?");
System.out.println("1. I'm leaving dad");
System.out.println("2. Say bye to mom for me");
System.out.println("3. That hat doesn't fit you, dad");
String Pap = in.nextLine();
if(Pap.equals("1")) {
	System.out.println("Good luck out there, son");
}
else if(Pap.equals("2")) {
	System.out.println("I won't");
}
else if(Pap.equals("3")) {
	System.out.println("I'll grow into it");
}
else {
	System.out.println("Invalid command!");
    pa(in);
}
    }
    
    
    
    
    public static void transport (Scanner in) {
        //Pap = transport string
System.out.println("The trail to the West is long. What mode of transportation do you use?");
System.out.println("1. Train");
System.out.println("2. Wagon");
System.out.println("3. Walk");
System.out.println("4. Go back home");
String trans = in.nextLine();
if(trans.equals("1")) {
	System.out.println("You take the train out West");
	yellow(in);
}
else if(trans.equals("2")) {
	System.out.println("You take the lame wagon out west");
	yellow(in);
}
else if(trans.equals("3")) {
	System.out.println("You attempt to walk across the country and die of heat stroke");
	death();
}
else if(trans.equals("4")) {
	System.out.println("You go back home like a coward. What a yellow belly.");
	death();
}
else {
	System.out.println("Invalid command!");
    transport(in);
}
    }
    
    
    
    public static void yellow (Scanner in) {
        //Pap = townname string
System.out.println("Welcome to the town of Yellow Water");
System.out.println("Where will you go first?");
System.out.println("1. Saloon");
System.out.println("2. Sheriff's Office");
System.out.println("3. General Store");
System.out.println("4. Hotel");
String town = in.nextLine();
if(town.equals("1")) {
	System.out.println("You walk into the saloon expecting everyone to become quiet like in the movies that haven't come out yet because it's 1885 but instead everyone is just doing their own thing");
	saloon(in);
}
else if(town.equals("2")) {
	System.out.println("You enter the Sheriff's office");
	sheriff();
}
else if(town.equals("3")) {
	System.out.println("You walk into the General store looking for a new hat. You find a hat you like. It�s a fine, crisp, and clean tan military issue Stetson, but you don�t have enough money for it.");
	generalstore(in);

}
else if(town.equals("4")) {
	System.out.println("You open the door and enter the hotel. The manager greets you.");
	hotel();
	
}

else if(town.equals("Get back on the train")) {
	System.out.println("You hop on the train, flicking your hat. A little boy shouts, 'Come back Shane!' You pop a cap in him. You: My name's not shane kid! The train flies off into the future.");
	System.out.println("Your rank: McFly");
	fame = fame + 1000;
	victory();
}

else {
	System.out.println("Invalid command!");
    yellow(in);
    
    
}
    }
    
    public static void saloon (Scanner in) {
        //sal = saloon string
System.out.println("What do you do?");
System.out.println("1. Lean on counter");
System.out.println("2. Sit down at the poker table");
System.out.println("3. Talk with one of the strangers");
System.out.println("4. HOEDOWN! // (Combat)");
String sal = in.nextLine();
if(sal.equals("1")) {
	System.out.println("You lean on the counter, bumping into a grizzly stranger. He yells at you and the two of you start a fistfight. You sweep the leg, crippling him for life due to the lack of any Japanese Veterans in the town. You are thrown out for violent behavior");
	fame = fame + 75;
	yellow(in);
}
else if(sal.equals("2")) {
	System.out.println("You play a game of chance");
	if (Math.random() < .5) {
	    fame = fame - 50;
	} else {
	    fame = fame + 50;
	}
	saloon(in);
	
}
else if(sal.equals("3")) {
	System.out.println("You see a man in a brown gamblers hat and poncho. He's smoking a cigarette. You chat him up");
	stranger(in);
}

else if(sal.equals("4")) {
	System.out.println("You quick draw your six shooter, aiming it at the bar tender");
	salfight();
	
}
else {
	System.out.println("Invalid command!");
    yellow(in);
}
}

public static void salfight () {
        
System.out.println("You: 'Hand over all the cash! And some of them peppermints...NOT THE CINNAMON!'");
System.out.println("All 58 of the saloons patrons unholster their guns and light you up like a roman candle");

    death();
}


public static void stranger (Scanner in) {
        //str = str string
System.out.println("He�s now looking at you. If you actually say something you won't look like such a useless dolt.");
System.out.println("1. Howdy, have you heard anything in town?");
System.out.println("2. Do you have the right time?");
System.out.println("3. I dont get it. Why d-");
String str = in.nextLine();
if(str.equals("1")) {
	System.out.println("Stranger: Nobody, and I mean NOBODY puts ketchup on a hot dog.");
	clintfight(in);
}
else if(str.equals("2")) {
	System.out.println("The stranger opens up his pocket watch, making a deafening noise for about 19 seconds before speaking, 'No.' ");
	stranger(in);
}
else if(str.equals("3")) {
	System.out.println("He responds, 'Too bad you have to die' Before literally ending you like the fool you are.");
	death();
}
else {
	System.out.println("Invalid command!");
    stranger(in);
}
}

    public static void clintfight (Scanner in) {
        //Pap = transport string
System.out.println("You decide to duel the stranger for his ridiculous sense of food choice. The two of you stand 20 paces apart in the evening because you do your killing after breakfast. The duel has started. The stranger shouts: 'You need a count?'");
System.out.println("1. Nah sir.");
System.out.println("2. Yes.");
String cf = in.nextLine();
if(cf.equals("1")) {
	System.out.println("He instantly draws and pops a cap in your head");
	death();

}
else if(cf.equals("2")) {
	System.out.println("There is a ten second countdown. You cheat and shoot him early because you didn't know if it goes on one or zero.");
	fame = fame + 100;
	outlaw();

}
else {
	System.out.println("Invalid command!");
    clintfight(in);
    
}

}
public static void outlaw () {
        
System.out.println("It's a big town so not many saw you mistake the count. You become known as a fearless gunslinger all throughout the west up until your death later that year from cholera. Now you can look down at all the poor souls in the future that have to write a book report on you.");
System.out.println("Your rank: Outlaw");
victory(); 
    
}

    
public static void sheriff () {
        
System.out.println("The Sheriff looks up at you. 'Howdy we- Hey woa woa it's Banjo Bumpkin!'");
System.out.println("You respond 'Woa what? No I'm no-'");
System.out.println("Sheriff:'Yes you are! I saw you!'");
System.out.println("You: 'I got an unfortunate face!'");
System.out.println("Sheriff: 'Yea so does my grandma but she didn't burn her draft card!'");
System.out.println("*You are arrested and hung the next day - Tough luck buddy*");
    death();

}

public static void generalstore (Scanner in) {
System.out.println("");
System.out.println("You are given three choices:");
System.out.println("1. Rob the General store and take the hat");
System.out.println("2. Don't get the hat and walk out empty handed");
System.out.println("3. Challange the General store clerk to a dual for the hat");
String gs = in.nextLine();
if (gs.equals("1")) {
System.out.println("You try to steal a hat but the General store clerk pulls out a shotgun and shoots you point-blank. You die a horrible death.");
	death();
}
else if(gs.equals("2")) {
	System.out.println("You leave the store without a hat, w...even Bill Williamson had a hat");
	if (Math.random() < .5) {
	   System.out.println("Somebody feels bad for you and gives you money. You get the hat and live a happy life with your newly bought hat.");
	   System.out.println("Your rank: Beggar");
	   victory();
	} else {
	    System.out.println("You walk out of the general store without a hat and a horse kicks you in the head because you moseyed too close to it. You bleed out and die.");
	    death();
	} 
}
else if(gs.equals("Time Travel")) {
	System.out.println("You have found the time travel machine. You can go into the future or the past. Have fun.");
	System.out.println("Your rank: Time Traveler");
	fame = fame + 2000;
	victory();
}	
else if(gs.equals("3")) {    
	System.out.println("You dual the clerk");
	if (Math.random() < .5) {
	    System.out.println("You lose the duel your aim is trash");
	    death();
	} else {
	    System.out.println("You win the duel because your aim is not trash");
	    System.out.println("Your rank: Duelist");
	    victory();
		}
} else {
		System.out.println("Invalid command!");
	    generalstore(in);
}
}

 
public static void hotel () {
        
System.out.println("Manager: 'I'm sorry all of our rooms are booked.'");
System.out.println("You: 'm the main protagonist.'");
System.out.println("Manager: 'Oh, yea. Corporate said you were coming. Take any room with money conveniently in your wallet.'");
System.out.println("'Thanks'");
System.out.println("You stay the night in the hotel, waking up the next morning well rested.");
System.out.println("You exit the hotel and a coconut falls on your head, killing you.");
    death();

}
    
    public static void death () {
System.out.println("You died with " + fame + " Fame Points");
System.out.println("Game Over");
}

public static void victory () {
System.out.println("You tamed the West with " + fame + " Fame Points");
System.out.println("Yee Haw!");
    }





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System objects
		Scanner Pa = new Scanner(System.in);
		Scanner in = new Scanner(System.in);
		Scanner gs = new Scanner(System.in);
		Random rand = new Random();
		Random one = new Random();
		Random two = new Random();
		Random three = new Random();
		Random four = new Random();
		boolean running = true;
//Intro
		System.out.println("	**********");
		System.out.println("	*Big West*");
		System.out.println("	**********");
		System.out.println("              ");
		System.out.println("      Arizona, 1885 ");
		System.out.println("              ");
		

			
		
	hat(in);

	System.out.println("----------------------------");	
	System.out.println("You continue on your Journey"); 
    System.out.println("----------------------------");
    
    pa(in);
    transport(in);
    

				

	
		}	
}

/*Easter eggs:
"Raccoon Hat" in the hat selection screen
"Get back on the train" in Welcome to Yellow Water screen
"Time Travel" in General Store
*/





