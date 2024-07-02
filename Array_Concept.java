package comp.company;

public class Array_Concept {
    void array_1D()
    {
        // Declaration of Array
        //1st way to declare array
        String [] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);

        //Display the whole array using loop.
        for(int i =0 ; i<cars.length ; i++){
            System.out.print(cars[i]+" ");
        }
        System.out.println("\n");
        //Display the whole array reversed order using loop.
        for(int i=cars.length-1; i >= 0 ; i--){
            System.out.print(cars[i]+" ");
        }

        // Array length
        System.out.println("\n"+cars.length);

        // 2nd way to declare array
        int [] marks = new int[5];
        //initialization of array.
        marks[0] = 100;
        marks[1] = 90;
        marks[2] = 80;
        marks[3] = 70;
        marks[4] = 60;
        System.out.println(marks[0]);
        System.out.println(marks[4]);

        //update the arrays value.
        marks[4] = 35;
        System.out.println(marks[4]);

        //3rd way to declare array
        int [] roll_no;
        roll_no =  new int[5];
        roll_no[0] = 1;
        roll_no[1] = 2;
        roll_no[2] = 3;
        roll_no[3] = 4;
        roll_no[4] = 5;
    }
    void for_each_loop()
    {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.print(i+" ");
        }
    }
    void multi_Dimensional_Arrays(){
        int[][] marks = {{1,2,3,4},{11,12,13,14}};
        System.out.println("\n");
        System.out.println(marks[1][2]);

        int [][] flats;
        flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;
        //simple loop.
        for(int i=0; i<flats.length; i++)
        {
            for (int j=0; j<flats[i].length; j++){
                System.out.print(flats[i][j]);
                System.out.print("  ");
            }
            System.out.print("\n");
        }
        //for each loop.
        for(int[] i : flats){
            for(int j : i)
            {
                System.out.print(j+"  ");
            }
            System.out.print("\n");
        }
    }
    public  static void main(String[] args)
    {
        Array_Concept obj = new Array_Concept();
        obj.array_1D();
        obj.for_each_loop();
        obj.multi_Dimensional_Arrays();
    }
}
