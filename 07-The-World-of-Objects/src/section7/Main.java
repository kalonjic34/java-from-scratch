package section7;

public class Main {
        public static void main(String[] args) {
                Car nissan = new Car("Nissan", 10000, 2020, "Green");

                Car nissan2 = new Car(nissan);

                nissan2.setColor("Yellow");
                nissan.setColor("Orange");
                nissan2.setColor("Blue");
                nissan.setColor("Purple");
                nissan2.setColor("Fushsia");
                nissan.setColor("Beige");

                System.out.println("This " + nissan.getMake() + " is worth $" + nissan.getPrice()
                                + ". It was built in "
                                + nissan.getYear()
                                + ". It is " + nissan.getColor() + "\n");
        }
}