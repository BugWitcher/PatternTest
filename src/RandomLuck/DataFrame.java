package RandomLuck;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DataFrame {
    public List<Draw>  dane ;
    public List<Draw>  danesort ;

    public void ZapisDoPliku(){

    };
    public void OdczytZPliku(){

    };

    public void WypiszDodatkowe(){
        for (Draw l : dane) {
            System.out.println("Losowanie " + l.ID + " dodatkowa " + l.aditem.toString());
        }
    }


    public void WypiszPowinowactwo()  {
        //danesort = dane;
        List<Draw> dane2 = new ArrayList<Draw>();
        dane2.addAll(dane);

        for (Draw l : dane) {
            for (Draw l2 : dane2) {
                if (l.ID != l2.ID) {
                    int ilezbieznych = getIloscPokryc(l,l2);
                    if  (ilezbieznych>=3) {
                        l.sortedresults.clear();
                        l2.sortedresults.clear();
                        l.sortedresults.addAll(l.results);
                        l2.sortedresults.addAll(l2.results);
                        Collections.sort(l.sortedresults,new CItemComparatorAsc());
                        Collections.sort(l2.sortedresults, new CItemComparatorAsc());
                        System.out.println("Losowanie "  + String.valueOf(l.ID)  + " " + l.sortedresults.toString()+ " ma " +String.valueOf(ilezbieznych)+ " z losowaniem " +String.valueOf(l2.ID) + " " + l2.sortedresults.toString() );
                    }
                }
            }
        }
    }

    public DataFrame() {

        dane = new ArrayList<Draw>();
        danesort = new ArrayList<Draw>();
    }

    public int getIloscPokryc (Draw o1, Draw o2) {

        int ile = 0;
        for (CItem k : o1.results ) {
            if (o2.results.contains(k) )
                ile++;
        }
        return ile;
    }
}

