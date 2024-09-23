

public class Rotor {

    
    private String rotorValues;
    private char startChar;
        
    public Rotor(String v, char c){
        this.rotorValues = new String(v);
        this.startChar = c;
        
        while(!this.rotate());
            
    }
    
    public boolean rotate(){
        //TODO
        int size = this.rotorValues.length();

        String newRotorValues = rotorValues.charAt(size) + rotorValues.substring(0, size - 1);
        this.rotorValues = newRotorValues;

        if (rotorValues.charAt(0) == startChar){
            return true;
        }
        return false;
               
    }
    

    public int indexOf(char c){
        //TODO
        for (int i = 0; i < rotorValues.length(); i++){
            if (rotorValues.charAt(0) == c){
                return i;
            }
        }
        return 292943;
    }

    public char charAt(int idx){
        //TODO
        char target;
        target = rotorValues.charAt(idx);
        return target;
    }
}
    
