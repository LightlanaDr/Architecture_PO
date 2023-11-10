package sem3;

public class CarWashing implements Wiping{
    @Override
    public void wipMirrors() {
        System.out.println("Мойка зеркал выполнена");
    }

    @Override
    public void wipWindshield() {
        System.out.println("Мойка лобового стекла выполнена");
    }

    @Override
    public void wipHeadlights() {
        System.out.println("Мойка фар выполнена");
    }


}
