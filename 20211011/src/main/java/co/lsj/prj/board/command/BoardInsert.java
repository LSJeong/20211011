package co.lsj.prj.board.command;

import java.util.Scanner;

//import java.sql.Date;

import co.lsj.prj.board.service.BoardVO;

public class BoardInsert implements Command {
	//dao 객체는 인터페이스에서 상속받아서 사용한다.
	private Scanner scb = new Scanner(System.in);
	
	@Override
	public void execute() {
		// 게시글 등록
		BoardVO vo = new BoardVO();
		System.out.println("========================");
		System.out.println("작성자를 입력하세요? ");
		vo.setBWriter(scb.nextLine());
//		vo.setbWriteDate(Date.valueOf("2021-10-11"));
		System.out.println("제목을 입력하세요? ");
		vo.setBTitle(scb.nextLine());
		System.out.println("내용을 입력하세요? ");
		vo.setBContents(scb.nextLine());
		int n = dao.boardInsert(vo);
		if(n != 0) {
			System.out.println("정상적으로 등록되었습니다.");
		}else {
			System.out.println("등록이 실패했습니다.");
		}
		
	}

}
