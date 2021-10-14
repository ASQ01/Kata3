package kata3;

public class Kata3 {

    public static void main(String[] args) {
        Histogram histogram = new Histogram();
        
        for (int i = 0; i < 40; i++) {
            histogram.increment("alu.ulpgc.es");
            if (i%2 == 0){
                histogram.increment("gmail.com");
            }
        }
        
        for (int i = 0; i < 100; i++) {
            histogram.increment("yopmail.com");
            if (i%2 == 0){
                histogram.increment("outlook.es");
            }
        }
        
        HistogramDisplay histo = new HistogramDisplay(histogram);
        histo.execute();
    }
    
}
