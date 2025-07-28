package defpackage;

import java.util.concurrent.Executor;

/* renamed from: bie  reason: default package */
public final class bie implements y4b {
    public final /* synthetic */ int a;
    public final y4b b;
    public final Object c;

    public /* synthetic */ bie(y4b y4b, Object obj, int i) {
        this.a = i;
        this.b = y4b;
        this.c = obj;
    }

    public final void a(ah0 ah0, z4b z4b) {
        switch (this.a) {
            case 0:
                n06.s();
                v4b v4b = (v4b) this.c;
                ji0 ji0 = (ji0) z4b;
                ji0.A0.v.getClass();
                ik7 ik7 = new ik7(ah0, ji0.c, z4b, this);
                ji0.a(new um6(ik7, 4, this));
                synchronized (v4b) {
                    ((Executor) v4b.b).execute(ik7);
                }
                return;
            default:
                this.b.a(new pq0(this, ah0, z4b), z4b);
                return;
        }
    }
}
