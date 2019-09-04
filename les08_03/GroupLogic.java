package les08_03;
/*
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из
пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */
import java.util.ArrayList;
import java.util.List;

public class GroupLogic {

	private StudentLogic stLogic = new StudentLogic();

	public List<Student> takeALevelStudents(Group group) {

		List<Student> result = new ArrayList<Student>();

		Student[] students = group.getStudents();

		for (Student st : students) {
			if (stLogic.isAStudent(st)) {
				result.add(st);
			}

		}

		return result;
	}

}