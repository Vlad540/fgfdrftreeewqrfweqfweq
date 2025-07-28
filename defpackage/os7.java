package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/* renamed from: os7  reason: default package */
public final /* synthetic */ class os7 implements of3, j26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vs7 b;

    public /* synthetic */ os7(vs7 vs7, int i) {
        this.a = i;
        this.b = vs7;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                vs7 vs7 = this.b;
                vs7.getClass();
                vs7.n = ((us7) obj).c;
                return;
            default:
                Throwable th = (Throwable) obj;
                vs7 vs72 = this.b;
                vs72.getClass();
                udd.s("vs7", "searchMessages: exception", th);
                vs72.g.a(th);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r13v6, types: [xib, java.lang.Object, lbe] */
    public Object apply(Object obj) {
        switch (this.a) {
            case 2:
                vs7 vs7 = this.b;
                xib xib = (xib) obj;
                vs7.getClass();
                List list = xib.c;
                List list2 = vs7.n;
                vj9 vj9 = gsc.b;
                list.removeAll((List) list.stream().filter(new esc(list2, (List) list2.stream().filter(new ei3(3)).map(new fi3(6)).collect(Collectors.toList()), (List) list2.stream().filter(new ei3(4)).map(new fi3(7)).collect(Collectors.toList()), 1)).collect(Collectors.toList()));
                int i = xib.o;
                Long l = xib.X;
                ? lbe = new lbe();
                lbe.c = list;
                lbe.o = i;
                lbe.X = l;
                return lbe;
            default:
                on2 on2 = (on2) obj;
                vs7 vs72 = this.b;
                vs72.getClass();
                List<ds8> list3 = on2.c;
                ArrayList arrayList = new ArrayList(list3.size());
                for (ds8 ds8 : list3) {
                    try {
                        ym8 ym8 = ds8.b;
                        List list4 = ds8.o;
                        arrayList.add(new prc(3, ds8.c, (ArrayList) list4, (i22) null, (tf3) null, ym8, ds8.a, (yib) null));
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
                String str = on2.X;
                if (str == null || !str.equals("0")) {
                    vs72.r = on2.X;
                } else {
                    vs72.r = null;
                }
                return arrayList;
        }
    }
}
