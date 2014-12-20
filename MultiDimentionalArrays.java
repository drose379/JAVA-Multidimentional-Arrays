

package multidimentional.arrays;

public class MultiDimentionalArrays {

    public static void main(String[] args) {
       int firstArray[][]= {{1,2,4},
                            {4,5,3,7,5},
                            {3,4,6,8,9,9},
                            {7,2,1,6}
                            };
       /*
       System.out.println("The 'array length' is: "+firstArray.length);
       System.out.println("Testing row length: "+ firstArray[0].length);
       /*How the create method works
       System.out.print(firstArray[0][0]+"\t");
       System.out.print(firstArray[0][1]+"\t");
       System.out.print(firstArray[0][2]+"\t");
       */
       //Next row
       buildTable(firstArray);
    }
    
    public static void buildTable(int Array[][]) {
        for (int row=0;row < Array.length;row++) {
            System.out.println("This row has "+Array[row].length+" Columns");
    }
    }
   
    /*
    public static void create(int Multiarray[][]) {
        for (int row=0;row < Multiarray.length;row++) {
            for (int column=0;column<Multiarray[row].length;column++) {
                System.out.print(Multiarray[row][column]+"\t");
            }
            System.out.println();
    }
    */

}
    

