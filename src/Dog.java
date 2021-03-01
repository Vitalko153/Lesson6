public class Dog {
    String name;
    int dogRun = 500;
    int dogSwim = 10;

    Dog(String name){
        this.name = name;
    }

    public void run(int lengthBarrier){
        if(dogRun > lengthBarrier) {
            System.out.println(name + " пробежал " + lengthBarrier);
        }
        if(dogRun < lengthBarrier){
            System.out.println(name + " пробежал " + dogRun);
        }
    }

    public void swim(int lengthPull){
        if(dogSwim > lengthPull) {
            System.out.println(name + " проплыла " + lengthPull);
        }
        if(dogSwim < lengthPull){
            System.out.println(name + " проплыла " + dogSwim);
        }

    }
}
