public class Radio {
    private int radFrequency = 0;
    private int radVolume = 0;
    private int numRadFrequency = 10;

    public Radio(int numRadFrequency) {
        this.numRadFrequency = numRadFrequency;
    }

    public Radio(){}

    public int getRadFrequency() {
        return radFrequency;
    }

    public int setRadFrequency(int freq) {
        int maxRadFrequency = getNumRadFrequency();
        if (freq >= 0 && freq < maxRadFrequency) {
            radFrequency = freq;
        }
        return radFrequency;
    }

    public void next() {
        int freq = getRadFrequency();
        freq++;
        if (freq < getNumRadFrequency()) {
            setRadFrequency(freq);
        } else {
            setRadFrequency(0);
        }
    }

    public void prev() {
        int freq = getRadFrequency();
        if (freq == 0) {
            setRadFrequency(getNumRadFrequency() - 1);
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

    public int getNumRadFrequency() {
        return numRadFrequency;
    }

    public int setNumRadFrequency(int numRadFrequency) {
        this.numRadFrequency = numRadFrequency;
        return this.numRadFrequency;
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

