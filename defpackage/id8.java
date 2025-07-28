package defpackage;

import android.content.ComponentName;
import android.media.session.MediaSession;

/* renamed from: id8  reason: default package */
public abstract class id8 {
    public static void a(vc8 vc8, ComponentName componentName) {
        MediaSession mediaSession = vc8.a.a;
        mediaSession.getClass();
        mediaSession.setMediaButtonBroadcastReceiver(componentName);
    }
}
