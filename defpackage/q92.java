package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: q92  reason: default package */
public final class q92 extends ol implements qce {
    public final Object X;
    public final /* synthetic */ int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q92(long j, Serializable serializable, int i) {
        super(j);
        this.o = i;
        this.X = serializable;
    }

    public final void c(lbe lbe) {
        List list;
        switch (this.o) {
            case 0:
                r92 r92 = (r92) lbe;
                zb9 c0 = m().c0(Collections.singletonList(r92.c));
                l().c(new mw2(c0));
                tt0 l = l();
                long[] jArr = c0.b;
                long[] jArr2 = c0.a;
                int length = jArr2.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr2[i];
                        if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    l.c(new s92(r92.c.b1, this.a, jArr[(i << 3) + i3], (String) this.X));
                                    return;
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                            }
                        }
                        if (i != length) {
                            i++;
                        }
                    }
                }
                throw new NoSuchElementException("The LongSet is empty");
            case 1:
                wj3 wj3 = (wj3) lbe;
                pl plVar = this.c;
                if (plVar == null) {
                    plVar = null;
                }
                ((zj3) plVar.N.getValue()).a(wj3, (long[]) this.X, this.a);
                return;
            default:
                h7e h7e = (h7e) lbe;
                pl plVar2 = this.c;
                if (plVar2 == null) {
                    plVar2 = null;
                }
                tt0 b = plVar2.b();
                List list2 = h7e.c;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (Object next : list2) {
                        try {
                            if (((uj3) next) != sj3.E0) {
                                arrayList.add(next);
                            }
                        } catch (Throwable th) {
                            throw new RuntimeException(th);
                        }
                    }
                    list = arrayList;
                } else {
                    list = Collections.emptyList();
                }
                b.c(new k7e(list, h7e.o, (HashMap) ((Map) this.X)));
                return;
        }
    }

    public final void d(uae uae) {
        switch (this.o) {
            case 0:
                l().c(new jh0(this.a, uae));
                return;
            case 1:
                pl plVar = this.c;
                if (plVar == null) {
                    plVar = null;
                }
                zj3 zj3 = (zj3) plVar.N.getValue();
                zj3.getClass();
                if ("not.found".equals(uae.b)) {
                    di3 di3 = (di3) zj3.b.getValue();
                    for (long o2 : (long[]) this.X) {
                        di3.o(o2);
                    }
                }
                ((tt0) zj3.a.getValue()).c(new jh0(this.a, uae));
                return;
            default:
                pl plVar2 = this.c;
                if (plVar2 == null) {
                    plVar2 = null;
                }
                plVar2.b().c(new jh0(this.a, uae));
                return;
        }
    }

    public final ibe i() {
        switch (this.o) {
            case 0:
                return new dt((String) this.X);
            case 1:
                pl plVar = this.c;
                if (plVar == null) {
                    plVar = null;
                }
                ((rf4) plVar.b.getValue()).e();
                return new pn2((long[]) this.X);
            default:
                bm9 bm9 = new bm9(dfa.SYNC, 13);
                HashMap hashMap = new HashMap();
                ((Map) this.X).forEach(new g03(1, hashMap));
                bm9.p("contactList", hashMap);
                return bm9;
        }
    }
}
