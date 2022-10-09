package fr.lernejo.guessgame;

import java.util.Scanner;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;


public class HumanPlayer implements Player{

    Logger logger =  LoggerFactory.getLogger("player");
    Scanner scan = new Scanner(System.in);

    @Override
    public long askNextGuess() {
        long number = -1;
        while (number==-1) {
            try {
                number = Long.parseLong(scan.nextLine());
            } catch (Exception e) {
                logger.log("Error occurred. message : " + e.getMessage());
            }
        }
        logger.log("The player give the number "+number);
        return number;
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
