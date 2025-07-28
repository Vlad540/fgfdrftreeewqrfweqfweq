package defpackage;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import android.view.KeyEvent;
import java.util.List;

/* renamed from: mn6  reason: default package */
public interface mn6 extends IInterface {
    void B0(c58 c58);

    void T(String str, Bundle bundle, tc8 tc8);

    void W(jn6 jn6);

    void adjustVolume(int i, int i2, String str);

    void fastForward();

    void g0(jn6 jn6);

    Bundle getExtras();

    long getFlags();

    PendingIntent getLaunchPendingIntent();

    a88 getMetadata();

    String getPackageName();

    cya getPlaybackState();

    List getQueue();

    CharSequence getQueueTitle();

    int getRatingType();

    int getRepeatMode();

    Bundle getSessionInfo();

    int getShuffleMode();

    String getTag();

    gja getVolumeAttributes();

    boolean isCaptioningEnabled();

    boolean isTransportControlEnabled();

    void j(dyb dyb, Bundle bundle);

    void k0(c58 c58);

    void m(dyb dyb);

    void next();

    void pause();

    void play();

    void playFromMediaId(String str, Bundle bundle);

    void playFromSearch(String str, Bundle bundle);

    void playFromUri(Uri uri, Bundle bundle);

    void prepare();

    void prepareFromMediaId(String str, Bundle bundle);

    void prepareFromSearch(String str, Bundle bundle);

    void prepareFromUri(Uri uri, Bundle bundle);

    void previous();

    void removeQueueItemAt(int i);

    void rewind();

    void seekTo(long j);

    void sendCustomAction(String str, Bundle bundle);

    boolean sendMediaButton(KeyEvent keyEvent);

    void setCaptioningEnabled(boolean z);

    void setPlaybackSpeed(float f);

    void setRepeatMode(int i);

    void setShuffleMode(int i);

    void setVolumeTo(int i, int i2, String str);

    void skipToQueueItem(long j);

    void stop();

    void t0(c58 c58, int i);
}
