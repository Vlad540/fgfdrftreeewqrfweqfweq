package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: vsd  reason: default package */
public final /* synthetic */ class vsd implements j26, of3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zsd b;

    public /* synthetic */ vsd(zsd zsd, int i) {
        this.a = i;
        this.b = zsd;
    }

    public void accept(Object obj) {
        this.b.e((List) obj);
    }

    public Object apply(Object obj) {
        zsd zsd = this.b;
        int i = this.a;
        List<f2c> list = (List) obj;
        zsd.getClass();
        switch (i) {
            case 0:
                ArrayList arrayList = new ArrayList();
                for (f2c f2c : list) {
                    if (f2c instanceof utd) {
                        arrayList.add(Long.valueOf(((utd) f2c).c));
                    }
                }
                ArrayList c = zsd.c(arrayList);
                if (!c.isEmpty()) {
                    zsd.d(c).e();
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Long l = (Long) it.next();
                    l.getClass();
                    osd osd = (osd) zsd.a.get(l);
                    if (osd != null) {
                        arrayList2.add(osd);
                    }
                }
                return arrayList2;
            default:
                udd.p("zsd", "loadNetworkStickersSingle: ids=%s", new Object[]{list});
                phd h = ((gy9) ((pk) zsd.f.get())).L(new dt(2, ek8.n(list)), zsd.g).h(new mb1(13, ht.class)).h(new xsd(5)).h(new xsd(6));
                lce lce = (lce) zsd.i.get();
                lce.getClass();
                return new mhd(h.j(new ice(lce, 2, 0)), new vsd(zsd, 2), 2);
        }
    }
}
