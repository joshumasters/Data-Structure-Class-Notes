import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class DSDay2 {
//    ArrayList:
//    {5, 4, 3, 6, 7}
//    Linked List:
//    {value: 5 next: nextNode} -> {value: 8 next: nextNode} -> {value: 4 next: null}

    // ArrayLists are faster at searching and sorting
    // Linked Lists are faster at adding and removing data
    public static void main(String[] args) {
//        LinkedList<Integer> linked = new LinkedList<>();
//        linked.add(5);
//        linked.add(7);
//        linked.add(3);
//        linked.addFirst(10);
//        linked.add(1, 2);
//        System.out.println(linked.toString());
//        linked.set(4, 53);
//        System.out.println(linked.toString());

//        [       1]<-
//        [      1 2]
//        [     1 2 3]
//       <- [       2 3]

        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(6);
        queue.add(8);
        queue.add(9);
        System.out.println(queue.toString());
        queue.remove();
        System.out.println(queue.toString());
        int removedNum = queue.remove();
        System.out.println(removedNum);
        System.out.println(queue.toString());
        int peekedValue = queue.peek();
        System.out.println(peekedValue);
        System.out.println(queue.toString());

        //Netflix Queue for Legally Blonde
        //{Jerry}
        //{John, Josh}
        //{Josh, Jamie, Jose}

        Stack<String> stack = new Stack<>();
        stack.push("Buttermilk");
        stack.push("Pecan");
        stack.push("Blueberry");
        stack.push("Chocolate Chip");
        stack.push("Pumpkin");
        System.out.println(stack.toString());
        System.out.println(stack.pop());
        System.out.println(stack.toString());

        //push = add to top of stack
        //pop = remove and return item from top of stack
        //peek = return without removing top item in stack


        //SUMMARY
        //ArrayLists = Dynamically sized lists that track items by index (Good for searching and sorting)
        //HashMaps = Store data in "Maps" as Key/Value Pairs (Great at organizing unordered data, fast data structure)
        //Linked Lists = Data is stored as nodes, with each node holding a value and pointer to the next node in the list
                //(Fast for adding and removing data)
        //Queues = Interface (think type of linked list) - First In First Out functionality, first item added is the first item to be removed
        //Stacks = First In Last Out.


    }

}
