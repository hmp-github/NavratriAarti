package navdurgaaarti.app.hmp.aarti.com.navratriaarti;

import android.app.Service;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.IBinder;

import java.io.IOException;

import static navdurgaaarti.app.hmp.aarti.com.navratriaarti.Second_Activity.img;
import static navdurgaaarti.app.hmp.aarti.com.navratriaarti.Second_Activity.isRepeat;
import static navdurgaaarti.app.hmp.aarti.com.navratriaarti.Second_Activity.player;
import static navdurgaaarti.app.hmp.aarti.com.navratriaarti.Second_Activity.song_address;


public class ServicetoPlay extends Service implements MediaPlayer.OnCompletionListener{

    int songarray[]={R.raw.a_shailputri, R.raw.b_bramcharini, R.raw.c_chandraghanta, R.raw.d_kushmanda,R.raw.f_katyani, R.raw.g_kalratri, R.raw.h_gauri};
    MediaPlayer mp;

    public ServicetoPlay() {

        mp = new MediaPlayer();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, final int startId) {

        player.setOnCompletionListener(this);
        player.start();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        player.pause();

    }



    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");


    }



    @Override
    public void onCompletion(MediaPlayer mp) {


        if (isRepeat) {
            if (song_address == R.raw.a_shailputri) {

                mp.reset();

                try {
                    AssetFileDescriptor afd = this.getResources().openRawResourceFd(R.raw.a_shailputri);
                    if (afd == null) return;
                    mp.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                    mp.prepare();

                    mp.start();
                } catch (IOException e) {

                    e.printStackTrace();
                }

            } else if (song_address == R.raw.b_bramcharini) {
                mp.reset();

                try {
                    AssetFileDescriptor afd = this.getResources().openRawResourceFd(R.raw.b_bramcharini);
                    if (afd == null) return;
                    mp.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                    mp.prepare();

                    mp.start();
                } catch (IOException e) {

                    e.printStackTrace();
                }


            }
            else if (song_address == R.raw.c_chandraghanta) {
                mp.reset();

                try {
                    AssetFileDescriptor afd = this.getResources().openRawResourceFd(R.raw.c_chandraghanta);
                    if (afd == null) return;
                    mp.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                    mp.prepare();

                    mp.start();
                } catch (IOException e) {

                    e.printStackTrace();
                }


            }
            else if (song_address == R.raw.d_kushmanda) {
                mp.reset();

                try {
                    AssetFileDescriptor afd = this.getResources().openRawResourceFd(R.raw.d_kushmanda);
                    if (afd == null) return;
                    mp.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                    mp.prepare();

                    mp.start();
                } catch (IOException e) {

                    e.printStackTrace();
                }


            }
            else if (song_address == R.raw.e_skanda) {
                mp.reset();

                try {
                    AssetFileDescriptor afd = this.getResources().openRawResourceFd(R.raw.e_skanda);
                    if (afd == null) return;
                    mp.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                    mp.prepare();

                    mp.start();
                } catch (IOException e) {

                    e.printStackTrace();
                }


            }

        } else {

            if (song_address == R.raw.f_katyani) {

                mp.reset();
                img.setImageResource(R.drawable.f_katyani);

                try {
                    song_address=R.raw.f_katyani;
                    AssetFileDescriptor afd = this.getResources().openRawResourceFd(song_address);
                    if (afd == null) return;
                    mp.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                    mp.prepare();

                    mp.start();
                } catch (IOException e) {

                    e.printStackTrace();
                }
            } else if (song_address == R.raw.g_kalratri) {

                mp.reset();
                img.setImageResource(R.drawable.g_kalratri);

                try {
                    song_address=R.raw.g_kalratri;
                    AssetFileDescriptor afd = this.getResources().openRawResourceFd(song_address);
                    if (afd == null) return;
                    mp.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                    mp.prepare();

                    mp.start();
                } catch (IOException e) {

                    e.printStackTrace();
                }

            } else if (song_address == R.raw.h_gauri) {

                mp.reset();
                img.setImageResource(R.drawable.h_gauri);

                try {
                    song_address=R.raw.h_gauri;
                    AssetFileDescriptor afd = this.getResources().openRawResourceFd(song_address);
                    if (afd == null) return;
                    mp.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                    mp.prepare();

                    mp.start();
                } catch (IOException e) {

                    e.printStackTrace();
                }

            }
            else if (song_address == R.raw.i_siddhidatri) {

                mp.reset();
                img.setImageResource(R.drawable.i_siddhidatri);

                try {
                    song_address=R.raw.i_siddhidatri;
                    AssetFileDescriptor afd = this.getResources().openRawResourceFd(song_address);
                    if (afd == null) return;
                    mp.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                    mp.prepare();

                    mp.start();
                } catch (IOException e) {

                    e.printStackTrace();
                }

            }
            else if (song_address == R.raw.a_shailputri) {

                mp.reset();
                img.setImageResource(R.drawable.a_shailputri);

                try {
                    song_address=R.raw.a_shailputri;
                    AssetFileDescriptor afd = this.getResources().openRawResourceFd(song_address);
                    if (afd == null) return;
                    mp.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                    mp.prepare();

                    mp.start();
                } catch (IOException e) {

                    e.printStackTrace();
                }

            }

        }
    }
}
