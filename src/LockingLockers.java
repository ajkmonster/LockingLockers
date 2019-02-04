public class LockingLockers {
    public static void main(String[] args){
        boolean[] arr= new boolean[101];
        int x;
        for (x=1; x<=100; x++){
            arr[x] = true;
        }
        for (x=2; x<=100; x++){
            for (int i = x; i <=100; i++) {
                arr[i] = !arr[i];
            }
        }
        for (x=0;x<arr.length; x++){
            if (arr[x]){
                System.out.println("Locker " +x+ " is open.");
            }
        }
    }
}