package CAR;

import java.util.ArrayList;

public class MembershipManager {

	private ArrayList<Member> listMember = new ArrayList<Member>();
	
	MembershipManager()
	{
		// read member from db
	}
	
	public String viewSignupPage()
	{
		return "";
	}
	
	public void signUp( String id, String pass )
	{
		Member m = new Member( id, pass );
		listMember.add(m);
	}
	
	public boolean checkCoupon( String id )
	{
		Member m = null;
		for ( Member e : listMember )
		{
			if ( e.getId().equals(id) )
			{
				m = e;
			}
		}
		
		if ( m == null )
		{
			return false;
		}
		
		if ( !m.checkCoupon() )
		{
			return false;
		}

		return m.useCoupon();
		
	}
}
