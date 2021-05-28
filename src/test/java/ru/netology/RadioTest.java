package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    public void clickChannel() {
        Radio radio = new Radio(0, 0, 10, 99, 0, 100);
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(9);
        assertEquals(9, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(10);
        assertEquals(10, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(11);
        assertEquals(10, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(-1);
        assertEquals(10, radio.getCurrentRadioStation());
    }

    @Test
    public void changeChannel() {
        Radio radio = new Radio(0, 0, 10, 99, 0, 100);
        assertEquals(0, radio.getCurrentRadioStation());
        radio.prevStation();
        assertEquals(radio.getMaxRadioStation(), radio.getCurrentRadioStation());
        radio.nextStation();
        assertEquals(radio.getMinRadioStation(), radio.getCurrentRadioStation());
    }

    @Test
    public void changeToMaxChannel() {
        Radio radio = new Radio(0, 0, 10, 99, 0, 100);
        assertEquals(0, radio.getCurrentRadioStation());
        radio.nextStation();
        assertEquals(1, radio.getCurrentRadioStation());
        radio.nextStation();
        assertEquals(2, radio.getCurrentRadioStation());
        radio.nextStation();
        assertEquals(3, radio.getCurrentRadioStation());
        radio.nextStation();
        assertEquals(4, radio.getCurrentRadioStation());
        radio.nextStation();
        assertEquals(5, radio.getCurrentRadioStation());
        radio.nextStation();
        assertEquals(6, radio.getCurrentRadioStation());
        radio.nextStation();
        assertEquals(7, radio.getCurrentRadioStation());
        radio.nextStation();
        assertEquals(8, radio.getCurrentRadioStation());
        radio.nextStation();
        assertEquals(9, radio.getCurrentRadioStation());
        radio.nextStation();
        assertEquals(10, radio.getCurrentRadioStation());
        radio.nextStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void changeToMinChannel() {
        Radio radio = new Radio(0, 0, 10, 99, 0, 100);
        assertEquals(0, radio.getCurrentRadioStation());
        radio.prevStation();
        assertEquals(10, radio.getCurrentRadioStation());
        radio.prevStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void clickToMaxVolume() {
        Radio radio = new Radio(0, 0, 10, 99, 0, 100);
        assertEquals(99, radio.getCurrentVolume());
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
        radio.increaseVolume();
    }

    @Test
    public void clickToMinVolume() {
        Radio radio = new Radio(0, 0, 100, 1, 0, 100);
        assertEquals(1, radio.getCurrentVolume());
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());

    }

    @Test
    public void maxVolume() {
        Radio radio = new Radio(0, 0, 100, 100, 0, 100);
        assertEquals(100, radio.getMaxVolume());
        radio.increaseVolume();
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void minVolume() {
        Radio radio = new Radio(0, 0, 100, 0, 0, 100);
        assertEquals(0, radio.getMinVolume());
        radio.decreaseVolume();
        assertEquals(0, radio.getMinVolume());
    }
}