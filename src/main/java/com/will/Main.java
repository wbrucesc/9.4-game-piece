package com.will;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Freeze Game! Let's Play! ");
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your favorite color: ");
        String color = scanner.nextLine();

        GamePiece userGamePiece = new GamePiece();
        userGamePiece.setColor(color);
        userGamePiece.setName(name);
        System.out.println("You are: " + name + " and your color is: " + color);

        userGamePiece.move(5,10);           //game piece moves to coordinates
        userGamePiece.freeze();                  //freezes game piece/not able to move
        userGamePiece.move(1, 12);          //will not move bc it is frozen
        userGamePiece.unfreeze();                //unfreezes game piece
        userGamePiece.move(1, 12);          //game piece moves to new coordinates

        userGamePiece.checkStatus();

    }
}
