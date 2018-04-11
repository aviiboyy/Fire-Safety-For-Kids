package com.example.aviib.firesafety;

/**
 * Created by aviib on 21/03/2018.
 */

public class questions {
    public String mQuestions[] = {
            "What do you do when\n escaping from fire?",
            "What should you do when\n your clothes catch fire?",
            "Where can a fire \nstart in your home?",
            "Fire is?",
            "What should you\n do when alarm rings?",
            "When a room is filled with smoke,\n beeping sound is made by?",
            "Things which may\n cause fire?",
            "Is it okay to plug the charging\n ports with too many plugs?",
            "Where should you place your \n jumper on the Couch or the Lamp",
            "In event of a fire \nwho should you call?",
            "What is used to put off a fire",
            "What can you start a fire with?",
            "Should you plug a wire into\n powerpoint when the switch is on?",
            "In NZ What number should you\n call when a fire has arised?",
            "What are the colours\n of the flame",
            "Which colour flame is\n considered the hottest?",
            "Should you place a candle next\n to the curtains?",
            "Can fire be started by rocks?",
            "How long does it take before\n fire spreads through\n the whole house?",
            "What are some fire safety hazards?",
            "Is it okay to leave food\n cooking when you leave the room?",
            "If a pan catches on fire should\n i throw it in the rubbish?",
           "I can burn myself by touching\n a pan on the stove?",
            "My family needs a home escape\n plan incase of a fire?",
            "Is fire good or bad?",
            "Are you allowed to\n smoke inside a Plane",
            "If you see matches or\n lighter in a room",
            "Electricity can be very dangerous.\n Never play with:",
            "Fill in the blank\n Smoke alarm batteries need to\n be ________ once a month to\n make sure\nthey are working",
            "Fill in the blank\n You should plan to have ______ \nescape routes from each room\n in your house",
            "Fill in the blank\n A smoke alarm will sound\n when a ______ arises",
            "Fill in the blank\n If you stand too close to\n a __________ you could get burned",
            "Fill in the blank\n Dont play with _________",
            "Home fires are",
            "Fire escape plans\n should be practiced with?",
            "Fill in the blank \n Smoke alarm hangs from the\n_________ of your house",
            "Fill in the blank \n A smoke alarm makes a very\n loud _________ sound"


    };

    private String mChoices[][] = {
            {"Get your toys","Move out quickly"},
            {"Run as fast as you can","Stop Drop & Roll"},
            {"Anywhere","Only in the Kictchen"},
            {"Fun & Enjoyable","Frightening & Dangerous"},
            {"Follow the teachers instructions","Run out of the class"},
            {"Phone","Alarm"},
            {"Rubbish bin , Tables & Chairs","Candle, Matches & lighter"},
            {"Yes Absolutely","No Way"},
            {"Couch","Lamp"},
            {"FireFighter","Police"},
            {"Fire Extinguisher","Blanket"},
            {"Matches","Clothes"},
            {"Yes","No"},
            {"111","911"},
            {"Yellow & Blue","Pink & White"},
            {"Yellow","Blue"},
            {"No","Yes"},
            {"Yes","No"},
            {"1 Minute","4 Minutes"},
            {"Improper Wiring","Water"},
            {"Yes","No"},
            {"Yes","No"},
            {"Yes","No"},
            {"Yes","No"},
            {"Good", "Bad"},
            {"Yes","No"},
            {"Tell adult right away", "Pick them up"},
            {"Video Games", "Electrical Cords"},
            {"Tested", "Thrown Away"},
            {"Zero", "Two"},
            {"Fire", "Flood"},
            {"Fireplace", "Fridge"},
            {"Soccer Balls", "Electrical Cords"},
            {"Hot & Loud", "Cold & Quiet"},
            {"Grown Ups", "No one"},
            {"Ceiling", "Television"},
            {"Barking", "Beeping"}

    };

    private String mCorrectAnswers[] = {"Move out quickly", "Stop Drop & Roll", "Anywhere", "Frightening & Dangerous",
            "Follow the teachers instructions","Alarm", "Candle, Matches & lighter", "No Way", "Couch", "FireFighter" ,"Fire Extinguisher", "Matches",
            "No", "111", "Yellow & Blue", "Blue", "No", "Yes", "4 Minutes", "Improper Wiring","No","No","Yes","Yes", "Bad", "No", "Tell adult right away", "Electrical Cords",
            "Tested","Two","Fire", "Fireplace", "Soccer Balls", "Hot & Loud", "Grown Ups", "Ceiling","Beeping"

    };


    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a) {
        String choice = mChoices[a][1];
        return choice;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }


    }










