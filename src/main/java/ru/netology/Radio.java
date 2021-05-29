package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Radio {

    private int currentRadioStation;
    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 10;

//    public Radio(int currentRadioStation,
//                 int minRadioStation,
//                 int maxRadioStation,
//                 int currentVolume,
//                 int minVolume,
//                 int maxVolume) {
//        this.currentRadioStation = currentRadioStation;
//        this.minRadioStation = minRadioStation;
//        this.maxRadioStation = maxRadioStation;
//        this.currentVolume = currentVolume;
//        this.minVolume = minVolume;
//        this.maxVolume = maxVolume;
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

//    public int getCurrentRadioStation() {
//
//        return currentRadioStation;
//    }
//
//    public int getMinRadioStation() {
//        return minRadioStation;
//    }
//
//    public int getMaxRadioStation() {
//        return maxRadioStation;
//    }
//
//    public int getCurrentVolume() {
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
}
