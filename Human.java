package maraphon1;

public class Human implements Participators {
    private String name;
    private int maxRunDist;
    private int maxJumpHeight;

    public Human(String name, int maxRunDist, int maxJumpHeight) {
        this.name = name;
        this.maxRunDist = maxRunDist;
        this.maxJumpHeight = maxJumpHeight;
    }

    public Human(String name){
        this(name, maxRunDist: 3000, maxJumpHeight: 1);
    }


    @Override
    public void run(int distance) {
        if (distance <= maxRunDist) {
            System.out.println(name + "  пробежал успешно");
        }else {
            System.out.println(name + "  остановился, у него отдышка");
        }

    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + "  прыгнул и поднял от радости правую руку");
        }else {
            System.out.println(name + "  прыгнул, но мельдоний кончился и подвернул лодыжку");
        }


    }

    @Override
    public void info() {
        System.out.println(name + " человек в замешательстве ");

    }


}
