package defpackage;

import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: krc  reason: default package */
public final class krc extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ mrc Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public krc(mrc mrc, Continuation continuation) {
        super(2, continuation);
        this.Y = mrc;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((krc) n((grc) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        krc krc = new krc(this.Y, continuation);
        krc.X = obj;
        return krc;
    }

    public final Object o(Object obj) {
        hi2 hi2;
        wx3.H(obj);
        grc grc = (grc) this.X;
        boolean z = grc instanceof frc;
        mrc mrc = this.Y;
        if (z) {
            hi2 hi22 = mrc.o;
            li2 li2 = ((frc) grc).a;
            ki2 ki2 = (ki2) hi22.a;
            ki2.getClass();
            if (li2.a == ki2.i) {
                ki2.h = true;
                ki2.k = li2.X;
                ki2.c = li2.b;
                ki2.j = li2.o;
                ArrayList arrayList = ki2.f;
                arrayList.addAll(li2.c);
                if (ki2.k > 0) {
                    if (ki2.d == 0) {
                        ki2.d = 1;
                        if (1 + 1 <= arrayList.size() && ki2.g != null) {
                            ds8 ds8 = (ds8) arrayList.get(ki2.d - 1);
                        }
                    }
                    hi2 hi23 = ki2.g;
                    if (hi23 != null) {
                        hi23.d(ki2.d, ki2.k);
                    }
                    hi2 hi24 = ki2.g;
                    if (hi24 != null) {
                        hi24.e((ds8) arrayList.get(ki2.d - 1));
                    }
                }
                if (ki2.k == 0 && (hi2 = ki2.g) != null) {
                    hi2.f();
                }
            }
        } else if (grc instanceof erc) {
            hi2 hi25 = mrc.o;
            jh0 jh0 = ((erc) grc).a;
            ki2 ki22 = (ki2) hi25.a;
            if (jh0.a == ki22.i) {
                ki22.a();
                hi2 hi26 = ki22.g;
                if (hi26 != null) {
                    hi26.f();
                }
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return jue.a;
    }
}
