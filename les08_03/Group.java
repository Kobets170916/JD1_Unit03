package les08_03;
/*
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из
пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */
public class Group {
	private Student[] students;
	private int realGroupSize;

	public Group(int number) {
		students = new Student[number];
		realGroupSize = 0;

	}

	public boolean add(Student newStudent) {
		if (realGroupSize >= students.length) {
			return false;
		}

		students[realGroupSize] = newStudent;
		realGroupSize++;
		return true;

	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

}