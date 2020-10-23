import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class OrderByMark {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int count = s.nextInt();
        int[] ids = IntStream.range(0, count).map((i) -> s.nextInt()).toArray();
        Object[] names = IntStream.range(0, count).mapToObj((i) -> s.next()).toArray();
        int[] marks = IntStream.range(0, count).map((i) -> s.nextInt()).toArray();

        Object[] students = IntStream.range(0, count)
                .mapToObj((i) -> new Student(ids[i], names[i].toString(), marks[i]))
                .filter(student -> student.mark > 75).toArray();

        Arrays.sort(students);
        Arrays.stream(students).forEach(System.out::println);
    }

}

class Student implements Comparable<Student>{
    int id, mark;
    String name;

    public Student(int id, String name, int mark){
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

    @Override
    public int compareTo(Student s){
        String thisLast3 = this.name.substring(this.name.length()-3);
        String sLast3 = s.name.substring(s.name.length()-3);
        int val = thisLast3.compareTo(sLast3);
        if(val != 0)
            return val;
        else if(this.id > s.id)
            return 1;
        else if(this.id < s.id)
            return -1;
        return 0;
    }

    @Override
    public String toString() {
        return name;
    }
}