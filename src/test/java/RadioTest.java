import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    void setNumRadFrequencyTest() {
        Radio radio = new Radio(0, 0, 0, 0, 100, 20);
        radio.setNumRadFrequency(15);
        Assertions.assertEquals(radio.getNumRadFrequency(), 15);
    }

    @Test
    void nextTest() {
        Radio radio = new Radio(0, 0, 0, 0, 100, 10);
        radio.setRadFrequency(8);
        radio.next();
        int expected = 9;
        Assertions.assertEquals(expected, radio.getRadFrequency());
        radio.next();
        expected = 0;
        Assertions.assertEquals(expected, radio.getRadFrequency());
    }

    @Test
    void prevTest() {
        Radio radio = new Radio(0, 0, 0, 0, 100, 20);
        radio.setRadFrequency(2);
        radio.prev();
        int expected = 1;
        Assertions.assertEquals(expected, radio.getRadFrequency());
        radio.setRadFrequency(0);
        radio.prev();
        expected = 19;
        Assertions.assertEquals(expected,radio.getRadFrequency());
    }

    @Test
    void increaseVolumeTest() {
        Radio radio = new Radio(0, 0, 0, 0, 100, 20);
        radio.increaseVolume();
        int expected = 1;
        Assertions.assertEquals(expected, radio.getRadVolume());
    }

    @Test
    void increaseUpperVolumeTest() {
        Radio radio = new Radio(0, 0, 0, 0, 100, 20);
        radio.setRadVolume(100);
        radio.increaseVolume();
        int expected = 100;
        Assertions.assertEquals(expected, radio.getRadVolume());
    }

    @Test
    void decreaseVolumeTest() {
        Radio radio = new Radio(0, 0, 0, 0, 100, 20);
        radio.setRadVolume(10);
        radio.decreaseVolume();
        int expected = 9;
        Assertions.assertEquals(expected, radio.getRadVolume());
        radio.setRadVolume(0);
        radio.decreaseVolume();
        expected = 0;
        Assertions.assertEquals(expected, radio.getRadVolume());
    }

    @Test
    void getRadFrequencyMinTest() {
        Radio radio = new Radio(0, 0, 0, 0, 100, 20);
        int expected = 0;
        Assertions.assertEquals(expected, radio.getRadFrequencyMin());
    }

    @Test
    void getRadFrequencyTest() {
        Radio radio = new Radio(0, 5, 0, 0, 100, 20);
        int expected = 5;
        Assertions.assertEquals(expected, radio.getRadFrequency());
    }

    @Test
    void getRadVolumeMinTest() {
        Radio radio = new Radio(0, 0, 1, 0, 100, 20);
        int expected = 1;
        Assertions.assertEquals(expected, radio.getRadVolumeMin());
    }

    @Test
    void getRadVolumeTest() {
        Radio radio = new Radio(0, 0, 0, 20, 100, 20);
        int expected = 20;
        Assertions.assertEquals(expected, radio.getRadVolume());
    }

    @Test
    void getRadVolumeMaxTest() {
        Radio radio = new Radio(0, 0, 0, 0, 100, 20);
        int expected = 100;
        Assertions.assertEquals(expected, radio.getRadVolumeMax());
    }

    @Test
    void getNumRadFrequencyTest() {
        Radio radio = new Radio(0, 0, 0, 0, 100, 20);
        int expected = 20;
        Assertions.assertEquals(expected, radio.getNumRadFrequency());
    }

    @Test
    void setRadFrequencyMinTest() {
        Radio radio = new Radio(0, 0, 0, 0, 100, 20);
        int expected = 2;
        radio.setRadFrequencyMin(2);
        Assertions.assertEquals(expected, radio.getRadFrequencyMin());
    }

    @Test
    void setRadFrequencyTest() {
        Radio radio = new Radio(0, 2, 0, 0, 100, 20);
        int expected = 2;
        Assertions.assertEquals(expected, radio.getRadFrequency());
    }

    @Test
    void setRadVolumeMinTest() {
        Radio radio = new Radio(0, 0, 0, 0, 100, 20);
        int expected = 2;
        radio.setRadVolumeMin(2);
        Assertions.assertEquals(expected, radio.getRadVolumeMin());
    }

    @Test
    void setRadVolume() {
        Radio radio = new Radio(0, 0, 0, 50, 100, 20);
        int expected = 50;
        Assertions.assertEquals(expected, radio.getRadVolume());
    }

    @Test
    void setRadVolumeMax() {
        Radio radio = new Radio(0, 0, 0, 0, 50, 20);
        int expected = 100;
        radio.setRadVolumeMax(100);
        Assertions.assertEquals(expected, radio.getRadVolumeMax());
    }

    @Test
    void setNumRadFrequency() {
        Radio radio = new Radio(0, 0, 0, 0, 100, 20);
        radio.setNumRadFrequency(15);
        int expected = 15;
        Assertions.assertEquals(expected, radio.getNumRadFrequency());
    }

    @Test
    void testEquals() {
        Radio radio1 = new Radio(0, 0, 0, 0, 100, 20);
        Radio radio2 = new Radio(0, 0, 0, 0, 100, 20);
        Radio radio3 = new Radio(1, 0, 0, 0, 100, 20);
        Radio radio4 = new Radio(0, 1, 0, 0, 100, 20);
        Radio radio5 = new Radio(0, 0, 1, 0, 100, 20);
        Radio radio6 = new Radio(0, 0, 0, 1, 100, 20);
        Radio radio7 = new Radio(0, 0, 0, 0, 101, 20);
        Radio radio8 = new Radio(0, 0, 0, 0, 100, 21);
        Radio radio9 = new Radio();
        Assertions.assertTrue(radio1.equals(radio2));
        Assertions.assertFalse(radio1.equals(radio3));
        Assertions.assertFalse(radio1.equals(radio4));
        Assertions.assertFalse(radio1.equals(radio5));
        Assertions.assertFalse(radio1.equals(radio6));
        Assertions.assertFalse(radio1.equals(radio7));
        Assertions.assertFalse(radio1.equals(radio8));
        Assertions.assertFalse(radio1.equals(radio9));
    }

    @Test
    void canEqual() {
        Radio radio1 = new Radio(0, 0, 0, 0, 100, 10);
        Radio radio2 = new Radio(0, 1, 0, 0, 100, 10);
        int radio3 = 1;
        Assertions.assertTrue(radio1.canEqual(radio2));
        Assertions.assertFalse(radio1.canEqual(radio3));
    }

    @Test
    void testHashCode() {
        Radio radio = new Radio(0, 0, 0, 0, 100, 10);
        int expexted = -769133409;
        Assertions.assertEquals(expexted, radio.hashCode());
    }

    @Test
    void testToString() {
        Radio radio = new Radio(0, 0, 0, 0, 100, 20);
        String expected = "Radio(radFrequencyMin=0, radFrequency=0, radVolumeMin=0, radVolume=0, radVolumeMax=100, numRadFrequency=20)";
        Assertions.assertEquals(expected, radio.toString());
    }
}
