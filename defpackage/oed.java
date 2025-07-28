package defpackage;

import android.os.Handler;

/* renamed from: oed  reason: default package */
public final class oed {
    public static final oed a = new Object();
    public static wia b;

    public static void a() {
        gba gba;
        wia wia = b;
        if (!(wia == null || (gba = (gba) wia.b) == null)) {
            k40 k40 = gba.a;
            k40.getClass();
            Handler handler = nba.a;
            nba.b((kba) k40.w0, jba.o);
        }
        b = null;
    }

    public static void b(fh1 fh1, s16 s16) {
        wia wia = b;
        if (wia == null || ((fh1) wia.a).compareTo(fh1) <= 0) {
            a();
            gba gba = (gba) s16.invoke();
            if (gba != null) {
                b = new wia(fh1, gba);
            }
        }
    }
}
