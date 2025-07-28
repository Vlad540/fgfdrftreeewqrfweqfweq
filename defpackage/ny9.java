package defpackage;

import one.me.android.OneMeApplication;

/* renamed from: ny9  reason: default package */
public final /* synthetic */ class ny9 {
    public static void a(Throwable th) {
        int i = OneMeApplication.w0;
        try {
            udd.s("Payload", "error while parse payload", th);
            ((b9e) y0f.a.getAccessor().c(b9e.class)).c().a((String) null, th);
        } catch (Throwable th2) {
            udd.s("Payload", "failed to collect exception", th2);
        }
    }
}
