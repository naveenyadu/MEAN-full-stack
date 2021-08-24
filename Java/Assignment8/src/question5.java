
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class question5 {
    public static void main(String[] args) {
        Consumer<StringBuilder>  PrintFirstLetter = (item->{
            System.out.print(item.charAt(0));
        });


        List<StringBuilder> list= new LinkedList<>();
        list.add(new StringBuilder("abbas"));
        list.add(new StringBuilder("basker"));
        list.add(new StringBuilder("sony"));
        list.add(new StringBuilder("kick"));
        
        list.forEach(PrintFirstLetter);
    }

}