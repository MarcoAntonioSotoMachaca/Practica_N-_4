public class Car {
    private String brand;
    private Engine engine;

    public Car(String brand, String model, int horsepower){
        this.brand=brand;
        this.engine=new Engine(model, horsepower);
    }

    public void showInformation(){
        System.out.println("Car: " + brand);
        System.out.println("Engine: " + engine.getModel());
        System.out.println("Horsepower: " + engine.getHorsepower());
    }
}
