package sem3;

import java.awt.*;

public class Program {

    /**
     * 1. Спроектировать абстрактный класс «Car» у которого должны
     * быть свойства: марка, модель, цвет, тип кузова, число колёс, тип
     * топлива, тип коробки передач, объём двигателя; методы:
     * движение, обслуживание, переключение передач, включение
     * фар, включение дворников.
     * <p>
     * 2. Создать конкретный автомобиль путём наследования класса
     * «Car».
     * <p>
     * 3. Расширить абстрактный класс «Car», добавить метод: подметать
     * улицу. Создать конкретный автомобиль путём наследования
     * класса «Car». Провести проверку принципа SRP.
     * <p>
     * 4. Расширить абстрактный класс «Car», добавить метод:
     * включение противотуманных фар, перевозка груза. Провести
     * проверку принципа OCP.
     * <p>
     * 5. Создать конкретный автомобиль путём наследования класса
     * «Car», определить число колёс = 3. Провести проверку принципа LSP.
     * <p>
     * 6. Создать конкретный автомобиль путём наследования класса
     * «Car», определить метод «движение» - «полёт». Провести
     * проверку принципа LSP.
     * <p>
     * 7. Создать интерфейс «Заправочная станция», создать метод:
     * заправка топливом.
     * <p>
     * 8. Имплементировать метод интерфейса «Заправочная станция» в
     * конкретный класс «Car».
     * <p>
     * 9. Добавить в интерфейс «Заправочная станция» методы: протирка
     * лобового стекла, протирка фар, протирка зеркал.
     * <p>
     * 10. Имплементировать все методы интерфейса «Заправочная
     * станция» в конкретный класс «Car». Провести проверку
     * принципа ISP. Создать дополнительный/е интерфейсы и
     * имплементировать их в конкретный класс «Car». Провести
     * проверку принципа ISP.
     * <p>
     * 11. Создать путём наследования класса «Car» два
     * автомобиля: с бензиновым и дизельным двигателями,
     * имплементировать метод «Заправка топливом» интерфейса
     * «Заправочная станция». Реализовать заправку каждого
     * автомобиля подходящим топливом. Провести проверку принципа DIP.
     * <p>
     * TODO: Домашнее задание:
     * Доработать приложение, спроектированное на семинаре. Добавить тип, описывающий "автомойку".
     * Продемонстрировать работу получившейся программы,
     * создать несколько типов автомобилей,
     * загнать каждый автомобиль на заправку, а затем и на автомойку.
     *
     * @param args
     */
    public static void main(String[] args) {

        RefuelingStation refuelingStation = new RefuelingStation();
        RefuelingStationV2 refuelingStation2 = new RefuelingStationV2();

        Harvester harvester = new Harvester("A", "B", Color.BLACK);
        harvester.setRefuelingStation(refuelingStation2);
        harvester.fuel();


        SportCar sportCar = new SportCar("ferrari", "F40", Color.black);
        SedanCar sedanCar = new SedanCar("Opel", "mokka", Color.blue, FuelType.Diesel, CarType.Sport);

        CarWashing carWashing = new CarWashing();

        sedanCar.setRefuelingStation(refuelingStation);

        sportCar.setWiping(carWashing);
        sportCar.wipHeadlights();

        sedanCar.setWiping(carWashing);
        sedanCar.wipHeadlights();
        sedanCar.setRefuelingStation(refuelingStation2);
        sedanCar.fuel();



    }


}