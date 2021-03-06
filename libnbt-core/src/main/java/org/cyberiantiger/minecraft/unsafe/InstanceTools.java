/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cyberiantiger.minecraft.unsafe;

import java.io.File;
import org.bukkit.Difficulty;
import org.bukkit.World;
import org.bukkit.plugin.Plugin;

/**
 *
 * @author antony
 */
public interface InstanceTools {

    public World createInstance(Plugin plugin, String instanceWorldName, File source, File destination);
    public World createInstance(Plugin plugin, String instanceWorldName, Difficulty difficulty, File source, File destination);
    public World createInstance(Plugin plugin, String instanceWorldName, World.Environment env, Difficulty difficulty, File source, File destination);
    public void unloadWorld(Plugin plugin, World world);
    
}