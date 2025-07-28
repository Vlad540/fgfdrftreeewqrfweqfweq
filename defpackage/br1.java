package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: br1  reason: default package */
public final /* synthetic */ class br1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lr1 b;
    public final /* synthetic */ List c;

    public /* synthetic */ br1(lr1 lr1, ArrayList arrayList, int i) {
        this.a = i;
        this.b = lr1;
        this.c = arrayList;
    }

    public final void run() {
        ul7 ul7;
        switch (this.a) {
            case 0:
                lr1 lr1 = this.b;
                List<s80> list = this.c;
                lr1.getClass();
                ArrayList arrayList = new ArrayList();
                boolean z = false;
                boolean z2 = false;
                for (s80 s80 : list) {
                    if (lr1.a.B(s80.a)) {
                        ((LinkedHashMap) lr1.a.b).remove(s80.a);
                        arrayList.add(s80.a);
                        if (s80.b == b3b.class) {
                            z2 = true;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    TextUtils.join(", ", arrayList);
                    lr1.toString();
                    if (z2) {
                        lr1.Z.h.e = null;
                    }
                    lr1.q();
                    if (lr1.a.u().isEmpty()) {
                        lr1.Z.l.c = false;
                    } else {
                        lr1.L();
                    }
                    if (lr1.a.t().isEmpty()) {
                        lr1.Z.q();
                        lr1.D();
                        lr1.Z.y(false);
                        lr1.A0 = lr1.z();
                        lr1.toString();
                        switch (hr1.t(lr1.W0)) {
                            case 3:
                                if (lr1.y0 == null) {
                                    z = true;
                                }
                                e07.p((String) null, z);
                                lr1.F(3);
                                return;
                            case 5:
                            case 6:
                            case 7:
                                if (lr1.w0.a() || ((ul7 = (ul7) lr1.V0.a) != null && !((AtomicBoolean) ul7.b).get())) {
                                    z = true;
                                }
                                lr1.V0.i();
                                lr1.F(5);
                                if (z) {
                                    e07.p((String) null, lr1.B0.isEmpty());
                                    lr1.s();
                                    return;
                                }
                                return;
                            case 8:
                            case 9:
                                lr1.F(5);
                                lr1.r();
                                return;
                            default:
                                lr1.toString();
                                return;
                        }
                    } else {
                        lr1.K();
                        lr1.D();
                        if (lr1.W0 == 9) {
                            lr1.B();
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            default:
                List list2 = this.c;
                lr1 lr12 = this.b;
                zq1 zq1 = lr12.Z;
                try {
                    lr12.H((ArrayList) list2);
                    return;
                } finally {
                    zq1.q();
                }
        }
    }
}
