package paket;

//Kreiramo fabričku klasu NotificationFactory koja instancira konkretne klase
public class NotificationFactory {
	public Notification createNotification(String channel) {
		// Proveravamo da li je kanal null ili prazan string
		if (channel == null || channel.isEmpty())
			return null;
		// U zavisnosti od kanala, instanciramo odgovarajuću klasu
		switch (channel) {
		case "SMS":
			return new SMSNotification();
		case "EMAIL":
			return new EmailNotification();
		case "PUSH":
			return new PushNotification();
		default:
			return null;
		}
	}
}