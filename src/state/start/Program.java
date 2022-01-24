package state.start;

// Состояние позволяет вынести логику определения состояния объекта и его
//поведение, характерное для этого состояния, в других классах.

// Обьект который меняет свое поведение в зависимости от своего состояния
// позволяет избегать мгогочисленных if

import state.FireState;
import state.MoveState;
import state.TransformerState;
import state.context.TransformerContext;

public class Program {

    public static void main(String[] args) {
        TransformerContext context = new TransformerContext();

        TransformerState stateMove = new MoveState();
        TransformerState stateFire = new FireState();

        context.setState(stateFire);
        context.action();

        context.setState(stateMove);
        context.action();
    }

}
