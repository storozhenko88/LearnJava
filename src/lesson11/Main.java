package lesson11;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();
        Order client1  = new Order("Dima");
        Order client2  = new Order("Oleg");
        Order client3  = new Order("Nastya");
        Order client4  = new Order("Vika");

        coffeeOrderBoard.add(client1);
        coffeeOrderBoard.add(client2);
        coffeeOrderBoard.add(client3);
        coffeeOrderBoard.add(client4);

        coffeeOrderBoard.draw();

        System.out.println(coffeeOrderBoard.delivery());
        coffeeOrderBoard.draw();

        System.out.println(coffeeOrderBoard.delivery(2));
        coffeeOrderBoard.draw();

        coffeeOrderBoard.delivery();
        coffeeOrderBoard.delivery();
        coffeeOrderBoard.draw();


    }
}
