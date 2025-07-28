package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: k01  reason: default package */
public final class k01 extends l5e implements m26 {
    public /* synthetic */ boolean X;
    public /* synthetic */ boolean Y;
    public /* synthetic */ ea Z;

    /* JADX WARNING: type inference failed for: r3v2, types: [l5e, k01] */
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        ? l5e = new l5e(4, (Continuation) obj4);
        l5e.X = booleanValue;
        l5e.Y = booleanValue2;
        l5e.Z = (ea) obj3;
        return l5e.o(jue.a);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        boolean z = this.X;
        boolean z2 = this.Y;
        ea eaVar = this.Z;
        boolean z3 = false;
        if ((eaVar.a || eaVar.c) && z && z2) {
            z3 = true;
        }
        return Boolean.valueOf(z3);
    }
}
