package b5;

public class book {
    private String name;
    private String author;
    private long price;
    private long totalsold;

    public book(String name,String author,long price,long totalsold){
        this.name=name;
        this.author=author;
        this.price=price;
        this.totalsold=totalsold;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author=author;
    }

    public long getPrice(){
        return price;
    }

    public void setPrice(Long price){
        this.price=price;
    }

    public long getTotalsold(){
        return totalsold;
    }

    public void setTotalsold(Long totalsold){
        this.totalsold=totalsold;
    }

    public boolean check(){
        if (totalsold>1000){
            return true;
        }
        else return false;
    }

    public String printinfor(){
        return String.format("name: %s \n author: %s \n price:%d \n totalsold: %d",name,author,price,totalsold);
    }


}
