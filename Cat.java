package maraphon1;

public class Cat implements Participators {
    private String name;
    private int maxRunDist;
    private int maxJumpHeight;

    public Cat(String name, int maxRunDist, int maxJumpHeight) {
        this.name = name;
        this.maxRunDist = maxRunDist;
        this.maxJumpHeight = maxJumpHeight;
    }

    public Cat(String name){
        this(name, maxRunDist: 500, maxJumpHeight: 5);
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDist) {
            System.out.println(name + "  пробежала успешно");
        }else {
            System.out.println(name + "  остановилась, легла и уснула");
        }

    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + "  прыгнула в правую сторону");
        }else {
            System.out.println(name + "  прыгнула в левую сторону");
        }


    }

    @Override
    public void info() {
        System.out.println(name + "  в хорошем настроении");

    }
}
