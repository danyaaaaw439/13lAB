import java.util.*;

class Student {
    String name;
    String group;
    int course;
    List<Integer> marks; 

    Student(String name, String group, int course, Integer... marks) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.marks = Arrays.asList(marks);
    }

    double avg() {
        int s = 0;
        for (int m : marks) s += m;
        return marks.isEmpty() ? 0 : (double) s / marks.size();
    }
}

public class StudentApp {
    
    static void removeLowAndPromote(List<Student> students) {
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student st = it.next();
            if (st.avg() < 3.0) {
                it.remove();
            } else {
                st.course++;
            }
        }
    }

    
    static void printStudents(List<Student> students, int course) {
        for (Student s : students) {
            if (s.course == course) {
                System.out.println(s.name);
            }
        }
    }

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Анна", "A-01", 1, 4, 5, 3));
        list.add(new Student("Борис", "A-01", 1, 2, 3, 2)); 
        list.add(new Student("Вика", "B-02", 2, 3, 3, 3));
        list.add(new Student("Глеб", "B-02", 3, 5, 4, 5));

        removeLowAndPromote(list);

        System.out.println("Студенты 2 курса:");
        printStudents(list, 2);

        System.out.println("Студенты 4 курса:");
        printStudents(list, 4);
    }
}
