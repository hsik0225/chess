package chess.domain.chess;

import chess.domain.board.BoardDto;

public class ChessDto {
    private final String status;
    private final String turn;
    private final BoardDto boardDto;

    public ChessDto(Chess chess) {
        this(chess.status(), chess.color(), BoardDto.from(chess));
    }

    public ChessDto(String status, String turn, BoardDto boardDto) {
        this.status = status;
        this.turn = turn;
        this.boardDto = boardDto;
    }

    public String getStatus() {
        return status;
    }

    public String getTurn() {
        return turn;
    }

    public BoardDto getBoardDto() {
        return boardDto;
    }
}
