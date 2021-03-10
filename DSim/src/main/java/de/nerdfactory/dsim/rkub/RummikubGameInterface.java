package de.nerdfactory.dsim.rkub;

import java.util.List;

/**
 * This {@link RummikubGameInterface} describes the possible interactions that
 * can be made according to the Rules.
 * 
 * @author bastian.lange
 *
 */
public interface RummikubGameInterface {

	/**
	 * Gets a {@link List} of {@link RummikubPlayer}s that are registered with this
	 * game.
	 * 
	 * @return {@link List} of {@link RummikubPlayer}s.
	 */
	List<RummikubPlayer> getPlayers();

	/**
	 * Gets the {@link RummikubPlayer} who needs to choose a step.
	 * 
	 * @return A {@link RummikubPlayer}.
	 */
	RummikubPlayer getCurrentPlayer();

	/**
	 * Calculates the next {@link RummikubPlayer} who needs to choose a step.
	 * 
	 * @return The next {@link RummikubPlayer}.
	 */
	RummikubPlayer nextPlayer();

	/**
	 * Tests if the current Game is finished.
	 * 
	 * @return <code>true</code> if the game is stated as finished.
	 *         <code>false</code> otherwise.
	 */
	boolean isGameFinished();

	/**
	 * Picks a {@link RummikubToken} from the field and adds it to the given
	 * {@link RummikubPlayer} and returns the picked {@link RummikubToken}.
	 * 
	 * @param player A {@link RummikubPlayer} that the {@link RummikubToken} should
	 *               be assigned to.
	 * @return The picked {@link RummikubToken} from the field.
	 */
	RummikubToken pickTokenForPlayer(RummikubPlayer player);

	/**
	 * Picks a {@link List} of {@link RummikubToken} from the field and adds them to
	 * the given {@link RummikubPlayer} and returns the list of the
	 * {@link RummikubToken}s.
	 * 
	 * @param player The {@link RummikubPlayer} that the {@link RummikubToken}s
	 *               should be added to.
	 * @param tokens The amount of {@link RummikubToken}s that should be picked.
	 * @return A {@link List} of {@link RummikubToken}s that have beend picked.
	 */
	List<RummikubToken> pickTokensForPlayer(RummikubPlayer player, int tokens);

	boolean isMoveValid(RummikubPlayer player);
}
