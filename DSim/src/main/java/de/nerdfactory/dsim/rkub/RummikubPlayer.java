package de.nerdfactory.dsim.rkub;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class RummikubPlayer {

	private final int playerId;
	private final List<RummikubToken> playerTokens = new ArrayList<>();

	public RummikubPlayer(int playerId) {
		this.playerId = playerId;
	}

	public int getPlayerId() {
		return playerId;
	}

	public List<RummikubToken> getPlayerTokens() {
		return Collections.unmodifiableList(playerTokens);
	}

	public void addToken(RummikubToken token) {
		playerTokens.add(token);
	}

	public void removeToken(RummikubToken token) {
		playerTokens.remove(token);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("RummikubPlayer[playerId=");
		sb.append(playerId);
		sb.append(", playerTokens=");
		sb.append(playerTokens.stream().map(RummikubToken::toString).collect(Collectors.joining(",")));
		sb.append("]");
		return sb.toString();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(playerId, playerTokens);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!obj.getClass().equals(RummikubPlayer.class)) {
			return false;
		}
		RummikubPlayer other = (RummikubPlayer) obj;
		return this.playerId == other.playerId && this.playerTokens.equals(other.playerTokens);
	}
}
