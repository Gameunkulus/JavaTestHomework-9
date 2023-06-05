import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int radFrequencyMin = 0;
    private int radFrequency = radFrequencyMin;
    private int radVolumeMin = 0;
    private int radVolume = radVolumeMin;
    private int radVolumeMax = 100;
    private int numRadFrequency = 10;

    public void next() {
        int freq = getRadFrequency();
        freq++;
        if (freq < getNumRadFrequency()) {
            setRadFrequency(freq);
        } else {
            setRadFrequency(getRadFrequencyMin());
        }
    }

    public void prev() {
        int freq = getRadFrequency();
        if (freq == getRadFrequencyMin()) {
            setRadFrequency(getNumRadFrequency() - 1);
        } else {
            setRadFrequency(freq - 1);
        }
    }

    public void increaseVolume() {
        int volume = getRadVolume();
        if (volume < getRadVolumeMax()) {
            setRadVolume(volume + 1);
        }
    }
    public void decreaseVolume() {
        int volume = getRadVolume();
        if (volume > getRadVolumeMin()) {
            setRadVolume(volume - 1);
        }
    }



}

