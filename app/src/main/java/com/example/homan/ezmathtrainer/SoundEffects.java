package com.example.homan.ezmathtrainer;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.util.Log;

import java.io.IOException;

/**
 * Created by Homan Huang on 9/12/2017.
 *
 * Description: play sound in assets/sound folder
 *
 */

public class SoundEffects extends ContextWrapper {
    
    MediaPlayer mediaPlayer;

    AssetFileDescriptor descriptor = null;

    //get parent's context
    public SoundEffects(Context base) {
        super(base);
    }


    public void backgroundMusic(String v) {
        Log.i("tms BackGround", v);
    }


    public void playSoundEffect(String sound) {
        AssetFileDescriptor descriptor = null;
        mediaPlayer = new MediaPlayer();

        //sound files are stored in "assets/sound"
        try {
            switch (sound) {
                case "tata":
                    descriptor = getAssets().openFd("sound/tata.mp3");
                    Log.i("tms tata", String.valueOf(descriptor));
                    break;
                case "yes":
                    descriptor = getAssets().openFd("sound/yes.mp3");
                    break;
                case "wrong":
                    descriptor = getAssets().openFd("sound/wrong.mp3");
                    break;
                case "try_again":
                    descriptor = getAssets().openFd("sound/try_again.mp3");
                    break;
                case "congrat":
                    descriptor = getAssets().openFd("sound/congrat.mp3");
                    break;
                case "firework":
                    descriptor = getAssets().openFd("sound/firework.mp3");
                    break;
                case "pass_test":
                    descriptor = getAssets().openFd("sound/pass_test.mp3");
                    break;
                default:
                    System.out.println("Invalid sound file.");
                    break;
            }
            mediaPlayer.setDataSource(descriptor.getFileDescriptor(), descriptor.getStartOffset(), descriptor.getLength());
            descriptor.close();
            mediaPlayer.prepare();
            mediaPlayer.start();

            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    mediaPlayer.stop();
                    if (mediaPlayer != null) {
                        mediaPlayer.reset();
                        mediaPlayer.release();
                    }

                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
