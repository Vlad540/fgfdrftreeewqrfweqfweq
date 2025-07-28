package defpackage;

import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* renamed from: wt2  reason: default package */
public final class wt2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ fu2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wt2(fu2 fu2, Continuation continuation) {
        super(2, continuation);
        this.Y = fu2;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((wt2) n((hq2) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        wt2 wt2 = new wt2(this.Y, continuation);
        wt2.X = obj;
        return wt2;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        hq2 hq2 = (hq2) this.X;
        if (fu2.q(this.Y, hq2)) {
            zb9 a = tq7.a();
            rg5 rg5 = new rg5(myc.M(new vqe(new es(2, hq2.a), new hd1(26)), x51.z0));
            while (rg5.hasNext()) {
                a.a(((Number) rg5.next()).longValue());
            }
            zb9 zb9 = this.Y.S0;
            long[] jArr = zb9.b;
            long[] jArr2 = zb9.a;
            int length = jArr2.length - 2;
            boolean z = false;
            if (length >= 0) {
                int i = 0;
                loop1:
                while (true) {
                    long j = jArr2[i];
                    if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        int i3 = 0;
                        while (true) {
                            if (i3 >= i2) {
                                if (i2 != 8) {
                                    break;
                                }
                            } else if ((255 & j) < 128 && (!a.d(jArr[(i << 3) + i3]))) {
                                z = true;
                                break loop1;
                            } else {
                                j >>= 8;
                                i3++;
                            }
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
            this.Y.S0 = a;
            if (!z) {
                Iterable iterable = (Iterable) this.Y.N0.a.getValue();
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (a.d(((y75) it.next()).a)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } else {
                this.Y.u();
            }
            fu2 fu2 = this.Y;
            fu2.M0.setValue(fu2.L0.getValue());
        } else {
            this.Y.S0 = tq7.a;
            this.Y.M0.m((Object) null, hw4.a);
        }
        return jue.a;
    }
}
