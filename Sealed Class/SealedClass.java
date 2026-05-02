// extends class of a sealed class must use sealed, non-sealed, or final keyword
sealed class A extends Thread implements Cloneable permits B,C {
    
}

non-sealed class B extends A {
    
}

final class C extends A {

}

class D extends B{

}

// extends interface of a sealed interface must use sealed or non-sealed keyword
sealed interface X permits Y {
   
}

non-sealed interface Y extends X {
    
}

public class SealedClass {
    public static void main(String[] args) {
        
    }
}
