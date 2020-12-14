package io.od.example.designpattern.chess.context;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import io.od.example.designpattern.chess.core.ChessPiece;
import io.od.example.designpattern.chess.core.ChessPieceBehavior;
import io.od.example.designpattern.chess.core.EnumChessPieceColor;
import io.od.example.designpattern.chess.core.EnumChessPieceType;
import io.od.example.designpattern.chess.core.EnumChessPlayer;
import io.od.example.designpattern.chess.core.MovementEvent;

public final class ChessGameHandler {

	private final Map<EnumChessPlayer, Map<EnumChessPieceType, ChessPiece<? extends ChessPieceBehavior>>> contextData;
	private final ChessGameHandlerContext handlerContext;
	private EnumChessPlayer playerOrder;

	private ChessGameHandler(Map<EnumChessPlayer, Map<EnumChessPieceType, ChessPiece<? extends ChessPieceBehavior>>> contextData, ChessGameHandlerContext handlerContext, EnumChessPlayer playerOrder) {
		super();
		this.contextData = contextData;
		this.handlerContext = handlerContext;
		this.playerOrder = playerOrder;
	}

	public static ChessGameHandler createNewGame() {
		Map<EnumChessPlayer, Map<EnumChessPieceType, ChessPiece<? extends ChessPieceBehavior>>> contextData = new HashMap<>();
		contextData.put(EnumChessPlayer.BLACK, ChessGameUtils.createPiecesOf(EnumChessPieceColor.BLACK));
		contextData.put(EnumChessPlayer.WHITE, ChessGameUtils.createPiecesOf(EnumChessPieceColor.WHITE));
		ChessGameHandlerContext handlerContext = new ChessGameHandlerContext(contextData);
		return new ChessGameHandler(contextData, handlerContext, EnumChessPlayer.WHITE);
	}

	public void play(EnumChessPlayer player, EnumChessPieceType pieceType, MovementEvent event) {

		if (player == null || pieceType == null || event == null) {
			handlerContext.fireInvalidInputParam();
			return;
		}

		if (player.equals(playerOrder) == false) {
			handlerContext.fireInvalidPlayerOrder();
			return;
		}

		// .
		// .
		// .

		findChessPiece(player, pieceType).ifPresentOrElse(
			(piece) -> {
				piece.getBehavior().toMove(player, handlerContext, event);
			},
			() -> {
				//
			});

		if (EnumChessPlayer.WHITE.equals(player) == true) {
			this.playerOrder = EnumChessPlayer.BLACK;
		} else {
			this.playerOrder = EnumChessPlayer.WHITE;
		}

	}

	private Optional<ChessPiece<?>> findChessPiece(EnumChessPlayer player, EnumChessPieceType pieceType) {
		Map<EnumChessPieceType, ChessPiece<?>> pieces = this.contextData.get(player);
		if (pieces == null) {
			return Optional.empty();
		}

		return Optional.ofNullable(pieces.get(pieceType));
	}

}
