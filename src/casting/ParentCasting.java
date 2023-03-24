package casting;

public class ParentCasting {

	public static void main(String[] args) {

		ParentCasting upCast = new A_Casting();

		if (upCast instanceof B_Casting) {
			B_Casting downCast = (B_Casting) upCast;
			downCast.B_User_Add();
			downCast.B_userName();
			downCast.B_userPass();
		} else {
			A_Casting downCast = (A_Casting) upCast;
			downCast.A_User_Add();
			downCast.A_userName();
			downCast.A_userPass();
		}

	}

}
