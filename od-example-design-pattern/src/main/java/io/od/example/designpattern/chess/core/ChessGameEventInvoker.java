package io.od.example.designpattern.chess.core;

public interface ChessGameEventInvoker {

	public void fireLegalMovementEvent(EnumChessPlayer chessPlayer, ChessPiece<? extends ChessPieceBehavior> sourcePiece);

	public void fireIllegalMovementEvent(EnumChessPlayer chessPlayer, ChessPiece<? extends ChessPieceBehavior> sourcePiece);

	public void fireTakePieceEvent(EnumChessPlayer chessPlayer, ChessPiece<? extends ChessPieceBehavior> sourcePiece, ChessPiece<? extends ChessPieceBehavior> takedPiece);

	public void fireCheckEvent(EnumChessPlayer chessPlayer, ChessPiece<? extends ChessPieceBehavior> sourcePiece);

	public void fireCheckMateEvent(EnumChessPlayer chessPlayer, ChessPiece<? extends ChessPieceBehavior> sourcePiece);

	public void fireGameAlreadyFinished();

	public void fireInvalidPlayerOrder();

	public void fireInvalidInputParam();

}
