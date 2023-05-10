package State_Pattern.SnakeGame;

import java.util.Scanner;

public class Context {
    private State curr_state;
    Context(){
        curr_state = new Easy();
    }
    void changeState(State finalState){
        curr_state = finalState;
    }

    void play(){
        Scanner scanner = new Scanner(System.in);
        String input;
        while(true){
            System.out.print(": ");
            input = scanner.nextLine();

            if(input.equalsIgnoreCase("Q")) break;
            else if(input.equalsIgnoreCase("C"))    {
                curr_state.snake.consume();
                curr_state.ChangeState(this);
            }
            else if(input.equalsIgnoreCase("W")){
                curr_state.snake.hitWall();
                System.out.print("Another game?(y/n): ");
                String another = scanner.nextLine();
                if(another.equalsIgnoreCase("y"))   continue;
                else break;
            }
        }
    }
}
