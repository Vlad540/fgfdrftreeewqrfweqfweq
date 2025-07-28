package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: kua  reason: default package */
public final class kua extends taf {
    public static final /* synthetic */ k77[] w0;
    public final t97 X;
    public final grd Y = hrd.a((Object) null);
    public final e3 Z = hwf.t();
    public final long b;
    public final dk8 c;
    public final dl8 o;

    static {
        hc9 hc9 = new hc9(kua.class, "searchJob", "getSearchJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        w0 = new k77[]{hc9};
    }

    public kua(long j, dk8 dk8, dl8 dl8, t97 t97) {
        this.b = j;
        this.c = dk8;
        this.o = dl8;
        this.X = t97;
        pk8 pk8 = (pk8) dk8;
        if (pk8.g.compareAndSet(false, true)) {
            xs7.E(pk8.f, (hu3) null, (ru3) null, new ok8(pk8, (Continuation) null), 3);
        }
        ez3.N(new ck5(((pk8) dl8).l, new hua(this, (Continuation) null), 5), this.a);
    }

    public static final ArrayList q(kua kua, List list) {
        kua.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            ira ira = (ira) next;
            i22 i22 = (i22) ((bv2) kua.X.getValue()).m(kua.b).a.getValue();
            if (i22 != null) {
                ArrayList i = i22.i();
                if (!i.isEmpty()) {
                    Iterator it = i.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((tf3) it.next()).n() == ira.a) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            arrayList.add(next);
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r4 = (i22) ((bv2) r4.X.getValue()).m(r2).a.getValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r() {
        /*
            r4 = this;
            r0 = 0
            long r2 = r4.b
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x002d
            t97 r4 = r4.X
            java.lang.Object r4 = r4.getValue()
            bv2 r4 = (bv2) r4
            aw2 r4 = (aw2) r4
            t0c r4 = r4.m(r2)
            zqd r4 = r4.a
            java.lang.Object r4 = r4.getValue()
            i22 r4 = (i22) r4
            if (r4 == 0) goto L_0x002d
            java.util.ArrayList r4 = r4.i()
            boolean r4 = r4.isEmpty()
            r0 = 1
            r4 = r4 ^ r0
            if (r4 != r0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r0 = 0
        L_0x002e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kua.r():boolean");
    }
}
