package CAR;

public class Member {

	private String id;
	private String pass;

	private int coupon = 0;
	
	public Member(String id, String pass) {
		this.setId(id);
		this.pass = pass;
	}

	public String getId() {
		return id;
	}

	private void setId(String id) {
		this.id = id;
	}

	public boolean checkCoupon() {
		if ( coupon == 0 )
			return true;
		return false;
	}

	public boolean useCoupon() {
		
		if ( coupon == 10 )
		{
			coupon = 0;
			return true;
		}
		
		return false;
	}

}
