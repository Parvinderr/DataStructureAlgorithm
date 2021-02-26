// State Of Wakanda-1



public class Main{
public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int m = scn.nextInt();
    int n = scn.nextInt();
    int arr[][] = new int[m][n];
    for(int i =0;i<m;i++){
        for(int j=0;j<n;j++){
            arr[i][j]= scn.nextInt();
        }
    }
    
    for(int k =0;k<arr[0].length;k++){
        if(k%2==0){
            for(int r =0;r<arr.length;r++){
                System.out.println(arr[r][k]);
            }
        }else{
            for(int w =arr.length-1;w >=0;w--){
                System.out.println(arr[w][k]);
            }
        }
    }
}
