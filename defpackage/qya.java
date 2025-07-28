package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* renamed from: qya  reason: default package */
public final class qya extends l5e implements i26 {
    public Long X;
    public int Y;
    public final /* synthetic */ sya Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qya(sya sya, Continuation continuation) {
        super(2, continuation);
        this.Z = sya;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new qya(this.Z, continuation);
    }

    public final Object o(Object obj) {
        Long l;
        pu3 pu3 = pu3.a;
        int i = this.Y;
        jue jue = jue.a;
        sya sya = this.Z;
        if (i == 0) {
            wx3.H(obj);
            ua9 n = ((nb9) sya.a).n();
            if (n == null) {
                return jue;
            }
            Object obj2 = n.c.get("MediaMetadata.Extra.MESSAGE_ID");
            Long l2 = obj2 instanceof Long ? (Long) obj2 : null;
            om3 om3 = qr4.b;
            grd grd = sya.e;
            if (l2 == null) {
                grd.m((Object) null, new x40((Long) null, 0.0f, om3));
                return jue;
            }
            AtomicReference atomicReference = sya.h;
            long longValue = l2.longValue();
            va9 va9 = sya.a;
            atomicReference.set(new bt0(longValue, ((nb9) va9).y));
            if (((nb9) va9).y) {
                this.X = l2;
                this.Y = 1;
                if (ek8.q(300, this) == pu3) {
                    return pu3;
                }
                l = l2;
            } else {
                if (!va9.b()) {
                    nb9 nb9 = (nb9) va9;
                    if (nb9.x) {
                        om3 = om3.a;
                    } else {
                        boolean z = nb9.w;
                        om3 om32 = m54.b;
                        if (z || nb9.v != 1) {
                            om3 = om32;
                        }
                    }
                }
                grd.m((Object) null, new x40(l2, ((Number) ((nb9) va9).H.a.getValue()).floatValue(), om3));
                return jue;
            }
        } else if (i == 1) {
            l = this.X;
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (((bt0) sya.h.get()).b) {
            long j = ((bt0) sya.h.get()).a;
            if (l != null && j == l.longValue()) {
                sya.e.m((Object) null, new x40(l, ((Number) ((nb9) sya.a).H.a.getValue()).floatValue(), zl3.a));
            }
        }
        return jue;
    }
}
