package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* renamed from: jd1  reason: default package */
public final class jd1 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ td1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jd1(td1 td1, Continuation continuation) {
        super(2, continuation);
        this.Y = td1;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((jd1) n((Map) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        jd1 jd1 = new jd1(this.Y, continuation);
        jd1.X = obj;
        return jd1;
    }

    public final Object o(Object obj) {
        Object value;
        hge hge;
        List list;
        wx3.H(obj);
        Map map = (Map) this.X;
        td1 td1 = this.Y;
        grd grd = td1.E0;
        do {
            value = grd.getValue();
            qa qaVar = (qa) value;
            hge = map.isEmpty() ? new hge(r1a.S1) : new dge(q1a.a, map.size());
            td1.Y.getClass();
            if (map.size() <= 5) {
                list = m54.g(map);
            } else {
                lg7 c = hwf.c();
                Iterator it = map.entrySet().iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i >= 0) {
                        Map.Entry entry = (Map.Entry) next;
                        if (i >= 5) {
                            c.add(new bze(new jge(r1a.T1, cs.g0(new Object[]{Integer.valueOf(map.size())}))));
                            break;
                        }
                        c.add(m54.j((le1) entry.getKey(), (vl1) entry.getValue()));
                        i = i2;
                    } else {
                        p23.G();
                        throw null;
                    }
                }
                list = hwf.a(c);
            }
            qaVar.getClass();
        } while (!grd.b(value, new qa(hge, list)));
        return jue.a;
    }
}
