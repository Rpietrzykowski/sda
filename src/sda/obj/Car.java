package sda.obj;

public class Car {
    private static String color;
    private static String marka;
    private static String model;
    int vMax;

    public Car(String marka, String model) {
        this.model = model;
        this.marka = marka;
    }

    public void setMarke(String mar) {
        marka = mar;
    }
    public static String getMarke(){
        return marka;
    }

    public void setColor(String col) {
        color = col;
    }
    public static String getColor(){
        return color;
    }

    public void setModel(String mod) {
        model = mod;
    }

    public static String getModel() {
        return model;
    }

    public static String isOpen(boolean isOpen){
        if (isOpen == true) {
            return "Samochód otwarty";
        }
        else {
            return "Samochód zamknięty";
        }
    }

    public static void main(String[] args) {
        //put your code here
        Car car = new Car("Volvo", "XC90");


        String carModel = car.getMarke();
        System.out.println(carModel);
        String modelCar = car.getModel();
        System.out.println(modelCar);
        System.out.println(car.isOpen(true));

        car.setMarke("Mercedes");
        System.out.println(car.getMarke());
        car.setModel("W124");
        System.out.println(car.getModel());
        System.out.println(car.isOpen(false));

    }
}
