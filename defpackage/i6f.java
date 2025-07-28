package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: i6f  reason: default package */
public final class i6f implements j6f {
    public final j6f a;
    public final Handler b;

    public i6f(r6f r6f) {
        this.a = r6f;
        Looper myLooper = Looper.myLooper();
        this.b = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper);
    }

    public final void c() {
        this.b.post(new pfe(11, this.a));
    }

    public final boolean equals(Object obj) {
        return this.a.equals(obj);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
