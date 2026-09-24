    class Student {
    int marks;
    String name;

    Student(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }
}

public class CountingSortObjects {

    public static void countingSort(Student[] students) {

        int max = 0;

        for (int i = 0; i < students.length; i++) {
            max = Math.max(max, students[i].marks);
        }

        int[] count = new int[max + 1];

        for (int i = 0; i < students.length; i++) {
            count[students[i].marks]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        Student[] result = new Student[students.length];

        for (int i = students.length - 1; i >= 0; i--) {
            int marks = students[i].marks;
            result[count[marks] - 1] = students[i];
            count[marks]--;
        }

        for (int i = 0; i < students.length; i++) {
            students[i] = result[i];
        }
    }
}
