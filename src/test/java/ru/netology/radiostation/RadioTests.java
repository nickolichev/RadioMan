package ru.netology.radiostation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTests {

    @Test
    void stationMinimum() {

        RadioSettings station = new RadioSettings();

        station.setCurrentStation(-1);
        station.stationMin();

        int actual = station.getCurrentStation();
        int expected = -100;

        assertEquals(actual, expected);
    }

    @Test
    void stationMaximum() {

        RadioSettings station = new RadioSettings();

        station.setCurrentStation(10);
        station.stationMax();

        int actual = station.getCurrentStation();
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    void stationBack() {

        RadioSettings station = new RadioSettings();

        station.setCurrentStation(9);
        station.backStation();

        int actual = station.getCurrentStation();
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    void stationForvard() {

        RadioSettings station = new RadioSettings();

        station.setCurrentStation(0);
        station.forvardStation();

        int actual = station.getCurrentStation();
        int expected = 9;

        assertEquals(actual, expected);
    }

    @Test
    void stationPlus() {

        RadioSettings station = new RadioSettings();

        station.setCurrentStation(6);
        station.plusStation();

        int actual = station.getCurrentStation();
        int expected = 7;

        assertEquals(actual, expected);
    }

    @Test
    void stationMinus() {

        RadioSettings station = new RadioSettings();

        station.setCurrentStation(6);
        station.minusStation();

        int actual = station.getCurrentStation();
        int expected = 5;

        assertEquals(actual, expected);
    }

    @Test
    void stationNum() {

        RadioSettings station = new RadioSettings();

        station.setCurrentStation(5);
        station.numStation();

        int actual = station.getCurrentStation();
        int expected = 5;

        assertEquals(actual, expected);
    }

    @Test
    void IncreaseVolume() {

        RadioSettings station = new RadioSettings();

        station.setCurrentVolume(8);
        station.increaseVolume();

        int actual = station.getCurrentVolume();
        int expected = 9;

        assertEquals(actual, expected);
    }

    @Test
    void MaxIncreaseVolume() {

        RadioSettings station = new RadioSettings();

        station.setCurrentVolume(10);
        station.increaseVolume();

        int actual = station.getCurrentVolume();
        int expected = 10;

        assertEquals(actual, expected);
    }

    @Test
    void DecreaseVolume() {

        RadioSettings station = new RadioSettings();

        station.setCurrentVolume(3);
        station.decreaseVolume();

        int actual = station.getCurrentVolume();
        int expected = 2;

        assertEquals(actual, expected);
    }

    @Test
    void DecreaseVolumeOut() {

        RadioSettings station = new RadioSettings();

        station.setCurrentVolume(0);
        station.decreaseVolume();

        int actual = station.getCurrentVolume();
        int expected = 0;

        assertEquals(actual, expected);
    }
}













