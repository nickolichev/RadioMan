package ru.netology.radiostation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTests {
    RadioSettings station = new RadioSettings() {
    };

    RadioSettings range = new RadioSettings(5) {};

    @Test
    void settingNext() {

        station.setCurrentNext(true, 6);
        assertEquals(7, station.getCurrentNext());
    }

    @Test
    void settingNextFalse() {

        station.setCurrentNext(false, 6);
        assertEquals(6, station.getCurrentNext());
    }

    @Test
    void settingPrev() {

        station.setCurrentPrev(true, 4);
        assertEquals(3, station.getCurrentPrev());
    }

    @Test
    void settingPrevFalse() {

        station.setCurrentPrev(false, 4);
        assertEquals(4, station.getCurrentPrev());
    }

    @Test
    void settingsDefault() {

        station.setCurrentDefault(10);
        assertEquals(10, station.getCurrentDefault());
    }

    @Test
    void settingsDefaultUp() {

        station.setCurrentDefault(11);
        assertEquals(100, station.getCurrentDefault());
    }

    @Test
    void settingsDefaultDown() {

        station.setCurrentDefault(-1);
        assertEquals(100, station.getCurrentDefault());
    }

    @Test
    void settingsUp() {

        station.setCurrentStation(11);
        assertEquals(100, station.getCurrentStation());
    }

    @Test
    void settingsDown() {

        station.setCurrentStation(-1);
        assertEquals(-100, station.getCurrentStation());
    }

    @Test
    void settingsMax() {

        station.setCurrentStation(9);
        assertEquals(0, station.getCurrentStation());
    }

    @Test
    void settingsMin() {

        station.setCurrentStation(0);
        assertEquals(9, station.getCurrentStation());
    }

    @Test
    void settingsMinFalse() {

        station.setCurrentStation(1);
        assertEquals(0, station.getCurrentStation());
    }

    @Test
    void settingsRange() {

        range.setCurrentRange(5);
        assertEquals(5, range.getCurrentRange());
    }

    @Test
    void settingsRangeFalse() {

        range.setCurrentRange(9);
        assertEquals(0, range.getCurrentRange());
    }

    @Test
    void settingsVolumeNext() {

        station.setVolumeNext(true, 50);
        assertEquals(51, station.getVolumeNext());
    }

    @Test
    void settingsVolumeNextFalse() {

        station.setVolumeNext(false, 50);
        assertEquals(50, station.getVolumeNext());
    }

    @Test
    void settingsVolumePrev() {

        station.setVolumePrev(true, 50);
        assertEquals(49, station.getVolumePrev());
    }

    @Test
    void settingsVolumePrevFalse() {

        station.setVolumePrev(false, 40);
        assertEquals(40, station.getVolumePrev());
    }

    @Test
    void settingsVolumeUp() {

        station.setCurrentVolume(101);
        assertEquals(100, station.getCurrentVolume());
    }

    @Test
    void settingsVolumeDown() {

        station.setCurrentVolume(-1);
        assertEquals(0, station.getCurrentVolume());
    }
}







