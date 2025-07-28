package defpackage;

import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.nano.Protos;

/* renamed from: yz  reason: default package */
public final /* synthetic */ class yz implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ yz(int i) {
        this.a = i;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
            case 1:
                return ((vu5) obj2).w0 - ((vu5) obj).w0;
            case 2:
                return ((xu5) obj2).i - ((xu5) obj).i;
            case 3:
                gj0 gj0 = (gj0) obj;
                gj0 gj02 = (gj0) obj2;
                int compare = Integer.compare(gj0.c, gj02.c);
                return compare != 0 ? compare : gj0.b.compareTo(gj02.b);
            case 4:
                hj0 hj0 = (hj0) obj;
                hj0 hj02 = (hj0) obj2;
                int compare2 = Integer.compare(hj0.c, hj02.c);
                return compare2 != 0 ? compare2 : hj0.b.compareTo(hj02.b);
            case 5:
                int i = (((lp1) obj).d.c > ((lp1) obj2).d.c ? 1 : (((lp1) obj).d.c == ((lp1) obj2).d.c ? 0 : -1));
                if (i < 0) {
                    return 1;
                }
                return i == 0 ? 0 : -1;
            case 6:
                return Long.compare(((xm8) obj2).k(), ((xm8) obj).k());
            case 7:
                return Integer.compare(((sx1) obj2).b, ((sx1) obj).b);
            case 8:
                return Integer.compare(((tx1) obj2).b, ((tx1) obj).b);
            case 9:
                i22 i22 = (i22) obj;
                i22 i222 = (i22) obj2;
                int f = pfa.f(i222.b.a().e, i22.b.a().e);
                return f != 0 ? f : pfa.f(i222.n(), i22.n());
            case 10:
                i22 i223 = (i22) obj;
                i223.getClass();
                return pfa.f(((i22) obj2).n(), i223.n());
            case 11:
                int i2 = (((vo8) obj).b > ((vo8) obj2).b ? 1 : (((vo8) obj).b == ((vo8) obj2).b ? 0 : -1));
                if (i2 < 0) {
                    return -1;
                }
                return i2 == 0 ? 0 : 1;
            case Protos.Attaches.Attach.PRESENT:
                long j = ((vo8) obj2).o;
                long j2 = ((vo8) obj).o;
                if (j < j2) {
                    return -1;
                }
                return j2 == j ? 0 : 1;
            case 13:
                rg6 rg6 = (rg6) obj;
                rg6 rg62 = (rg6) obj2;
                int f2 = gp0.f(Long.valueOf(rg62.k()), Long.valueOf(rg6.k()));
                return f2 != 0 ? f2 : gp0.f(Long.valueOf(rg6.getId()), Long.valueOf(rg62.getId()));
            case Protos.Attaches.Attach.LOCATION:
                return hhd.p(((Long) obj2).longValue(), ((Long) obj).longValue());
            case Protos.Attaches.Attach.DAILY_MEDIA:
                un3 un3 = (un3) obj;
                un3 un32 = (un3) obj2;
                return 0;
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK:
                return Long.compare(((h62) obj).a, ((h62) obj2).a);
            case LangUtils.HASH_SEED:
                return ((vgc) obj2).f - ((vgc) obj).f;
            case 18:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 19:
                Integer num3 = (Integer) obj;
                Integer num4 = (Integer) obj2;
                if (num3.intValue() == -1) {
                    return num4.intValue() == -1 ? 0 : -1;
                }
                if (num4.intValue() == -1) {
                    return 1;
                }
                return num3.intValue() - num4.intValue();
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS:
                Integer num5 = (Integer) obj;
                Integer num6 = (Integer) obj2;
                kga kga = ac4.f;
                return 0;
            case 21:
                return Integer.compare(((ib4) ((List) obj).get(0)).Y, ((ib4) ((List) obj2).get(0)).Y);
            case 22:
                List list = (List) obj;
                List list2 = (List) obj2;
                return e63.g(yb4.c((yb4) Collections.max(list, new yz(28)), (yb4) Collections.max(list2, new yz(28)))).a(list.size(), list2.size()).c((yb4) Collections.max(list, new xb4(0)), (yb4) Collections.max(list2, new xb4(0)), new xb4(0)).f();
            case 23:
                return ((hb4) Collections.max((List) obj)).c((hb4) Collections.max((List) obj2));
            case 24:
                return ((gb4) Collections.max((List) obj)).c((gb4) Collections.max((List) obj2));
            case 25:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                return e63.g(zb4.c((zb4) Collections.max(list3, new yqf(1)), (zb4) Collections.max(list4, new yqf(1)))).a(list3.size(), list4.size()).c((zb4) Collections.max(list3, new xb4(1)), (zb4) Collections.max(list4, new xb4(1)), new xb4(1)).f();
            case 26:
                return ((rb4) ((List) obj).get(0)).c((rb4) ((List) obj2).get(0));
            case 27:
                return ((sb4) ((List) obj).get(0)).c((sb4) ((List) obj2).get(0));
            default:
                return yb4.c((yb4) obj, (yb4) obj2);
        }
    }
}
