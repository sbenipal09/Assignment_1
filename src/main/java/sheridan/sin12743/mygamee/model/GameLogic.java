package sheridan.sin12743.mygamee.model;

import sheridan.sin12743.mygamee.service.GameBox;


import java.util.*;


public class GameLogic implements GameBox {
    private List<Box> boxes;

    private int chosenBox =1;
    private String content;


    public GameLogic(int numberOfBoxes) {
        boxes = generateBoxes(numberOfBoxes);
    }

    private List<Box> generateBoxes(int numberOfBoxes) {
        List<Box> boxes = new ArrayList<>();
        Random random = new Random();


        for (int i = 1; i <= numberOfBoxes; i++) {
            String prize = getRandomPrize();
            Box box = new Box(i, prize ,content);
            boxes.add(box);
        }

        return boxes;
    }

    public List<Box> getBoxes() {
        return boxes;
    }

    public Box revealChosenBox(int chosenBoxNumber) {
        for (Box box : boxes) {
            if (box.getBoxNumber() == chosenBoxNumber) {
                return box;
            }
        }
        return null;
    }
    public int getChosenBox() {
        return chosenBox;
    }



    private String getRandomPrize() {
        String[] prizes = {"Candy", "iPhone", "$100", "Empty","Laptop","Video Game"};
        Random random = new Random();
        int index = random.nextInt(prizes.length);
        return prizes[index];
    }


}