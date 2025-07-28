package defpackage;

import android.os.Bundle;

/* renamed from: f88  reason: default package */
public final /* synthetic */ class f88 implements Runnable {
    public final /* synthetic */ Bundle X;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ue b;
    public final /* synthetic */ r38 c;
    public final /* synthetic */ String o;

    public /* synthetic */ f88(ue ueVar, r38 r38, String str, Bundle bundle) {
        this.b = ueVar;
        this.c = r38;
        this.o = str;
        this.X = bundle;
    }

    public final void run() {
        String str;
        v1d v1d;
        switch (this.a) {
            case 0:
                ue ueVar = this.b;
                ((e88) ueVar.d).getClass();
                ((y44) ueVar.g).execute(new f88(ueVar, this.c, this.o, this.X));
                return;
            default:
                this.b.getClass();
                r38 r38 = this.c;
                r38.K();
                q38 q38 = r38.c;
                rue g = (!q38.isConnected() ? w1d.b : q38.Q0()).a.iterator();
                while (true) {
                    boolean hasNext = g.hasNext();
                    str = this.o;
                    if (hasNext) {
                        v1d = (v1d) g.next();
                        if (v1d.a != 0 || !v1d.b.equals(str)) {
                        }
                    } else {
                        v1d = null;
                    }
                }
                if (v1d != null) {
                    r38.K();
                    w1d Q0 = !q38.isConnected() ? w1d.b : q38.Q0();
                    Q0.getClass();
                    if (Q0.a.contains(v1d)) {
                        v1d v1d2 = new v1d(str, this.X);
                        Bundle bundle = Bundle.EMPTY;
                        r38.K();
                        ch7 S0 = q38.isConnected() ? q38.S0(v1d2, bundle) : swb.A(new p2d(-100));
                        S0.c(new p36((Object) S0, 0, (Object) new kh6(str)), lh4.a);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ f88(ue ueVar, kc8 kc8, String str, Bundle bundle, r38 r38) {
        this.b = ueVar;
        this.o = str;
        this.X = bundle;
        this.c = r38;
    }
}
