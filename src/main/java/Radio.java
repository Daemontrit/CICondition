public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int maxCurrentRadioStation=10;

    public Radio(){};
    public Radio(int maxCurrentRadioStation){
       if (maxCurrentRadioStation>0)
           this.maxCurrentRadioStation=maxCurrentRadioStation;

    }

    public int getMaxCurrentRadioStation() {
        return maxCurrentRadioStation;
    }

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
        if (newCurrentRadioStation >= 0 && newCurrentRadioStation <= maxCurrentRadioStation) {
            currentRadioStation = newCurrentRadioStation;
        }
    }

    public void next() {
        if (currentRadioStation < maxCurrentRadioStation) {
            currentRadioStation++;
        } else {
            setCurrentRadioStation(0);
        }
    }


    public void prev() {
        if ( currentRadioStation >0) {
            currentRadioStation--;
        } else {
            currentRadioStation=maxCurrentRadioStation;
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