import sem2.CardReader;
import sem2.MemoryCard;
import sem2.USB;

public class Client {
    /*  программа-клиент, которая будет имитировать человека,
    желающего скопировать данные с карты памяти */
    public static void main(String[] args) {
        USB cardReader = new CardReader(new MemoryCard());
        cardReader.connectWithUsbCable();
    }
}