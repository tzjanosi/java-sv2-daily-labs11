package day02;

import java.util.List;

public class Hiking {
    public double getPlusElevation(List<Double> heightsList){
        double totalElevation=0;
        for(int i=1;i<heightsList.size();i++){
            if(isElevation(heightsList,i)){
                totalElevation+=getElevation(heightsList,i);
            }
        }
        return totalElevation;
    }

    private double getElevation(List<Double> heightsList, int i) {
        return(heightsList.get(i)-heightsList.get(i-1));
    }

    private boolean isElevation(List<Double> heightsList, int i) {
        return(heightsList.get(i)-heightsList.get(i-1)>0);
    }
}
