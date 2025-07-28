package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: o60  reason: default package */
public final class o60 {
    public final ArrayList a = new ArrayList();
    public final grd b;
    public final t0c c;

    public o60() {
        grd a2 = hrd.a((Object) null);
        this.b = a2;
        this.c = new t0c(a2);
    }

    public final void a() {
        ArrayList arrayList = this.a;
        byte[] bArr = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            byte[] bArr2 = new byte[arrayList.size()];
            Iterator it = arrayList.iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    bArr2[i] = (byte) ((((Number) next).intValue() * 127) / 32768);
                    i = i2;
                } else {
                    p23.G();
                    throw null;
                }
            }
            bArr = bArr2;
        }
        this.b.setValue(bArr);
    }
}
