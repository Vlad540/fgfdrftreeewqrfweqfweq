package defpackage;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import one.me.common.drawable.SavedMessagesIconDrawable;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: jq2  reason: default package */
public final class jq2 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w4 b;

    public /* synthetic */ jq2(w4 w4Var, int i) {
        this.a = i;
        this.b = w4Var;
    }

    public final Object invoke() {
        boolean z = false;
        Class<x4a> cls = x4a.class;
        Class<f03> cls2 = f03.class;
        Class<mbe> cls3 = mbe.class;
        w4 w4Var = this.b;
        switch (this.a) {
            case 0:
                return new mta(w4Var.d(cls2), w4Var.d(q2b.class), w4Var.d(o2b.class));
            case 1:
                return Long.valueOf(((f03) w4Var.c(cls2)).s());
            case 2:
                return (kfc) w4Var.c(kfc.class);
            case 3:
                return ((mbe) w4Var.c(cls3)).a();
            case 4:
                return new ma7(w4Var);
            case 5:
                return ((mbe) w4Var.c(cls3)).a();
            case 6:
                return ((mbe) w4Var.c(cls3)).a();
            case 7:
                gv0 gv0 = new gv0();
                gv0.a = (av0) w4Var.c(mgd.class);
                gv0.d = new f64((Context) w4Var.c(Context.class), (nz3) w4Var.c(h84.class));
                gv0.c = true;
                gv0.e = 2;
                return gv0;
            case 8:
                return ((gyb) w4Var.c(gyb.class)).a;
            case 9:
                return ((dm6) w4Var.c(dm6.class)).a;
            case 10:
                return ((x4a) w4Var.c(cls)).b();
            case 11:
                x4a x4a = (x4a) w4Var.c(cls);
                k77[] k77Arr = x4a.p;
                return x4a.h(x4a.e(1, "rlottie", 1, 5), "rlottie");
            case 12:
                if (((vf4) w4Var.c(vf4.class)).compareTo(vf4.X) >= 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 13:
                vqc vqc = (xzc) w4Var.c(xzc.class);
                Integer num = (Integer) ((jk0) vqc.i.getValue()).A();
                return t14.a(num != null ? num.intValue() : (int) vqc.o(PmsKey.debug-mode, (long) 0));
            case 14:
                return new s15(((pae) w4Var.c(pae.class)).d().e(1, "file-logging", 1, 5));
            case 15:
                x4a x4a2 = (x4a) w4Var.c(cls);
                x4a2.getClass();
                k77 k77 = x4a.p[4];
                return x4a2.d(x4a2.j);
            case 16:
                nbe nbe = (mbe) w4Var.c(cls3);
                nbe.getClass();
                return nbe.a();
            case 17:
                return ((mbe) w4Var.c(cls3)).b();
            case 18:
                return (ScheduledExecutorService) ((x4a) w4Var.c(cls)).l.getValue();
            case 19:
                return new ypc(w4Var);
            case SavedMessagesIconDrawable.SMALL_ICON_SIZE /*20*/:
                return ((mbe) w4Var.c(cls3)).a();
            case 21:
                return ((f03) w4Var.c(cls2)).u();
            case 22:
                ((rf4) w4Var.c(rf4.class)).e();
                return fy9.a;
            case 23:
                return ((mbe) w4Var.c(cls3)).b();
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return Long.valueOf(((f03) w4Var.c(cls2)).s());
            case 25:
                return ((x4a) w4Var.c(cls)).b();
            case 26:
                return new dqc(w4Var);
            case 27:
                return ((c9a) w4Var.c(c9a.class)).m().W();
            case 28:
                return Long.valueOf(((f03) w4Var.c(cls2)).s());
            default:
                return ((mbe) w4Var.c(cls3)).a();
        }
    }
}
