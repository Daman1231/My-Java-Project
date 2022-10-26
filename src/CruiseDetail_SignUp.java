import java.util.Scanner;

public class CruiseDetail_SignUp {
	String emailId;
	int password;
	String name;
	String number;
	String userName;
	int userPassword;

	public CruiseDetail_SignUp(String email, int requiredPassword, String fullName, String phoneNumber, String user,
			int pass) {
		emailId = email;
		password = requiredPassword;
		name = fullName;
		number = phoneNumber;
		userName = user;
		pass = userPassword;
	}

	public String getEmailId() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Email Address.");
		emailId = sc.next();
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Current Valid Full Name to Update it");
		name = sc.next();
		return name;
	}

	public void updateUsername(String currentUsername, String newUsername) {
		if (this.name.equalsIgnoreCase(currentUsername)) {
			this.name = newUsername;
		} else {
			System.out.println("You Have entered a Wrong UserName");
		}

	}

	public String getUpdatedUsername() {
		return name;
	}

	public String getuserName() {
		return name;
	}

	public void updatePassword(int currentPassword, int newPassword) {
		if (this.password == currentPassword) {
			this.password = newPassword;
		} else {
			System.out.println("You Have entered a Wrong Password");
		}

	}

	public int getUpdatedPassword() {
		return password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your phone number");
		number = sc.next();
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setPassword(int currentPassword, int newPassword) {

		if (password == currentPassword) {
			password = newPassword;
		} else {
			System.out.println("You Have Entered a Wrong Password.");
		}
	}

	public void getPassword() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Current Valid Password to Update it");
		password = sc.nextInt();

	}

	public void loginUsername(String newUsername) {
		name = newUsername;

	}

	public String setEnterUsername(String username) {
		if (username.equalsIgnoreCase(getUpdatedUsername())) {
			if (username.equalsIgnoreCase(name)) {
				System.out.println("Valid User");
			} else {
				System.out.println("Invalid User");
			}
		} else {
			System.out.println("Old UserName Not Accepted");
		}

		return username;
	}

	public void getEnterUserName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName ");
		userName = sc.next();
	}

	public int setEnterUserPassword(int password) {

		if (password == getUpdatedPassword()) {
			if (this.password == password) {
				System.out.println("Valid User");
			} else {
				System.out.println("Invalid User");
			}

		} else {
			System.out.println("Old Password Not Accepted");
		}
		return password;
	}

	public void getEnterPassword() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Pasword ");
		password = sc.nextInt();
	}

}
