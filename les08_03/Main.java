package les08_03;
/*
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из
пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */
import java.util.List;

public class Main {

	public static void main(String[] args) {
		GroupLogic grLogic = new GroupLogic();

		Group gr = new Group(10);

		gr.add(new Student("Ivan", new int[] { 3, 5, 8, 9, 9 }));
		gr.add(new Student("Masha", new int[] { 10, 10, 10, 10, 10 }));
		gr.add(new Student("Petya", new int[] { 4, 4, 4, 5, 4 }));
		gr.add(new Student("Ivan1", new int[] { 9, 9, 9, 9, 9, }));
		gr.add(new Student("Masha1", new int[] { 5, 5, 5, 5, 5 }));
		gr.add(new Student("Petya1", new int[] { 7, 7, 7, 7, 7 }));
		gr.add(new Student("Ivan2", new int[] { 3, 3, 5, 5, 4 }));
		gr.add(new Student("Masha2", new int[] { 0, 10, 1, 10, 1 }));
		gr.add(new Student("Petya2", new int[] { 4, 4, 4, 5, 4 }));
		gr.add(new Student("Ivan3", new int[] { 3, 3, 5, 5, 4 }));

		List<Student> aLevelStudents = grLogic.takeALevelStudents(gr);
		printAStudent(aLevelStudents);
	}

	public static void printAStudent(List<Student> aLevelStudents) {
		for (Student st : aLevelStudents) {

			System.out.print(st.getName() + " - " + " marks: ");
			for (int i = 0; i < st.getMark().length; ++i) {
				System.out.print(st.getMark()[i] + " ");
			}
			System.out.println();

		}
	}

}
