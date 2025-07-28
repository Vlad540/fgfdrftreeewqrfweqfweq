package defpackage;

import android.content.Context;
import java.util.Locale;
import kotlin.coroutines.Continuation;

/* renamed from: k78  reason: default package */
public final class k78 extends l5e implements i26 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ xm8 Y;
    public final /* synthetic */ r78 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k78(Object obj, Continuation continuation, xm8 xm8, r78 r78) {
        super(2, continuation);
        this.X = obj;
        this.Y = xm8;
        this.Z = r78;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new k78(this.X, continuation, this.Y, this.Z);
    }

    public final Object o(Object obj) {
        String obj2;
        wx3.H(obj);
        o10 o10 = (o10) this.X;
        l00 l00 = o10 != null ? o10.e : null;
        if (l00 == null) {
            return null;
        }
        long hashCode = (long) o10.q.hashCode();
        xm8 xm8 = this.Y;
        boolean z = xm8.b.Y;
        r78 r78 = this.Z;
        if (z) {
            obj2 = d8.u(r78.a, c7a.P);
        } else {
            o1b o1b = xm8.X;
            o1b.c(o1b.a.g());
            obj2 = o1b.h.toString();
        }
        String str = obj2;
        String a = d8.a(l00.c);
        Context context = r78.a;
        Locale u = ((lqc) r78.b).u();
        vo8 vo8 = xm8.a;
        return new jh8(hashCode, vo8.b, l00.a, o10.q, l00.b, str, me4.i(a, " · ", xs7.y(context, u, vo8.o, true)), r78.a.getString(c7a.Q), ((sya) r78.f.getValue()).e);
    }
}
