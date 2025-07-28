package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: x65  reason: default package */
public final /* synthetic */ class x65 implements i4f {
    public final /* synthetic */ int a;
    public final /* synthetic */ y65 b;
    public final /* synthetic */ CountDownLatch c;

    public /* synthetic */ x65(y65 y65, CountDownLatch countDownLatch, int i) {
        this.a = i;
        this.b = y65;
        this.c = countDownLatch;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.C(this.c);
                return;
            default:
                this.b.C(this.c);
                return;
        }
    }
}
