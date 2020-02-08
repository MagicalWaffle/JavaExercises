package InnerClasses;

public class KlasaOut {
    abstract class KlasaIn{
        int vlera = 20;

        protected void print(){
            System.out.println("Vlera = " + getVlera());
        }

        public abstract int getVlera();
    }
}
