package paket;

//Kreiramo interfejs AbstractFactory sa metodom create
public interface AbstractFactory<T> {
 T create(String type);
}
