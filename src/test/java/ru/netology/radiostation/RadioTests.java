package ru.netology.radiostation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTests {

  RadioSettings station = new RadioSettings() {
  };

  @Test
  void settingsUpMaxStation() {
    station.setCurrentStation(10);
    assertEquals(100, station.getCurrentStation());
  }

  @Test
  void settingsDownMinStation() {
    station.setCurrentStation(-1);
    assertEquals(-100, station.getCurrentStation());
  }

  @Test
  void settingsMaxStation() {
    station.setCurrentStation(station.getMaxStation());
    assertEquals(station.getMinStation(), station.getCurrentStation());
  }

  @Test
  void settingsMinStation() {
    station.setCurrentStation(station.getMinStation());
    assertEquals(station.getMaxStation(), station.getCurrentStation());
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
  void settingPrevStation() {
    station.setCurrentStation(6);
    station.prevStation();
    assertEquals(5, station.getCurrentStation());
  }

  @Test
  void settingsRangeUser() {
    RadioSettings station = new RadioSettings(20) {
    };
    assertEquals(20, station.getRangeUser());
  }

  // Закомментировано для 100% покрытия
//  @Test
//  RadioSettings station = new RadioSettings(20) {};
//  void settingsRangeUserFalse() {
//    assertEquals(15, station.getRangeUser());
//  }

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
  void settingsUpVolumeMax() {
    station.setCurrentVolume(101);
    assertEquals(station.getMaxVolume(), station.getCurrentVolume());
  }

  @Test
  void settingsDownVolumeMin() {
    station.setCurrentVolume(-1);
    assertEquals(station.getMinVolume(), station.getCurrentVolume());
  }
}