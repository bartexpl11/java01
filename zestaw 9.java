import java.util.ArrayList;
import java.util.List;

class Box<T>{
    T objekt;

    public Box(T objekt){
        this.objekt = objekt;
    }

    public void setObjekt(T objekt){
        this.objekt = objekt;
    }

    public T getObjekt() {
        return objekt;
    }

}

class Counter<T>{
    List<T> lista;

    public Counter(){
        lista = new ArrayList<T>();
    }
    public void add(T objekt){
        lista.add(objekt);
    }

    public int getCount(){
        return lista.size();
    }
}

class Animal{
    public String name;
    public int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}
class Dog extends Animal{
    public Dog(String name, int age){
        super(name, age);
    }
}

class Pair<T>{
    public T first;
    public T second;

    public Pair(T first, T second){
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }
    public T getSecond() {
        return second;
    }
}



public class Main {
    public static <T> boolean isEqual(T objekt1, T objekt2){
        return objekt1.equals(objekt2);
    }

    public  static <T> void swap(T[] array1, int first, int second){
        if(first < array1.length && second < array1.length && first >=0 && second >=0){
            T temp = array1[first];
            array1[first] = array1[second];
            array1[second] = temp;
        }

    }

    public static <T extends Comparable<T>> T minValue(T[] array){
        T min = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i].compareTo(min) < 0){
                min = array[i];
            }
        }
        return min;
    }

    public static <T extends Animal> T findMax(T element1, T element2){
        return (element1.getAge()>element2.getAge()) ? element1 : element2;
    }

    public static <T extends Animal> T findMax(Pair<? extends Animal> pair){
        Animal first = pair.getFirst();
        Animal second = pair.getSecond();
        return (first.getAge() > second.getAge()) ? (T) first : (T) second;
    }


    public static void main(String[] args) {

        Box<String> box1 = new Box<>("asd");
        Box<Integer> box2 = new Box<>(2);
        Box<Double> box3 = new Box<>(3.14);
        System.out.println(box1.getObjekt());
        System.out.println(box2.getObjekt());
        System.out.println(box3.getObjekt());
        box3.setObjekt(2.0);
        System.out.println(box3.getObjekt());
        Box<Double> box4 = new Box<>(2.0);

        System.out.println(isEqual(box4.getObjekt(),box3.getObjekt()));
        Integer[] arr1 = {12,2,3,4,5};
        Double[] arr2={13.0,2.0,3.0,4.0,5.0};
        String[] arr3 = {"D","B","C","A"};
        swap(arr1,0,3);
        System.out.println(minValue(arr1));
        System.out.println(minValue(arr2));
        System.out.println(minValue(arr3));

        Dog dog1 = new Dog("Puszek",3);
        Dog dog2 = new Dog("Chrupek",10);

        Dog starszyDog = findMax(dog1,dog2);
        System.out.println("Starszym psem jest: "+starszyDog.getName());

        Pair<Dog> piesekPair = new Pair<>(dog1,dog2);
        Dog starszyDog2 = findMax(piesekPair);
        System.out.println("Starszym psem jest: "+starszyDog2.getName());


    }
}