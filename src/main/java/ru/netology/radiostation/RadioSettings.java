package ru.netology.radiostation;

public class RadioSettings {

  private int rangeUser;
  private int minStation = 0;
  private int maxStation = 9;
  private int currentStation = 6;
  private int minVolume = 0;
  private int maxVolume = 100;
  private int currentVolume = 50;

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
  public int getVolume() {
    return currentVolume;
  }

  public void setCurrentStation(int currentStation) {
    if (currentStation > maxStation) {
      this.currentStation = 100;
      return;
    }
    if (currentStation < minStation) {
      this.currentStation = -100;
      return;
    }
    if (currentStation == maxStation) {
      this.currentStation = minStation;
      return;
    }
    if (currentStation == minStation) {
      this.currentStation = maxStation;
    }
  }
  public int getCurrentStation() {
    return this.currentStation;
  }

  public void setCurrentNext(Boolean nextStation, int currentStation) {
    if (nextStation) {
      this.currentStation = currentStation + 1;
    } else {
      this.currentStation = currentStation;
    }
  }
  public int getCurrentNext() {
    return this.currentStation;
  }

  public void setCurrentPrev(Boolean prevStation, int currentStation) {
    if (prevStation) {
      this.currentStation = currentStation - 1;
    } else {
      this.currentStation = currentStation;
    }
  }
  public int getCurrentPrev() {
    return this.currentStation;
  }

  public void setCurrentVolume(int currentVolume) {
    if (currentVolume < minVolume) {
      this.currentVolume = minVolume;
    }
    if (currentVolume > maxVolume) {
      this.currentVolume = maxVolume;
    }
  }
  public int getCurrentVolume() {
    return currentVolume;
  }

  public void setVolumeNext(Boolean nextVolume, int currentVolume) {
    if (nextVolume) {
      this.currentVolume = currentVolume + 1;
    } else {
      this.currentVolume = currentVolume;
    }
  }
  public int getVolumeNext() {
    return this.currentVolume;
  }

  public void setVolumePrev(Boolean prevStation, int currentVolume) {
    if (prevStation) {
      this.currentVolume = currentVolume - 1;
    } else {
      this.currentVolume = currentVolume;
    }
  }
  public int getVolumePrev() {
    return this.currentVolume;
  }
}