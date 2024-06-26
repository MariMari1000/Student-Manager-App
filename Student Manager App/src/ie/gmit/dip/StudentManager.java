package ie.gmit.dip;

public class StudentManager {
	private static final int INITIAL_CAPACITY = 10;
	private Student[] students = null;
	
	public StudentManager() {
		students = new Student[INITIAL_CAPACITY];
	}

	public boolean add(Student s) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = s;
				return true;
			}
		}
		
		int index = getExpandedIndex();
		students[index] = s;
		
		return true;
	}
	
	private int getExpandedIndex() {
		Student[] temp = new Student[students.length * 2]; //Very fast....Amortized expansion.....!
		
		for (int i = 0; i < students.length; i++) { //Copy all from old to new array
			temp[i] = students[i];
		}
		
		int index = students.length;
		students = temp;
		return index;
	}

	public boolean delete(String id) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getSid().equals(id)) {
				students[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Student getStudentById(String id) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getSid().equals(id)) {
				return students[i];
			}
		}
		return null;
	}
	
	public Student[] getStudentsByFirstName(String fname) {
		int total = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getFirstName().equalsIgnoreCase(fname)) {
				total++;
			}
		}
		
		if (total > 0) {
			Student[] temp = new Student[total];
			int index = 0;
			
			for (int i = 0; i < students.length; i++) {
				if (students[i] != null && students[i].getFirstName().equalsIgnoreCase(fname)) {
					temp[index] = students[i];
					index++;
				}
			}
			
			return temp;
		}else {
			return null;
		}
	}
	
	public int size() {
		int total = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				total++;
			}
		}
		return total;
	}
	
	public void debug() {
		System.out.print("[");
		for (Student s : students) {
			System.out.print(", " + s);
		}
		
		System.out.println("]");
	}
}