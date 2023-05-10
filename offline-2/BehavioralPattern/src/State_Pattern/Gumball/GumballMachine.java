package State_Pattern.Gumball;

public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;

    State state;        //holds the current state
    int count = 0;

    GumballMachine(int count){
        this.count = count;
        soldOutState = new SoldOut(this);
        noQuarterState = new NoQuarter(this);
        hasQuarterState = new HasQuarter(this);
        soldState = new Sold(this);

        if(count > 0)   state = noQuarterState;
        else    state = soldOutState;
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
        if(state == soldState)    state.dispense();
    }

    public void releaseBall(){
        if(count > 0){
            System.out.println("A gumball comes rolling out of the slot...");
            count--;
        }
    }

    public int getCount() {
        return count;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getSoldState() {
        return soldState;
    }

    @Override
    public String toString() {
        return ("\n<--- Remaining gumballs : " + count + " --->");
    }

    public void refill(int numGumballs) {
        count = numGumballs;
        if(numGumballs > 0)   state = noQuarterState;
        else    state = soldOutState;
    }
}
