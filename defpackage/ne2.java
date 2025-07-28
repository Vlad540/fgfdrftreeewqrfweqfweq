package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ne2  reason: default package */
public final class ne2 extends l5e implements i26 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ rh8 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ long w0;
    public final /* synthetic */ gf2 x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ne2(Object obj, Continuation continuation, rh8 rh8, long j, long j2, gf2 gf2) {
        super(2, continuation);
        this.X = obj;
        this.Y = rh8;
        this.Z = j;
        this.w0 = j2;
        this.x0 = gf2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ne2(this.X, continuation, this.Y, this.Z, this.w0, this.x0);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        o10 o10 = (o10) this.X;
        j10 j10 = o10.a;
        int i = j10 == null ? -1 : me2.$EnumSwitchMapping$0[j10.ordinal()];
        rh8 rh8 = this.Y;
        if (i == 1) {
            a10 a10 = o10.b;
            if (a10 != null) {
                if (a10.w0 == rh8.h()) {
                    return null;
                }
            }
            return mk9.g(o10, this.Z, this.w0, false, 24);
        } else if (i == 2) {
            n10 n10 = o10.d;
            if (n10 != null) {
                if (n10.a == rh8.h()) {
                    return null;
                }
            }
            return mk9.g(o10, this.Z, this.w0, this.x0.D0.u(), 8);
        } else if (i == 3) {
            f10 f10 = o10.g;
            if (f10 != null) {
                if (f10.a == rh8.h()) {
                    return null;
                }
            }
            return mk9.g(o10, this.Z, this.w0, false, 24);
        } else if (i != 4) {
            return mk9.g(o10, this.Z, this.w0, false, 24);
        } else {
            v00 v00 = o10.j;
            if (v00 != null) {
                if (v00.a == rh8.h()) {
                    return null;
                }
            }
            return mk9.g(o10, this.Z, this.w0, false, 24);
        }
    }
}
