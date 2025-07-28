package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: sm3  reason: default package */
public class sm3 extends ol implements qce {
    public final long X;
    public final Object Y;
    public final /* synthetic */ int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sm3(int i, long j, long j2, Object obj) {
        super(j);
        this.o = i;
        this.X = j2;
        this.Y = obj;
    }

    private final void v(lbe lbe) {
    }

    public void c(lbe lbe) {
        switch (this.o) {
            case 0:
                tm3 tm3 = (tm3) lbe;
                pl plVar = null;
                if (this.X > 0) {
                    Map map = tm3.c;
                    pl plVar2 = this.c;
                    if (plVar2 == null) {
                        plVar2 = null;
                    }
                    map.put(Long.valueOf(((lqc) ((f03) plVar2.e.getValue())).s()), m2b.c);
                }
                pl plVar3 = this.c;
                if (plVar3 != null) {
                    plVar = plVar3;
                }
                ((q2b) plVar.M.getValue()).h(tm3.o, fu7.n(tm3.c));
                t52 m = m();
                Map map2 = tm3.c;
                m.getClass();
                ArrayList arrayList = new ArrayList(map2.keySet());
                udd.q("t52", "invalidateChatsContacts, contactsIds.size() = " + arrayList.size());
                for (i22 i22 : m.D(t52.I)) {
                    ArrayList i = i22.i();
                    ArrayList arrayList2 = new ArrayList(i.size());
                    Iterator it = i.iterator();
                    while (it.hasNext()) {
                        try {
                            arrayList2.add(Long.valueOf(((tf3) it.next()).n()));
                        } catch (Throwable th) {
                            throw new RuntimeException(th);
                        }
                    }
                    if (!Collections.disjoint(arrayList, arrayList2)) {
                        i22.l0((di3) m.r.get());
                    }
                }
                return;
            case 1:
                u((r89) lbe);
                return;
            default:
                return;
        }
    }

    public void d(uae uae) {
        switch (this.o) {
            case 0:
                l().c(new jh0(this.a, uae));
                return;
            case 1:
                pl plVar = this.c;
                if (plVar == null) {
                    plVar = null;
                }
                plVar.b().c(new t89(this.a, uae, this.X, (List) this.Y));
                return;
            default:
                l().c(new jh0(this.a, uae));
                return;
        }
    }

    public final ibe i() {
        switch (this.o) {
            case 0:
                pn2 pn2 = new pn2((dfa) null, 9);
                long[] jArr = (long[]) this.Y;
                if (jArr != null) {
                    pn2.i("contactIds", jArr);
                }
                long j = this.X;
                if (j > 0) {
                    pn2.n(j, "sync");
                }
                return pn2;
            case 1:
                return new pn2(this.X, (List) this.Y);
            default:
                long j2 = this.X;
                if (j2 == 0) {
                    return null;
                }
                e00 e00 = (e00) this.Y;
                String str = e00 != null ? e00.a : null;
                ibe ibe = new ibe((dfa) null);
                ibe.n(j2, ApiProtocol.PARAM_CHAT_ID);
                if (str != null) {
                    ibe.s("type", str);
                }
                return ibe;
        }
    }

    public void u(r89 r89) {
        i22 i22;
        r89 r892 = r89;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (ym8 ym8 : r892.o) {
            if (ym8.X != ms8.c) {
                arrayList2.add(ym8);
                arrayList.add(Long.valueOf(ym8.a));
            }
        }
        pl plVar = null;
        if (!arrayList2.isEmpty()) {
            pl plVar2 = this.c;
            if (plVar2 == null) {
                plVar2 = null;
            }
            i22 y = plVar2.c().y(r892.c);
            if (y != null) {
                pl plVar3 = this.c;
                if (plVar3 == null) {
                    plVar3 = null;
                }
                to8 d = plVar3.d();
                List list = r892.o;
                pl plVar4 = this.c;
                if (plVar4 == null) {
                    plVar4 = null;
                }
                d.g(y.a, ((j2b) ((g2b) plVar4.c.getValue())).a.s(), list);
            }
            i22 = y;
        } else {
            i22 = null;
        }
        pl plVar5 = this.c;
        if (plVar5 == null) {
            plVar5 = null;
        }
        plVar5.b().c(new u89(this.a, this.X, arrayList, r892.o, (List) this.Y));
        if (i22 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ym8 ym82 = (ym8) it.next();
                pl plVar6 = this.c;
                if (plVar6 == null) {
                    plVar6 = null;
                }
                vo8 j = plVar6.d().j(i22.a, ym82.a);
                if (j != null) {
                    pl plVar7 = this.c;
                    if (plVar7 == null) {
                        plVar7 = null;
                    }
                    plVar7.b().c(new ove(i22.a, j.b, 0));
                }
            }
        }
        pl plVar8 = this.c;
        if (plVar8 != null) {
            plVar = plVar8;
        }
        o1d.y((luf) plVar.g.getValue());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sm3(long j, long[] jArr, long j2) {
        super(j);
        this.o = 0;
        this.Y = jArr;
        this.X = j2;
    }
}
