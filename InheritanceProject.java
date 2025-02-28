import java.util.Scanner;

public class InheritanceProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");
        int inputNumber = sc.nextInt();
        sc.close();
        
        // Create objects using the input number
        NumberData originalData = new NumberData(inputNumber);
        InheritedData inheritedData = new InheritedData(inputNumber);
        
        // Display the original and transformed values
        System.out.println("Nilai asli (NumberData): " + originalData.getNumber());
        System.out.println("Nilai turunan (InheritedData): " + inheritedData.getTransformedNumber());
    }
}

class NumberData {
    private int number;
    
    // Super constructor to initialize the number
    public NumberData(int number) {
        this.number = number;
    }
    
    // Getter for number
    public int getNumber() {
        return number;
    }
    
    // Setter for number
    public void setNumber(int number) {
        this.number = number;
    }
}

// Subclass that inherits from NumberData
class InheritedData extends NumberData {
    private int transformedNumber;
    
    // Constructor for InheritedData using super constructor to initialize the inherited field
    public InheritedData(int number) {
        super(number); // Calls the constructor of NumberData to set the number
        // Example transformation: multiply the original number by 2
        this.transformedNumber = super.getNumber() * 2;
    }
    
    // Getter for the transformed value
    public int getTransformedNumber() {
        return transformedNumber;
    }
    
    // Setter for the transformed value (if needed)
    public void setTransformedNumber(int transformedNumber) {
        this.transformedNumber = transformedNumber;
    }
}
