package aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary{
//    @Override
    public void getBook() {
        System.out.println("Get book in SchoolLibrary");
    }

    public void returnBook(){
        System.out.println("Return book to SchoolLibrary");
    }
}
