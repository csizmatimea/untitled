public class Task33 {
    public static void main(String[] args) {
        String[] carsArray = {"Opel", "Lada", "Audi", "Fiat", "Hyundai", "Mercedes", "Peugeot"};

        //System.out.println(carsArray.length);

        String myFavorite = "Fiat";

        for (int i = 0; i < carsArray.length; i++) {
            if (carsArray[i].equals(myFavorite)) {
                System.out.println(myFavorite +" My favorite car.");
                break;
            }
        }
    }
}
