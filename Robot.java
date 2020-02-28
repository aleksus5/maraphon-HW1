package maraphon1;

public class Robot implements Participators {
    private String name;
    private int maxRunDist;
    private int maxJumpHeight;

    public Robot(String name, int maxRunDist, int maxJumpHeight) {
        this.name = name;
        this.maxRunDist = maxRunDist;
        this.maxJumpHeight = maxJumpHeight;
    }

    public Robot(String name){
        this(name, maxRunDist: 1000, maxJumpHeight: 3);
    }


    @Override
    public void run(int distance) {
        if (distance <= maxRunDist) {
            System.out.println(name + "  доковылял");
        }else {
            System.out.println(name + "  отключился, батарейка села");
        }

    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + "  допрыгнул, но отвалился гироскоп");
        }else {
            System.out.println(name + "  прыгнул и приземлился на спину");
        }


    }

    @Override
    public void info() {
        System.out.println(name + " Робот требует ТО ");

    }

}