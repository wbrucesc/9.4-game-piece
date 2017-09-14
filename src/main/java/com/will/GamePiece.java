package com.will;

public class GamePiece {
    private int positionX;
    private int positionY;
    private boolean frozen;

    private String name;
    private String color;

    public GamePiece() {
        this.positionX = 0;
        this.positionY = 0;
        this.frozen = false;
        this.name = name;
        this.color = color;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void move(int x, int y){
        if (!frozen){
            this.positionX = x;
            this.positionY = y;
        } else {
            System.out.println("You are not allowed to move while frozen.");
        }
    }

    public void freeze(){
        this.frozen = true;
    }

    public void unfreeze(){
        this.frozen = false;
        System.out.println("Congrats you've thawed out!");
    }

    public void checkStatus(){
        System.out.println("X: " + this.positionX);
        System.out.println("Y: " + this.positionY);
    }

}
