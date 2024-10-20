import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
class Student implements Comparable<Student> {
	String Name;
	int Id;
	int Rank;

	Student(String name, int id, int rank)
	{
		this.Name = name;
		this.Id = id;
		this.Rank = rank;
	}
	@Override public int compareTo(Student s)
	{
		if (Rank > s.Rank) {
			return 1;
		}
		else if (Rank == s.Rank) {
			return 0;
		}
		else {
			return -1;
		}
	}
}

public class Main {
	public static void main(String[] args)
	{
		LinkedList<Student> List
			= new LinkedList<Student>();
		List.add(new Student("Meet", 32, 2));
		List.add(new Student("Jhon", 11, 5));
		List.add(new Student("Sham", 92, 1));
		List.add(new Student("William", 86, 3));
		List.add(new Student("Harry", 35, 4));

		System.out.println("UnSorted List");
		for (Student s : List) {
			System.out.println(s.Rank + " " + s.Name + " "
							+ s.Id);
		}
		System.out.println();
		Collections.sort(List);
		System.out.println("Sorted List");
		for (Student s : List) {
			System.out.println(s.Rank + " " + s.Name + " "
							+ s.Id);
		}
	}
}
