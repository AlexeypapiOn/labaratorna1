public class Manager {
    public static void main(String[] args) {
        Product[] products = new Product[10];
        products[0] = new Product("Iphone",800,true);
        products[1] = new Product("BMW i8",150000,false);
        products[2] = new Product("Table", 500,true);
        products[3] = new Product("Human",3000,false);
        products[4] = new Product("Rose",5,true);
        products[5] = new Product("Pen",2,true);
        products[6] = new Product("HP Pavilion Power",1200,false);
        products[7] = new Product("Mi Band 2",30,true);
        products[8] = new Product("Mi Band ",20,true);
        products[9] = new Product("dualshok 4",50,true);

        int allPrice = Manager.countAllPrice(products);
        int allPresence = Manager.countAllPresence(products);

        System.out.println("Сумма всех товаров: "+allPrice+"\n"+"Количество товара на слкаде: "+allPresence);
    }

   private static int countAllPrice(Product[] products){
        int allPrice = 0;
        for (int i=0; i < products.length; i++) {
            allPrice += products[i].getPrice();
        }
        return allPrice;
    }

    private static int countAllPresence(Product[] products){
        int allPresence = 0;
        for (int i=0; i<products.length; i++){
            if (products[i].isPresence()){
                allPresence++;
            }
        }
       return allPresence;
    }



}
