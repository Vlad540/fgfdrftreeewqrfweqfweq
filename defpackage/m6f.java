package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: m6f  reason: default package */
public final class m6f extends l5e implements i26 {
    public /* synthetic */ boolean X;

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return n(bool, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        l5e l5e = new l5e(2, continuation);
        l5e.X = ((Boolean) obj).booleanValue();
        return l5e;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        return Boolean.valueOf(this.X);
    }
}
