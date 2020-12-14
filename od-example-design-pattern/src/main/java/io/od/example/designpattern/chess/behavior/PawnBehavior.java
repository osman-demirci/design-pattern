package io.od.example.designpattern.chess.behavior;

import io.od.example.designpattern.chess.core.ChessGameEventInvoker;
import io.od.example.designpattern.chess.core.ChessPieceBehavior;
import io.od.example.designpattern.chess.core.EnumChessPlayer;
import io.od.example.designpattern.chess.core.MovementEvent;

public class PawnBehavior implements ChessPieceBehavior {

	private static PawnBehavior instance = new PawnBehavior();

	private PawnBehavior() {
	}

	public static PawnBehavior getInstance() {

		if (instance != null) {
			return instance;
		}

		synchronized (PawnBehavior.class) {
			if (instance == null) {
				instance = new PawnBehavior();
			}
		}

		return instance;
	}

	@Override
	public void toMove(EnumChessPlayer chessPlayer, ChessGameEventInvoker invoker, MovementEvent event) {
		
	}

}
