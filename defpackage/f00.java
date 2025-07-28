package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.nano.Protos;

/* renamed from: f00  reason: default package */
public final /* synthetic */ class f00 implements of3, v1b, j26, nf3, vic {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ f00() {
        this.a = 19;
        this.b = 0;
    }

    public void accept(Object obj) {
        long j = this.b;
        switch (this.a) {
            case 0:
                urd.O((m00) obj, g10.o, j);
                return;
            case 1:
                y52 y52 = (y52) obj;
                y52.L = j;
                y52.M = false;
                return;
            case 2:
                y52 y522 = (y52) obj;
                f62 f62 = y522.p;
                if (f62 == null) {
                    f62 = f62.h;
                }
                e62 a2 = f62.a();
                a2.a = j;
                y522.p = new f62(a2);
                return;
            case 3:
                y52 y523 = (y52) obj;
                f62 f622 = y523.p;
                if (f622 == null) {
                    f622 = f62.h;
                }
                e62 a3 = f622.a();
                a3.e = j;
                y523.p = new f62(a3);
                return;
            case 4:
                ((y52) obj).x = j;
                return;
            case 5:
                y52 y524 = (y52) obj;
                if (y524.Y < j || j == 0) {
                    y524.Y = j;
                    return;
                }
                return;
            case 6:
                y52 y525 = (y52) obj;
                i62 i62 = y525.n;
                md4 md4 = md4.REGULAR;
                ArrayList n = oyb.n(i62, j, md4);
                y525.n.d(md4).clear();
                i62.e(md4);
                y525.n.d(md4).addAll(n);
                i62.e(md4);
                y525.Z = 0;
                b62 b62 = b62.f;
                y525.q = b62;
                y525.r = b62;
                y525.s = b62;
                y525.t = b62;
                y525.u = b62;
                y525.v = b62;
                y525.w = b62;
                n62 n62 = y525.b;
                if (n62 == n62.b || (n62 == n62.a && j == y525.k)) {
                    y525.j = 0;
                    y525.m = 0;
                    y525.q = null;
                    y525.r = null;
                    y525.u = null;
                    y525.t = null;
                    y525.s = null;
                    y525.v = null;
                    y525.w = null;
                    return;
                }
                return;
            case 7:
                ((y52) obj).f = j;
                return;
            case 8:
                y52 y526 = (y52) obj;
                f62 f623 = y526.p;
                if (f623 == null) {
                    f623 = f62.h;
                }
                e62 a4 = f623.a();
                a4.d = j;
                y526.p = new f62(a4);
                return;
            case 9:
                y52 y527 = (y52) obj;
                if (y527.Z < j) {
                    y527.Z = j;
                    return;
                }
                return;
            case 11:
                ((gi3) obj).t = j;
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                gi3 gi3 = (gi3) obj;
                gi3.j = 2;
                gi3.s = j;
                return;
            case 13:
                ((gi3) obj).r = j;
                return;
            case LangUtils.HASH_SEED /*17*/:
                Locale locale = Locale.ENGLISH;
                udd.s("l95", "loadFromMarker: failed to load from marker=" + j, (Throwable) obj);
                return;
            case 18:
                Locale locale2 = Locale.ENGLISH;
                udd.s("w95", "assetsUpdate: failed request, sync=" + j, (Throwable) obj);
                return;
            case 19:
                Locale locale3 = Locale.ENGLISH;
                udd.s("aa5", "assetsUpdate: failed request, sync=" + j, (Throwable) obj);
                return;
            case 22:
                Locale locale4 = Locale.ENGLISH;
                udd.s("fa5", "loadFromMarker: failed to load from marker=" + j, (Throwable) obj);
                return;
            case 23:
                ((qza) obj).seekTo(j);
                return;
            default:
                Locale locale5 = Locale.ENGLISH;
                udd.s("be9", "Can't load track for message " + j, (Throwable) obj);
                return;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new w63(((p95) obj).a(), 2, new u85(3, this.b, true));
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                List list = (List) obj;
                return list.isEmpty() ? dhd.g(Boolean.FALSE) : new rs9(new lx7(dhd.g(list), new dd9(3), 3), new f00(this.b, 16));
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /*20*/:
                List list2 = (List) obj;
                return list2.isEmpty() ? dhd.g(Boolean.FALSE) : new rs9(new lx7(dhd.g(list2), new dd9(3), 3), new f00(this.b, 21));
            case 24:
                et8 et8 = (et8) obj;
                et8.getClass();
                pec a2 = pec.a(1, "SELECT * FROM message_uploads WHERE message_id = ?");
                a2.j(1, this.b);
                return new ox7(new dt8(et8, a2, 1));
            case 26:
                Cursor cursor = (Cursor) obj;
                cursor.moveToNext();
                return new jje(cursor.getLong(0), this.b);
            default:
                yxe yxe = (yxe) obj;
                yxe.getClass();
                return new y63(2, new ma5(yxe, this.b, 4));
        }
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 10:
                return ((p89) ((zde) obj).f).Z == this.b;
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK /*16*/:
                return ((xtd) obj).a == this.b;
            case 21:
                return ((osd) obj).a == this.b;
            case 27:
                prc prc = (prc) obj;
                i22 i22 = prc.o;
                return i22 != null && i22.J() && prc.o.k().n() == this.b;
            default:
                return ((qxe) obj).b == this.b;
        }
    }

    public /* synthetic */ f00(long j, int i) {
        this.a = i;
        this.b = j;
    }
}
