public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DispatcherServlet ds = new DispatcherServlet();
		//ds.reqReceived("zainable");
		ds.reqReceived("zainab");
	}

}

class DispatcherServlet {

	Handler hld = new Handler();

	public void reqReceived(String name) {

		Controller con = hld.callController(name);

		System.out.println("Your message is::" + con.msg());

	}

}

class Handler {

	public Controller callController(String name) { //factory method

		if (name == "zainab") {

			return new zainabController();

		} else if (name == "nabeel") {
			return new nabeelController();
		} else {
			return new otherController();
		}
		

	}
}
