package week11.snake2;

import java.util.ArrayList;
import java.util.List;

public class Snake {
    private List<SnakeNode> nodes;

    public Snake(int x, int y) {
        nodes = new ArrayList<SnakeNode>();
        // Create some nodes by default
        for (int i = 0; i < 5; i++) {
            nodes.add(new SnakeNode(x + i, y));
        }
    }

    public void move() {
        for (SnakeNode node : nodes) {
            node.move();
        }

        // Adjust the directions. Each node gets the direction of the node in front of it.
        // This loop has to iterate the list backwards
        for (int i = nodes.size() - 1; i > 0; i--) {
            SnakeNode prevNode = nodes.get(i - 1);
            nodes.get(i).setDirection(prevNode.getDirection());
        }
    }

    public void turnLeft() {
        SnakeNode head = nodes.get(0);
        head.turnLeft();
    }

    public void turnRight() {
        SnakeNode head = nodes.get(0);
        head.turnRight();
    }

    public List<SnakeNode> getNodes() {
        return nodes;
    }

    public void grow() {
        SnakeNode lastNode = nodes.get(nodes.size() - 1);
        SnakeNode newNode = new SnakeNode(lastNode.getX(), lastNode.getY());
        newNode.setDirection(lastNode.getDirection());
        newNode.moveBackwards();
        nodes.add(newNode);
    }

    public void shrink() {
        if (nodes.size() > 1) {
            // Remove the last node
            nodes.remove(nodes.size() - 1);
        }
    }

    public boolean collidesWith(Item item) {
        SnakeNode head = nodes.get(0);
        return head.getX() == item.getX() && head.getY() == item.getY();
    }
}
