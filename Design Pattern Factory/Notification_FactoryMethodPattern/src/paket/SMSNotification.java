package paket;

//Kreiramo konkretnu klasu koje implementiraju interfejs Notification
public class SMSNotification implements Notification {
	@Override
	public void notifyUser() {
		// Šaljemo SMS obaveštenje
		System.out.println("Sending an SMS notification");
	}
}
