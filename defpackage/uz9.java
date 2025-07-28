package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.rlottie.NativeLibraryLoader;
import one.me.rlottie.RLottie;
import one.me.sdk.media.ffmpeg.FfmpegLibraryLoader;
import one.me.sdk.media.ffmpeg.WebmConfig;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: uz9  reason: default package */
public final class uz9 extends whd {
    public final /* synthetic */ int b;

    public /* synthetic */ uz9(int i) {
        this.b = i;
    }

    /* JADX WARNING: type inference failed for: r9v2, types: [gg9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v19, types: [gg9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v3, types: [j54, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v40, types: [otf, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v21, types: [nxc, java.lang.Object] */
    public final Object b(w4 w4Var) {
        w4 w4Var2 = w4Var;
        Class<wv4> cls = wv4.class;
        Class<qw9> cls2 = qw9.class;
        Class<j2b> cls3 = j2b.class;
        Class<di3> cls4 = di3.class;
        Class<q0a> cls5 = q0a.class;
        Class<mg5> cls6 = mg5.class;
        Class<op> cls7 = op.class;
        Class<pae> cls8 = pae.class;
        Class<t52> cls9 = t52.class;
        Class<Context> cls10 = Context.class;
        switch (this.b) {
            case 0:
                return (xh0) w4Var2.c(o6a.class);
            case 1:
                return new wz9(w4Var2);
            case 2:
                return new zz9(w4Var2);
            case 3:
                mb5.a.getClass();
                return oa2.o;
            case 4:
                return new Object();
            case 5:
                rf4 rf4 = (rf4) w4Var2.c(rf4.class);
                pw9 a = ((qw9) w4Var2.c(cls2)).a();
                a.c.clear();
                vqc vqc = (xzc) w4Var2.c(xzc.class);
                vqc.getClass();
                if (t14.a((int) vqc.o(PmsKey.debug-mode, (long) 0)) != t14.b) {
                    a.d.add(new qq0(1, "gyb"));
                } else {
                    rf4.e();
                }
                return new gyb(new qw9(a));
            case 6:
                return new dm6(new rd(new r7e(new jq2(w4Var2, 8)), (zpe) w4Var2.c(zpe.class)));
            case 7:
                return new fce(new r7e(new jq2(w4Var2, 9)));
            case 8:
                return new tae(w4Var2.d(lce.class), w4Var2.d(fce.class), w4Var2.d(g2b.class), w4Var2.d(bf5.class), w4Var2.d(mbe.class), w4Var2.d(g15.class), w4Var2.d(ed3.class));
            case 9:
                ((ezd) w4Var2.c(ezd.class)).a();
                Context context = (Context) w4Var2.c(cls10);
                r7e d = w4Var2.d(tae.class);
                r7e d2 = w4Var2.d(pu4.class);
                w4Var2.d(mtf.class);
                return new uu4(d, d2);
            case 10:
                return new qu4(w4Var2.d(cls), w4Var2.d(ji.class));
            case 11:
                return new wv4((Context) w4Var2.c(cls10), w4Var2.d(cls8));
            case 12:
                return new a0a(w4Var2);
            case 13:
                return (fu4) w4Var2.c(cls);
            case 14:
                return swb.D((Context) w4Var2.c(cls10));
            case 15:
                return new RLottie.Config((Context) w4Var2.c(cls10), true, NativeLibraryLoader.Companion.getDefault(), 0.0f, new Object(), 8, (x54) null);
            case 16:
                return new WebmConfig.Config((FfmpegLibraryLoader) null, new Object(), 1, (x54) null);
            case 17:
                return new eg9((Context) w4Var2.c(cls10), new r7e(new jq2(w4Var2, 10)), new n7a(w4Var2.d(cls2)), new x3a(20, (Object) w4Var2), Runtime.getRuntime().availableProcessors(), new wwc(w4Var2), new jq2(w4Var2, 12));
            case 18:
                int i = cic.Y;
                int i2 = cic.r;
                return new Object();
            case 19:
                Context context2 = (Context) w4Var2.c(cls10);
                return new fq6((j2b) w4Var2.c(cls3), w4Var2.d(cls9), w4Var2.d(cls4), w4Var2.d(x4a.class));
            case SavedMessagesIconDrawable.SMALL_ICON_SIZE:
                return new vl((Application) w4Var2.c(Application.class), w4Var2.d(cls3), new r7e(yr3.x0), (q0a) w4Var2.c(cls5));
            case 21:
                r7e d3 = w4Var2.d(n1b.class);
                r7e d4 = w4Var2.d(cls4);
                r7e d5 = w4Var2.d(cls9);
                r7e d6 = w4Var2.d(xce.class);
                ? obj = new Object();
                obj.a = w4Var2;
                obj.b = d3;
                obj.c = d4;
                obj.o = d5;
                obj.X = d6;
                return new ka3(obj);
            case 22:
                return new r4a(w4Var2.d(i6a.class), w4Var2.d(b9e.class), (pae) w4Var2.c(cls8));
            case 23:
                return q0a.a;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return (ku3) y93.h.getValue();
            case 25:
                p7c p7c = new p7c("^TTSession#.*$");
                return new i6a((c6a) w4Var2.c(cls7), new d6a(p23.B(new e6a("all-logs", (p7c) null, p7c, 0, 26), new e6a("important-logs", p7c, (p7c) null, 2048, 12), new e6a("missed-contacts", new p7c("^MissedContactsController.*$"), (p7c) null, 4096, 12), new e6a("calls-sdk-logs", new p7c("^CallsSdk.*$"), (p7c) null, 4096, 12), new e6a("analytics", new p7c("^LogController.*$"), (p7c) null, 8192, 12)), w4Var2.d(cls6), new jq2(w4Var2, 13), new jq2(w4Var2, 14)));
            case 26:
                Context context3 = (Context) w4Var2.c(cls10);
                Logger logger = loa.h;
                if (context3 != null) {
                    lv1 lv1 = new lv1(3, context3.getAssets());
                    p94 p94 = new p94(lv1);
                    k39 k39 = p94.a;
                    m99 m99 = p94.b;
                    w83 w83 = new w83();
                    ? obj2 = new Object();
                    obj2.a = lv1;
                    obj2.b = k39;
                    obj2.c = w83;
                    obj2.o = new ConcurrentHashMap();
                    ? obj3 = new Object();
                    obj3.a = m99;
                    obj3.b = obj2;
                    return new loa(obj3, d8.s());
                }
                throw new IllegalArgumentException("context could not be null.");
            case 27:
                Context context4 = (Context) w4Var2.c(cls10);
                w4Var2.d(to8.class);
                w4Var2.d(cls9);
                w4Var2.d(f3d.class);
                w4Var2.d(aq.class);
                w4Var2.d(i03.class);
                w4Var2.d(pk.class);
                w4Var2.d(tt0.class);
                w4Var2.d(cls6);
                ((q0a) w4Var2.c(cls5)).getClass();
                int i3 = zp4.o;
                zp4.e(mt0.P(12, eq4.HOURS));
                w4Var2.d(y3a.class);
                w4Var2.d(cls8);
                return new Object();
            case 28:
                return (pv3) w4Var2.c(cls7);
            default:
                return (dd) w4Var2.c(pp.class);
        }
    }
}
