package SerializableTests;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SerialSimpleEx implements Serializable {

    String name ;
    int number ;
    List<String> lista ;


    public SerialSimpleEx(String name,int number){
        this.name = name;
        this.number = number;
        List<String> lista = new ArrayList<String>();
    }

    @Override
    public String toString() {
        String ret ;

       ret= String.format("Name " +name);
       ret= String.format(ret + " Number " + number );



        for (String s : lista) {
           ret = ret + " " +s;
        }

        return ret;
    }

}
