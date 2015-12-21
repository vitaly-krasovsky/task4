package com.epam.mentoring;

import com.epam.mentoring.composite.AbstractNode;
import com.epam.mentoring.composite.LeafNode;
import com.epam.mentoring.composite.ParentNode;

/**
 * Main application.
 *
 * @author vkrasovsky
 */
public class App {

    public static void main(String[] args) {
//                          parent-0
//         parent-1                              parent-2
//  leaf-1      parent-3                parent-4                   parent-5
//         leaf-2      leaf-3       leaf-5    leaf-6        parent-6      leaf-7
//                                                     leaf-8     leaf-9
//

        AbstractNode leaf2 = new LeafNode<>("leaf-2");
        AbstractNode leaf3 = new LeafNode<>("leaf-3");
        AbstractNode leaf1 = new LeafNode<>("leaf-1");
        AbstractNode parent3 = new ParentNode("parent-3");
        parent3.addLeft(leaf2);
        parent3.addRight(leaf3);
        AbstractNode parent1 = new ParentNode("parent-1");
        parent1.addLeft(leaf1);
        parent1.addRight(parent3);

        AbstractNode leaf8 = new LeafNode<>("leaf-8");
        AbstractNode leaf9 = new LeafNode<>("leaf-9");
        AbstractNode leaf7 = new LeafNode<>("leaf-7");
        AbstractNode parent6 = new ParentNode("parent-6");
        parent6.addLeft(leaf8);
        parent6.addRight(leaf9);
        AbstractNode parent5 = new ParentNode("parent-5");
        parent5.addLeft(parent6);
        parent5.addRight(leaf7);

        AbstractNode leaf5 = new LeafNode<>("leaf-5");
        AbstractNode leaf6 = new LeafNode<>("leaf-6");
        AbstractNode parent4 = new ParentNode("parent-4");
        parent4.addLeft(leaf5);
        parent4.addRight(leaf6);
        AbstractNode parent2 = new ParentNode("parent-2");
        parent2.addLeft(parent4);
        parent2.addRight(parent5);

        AbstractNode parent0 = new ParentNode("parent-0");
        parent0.addLeft(parent1);
        parent0.addRight(parent2);

        parent0.displayValueInformation();
    }
}
