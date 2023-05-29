public class Main{
    public static void main(String[] args) {

        Animal animal = new Animal();
        Dog dog = new Dog();

        // animal.call();
        // dog.call();

        Thread th1 = new Thread(animal);
        Thread th2 = new Thread(dog);

        th1.start();
        th2.start();
        
    }
}

class Animal implements Runnable{
    public void run(){
        int i = 0;
        while(i < 5){
            System.out.println("Animal Calling");
            i++;

            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class Dog implements Runnable{
    public void run(){
        int j  = 0;
        while(j < 5){
            System.out.println("Dog Calling");
            j++;

            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}