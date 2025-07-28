package defpackage;

import android.app.Application;
import android.content.Context;
import android.util.TypedValue;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import one.me.common.drawable.SavedMessagesIconDrawable;
import ru.ok.messages.a;

/* renamed from: ia7  reason: default package */
public final class ia7 extends whd {
    public final /* synthetic */ int b;

    public /* synthetic */ ia7(int i) {
        this.b = i;
    }

    /* JADX WARNING: type inference failed for: r0v51, types: [wud, java.lang.Object] */
    public final Object b(w4 w4Var) {
        w4 w4Var2 = w4Var;
        switch (this.b) {
            case 0:
                return new wk7((tt0) w4Var2.c(tt0.class), (ku3) w4Var2.c(ku3.class), (g2b) w4Var2.c(j2b.class), (gl7) w4Var2.c(gl7.class), (pae) w4Var2.c(pae.class), ((Context) w4Var2.c(Context.class)).getContentResolver(), (bf5) w4Var2.c(bf5.class));
            case 1:
                return ((wk7) w4Var2.c(wk7.class)).f;
            case 2:
                return new l8f((Context) w4Var2.c(Context.class), (ed3) w4Var2.c(ed3.class), (oa7) w4Var2.c(oa7.class), (mbe) w4Var2.c(mbe.class), (j2b) w4Var2.c(j2b.class), (pk) w4Var2.c(pk.class), (lce) w4Var2.c(lce.class), (ad3) w4Var2.c(ad3.class), (tt0) w4Var2.c(tt0.class), (bf5) w4Var2.c(bf5.class));
            case 3:
                return vl.b();
            case 4:
                pk pkVar = (pk) w4Var2.c(pk.class);
                j86 j86 = (j86) w4Var2.c(j86.class);
                return new nb9((Context) w4Var2.c(Context.class), (xzc) w4Var2.c(xzc.class), (pae) w4Var2.c(pae.class), (mg5) w4Var2.c(mg5.class), (to8) w4Var2.c(to8.class), (f03) w4Var2.c(f03.class), (tt0) w4Var2.c(tt0.class), (aq) w4Var2.c(aq.class), (i4a) w4Var2.c(i4a.class), (ku3) w4Var2.c(ku3.class), w4Var2.d(y6a.class), w4Var2.d(bv2.class));
            case 5:
                return new ebe((g15) w4Var2.c(g15.class), w4Var2.d(fbe.class), w4Var2.d(bd.class), w4Var2.d(aa4.class), w4Var2.d(f03.class), w4Var2.d(zy9.class), w4Var2.d(pk.class), (pae) w4Var2.c(pae.class), w4Var2.d(h0a.class));
            case 6:
                return new yp6((Context) w4Var2.c(Context.class));
            case 7:
                return new gtf((a) w4Var2.c(a.class), (mtf) w4Var2.c(mtf.class), w4Var2.d(x4a.class));
            case 8:
                r7e d = w4Var2.d(bd.class);
                r7e d2 = w4Var2.d(fp.class);
                r7e d3 = w4Var2.d(ed3.class);
                r7e d4 = w4Var2.d(tf4.class);
                r7e d5 = w4Var2.d(ezd.class);
                r7e d6 = w4Var2.d(g2b.class);
                r7e d7 = w4Var2.d(jee.class);
                r7e d8 = w4Var2.d(luf.class);
                r7e d9 = w4Var2.d(mf6.class);
                r7e d10 = w4Var2.d(n1b.class);
                r7e d11 = w4Var2.d(t52.class);
                r7e d12 = w4Var2.d(zs7.class);
                r7e d13 = w4Var2.d(xce.class);
                r7e d14 = w4Var2.d(di7.class);
                w4Var2.d(pv3.class);
                return new a(d, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, d13, d14, w4Var2.d(mbe.class), w4Var2.d(mna.class), w4Var2.d(hz3.class));
            case 9:
                return new r10((Context) w4Var2.c(Application.class), (b00) w4Var2.c(b00.class), (zpc) w4Var2.c(zpc.class));
            case 10:
                return (wz) w4Var2.c(r10.class);
            case 11:
                return new b00((bf5) w4Var2.c(bf5.class), (mbe) w4Var2.c(mbe.class), (g15) w4Var2.c(g15.class));
            case 12:
                l8f l8f = (l8f) w4Var2.c(l8f.class);
                f35 f35 = (f35) w4Var2.c(f35.class);
                g15 g15 = (g15) w4Var2.c(g15.class);
                s98 s98 = (s98) w4Var2.c(s98.class);
                Object obj = new Object();
                Collections.newSetFromMap(new ConcurrentHashMap());
                ((mbe) w4Var2.c(mbe.class)).a();
                return obj;
            case 13:
                return new st7((cbe) w4Var2.c(cbe.class), new qr4(7));
            case 14:
                r7e r7e = new r7e(yr3.w0);
                if (oae.b != null) {
                    udd.R("TamContextAndroid", (IOException) null, "TamContext is already initialized", Arrays.copyOf(new Object[0], 0));
                } else {
                    oae.b = new oae(r7e);
                    oae.c.countDown();
                }
                return oae.a();
            case 15:
                return new cbe((Context) w4Var2.c(Context.class), w4Var2.d(pc0.class), w4Var2.d(w6a.class), w4Var2.d(t52.class), w4Var2.d(di3.class), w4Var2.d(f03.class), new r7e(new jq2(w4Var2, 3)));
            case 16:
                return new yy5((gr6) w4Var2.c(gr6.class), w4Var2.d(mbe.class), w4Var2.d(g15.class), w4Var2.d(tf4.class));
            case 17:
                return new bv6((Context) w4Var2.c(Context.class), (ku3) w4Var2.c(ku3.class), (pae) w4Var2.c(pae.class), w4Var2.d(qna.class));
            case 18:
                return new mce(w4Var2.d(bd.class));
            case 19:
                w4Var2.d(mbe.class);
                Context context = (Context) w4Var2.c(Context.class);
                if (a24.X(((float) 80) * dh4.c().getDisplayMetrics().density) <= 0) {
                    TypedValue.applyDimension(1, 80.0f, context.getResources().getDisplayMetrics());
                }
                if (wud.b == null) {
                    synchronized (wud.a) {
                        try {
                            if (wud.b == null) {
                                wud.b = new Object();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return wud.b;
            case SavedMessagesIconDrawable.SMALL_ICON_SIZE /*20*/:
                return new fbe(w4Var2.d(b34.class), w4Var2.d(bd.class), w4Var2.d(hjb.class), w4Var2.d(pk.class), w4Var2.d(di7.class), w4Var2.d(so1.class));
            case 21:
                return new nae((Context) w4Var2.c(Context.class), new b51(w4Var2.d(di3.class)), (qmc) ((mbe) w4Var2.c(mbe.class)).d.getValue(), (zy9) w4Var2.c(zy9.class), (zz9) w4Var2.c(zz9.class), (a04) w4Var2.c(a04.class), (g2b) w4Var2.c(g2b.class), (g15) w4Var2.c(g15.class));
            case 22:
                return new x7();
            case 23:
                return new oib(w4Var2.d(yae.class), w4Var2.d(pv3.class));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                g15 g152 = (g15) w4Var2.c(g15.class);
                e74 e74 = (e74) w4Var2.c(e74.class);
                return new mu4((Context) w4Var2.c(Context.class), (mbe) w4Var2.c(mbe.class), (nu4) w4Var2.c(uu4.class));
            case 25:
                return new pu4(w4Var2.d(n1b.class), w4Var2.d(t52.class), w4Var2.d(di3.class), w4Var2.d(mbe.class), w4Var2.d(g15.class), w4Var2.d(mu4.class));
            case 26:
                w4Var2.d(cyc.class);
                mg5 mg5 = (mg5) w4Var2.c(mg5.class);
                return new xce((Context) w4Var2.c(Context.class), (j2b) w4Var2.c(j2b.class), (x7) w4Var2.c(x7.class), (n1b) w4Var2.c(n1b.class), (t52) w4Var2.c(t52.class), (di3) w4Var2.c(di3.class));
            case 27:
                r7e d15 = w4Var2.d(cyc.class);
                w4Var2.d(fp.class);
                w4Var2.d(j2b.class);
                r7e d16 = w4Var2.d(g15.class);
                r7e d17 = w4Var2.d(to8.class);
                w4Var2.d(t52.class);
                return new h30((Context) w4Var2.c(Context.class), (tt0) w4Var2.c(tt0.class), d15, (nb9) w4Var2.c(nb9.class), d16, d17, w4Var2.d(pae.class));
            case 28:
                return new b34((Context) w4Var2.c(Context.class), w4Var2.d(o7a.class), w4Var2.d(o54.class), w4Var2.d(w6a.class), w4Var2.d(t52.class), w4Var2.d(pc0.class), w4Var2.d(f03.class), new r7e(new jq2(w4Var2, 5)));
            default:
                r7e d18 = w4Var2.d(hjb.class);
                w4Var2.d(m14.class);
                return new m19(d18, w4Var2.d(kq9.class), w4Var2.d(mr9.class), w4Var2.a(pp7.class));
        }
    }
}
