

/**
 * Створіть проект за допомогою IntelliJ IDEA. Створіть клас MyList. Реалізуйте у найпростішому наближенні можливість використання його екземпляра аналогічно екземпляру класу List.
 * Мінімально необхідний інтерфейс взаємодії з екземпляром повинен включати метод додавання елемента,
 * індексатор для отримання значення елемента за вказаним індексом і властивість тільки для читання для отримання загальної кількості елементів.
 */


public class Main {

    public static void main(String[] args) {

        MyList<String> myList2 = new MyList<>();
        myList2.addElementToList("1");
        myList2.addElementToList("2");
        myList2.addElementToList("3");
        myList2.addElementToList("4");
        myList2.addElementToList("5");
        System.out.println(myList2.getSizeList());
        System.out.println(myList2.getElementByIndex(4));

        MyList<Integer> myList3 = new MyList<>();
        myList3.addElementToList(45);
        myList3.addElementToList(55);
        myList3.addElementToList(1);
        myList3.addElementToList(78);
        System.out.println(myList3.getSizeList());
        System.out.println(myList3.getElementByIndex(1));

    }
}
