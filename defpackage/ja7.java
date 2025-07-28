package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import one.me.common.drawable.SavedMessagesIconDrawable;

/* renamed from: ja7  reason: default package */
public final class ja7 extends whd {
    public final /* synthetic */ int b;

    public /* synthetic */ ja7(int i) {
        this.b = i;
    }

    public final Object b(w4 w4Var) {
        w4 w4Var2 = w4Var;
        switch (this.b) {
            case 0:
                return new bbe((Context) w4Var2.c(Context.class), w4Var2.d(t52.class));
            case 1:
                return new f35((Context) w4Var2.c(Context.class), w4Var2.d(yae.class), w4Var2.d(bv0.class));
            case 2:
                mg5 mg5 = (bf5) w4Var2.c(bf5.class);
                mg5.getClass();
                return new lgd(mg5.g(mg5.b(), "videoCache"), new ba7());
            case 3:
                return new fd5(w4Var2.d(bd.class));
            case 4:
                return new xoa(w4Var2.d(a04.class), w4Var2.d(pk.class), (tt0) w4Var2.c(tt0.class), w4Var2.d(g2b.class), new r7e(new jq2(w4Var2, 6)), w4Var2.d(di3.class), w4Var2.d(nae.class), (g15) w4Var2.c(g15.class));
            case 5:
                return new ua3((Context) w4Var2.c(Context.class));
            case 6:
                return new la7(w4Var, (Context) w4Var2.c(Context.class), ((x4a) w4Var2.c(x4a.class)).b(), new nfc(18, (Object) w4Var2), new r7e(new jq2(w4Var2, 4)));
            case 7:
                qpc qpc = (ip) w4Var2.c(ip.class);
                return new o4a(ez3.d0(ez3.J(ez3.z(new ik5(am7.c(qpc.i), 11)), ((pae) w4Var2.c(pae.class)).c().getImmediate()), n1g.a(lp.a().plus((hu3) (ku3) y93.h.getValue())), ucd.a, a24.d(qpc.d("app.extra.text.size.mode", 1))));
            case 8:
                return new mib(w4Var2.d(Context.class));
            case 9:
                zf3 zf3 = (zf3) w4Var2.c(zf3.class);
                return new Object();
            case 10:
                return new bl7(w4Var2.d(pwc.class), w4Var2.d(mbe.class), w4Var2.d(ry.class));
            case 11:
                return new oa7(w4Var2);
            case 12:
                return new cla((Context) w4Var2.c(Context.class));
            case 13:
                return new zd((Context) w4Var2.c(Context.class), (cla) w4Var2.c(cla.class), (ka7) w4Var2.c(ka7.class));
            case 14:
                g2b g2b = (g2b) w4Var2.c(g2b.class);
                return new mm7((Context) w4Var2.c(Context.class), w4Var2.d(ua6.class), w4Var2.d(wa6.class));
            case 15:
                return bs7.b;
            case 16:
                return new wp2((tt0) w4Var2.c(tt0.class), (pae) w4Var2.c(pae.class));
            case 17:
                return new qp0((tr2) w4Var2.c(tr2.class), (f03) w4Var2.c(f03.class), (wp2) w4Var2.c(wp2.class), (pae) w4Var2.c(pae.class));
            case 18:
                return new SQLiteOpenHelper(((Context) w4Var2.c(Context.class)).getApplicationContext(), "exoplayer_internal.db", (SQLiteDatabase.CursorFactory) null, 1);
            case 19:
                return new i4a(w4Var2.d(ml4.class), w4Var2.d(cs7.class), w4Var2.d(mgd.class), (Context) w4Var2.c(Context.class));
            case SavedMessagesIconDrawable.SMALL_ICON_SIZE /*20*/:
                return new vw8(w4Var2);
            case 21:
                return (v24) w4Var2.c(y3a.class);
            case 22:
                return new xz9(w4Var2);
            case 23:
                r7e d = w4Var2.d(di3.class);
                w4Var2.d(t52.class);
                return new w6a((Context) w4Var2.c(Context.class), (g2b) w4Var2.c(g2b.class), (nu4) w4Var2.c(nu4.class), new lhd(22, w4Var2.d(pv3.class)), (xz9) w4Var2.c(xz9.class), (g15) w4Var2.c(g15.class), d, (dhe) w4Var2.c(dhe.class), (v6a) w4Var2.c(v6a.class), w4Var2.d(rj.class));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return new v6a(w4Var2.d(gj.class), w4Var2.d(pae.class), w4Var2.d(wv4.class), w4Var2.d(ap3.class), w4Var2.d(xzc.class), (Context) w4Var2.c(Context.class));
            case 25:
                return new g5a((Context) w4Var2.c(Context.class));
            case 26:
                return new p7a(w4Var2.d(o7a.class), w4Var2.d(um7.class), w4Var2.d(ydd.class), w4Var2.d(m14.class));
            case 27:
                ((q0a) w4Var2.c(q0a.class)).getClass();
                return new mg5((Context) w4Var2.c(Context.class));
            case 28:
                return new o6a((Context) w4Var2.c(Context.class), (g15) w4Var2.c(g15.class), (mg5) w4Var2.c(mg5.class), (xzc) w4Var2.c(xzc.class), (zz9) w4Var2.c(zz9.class), (knc) w4Var2.c(knc.class), (pae) w4Var2.c(pae.class));
            default:
                return (u98) w4Var2.c(o6a.class);
        }
    }
}
