package com.Shawn560.Main;

import java.util.ArrayList;
import java.util.List;

import com.Shawn560.handlers.entity.EntityShawn560Handler;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class Command implements ICommand
{ 
    private final List aliases;
  
    protected String fullEntityName; 
    protected Entity conjuredEntity; 
  
    public Command() 
    { 
        aliases = new ArrayList(); 
        aliases.add("conjure"); 
        aliases.add("conj"); 
    } 
  
    @Override 
    public int compareTo(Object o)
    { 
        return 0; 
    } 

    @Override 
    public String getCommandName() { 
        return "conjure"; 
    } 

    @Override         
    public String getCommandUsage(ICommandSender var1) { 
        return "conjure <text>"; 
    } 

    @Override 
    public List getCommandAliases() { 
        return this.aliases;
    } 

    @Override 
    public void processCommand(ICommandSender sender, String[] argString){ 
    	if(argString[0].equalsIgnoreCase("say")){
    		sender.addChatMessage(new ChatComponentText(EnumChatFormatting.YELLOW+"Usage: /conjure say hello"));
    	}else{
    		if(argString[1].equalsIgnoreCase("shawn")){
    			sender.addChatMessage(new ChatComponentText(EnumChatFormatting.YELLOW+""));
    		}
    	}
    }

    @Override 
    public boolean canCommandSenderUseCommand(ICommandSender var1) 
    { 
        return true;
    } 

    @Override  
    public List addTabCompletionOptions(ICommandSender var1, String[] var2) 
    { 
        // TODO Auto-generated method stub 
        return null; 
    } 

    @Override 
    public boolean isUsernameIndex(String[] var1, int var2) 
    { 
        // TODO Auto-generated method stub 
        return false;
    } 
}