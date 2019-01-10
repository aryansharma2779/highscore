package main;

public class gameentry {

private String name;
private int score;

    public gameentry(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "{" + "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }
    //getter method for name and score
// constructor to initialize members attributes of the class

    public String toSTring()
{
    return "(" + name + "," + score +")";

}


}

