package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: jmf  reason: default package */
public final class jmf extends l5e implements m26 {
    public /* synthetic */ String X;
    public /* synthetic */ boolean Y;
    public /* synthetic */ lmf Z;

    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        l5e l5e = new l5e(4, (Continuation) obj4);
        l5e.X = (String) obj;
        l5e.Y = booleanValue;
        l5e.Z = (lmf) obj3;
        return l5e.o(jue.a);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        return new pmf(this.X, this.Y, this.Z);
    }
}
