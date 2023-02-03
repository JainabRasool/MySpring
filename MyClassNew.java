public class MyClassNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DispatcherServlet1 ds = new DispatcherServlet1();

		ds.reqReceived("b", "nabeel");
	}

}

class DispatcherServlet1 {

	public HandlerNew hd = new HandlerNew();

	public void reqReceived(String hName, String cName) {

		Handlerl hh1 = hd.callHandler(hName, cName);
		
		 System.out.print(hh1.msg() );
		
	}

}

class HandlerNew {

	public Handlerl callHandler(String hString, String cName) {

		if (hString == "a") {

			print(cName);
			return new aHandler();
		}

		else if (hString == "b") {
			print(cName);
			return new bHandler();
		}

		else {
			print(cName);
			return new OtherHandler();
		}
	} // callHandler

	public Controller callController(String name) { // factoty method

		if (name == "zainab") {

			return new zainabController();

		} else if (name == "nabeel") {

			return new nabeelController();
		}

		else {
			return new otherController();
		}

	}// callController

	public void print( String cName) {

		callController(cName);
		System.out.print(callController(cName).msg() );
	}
}
