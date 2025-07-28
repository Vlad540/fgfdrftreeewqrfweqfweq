package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: tf0  reason: default package */
public final class tf0 extends l5e implements k26 {
    public /* synthetic */ boolean X;

    /* JADX WARNING: type inference failed for: r1v2, types: [l5e, tf0] */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        gf0 gf0 = (gf0) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        ? l5e = new l5e(3, (Continuation) obj3);
        l5e.X = booleanValue;
        return l5e.o(jue.a);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        return Boolean.valueOf(this.X);
    }
}
