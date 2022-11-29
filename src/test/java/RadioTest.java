import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {

    @ParameterizedTest
    @CsvSource({
            "6,6",
            "0,60",
            "9,9",
            "0,0",
            "0,11",
            "8,8",
            "0,-1",
            "1,1",
            "0, -1000"
    })
    void changeCheckCurrentRadioStation(int expected, int changeable) {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(changeable);
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvSource({
            "6,6",
            "0,60",
            "9,9",
            "0,0",
            "10,10",
            "0,11",
            "0,-1",
            "1,1",
            "0, -1000"
    })
    void changeCheckCurrentVolume(int expected, int changeable) {
        Radio radio = new Radio();
        radio.setCurrentVolume(changeable);
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvSource({
            "1,0",
            "2,1",
            "3,2",
            "4,3",
            "5,4",
            "6,5",
            "0,10"
    })
    void changeCheckMethodNext(int expected, int changeable) {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(changeable);
        radio.next();
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvSource({
            "10,0",
            "0,1",
            "1,2",
            "2,3",
            "3,4",
            "4,5",
            "8,9"
    })
    void changeCheckMethodPrev(int expected, int changeable) {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(changeable);
        radio.prev();
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvSource({
            "1,0",
            "2,1",
            "10,10",
            "10,9"
    })
    void changeCheckMethodValuePlus(int expected, int changeable) {
        Radio radio = new Radio();
        radio.setCurrentVolume(changeable);
        radio.valuePlus();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvSource({
            "0,0",
            "0,1",
            "9,10",
            "8,9"
    })
    void changeCheckMethodValueMinus(int expected, int changeable) {
        Radio radio = new Radio();
        radio.setCurrentVolume(changeable);
        radio.valueMinus();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvSource({
            "29,30",
            "199,200",
            "9,10",
    })
    void checkCurrentRadioStation(int expected, int maxCurrentRadioStation) {
        Radio radio = new Radio(maxCurrentRadioStation);
        int actual = radio.getMaxCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvSource({
            "0,30,30",
            "30,29,30",
            "1,31,30",
            "8,7,-1",
            "1,0,80"
    })
    void constructOneValueMetodNext(int expected, int changeable, int maxCurrentRadiostation) {
        Radio radio = new Radio(maxCurrentRadiostation);
        radio.setCurrentRadioStation(changeable);
        radio.next();
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }


}