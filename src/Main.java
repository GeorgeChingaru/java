public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello World!");

        Client c1 = new Client(1, "Alice");
        System.out.println("Client c1: id = " + c1.getId() + ", name = " + c1.getName());
        //garbage collector
        System.out.println();

        Client c2 = c1;//c2 refera la c1
        System.out.println("Client c1: id = " + c1.getId() + ", name = " + c1.getName());
        System.out.println("Client c2: id = " + c2.getId() + ", name = " + c2.getName());
        System.out.println();

        c2.setName("Bob");
        System.out.println("Client c1: id = " + c1.getId() + ", name = " + c1.getName());
        System.out.println("Client c2: id = " + c2.getId() + ", name = " + c2.getName());
        System.out.println();

        try {
            c2 = c1.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        c2.setId(2);
        c2.setName("Alice");
        System.out.println("Client c1: id = " + c1.getId() + ", name = " + c1.getName());
        System.out.println("Client c2: id = " + c2.getId() + ", name = " + c2.getName());


        //String immutable //not necessary now
        //java is call by value only
        //modUs(c2);
        //System.out.println("Client c2: id = " + c2.getId() + ", name = " + c2.getName());

Car masina1=new Car(1,"Fiat");
Car masina2=new Car(2,"BMW");
System.out.println("Masina 1 are id: "+ masina1.getId()+", marca: "+ masina1.getModelName());
        System.out.println("Masina 2 are id: "+ masina2.getId()+", marca: "+ masina2.getModelName());

        //masina 2 referentiaza catre m1
        masina2=masina1;
        System.out.println("Masina 2 are id: "+ masina2.getId()+", marca: "+ masina2.getModelName());
    masina2.setId(4);//cum referentiaza catre m1 modifica val. lui m1
        System.out.println("Masina 2 are id: "+ masina2.getId()+", marca: "+ masina2.getModelName());
        System.out.println("Masina 1 are id: "+ masina1.getId()+", marca: "+ masina1.getModelName());

        masina1.setModelName("Dacia");//si invers m2 va avea Dacia
        System.out.println("Masina 2 are id: "+ masina2.getId()+", marca: "+ masina2.getModelName());

        //dar cu clone se va crea obiect separat
        masina2=masina1.cloneCar();
        System.out.println("Masina 2(clone) are id: "+ masina2.getId()+", marca: "+ masina2.getModelName());
masina2.setId(23);//nu se mai influienteaza
masina1.setModelName("Ferrari");
        System.out.println("Masina 2(clone) are id: "+ masina2.getId()+", marca: "+ masina2.getModelName());
        System.out.println("Masina 1(clone) are id: "+ masina1.getId()+", marca: "+ masina1.getModelName());
        System.out.println("Masina 2(clone) are id: "+ masina2.getId()+", marca: "+ masina2.getModelName());
    }
}