package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: wf6  reason: default package */
public final class wf6 {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final ua6 b;
    public final km7 c;
    public final Context d;

    public wf6(ua6 ua6, km7 km7, Context context) {
        this.b = ua6;
        this.d = context;
        this.c = km7;
    }

    public final jm7 a() {
        jm7 jm7 = new jm7();
        jm7.b = 3;
        jm7.c = 500L;
        jm7.d = 10L;
        return new jm7(jm7);
    }
}
