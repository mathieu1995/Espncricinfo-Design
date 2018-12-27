package com.codex.ec.common;

import com.codex.ec.player.PlayerType;
import com.codex.ec.player.FieldingType;

public class Fielding {
	private Statistics statistics;
	private PlayerType playerType;
	private FieldingType fieldingType;

	/**
	 * @return the statistics
	 */
	public Statistics getStatistics() {
		return statistics;
	}

	/**
	 * @return the playerType
	 */
	public PlayerType getPlayerType() {
		return playerType;
	}

	/**
	 * @return the fieldingType
	 */
	public FieldingType getFieldingType() {
		return fieldingType;
	}
}