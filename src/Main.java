import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashSet<String> vehicles=new HashSet<String>();
        //Adding items
        vehicles.add("mazda");
        vehicles.add("bmw");
        vehicles.add("toyota");
        vehicles.add("bmw");
        vehicles.add("porshe");
        System.out.println(vehicles);//even though BMW is added twice it only appears once in the set
        // because every item in a set has to be unique
//2.checking if an item exists
        System.out.println(vehicles.contains("toyota"));
        System.out.println(vehicles.remove("bmw"));//removing items
        System.out.println(vehicles.size());//finding out how many items are there
        for (String i:vehicles){//looping in hashset using for each loop
            System.out.println(i);
        }
    }
}