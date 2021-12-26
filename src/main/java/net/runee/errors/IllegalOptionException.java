package net.runee.errors;

import net.dv8tion.jda.api.events.interaction.SlashCommandEvent;
import net.runee.misc.discord.Command;

public class IllegalOptionException extends CommandException {
    private final String optionName;

    public IllegalOptionException(Command cmd, SlashCommandEvent ctx, String optionName) {
        super(cmd, ctx);
        this.optionName = optionName;
    }

    @Override
    public String getReplyMessage() {
        return "Option \"" + optionName + "\" is not allowed here";
    }
}
