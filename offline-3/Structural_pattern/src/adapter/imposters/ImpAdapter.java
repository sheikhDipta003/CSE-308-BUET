package adapter.imposters;

public class ImpAdapter implements CrewMate{
    Imposter imposter;

    public ImpAdapter(Imposter imp) {
        this.imposter = imp;
    }

    @Override
    public String repairShip() {
        //do damage behind the scenes
        imposter.damageShip();
        //pretend to be part of the crew
        return "Hi, I am Green, assistant of Red.\n";
    }
}
