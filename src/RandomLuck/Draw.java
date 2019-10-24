package RandomLuck;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Draw {
    public Integer ID;
    public Date data;
    public Set<CItem> results;
    public List<CItem> sortedresults;
    public CItem aditem ;


    public Draw(int ID,Date data) {
        this.ID =ID;
        this.data = data;
        results = new HashSet<CItem>();
        sortedresults = new ArrayList<CItem>();

    }

    public void addKula(CItem item){
        results.add(item);
    }

    public void ustawPosortowane() {
        sortedresults.clear();
        sortedresults.addAll(results);
        Collections.sort(sortedresults,new CItemComparatorAsc());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Draw)) return false;
        Draw draw = (Draw) o;
        return ID.equals(draw.ID) &&
                data.equals(draw.data) &&
                Objects.equals(results, draw.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, data, results);
    }

    @Override
    public String toString(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd ");

        //Date d2 = Date.newInstance(2019,4,5);
        return "Draw " + String.valueOf(this.ID) + " data " + dateFormat.format(this.data) +
                " " +sortedresults.toString() + "\n";
    }


}