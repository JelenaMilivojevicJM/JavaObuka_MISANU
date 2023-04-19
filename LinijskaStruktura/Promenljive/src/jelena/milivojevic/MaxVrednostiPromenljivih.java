package jelena.milivojevic;

public class MaxVrednostiPromenljivih {

	public static void main(String[] args) {
		/*
		 * Inicijalizovati sve celobrojne i realne promenljive sa svojim maximalnim
		 * vrednostima i ispisati ih na ekranu
		 */

		byte b = 127;
		short s = 32767;
		int i = 2147483647;
		long l = 9223_3720_3685_4775_807L; // inicijalizacija završava sa 'L'
		float f = 3.4028235E38F; // inicijalizacija završava sa 'F'
		double d = 1.7976931348623157E308D; // inicijalizacija završava sa 'D'

		System.out.println("Najveća vrednost tipa BYTE je : " + b);
		System.out.println("Najveća vrednost tipa SHORT je : " + s);
		System.out.println("Najveća vrednost tipa INT je : " + i);
		System.out.println("Najveća vrednost tipa LONG je : " + l);
		System.out.println("Najveća vrednost tipa FLOAT je : " + f);
		System.out.println("Najveća vrednost tipa DOUBLE je : " + d);
	}

}
