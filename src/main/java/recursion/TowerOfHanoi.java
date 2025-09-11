package recursion;

public class TowerOfHanoi {
    int n;
    String source;
    String destination;
    String helper;

    private void solve(int n, String source, String destination, String helper){
        if(n==1){
            System.out.println("moving plate %d from %s to %s ".formatted(n, source, destination));
            return;
        }
        solve(n-1, source, helper, destination);
        System.out.println("moving plate %d from %s to %s ".formatted(n, source, destination));
        solve(n-1, helper, destination, source);
    }

    public TowerOfHanoi(int n, String source, String destination, String helper){
        this.n = n;
        this.source = source;
        this.destination = destination;
        this.helper= helper;
    }


    public static void main(String[] args) {
        TowerOfHanoi towerOfHanoi = new TowerOfHanoi(2,"source", "target", "helper");
        towerOfHanoi.solve(towerOfHanoi.n, towerOfHanoi.source, towerOfHanoi.destination, towerOfHanoi.helper);
    }


}
