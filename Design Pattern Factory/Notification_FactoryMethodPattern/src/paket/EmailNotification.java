package paket;

//Kreiramo konkretnu klasu koje implementiraju interfejs Notification
public class EmailNotification implements Notification {
	@Override
	public void notifyUser() {
		// Šaljemo email obaveštenje
		System.out.println("Sending an email notification");
	}
}