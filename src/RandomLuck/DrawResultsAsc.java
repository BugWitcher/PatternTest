package RandomLuck;

import java.util.Comparator;

public class DrawResultsAsc implements Comparator<Draw> {

    @Override
    public int compare(Draw o1, Draw o2) {

        //System.out.println("Comparing "+ o1.ID + " with "+o2.ID) ;
        for (int i=0 ; i<5 ;i++){
            //System.out.println("o1 " + String.valueOf(o1.wynikisort.get(i).getWartosc()));
            // System.out.println("o2 " + String.valueOf(o2.wynikisort.get(i).getWartosc()));
            if ( o1.sortedresults.get(i).getValue() != o2.sortedresults.get(i).getValue() ) {

                int porownanie = o1.sortedresults.get(i).getValue().compareTo(o2.sortedresults.get(i).getValue());
                //System.out.println("Por  " + String.valueOf(porownanie));
                return (o1.sortedresults.get(i).getValue()).compareTo(o2.sortedresults.get(i).getValue());
            }

        }
        return 0;
        //System.out.println("Comparing "+ o1.ID + " with "+o2.ID) ;
    }
}