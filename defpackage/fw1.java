package defpackage;

import android.os.CancellationSignal;

/* renamed from: fw1  reason: default package */
public abstract class fw1 {
    public static void a(CancellationSignal cancellationSignal) {
        cancellationSignal.cancel();
    }

    public static CancellationSignal b() {
        return new CancellationSignal();
    }
}
