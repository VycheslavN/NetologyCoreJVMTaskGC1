public class JvmComprehension { // Metaspace: JvmComprehension.class system classes... Передается для загрузки в систему ClassLoader

    public static void main(String[] args) { // Stack Memory: main()
        int i = 1;                      // 1 Stack Memory: int i = 1
        Object o = new Object();        // 2 heap: Object; Stack Memory: o
        Integer ii = 2;                 // 3 heap: Integer; Stack Memory: ii = 2
        printAll(o, i, ii);             // 4 Stack Memory: printAll()
        System.out.println("finished"); // 7 Stack Memory: println; heap: String со значением "finished". В процессе отрабатывается Garbage Collector.
    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;                   // 5 heap: Integer; Stack Memory: uselessVar = 700
        System.out.println(o.toString() + i + ii);  // 6 Stack Memory: println, toString()
    }
}