package collectionFramework.vector;

import java.util.List;
import java.util.Vector;
import java.util.function.Consumer;

public class VectorExample {

	public static void main(String[] args) {
		List<Board> list = new Vector<>();		// <> : 타입추론연산자
		
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
//		---
		
		list.remove(2);		// 중간요소를 삭제 -> 땡기는 현상발생
		list.remove(3);
		
//		---
		
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		} // for
		
		System.out.println();
		for(Board board : list) {
			System.out.println(board);
		}
		
		System.out.println();
		
//		---
		
		// void accept(T t);
		list.forEach(new Consumer<Board>(){
			@Override
			public void accept (Board t) {
				System.out.println(t.subject + "\t" + t.content + "\t" + t.writer);
			}
		});
		System.out.println();
		
		
//		---
		
		// void accept(T t);
		list.forEach( t->System.out.println(t.subject + "\t" + t.content + "\t" + t.writer) );
		System.out.println();
		
//		----
		
		// void accept(T t);
		list.forEach( t-> System.out.println(t) );
		System.out.println();
		
//		---
		
		//method 참조
		list.forEach(System.out::println);
	}

}
