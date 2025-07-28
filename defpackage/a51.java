package defpackage;

/* renamed from: a51  reason: default package */
public final class a51 implements xwb {
    public final void log(String str, String str2) {
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, "CallsSdk", me4.j("[", str, "] ", str2), (Throwable) null);
        }
    }

    public final void logException(String str, String str2, Throwable th) {
        udd.u("CallsSdk", th, "[%s] %s", str, str2);
    }
}
