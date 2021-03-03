public class Dog extends Animal {
    String name;
        int maxLengthRun = 500;
        int maxLengthSwim = 10;

        Dog(String name) {
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
