package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: ig8  reason: default package */
public final class ig8 {
    public final gg8 a;
    public final String b = getClass().getName();
    public final /* synthetic */ int c;
    public final /* synthetic */ jg8 d;
    public final /* synthetic */ Object e;

    public ig8(gg8 gg8, jg8 jg8, Object obj, int i) {
        this.c = i;
        this.d = jg8;
        this.e = obj;
        this.a = gg8;
    }

    public final void a() {
        switch (this.c) {
            case 0:
                String str = (String) this.d.b;
                fn6 fn6 = udd.e;
                if (fn6 != null && fn6.c()) {
                    fn6.d(tn7.X, str, "executeWithDetachableLooper.done, quit loop ...", (Throwable) null);
                }
                ((bf4) this.e).b.quitSafely();
                return;
            default:
                String str2 = (String) this.d.b;
                fn6 fn62 = udd.e;
                if (fn62 != null && fn62.c()) {
                    fn62.d(tn7.X, str2, "executeWithMainLooper.done", (Throwable) null);
                }
                ((CountDownLatch) this.e).countDown();
                return;
        }
    }
}
