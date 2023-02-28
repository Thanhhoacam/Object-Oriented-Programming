// -Colour: String
//-EnginePower:int
//-Convertible: boolean
//-ParkingBrake: boolean
////constructors
//+Car()
//+Car(String Colour, int EnginePower, boolean Convertible,
//boolean ParkingBrake )
////getters
//+getColour():String
//+getEnginePower():int
//+getConvertible(): boolean
//+getParkingBrake(): boolean
////setters
//+setColour(String colour):void
//+setEnginePower(int EnginePower):void
//+setConvertible(boolean Convertible): void
//+setParkingBrake(boolean ParkingBrake): void
////other logic methods
//+pressStartButton():void
//+pressAcceleratorButton():void
//+output(): void


public class Car {
    private String colour;
    private int EnginePower;
    private boolean Convertible;
    private  boolean ParkingBrake;
    // constructor
    public Car(){
        this.colour = null;
        this.EnginePower = 0;
        this.Convertible = false;
        this.ParkingBrake = false;
    }
    public Car (String colour, int EnginePower, boolean Convertible, boolean ParkingBrake){
        this.colour = colour;
        this.EnginePower = EnginePower;
        this.Convertible = Convertible;
        this.ParkingBrake = ParkingBrake;

    }
    //getters
    public String getColour() {
        return colour;
    }

    public int getEnginePower() {
        return EnginePower;
    }

    public boolean getConvertible() {
        return Convertible;
    }

    public boolean getParkingBrake() {
        return ParkingBrake;
    }
    //setters


    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setConvertible(boolean convertible) {
        Convertible = convertible;
    }

    public void setEnginePower(int enginePower) {
        EnginePower = enginePower;
    }

    public void setParkingBrake(boolean parkingBrake) {
        ParkingBrake = parkingBrake;
    }
    //other methods
    public void pressStartButton(){
        System.out.println("You have pressed the start button");
    }
    public void pressAcceleratorButton(){
        System.out.println("You have pressed the Accelerator button");
    }
    public void output(){
        System.out.println("Colour :" + this.getColour());
        System.out.println("Engine Power: " + this.getEnginePower());
        System.out.println("Convertible: " + this.getConvertible());
        System.out.println("Parking Brake: " + this.getParkingBrake());
    }

}
