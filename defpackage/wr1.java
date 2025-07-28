package defpackage;

import android.hardware.camera2.TotalCaptureResult;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: wr1  reason: default package */
public final class wr1 implements zr1 {
    public final /* synthetic */ yr1 a;

    public wr1(yr1 yr1) {
        this.a = yr1;
    }

    public final ch7 a(TotalCaptureResult totalCaptureResult) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            arrayList.add(((zr1) it.next()).a(totalCaptureResult));
        }
        og7 b = ct0.b(arrayList);
        sr1 sr1 = new sr1(2);
        return ct0.N(b, new e3(sr1), pa2.j());
    }

    public final boolean b() {
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            if (((zr1) it.next()).b()) {
                return true;
            }
        }
        return false;
    }

    public final void c() {
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            ((zr1) it.next()).c();
        }
    }
}
