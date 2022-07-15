package ru.netology.radiostation;

public class RadioSettings {

  private int rangeUser;
  private int minStation = 0;
  private int maxStation = 9;
  private int currentStation;
  private int currentStationUser;
  private int minVolume = 0;
  private int maxVolume = 100;
  private int currentVolume;

  public RadioSettings(int rangeUser) {
    this.rangeUser = rangeUser;
  }

  public RadioSettings() {
  }

  public int getMinStation() {
    return minStation;
  }
  public int getMaxStation() {
    return maxStation;
  }
  public int getStation() {
    return currentStation;
  }
  public int getMinVolume() {
    return minVolume;
  }
  public int getMaxVolume() {
    return maxVolume;
  }

  public void setRangeDefault(int currentStationDefault) {
    if (currentStationDefault <= rangeUser && currentStationDefault >= minStation) {
      currentStation = currentStationDefault;
    } else {
      return;
    }
  }
  public int getRangeDefault() {
    return currentStation;
  }

  public void setCurrentStation(int station) {
    if (station > maxStation) {
      currentStation = 404;
      return;
    }
    if (station < minStation) {
      currentStation = 404;
      return;
    }
    currentStation = station;
  }
  public int getCurrentStation() {
    return currentStation;
  }

  public void nextStation() {
    if (currentStation == maxStation) {
      currentStation = minStation;
      return;
    } else {
      currentStation = currentStation + 1;
    }
    setCurrentStation(currentStation);
  }

  public void prevStation() {
    if (currentStation == minStation) {
      currentStation = maxStation;
      return;
    } else {
      currentStation = currentStation - 1;
    }
    setCurrentStation(currentStation);
  }

  public void setCurrentVolume(int volume) {
    currentVolume = volume;
  }
  public int getCurrentVolume() {
    return currentVolume;
  }

  public void nextVolume() {
    if (currentVolume >= maxVolume) {
      currentVolume = maxVolume;
    } else {
      currentVolume = currentVolume + 1;
    }
    setCurrentVolume(currentVolume);
  }

  public void prevVolume() {
    if (currentVolume <= minVolume) {
      currentVolume = minVolume;
    } else {
      currentVolume = currentVolume - 1;
    }
    setCurrentVolume(currentVolume);
  }
}



