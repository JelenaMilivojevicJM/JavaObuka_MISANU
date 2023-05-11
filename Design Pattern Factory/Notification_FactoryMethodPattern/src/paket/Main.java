package paket;

public class Main {
	/*
	 * Factori Method Pattern je jedan od dva tipa Factory design
	 * Patterna. Factori Method Pattern kaže da samo definišemo interfejs
	 * ili apstraktnu klasu za kreiranje objekta, ali neka podklase odluče koju
	 * klasu da instanciraju. Drugim rečima, podklase su odgovorne za kreiranje
	 * instance klase. To je kreacioni obrazac dizajna koji se bavi mehanizmima
	 * stvaranja objekata, pokušavajući da kreira objekte na način koji odgovara
	 * situaciji. Osnovna prednost je da dozvoljava podklasama da izaberu tip
	 * objekata za kreiranje.
	 */

	/*
	 * Koristimo fabričku klasu NotificationFactory da kreiramo instance konkretnih
	 * klasa i šaljemo obaveštenja
	 */
	public static void main(String[] args) {
		// Kreiramo instancu fabričke klase NotificationFactory
		NotificationFactory notificationFactory = new NotificationFactory();

		// Kreiramo instancu klase SMSNotification i šaljemo SMS obaveštenje
		Notification notification1 = notificationFactory.createNotification("SMS");
		notification1.notifyUser();

		// Kreiramo instancu klase EmailNotification i šaljemo email obaveštenje
		Notification notification2 = notificationFactory.createNotification("EMAIL");
		notification2.notifyUser();

		// Kreiramo instancu klase PushNotification i šaljemo push obaveštenje
		Notification notification3 = notificationFactory.createNotification("PUSH");
		notification3.notifyUser();
	}
}
