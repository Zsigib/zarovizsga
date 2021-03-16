package hu.nive.ujratervezes.zarovizsga.digitscounter;

public class DigitsCounter {

    public int getCountOfDigits(String s) {
            int numbers =0;

        for(int i = 0; i < s.length(); i++){
            numbers++;
        }
        
        
        return numbers;
    }
}
