package org.example.AlgorithmByDijkstra;

public class Vertex { // объект данного класса содержит наименование вершины и флаг, указывающий на то, рассмотрена вершина или нет
    private char label;
    private boolean isInTree;

    public Vertex(char label) {
        this.label = label;
        this.isInTree = false;
    }

    public char getLabel() {
        return label;
    }

    public boolean isInTree() {
        return isInTree;
    }

    public void setInTree(boolean inTree) {
        isInTree = inTree;
    }
}
