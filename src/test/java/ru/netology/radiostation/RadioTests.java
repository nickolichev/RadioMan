package ru.netology.radiostation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTests {

    @Test
    void stationNext() {

        RadioSettings station = new RadioSettings();

        int[] stations = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        station.setNextStation(stations);

        int actual = station.getNextStation();
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    void stationPrev() {

        RadioSettings station = new RadioSettings();

        int[] stations = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        station.setPrevStation(stations);

        int actual = station.getPrevStation();
        int expected = 9;

        assertEquals(actual, expected);
    }

    @Test
    void stationNum() {

        RadioSettings station = new RadioSettings();

        station.setNumStation(5);

        int actual = station.getNumStation();
        int expected = 5;

        assertEquals(actual, expected);
    }

    @Test
    void stationNumPlus() {

        RadioSettings station = new RadioSettings();

        station.setNumStation(11);

        int actual = station.getNumStation();
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    void stationNumMinus() {

        RadioSettings station = new RadioSettings();

        station.setNumStation(-1);

        int actual = station.getNumStation();
        int expected = 0;

        assertEquals(actual, expected);
    }
    @Test
    void IncreaseVolume() {

        RadioSettings station = new RadioSettings();

        int levelVolume = 5;

        station.setIncreaseVolume(levelVolume);

        int actual = station.getIncreaseVolume();
        int expected = 6;

        assertEquals(actual, expected);
    }

    @Test
    void MaxIncreaseVolume() {

        RadioSettings station = new RadioSettings();

        int levelVolume = 10;

        station.setIncreaseVolume(levelVolume);

        int actual = station.getIncreaseVolume();
        int expected = 10;

        assertEquals(actual, expected);
    }

    @Test
    void DecreaseVolume() {

        RadioSettings station = new RadioSettings();

        int levelVolume = 6;

        station.setDecreaseVolume(levelVolume);

        int actual = station.getDecreaseVolume();
        int expected = 5;

        assertEquals(actual, expected);
    }

    @Test
    void DecreaseVolumeOut() {

        RadioSettings station = new RadioSettings();

        int levelVolume = 10;

        station.setDecreaseVolume(levelVolume);

        int actual = station.getDecreaseVolume();
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    void MinDecreaseVolume() {

        RadioSettings station = new RadioSettings();

        int levelVolume = 0;

        station.setDecreaseVolume(levelVolume);

        int actual = station.getDecreaseVolume();
        int expected = 0;

        assertEquals(actual, expected);
    }
}














