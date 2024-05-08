import java.util.ArrayList;
import java.util.List;

public class ListInterface {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.add(7);
        myList.add(8);
        myList.add(9);

        removeEverySecondElement(myList);
    }

    public static void removeEverySecondElement(List<Integer> inputList) {
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < inputList.size(); i++) {
            if (i % 2 == 0) { 
                resultList.add(inputList.get(i));
            }
        }
        System.out.println(resultList);
    }
}
