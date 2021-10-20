package ru.netology.sqr;

public class SQRService {
    public int count(int lowerLimit, int upperLimit) {
        int counter = 0;
        for (int i = 10; i < 100; i++) {
            if (i * i >= lowerLimit) {
                if (i * i <= upperLimit) {
                    counter++;
                }
            }
        }
        return (counter);
    }
}
