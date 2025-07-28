package defpackage;

import android.content.Context;
import android.media.session.MediaSessionManager;
import android.util.Log;

/* renamed from: rd8  reason: default package */
public final class rd8 {
    public static final boolean b = Log.isLoggable("MediaSessionManager", 3);
    public static final Object c = new Object();
    public static volatile rd8 d;
    public od8 a;

    /* JADX WARNING: type inference failed for: r1v1, types: [rd8, java.lang.Object] */
    public static rd8 a(Context context) {
        rd8 rd8;
        if (context != null) {
            synchronized (c) {
                try {
                    if (d == null) {
                        Context applicationContext = context.getApplicationContext();
                        ? obj = new Object();
                        od8 od8 = new od8(applicationContext);
                        MediaSessionManager mediaSessionManager = (MediaSessionManager) applicationContext.getSystemService("media_session");
                        obj.a = od8;
                        d = obj;
                    }
                    rd8 = d;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return rd8;
        }
        throw new IllegalArgumentException("context cannot be null");
    }

    public final boolean b(pd8 pd8) {
        if (pd8 != null) {
            return this.a.b(pd8.a);
        }
        throw new IllegalArgumentException("userInfo should not be null");
    }
}
