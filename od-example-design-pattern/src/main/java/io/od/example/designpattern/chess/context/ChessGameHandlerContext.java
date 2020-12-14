package io.od.example.designpattern.chess.context;

import java.util.Map;

import io.od.example.designpattern.chess.core.ChessGameEventInvoker;
import io.od.example.designpattern.chess.core.ChessPiece;
import io.od.example.designpattern.chess.core.ChessPieceBehavior;
import io.od.example.designpattern.chess.core.EnumChessPieceType;
import io.od.example.designpattern.chess.core.EnumChessPlayer;

public final class ChessGameHandlerContext implements ChessGameEventInvoker {

	private final Map<EnumChessPlayer, Map<EnumChessPieceType, ChessPiece<? extends ChessPieceBehavior>>> contextDataRef;

	protected ChessGameHandlerContext(Map<EnumChessPlayer, Map<EnumChessPieceType, ChessPiece<? extends ChessPieceBehavior>>> contextData) {
		super();
		this.contextDataRef = contextData;
	}

	@Override
	public void fireLegalMovementEvent(EnumChessPlayer chessPlayer, ChessPiece<? extends ChessPieceBehavior> sourcePiece) {
		System.out.println("fireLegalMovementEvent");
	}

	@Override
	public void fireIllegalMovementEvent(EnumChessPlayer chessPlayer, ChessPiece<? extends ChessPieceBehavior> sourcePiece) {
		System.out.println("fireIllegalMovementEvent");
	}

	@Override
	public void fireTakePieceEvent(EnumChessPlayer chessPlayer, ChessPiece<? extends ChessPieceBehavior> sourcePiece, ChessPiece<? extends ChessPieceBehavior> takedPiece) {

		EnumChessPieceType takedPieceType = takedPiece.getType();
		Map<EnumChessPieceType, ChessPiece<? extends ChessPieceBehavior>> pieces = contextDataRef.get(chessPlayer);
		if (pieces == null || pieces.size() == 0 || pieces.containsKey(takedPieceType)) {
			fireInvalidInputParam();
		}

		pieces.remove(takedPieceType);
	}

	@Override
	public void fireCheckEvent(EnumChessPlayer chessPlayer, ChessPiece<? extends ChessPieceBehavior> sourcePiece) {
		System.out.println("fireCheckEvent");
	}

	@Override
	public void fireCheckMateEvent(EnumChessPlayer chessPlayer, ChessPiece<? extends ChessPieceBehavior> sourcePiece) {
		System.out.println("fireCheckMateEvent");
	}

	@Override
	public void fireGameAlreadyFinished() {
		System.out.println("fireGameAlreadyFinished");
	}

	@Override
	public void fireInvalidPlayerOrder() {
		System.out.println("fireInvalidPlayerOrder");
	}

	@Override
	public void fireInvalidInputParam() {
		System.out.println("fireInvalidInputParam");
	}

}
