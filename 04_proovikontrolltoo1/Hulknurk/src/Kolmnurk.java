import java.util.List;

public class Kolmnurk {
    List<Integer> xCoords;
    List<Integer> yCoords;

    public Kolmnurk(List<Integer> xCoords, List<Integer> yCoords) {
        this.xCoords = xCoords;
        this.yCoords = yCoords;
    }

    public int lisaKoordinaadid(int newxCoord, int newyCoord){
        xCoords.add(newxCoord);
        yCoords.add(newyCoord);

        int summa = 0;
        for (int x: xCoords) {
            summa += x;
        }
        return summa;
    }
}
