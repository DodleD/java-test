package com.kh.Test240206;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BookController {
	List bookList = new ArrayList();

	
	
	public BookController() {
		
		bookList.add(new Book("자바의 정석", "남궁 성", "기타", 20000));
		bookList.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
		bookList.add(new Book("대화의 기술", "강보람", "인문", 17500));
		bookList.add(new Book("암 정복기", "박신우", "의료", 21000));

	}

	public void insertBook(Book bk) {
		bookList.add(bk);
		
	}
	
	public ArrayList selectList() {
		return (ArrayList) bookList;
	}
	
	public ArrayList searchBook(String keyword){
		ArrayList searchList = new ArrayList();
		for(int i =0 ; i<bookList.size(); i++) {
			if(((Book)bookList.get(i)).getTitle().contains(keyword)  || ((Book)bookList.get(i)).getAuthor().contains(keyword)) {
				searchList.add(bookList.get(i));
			}
		}
		return searchList;
	}
	
	public Book deleteBook(String title, String author) {
		Book removeBook = new Book();
		removeBook=null;
		
		for(int i =0; i<bookList.size();i++) {
			if(((Book)bookList.get(i)).getTitle().equals(title)&&((Book)bookList.get(i)).getAuthor().equals(author)) {
				removeBook = (Book)bookList.remove(i);
				
			}
		}

		return removeBook;
	}
	/*
	 * 문자열.compareTo -> 두 문자열이 동일한 경우 : 0
	 * 					 시전적으로 먼저 위치한 문자열이 앞에 나온경우 -1
	 * 					 시전적으로 먼저 위치한 문자열이 뒤에 나온경우 1
	 */
	
	
	public int ascBook() {
		try {
		this.bookList.sort((obj1, obj2) -> ((Book)obj1).getTitle().compareTo(((Book)obj2).getTitle()));
		return 1;
		}catch(Exception e) {
			return 0;
		}
		
		//이 밑은 람다식
		
//		return ((Book)bookList.get(0)).getTitle().compareTo(((Book)bookList.get(1)).getTitle());
	
//		this.bookList.sort(new Comparator<Book>() {
//			@Override
//			public int compare(Book obj1, Book obj2) {
//				return obj1.getTitle().compareTo(obj2.getTitle());
//			}
//		});
	}

	protected List getBookList() {
		return bookList;
	}

	protected void setBookList(List bookList) {
		this.bookList = bookList;
	}
	
	
	
	
}
