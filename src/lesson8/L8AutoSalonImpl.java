package lesson8;

public class L8AutoSalonImpl implements L8Salon {

    public L8AutoSalonImpl(int balance) {
        this.balance = balance;
    }

    private int balance; // balance avtosalona
    private L8Cars[] parking = new L8Cars[8]; // parkovka

    @Override
    public int buyCar(L8Cars carToByu) {
        int freePlace = getFreePlace();
        if (freePlace < 0) {
            System.out.println("Need free place, sell car! ");
            return -1;
        }
        int buyPrice = 0; //грузоподьемностьКоэфГруза - возрастАвтомобиля+техничСостояние*КоэфТехнСостояния
        if (carToByu instanceof L8Truks) {
            L8Truks l8_truk = (L8Truks) carToByu;
            int carryingСapacity = l8_truk.getCarryingСapacity();
            int condt = l8_truk.getCarState().getRate();
            int year = l8_truk.getAge();
            buyPrice = carryingСapacity - ((2020 - year) + condt);
            System.out.println("TrukPrice: " + buyPrice);
        }

        if (carToByu instanceof L8PassCars) { //ПассажироМестаКоэфПассажиромест - возрастАвтомобиляКоэфВозраста+техничСостояние*КоэфТехнСостояния
            L8PassCars l8_passCars = (L8PassCars) carToByu;
            int passengers = l8_passCars.getPassengers();
            int condt = l8_passCars.getCarState().getRate();
            int year = l8_passCars.getAge();
            buyPrice = passengers*passengers*condt*condt - ((2020 - year) * condt);
            System.out.println("PassPrice: " + buyPrice);
        }

        if (balance < buyPrice) {
            System.out.println("Need money! ");
            return -1;
        }

        balance -= buyPrice;
        parking[freePlace] = carToByu;
        return buyPrice;
    }

    private int getFreePlace() { // metod chtob6 najti svobodnoe mesto
        int freePlace = -1;
        for (int i = 0; i < parking.length; i++) {
            if (parking[i] == null) {
                freePlace = i;
            }
        }
        return freePlace;
    }

    @Override
    public void sellCar(int parkingSlot) {

    }

    @Override
    public void report() {

    }
}
