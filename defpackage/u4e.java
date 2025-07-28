package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: u4e  reason: default package */
public final /* synthetic */ class u4e implements tn1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ String c;

    public /* synthetic */ u4e(AtomicReference atomicReference, String str, int i) {
        this.a = i;
        this.b = atomicReference;
        this.c = str;
    }

    public final String z(sn1 sn1) {
        switch (this.a) {
            case 0:
                this.b.set(sn1);
                return wn6.l(new StringBuilder(), this.c, "-cancellation");
            case 1:
                this.b.set(sn1);
                return wn6.l(new StringBuilder(), this.c, "-status");
            default:
                this.b.set(sn1);
                return wn6.l(new StringBuilder(), this.c, "-Surface");
        }
    }
}
