package de.nerdfactory.dsim.rkub;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RummikubGame implements RummikubGameInterface {

	private final List<RummikubToken> drawTokens = new ArrayList<>();
	private final List<RummikubPlayer> players = new ArrayList<>();
	private int currentPlayerIdx;
	

	public RummikubGame(int playersCnt) {
		if (playersCnt < 1 || playersCnt > 6) {
			throw new IllegalArgumentException(
					"The amount of players(" + playersCnt + ") dont not fit the rules! (2-6)");
		}
		for (int playerId = 1; playerId <= playersCnt; playerId++) {
			this.players.add(new RummikubPlayer(playerId));
		}
		RummikubTokenBuilder builder = new RummikubTokenBuilder();
		builder.setPlayerCnt(playersCnt);
		drawTokens.addAll(builder.build());
	}

	@Override
	public List<RummikubPlayer> getPlayers() {
		return Collections.unmodifiableList(players);
	}

	@Override
	public RummikubPlayer getCurrentPlayer() {
		return players.get(currentPlayerIdx);
	}

	@Override
	public RummikubPlayer nextPlayer() {
		currentPlayerIdx++;
		if (currentPlayerIdx >= players.size()) {
			currentPlayerIdx = 0;
		}
		return getCurrentPlayer();
	}

	@Override
	public boolean isGameFinished() {
		return players.stream().map(e -> e.getPlayerTokens().isEmpty()).filter(e -> e == true).findAny().isPresent();
	}
	

	@Override
	public RummikubToken pickTokenForPlayer(RummikubPlayer player) {
		if (drawTokens.size() <= 0) {
			return null; //TODO maybe change to optional
		}
		RummikubToken token = drawTokens.remove(0);
		player.addToken(token);
		return token;
	}

	@Override
	public List<RummikubToken> pickTokensForPlayer(RummikubPlayer player, int tokens) {
		List<RummikubToken> pickedTokens = new ArrayList<>();
		for (int i=0; i<tokens; i++) {
			RummikubToken currentToken = pickTokenForPlayer(player);
			if (currentToken != null) {
				pickedTokens.add(currentToken);
			}
		}
		return pickedTokens;
	}

	@Override
	public boolean isMoveValid(RummikubPlayer player) {
		return false; //TODO
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("RummikubGame[isGameFinished=");
		sb.append(isGameFinished());
		sb.append(", players=");
		sb.append(players.stream().map(RummikubPlayer::toString).collect(Collectors.joining(";")));
		sb.append(", currentPlayerIdx=");
		sb.append(currentPlayerIdx);
		sb.append("]");
		return sb.toString();
	}
}
