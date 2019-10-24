package RandomLuck;
import java.util.Comparator;

public class CItemComparatorAsc implements Comparator<CItem> {

    @Override
    public int compare(CItem o1, CItem o2) {
        return (o1.getValue()).compareTo(o2.getValue());
    }
}