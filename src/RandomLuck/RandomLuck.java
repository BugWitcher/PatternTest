package RandomLuck;

import java.io.*;
import java.net.URL;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class RandomLuck {


    private static final String FILE_NAME = "ep.csv";
    String FILE_URL = "https://www.multipasko.pl/wyniki-csv.php?f=pensja-sortowane";

    public static DataFrame calosc ;



    private void getFile() {
        try (BufferedInputStream in = new BufferedInputStream(new URL(FILE_URL).openStream());
             FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME)) {
            byte dataBuffer[] = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                fileOutputStream.write(dataBuffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println(" IOException in getFile ");
        }



        System.out.println(" File downloaded succesfully ");
    }

    private void readFile() throws IOException {
        String pathToCsv = "ep.csv";
        DataFrame df = new DataFrame();
        String row;
        try {
            int i=0 ; // do pominiecia pierwszej lini
            BufferedReader csvReader = new BufferedReader(new FileReader(pathToCsv));
            while ((row = csvReader.readLine()) != null) {
                String[] data = row.split(";");

                if (i>0) {
                    Calendar calendar  = GregorianCalendar.getInstance();
                    calendar.set(Calendar.YEAR,Integer.valueOf(data[3]));
                    calendar.set(Calendar.MONTH,Integer.valueOf(data[2])-1);
                    calendar.set(Calendar.DAY_OF_MONTH,Integer.valueOf(data[1]));
                    calendar.set(Calendar.MILLISECOND, 0);
                    calendar.set(Calendar.SECOND, 0);
                    calendar.set(Calendar.MINUTE, 0);
                    calendar.set(Calendar.HOUR_OF_DAY, 0);

                    Draw l = new Draw(Integer.valueOf(data[0]).intValue() ,calendar.getTime());
                    for (int j=0 ; j<5 ;j++) {
                        l.results.add(CItem.valueof(Integer.valueOf(data[j+4]).intValue()));
                    }
                    l.aditem = CItem.valueof(Integer.valueOf(data[10]).intValue()+100);

                    l.ustawPosortowane();
                    df.dane.add(l);


                }

                //System.out.println(data[0] + ' ' +data[1]+' ' +data[2]+' ' +data[3]+' ' +data[4]+' '
                //                  +data[5]+' ' +data[6]+' ' +data[7]+' ' +data[8]+' ' +data[9]+' ' +data[10]);
                // do something with the data
                i++;
            }

            csvReader.close();

            //
            //male.dane.addAll(df.dane.subList(1199,1234));
            //male.dane.addAll(df.dane);
            //System.out.println(male.dane.toString());

            //Collections.sort(male.dane,new DrawResultsAsc());
            //System.out.println(male.dane.toString());

            //df.WypiszPowinowactwo();
            df.WypiszDodatkowe();

            calosc = new DataFrame();
            calosc.dane.addAll(df.dane);
            //Collections.sort(calosc.dane,new BallComparatorAsc());
            // System.out.println(calosc.dane.toString());
        }


        catch (FileNotFoundException e){
            System.out.println("Nie znaleziono pliku'");
        }

    }


    public RandomLuck() throws IOException {
        DataFrame data = new DataFrame();
        getFile();
        readFile();
    }
}
