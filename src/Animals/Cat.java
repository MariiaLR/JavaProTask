package Animals;

public class Cat extends Animals{
    public Cat(int swim,int run) {
        super.setSwim(swim);
        super.setRun(run);
        count++;
        countCat++;
    }

    public static int countCat =0;
    public int counter(){
        return countCat;
    }

    @Override
    public void setSwim(int swim) {
        if (swim < 0 )
            super.setSwim(swim);
    }

    @Override
    public void setRun(int run) {
        if (run < 300)
            super.setRun(run);
    }

}
