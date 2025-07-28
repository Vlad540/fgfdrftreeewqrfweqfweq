package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: oae  reason: default package */
public final class oae {
    public static volatile oae b;
    public static final CountDownLatch c = new CountDownLatch(1);
    public final t97 a;

    public oae(r7e r7e) {
        this.a = r7e;
    }

    public static oae a() {
        if (c.getCount() == 0) {
            return b;
        }
        throw new IllegalStateException("TamContextAndroid should call `init` before `getInstance`");
    }

    public static kae b() {
        try {
            c.await();
        } catch (InterruptedException e) {
            udd.t("TamContextAndroid", "TamContext initialization was interrupted: %s", new Object[]{e.getMessage()});
        }
        return (kae) a().a.getValue();
    }
}
