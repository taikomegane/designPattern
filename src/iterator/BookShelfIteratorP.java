package iterator;

public class BookShelfIteratorP implements Iterator{

	private BookShelfP bookShelf;
	private int index;

	public BookShelfIteratorP (BookShelfP bookShelf){
		this.bookShelf = bookShelf;
		this.index = 0;
	}


	@Override
	public boolean hasNext(){
		if (index < bookShelf.getLength()){
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Object next(){
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}

}
