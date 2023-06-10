package test;

import java.util.ArrayList;
import java.util.List;

public class ProfileServlet {
	
	public String getStatus() {
		return status;
	}


	/*
	 * public void setStatus(String status) { this.status = status; }
	 */

	public String getDiv() {
		return div;
	}


	/*
	 * public void setDiv(String div) { this.div = div; }
	 */

	@Override
	public String toString() {
		return "ProfileServlet [status=" + status + ", div=" + div + "]";
	}


	public ProfileServlet(String status, String div) {
		this.status = status;
		this.div = div;
	}


	String status;
	String div;
	

	public static void main(String[] args) {
		
		List<ProfileServlet> list = new ArrayList<>();
		
		list.add(new ProfileServlet("T", "0000"));
		list.add(new ProfileServlet("A", "0001"));
		ProfileServlet member = null;
		String divId1 = "", divId2 = "";
		for(int i = 0; i < list.size(); i++) {
			member = list.get(i);
			System.out.println(member);
			if(member.getDiv() != null &&  member.getDiv().trim().length() > 0) {
				if( !member.getStatus().equalsIgnoreCase("T")) {
					//System.out.println(member.getDiv()+"  "+member.getStatus());
					divId2 = member.getDiv();
					System.out.println(divId2);
					break;
				}
				else {
					divId1 = member.getDiv();
					System.out.println(divId1);
				}
			}
		}
		
		if(divId2 != null && divId2.length() > 0) {
			divId1 = divId2;
		}
		System.out.println(divId1);
		
		
	}

}
