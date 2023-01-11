package Animals;

public class Dog extends Animals{
    public Dog(int swim,int run) {
        super.setSwim(swim);
        super.setRun(run);
        count++;
        countDog++;
    }

    public static int countDog =0;
    public int counter(){
        return countDog;
    }

    @Override
    public void setSwim(int swim) {
        if (swim < 10)
            super.setSwim(swim);
    }

    @Override
    public void setRun(int run) {
        if (run < 500)
            super.setRun(run);
    }


}
