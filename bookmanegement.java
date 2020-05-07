package b5;

import java.util.Scanner;

public class bookmanegement {
    private int n;
    private book[] books;

    public bookmanegement(int n){
        this.n = n;
        Scanner scanner = new Scanner(System.in);
        books = new book[n];

        System.out.println("nhap thong tin cho "+n+" cuon sach");
        for (int i = 0; i < n; i++) {
            System.out.println("quyen sach thu "+(i+1)+ " la: ");

            System.out.println("\t+name: ");
            String name = scanner.nextLine();

            System.out.println("\t+author: ");
            String author = scanner.nextLine();

            System.out.println("\t+price: ");
            long price = scanner.nextLong();

            System.out.println("\t+tottalsold: ");
            long totalsold = scanner.nextLong();
            scanner.nextLine();

            books[i] = new book(name,author,price,totalsold);
        }
    }

    public int count(boolean bestsale) {
        int s=0;
        for (int i = 0; i < n; i++) {

            if (bestsale) {
                if (books[i].check()) {
                   s++;
                }
            }
        }
        return s;
        }

    public book find1stbook(){
        book bestsalebook = books[0];

        for (int i = 0; i < n; i++) {
            if(books[i].getTotalsold()>bestsalebook.getTotalsold()){
                bestsalebook = books[i];
            }
        }
        return bestsalebook;
    }

    public void showAll(){
        for (int i = 0; i <n ; i++) {
            System.out.println("cuon sach thu "+(i+1)+books[i].printinfor());
        }
    }

    public static void main(String[] args) {
        bookmanegement bookmanegement = new bookmanegement(2);
        bookmanegement.showAll();
        System.out.println(" so cuon best sale la: "+bookmanegement.count(true));
        System.out.println("cuon ban chay nhat la: "+bookmanegement.find1stbook().printinfor());
    }

    }