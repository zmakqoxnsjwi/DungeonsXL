/*
 * Copyright (C) 2014-2020 Daniel Saukel
 *
 * This library is free software: you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE. See the GNULesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */
package de.erethon.dungeonsxl.api.sign;

import de.erethon.dungeonsxl.api.DungeonsAPI;
import de.erethon.dungeonsxl.api.world.GameWorld;
import org.bukkit.block.Sign;

/**
 * A sign with an attached task that does actions in a set interval <i>n</i> times, like a mob sign that spawns <i>n</i> mobs. It is similar to a {@link Rocker}
 * as it expires (=is deactivated).
 *
 * @author Daniel Saukel
 */
public abstract class Windup extends Deactivatable {

    protected double interval = -1;

    protected Windup(DungeonsAPI api, Sign sign, String[] lines, GameWorld gameWorld) {
        super(api, sign, lines, gameWorld);
    }

    public double getIntervalSeconds() {
        return interval;
    }

    public long getIntervalTicks() {
        return (long) (interval * 20L);
    }

}
