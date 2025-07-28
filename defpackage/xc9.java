package defpackage;

import android.media.MediaMuxer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: xc9  reason: default package */
public final class xc9 {
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public Object f;
    public Object g;

    public void a() {
        ArrayList arrayList = (ArrayList) this.g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            wc9 wc9 = (wc9) it.next();
            ((MediaMuxer) this.f).writeSampleData(wc9.a, wc9.b, wc9.c);
        }
        arrayList.clear();
    }

    public boolean b() {
        boolean z = this.d;
        boolean z2 = (z && this.a != -1) || (!z && this.a == -1);
        boolean z3 = this.e;
        return z2 && ((z3 && this.b != -1) || (!z3 && this.b == -1));
    }

    public void c() {
        this.a = -1;
        this.b = Integer.MIN_VALUE;
        this.c = false;
        this.d = false;
        this.e = false;
        int[] iArr = (int[]) this.f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
