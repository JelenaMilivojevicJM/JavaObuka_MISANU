package p2;

//Za import KONKRETNE KLASE:
//import imePaketa.ImeKlase;
import p1.First;

//Za importovananje SVIH KLASA iz odredjenog pakata, na mesto imena klase napisemo *
// import  imePaketa.*;

public class ImportPackage {

	public static void main(String[] args) {

		First f = new First();
		f.view();
	}

	/// Oracle dokumentacija : https://docs.oracle.com/javase/8/docs/api/
	// Oracle by prof: https://docs.oracle.com/javase/8/docs/api/

}
