package ru.netology;

public class Radio {
    private int station;
    private int volume;

    public void increaseStation() {
        if (station < 9) {
            station++;
        } else {
            station = 0;
        }
    }

       public void decreaseStation() {
        if (station>0) {
            station--;
        } else {
            station = 9;
        }
    }

    public void increaseVolume() {
        if (volume < 10) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if ((volume < 0) | (volume >10)) {
           return;
        }
        this.volume = volume;
    }

    public int getStation() {
        return station;
    }

    public void setStation(int station) {
        if ((station < 0) | (station > 9)) {
            return;
        }
        this.station = station;
    }


}
