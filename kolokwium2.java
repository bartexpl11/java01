
// ZADANIE 1
class Vehicle{
    public String brand;
    public String model;
    public Vehicle(String brand, String model){
        this.brand=brand;
        this.model=model;
    }


}
class Car extends Vehicle{
    public int numberOfDoors;

    public Car(String brand, String model, int numberOfDoors) {
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
    }


}


//ZADANIE 2
abstract class WorkTool{
    public String name;
    public int productionYear;
    WorkTool(String name, int productionYear){
        this.name=name;
        this.productionYear=productionYear;
    }
    void use(){};
}
class Hammer extends WorkTool{
    Hammer(String name, int productionYear){
        super(name, productionYear);
    }
    @Override
    void use() {
        System.out.println("uzywam "+this.name);
    }
}
class Screwdriver extends WorkTool{
    Screwdriver(String name, int productionYear){
        super(name, productionYear);
    }
    @Override
    void use() {
        System.out.println("uzywam "+this.name);
    }
}
class Saw extends WorkTool{
    Saw(String name, int productionYear) {
        super(name, productionYear);
    }
    @Override
    void use() {
        System.out.println("uzywam "+this.name);
    }
}


//ZADANIE 3
interface Sensor{
    abstract double readValue();
    abstract String getStatus();
    abstract void reset();
}
class TemperatureSensor implements Sensor{
    @Override
    public double readValue() {
        return 0;
    }
    @Override
    public String getStatus() {
        return null;
    }

    @Override
    public void reset() {

    }
}
class PressureSensor implements Sensor{
    @Override
    public double readValue() {
        return 0;
    }
    @Override
    public String getStatus() {
        return null;
    }

    @Override
    public void reset() {

    }
}


//ZADANIE 4
class Triple<T>{
    T object;

    Triple(T object){
        this.object=object;
    }
    T getFirst(){
        return object;
    }
    T getSecond(){
        return object;
    }
    T getThird(){
        return object;
    }
}


//ZADANIE 5
interface Converter{
    abstract double convertToEuro(double amount);
    abstract double convertToUSD(double amount);
    abstract double getConversionRate(String currency);
}
class CurrencyConverter implements  Converter{
    @Override
    public double convertToEuro(double amount) {
        return amount;
    }

    @Override
    public double convertToUSD(double amount) {
        return amount;
    }

    @Override
    public double getConversionRate(String currency) {
        if(currency=="USD") return 4.5;
        if(currency=="Euro") return 5.0;
        return 1;
    }
}
class UnitConverter implements  Converter{
    @Override
    public double convertToEuro(double amount) {
        return amount*4;
    }

    @Override
    public double convertToUSD(double amount) {
        return amount*3;
    }

    @Override
    public double getConversionRate(String currency) {
        if(currency=="USD") return 4.5;
        if(currency=="Euro") return 5;
        else return 0;
    }

}





public class Main {

    //ZADANIE 6
    static <T> boolean isEqualOrNull(T obj1, T obj2){
        if(obj1 == null && obj2 == null) return true;
        if(obj1.equals(obj2)) return true;
        else return false;
    }

    public static void main(String[] args) {
        Car a1 = new Car("Fiat","Punto",5);
        Car a2 = new Car("Fiat","Punto",5);
        Car a3 = new Car("BMW","qwert",5);

        System.out.println(isEqualOrNull(a1,a2));

        Hammer mlot=new Hammer("mlot",1999);
        mlot.use();
        Screwdriver s1=new Screwdriver("wkretak",2015);
        s1.use();
        Saw pila=new Saw("pila tarczowa",2000);
        pila.use();

        Triple<Integer> liczba= new Triple<Integer>(12);
        Triple<String> napis= new Triple<String>("moj napis");
        Triple<Double> poPrzecinku= new Triple<Double>(1.2345);
        System.out.println(liczba.getFirst());
        System.out.println(napis.getSecond());
        System.out.println(poPrzecinku.getThird());


    }
    }
