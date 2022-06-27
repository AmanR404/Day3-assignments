package assignment;

public class Linecomparison {
    public static void main(String[] args) {
        int x1 = 2,x2 = 6;
        int y1 = 2,y2 = 6;

        int x_axis1 = 1,x_axis2=6;
        int y_axis1 = 2,y_axis2=6;

        Double lineLength1=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));

        Double lineLength2=Math.sqrt((x_axis2-x_axis1)*(x_axis2-x_axis1)+(y_axis2-y_axis1)*(y_axis2-y_axis1));

        System.out.println("Line 1 Length : "+lineLength1);
        System.out.println("Line 2 Length : "+lineLength2);

        System.out.println(lineLength1.equals(lineLength2));
    }
}
