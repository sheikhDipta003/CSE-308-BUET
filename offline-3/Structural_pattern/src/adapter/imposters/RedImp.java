package adapter.imposters;

public class RedImp implements Imposter{
    @Override
    public String damageShip() {
        return "Damaging the spaceship, poisoning the crew mates...\n";
    }
}
