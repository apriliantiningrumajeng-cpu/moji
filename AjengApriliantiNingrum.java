import java.util.Scanner; 
    public class AjengApriliantiNingrum{
        public static void main (String [] args){
            Scanner sc = new Scanner (System.in);
            int [][] matriks = new int [3][3];
            int [][] hasil = new int [3][3];
            
            for (int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    matriks[i][j] = sc.nextInt();
                }
            }
            
            int r = sc.nextInt();
            r = r % 4;
            
            for (int k = 0; k < r; k++){
                for (int i = 0; i < 3; i++){
                    for (int j = 0; j < 3; j++){
                        hasil [j][2-i] = matriks [i][j];
                    }
                }
                
                for (int i = 0; i < 3; i++){
                    for (int j = 0; j < 3; j++){
                        matriks[i][j] = hasil[i][j];
                    }
                }
            }
            
            System.out.println("Hasil Rotasi Matriks : ");
            for (int i = 0; i < 3; i++){
                for (int j = 0; j < 3; j++){
                    System.out.print(matriks[i][j] + " ");
                }
                System.out.println();
            }
            
            int D = (matriks[0][0] * matriks[1][1] * matriks[2][2]) + 
                    (matriks[0][1] * matriks[1][2] * matriks[2][0]) +
                    (matriks[0][2] * matriks[1][0] * matriks[2][1]) -
                    (matriks[0][2] * matriks[1][1] * matriks[2][0]) -  
                    (matriks[0][0] * matriks[1][2] * matriks[2][1]) -
                    (matriks[0][1] * matriks[1][0] * matriks[2][2]);
                     
                    System.out.println("Determinan = " + D);
                        
        }  
    }
