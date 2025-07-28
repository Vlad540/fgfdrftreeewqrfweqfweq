package defpackage;

import java.util.Objects;

/* renamed from: lx7  reason: default package */
public final class lx7 extends ms9 {
    public final /* synthetic */ int a;
    public final j26 b;
    public final Object c;

    public /* synthetic */ lx7(Object obj, j26 j26, int i) {
        this.a = i;
        this.c = obj;
        this.b = j26;
    }

    public final void q(bw9 bw9) {
        dhd dhd;
        switch (this.a) {
            case 0:
                kx7 kx7 = new kx7(bw9, this.b, 0);
                bw9.d(kx7);
                ((ay7) this.c).a(kx7);
                return;
            case 1:
                nv9 nv9 = (nv9) this.c;
                boolean z = nv9 instanceof q3e;
                j26 j26 = this.b;
                if (z) {
                    try {
                        Object obj = ((q3e) nv9).get();
                        if (obj != null) {
                            Object apply = j26.apply(obj);
                            Objects.requireNonNull(apply, "The mapper returned a null SingleSource");
                            dhd = (dhd) apply;
                        } else {
                            dhd = null;
                        }
                        if (dhd == null) {
                            cw4.a(bw9);
                            return;
                        } else {
                            dhd.k(new dy7(bw9, 1));
                            return;
                        }
                    } catch (Throwable th) {
                        ek8.a0(th);
                        cw4.b(th, bw9);
                        return;
                    }
                } else {
                    nv9.a(new zs9(bw9, j26));
                    return;
                }
            case 2:
                try {
                    Object apply2 = this.b.apply(this.c);
                    Objects.requireNonNull(apply2, "The mapper returned a null ObservableSource");
                    nv9 nv92 = (nv9) apply2;
                    if (nv92 instanceof q3e) {
                        try {
                            Object obj2 = ((q3e) nv92).get();
                            if (obj2 == null) {
                                cw4.a(bw9);
                                return;
                            }
                            lv9 lv9 = new lv9(bw9, obj2);
                            bw9.d(lv9);
                            lv9.run();
                            return;
                        } catch (Throwable th2) {
                            ek8.a0(th2);
                            cw4.b(th2, bw9);
                            return;
                        }
                    } else {
                        nv92.a(bw9);
                        return;
                    }
                } catch (Throwable th3) {
                    ek8.a0(th3);
                    cw4.b(th3, bw9);
                    return;
                }
            default:
                kx7 kx72 = new kx7(bw9, this.b, 1);
                bw9.d(kx72);
                ((dhd) this.c).k(kx72);
                return;
        }
    }
}
