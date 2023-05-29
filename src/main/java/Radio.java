public class Radio {
    private int radFrequency = 0;
    private int radVolume = 0;

    public int getRadFrequency() {
        return radFrequency;
    }

    public int setRadFrequency(int freq) {
        if (freq >= 0 && freq <= 9) {
            radFrequency = freq;
        }
        return radFrequency;
    }

    public void next() {
        int freq = getRadFrequency();
        if (freq == 9) {
            setRadFrequency(0);
        } else {
            freq++;
            setRadFrequency(freq);
        }
    }

    public void prev() {
        int freq = getRadFrequency();
        if (freq == 0) {
            setRadFrequency(9);
        } else {
            setRadFrequency(freq - 1);
        }
    }

    public int getRadVolume() {
        return radVolume;
    }

    public int setRadVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            radVolume = volume;
        }
        return radFrequency;
    }

    public void increaseVolume() {
        int volume = getRadVolume();
        if (volume < 100) {
            setRadVolume(volume + 1);
        }
    }

    public void decreaseVolume() {
        int volume = getRadVolume();
        if (volume > 1) {
            setRadVolume(volume - 1);
        }
    }

}
