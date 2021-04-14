package java.dataStructures.src.day2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Day2 {
    public static void main(String[] args) {
        // ----------Linked List---------
        LinkedList<String> animalList = new LinkedList<String>();
        animalList.add("frog");
        animalList.add("dog");
        animalList.add("giraffe");
        animalList.add("buffalo");
        animalList.add("mongoose");
        System.out.println(animalList);

        //add at the beginning
        animalList.addFirst("shark");
        animalList.addLast("koala");
        System.out.println(animalList);
        animalList.add(3,"cuttlefish");
        System.out.println(animalList);

        System.out.println(animalList.get(3));

        //common LinkedList methods:
        animalList.remove("piranha");
        // Removes the first instance of "piranha" in the LinkedList
        animalList.removeFirst();
        // Removes the first element of the LinkedList
        animalList.removeLast();
        // Removes the last elements of the LinkedList
        animalList.contains("giraffe");
        // Returns `true` if "giraffe" is present in the LinkedList
        animalList.size();
        // Returns an integer denoting the size of the LinkedList
        System.out.println(animalList.get(3));
        // Returns the value located at the 3rd index of the LinkedList
        animalList.set(3, "emu");
        System.out.println(animalList.get(3));
//		//Sets the value at index 3 to "emu"
        System.out.println(animalList);
        // => [frog, giraffe, buffalo, emu]

        //----------Queues---------
        Queue<Integer> myQueue  = new LinkedList<Integer>();
        for (int i = 5; i < 10; i++) {
            myQueue .add(i);
        }
        System.out.println("Elements of queue-"+ myQueue);
        // To remove the head of queue.
        int removedHead = myQueue.remove();
        System.out.println("removed element-" + removedHead);

        System.out.println(myQueue);

        // To view the head of queue
        int head = myQueue.peek();
        System.out.println("head of queue-" + head);

        int size = myQueue.size();
        System.out.println("Size of queue-" + size);

//-----------------------------//

        // Imports the data we need to use the Stack class

        Stack<Integer> myStack;
        // creates a reference variable for a Stack called myStack
        myStack = new Stack<Integer>();
        // creates a new Integer Stack and assigns its address to myStack

        myStack.push(1);
        // Pushes 1 to the top of our stack
        // myStack now consists of [1]
        myStack.push(2);
        // myStack now consists of [1, 2]
        myStack.push(3);
        // myStack now consists of [1, 2, 3]

        myStack.pop();
        //returns 3 and removes it from the stack
        //myStack now consists of [1, 2]

        //We can also look at the top of the stack without
        //removing it by using peek
        myStack.peek();
        //returns 2, but doesn't remove it
        //myStack still consists of [1, 2]

        //We may want to know if a stack is empty before we manipulate it:
        myStack.empty();
        //this will return `false` because our stack is not empty
    }
}
