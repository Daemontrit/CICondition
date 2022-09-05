public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentValue){
        if (newCurrentValue>=0 && newCurrentValue<=10){
            currentVolume=newCurrentValue;
        }
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation >= 0 && newCurrentRadioStation <= 9) {
            currentRadioStation = newCurrentRadioStation;
        }
    }

    public void next() {
        if (currentRadioStation < 9) {
            currentRadioStation++;
        } else {
            setCurrentRadioStation(0);
        }
    }


    public void prev() {
        if ( currentRadioStation > 0) {
            currentRadioStation--;
        } else {
            setCurrentRadioStation(9);
        }
    }


    public void valuePlus(){
        if (currentVolume<10)
            currentVolume++;
    }


    public void valueMinus(){
        if (currentVolume>0)
            currentVolume--;
    }

}