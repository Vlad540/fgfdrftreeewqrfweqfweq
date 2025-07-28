package defpackage;

import android.content.Context;
import android.os.Build;

/* renamed from: zsf  reason: default package */
public final class zsf implements Runnable {
    public static final String Z = a24.e0("WorkForegroundRunnable");
    public final ku5 X;
    public final bee Y;
    public final b4d a = new Object();
    public final Context b;
    public final ztf c;
    public final hh7 o;

    /* JADX WARNING: type inference failed for: r0v0, types: [b4d, java.lang.Object] */
    public zsf(Context context, ztf ztf, hh7 hh7, atf atf, bee bee) {
        this.b = context;
        this.c = ztf;
        this.o = hh7;
        this.X = atf;
        this.Y = bee;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [l1, java.lang.Object] */
    public final void run() {
        if (!this.c.q || Build.VERSION.SDK_INT >= 31) {
            this.a.j((Object) null);
            return;
        }
        ? obj = new Object();
        duf duf = (duf) this.Y;
        ((m30) duf.c).execute(new zbe(this, 21, obj));
        obj.c(new q36((Object) this, (Object) obj, false, 25), (m30) duf.c);
    }
}
