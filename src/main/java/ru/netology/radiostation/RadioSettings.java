package ru.netology.radiostation;

public class RadioSettings {

  private int rangeUser;
  private int minStation = 0;
  private int maxStation = 9;
  private int currentStation;
  private int minVolume = 0;
  private int maxVolume = 100;
  private int currentVolume;

  public RadioSettings(int rangeUser) {
    this.rangeUser = rangeUser;
  }

  public RadioSettings() {
  }

  public int getRangeUser() {
    return rangeUser;
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

  public void setCurrentStation(int station) {
    if (station > maxStation) {
      currentStation = 100;
      return;
    }
    if (station < minStation) {
      currentStation = -100;
      return;
    }
    if (station == maxStation) {
      currentStation = minStation;
      return;
    }
    if (station == minStation) {
      currentStation = maxStation;
      return;
    }
    currentStation = station;
  }

  public int getCurrentStation() {
    return currentStation;
  }

  public void nextStation() {
    int nextStation;
    nextStation = currentStation + 1;
    setCurrentStation(nextStation);
  }

  public void prevStation() {
    int prevStation;
    prevStation = currentStation - 1;
    setCurrentStation(prevStation);
  }

  public void setCurrentVolume(int volume) {
    if (volume < minVolume) {
      currentVolume = minVolume;
      return;
    }
    if (volume > maxVolume) {
      currentVolume = maxVolume;
      return;
    }
    currentVolume = volume;
  }

  public int getCurrentVolume() {
    return currentVolume;
  }

  public void nextVolume() {
    int nextVolume;
    nextVolume = currentVolume + 1;
    setCurrentVolume(nextVolume);
  }

  public void prevVolume() {
    int prevVolume;
    prevVolume = currentVolume - 1;
    setCurrentVolume(prevVolume);
  }
}
