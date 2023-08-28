public class Main {

    public static void main(String[] args) {

        ToyShop toyShop = new ToyShop();

        toyShop.put("1 robot 2");

        toyShop.put("2 doll 2");

        toyShop.put("3 car 6");

        toyShop.writeResultsToFile("output.txt", 10);

    }

}