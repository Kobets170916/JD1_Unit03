package les08_03;
/*
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из
пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */
public class StudentLogic {
	public boolean isAStudent(Student st) {
		int[] marks;

		marks = st.getMark();

		boolean isA = true;

		for (int mark : marks) {
			if (mark < 9) {
				return false;
			}
		}

		return true;

	}

}
