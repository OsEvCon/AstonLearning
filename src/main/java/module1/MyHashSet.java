package module1;

public class MyHashSet<T> {
    private static final int DEFAULT_CAPACITY = 16;
    private static final float CAPACITY_LOAD = 0.75f;
    private Node<T>[] elements;
    private int size;

    public MyHashSet(){
        elements = new Node[DEFAULT_CAPACITY];
    }

    public boolean add(T value){
        int hash = value == null ? 0 : value.hashCode();
        int index = (elements.length - 1) & hash;
        Node<T> currentNode = elements[index];

        while (currentNode != null){
            if (currentNode.nodeHash == hash &&
                    (currentNode.nodeValue == value ||
                            (value != null && value.equals(currentNode.nodeValue))))
            {
                return false;
            }
            currentNode = currentNode.nextNode;
        }

        elements[index] = new Node<>(value, hash, elements[index]);
        size++;

        if (size > elements.length * CAPACITY_LOAD) {
            resize();
        }
        return true;
    }

    public boolean remove(T value){
        int hash = value == null ? 0 : value.hashCode();
        int index = (elements.length - 1) & hash;

        Node<T> currentNode = elements[index];
        Node<T> previousNode = null;

        while (currentNode != null){
            if  (currentNode.nodeHash == hash &&
                    (currentNode.nodeValue == value ||
                            (value != null && value.equals(currentNode.nodeValue))))
            {
                if (previousNode == null) {
                    elements[index] = currentNode.nextNode;
                } else {
                    previousNode.nextNode = currentNode.nextNode;
                }
                size--;
                return true;
            }
            previousNode = currentNode;
            currentNode = currentNode.nextNode;
        }
        return false;
    }

    private void resize() {
        Node<T>[] oldElements = elements;
        elements = new Node[oldElements.length * 2];
        size = 0;

        for (Node<T> element : oldElements){
            while (element != null) {
                add(element.nodeValue);
                element = element.nextNode;
            }
        }
    }

    private static class Node<T> {
        final T nodeValue;
        final int nodeHash;
        Node<T> nextNode;

        public Node(T nodeValue, int nodeHash, Node<T> nextNode) {
            this.nodeValue = nodeValue;
            this.nodeHash = nodeHash;
            this.nextNode = nextNode;
        }
    }


}
