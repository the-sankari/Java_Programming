package DataTypes;

public class Ex11{
    public static void main(String[] args) {
        Double dn1 = 0.0002134563d;
        boolean d1f = Double.isFinite(dn1);

        Double dn2 = dn1 / 0;
        boolean d2f = Double.isFinite(dn2);

        Double dn3 = Double.POSITIVE_INFINITY * 0;
        boolean d3f = Double.isFinite(dn3);

        System.out.print("\nFinite doubles\n");
        System.out.println("Is " + dn1 + " is finite " + d1f);
        System.out.println("Is " + dn2 + " is finite " + d2f);
        System.out.println("Is " + dn3 + " is finite " + d3f);


    }
}