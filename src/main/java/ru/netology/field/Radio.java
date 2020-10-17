package ru.netology.field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Radio {
    private int station;
    private int volume;
    private int quantityStation = 10;

    public Radio(int quantityStation) {
        if (quantityStation >= 0) {
            this.quantityStation = quantityStation;
        } else {
            this.quantityStation = 0;
        }
    }

    public void increaseStation() {
        if (station < (quantityStation - 1)) {
            station++;
        } else {
            station = 0;
        }
    }

    public void decreaseStation() {
        if (station > 0) {
            station--;
        } else {
            station = (quantityStation - 1);
        }
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    public void setVolume(int volume) {
        if ((volume < 0) | (volume > 100)) {
            return;
        }
        this.volume = volume;
    }

    public void setStation(int station) {
        if ((station < 0) | (station > (quantityStation - 1))) {
            return;
        }
        this.station = station;
    }

    public void setQuantityStation(int quantityStation) {
        if (quantityStation >= 0) {
            this.quantityStation = quantityStation;
        } else {
            this.quantityStation = 0;
        }
    }
}
