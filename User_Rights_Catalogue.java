import java.util.ArrayList;

public class User_Rights_Catalogue {
	public ArrayList<User_Rights> UserRightsCatalog = new ArrayList<User_Rights>();
	public User_Rights _retrieves;
	public User _unnamed_User_;

	public void insert(User_Rights aUser_Rights) {
		UserRightsCatalog.add(aUser_Rights);
	}

	public void show(User_Rights aUser_Rights) {
		int i; 
		for (i = 0; i < UserRightsCatalog.size(); i++) {
			if(UserRightsCatalog.get(i).equals(aUser_Rights)) {
				System.out.println("User Rights: ");
			}
		}
	}

	public User_Rights_Catalogue() {
	}
}