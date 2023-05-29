import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    void setRadFrequencyUpperTest() {
        Radio radio = new Radio();
        int expected = 0;
        Assertions.assertEquals(expected, radio.setRadFrequency(11));
    }

    @Test
    void setRadFrequencyLowerTest() {
        Radio radio = new Radio();
        int expected = 0;
        Assertions.assertEquals(expected, radio.setRadFrequency(-1));
    }

    @Test
    void setRadFrequencyTest() {
        Radio radio = new Radio();
        int expected = 5;
        Assertions.assertEquals(expected, radio.setRadFrequency(5));

    }

    @Test
    void nextTest() {
        Radio radio = new Radio();
        radio.setRadFrequency(8);
        radio.next();
        int expected = 9;
        Assertions.assertEquals(expected, radio.getRadFrequency());
    }

    @Test
    void nextTestZero() {
        Radio radio = new Radio();
        radio.setRadFrequency(9);
        radio.next();
        int expected = 0;
        Assertions.assertEquals(expected, radio.getRadFrequency());
    }

    @Test
    void prevTest() {
        Radio radio = new Radio();
        radio.setRadFrequency(2);
        radio.prev();
        int expected = 1;
        Assertions.assertEquals(expected, radio.getRadFrequency());
    }

    @Test
    void prevTestZero() {
        Radio radio = new Radio();
        radio.setRadFrequency(0);
        radio.prev();
        int expected = 9;
        Assertions.assertEquals(expected, radio.getRadFrequency());
    }

    @Test
    void setRadVolumeTest() {
        Radio radio = new Radio();
        radio.setRadVolume(45);
        int expected = 45;
        Assertions.assertEquals(expected, radio.getRadVolume());
    }

    @Test
    void setRadVolumeUpperTest() {
        Radio radio = new Radio();
        radio.setRadVolume(105);
        int expected = 0;
        Assertions.assertEquals(expected, radio.getRadVolume());
    }

    @Test
    void setRadVolumeLowerTest() {
        Radio radio = new Radio();
        radio.setRadVolume(-5);
        int expected = 0;
        Assertions.assertEquals(expected, radio.getRadVolume());
    }

    @Test
    void increaseVolumeTest() {
        Radio radio = new Radio();
        radio.increaseVolume();
        int expected = 1;
        Assertions.assertEquals(expected, radio.getRadVolume());
    }


    @Test
    void increaseUpperVolumeTest() {
        Radio radio = new Radio();
        radio.setRadVolume(100);
        radio.increaseVolume();
        int expected = 100;
        Assertions.assertEquals(expected, radio.getRadVolume());
    }

    @Test
    void decreaseVolumeTest() {
        Radio radio = new Radio();
        radio.setRadVolume(10);
        radio.decreaseVolume();
        int expected = 9;
        Assertions.assertEquals(expected, radio.getRadVolume());
    }

    @Test
    void decreaseLowVolumeTest() {
        Radio radio = new Radio();
        radio.setRadVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        Assertions.assertEquals(expected, radio.getRadVolume());
    }
}
