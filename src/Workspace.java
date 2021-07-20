import java.util.*;

public class Workspace {
    public static void main(String[] args) {

        String[] arr = {"John", "Michelle", "Tommy"};
        String[] arr2 = new String[5];

        //collection (size, toString) -> list(size, toString, add, remove)
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(9);
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.size());
        Collections.reverse(arrayList);
        System.out.println(arrayList.toString());

        String myString = "I really like ice cream";
        String[] str = myString.split(" ");
        System.out.println(Arrays.toString(str));
        List<String> arrayString = new ArrayList<>();
        arrayString = Arrays.asList(str);
        System.out.println(arrayString.toString());

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Pizza");
        map.put(2, "Pineapple");
        map.put(3, "Borger");
        map.remove(3);
        map.put(1, "Chicken");
        System.out.println(map.get(1));
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("Pizza"));

        ArrayList<String> carArray = new ArrayList<>();
        carArray.add("Honda");
        carArray.add("Toyota");
        carArray.add("Ford");
        for(String car: carArray){
            System.out.println(car);
        }

        for(Map.Entry<Integer, String> entry: map.entrySet()){
//            int key = entry.getKey();
//            String value = entry.getValue();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }

}
