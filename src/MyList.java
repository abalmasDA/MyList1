import java.util.ArrayList;

public class MyList<T> {
    private ArrayList<T> object = new ArrayList<>();

    public void addElementToList(T objectToAdd) {
        object.add(objectToAdd);
    }

    public T getElementByIndex(int indexElement) {
        T element = object.get(indexElement);
        return element;
    }

    public int getSizeElements() {
        int number = object.size();
        return number;
    }


}
