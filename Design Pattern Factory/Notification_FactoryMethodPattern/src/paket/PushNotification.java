package paket;

//Kreiramo konkretnu klasu koje implementiraju interfejs Notification
public class PushNotification implements Notification {
	@Override
	public void notifyUser() {
		// Šaljemo push obaveštenje
		System.out.println("Sending a push notification");
	}
}
