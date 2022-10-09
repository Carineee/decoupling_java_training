package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

public class Simulation {

        private final Logger logger = LoggerFactory.getLogger("simulation");
        private final Player player;
        private long  numberToGuess;

        public Simulation(Player player) {
            this.player = player;

        }

        public void initialize(long numberToGuess) {
            this.numberToGuess = numberToGuess;
        }

        /**
         * @return true if the player have guessed the right number
         */
        private boolean nextRound() {
            long value = player.askNextGuess();

            if(value > numberToGuess) { player.respond(false);}

            else if (value < numberToGuess) {player.respond(true);}

            else{ logger.log("The player have guessed the right number"); return true;}

            return false;
        }

        public void loopUntilPlayerSucceed(long count) {
            long  n = 0;
            long start = System.currentTimeMillis();
            while
        }
}
