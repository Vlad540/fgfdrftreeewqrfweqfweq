package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: nja  reason: default package */
public final class nja implements gj7 {
    public final lja X;
    public volatile Object Y;
    public final long a = yi7.b.getAndIncrement();
    public final yz3 b;
    public final int c;
    public final fsd o;

    public nja(qz3 qz3, Uri uri, int i, lja lja) {
        Map emptyMap = Collections.emptyMap();
        oyb.m(uri, "The uri must be set.");
        yz3 yz3 = new yz3(uri, 0, 1, (byte[]) null, emptyMap, 0, -1, (String) null, 1, (Object) null);
        this.o = new fsd(qz3);
        this.b = yz3;
        this.c = i;
        this.X = lja;
    }

    public final void a() {
    }

    public final void load() {
        this.o.b = 0;
        tz3 tz3 = new tz3((qz3) this.o, this.b);
        try {
            tz3.m();
            Uri uri = this.o.a.getUri();
            uri.getClass();
            this.Y = this.X.k(uri, tz3);
        } finally {
            oze.h(tz3);
        }
    }
}
