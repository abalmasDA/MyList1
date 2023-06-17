

/**
 * Створіть проект за допомогою IntelliJ IDEA. Створіть клас MyList. Реалізуйте у найпростішому наближенні можливість використання його екземпляра аналогічно екземпляру класу List.
 * Мінімально необхідний інтерфейс взаємодії з екземпляром повинен включати метод додавання елемента,
 * індексатор для отримання значення елемента за вказаним індексом і властивість тільки для читання для отримання загальної кількості елементів.
 */


public class Main {

    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.addElementToList(4234);
        myList.addElementToList(888);
        myList.addElementToList(777);
        System.out.println(myList.getElementByIndex(2));
        System.out.println(myList.getSizeElements());

        MyList<String> myList1 = new MyList<>();
        myList1.addElementToList("1");
        myList1.addElementToList("2");
        myList1.addElementToList("3");
        myList1.addElementToList("4");
        myList1.addElementToList("5");
        System.out.println(myList1.getElementByIndex(3));
        System.out.println(myList1.getSizeElements());

    }
}
