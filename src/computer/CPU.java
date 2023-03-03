package computer;

public class CPU {

    private String model = "Lenovo";

    public void printCPU(){
        System.out.println("CPU model: "+model);
    }

    public class Processor {
        private String model = "Intel";
        public void printModel(){
            System.out.println("Processor model: "+model);
        }
    }
    public class RAM{
        private int memory = 8;
        public void printRAM(){
            System.out.println("RAM memory: "+ memory);
        }
    }
}
