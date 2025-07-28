package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: mja  reason: default package */
public final class mja implements fj7 {
    public final kja X;
    public volatile Object Y;
    public final long a;
    public final xz3 b;
    public final int c;
    public final esd o;

    public mja(oz3 oz3, Uri uri, int i, kja kja) {
        Map emptyMap = Collections.emptyMap();
        if (uri != null) {
            xz3 xz3 = new xz3(uri, 0, 1, (byte[]) null, emptyMap, 0, -1, (String) null, 1, (Object) null);
            this.o = new esd(oz3);
            this.b = xz3;
            this.c = i;
            this.X = kja;
            this.a = xi7.h.getAndIncrement();
            return;
        }
        throw new IllegalStateException("The uri must be set.");
    }

    public final void a() {
    }

    public final void load() {
        this.o.b = 0;
        tz3 tz3 = new tz3((oz3) this.o, this.b);
        try {
            tz3.m();
            Uri uri = this.o.a.getUri();
            uri.getClass();
            this.Y = this.X.k(uri, tz3);
        } finally {
            mze.h(tz3);
        }
    }
}
