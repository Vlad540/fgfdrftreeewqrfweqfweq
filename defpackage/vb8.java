package defpackage;

import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: vb8  reason: default package */
public final class vb8 {
    public final nb8 a;
    public final int b;
    public final xb8 c;
    public final xb8 d;
    public final xb8 e;
    public final ArrayList f;
    public final WeakReference g;
    public final ch7 h = null;
    public boolean i = false;
    public boolean j = false;

    public vb8(ub8 ub8, xb8 xb8, nb8 nb8, int i2, xb8 xb82, ArrayList arrayList) {
        ArrayList arrayList2 = null;
        this.g = new WeakReference(ub8);
        this.d = xb8;
        this.a = nb8;
        this.b = i2;
        this.c = ub8.r;
        this.e = xb82;
        this.f = arrayList != null ? new ArrayList(arrayList) : arrayList2;
        ub8.m.postDelayed(new eq6(10, this), 15000);
    }

    public final void a() {
        ch7 ch7;
        yb8.b();
        if (!this.i && !this.j) {
            WeakReference weakReference = this.g;
            ub8 ub8 = (ub8) weakReference.get();
            nb8 nb8 = this.a;
            if (ub8 != null && ub8.z == this && ((ch7 = this.h) == null || !ch7.isCancelled())) {
                this.i = true;
                ub8.z = null;
                ub8 ub82 = (ub8) weakReference.get();
                int i2 = this.b;
                xb8 xb8 = this.c;
                if (ub82 != null && ub82.r == xb8) {
                    Message obtainMessage = ub82.m.obtainMessage(263, xb8);
                    obtainMessage.arg1 = i2;
                    obtainMessage.sendToTarget();
                    nb8 nb82 = ub82.s;
                    if (nb82 != null) {
                        nb82.h(i2);
                        ub82.s.d();
                    }
                    HashMap hashMap = ub82.v;
                    if (!hashMap.isEmpty()) {
                        for (nb8 nb83 : hashMap.values()) {
                            nb83.h(i2);
                            nb83.d();
                        }
                        hashMap.clear();
                    }
                    ub82.s = null;
                }
                ub8 ub83 = (ub8) weakReference.get();
                if (ub83 != null) {
                    xb8 xb82 = this.d;
                    ub83.r = xb82;
                    ub83.s = nb8;
                    sb8 sb8 = ub83.m;
                    xb8 xb83 = this.e;
                    if (xb83 == null) {
                        Message obtainMessage2 = sb8.obtainMessage(262, new yia(xb8, xb82));
                        obtainMessage2.arg1 = i2;
                        obtainMessage2.sendToTarget();
                    } else {
                        Message obtainMessage3 = sb8.obtainMessage(264, new yia(xb83, xb82));
                        obtainMessage3.arg1 = i2;
                        obtainMessage3.sendToTarget();
                    }
                    ub83.v.clear();
                    ub83.g();
                    ub83.k();
                    ArrayList arrayList = this.f;
                    if (arrayList != null) {
                        ub83.r.n(arrayList);
                    }
                }
            } else if (!this.i && !this.j) {
                this.j = true;
                if (nb8 != null) {
                    nb8.h(0);
                    nb8.d();
                }
            }
        }
    }
}
