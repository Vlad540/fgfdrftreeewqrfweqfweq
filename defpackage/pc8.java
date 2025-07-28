package defpackage;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteCallbackList;
import java.util.List;

/* renamed from: pc8  reason: default package */
public abstract class pc8 implements nc8 {
    public final MediaSession a;
    public final oc8 b;
    public final uc8 c;
    public final Object d = new Object();
    public final Bundle e;
    public final RemoteCallbackList f = new RemoteCallbackList();
    public cya g;
    public List h;
    public a88 i;
    public int j;
    public int k;
    public m18 l;

    public pc8(Context context, String str, Bundle bundle) {
        MediaSession b2 = b(context, str, bundle);
        this.a = b2;
        oc8 oc8 = new oc8((qc8) this);
        this.b = oc8;
        this.c = new uc8(b2.getSessionToken(), oc8);
        this.e = bundle;
        b2.setFlags(3);
    }

    public abstract MediaSession b(Context context, String str, Bundle bundle);

    public final void c(m18 m18, Handler handler) {
        synchronized (this.d) {
            try {
                this.l = m18;
                this.a.setCallback(m18 == null ? null : (mc8) m18.b, handler);
                if (m18 != null) {
                    m18.I(this, handler);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final m18 getCallback() {
        m18 m18;
        synchronized (this.d) {
            m18 = this.l;
        }
        return m18;
    }
}
