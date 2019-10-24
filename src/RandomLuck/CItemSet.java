package RandomLuck;

import java.util.*;

public class CItemSet {
    public Set<CItem> content ;
    public List<CItem> contentlist;

    DataFrame frame;

    public CItemSet(){
        content = new HashSet<CItem>();
        contentlist = new ArrayList<CItem>();
        frame = new DataFrame();
    }

    public void setCItems(CItem... items ) {
        content.clear();
        contentlist.clear();
        for(int i=0; i<items.length; i++) {

            content.add(items[i]);
        }
        contentlist.addAll(content);
    }

    public void fillRandomBalls(int count) {

        while (content.size()<count){
            content.add(CItem.randomCItem());
        }
        contentlist.clear();
        contentlist.addAll(content);
        Collections.sort(contentlist);
    }

    public int howmanyballsindraw (Draw d) {
        int result = 0;

        if (d!= null) {
            if (d.results.size() !=0) {
                d.ustawPosortowane();
                for (CItem b : d.sortedresults) {
                    if (content.contains(b))
                        result++ ;
                }
            }
        }
        return result;

    }
}
