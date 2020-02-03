/*
 * Copyright (C) 2017 MarkusWME RatzzFatzz
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package at.pcgf.flymod;

import me.sargunvohra.mcmods.autoconfig1.ConfigData;
import me.sargunvohra.mcmods.autoconfig1.annotation.Config;
import me.sargunvohra.mcmods.autoconfig1.annotation.ConfigEntry;

@Config(name = "flymod")
@Config.Gui.Background("minecraft:textures/block/oak_planks.png")
public class FlyModConfig implements ConfigData {

    public boolean mouseControl = true;

    public float flyUpDownBlocks = 0.4f;

    @ConfigEntry.BoundedDiscrete(min = 1, max = 100)
    public int flySpeedMultiplier = 3;

    @ConfigEntry.BoundedDiscrete(min = 1, max = 100)
    public int runSpeedMultiplier = 2;

    public boolean multiplyUpDown = true;

}