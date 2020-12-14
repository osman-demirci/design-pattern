package io.od.example.designpattern.chess.context;

import io.od.example.designpattern.chess.core.EnumChessPieceType;
import io.od.example.designpattern.chess.core.EnumChessPlayer;
import io.od.example.designpattern.chess.core.MovementEvent;

public final class ChessGameTest {

	public static void main(String[] args) {
		
		ChessGameHandler handler = ChessGameHandler.createNewGame();
		handler.play(EnumChessPlayer.WHITE, EnumChessPieceType.PAWN, MovementEvent.of(25));
		handler.play(EnumChessPlayer.BLACK, EnumChessPieceType.ROOK, MovementEvent.of(25));
	
	}

}
