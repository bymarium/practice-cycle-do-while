package co.com.example;

public class CycleDoWhile {
    public static void main(String[] args) {
        int counter = 0;
        do{
            System.out.println("counter = " + counter);
            counter++;
        }while (counter < 3);
    }
}
