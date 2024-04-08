package oop.enums.detyrat;

public class ProcessorDemo {
    public static void main(String[] args) {
        ProcessorType processor = ProcessorType.INTEL;

        System.out.println(processor);
        processor = ProcessorType.valueOf("AMD");
        System.out.println(processor);

        processor = ProcessorType.values()[3];
        System.out.println(processor);
    }
}
