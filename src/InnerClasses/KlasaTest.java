package InnerClasses;

public class KlasaTest extends KlasaOut   {
    public static void main(String[] args) {
        KlasaTest out = new KlasaTest();
        KlasaTest.KlasaTestIn in = out.new KlasaTestIn();
        in.print();
    }


    class KlasaTestIn extends KlasaIn{
        public int getVlera(){
            return vlera;
        }
    }
}
