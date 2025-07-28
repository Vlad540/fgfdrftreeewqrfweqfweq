package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: j3e  reason: default package */
public final /* synthetic */ class j3e implements of3, h2e {
    public final /* synthetic */ k3e a;

    public /* synthetic */ j3e(k3e k3e) {
        this.a = k3e;
    }

    public List a() {
        k3e k3e = this.a;
        ArrayList i = k3e.n.i();
        ((kn3) k3e.m.getValue()).b(i);
        return i;
    }

    public void accept(Object obj) {
        l32 l32 = (l32) obj;
        k3e k3e = this.a;
        k3e.getClass();
        ap0 ap0 = new ap0(l32.c, l32.o);
        long j = k3e.n.a;
        zo0 zo0 = k3e.d;
        zo0.getClass();
        tic.a(new y5(zo0, j, ap0), (qmc) tic.a.b, (j6) null, new ak0(3), (qmc) null);
        List list = l32.c;
        HashMap hashMap = l32.o;
        gvf gvf = k3e.f;
        gvf.getClass();
        Collection emptyList = list == null ? Collections.emptyList() : ek8.M(list, new j9(gvf, 3, hashMap));
        synchronized (k3e) {
            k3e.p.clear();
            k3e.p.addAll(emptyList);
        }
    }
}
