//Local Varilable Type Infrence


// cant name the class 'var'
// class var{

// }

public class LVTI {
    public static void main(String[] args) {
        int n = 10;
        var b = 10;

        //var a; // error

        int num[] = new int[10];
        var nums = new int[10];
        var obj = new Alien();
    }
}
