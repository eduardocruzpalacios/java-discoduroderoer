package pkg1.matriz3x3.mostrarporpantalla;
public class Matriz3x3Mostrarporpantalla
{
    public static void main(String[] args)
    {
        // declarar Array y su tamaño, asignar valores después
        int[][] nums1 = new int [3][3];
        
        nums1[0][0] = 1;
        nums1[0][1] = 2;
        nums1[0][2] = 3;
        
        nums1[1][0] = 4;
        nums1[1][1] = 5;
        nums1[1][2] = 6;
        
        nums1[2][0] = 7;
        nums1[2][1] = 8;
        nums1[2][2] = 9;
        
        // declarar y definir Array en una línea
        int[][] nums2 = { {9,8,7},{6,5,4},{3,2,1} };
        
        // imprimir 1er Array
        for (int i=0 ; i<nums1.length ; i++)
        {
            for (int j=0 ; j<nums1[i].length ; j++)
            {
                System.out.print(nums1[i][j]+"\t");
            }
        }
        
        System.out.println();
        
        // imprimir 2ndo Array
        for (int i=0 ; i<nums2.length ; i++)
        {
            for (int j=0 ; j<nums2[i].length ; j++)
            {
                System.out.print(nums2[i][j]+"\t");
            }
        }
    }
}