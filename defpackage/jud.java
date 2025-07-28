package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: jud  reason: default package */
public final /* synthetic */ class jud implements j26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lud b;
    public final /* synthetic */ List c;

    public /* synthetic */ jud(lud lud, List list, int i) {
        this.a = i;
        this.b = lud;
        this.c = list;
    }

    public final Object apply(Object obj) {
        List list = this.c;
        lud lud = this.b;
        int i = this.a;
        List list2 = (List) obj;
        lud.getClass();
        switch (i) {
            case 0:
                if (list2.isEmpty()) {
                    return dhd.g(list);
                }
                an5 a2 = an5.a(new dhd[]{dhd.g(list), lud.d(list2)});
                fja.D(Integer.MAX_VALUE, "maxConcurrency");
                pn5 pn5 = new pn5(a2);
                ArrayList arrayList = new ArrayList(list2.size() + list.size());
                return new en5(pn5, new b36(arrayList), new xsd(4));
            default:
                return new phd(new ps9(ms9.j(list), new d52(25, list2), 1).v(), new jud(lud, list2, 0), 0);
        }
    }
}
