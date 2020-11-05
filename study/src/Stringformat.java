public class Stringformat {

    String name="sono";

    public static void main(String[] args) {
        String name="sono";
        System.out.println(String.format("%s", name));

        String s = String.format("%, d", 1000000000);
        System.out.println(s);

        String  str="ABDFE,DFEGLE,FDAFS";
        String [] strarr= str.split(",");

        System.out.println(strarr[0]);

    }


}
