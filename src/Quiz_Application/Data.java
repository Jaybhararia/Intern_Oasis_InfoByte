package Quiz_Application;

import java.util.ArrayList;

public class Data {
    public Data(ArrayList<Questions> questions){
        questions.add(new Questions(
                "Which keyword is used to create a subclass in Java?",
                "A) parent",
                "B) extends",
                "C) sub",
                "D) inherits",
                "B"));

        questions.add(new Questions(
                "What data structure follows the Last-In-First-Out (LIFO) principle?",
                "A) Queue",
                "B) Linked List",
                "C) Stack",
                "D) Tree",
                "C"));

        questions.add(new Questions(
                "Which access modifier makes a class member accessible only within its own package?",
                "A) public",
                "B) protected",
                "C) default",
                "D) private",
                "C"));

        questions.add(new Questions(
                "Which sorting algorithm has an average and worst-case time complexity of O(n log n)?",
                "A) Bubble Sort",
                "B) Insertion Sort",
                "C) Merge Sort",
                "D) Selection Sort",
                "C"));

        questions.add(new Questions(
                "Which of the following is used to create an instance of a class in Java?",
                "A) instanceof",
                "B) new",
                "C) create",
                "D) instance",
                "B"));

        questions.add(new Questions(
                "In a binary search tree, which traversal visits the nodes in ascending order?",
                "A) Preorder",
                "B) Inorder",
                "C) Postorder",
                "D) Level order",
                "B"));

        questions.add(new Questions(
                "Which keyword is used to declare a constant variable in Java?",
                "A) var",
                "B) final",
                "C) const",
                "D) static",
                "B"));

        questions.add(new Questions(
                "Which data structure is suitable for implementing a FIFO (First-In-First-Out) order?",
                "A) Stack",
                "B) Queue",
                "C) Heap",
                "D) Hash Table",
                "B"));

        questions.add(new Questions(
                "What is the purpose of the 'static' keyword in Java?",
                "A) It defines a constant value.",
                "B) It specifies that a method can be overridden.",
                "C) It indicates that a variable or method belongs to the class, not instances.",
                "D) It declares an abstract class.",
                "C"));

        questions.add(new Questions(
                "Which searching technique works by repeatedly dividing the search interval in half?",
                "A) Linear Search",
                "B) Depth-First Search",
                "C) Binary Search",
                "D) Breadth-First Search",
                "C"));
    }
}
