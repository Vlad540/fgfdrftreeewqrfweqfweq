package defpackage;

import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* renamed from: h4a  reason: default package */
public final class h4a extends l5e implements i26 {
    public g4a X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ i4a w0;
    public final /* synthetic */ String x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h4a(i4a i4a, String str, Continuation continuation) {
        super(2, continuation);
        this.w0 = i4a;
        this.x0 = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h4a) n((d5b) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        h4a h4a = new h4a(this.w0, this.x0, continuation);
        h4a.Z = obj;
        return h4a;
    }

    public final Object o(Object obj) {
        d5b d5b;
        g4a g4a;
        Object obj2;
        pu3 pu3 = pu3.a;
        int i = this.Y;
        String str = this.x0;
        i4a i4a = this.w0;
        if (i == 0) {
            wx3.H(obj);
            d5b d5b2 = (d5b) this.Z;
            g4a = new g4a(str, d5b2);
            int i2 = i4a.f;
            ml4 a = i4a.a();
            a.getClass();
            a.e.add(g4a);
            long j = i4a.e;
            this.Z = d5b2;
            this.X = g4a;
            this.Y = 1;
            if (ek8.r(j, this) == pu3) {
                return pu3;
            }
            d5b = d5b2;
        } else if (i == 1) {
            g4a = this.X;
            d5b = (d5b) this.Z;
            wx3.H(obj);
        } else if (i == 2) {
            wx3.H(obj);
            return jue.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i3 = i4a.f;
        Iterator it = i4a.a().l.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (hhd.f(((zj4) obj2).a.a, str)) {
                break;
            }
        }
        if (obj2 == null) {
            a5b a5b = (a5b) d5b;
            a5b.getClass();
            a5b.i(new IllegalStateException("download not started after ".concat(zp4.j(i4a.e))));
        }
        zu4 zu4 = new zu4(i4a, 23, g4a);
        this.Z = null;
        this.X = null;
        this.Y = 2;
        if (at7.d(d5b, zu4, this) == pu3) {
            return pu3;
        }
        return jue.a;
    }
}
