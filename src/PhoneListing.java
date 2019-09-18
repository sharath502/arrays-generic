import javax.swing.*;

public class PhoneListing implements KeyMode {
    private String name;
    private String address;
    private String number;

    public PhoneListing(String n , String a , String num){
        name = n;
        address = a;
        number = num;
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    public PhoneListing deepCopy(){
        return new PhoneListing(name , address , number);
    }

    public int compareTo(Object targetKey){
        String tKey = (String) targetKey;
        return (name.compareTo(tKey));
    }

    public void input(){
        name = JOptionPane.showInputDialog("Enter a name");
        address = JOptionPane.showInputDialog("Enter an address");
        number = JOptionPane.showInputDialog("Enter a number");
    }
}
