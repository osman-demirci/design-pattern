package io.od.example.designpattern.chess.context;

import java.util.HashMap;
import java.util.Map;

import io.od.example.designpattern.chess.behavior.KnightBehavior;
import io.od.example.designpattern.chess.behavior.PawnBehavior;
import io.od.example.designpattern.chess.core.ChessPiece;
import io.od.example.designpattern.chess.core.ChessPieceBehavior;
import io.od.example.designpattern.chess.core.EnumChessPieceColor;
import io.od.example.designpattern.chess.core.EnumChessPieceType;
import io.od.example.designpattern.chess.core.PromotedChessPiece;

public final class ChessGameUtils {

	private ChessGameUtils() {
		//
	}

	public static EnumChessPieceType[] pieceTypes = EnumChessPieceType.values();

	public static Map<EnumChessPieceType, ChessPiece<? extends ChessPieceBehavior>> createPiecesOf(EnumChessPieceColor pieceColor) {
		int piecesLength = pieceTypes.length;
		Map<EnumChessPieceType, ChessPiece<? extends ChessPieceBehavior>> pieces = new HashMap<>(piecesLength);
		pieces.put(EnumChessPieceType.KING, new ChessPiece<>(EnumChessPieceColor.WHITE, EnumChessPieceType.KNIGHT, KnightBehavior.getInstance()));
		pieces.put(EnumChessPieceType.PAWN, new PromotedChessPiece<>(EnumChessPieceColor.WHITE, EnumChessPieceType.PAWN, PawnBehavior.getInstance(), KnightBehavior.getInstance()));
		return pieces;
	}

}
