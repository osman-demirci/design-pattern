package io.od.example.designpattern.chess.behavior;

import io.od.example.designpattern.chess.core.ChessGameEventInvoker;
import io.od.example.designpattern.chess.core.ChessPieceBehavior;
import io.od.example.designpattern.chess.core.EnumChessPlayer;
import io.od.example.designpattern.chess.core.MovementEvent;

public class RookBehavior implements ChessPieceBehavior {

	@Override
	public void toMove(EnumChessPlayer chessPlayer, ChessGameEventInvoker invoker, MovementEvent event) {
		
	}
}
