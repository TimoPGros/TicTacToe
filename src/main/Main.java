package main;

import java.io.IOException;

import game.Commentator;
import game.Game;
import game.IGame;
import game.Observer;
import player.KeyBoardPlayer;

public class Main {

    public static void main(String args[]) throws IOException {

        Game game = new IGame();

        //AutoPlayer player1 = new AutoPlayer(game);
	KeyBoardPlayer player1 = new KeyBoardPlayer(game);
        KeyBoardPlayer player2 = new KeyBoardPlayer(game);
        game.joinPlayer1(player1); // Spieler treten dem Spiel bei
        game.joinPlayer2(player2);

        Observer commentator = new Commentator(game); // erstellt einen
                                                      // Kommentator,
                                                      // der das Spiel über
                                                      // die Kommandozeile
                                                      // kommentiert

        game.addObserver(player1);
        game.addObserver(player2);
        game.addObserver(commentator);
        game.run();
    }
}
