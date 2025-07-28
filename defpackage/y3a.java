package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: y3a  reason: default package */
public final class y3a extends v24 {
    public static final /* synthetic */ k77[] f;
    public final t97 a;
    public boolean b = true;
    public final LinkedList c = new LinkedList();
    public final x3a d = new x3a(0, false);
    public e3 e;

    static {
        hc9 hc9 = new hc9(y3a.class, "router", "getRouter()Lone/me/sdk/arch/rootcontroller/RouterWrapper;");
        m7c.a.getClass();
        f = new k77[]{hc9};
    }

    public y3a(t97 t97) {
        this.a = t97;
    }

    public final ArrayList a() {
        ArrayList e2 = f().C().e();
        ArrayList arrayList = new ArrayList(q23.H(e2, 10));
        Iterator it = e2.iterator();
        while (it.hasNext()) {
            arrayList.add(new w3a((vgc) it.next()));
        }
        return arrayList;
    }

    public final int b() {
        if (!this.b) {
            return f().C().a.a.size();
        }
        List list = this.c;
        if (list.isEmpty()) {
            list = f().C().e();
        }
        return list.size();
    }

    public final void c(j34 j34) {
        vgc d2 = d(j34, !a().isEmpty());
        if (this.b) {
            this.c.add(d2);
            return;
        }
        f().C().R(d2);
        e3 e3Var = this.e;
        if (e3Var != null) {
            ((pv3) ((t97) e3Var.a).getValue()).getClass();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: wr3} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.vgc d(defpackage.j34 r4, boolean r5) {
        /*
            r3 = this;
            i34 r0 = r4.f
            java.lang.Object r0 = r0.a()
            one.me.sdk.arch.Widget r0 = (one.me.sdk.arch.Widget) r0
            r1 = 0
            vgc r0 = defpackage.n06.f(r0, r1, r1)
            java.lang.String r2 = r4.a
            r0.d(r2)
            if (r5 == 0) goto L_0x0047
            h34 r5 = defpackage.h34.c
            h34 r4 = r4.e
            if (r4 == r5) goto L_0x0047
            s16 r5 = r4.a
            java.lang.Object r5 = r5.invoke()
            boolean r2 = r5 instanceof defpackage.wr3
            if (r2 == 0) goto L_0x0027
            wr3 r5 = (defpackage.wr3) r5
            goto L_0x0028
        L_0x0027:
            r5 = r1
        L_0x0028:
            if (r5 != 0) goto L_0x002e
            ch r5 = r3.e()
        L_0x002e:
            r0.c(r5)
            s16 r4 = r4.b
            java.lang.Object r4 = r4.invoke()
            boolean r5 = r4 instanceof defpackage.wr3
            if (r5 == 0) goto L_0x003e
            r1 = r4
            wr3 r1 = (defpackage.wr3) r1
        L_0x003e:
            if (r1 != 0) goto L_0x0044
            ch r1 = r3.e()
        L_0x0044:
            r0.a(r1)
        L_0x0047:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y3a.d(j34, boolean):vgc");
    }

    public final ch e() {
        return ((jb5) this.a.getValue()).t() ? new pw7(0) : new wj6(0);
    }

    public final ygc f() {
        return this.d.z(f[0]);
    }

    public final void g(s16 s16) {
        this.b = true;
        s16.invoke();
        this.b = false;
        LinkedList linkedList = this.c;
        if (!linkedList.isEmpty()) {
            ArrayList e2 = f().C().e();
            ArrayList arrayList = new ArrayList();
            for (Object next : linkedList) {
                if (!((vgc) next).a.isDialog()) {
                    arrayList.add(next);
                }
            }
            ArrayList i0 = o23.i0(e2, arrayList);
            ArrayList e3 = f().S().e();
            ArrayList arrayList2 = new ArrayList();
            for (Object next2 : linkedList) {
                if (((vgc) next2).a.isDialog()) {
                    arrayList2.add(next2);
                }
            }
            ArrayList i02 = o23.i0(e3, arrayList2);
            linkedList.clear();
            wr3 wr3 = null;
            f().S().P(i02, (wr3) null);
            sgc C = f().C();
            vgc vgc = (vgc) o23.f0(i0);
            if (vgc != null) {
                wr3 = vgc.b();
            }
            C.P(i0, wr3);
        }
    }
}
