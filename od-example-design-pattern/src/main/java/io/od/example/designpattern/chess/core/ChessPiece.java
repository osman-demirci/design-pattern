package io.od.example.designpattern.chess.core;

import java.io.Serializable;
import java.util.Objects;

public class ChessPiece<T extends ChessPieceBehavior> implements Serializable {

	private static final long serialVersionUID = 1L;

	private final EnumChessPieceColor color;
	private final EnumChessPieceType type;
	private final T behavior;

	public ChessPiece(EnumChessPieceColor color, EnumChessPieceType type, T behavior) {
		super();
		this.color = Objects.requireNonNull(color);
		this.type = Objects.requireNonNull(type);
		this.behavior = Objects.requireNonNull(behavior);
	}

	public EnumChessPieceColor getColor() {
		return color;
	}

	public EnumChessPieceType getType() {
		return type;
	}

	public T getBehavior() {
		return behavior;
	}

}
