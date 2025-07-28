package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: lbe  reason: default package */
public abstract class lbe extends eae {
    public static final kbe b = new lbe();

    public lbe() {
    }

    public void b(ws8 ws8, String str) {
    }

    public lbe(ws8 ws8) {
        try {
            long nanoTime = System.nanoTime();
            if (ws8.m()) {
                int x0 = ws8.x0();
                for (int i = 0; i < x0; i++) {
                    b(ws8, ws8.z0());
                }
            }
            this.a = TimeUnit.NANOSECONDS.toMillis(Math.abs(System.nanoTime() - nanoTime));
        } catch (Exception e) {
            udd.s("lbe", "failed to parse unpacker response: ", e);
            throw new RuntimeException(e);
        }
    }
}
