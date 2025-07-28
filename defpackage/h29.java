package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: h29  reason: default package */
public final class h29 {
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 d;
    public final t97 e;

    public h29(t97 t97, t97 t972, t97 t973, t97 t974, t97 t975) {
        this.a = t97;
        this.b = t972;
        this.c = t973;
        this.d = t974;
        this.e = t975;
    }

    public static /* synthetic */ Object b(h29 h29, long j, CharSequence charSequence, Long l, jv5 jv5, Continuation continuation, int i) {
        if ((i & 8) != 0) {
            jv5 = null;
        }
        return h29.a(j, charSequence, l, jv5, false, continuation);
    }

    public final Object a(long j, CharSequence charSequence, Long l, jv5 jv5, boolean z, Continuation continuation) {
        Object U = xs7.U(((pae) this.a.getValue()).b(), new g29(this, j, charSequence, l, z, jv5, (Continuation) null), continuation);
        return U == pu3.a ? U : jue.a;
    }
}
