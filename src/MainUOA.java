public class MainUOA {
    public static void main(String args[]){
        UOA<PhoneListing> boston = new UOA<PhoneListing>(500);
        PhoneListing sharath = new PhoneListing("Sharath", "Charlesbank Way", "392-4498");
        PhoneListing ramya = new PhoneListing("Ramya", "Charlesbank Gardens", "234-8832");

        boston.insert(sharath);
        boston.insert(ramya);

        System.out.println(boston.fetch("Sharath").toString());
        System.out.println(boston.fetch("Ramya").toString());
    }
}
