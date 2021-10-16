package week3.day1;

public class Students {
	public void studentInfo(int id) {
		System.out.println(id);

	}

	public void studentInfo(int id, String name) {
		System.out.println(id + " " + name);

	}

	public void studentInfo(String email, String phonenumber) {
		System.out.println(email + " " + phonenumber);

	}

	public static void main(String[] args) {
		Students obj = new Students();
		obj.studentInfo(234);
		obj.studentInfo(234, "Aravindh");
		obj.studentInfo("aravindhraja.ra@gmail.com", "9999988888");
	}

}
