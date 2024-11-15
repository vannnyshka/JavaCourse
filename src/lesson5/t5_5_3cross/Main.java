package lesson5.t5_5_3cross;

public class Main {
    public static void main(String[] args) {
        char [][] cross = new char[7][7];

        for(int i = 0; i<cross.length;i++){
            for(int j=0; j<cross.length;j++){
                if((i==j)||(cross.length-i-1==j)){
                    cross[i][j]='X';
                }else{
                    cross[i][j]=' ';
                }
            }
        }

        for(int i = 0; i<cross.length;i++){
            for(int j=0; j<cross.length;j++){
                System.out.print(cross[i][j]);
            }
            System.out.println();
        }
    }
}
