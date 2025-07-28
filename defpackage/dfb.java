package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: dfb  reason: default package */
public final class dfb extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ s30 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dfb(s30 s30, Continuation continuation) {
        super(2, continuation);
        this.Y = s30;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((tf3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        dfb dfb = new dfb(this.Y, continuation);
        dfb.X = obj;
        return dfb;
    }

    public final Object o(Object obj) {
        Object obj2;
        wx3.H(obj);
        tf3 tf3 = (tf3) this.X;
        String str = tf3 != null ? tf3.a.c.c : null;
        CharSequence m = tf3 != null ? tf3.m() : null;
        long n = tf3 != null ? tf3.n() : 0;
        boolean z = false;
        if (!(!(str == null || str.length() == 0))) {
            if (m == null || ((String) m).length() == 0) {
                z = true;
            }
            if (!(!z)) {
                obj2 = cxa.a;
            } else if (m != null) {
                obj2 = new bxa(m, n);
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else if (str != null) {
            obj2 = new exa(str);
        } else {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        ((grd) this.Y.X).m((Object) null, obj2);
        return jue.a;
    }
}
