package defpackage;

import java.util.ArrayList;

/* renamed from: i86  reason: default package */
public final class i86 extends lbe {
    public final /* synthetic */ int c;
    public ArrayList o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i86(ws8 ws8, int i) {
        super(ws8);
        this.c = i;
        switch (i) {
            case 1:
                super(ws8);
                if (this.o == null) {
                    this.o = new ArrayList();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void b(ws8 ws8, String str) {
        switch (this.c) {
            case 0:
                str.getClass();
                if (!str.equals("calls")) {
                    ws8.z();
                    return;
                }
                this.o = new ArrayList();
                int D = jjd.D(ws8);
                for (int i = 0; i < D; i++) {
                    this.o.add(y1f.a(ws8));
                }
                return;
            default:
                if (hhd.f(str, "members")) {
                    int D2 = jjd.D(ws8);
                    this.o = new ArrayList();
                    fz6 S = gwf.S(0, D2);
                    ArrayList arrayList = new ArrayList(q23.H(S, 10));
                    ez6 it = S.iterator();
                    while (it.c) {
                        it.a();
                        arrayList.add(bh2.a(ws8));
                    }
                    ArrayList arrayList2 = this.o;
                    if (arrayList2 == null) {
                        arrayList2 = null;
                    }
                    arrayList2.addAll(arrayList);
                    return;
                }
                ws8.z();
                return;
        }
    }

    public final String toString() {
        switch (this.c) {
            case 0:
                ArrayList arrayList = this.o;
                return "Response{calls=" + arrayList + "}";
            default:
                ArrayList arrayList2 = this.o;
                if (arrayList2 == null) {
                    arrayList2 = null;
                }
                return wn6.i("{members : [", o23.c0(arrayList2, (String) null, (String) null, (String) null, new u1c(26), 31), "]}");
        }
    }
}
