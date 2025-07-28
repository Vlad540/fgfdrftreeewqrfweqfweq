package defpackage;

import android.content.Context;
import android.graphics.Color;
import me.leolin.shortcutbadger.BuildConfig;
import one.me.sdk.arch.Widget;

/* renamed from: mz4  reason: default package */
public final /* synthetic */ class mz4 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ mz4(int i, nz4 nz4) {
        this.a = 0;
        this.b = i;
        this.c = "one.me.webapp.domain.jsbridge.SuccessResponse.Status";
        this.o = nz4;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [l7c, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v3, types: [l7c, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v4, types: [l7c, java.lang.Object] */
    public final Object invoke() {
        switch (this.a) {
            case 0:
                int i = this.b;
                syc[] sycArr = new syc[i];
                for (int i2 = 0; i2 < i; i2++) {
                    sycArr[i2] = h2g.a(((String) this.c) + '.' + ((nz4) this.o).e[i2], t0e.i, new syc[0]);
                }
                return sycArr;
            case 1:
                ? obj = new Object();
                Widget widget = (Widget) this.o;
                Context context = widget.getContext();
                uh1 uh1 = (uh1) this.c;
                CharSequence a2 = uh1.C.a(context);
                if (a2 == null) {
                    a2 = BuildConfig.FLAVOR;
                }
                ned ned = new ned(obj, 0);
                hba hba = new hba(widget);
                hba.i(a2);
                Integer num = uh1.D;
                if (num != null) {
                    hba.f(new vba(num.intValue()));
                }
                hba.d(new bm1(3, ned));
                hba.c(new pba(0, this.b, 3));
                gba j = hba.j();
                obj.a = j;
                return j;
            case 2:
                ? obj2 = new Object();
                ned ned2 = new ned(obj2, 1);
                hba hba2 = new hba((Widget) this.c);
                vh1 vh1 = (vh1) this.o;
                hba2.h(vh1.C);
                hba2.f(yba.a);
                hba2.g(aca.a);
                hba2.d(new joc(ned2, 2, vh1.D));
                hba2.c(new pba(0, this.b, 3));
                gba j2 = hba2.j();
                obj2.a = j2;
                return j2;
            case 3:
                ? obj3 = new Object();
                nya nya = new nya(obj3, 21, (s16) this.o);
                hba hba3 = new hba((Widget) this.c);
                hba3.h(new hge(ftb.call_screen_snackbar_title));
                hba3.a(new hge(ftb.call_screen_snackbar_caption));
                hba3.f(new uba(cnb.ic_connection_fill_28, Color.parseColor("#FFD60A")));
                hba3.g(new dca(new hge(ftb.call_screen_snackbar_button_text)));
                qba qba = qba.b;
                fca fca = hba3.b;
                zba zba = fca.a;
                if (zba instanceof yba) {
                    zba = wba.a;
                }
                hba3.b = fca.a(fca, zba, (CharSequence) null, (CharSequence) null, (eca) null, (pba) null, qba, 30);
                hba3.c(new pba(0, this.b, 3));
                hba3.d(new bm1(4, nya));
                gba j3 = hba3.j();
                obj3.a = j3;
                return j3;
            default:
                return k2e.d((String) this.c, this.b, (n62) ((yha) this.o).a);
        }
    }

    public /* synthetic */ mz4(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.o = obj2;
    }

    public /* synthetic */ mz4(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.o = obj2;
        this.b = i;
    }
}
