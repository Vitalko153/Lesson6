public class Cat extends Animal {
    String name;
    int maxLengthRun = 200;
    int maxLengthSwim = 0;

    Cat(String name){
        this.name = name;
    }

    public void run(int lengthBarrier) {
        if (maxLengthRun > lengthBarrier) {
            System.out.println(name + " пробежал " + lengthBarrier);
        }
        if (maxLengthRun < lengthBarrier) {
            System.out.println(name + " пробежал " + maxLengthRun);
        }
    }
    public void swim(int lengthPull) {
        if (maxLengthSwim > lengthPull) {
            System.out.println(name + " проплыл " + lengthPull);
        }
        if (maxLengthSwim < lengthPull) {
            System.out.println(name + " проплыл " + maxLengthSwim);
        }
    }
}