package Main;

import Event.ReadyEvent;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.utils.cache.CacheFlag;

import javax.security.auth.login.LoginException;
import java.util.EnumSet;

public class MrGoat {

    /**
     * domdev.net inc,, all rights reserved.
     *
     * MrGoat inc,, all rights reserved. MrGoat is not a affiliated with DiscordApp.com
     *
     * (warning: i do not know how copyright works :\
      */



    public static void main(String[] args)
    throws LoginException, InterruptedException
    {

        /**
         * Register JDA-BUILDER
         */

        JDABuilder jdaBuilder = new JDABuilder(args[0]);

        /**
         * jdaBuilder properties
         */

        jdaBuilder.setDisabledCacheFlags(EnumSet.of(CacheFlag.ACTIVITY, CacheFlag.VOICE_STATE));
        jdaBuilder.setBulkDeleteSplittingEnabled(false);
        jdaBuilder.setActivity(Activity.playing("MrGoat.exe"));


        /**
         * Event and Command Listener
         */

        JDA jda = new JDABuilder(process.env.token)
                .addEventListeners(new ReadyEvent())
                .build();

        jda.awaitReady();
    }





}
