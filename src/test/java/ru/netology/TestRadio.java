package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestRadio {
    @Test
    public void clickChannel() {
        Radio radio = new Radio();
        assertEquals( 0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(9);
        assertEquals(9, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(10);
        assertEquals(9, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(-1);
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void changeChannel() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentRadioStation());
        radio.prevStation();
        assertEquals(radio.getMaxRadioStation(), radio.getCurrentRadioStation());
        radio.nextStation();
        assertEquals(radio.getMinRadioStation(), radio.getCurrentRadioStation());
    }

    @Test
    public void changeToMaxChannel() {
        Radio radio = new Radio();
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
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void changeToMinChannel() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentRadioStation());
        radio.prevStation();
        assertEquals(9, radio.getCurrentRadioStation());
        radio.prevStation();
        assertEquals(8, radio.getCurrentRadioStation());
    }
    @Test
    public void clickToMaxVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.increaseVolume();
        assertEquals(1, radio.getCurrentVolume());
        radio.increaseVolume();
        assertEquals(2, radio.getCurrentVolume());
        radio.increaseVolume();
        assertEquals(3, radio.getCurrentVolume());
        radio.increaseVolume();
        assertEquals(4, radio.getCurrentVolume());
        radio.increaseVolume();
        assertEquals(5, radio.getCurrentVolume());
        radio.increaseVolume();
        assertEquals(6, radio.getCurrentVolume());
        radio.increaseVolume();
        assertEquals(7, radio.getCurrentVolume());
        radio.increaseVolume();
        assertEquals(8, radio.getCurrentVolume());
        radio.increaseVolume();
        assertEquals(9, radio.getCurrentVolume());
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
        radio.decreaseVolume();
        assertEquals(9, radio.getCurrentVolume());
    }

    @Test
    public void clickToMinVolume() {
        Radio radio = new Radio();
        assertEquals(0,radio.getCurrentVolume());
        radio.decreaseVolume();
        assertEquals(0,radio.getCurrentVolume());

    }

    @Test
    public void maxVolume() {
        Radio radio = new Radio();
        assertEquals(10, radio.getMaxVolume());
        radio.increaseVolume();
        assertEquals(10, radio.getMaxVolume());
    }

    @Test
    public void minVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.getMinVolume());
        radio.decreaseVolume();
        assertEquals(0, radio.getMinVolume());
    }
}