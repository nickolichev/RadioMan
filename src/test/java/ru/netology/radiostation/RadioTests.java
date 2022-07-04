package ru.netology.radiostation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTests {

  RadioSettings station = new RadioSettings(
          15,
          0,
          9,
          6,
          0,
          100,
          50) {
  };

  RadioSettings stationDefault = new RadioSettings() {
  };

  @Test
  void settingNextStation() {
    station.setCurrentNext(true, station.getStation());
    assertEquals(7, station.getCurrentNext());
  }

  @Test
  void settingNextFalse() {
    station.setCurrentNext(false, station.getStation());
    assertEquals(station.getStation(), station.getCurrentNext());
  }

  @Test
  void settingPrevStation() {
    station.setCurrentPrev(true, station.getStation());
    assertEquals(5, station.getCurrentPrev());
  }

  @Test
  void settingPrevFalse() {
    station.setCurrentPrev(false, station.getStation());
    assertEquals(station.getStation(), station.getCurrentPrev());
  }

  @Test
  void settingsRangeDefault() {
    // здесь не проверяем условия, проверяем корректность
    // введенных/установленных дефолтных настроек радио
    assertEquals(10, stationDefault.getRangeDefault());
  }

  @Test
  void settingsRangeUser() {
    // здесь не проверяем условия, проверяем возможность
    // установки пользовательских настроек радио и их корректность
    assertEquals(15, station.getRangeUser());
  }

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
  void settingsFalse() {
    station.setCurrentStation(1);
    assertEquals(station.getStation(), station.getCurrentStation());
  }

  @Test
  void settingsVolumeMin() {
    //  методы без условий нет смысла проверять, но
    // я тестирую для того, чтобы убедиться/подтвердить,
    //  что параметры объекте RadioSettings
    // правильно взяты/установлены
    assertEquals(0, station.getMinVolume());
  }

  @Test
  void settingsVolumeMax() {
    //  методы без условий нет смысла проверять, но
    // я тестирую, что параметры объекте RadioSettings
    // правильно взяты/установлены
    assertEquals(100, station.getMaxVolume());
  }

  @Test
  void settingsVolumeNext() {
    station.setVolumeNext(true, station.getVolume());
    assertEquals(51, station.getVolumeNext());
  }

  @Test
  void settingsVolumeNextFalse() {
    station.setVolumeNext(false, station.getCurrentVolume());
    assertEquals(station.getCurrentVolume(), station.getVolumeNext());
  }

  @Test
  void settingsVolumePrev() {
    station.setVolumePrev(true, station.getVolume());
    assertEquals(49, station.getVolumePrev());
  }

  @Test
  void settingsVolumePrevFalse() {
    station.setVolumePrev(false, station.getCurrentVolume());
    assertEquals(station.getCurrentVolume(), station.getVolumePrev());
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







