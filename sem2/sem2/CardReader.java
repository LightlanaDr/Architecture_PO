package sem2;

public class CardReader implements USB{
    private MemoryCard memoryCard;

    /*  Адаптируемый класс (карта памяти) становится одним из полей адаптера */

    public CardReader(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }
    /* В отличие от карты памяти, у адаптера есть общий интерфейс с компьютером.
     У него есть USB-кабель, то есть он может соединяться с другими устройствами по USB.
     Поэтому в программе наш класс CardReader реализует интерфейс USB.
     */
    @Override
    public void connectWithUsbCable() {
        this.memoryCard.insert();
        this.memoryCard.copyData();
    }
}
