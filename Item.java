class Item{
    String name;
    String cname;
    float price;

    public void Setname(String n){
        name = n;
    }
    public void Setcname(String cn){
        cname = cn;
    }
    public void Setprice(float p){
        price = p;
    }
    public String Getname(){
        return name;
    }
    public String Getcname(){
        return cname;
    }
    public float Getprice(){
        return price;
    }
    public Item(String n, String cn, float p){
        name = n;
        cname = cn;
        price = p;
    }
}