public class LockingLockers {
    public static void main(String[] args){
            boolean[] arr= new boolean[100];
            int x;
            int i;
            for (i = 0; i < arr.length; i++) {
                for (x = i; x < arr.length; x += (i+1)) {
                    arr[x] = !arr[x];
                }
            }

            for (i=0;i<arr.length; i++){
                if (arr[i]){
                    System.out.println("Locker " +(i+1)+ " is open.");
                }
            }
        }
    }
