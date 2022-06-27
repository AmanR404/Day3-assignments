package UC2;

public class LineComparisonComputation {
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
//            Checking Less than
            boolean result = lineLength1 > lineLength2;
            System.out.println("Linelenght1 is smaller than Linelength2 So : " + result);
//            Checking greater than
            boolean result1 = lineLength2 > lineLength1;
            System.out.println("Linelength2 is greater than Linelength1 So : " + result1);
        }
    }
