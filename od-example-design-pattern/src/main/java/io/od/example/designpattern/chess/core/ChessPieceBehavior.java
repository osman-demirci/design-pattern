package io.od.example.designpattern.chess.core;

public interface ChessPieceBehavior {
	
	public void toMove(EnumChessPlayer chessPlayer, ChessGameEventInvoker invoker, MovementEvent event);

}
