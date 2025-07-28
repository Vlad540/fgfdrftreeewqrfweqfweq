package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: wsd  reason: default package */
public final /* synthetic */ class wsd implements j26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zsd b;
    public final /* synthetic */ List c;

    public /* synthetic */ wsd(zsd zsd, List list, int i) {
        this.a = i;
        this.b = zsd;
        this.c = list;
    }

    public final Object apply(Object obj) {
        List list = this.c;
        zsd zsd = this.b;
        int i = this.a;
        List list2 = (List) obj;
        zsd.getClass();
        switch (i) {
            case 0:
                return new phd(new ps9(ms9.j(list), new d52(23, list2), 1).v(), new wsd(zsd, list2, 1), 0);
            default:
                if (list2.isEmpty()) {
                    return dhd.g(list);
                }
                an5 a2 = an5.a(new dhd[]{dhd.g(list), zsd.d(list2)});
                fja.D(Integer.MAX_VALUE, "maxConcurrency");
                pn5 pn5 = new pn5(a2);
                ArrayList arrayList = new ArrayList();
                return new en5(pn5, new b36(arrayList), new xsd(4));
        }
    }
}
