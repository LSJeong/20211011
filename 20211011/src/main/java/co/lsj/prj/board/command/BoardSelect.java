package co.lsj.prj.board.command;

import java.util.Scanner;

import co.lsj.prj.board.service.BoardVO;

public class BoardSelect implements Command {
	private Scanner scb = new Scanner(System.in);
	@Override
	public void execute() {
		
		BoardVO board = new BoardVO();
		
		System.out.println("======================");
		System.out.println("조회할 글 번호를 입력하세요.");
		board.setBId(scb.nextInt()); //글 가져오기
		board = dao.boardSelect(board);

		System.out.println("번호 : " + board.getBId());
		System.out.println("작성자 : " + board.getBWriter());
		System.out.println("작성일자 : " + board.getBWriteDate());
		System.out.println("제목 : " + board.getBTitle());
		System.out.println("내용 : " + board.getBContents());
		System.out.println("조회수 : " + board.getBHit());
		
	}

}
