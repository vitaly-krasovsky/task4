package com.epam.mentoring.composite;

/**
 * Base implementation of leaf node.
 *
 * @author Vitaly_Krasovsky.
 */
public class LeafNode<T> extends AbstractNode {
    private T value;

    public LeafNode(T value) {
        this.value = value;
    }

    /**
     * Simple output leaf value in console.
     */
    @Override
    public void displayValueInformation() {
        System.out.println("---start-" + value + "---");
        System.out.println(value);
        System.out.println("---end-" + value + "---");
    }

    public T getValue() {
        return value;
    }
}
