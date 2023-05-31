package sheridan.sin12743.mygamee.model;

public class Box {
    private int boxNumber;
    private String prize;
    private String content;
    public Box(int boxNumber, String prize) {
        this.boxNumber = boxNumber;
        this.prize = prize;
    }
    public Box(int boxNumber, String prize, String content) {
        this.boxNumber = boxNumber;
        this.prize = prize;
        this.content = content;
    }
    public int getBoxNumber() {
        return boxNumber;
    }

    public void setBoxNumber(int boxNumber) {
        this.boxNumber = boxNumber;
    }

    public String getPrize() {
        return prize;
    }

    public void setPrize(String prize) {
        this.prize = prize;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    @Override
    public String toString() {
        return "Box{" +
                "boxNumber=" + boxNumber +
                ", prize='" + prize + '\'' +
                '}';
    }
}