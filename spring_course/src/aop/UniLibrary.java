package aop;

import org.springframework.stereotype.Component;

@Component()
public class UniLibrary extends AbstractLibrary{

//    @Override
    public void getBook(){
        System.out.println("Get book in UniLibrary");
        System.out.println("------------------------------");
    }

    public String returnBook(){
        System.out.println("Return book to UniLibrary");
        return "World and Peace";
    }

    public void addBook(String person_name, Book book){
        System.out.println("Add book to UniLibrary");
        System.out.println("------------------------------");
    }

    public void getMagazine(){
        System.out.println("Get magazine in UniLibrary");
        System.out.println("------------------------------");
    }

    public void returnMagazine(){
        System.out.println("Return magazine to UniLibrary");
        System.out.println("------------------------------");
    }

    public void addMagazine(){
        System.out.println("Add magazine to UniLibrary");
        System.out.println("------------------------------");
    }

}
