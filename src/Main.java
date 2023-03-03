import computer.CPU;
import computer.MotherBoard;

public class Main {

    public static void main(String[] args) {
        CPU cpu = new CPU();
        cpu.printCPU();
        CPU.Processor processor = cpu.new Processor();
        processor.printModel();
        CPU.RAM ram= cpu.new RAM();
        ram.printRAM();

        MotherBoard motherBoard = new MotherBoard();
        motherBoard.port();
    }
}
