package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: e59  reason: default package */
public final class e59 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ r59 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e59(r59 r59, Continuation continuation) {
        super(2, continuation);
        this.Z = r59;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((zb9) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        e59 e59 = new e59(this.Z, continuation);
        e59.Y = obj;
        return e59;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            zb9 zb9 = (zb9) this.Y;
            zb9 zb92 = new zb9(zb9.d);
            long[] jArr = zb9.b;
            long[] jArr2 = zb9.a;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr2[i2];
                    if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                zb92.a(jArr[(i2 << 3) + i4]);
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            r59 r59 = this.Z;
            List b = r59.b(zb92);
            int i5 = zp4.o;
            long P = mt0.P(10, eq4.o);
            this.X = 1;
            if (r59.j(P, b, this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
