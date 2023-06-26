package org.example.GreedyAlgorithm;

/*
Вы открываете собственную авторскую программу на радио и хотите, чтобы вас слушали во всех 50 штатах.
Нужно решить, на каких радиостанциях должна транслироваться ваша передача. Каждая станция стоит денег,
поэтому количество станций необходимо свести к минимуму.
 */

import java.util.*;

public class GreedyAlgorithm {
    public static void main(String[] args) {
        // список штатов
        Set<String> statesNeeded = new HashSet<>(Arrays.asList("mt", "wa", "or", "id", "nv", "ut", "ca", "az"));

        // список станций
        Map<String, Set<String>> stations = new HashMap<>();
        stations.put("kone", new HashSet<>(Arrays.asList("id", "nv", "ut")));
        stations.put("ktwo", new HashSet<>(Arrays.asList("wa", "id", "mt")));
        stations.put("kthree", new HashSet<>(Arrays.asList("or", "nv", "ca")));
        stations.put("kfour", new HashSet<>(Arrays.asList("nv", "ut")));
        stations.put("kfive", new HashSet<>(Arrays.asList("ca", "az")));

        // итоговый набор станций
        Set<String> finalStations = new HashSet<>();

        while (!statesNeeded.isEmpty()) {
            // станция, которая обслуживает больше всего штатов, не входящих в текущее покрытие
            String bestStation = null;
            // содержит все штаты, обслуживаемые этой станцией, которые еще не входят в текущее покрытие
            Set<String> statesCovered = new HashSet<>();
            // цикл перебирает все станции и находит среди них лучшую
            for (Map.Entry<String, Set<String>> station : stations.entrySet()) {
                // множество штатов, не входящих в покрытие, которые покрываются текущей станцией
                Set<String> covered = new HashSet<>(statesNeeded);
                covered.retainAll(station.getValue());
                if (covered.size() > statesCovered.size()) {
                    bestStation = station.getKey();
                    statesCovered = covered;
                }
            }
            statesNeeded.removeAll(statesCovered);
            finalStations.add(bestStation);
        }

        System.out.println(finalStations);
    }
}

