package api.model;

public class TransitionCreate {

    public Transition transition;

    public TransitionCreate(String id) {

        this.transition = new Transition(id);
    }
}
