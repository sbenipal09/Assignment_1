package sheridan.sin12743.mygamee.service;

public interface GameBox {
    public int getChosenBox();

    public void setChosenBox(int chosenBox);
    default void init() {

    }
}