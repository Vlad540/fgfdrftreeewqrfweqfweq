package defpackage;

import android.view.LayoutInflater;

/* renamed from: hm  reason: default package */
public final class hm implements jx9 {
    public final /* synthetic */ im a;

    public hm(im imVar) {
        this.a = imVar;
    }

    public final void a() {
        im imVar = this.a;
        rm V = imVar.V();
        dn dnVar = (dn) V;
        LayoutInflater from = LayoutInflater.from(dnVar.z0);
        if (from.getFactory() == null) {
            from.setFactory2(dnVar);
        } else {
            boolean z = from.getFactory2() instanceof dn;
        }
        ((mm) imVar.o.o).c("androidx:appcompat");
        V.c();
    }
}
