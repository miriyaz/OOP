package com.day3;

import java.util.Random;

public class simulation {
    public static void main(String[] args) {
        int population = 100;
        double birthRate = 0.05;
        double deathRate = 0.02;
        int generations = 20;

        Random random = new Random();

        System.out.println("Starting simulation...");
        for (int i = 1; i <= generations; i++) {
            int births = 0;
            int deaths = 0;

            for (int j = 0; j < population; j++) {
                if (random.nextDouble() < birthRate) births++;
                if (random.nextDouble() < deathRate) deaths++;
            }

            population += births - deaths;
            System.out.printf("Generation %d → Population: %d (Births: %d, Deaths: %d)%n",
                    i, population, births, deaths);
        }

        System.out.println("Simulation complete.");
    }
}
