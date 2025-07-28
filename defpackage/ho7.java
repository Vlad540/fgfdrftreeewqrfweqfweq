package defpackage;

import android.content.Context;
import java.io.File;
import java.util.HashMap;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.android.externcalls.sdk.stat.start.ConversationStartedStat;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ho7  reason: default package */
public final class ho7 extends wcc {
    public final /* synthetic */ int b;

    public /* synthetic */ ho7(int i) {
        this.b = i;
    }

    /* JADX WARNING: type inference failed for: r9v15, types: [uf7, java.lang.Object] */
    public final Object b(w4 w4Var) {
        switch (this.b) {
            case 0:
                return new c70(w4Var.d(bd.class), w4Var.d(f03.class), w4Var.d(xg9.class));
            case 1:
                Context context = (Context) w4Var.c(Context.class);
                t74 t74 = new t74();
                synchronized (t74) {
                    t74.a = true;
                }
                n94 n94 = new n94(context, t74);
                nz3 e18 = new e18(w4Var);
                n94.b = e18;
                pd pdVar = n94.a;
                if (e18 != ((nz3) pdVar.X)) {
                    pdVar.X = e18;
                    ((HashMap) pdVar.c).clear();
                    ((HashMap) pdVar.o).clear();
                }
                return n94;
            case 2:
                return new h84();
            case 3:
                return new ml4((Context) w4Var.c(Context.class), (c04) w4Var.c(rod.class), (av0) w4Var.c(mgd.class), (nz3) w4Var.c(h84.class), ((x4a) w4Var.c(x4a.class)).b());
            case 4:
                return new mgd(new File(hr1.g(((Context) w4Var.c(Context.class)).getCacheDir().getAbsolutePath(), "/media")), new da7(ju7.T(new wia[]{new wia(m68.X, 524288000L), new wia(m68.c, 52428800L)})), (c04) w4Var.c(rod.class), false);
            case 5:
                return new xi8((tt0) w4Var.c(tt0.class), (pae) w4Var.c(pae.class));
            case 6:
                return new o94(w4Var.d(o2b.class), w4Var.d(f03.class), w4Var.d(s2b.class));
            case 7:
                return new ww8(w4Var);
            case 8:
                return new y76(0);
            case 9:
                return new h29(w4Var.d(pae.class), w4Var.d(luf.class), w4Var.d(g86.class), w4Var.d(gw8.class), w4Var.d(m86.class));
            case 10:
                return new b4a((Context) w4Var.c(Context.class), (o54) w4Var.c(o54.class));
            case 11:
                return new ji(new fi(), (Context) w4Var.c(Context.class));
            case Protos.Attaches.Attach.PRESENT /*12*/:
                ? obj = new Object();
                obj.a = "https";
                obj.b = "max";
                obj.c = "api.oneme.ru";
                obj.d = "443";
                obj.e = "max.ru";
                obj.f = "api-test.oneme.ru";
                obj.g = "api-tg.oneme.ru";
                obj.h = "api";
                obj.i = "chat";
                obj.j = ConversationStartedStat.CALL_TYPE_JOIN;
                obj.k = ConversationStartedStat.CALL_TYPE_JOIN;
                obj.l = "joincall";
                obj.m = "u";
                obj.n = "stickerset";
                obj.o = "startapp";
                obj.p = ":folder";
                return new gg7(obj);
            case 13:
                return new z5a((Context) w4Var.c(Context.class), w4Var.d(al.class));
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new f0a(w4Var);
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return (v29) w4Var.c(ebe.class);
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK /*16*/:
                return new y1a((pae) w4Var.c(pae.class), w4Var.d(gj.class), (ku3) w4Var.c(ku3.class));
            case LangUtils.HASH_SEED /*17*/:
                return new t1a(w4Var.d(aqc.class));
            case 18:
                return new m86(w4Var.d(w6a.class), w4Var.d(bv2.class), w4Var.d(bd.class));
            case 19:
                return new yr4(w4Var.d(m86.class), w4Var.d(b29.class), w4Var.d(pae.class), w4Var.d(luf.class));
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /*20*/:
                return new zu5(w4Var.d(luf.class), w4Var.d(g86.class), w4Var.d(m86.class));
            case 21:
                return new iv5(w4Var.d(g86.class), w4Var.d(luf.class), w4Var.d(m86.class));
            case 22:
                return new g86(w4Var.d(pae.class), w4Var.d(bv2.class), w4Var.d(sk7.class));
            case 23:
                return new l1c((Context) w4Var.c(Context.class));
            case 24:
                return new h7a((Context) w4Var.c(Context.class), w4Var.d(g2b.class), w4Var.d(mg5.class), w4Var.d(b4a.class), w4Var.d(zm9.class));
            case 25:
                return new Object();
            case 26:
                return new vva((tt0) w4Var.c(tt0.class), (pae) w4Var.c(pae.class));
            case 27:
                return new okc(w4Var.d(b29.class), w4Var.d(x2f.class), w4Var.d(pae.class));
            case 28:
                return new r43((tt0) w4Var.c(tt0.class), (pae) w4Var.c(pae.class), w4Var.d(sk7.class));
            default:
                return new pab((tt0) w4Var.c(tt0.class), (pae) w4Var.c(pae.class));
        }
    }
}
