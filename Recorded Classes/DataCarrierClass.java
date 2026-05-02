// class Alien {
//     private final int id;
//     private final String name;
    
//     public Alien(int id, String name) {
//         this.id = id;
//         this.name = name;
//     }

//     public int getId() {
//         return id;
//     }

//     public String getName() {
//         return name;
//     }

//     @Override
//     public String toString() {
//         return "Alien [id=" + id + ", name=" + name + "]";
//     }

//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj)
//             return true;
//         if (obj == null)
//             return false;
//         if (getClass() != obj.getClass())
//             return false;
//         Alien other = (Alien) obj;
//         if (id != other.id)
//             return false;
//         if (name == null) {
//             if (other.name != null)
//                 return false;
//         } else if (!name.equals(other.name))
//             return false;
//         return true;
//     }

//     @Override
//     public int hashCode() {
//         final int prime = 31;
//         int result = 1;
//         result = prime * result + id;
//         result = prime * result + ((name == null) ? 0 : name.hashCode());
//         return result;
//     }

        
    
// }


// record class can only extends record class
// every field is private, final
// 
record Alien(int id, String name) implements Cloneable{
    static int num;
    //If you want to change the Constrctor // Also known as Canoncial Constructor
    // public Alien(int id, String name) {
    //     if(id == 0) {
    //         throw new IllegalArgumentException("id cant be zero");
    //     }
    //     this.id = id;
    //     this.name = name;
    // }

    //All above code can also be done like this and its called Compact Canonical Constructor
    public Alien {
        if(id ==0)
            throw new IllegalArgumentException("id cant be zero");
    }

    public void show(){
        
    }
}
public class DataCarrierClass {
    public static void main(String[] args) {
        Alien a1 = new Alien(0, "Navin");
        Alien a2 = new Alien(2, "Navin");
        System.out.println(a1.equals(a2));
    }    
}
