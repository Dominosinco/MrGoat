package Utilities;

import net.dv8tion.jda.api.entities.Invite;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.entities.User;

public class Chat {


    public static TextChannel channel;

    public Chat() {
    }

    public static void sendChatMessage(String text) {

        channel.sendMessage(text);
    }

}
