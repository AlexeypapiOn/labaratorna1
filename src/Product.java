class Product {
   private String name;
   private int price;
   private boolean presence;

   Product(String name, int prise, boolean presence){
       this.name=name;
       this.price =prise;
       this.presence=presence;
   }
   String getName(){
       return name;
   }
   int getPrice(){
       return price;
   }
   boolean isPresence() {
        return presence;
    }
}


