package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: p73  reason: default package */
public final class p73 {
    public final Object a;
    public final pv1 b;
    public final k26 c;
    public final Object d;
    public final Throwable e;

    public p73(Object obj, pv1 pv1, k26 k26, Object obj2, Throwable th) {
        this.a = obj;
        this.b = pv1;
        this.c = k26;
        this.d = obj2;
        this.e = th;
    }

    public static p73 a(p73 p73, pv1 pv1, CancellationException cancellationException, int i) {
        Object obj = p73.a;
        if ((i & 2) != 0) {
            pv1 = p73.b;
        }
        pv1 pv12 = pv1;
        k26 k26 = p73.c;
        Object obj2 = p73.d;
        Throwable th = cancellationException;
        if ((i & 16) != 0) {
            th = p73.e;
        }
        p73.getClass();
        return new p73(obj, pv12, k26, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p73)) {
            return false;
        }
        p73 p73 = (p73) obj;
        return hhd.f(this.a, p73.a) && hhd.f(this.b, p73.b) && hhd.f(this.c, p73.c) && hhd.f(this.d, p73.d) && hhd.f(this.e, p73.e);
    }

    public final int hashCode() {
        int i = 0;
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        pv1 pv1 = this.b;
        int hashCode2 = (hashCode + (pv1 == null ? 0 : pv1.hashCode())) * 31;
        k26 k26 = this.c;
        int hashCode3 = (hashCode2 + (k26 == null ? 0 : k26.hashCode())) * 31;
        Object obj2 = this.d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        if (th != null) {
            i = th.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p73(Object obj, pv1 pv1, k26 k26, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : pv1, (i & 4) != 0 ? null : k26, (Object) null, (Throwable) (i & 16) != 0 ? null : cancellationException);
    }
}
