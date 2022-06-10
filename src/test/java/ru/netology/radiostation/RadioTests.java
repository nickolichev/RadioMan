package ru.netology.radiostation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTests {

    @Test
    void stationBack() {

        RadioSettings station = new RadioSettings();

        station.setCurrentStation(9);
        station.BackStation();

        int actual = station.getCurrentStation();
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    void stationForvard() {

        RadioSettings station = new RadioSettings();

        station.setCurrentStation(0);
        station.ForvardStation();

        int actual = station.getCurrentStation();
        int expected = 9;

        assertEquals(actual, expected);
    }

    @Test
    void stationPlus() {

        RadioSettings station = new RadioSettings();

        station.setCurrentStation(6);
        station.PlusStation();

        int actual = station.getCurrentStation();
        int expected = 7;

        assertEquals(actual, expected);
    }

    @Test
    void stationMinus() {

        RadioSettings station = new RadioSettings();

        station.setCurrentStation(6);
        station.MinusStation();

        int actual = station.getCurrentStation();
        int expected = 5;

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

        station.setCurrentVolume(8);
        station.IncreaseVolume();

        int actual = station.getCurrentVolume();
        int expected = 9;

        assertEquals(actual, expected);
    }

    @Test
    void MaxIncreaseVolume() {

        RadioSettings station = new RadioSettings();

        station.setCurrentVolume(10);
        station.IncreaseVolume();

        int actual = station.getCurrentVolume();
        int expected = 10;

        assertEquals(actual, expected);
    }

    @Test
    void DecreaseVolume() {

        RadioSettings station = new RadioSettings();

        station.setCurrentVolume(3);
        station.DecreaseVolume();

        int actual = station.getCurrentVolume();
        int expected = 2;

        assertEquals(actual, expected);
    }

    @Test
    void DecreaseVolumeOut() {

        RadioSettings station = new RadioSettings();

        station.setCurrentVolume(0);
        station.DecreaseVolume();

        int actual = station.getCurrentVolume();
        int expected = 0;

        assertEquals(actual, expected);
    }
}













