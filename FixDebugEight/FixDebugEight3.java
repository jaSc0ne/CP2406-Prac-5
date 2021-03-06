// Application looks up home price for different floor plans
// allows upper or lower case data entry
import javax.swing.*;
public class FixDebugEight3 {
    public static void main(String args[]){
        String entry;
        char[] floorPlans = {'A','B','C','a','b','c'};
        int[] pricesInThousands = {145, 190, 235};
        char plan;
        int x, fp = 99;
        String prompt = "Please select a floor plan\n"+
                "Our floor plans are:\n"+
                "A - Augusta, a ranch\n"+
                "B - Brittany, a split level\n"+
                "C - Colonial, a two-storey\n"+
                "Enter floor plan letter";
        entry = JOptionPane.showInputDialog(null, prompt);
        plan = entry.charAt(0);
        for(x = 0; x < floorPlans.length; x++) {
            if (plan == floorPlans[x]) {
                fp = x;
            }
            System.out.println(x);
            System.out.println(plan);
            System.out.println(floorPlans[x]);
            System.out.println(fp);
        }
        if(fp == 99){
            JOptionPane.showMessageDialog(null, "Invalid floor plan code entered");
        }else{
            if(fp > pricesInThousands.length - 1){
                fp = fp - pricesInThousands.length;
            }
        JOptionPane.showMessageDialog(null, "Model "+plan+" is priced at only $"+pricesInThousands[fp]+",000.");
        }

    }
}
