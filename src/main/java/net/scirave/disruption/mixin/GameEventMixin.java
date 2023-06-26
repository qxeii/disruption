/*
 * -------------------------------------------------------------------
 * Disruption
 * Copyright (c) 2022 SciRave
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 * -------------------------------------------------------------------
 */

package net.scirave.disruption.mixin;

import net.minecraft.registry.Holder;
import net.minecraft.world.event.GameEvent;
import net.scirave.disruption.helpers.GameEventReferenceInterface;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;


@Mixin(GameEvent.class)
public class GameEventMixin implements GameEventReferenceInterface {

	@Final
	private Holder.Reference<GameEvent> field_36412;

	@Override
	public Holder.Reference<GameEvent> getBuiltInRegistryHolder() {
		return field_36412;
	}
}
