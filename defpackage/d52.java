package defpackage;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.nano.Protos;

/* renamed from: d52  reason: default package */
public final /* synthetic */ class d52 implements of3, v1b, kh7, lh7, j26, le8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ d52(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public void accept(Object obj) {
        List<Long> list = this.b;
        switch (this.a) {
            case 0:
                y52 y52 = (y52) obj;
                for (Long put : list) {
                    y52.d().put(put, 0L);
                }
                return;
            case 1:
                y52 y522 = (y52) obj;
                for (Long remove : list) {
                    y522.d().remove(remove);
                }
                return;
            case 2:
                y52 y523 = (y52) obj;
                y523.getClass();
                for (Long remove2 : list) {
                    y523.R.remove(remove2);
                }
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                udd.s("fa5", String.format(Locale.ENGLISH, "onAssetsUpdate: failed to store stickers %s", new Object[]{list}), (Throwable) obj);
                return;
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK /*16*/:
                udd.s("fa5", String.format(Locale.ENGLISH, "removeFromFavorites: failed: ids=%s", new Object[]{list}), (Throwable) obj);
                return;
            case 19:
                ((p10) obj).a = list;
                return;
            case 26:
                udd.u("lud", (Throwable) obj, "storeStickerSets: failed for sets = %s", new Object[]{list});
                return;
            default:
                udd.p("jee", "hasTasksByTypesInDb: tasks count=%d, for types=%s", new Object[]{(Long) obj, list});
                return;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 6:
                return new y63(1, new x85((ha5) obj, this.b, 0));
            case 7:
                return new y63(1, new x85((ha5) obj, this.b, 1));
            case 8:
                ha5 ha5 = (ha5) obj;
                ha5.getClass();
                return new y63(2, new ga5(ha5, this.b, 1));
            case 9:
                return new w63(((p95) obj).a(), 2, new d52(12, this.b));
            case 10:
                return new w63(((p95) obj).a(), 2, new d52(14, this.b));
            case 11:
                return new w63(((p95) obj).a(), 2, new d52(12, this.b));
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return new y63(1, new o95((y95) obj, this.b, 0));
            case 13:
                return new y63(1, new o95((y95) obj, this.b, 1));
            case Protos.Attaches.Attach.LOCATION /*14*/:
                y95 y95 = (y95) obj;
                y95.getClass();
                return new y63(2, new x95(y95, this.b, 1));
            case 21:
                b2c b2c = (b2c) obj;
                b2c.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append("SELECT * FROM recent WHERE recent_type IN (");
                List<r2c> list = this.b;
                int size = list.size();
                a06.e(sb, size);
                sb.append(") ORDER BY `recent_time` DESC");
                pec a2 = pec.a(size, sb.toString());
                int i = 1;
                for (r2c r2c : list) {
                    a2.j(i, (long) r2c.a);
                    i++;
                }
                z1c z1c = new z1c(b2c, a2, 4);
                return js.g(b2c.a, new String[]{"recent"}, z1c);
            case 22:
                return new ps9(new au9(ms9.j((List) obj), new lpa(12), 3), new d52(20, this.b), 1).v().n();
            default:
                mud mud = (mud) obj;
                mud.getClass();
                return new y63(2, new uh(mud, 24, this.b));
        }
    }

    public Object h(cd8 cd8, ic8 ic8, int i) {
        switch (this.a) {
            case LangUtils.HASH_SEED /*17*/:
                return cd8.k(ic8, this.b);
            default:
                return cd8.k(ic8, this.b);
        }
    }

    public void invoke(Object obj) {
        switch (this.a) {
            case 4:
                ((gya) obj).k(this.b);
                return;
            default:
                ((hya) obj).k(this.b);
                return;
        }
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 3:
                return !ek8.f(this.b, new f00(((ym8) obj).a, 10));
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /*20*/:
                return this.b.contains(((f2c) obj).a);
            case 23:
                return !((Boolean) new rs9(ms9.j(this.b), new ysd(0, (Long) obj)).e()).booleanValue();
            case 24:
                Map.Entry entry = (Map.Entry) obj;
                return this.b.contains(entry.getKey()) && entry.getValue() != null;
            default:
                return !((Boolean) new rs9(ms9.j(this.b), new ysd(1, (Long) obj)).e()).booleanValue();
        }
    }
}
