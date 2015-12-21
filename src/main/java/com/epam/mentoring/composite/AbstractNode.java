package com.epam.mentoring.composite;

/**
 * Base class for all nodes. Parent node holds only two child.
 *
 * @author Vitaly_Krasovsky.
 */
public abstract class AbstractNode {
    public void addLeft(AbstractNode node) {
        throw new UnsupportedOperationException();
    }

    public void removeLeft() {
        throw new UnsupportedOperationException();
    }

    public void addRight(AbstractNode node) {
        throw new UnsupportedOperationException();
    }

    public void removeRight() {
        throw new UnsupportedOperationException();
    }

    public void displayValueInformation() {
        throw new UnsupportedOperationException();
    }
}
