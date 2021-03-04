public class Main {

    public static void main(String arg[]){
        int lengthBarrier = 300;
        int lengthPull = 5;
        Cat barsic = new Cat("Барсик");
        Animal.count++;
        Dog bobik = new Dog("Бобик");
        Animal.count++;
        barsic.run(lengthBarrier);
        bobik.run(lengthBarrier);
        barsic.swim(lengthPull);
        bobik.swim(lengthPull);
        Animal.score();



    }

}



