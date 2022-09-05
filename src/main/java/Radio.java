import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int maxCurrentRadioStation=10;

public Radio(int maxCurrentRadioStation){
    if (maxCurrentRadioStation>0)
        this.maxCurrentRadioStation=maxCurrentRadioStation;
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