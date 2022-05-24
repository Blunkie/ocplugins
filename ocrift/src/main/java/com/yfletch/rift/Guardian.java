package com.yfletch.rift;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.api.ObjectID;

@Getter
@AllArgsConstructor
public enum Guardian
{
	AIR("Air", Cell.WEAK, ObjectID.GUARDIAN_OF_AIR, false, 1, 4353),
	WATER("Water", Cell.MEDIUM, ObjectID.GUARDIAN_OF_WATER, false, 5, 4355),
	EARTH("Earth", Cell.STRONG, ObjectID.GUARDIAN_OF_EARTH, false, 9, 4356),
	FIRE("Fire", Cell.OVERCHARGED, ObjectID.GUARDIAN_OF_FIRE, false, 14, 4357),
	MIND("Mind", Cell.WEAK, ObjectID.GUARDIAN_OF_MIND, true, 2, 4354),
	BODY("Body", Cell.WEAK, ObjectID.GUARDIAN_OF_BODY, true, 20, 4358),
	COSMIC("Cosmic", Cell.MEDIUM, ObjectID.GUARDIAN_OF_COSMIC, true, 27, 4359),
	CHAOS("Chaos", Cell.MEDIUM, ObjectID.GUARDIAN_OF_CHAOS, true, 35, 4360),
	NATURE("Nature", Cell.STRONG, ObjectID.GUARDIAN_OF_NATURE, true, 44, 4361),
	LAW("Law", Cell.STRONG, ObjectID.GUARDIAN_OF_LAW, true, 54, 4362),
	DEATH("Death", Cell.OVERCHARGED, ObjectID.GUARDIAN_OF_DEATH, true, 65, 4363),
	BLOOD("Blood", Cell.OVERCHARGED, ObjectID.GUARDIAN_OF_BLOOD, true, 77, 4364);

	private final String name;
	private final Cell cell;
	private final int objectId;
	private final boolean catalytic;
	private final int requiredLevel;
	private final int spriteId;
}
