package co.lsj.prj.board.command;

import co.lsj.prj.board.service.BoardService;
import co.lsj.prj.board.serviceImpl.BoardServiceImpl;
import co.lsj.prj.mybatis.BoardMybatisService;

public interface Command {
//	public BoardService dao = new BoardServiceImpl();
	public BoardService dao = new BoardMybatisService();
	public void execute();
}
