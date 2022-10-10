package fr.lernejo.guessgame;

import java.util.Scanner;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

public class ComputerPlayer implements Player{

    Logger logger =  LoggerFactory.getLogger("player");
    Scanner scan = new Scanner(System.in);
    long max = Long.MAX_VALUE;
    long min = Long.MIN_VALUE;

    @Override
    public long askNextGuess() {
        long answer = (this.max + this.min)/2;
        return answer;
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if (!lowerOrGreater){
            logger.log("Smaller !");
            this.max = (this.min + this.max)/2;
        }
        else{
            logger.log("bigger !");
            this.min = (this.min + this.max)/2;
        }

    }

}
