package observer;

import subject.Subject;

public class OctObserver extends Observer {

    public OctObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.print(" " + Integer.toOctalString(subject.getState()));
    }
}
