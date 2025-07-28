package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.Continuation;

/* renamed from: gp2  reason: default package */
public final class gp2 extends taf {
    public static final /* synthetic */ k77[] M0;
    public final t97 A0;
    public final t97 B0;
    public final grd C0;
    public final t0c D0;
    public final l05 E0 = new l05(0);
    public final l05 F0 = new l05(0);
    public final AtomicLong G0 = new AtomicLong();
    public final e3 H0 = hwf.t();
    public final e3 I0 = hwf.t();
    public volatile String J0;
    public String K0 = "";
    public String L0 = "";
    public final t97 X;
    public final t97 Y;
    public final t97 Z;
    public final long[] b;
    public final kpd c;
    public final xzc o;
    public final t97 w0;
    public final t97 x0;
    public final t97 y0;
    public final t97 z0;

    static {
        Class<gp2> cls = gp2.class;
        M0 = new k77[]{new hc9(cls, "createChannelJob", "getCreateChannelJob()Lkotlinx/coroutines/Job;"), c3d.g(m7c.a, cls, "updateChannelJob", "getUpdateChannelJob()Lkotlinx/coroutines/Job;")};
    }

    public gp2(long[] jArr, kpd kpd) {
        ipd ipd = ipd.a;
        xzc b2 = ipd.b();
        r7e d = ipd.getAccessor().d(pk.class);
        r7e d2 = ipd.getAccessor().d(pae.class);
        r7e d3 = ipd.getAccessor().d(qna.class);
        r7e d4 = ipd.getAccessor().d(mg5.class);
        r7e d5 = ipd.getAccessor().d(t52.class);
        r7e f = ipd.getAccessor().f();
        r7e d6 = ipd.getAccessor().d(tt0.class);
        r7e d7 = ipd.getAccessor().d(hba.class);
        r7e d8 = ipd.getAccessor().d(Context.class);
        r7e d9 = ipd.getAccessor().d(yv3.class);
        r7e d10 = ipd.getAccessor().d(jb5.class);
        this.b = jArr;
        this.c = kpd;
        this.o = b2;
        this.X = d;
        this.Y = d3;
        this.Z = d2;
        this.w0 = d4;
        this.x0 = d5;
        this.y0 = f;
        this.z0 = d6;
        this.A0 = d7;
        this.B0 = d8;
        grd a = hrd.a(new zo2((String) null, (String) null, (RectF) null));
        this.C0 = a;
        this.D0 = new t0c(a);
        if (kpd == kpd.CHANNEL) {
            ez3.N(new ck5(new s0c(((yv3) d9.getValue()).a), new bp2(this, d2, d10, (Continuation) null), 5), this.a);
        }
    }

    public static final void q(gp2 gp2, long j) {
        String str;
        grd grd = gp2.C0;
        String str2 = ((zo2) grd.getValue()).a;
        String str3 = ((zo2) grd.getValue()).b;
        if (str3 == null || (str = at7.y(str3)) == null) {
            str = null;
        }
        if (str2 != null) {
            if (str != null) {
                t52 t52 = (t52) gp2.x0.getValue();
                t52.getClass();
                udd.q("t52", "changeChatIcon, chatId = " + j + ", path = " + str);
                t52.c(j, z52.b);
                t52.h(j, false, new q52(str, 0));
                t52.m.c(new mw2(Collections.singletonList(Long.valueOf(j)), false));
            }
            d10 g = xs7.g(((zo2) grd.getValue()).c);
            gy9 gy9 = (gy9) ((pk) gp2.X.getValue());
            if (gy9.o(j)) {
                ((luf) gy9.e.getValue()).b(new f02(((j2b) gy9.z()).a.n(), str2, j, g));
            }
        }
    }

    public final void r(String str, RectF rectF, Rect rect) {
        String str2;
        try {
            str2 = xs7.i(str, rect, ipd.a.b());
        } catch (Throwable th) {
            str2 = new kcc(th);
        }
        if (mcc.a(str2) != null) {
            udd.q(gp2.class.getName(), "local crop failed. Crop will be applied after update from server");
        }
        if (str2 instanceof kcc) {
            str2 = null;
        }
        this.C0.m((Object) null, new zo2(str, str2, rectF));
    }

    public final void s() {
        Intent intent;
        if (!((qna) this.Y.getValue()).b(qna.l)) {
            taf.o(this.E0, po2.b);
            return;
        }
        try {
            this.J0 = String.valueOf(System.currentTimeMillis());
            Uri fromFile = Uri.fromFile(((mg5) this.w0.getValue()).q(this.J0));
            String uri = fromFile.toString();
            int i = js.d;
            if (!uri.startsWith("content://")) {
                fromFile = ((mg5) this.w0.getValue()).f((Context) this.B0.getValue(), gt0.N(fromFile));
            }
            intent = new Intent("android.media.action.IMAGE_CAPTURE");
            intent.putExtra("output", fromFile);
            intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
        } catch (Throwable th) {
            intent = new kcc(th);
        }
        Throwable a = mcc.a(intent);
        if (a != null) {
            t();
            udd.s(gp2.class.getName(), "capturePhoto: failed to capture photo", a);
        }
        if (!(intent instanceof kcc)) {
            taf.o(this.E0, new oo2(intent));
        }
    }

    public final void t() {
        this.J0 = null;
        hba hba = (hba) this.A0.getValue();
        hba.h(new hge(cic.s));
        hba.f(new vba(phc.J));
        hba.j();
    }

    public final void u() {
        this.J0 = null;
        hba hba = (hba) this.A0.getValue();
        hba.h(new hge(cic.u));
        hba.f(new vba(phc.J));
        hba.j();
    }
}
