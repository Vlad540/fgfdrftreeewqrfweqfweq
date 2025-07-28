package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* renamed from: im9  reason: default package */
public final class im9 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ fm9 Z;
    public final /* synthetic */ km9 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public im9(long j, fm9 fm9, km9 km9, Continuation continuation) {
        super(2, continuation);
        this.Y = j;
        this.Z = fm9;
        this.w0 = km9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new im9(this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        km9 km9 = this.w0;
        fm9 fm9 = this.Z;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    wx3.H(obj);
                } else if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            wx3.H(obj);
            return jue;
        }
        wx3.H(obj);
        if (System.currentTimeMillis() - this.Y >= CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS) {
            udd.U("km9", "handle " + fm9);
        }
        ym8 ym8 = fm9.Y;
        int t = hr1.t(fm9.X);
        if (t != 0) {
            long j = fm9.c;
            if (t == 1) {
                ((em9) km9.b.getValue()).a(km9.b(km9, fm9), md4.DELAYED);
                if (ym8 != null && ym8.X == ms8.o) {
                    udd.U("km9", "delayed message has error status");
                    this.X = 1;
                    if (km9.a(km9, j, ym8, this) == pu3) {
                        return pu3;
                    }
                }
            } else if (t == 2) {
                udd.q("km9", "handle delete");
                this.X = 2;
                obj = km9.c(j, this);
                if (obj == pu3) {
                    return pu3;
                }
            } else if (t != 3) {
                if (t == 4) {
                    udd.U("km9", "handle unknown type! " + fm9);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (ym8 == null) {
                udd.U("km9", "message is null");
                return jue;
            } else {
                this.X = 3;
                if (km9.a(km9, j, ym8, this) == pu3) {
                    return pu3;
                }
            }
        } else {
            ((em9) km9.b.getValue()).a(km9.b(km9, fm9), md4.DELAYED);
        }
        return jue;
        i22 i22 = (i22) obj;
        if (i22 != null) {
            ((mm9) km9.c.getValue()).b(i22, fm9.Z, md4.DELAYED);
        }
        return jue;
    }
}
