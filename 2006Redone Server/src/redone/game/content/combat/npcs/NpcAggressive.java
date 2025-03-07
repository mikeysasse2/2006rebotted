package redone.game.content.combat.npcs;

import redone.game.content.minigames.FightCaves;
import redone.game.content.minigames.PestControl;
import redone.game.npcs.NpcHandler;

public class NpcAggressive {

	/**
	 * Aggressive monsters
	 */
	private static final int[] AGGRESSIVE_MONSTERS = { 
			1155, 374, 1157, 1158, 1159, 1160, 141, 1459, 1456, 96, 97, 142,
			2550, 2551, 2552, 2553, 2558, 2559, 2560, 2561, 2562, 2563,
			2564, 2565, 2892, 2894, 2881, 2882, 2883, 1593, 144, 112, 84, 3068,
			50, 1590, 1591, 1592, 53, 54, 55, 178, 49, 2455, 2456, 2454,
			82, 752, 1608, 1609, 1610, 1827, 2783, 1926, 1931, 2457, 412, 1604, 1612,
			110, 1611, 83, 941, 49, 117, 111, 125, 1154, 107, 1342, 1338, 447, 448, 449, 917,
			1265, 1267
	};

	public static boolean isAggressive(int i) {
		boolean aggressive = NpcHandler.npcs[i].inWild() || PestControl.npcIsPCMonster(NpcHandler.npcs[i].npcType) || FightCaves.isFightCaveNpc(i);
		for (int element : AGGRESSIVE_MONSTERS) {
			if (NpcHandler.npcs[i].npcType == element || aggressive) {
				return true;
			}
		}
		return false;
	}
}
