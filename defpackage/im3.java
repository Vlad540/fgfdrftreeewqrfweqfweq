package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: im3  reason: default package */
public final class im3 extends lbe {
    public final /* synthetic */ int c;
    public Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ im3(ws8 ws8, int i) {
        super(ws8);
        this.c = i;
    }

    public final void b(ws8 ws8, String str) {
        ArrayList arrayList;
        int i = 0;
        switch (this.c) {
            case 0:
                str.getClass();
                if (!str.equals("contactIds")) {
                    ws8.z();
                    return;
                }
                this.o = new ArrayList();
                int D = jjd.D(ws8);
                while (i < D) {
                    ((List) this.o).add(Long.valueOf(ws8.w0()));
                    i++;
                }
                return;
            case 1:
                str.getClass();
                if (!str.equals("mentions")) {
                    ws8.z();
                    return;
                } else {
                    this.o = zy.e(ws8);
                    return;
                }
            case 2:
                str.getClass();
                if (!str.equals("locations")) {
                    ws8.z();
                    return;
                }
                LinkedHashMap linkedHashMap = null;
                if (ws8.n().a() == 8) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    int x0 = ws8.x0();
                    for (int i2 = 0; i2 < x0; i2++) {
                        Long valueOf = Long.valueOf(jjd.J(ws8, 0));
                        if (ws8.n().a() == 7) {
                            arrayList = new ArrayList();
                            int s0 = ws8.s0();
                            for (int i3 = 0; i3 < s0; i3++) {
                                arrayList.add(em7.a(ws8));
                            }
                        } else {
                            ws8.z();
                            arrayList = null;
                        }
                        linkedHashMap2.put(valueOf, arrayList);
                    }
                    linkedHashMap = linkedHashMap2;
                } else {
                    ws8.z();
                }
                this.o = linkedHashMap;
                return;
            default:
                str.getClass();
                if (!str.equals("stats")) {
                    ws8.z();
                    return;
                }
                this.o = new HashMap();
                int K = jjd.K(ws8);
                while (i < K) {
                    ((Map) this.o).put(Long.valueOf(ws8.w0()), ks8.a(ws8));
                    i++;
                }
                return;
        }
    }

    public final String toString() {
        switch (this.c) {
            case 0:
                return rf0.f(ete.p((List) this.o), "{contactIds=", "}");
            case 1:
                return rf0.f(ete.p((zy) this.o), "Response{mentions=", "}");
            case 2:
                return "Response{locations=" + ((LinkedHashMap) this.o) + "}";
            default:
                return rf0.f(ete.R((Map) this.o), "{stats=", "}");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public im3(ws8 ws8) {
        super(ws8);
        this.c = 3;
        if (((Map) this.o) == null) {
            this.o = Collections.emptyMap();
        }
    }
}
