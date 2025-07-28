package defpackage;

import java.util.Comparator;

/* renamed from: yu7  reason: default package */
public final class yu7 implements Comparator {
    public final /* synthetic */ int a;
    public final long b;

    public /* synthetic */ yu7(long j, int i) {
        this.a = i;
        this.b = j;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                av7 av7 = (av7) obj2;
                return ((av7) obj).c == this.b ? -1 : 0;
            default:
                long j = this.b;
                return gp0.f(new zp4(((pef) obj2).b(j)), new zp4(((pef) obj).b(j)));
        }
    }
}
