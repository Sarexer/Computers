/**
 * Created by shaka on 13.02.2018.
 */
public class Computer {
    private double frequency;
    private int cores;
    private int RAM;
    private int memory;
    private int holdMemory;
    private static int allMemory;


    public int freeMemory(){
        return memory - holdMemory;
    }

    public boolean copy(int size){
        int freeMemory = freeMemory();
        if(freeMemory > size || freeMemory == size){
            return true;
        }else{
            return false;
        }
    }

    public String info(){
        return toString();
    }

    public void changeMemory(int newHoldMemory){
        setHoldMemory(newHoldMemory);
    }

    public void changeMemory(int newMemory, int newHoldMemory) {
        setMemory(newMemory);
        setHoldMemory(newHoldMemory);
    }

    public void plusHoldMemory(int memory){
        setHoldMemory(getHoldMemory() + memory);
    }
    public void minusHoldMemory(int memory){
        setHoldMemory(getHoldMemory() - memory);
    }

    public int compateTo(Computer computer){
        if(getCores() > computer.getCores()){
            return 1;
        }else if(getCores() == computer.getCores()){
            return 0;
        }else if(getCores() < computer.getCores()){
            return -1;
        }
        return -2;
    }


    public double getFrequency() {
        return frequency;
    }

    public int getCores() {
        return cores;
    }

    public int getRAM() {
        return RAM;
    }

    public int getMemory() {
        return memory;
    }

    public int getHoldMemory() {
        return holdMemory;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public void setMemory(int memory) {
        if(getMemory() == 0){
            this.memory = memory;
            setAllMemory(getAllMemory() + memory);
        }else{
            setAllMemory(getAllMemory() - getMemory());
            this.memory = memory;
            setAllMemory(getAllMemory() + getMemory());
        }
    }

    public void setHoldMemory(int holdMemory) {
        this.holdMemory = holdMemory;
    }

    public static int getAllMemory() {
        return allMemory;
    }

    public static void setAllMemory(int allMemory) {
        Computer.allMemory = allMemory;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "частота процессора=" + frequency +
                ", количество ядер=" + cores +
                ", объём оперативной памяти=" + RAM +
                ", объём жесткого диска=" + memory +
                '}';
    }
}
