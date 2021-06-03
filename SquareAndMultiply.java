import java.util.*;
import java.math.*;



class SquareAndMultiply {


    public static void main (String[] args) throws Exception {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Exponent (b) : ");
        String b = sc.nextLine();
        BigInteger bNum = new BigInteger(b);

        System.out.print("Enter Base Number (a) : ");
        String a = sc.nextLine();
        BigInteger aNum = new BigInteger(a);

        System.out.print("Enter Modulus (p) : ");
        String p = sc.nextLine();
        BigInteger pNum = new BigInteger(p);

        sc.close();

        String StrB = bNum.toString(2);
        System.out.printf("b in binary : %s%n", StrB);

        String bsxStr = "";
        // convert bStr to SSX
        for (int i = 0; i < StrB.length(); i ++) {
            if (StrB.charAt(i) == '1')
                bsxStr += "SX";
            else 
                bsxStr += "S";
        }

        // take out first SX
        bsxStr = bsxStr.replaceFirst("SX", "");
        System.out.println("SX form : " + bsxStr);

        
        BigInteger expP = new BigInteger(StrB);
        for (int i = 0; i < StrB.length(); i++) {
            if (StrB.charAt(i) == 'S')
                expP = expP.modPow(bNum, aNum);
   
            
        }


        System.out.printf("%n%d^%d = %d%n", aNum, bNum, expP);
    
        System.out.printf("%n%d^%d mod %d = %d%n", aNum, bNum, pNum, expP.modPow(bNum, aNum));
    }
}
