package iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelfP implements Aggregate {

	private List<Book> books = new ArrayList<Book>();

	public BookShelfP(){}

	public Book getBookAt(int index){
		return books.get(index);
	}

	public void appendBook (Book book){
		this.books.add(book);
	}

	public int getLength(){
		return books.size();
	}

	public Iterator iterator(){
		return new BookShelfIteratorP(this);
	}

}
