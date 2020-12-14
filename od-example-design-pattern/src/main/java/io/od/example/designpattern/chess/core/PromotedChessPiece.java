package io.od.example.designpattern.chess.core;

public class PromotedChessPiece<T extends ChessPieceBehavior> extends ChessPiece<T> {

	private static final long serialVersionUID = 1L;
	private final T promotionBehavior;

	public PromotedChessPiece(EnumChessPieceColor color, EnumChessPieceType type, T behavior, T promotionBehavior) {
		super(color, type, behavior);
		this.promotionBehavior = promotionBehavior;
	}

	public T getPromotionBehavior() {
		return promotionBehavior;
	}

}
