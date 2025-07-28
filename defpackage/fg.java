package defpackage;

import android.os.Looper;
import java.util.ArrayList;

/* renamed from: fg  reason: default package */
public final class fg {
    public static final ThreadLocal i = new ThreadLocal();
    public final kgd a = new kgd(0);
    public final ArrayList b = new ArrayList();
    public final lhd c = new lhd(2, this);
    public final b d = new b(7, this);
    public final otf e;
    public boolean f = false;
    public float g = 1.0f;
    public afc h;

    public fg(otf otf) {
        this.e = otf;
    }

    public final boolean a() {
        otf otf = this.e;
        otf.getClass();
        return Thread.currentThread() == ((Looper) otf.b).getThread();
    }
}
