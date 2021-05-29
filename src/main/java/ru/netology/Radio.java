package ru.netology;


import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data

public class Radio {

    private int currentRadioStation;
    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int countRadioStation = 10;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 10;


    public Radio(int countRadioStation) {
        this.countRadioStation = countRadioStation;
        this.maxRadioStation = countRadioStation - 1;
    }

//    public Radio() {
//    }

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

    public void setMinRadioStation(int minRadioStation) {
        this.minRadioStation = minRadioStation;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

//    public int getCountRadioStation() {
//        return countRadioStation;
//    }
//
//    public int getCurrentRadioStation() {
//
//        return currentRadioStation;
//    }
//    public int getMinRadioStation() {
//
//        return minRadioStation;
//    }
//
//    public int getMaxRadioStation() {
//
//        return maxRadioStation;
//    }
//
//    public int getCurrentVolume() {
//
//        return currentVolume;
//    }
//
//    public int getMinVolume() {
//
//        return minVolume;
//    }
//
//    public int getMaxVolume() {
//
//        return maxVolume;
//    }
}
