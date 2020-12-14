package io.od.example.designpattern.chess.behavior;

import io.od.example.designpattern.chess.core.ChessGameEventInvoker;
import io.od.example.designpattern.chess.core.ChessPieceBehavior;
import io.od.example.designpattern.chess.core.EnumChessPlayer;
import io.od.example.designpattern.chess.core.MovementEvent;

public class KnightBehavior implements ChessPieceBehavior {

	private static KnightBehavior instance = new KnightBehavior();

	private KnightBehavior() {
	}

	public static KnightBehavior getInstance() {

		if (instance != null) {
			return instance;
		}

		synchronized (KnightBehavior.class) {
			if (instance == null) {
				instance = new KnightBehavior();
			}
		}

		return instance;
	}

	@Override
	public void toMove(EnumChessPlayer chessPlayer, ChessGameEventInvoker invoker, MovementEvent event) {
		
	}

}
