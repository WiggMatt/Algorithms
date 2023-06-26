package org.example.WorkingWithTrees;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFSandDFS {
    private static int[][] adjMatrix; // матрица смежности
    private static boolean[] visited; // массив посещенных вершин
    private static Queue<Integer> queue; // очередь для BFS

    public static void main(String[] args) {
        int numVertices = 6; // количество вершин
        adjMatrix = new int[numVertices][numVertices]; // создание матрицы смежности
        visited = new boolean[numVertices]; // создание массива посещенных вершин
        queue = new LinkedList<>(); // создание очереди для BFS

        // инициализация матрицы смежности
        adjMatrix[0][1] = 1;
        adjMatrix[0][2] = 1;
        adjMatrix[1][3] = 1;
        adjMatrix[1][4] = 1;
        adjMatrix[2][4] = 1;
        adjMatrix[3][5] = 1;
        adjMatrix[4][5] = 1;

        System.out.print("BFS: ");
        bfs(0); // запуск BFS с начальной вершиной 0
        Arrays.fill(visited, false); // очистка массива посещенных вершин

        System.out.print("\nDFS: ");
        dfs(0); // запуск DFS с начальной вершиной 0
    }

    // поиск в ширину
    private static void bfs(int start) {
        visited[start] = true; // пометить начальную вершину как посещенную
        queue.offer(start); // добавить начальную вершину в очередь

        while (!queue.isEmpty()) {
            int vertex = queue.poll(); // извлечь вершину из очереди
            System.out.print(vertex + " "); // вывести значение вершины

            // перебрать все вершины, смежные с текущей вершиной
            for (int i = 0; i < adjMatrix.length; i++) {
                if (adjMatrix[vertex][i] == 1 && !visited[i]) {
                    visited[i] = true; // пометить вершину как посещенную
                    queue.offer(i); // добавить вершину в очередь
                }
            }
        }
    }

    // поиск в глубину
    private static void dfs(int vertex) {
        visited[vertex] = true; // пометить вершину как посещенную
        System.out.print(vertex + " "); // вывести значение вершины

        // перебрать все вершины, смежные с текущей вершиной
        for (int i = 0; i < adjMatrix.length; i++) {
            if (adjMatrix[vertex][i] == 1 && !visited[i]) {
                dfs(i); // рекурсивный вызов для смежной вершины
            }
        }
    }
}