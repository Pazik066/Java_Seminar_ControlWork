import java.util.*;

public class Sem4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 9, 15, 3563, 45, 757};
        MyStack stack = new MyStack();
        stack.push(2);
        stack.push(5);
        stack.push(4);
        stack.push(7);
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.empty());
    }

    static void task0(){
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            list1.add(i);
        }
        long middle = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list2.add(i);
        }
        long finish = System.currentTimeMillis();
        System.out.println(middle - start);
        System.out.println(finish - middle);
    }

    static void task1() {
        LinkedList<String> list = new LinkedList<>();
        boolean work = true;
        Scanner scanner = new Scanner(System.in);
        while (work){
            System.out.println("Введите команду (text@num) ");
            String line = scanner.nextLine();
            if(line.equals("exit")){
                System.out.println("Пока!");
                return;
            }
            String[] arr = line.split("@");
            int num = Integer.parseInt(arr[1]);
            String text = arr[0];
            switch (text) {
                case "print" :
                    System.out.println(list.remove(num));
                    break;
                default :
                    list.add(num, text);
            }
        }
    }
    static void task2() {
        LinkedList<String> list = new LinkedList<>();
        boolean work = true;
        Scanner scanner = new Scanner(System.in);
        while (work){
            System.out.println("Введите строку ");
            String line = scanner.nextLine();
            switch (line) {
                case "exit" :
                    return;
                case "print" :
                    int in = list.size() - 1;
                    while (in >= 0){
                        System.out.println(list.get(in--));
                    }
                    break;
                case "revert" :
                    list.removeLast();
                    break;
                default:
                    list.add(line);
            }

        }
    }
    static void task4(int[] arr){
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length - 1; i++){
            stack.add(arr[i]);
        }
        for (int i = 0; i < arr.length - 1; i++){
            System.out.print(stack.pop() + " ");
        }
    }
    static void task4_1(int[] arr){
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < arr.length - 1; i++){
            q.add(arr[i]);
        }
        for (Integer item: q){
            System.out.print(item + " ");
        }
    }
    static void task5(){

    }
}

