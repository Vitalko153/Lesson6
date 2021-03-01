public class Main {

    public static void main(String arg[]){
        int lengthBarrier = 300;
        int lengthPull = 5;
        Cat barsic = new Cat("Барсик");
        Dog bobik = new Dog("Бобик");

        barsic.run(lengthBarrier);
        bobik.run(lengthBarrier);
        barsic.swim(lengthPull);
        bobik.swim(lengthPull);
    }

}



