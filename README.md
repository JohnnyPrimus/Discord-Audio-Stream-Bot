# Discord Audio Stream Bot
>A simple discord audio streaming bot.

#### The way the audio flows
* 1. Audio source (e.g. your voice, music from file, sound from game)
* 2. Audio recording device (e.g. microphone, [Virtual Cable](https://www.vb-audio.com/Cable/index.htm))
* 3. Discord Audio Stream Bot (This Software)
* 4. Discord Voice Chat (Discord)

![preview](https://drive.google.com/uc?export=download&id=0B6898q95NTM3aG5JU3E3YjdiSk0)

## Instructions
* Run the .jar file using **run win64.bat** (assuming you are using Windows 64-bit)
* In the settings tab, insert your bot token (assuming you have already created an application with a bot user [here](https://discordapp.com/developers/applications))
* In the home tab, click the big on/off button to log in to the bot user
* In the management tab, invite/add the bot to a guild/server
* Now you can enter commands by either sending a direct message to the bot user, or @mention from within a channel of one of your guilds/servers. To get started, you can enter the command "help" for a list of available commands, and "help <some command name here>" for specific information about a command. Hint: With the command "prefix" you can give it a short prefix to issue commands instead of the possibly lengthy @mention construct, and with the command "bind" you can restrict issuing of commands to one or more channels.
* Issue the command "join" to bring the bot user up in a voice channel
* In the settings tab, enable "speaking" and select a recording device (default one being your microphone, most likely)
* Now it should be sending audio from the selected recording device to discord.

## Binaries
#### Downloads
>[Latest build (2020-04-21)](https://drive.google.com/uc?export=download&id=0B6898q95NTM3eGxoSVljMlM3ekk) (yyyy-MM-dd)

#### Tools
* **Recommended:** Install [Virtual Cable](https://www.vb-audio.com/Cable/index.htm), restart bot program and set the recording device in settings tab to "CABLE Output (VB-Audio Virtual Cable)". Don't forget to stream audio into the device **CABLE Input** or else you'll hear nothing.
* **Optional:** Install [Audio Router](https://github.com/audiorouterdev/audio-router) to replug your favourite audio source to play into CABLE Input, if it doesn't support switching audio output.

## If you enjoy my work
Have a chat with me if you feel like it, my username in discord is **敏感サラリーマン#3306**.

[![paypal](https://www.paypalobjects.com/en_US/i/btn/btn_donateCC_LG.gif)](https://goo.gl/x3BXFW)
