import javax.sound.midi.Soundbank;
import java.util.*;

public class sem3 {
    public static void main(String[] args) {
        addBook("...", ",,,");
        addBook("...", "dfds");
        addBook("Роман", "ттт");
        System.out.println(cat);

    }
    // 📔 **Текст задачи:**
    // Даны следующие строки, cравнить их с помощью == и метода equals() класса
    // Object

    // String s1 = "hello";

    // String s2 = "hello";

    // String s3 = s1;

    // String s4 = "h" + "e" + "l" + "l" + "o";

    // String s5 = new String("hello");

    // String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

    // </aside>
    static void task0() {
        String s1 = "hello";

        String s2 = "hello";

        String s3 = s1;

        String s4 = "h" + "e" + "l" + "l" + "o";

        String s5 = new String("hello");

        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        //System.out.println(s1==s2);
        //System.out.println(s2==s3);
        //System.out.println(s3==s4);
//        System.out.println(s4==s5);
//        System.out.println(s5==s6);

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s4.equals(s5));
        System.out.println(s5.equals(s6));
    }


    static void task1(int n, int min, int max){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Random().nextInt(min, max +1));
        }
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
    static void task2(){
        List list = new ArrayList<>();
        list.add(12);
        list.add("sdfd");
        list.add(17.99);
        list.add(98456);
        list.add("fdtr");
        list.add("fgrtee");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object o = iterator.next();
            if(o instanceof Integer){
                iterator.remove();
            }
        }
        System.out.println(list);
    }

    static List<ArrayList<String>> cat = new ArrayList<>();

    static void addBook(String genre, String book)
    {
        ArrayList<String> cur = null;
        for (ArrayList<String> s : cat)
        {
            if (s.get(0).equals(genre))
            {
                cur = s;
                cur.add(book);
                return;
            }
        }
            cur = new ArrayList<>();
            cur.add(genre);
            cat.add(cur);
            cur.add(book);
    }
}
