package io.od.example.designpattern.chess.core;

import java.util.Objects;

public class MovementEvent {

	private final Integer targetSquare;

	public MovementEvent(Integer targetSquare) {
		super();
		this.targetSquare = targetSquare;
	}

	public static MovementEvent of(Integer targetSquare) {
		targetSquare = Objects.requireNonNull(targetSquare);
		return new MovementEvent(targetSquare);
	}

	public Integer getTargetSquare() {
		return targetSquare;
	}

}
