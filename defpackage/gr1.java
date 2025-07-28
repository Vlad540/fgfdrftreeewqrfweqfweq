package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: gr1  reason: default package */
public final /* synthetic */ class gr1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ul7 b;

    public /* synthetic */ gr1(ul7 ul7, int i) {
        this.a = i;
        this.b = ul7;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ul7 ul7 = this.b;
                if (!((AtomicBoolean) ul7.b).getAndSet(true)) {
                    ((lr1) ((nu7) ul7.c).b).c.execute(new gr1(ul7, 1));
                    return;
                }
                return;
            default:
                ul7 ul72 = this.b;
                if (((lr1) ((nu7) ul72.c).b).W0 != 8) {
                    lr1 lr1 = (lr1) ((nu7) ul72.c).b;
                    int i = lr1.W0;
                    lr1.toString();
                    return;
                }
                ((lr1) ((nu7) ul72.c).b).toString();
                ((lr1) ((nu7) ul72.c).b).F(7);
                ((lr1) ((nu7) ul72.c).b).w0.b();
                return;
        }
    }
}
