import java.util.Arrays;

public class ArraySolution {
    public static void main(String[] args) {
   /*     int [] arr=new int[6];
int count=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=count;
            count++;
        }

        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }


       */

/*
        int [][] arr=new int[3][4];
        int count=0;
        for(int i=0; i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=count;
                count++;
            }
        }

        for (int k=0;k<arr.length;k++){
            for(int l=0;l< arr[k].length;l++){
                System.out.print(arr[k][l]+" ");
            }
            System.out.println();
        }
        */

        int a1[]={3,6,2,9,5,8,1};
        Arrays.sort(a1);
        for(int i=0;i<a1.length;i++){
            System.out.print(a1[i]+" ");
        }



    }
}
