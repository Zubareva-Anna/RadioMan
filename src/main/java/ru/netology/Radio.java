package ru.netology;

public class Radio {

    private int currentRadioStation;
    private static final int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int countRadioStation = 10;
    private int currentVolume;
    private static final int minVolume = 0;
    private static final int maxVolume = 10;


    public Radio(int countRadioStation) {
        this.countRadioStation = countRadioStation;
        this.maxRadioStation = countRadioStation - 1;
    }

    public Radio() {
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minRadioStation) {
            return;
        }
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void prevStation() {
        this.currentRadioStation--;
        if (currentRadioStation < minRadioStation) {
            currentRadioStation = maxRadioStation;
            return;
        }
    }

    public void nextStation() {
        this.currentRadioStation++;
        if (currentRadioStation > maxRadioStation) {
            currentRadioStation = minRadioStation;
            return;
        }
    }


    public void decreaseVolume() {
        this.currentVolume--;
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
            return;
        }
    }

    public void increaseVolume() {
        this.currentVolume++;
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
            return;
        }
    }

    public int getCountRadioStation() {
        return countRadioStation;
    }

    public int getCurrentRadioStation() {

        return currentRadioStation;
    }
    public int getMinRadioStation() {

        return minRadioStation;
    }

    public int getMaxRadioStation() {

        return maxRadioStation;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public int getMinVolume() {

        return minVolume;
    }

    public int getMaxVolume() {

        return maxVolume;
    }
}
