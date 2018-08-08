package api;

import api.model.Transition;

public class TransitionFunc {
    public static Transition findTransitionByName(Transition[] transitions, String name) {
        for (Transition trans : transitions) {
            if(trans.name.equals(name)) {
                return trans;
            }
        }
        throw new NullPointerException("Переход '"+name+"' не найден");
    }
}
