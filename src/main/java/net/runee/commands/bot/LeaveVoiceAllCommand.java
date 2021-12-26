package net.runee.commands.bot;

import net.dv8tion.jda.api.events.interaction.SlashCommandEvent;
import net.dv8tion.jda.api.interactions.commands.build.CommandData;
import net.runee.DiscordAudioStreamBot;
import net.runee.errors.CommandException;
import net.runee.misc.Utils;
import net.runee.misc.discord.Command;

public class LeaveVoiceAllCommand extends Command {
    public LeaveVoiceAllCommand() {
        super(new CommandData("leave-all", "Leave from all guild voice instances"));
        _public = true;
    }

    @Override
    public void run(SlashCommandEvent ctx) throws CommandException {
        ensureOwnerPermission(ctx);

        // execute
        DiscordAudioStreamBot.getInstance().leaveVoiceAll();
        reply(ctx, "Left all voice channels.", Utils.colorGreen);
    }
}
