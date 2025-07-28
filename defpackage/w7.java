package defpackage;

import android.os.SystemClock;

/* renamed from: w7  reason: default package */
public final class w7 {
    public long a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;

    public void a() {
        if (this.b) {
            this.b = false;
            t7 t7Var = (t7) this.e;
            if (t7Var != null) {
                long j = this.a;
                ((fje) ((eje) this.c)).getClass();
                ((i26) this.d).invoke(t7Var, Long.valueOf(SystemClock.elapsedRealtime() - j));
            }
        }
    }
}
