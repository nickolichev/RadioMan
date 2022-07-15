package ru.netology.radiostation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTests {

  RadioSettings station = new RadioSettings() {
  };

  @Test
  void settingsRangeDefault() {
    RadioSettings station = new RadioSettings(20) {
    };
    station.setRangeDefault(15);
    assertEquals(15, station.getRangeDefault());
  }

  @Test
  void settingsUpRangeDefault() {
    RadioSettings station = new RadioSettings(20) {
    };
    station.setRangeDefault(21);
    assertEquals(0, station.getRangeDefault());
  }

  @Test
  void settingsDownRangeDefault() {
    RadioSettings station = new RadioSettings(20) {
    };
    station.setRangeDefault(-1);
    assertEquals(0, station.getRangeDefault());
  }

  @Test
  void settingsUpMaxStationUser() {
    station.setCurrentStation(10);
    assertEquals(404, station.getCurrentStation());
  }

  @Test
  void settingsDownMinStationUser() {
    station.setCurrentStation(-1);
    assertEquals(404, station.getCurrentStation());
  }

  @Test
  void settingsCurrentStation() {
    station.setCurrentStation(1);
    assertEquals(station.getStation(), station.getCurrentStation());
  }

  @Test
  void settingNextStation() {
    station.setCurrentStation(6);
    station.nextStation();
    assertEquals(7, station.getCurrentStation());
  }

  @Test
  void settingNextForMaxStation() {
    station.setCurrentStation(9);
    station.nextStation();
    assertEquals(station.getMinStation(), station.getCurrentStation());
  }


  @Test
  void settingPrevStation() {
    station.setCurrentStation(6);
    station.prevStation();
    assertEquals(5, station.getCurrentStation());
  }

  @Test
  void settingPrevBeforeMinStation() {
    station.setCurrentStation(0);
    station.prevStation();
    assertEquals(station.getMaxStation(), station.getCurrentStation());
  }

  @Test
  void settingsCurrentVolume() {
    station.setCurrentVolume(1);
    assertEquals(station.getCurrentVolume(), station.getCurrentVolume());
  }

  @Test
  void settingsNextVolume() {
    station.setCurrentVolume(50);
    station.nextVolume();
    assertEquals(51, station.getCurrentVolume());
  }

  @Test
  void settingsPrevVolume() {
    station.setCurrentVolume(50);
    station.prevVolume();
    assertEquals(49, station.getCurrentVolume());
  }

  @Test
  void settingsVolumeMax() {
    station.setCurrentVolume(station.getMaxVolume());
    station.nextVolume();
    assertEquals(station.getMaxVolume(), station.getCurrentVolume());
  }

  @Test
  void settingsVolumeMin() {
    station.setCurrentVolume(station.getMinVolume());
    station.prevVolume();
    assertEquals(station.getMinVolume(), station.getCurrentVolume());
  }

  @Test
  void settingsUpVolumeMax() {
    station.setCurrentVolume(101);
    station.nextVolume();
    assertEquals(station.getMaxVolume(), station.getCurrentVolume());
  }

  @Test
  void settingsDownVolumeMin() {
    station.setCurrentVolume(-1);
    station.prevVolume();
    assertEquals(station.getMinVolume(), station.getCurrentVolume());
  }
}