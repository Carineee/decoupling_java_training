package fr.lernejo.guessgame;

import java.security.SecureRandom;

public class Launcher {

    public static void main(String[] args) {
        if (args[0].equals("-interactive")) {
            Simulation simulation = new Simulation(new HumanPlayer());
            SecureRandom random = new SecureRandom();
            //long random Number = random.nextInt(100);
            simulation.initialize(random.nextInt(101));
            simulation.loopUntilPlayerSucceed(Long.MAX_VALUE);
        }

        else if(args[0].equals("-auto")){
            Simulation sm = new Simulation(new ComputerPlayer());
            sm.initialize(Long.parseLong(args[1]));
            sm.loopUntilPlayerSucceed(1000);
        }

        else {
            
        }

    }
}
