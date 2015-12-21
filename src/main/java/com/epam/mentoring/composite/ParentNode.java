package com.epam.mentoring.composite;

/**
 * Base implementation of the parent node.
 *
 * @author Vitaly_Krasovsky.
 */
public class ParentNode extends AbstractNode {
    private String name;
    private AbstractNode left;
    private AbstractNode right;

    public ParentNode(String name) {
        this.name = name;
    }

    @Override
    public void addLeft(AbstractNode node) {
        this.left = node;
    }

    @Override
    public void removeLeft() {
        this.left = null;
    }

    @Override
    public void addRight(AbstractNode node) {
        this.right = node;
    }

    @Override
    public void removeRight() {
        this.right = null;
    }

    public AbstractNode getLeft() {
        return left;
    }

    public AbstractNode getRight() {
        return right;
    }

    public String getName() {
        return name;
    }

    /**
     * Simple output left and right values in console.
     */
    @Override
    public void displayValueInformation() {
        System.out.println("---start-" + name + "---");
        left.displayValueInformation();
        right.displayValueInformation();
        System.out.println("---end-" + name + "---");
    }
}
