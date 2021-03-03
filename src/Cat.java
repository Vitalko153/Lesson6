public class Cat {
    String name;
    int catRun = 200;
    int catSwim = 0;

    Cat(String name){
        this.name = name;
    }
    
    public void run(int lengthBarrier) {
        if (catRun > lengthBarrier) {
            System.out.println(name + " пробежал " + lengthBarrier);
        }
        if (catRun < lengthBarrier) {
            System.out.println(name + " пробежал " + catRun);
        }
    }

    public void swim(int lengthPull) {
        if (catSwim > lengthPull) {
            System.out.println(name + " проплыл " + lengthPull);
        }
        if (catSwim < lengthPull) {
            System.out.println(name + " проплыл " + catSwim);
        }
    }
}
