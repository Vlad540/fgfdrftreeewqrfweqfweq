package ru.ok.messages.settings.caching;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import ru.ok.messages.settings.FrgBaseSettings;
import ru.ok.messages.views.dialogs.ProgressDialog;

public class FrgCachingSettings extends FrgBaseSettings implements tv0 {
    public final kp I1 = vl.o.a().c;
    public String J1 = "";
    public String[] K1;
    public uv0 L1;

    public final void G() {
        ProgressDialog E = this.J0.E("ru.ok.messages.views.dialogs.ProgressDialog");
        if ((E instanceof ProgressDialog ? E : null) == null) {
            q1(cic.d1, false);
        }
    }

    public final void J() {
        a06.H(0, V0(), i0(cic.c1));
    }

    public final void L() {
        a06.H(0, V0(), i0(cic.D));
    }

    public final void L0() {
        super.L0();
        this.L1.b();
        ((k93) this.t1.b).m().f(mnc.SETTINGS_CACHE, eja.e);
    }

    public final void U() {
        ProgressDialog E = this.J0.E("ru.ok.messages.views.dialogs.ProgressDialog");
        if ((E instanceof ProgressDialog ? E : null) == null) {
            r1();
        }
    }

    public final void e(ArrayList arrayList) {
        RecyclerView recyclerView = new RecyclerView(V0(), (AttributeSet) null);
        e0();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.setAdapter(new hz2(e0(), arrayList));
        ov7 ov7 = new ov7(V0());
        int i = cic.g1;
        pc pcVar = ov7.a;
        pcVar.d = pcVar.a.getText(i);
        ov7.f(recyclerView).d(cic.f1, new x06(this, arrayList, 2)).a();
    }

    public final String g1() {
        return "SETTINGS_MEDIA_CACHING";
    }

    public final void l(String str) {
        this.J1 = str;
        if (this.s1) {
            w1();
        }
    }

    public final ArrayList s1() {
        ArrayList arrayList = new ArrayList();
        int i = yqb.setting_caching_time;
        String i0 = i0(cic.Q0);
        kp kpVar = this.I1;
        int i2 = kpVar.g.getInt("app.media.caching.time", 0);
        arrayList.add(e4d.a(i, i0, i2 != 1 ? i2 != 2 ? i2 != 3 ? i0(cic.R0) : i0(cic.U0) : i0(cic.S0) : i0(cic.T0)));
        int i3 = yqb.setting_caching_limit;
        String i02 = i0(cic.O0);
        long j = kpVar.g.getLong("app.media.caching.limit", -1);
        e4d a = e4d.a(i3, i02, j <= 0 ? i0(cic.P0) : dhe.w(j, false, (Context) null));
        a.Z = true;
        arrayList.add(a);
        arrayList.add(new e4d(yqb.setting_caching_clear_cache, i0(cic.g1), i0(cic.h1), this.J1, (Boolean) null, 1));
        return arrayList;
    }

    public final String t1() {
        return i0(cic.e1);
    }

    public final void u1(int i) {
        if (i == yqb.setting_caching_time) {
            String[] strArr = {i0(cic.R0), i0(cic.T0), i0(cic.S0), i0(cic.U0)};
            ov7 ov7 = new ov7(V0());
            int i2 = cic.Q0;
            pc pcVar = ov7.a;
            pcVar.d = pcVar.a.getText(i2);
            x06 x06 = new x06(this, strArr, 1);
            pc pcVar2 = ov7.a;
            pcVar2.p = strArr;
            pcVar2.r = x06;
            ov7.a();
        } else if (i == yqb.setting_caching_limit) {
            jfd jfd = new jfd(e0());
            int i3 = this.v1.k;
            cfd configBuilder = jfd.getConfigBuilder();
            configBuilder.b = 0.0f;
            configBuilder.d = 0.0f;
            boolean z = true;
            configBuilder.c = (float) (this.K1.length - 1);
            long j = this.I1.g.getLong("app.media.caching.limit", -1);
            configBuilder.d = (float) (j == 536870912 ? 0 : j == 1073741824 ? 1 : j == 2147483648L ? 2 : j == 4294967296L ? 3 : 4);
            int i4 = this.v1.M;
            configBuilder.j = i4;
            configBuilder.r = i4;
            zg4 zg4 = this.q1;
            int i5 = zg4.b;
            configBuilder.f = i5;
            configBuilder.k = i3;
            configBuilder.w = i3;
            configBuilder.g = i5;
            configBuilder.l = i3;
            configBuilder.G = 1.0f;
            int i6 = zg4.f;
            configBuilder.h = i6;
            configBuilder.i = zg4.h;
            configBuilder.E = true;
            configBuilder.D = -1;
            configBuilder.C = zg4.l;
            configBuilder.B = i3;
            configBuilder.W = true;
            configBuilder.A = true;
            configBuilder.m = this.K1.length - 1;
            configBuilder.K = zg4.e;
            configBuilder.L = i6;
            jfd jfd2 = configBuilder.a;
            jfd2.getClass();
            jfd2.b = configBuilder.b;
            jfd2.c = configBuilder.c;
            jfd2.o = configBuilder.d;
            jfd2.w0 = configBuilder.e;
            jfd2.x0 = configBuilder.f;
            jfd2.y0 = configBuilder.g;
            jfd2.z0 = configBuilder.h;
            jfd2.A0 = configBuilder.i;
            jfd2.B0 = configBuilder.j;
            jfd2.C0 = configBuilder.k;
            jfd2.D0 = configBuilder.l;
            jfd2.E0 = configBuilder.m;
            jfd2.F0 = configBuilder.n;
            jfd2.G0 = configBuilder.o;
            jfd2.H0 = configBuilder.p;
            jfd2.I0 = configBuilder.q;
            jfd2.J0 = configBuilder.r;
            jfd2.K0 = configBuilder.s;
            jfd2.L0 = configBuilder.t;
            jfd2.M0 = configBuilder.u;
            jfd2.N0 = configBuilder.v;
            jfd2.O0 = configBuilder.w;
            jfd2.P0 = configBuilder.x;
            jfd2.S0 = configBuilder.y;
            jfd2.Q0 = configBuilder.z;
            jfd2.R0 = configBuilder.A;
            cfd cfd = jfd2.v1;
            String[] strArr2 = cfd.F;
            jfd2.w1 = strArr2;
            if (strArr2 == null || strArr2.length <= 0) {
                z = false;
            }
            jfd2.x1 = z;
            jfd2.y1 = cfd.G;
            jfd2.z1 = cfd.H;
            jfd2.A1 = cfd.I;
            jfd2.Q1 = cfd.J;
            jfd2.R1 = cfd.U;
            jfd2.T1 = cfd.T;
            jfd2.a1 = configBuilder.B;
            jfd2.b1 = configBuilder.C;
            jfd2.c1 = configBuilder.D;
            jfd2.B1 = configBuilder.E;
            jfd2.G1 = configBuilder.L;
            jfd2.F1 = configBuilder.K;
            jfd2.H1 = configBuilder.M;
            int i7 = configBuilder.N;
            jfd2.e1 = i7;
            jfd2.d1 = i7;
            int i8 = configBuilder.O;
            jfd2.g1 = i8;
            jfd2.f1 = i8;
            jfd2.X0 = configBuilder.Q;
            jfd2.W0 = configBuilder.P;
            jfd2.Y0 = configBuilder.S;
            jfd2.C1 = configBuilder.R;
            jfd2.T0 = configBuilder.V;
            jfd2.U0 = configBuilder.W;
            jfd2.d();
            jfd2.e();
            jfd2.c();
            jfd2.v1 = null;
            jfd2.requestLayout();
            jfd.setValueFormatListener(new w06(this));
            at7.g(jfd, this.q1.r);
            at7.f(jfd, this.q1.r);
            ov7 ov72 = new ov7(V0());
            int i9 = cic.O0;
            pc pcVar3 = ov72.a;
            pcVar3.d = pcVar3.a.getText(i9);
            ov72.f(jfd).d(cic.G, new x06(this, jfd, 0)).a();
        } else if (i == yqb.setting_caching_clear_cache) {
            uv0 uv0 = this.L1;
            synchronized (uv0) {
                try {
                    if (uv0.k == null) {
                        uv0.h.U();
                        nu9 n = uv0.c().r(uv0.f).n(uv0.g);
                        c97 c97 = new c97(new qv0(uv0, 4), new qv0(uv0, 5), z3d.i);
                        n.a(c97);
                        uv0.a(c97);
                    } else {
                        uv0.h.e((ArrayList) uv0.k.c);
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
    }

    public final void v0(Context context) {
        FrgCachingSettings.super.v0(context);
        this.K1 = new String[]{"512MB", "1GB", "2GB", "4GB", i0(cic.P0)};
    }

    public final void v1(int i, Object obj) {
    }

    public final void w0(Bundle bundle) {
        super.w0(bundle);
        ((k93) this.t1.b).p().getClass();
        nqc nqc = (nqc) oae.b();
        this.L1 = new uv0((ed5) nqc.getAccessor().c(ed5.class), (h30) ((k93) this.t1.b).getAccessor().c(h30.class), new hvf(e0()), nqc.u(), cnc.a(), de.a(), new w06(this), this);
    }
}
