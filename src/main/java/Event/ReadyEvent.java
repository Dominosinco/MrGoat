package Event;

import Utilities.Chat;
import Utilities.Prefix;
import net.dv8tion.jda.api.events.GenericEvent;

import javax.security.auth.login.LoginException;
import java.util.EventListener;

public class ReadyEvent implements EventListener
{

    public void onEvent(GenericEvent event)
    {
        if (event instanceof ReadyEvent)
            System.out.println(Prefix.gBot + "Loaded Bot.");
            Chat.sendChatMessage("Test Message");
    }
}
