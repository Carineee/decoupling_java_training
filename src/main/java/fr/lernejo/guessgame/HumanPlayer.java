package fr.lernejo.guessgame;

import java.util.Scanner;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;


public class HumanPlayer implements Player{

    private final Logger logger =  LoggerFactory.getLogger("player");
    private final Scanner scan = new Scanner(System.in);

    @Override
    public long askNextGuess() {
        logger.log("Enter your guess");
        return scan.nextLong();
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if (lowerOrGreater) {
            logger.log("Hey, the number is higher than the guess");
            System.out.println("Hey, the number is higher than the guess");
        } else {
            logger.log("Hey, the number is lower than the guess");
            System.out.println("Hey, the number is lower than the guess");
        }
    }



}
