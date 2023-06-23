import java.util.Scanner;

public class ArrayCRUD {
    int arr[];
    int currentSize;

    ArrayCRUD(int n) {
        this.arr = new int[n];
        this.currentSize = 0;
    }

    void insert(int index, int item) {
        if (index > currentSize) {
            System.out.println("Index cannot be greater than current size...");
            return;
        }
        // Shift elements
        for (int i = currentSize - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }

        arr[index] = item;
        currentSize++;
        System.out.println();
    }

    void delete(int index) {
        if (currentSize == 0) {
            System.out.println("Array is empty...Cannot delete elements");
            return;
        }
        for (int i = index; i < currentSize - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[currentSize - 1] = 0;
        currentSize--;
    }

    void search(int element) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {

                System.out.print(arr[i] + ",");
            }
        }

        System.out.println("Element not Found");
        System.out.println();

    }

    void update(int index, int element) {

        if (index > arr.length) {
            System.out.println("index is Greater than Array Size");
            return;
        }
        arr[index] = element;
        System.out.println();

    }

    void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayCRUD obj = new ArrayCRUD(5);
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("Enter 1 for insert");
                System.out.println("Enter 2 for update");
                System.out.println("Enter 3 for delete");
                System.out.println("Enter 4 for search");
                System.out.println("Enter 5 for print");
                System.out.println("Enter 6 to exist");

                int i = sc.nextInt();

                switch (i) {
                    case 1:
                        System.out.println("enter index");
                        int index = sc.nextInt();
                        System.out.println("enter element");
                        int element = sc.nextInt();
                        obj.insert(index, element);
                        break;
                    case 2:
                        System.out.println("enter index");
                        index = sc.nextInt();
                        System.out.println("enter element");
                        element = sc.nextInt();
                        obj.update(index, element);
                        break;
                    case 3:
                        System.out.println("enter index");
                        index = sc.nextInt();
                        obj.delete(index);
                        break;
                    case 4:
                        System.out.println("enter element");
                        element = sc.nextInt();
                        obj.search(element);
                        break;
                    case 5:
                        obj.print();
                        break;
                    case 6:
                        return;
                    default:
                        System.out.println("Enter the correct key");
                        break;

                }

            }
        }
    }
}