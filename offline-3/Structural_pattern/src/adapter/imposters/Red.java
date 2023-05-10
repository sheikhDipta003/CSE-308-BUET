package adapter.imposters;

public class Red implements CrewMate{
    @Override
    public String repairShip() {
        return "Hmm.. something's wrong with this ship, let's try to repair...\n";
    }
}
