package ru.netology;

public class Radio {
    private int station = 0;
    private int volume = 5;

    public void increaseStation() {
        if (station < 9) {
            station++;
        } else {
            station = 0;
        }
    }

    public void increaseVolume() {
        if (volume < 10) {
            volume++;
        }
    }

    public void decreaseStation() {
        if (station>0) {
            station--;
        } else {
            station = 9;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if ((volume>=0)&(volume<=10)) {
            this.volume = volume;
        }
    }

    public int getStation() {
        return station;
    }

    public void setStation(int station) {
        if ((station >=0)&(station<=9)) {
            this.station = station;
        }
    }


}
