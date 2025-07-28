package defpackage;

import android.media.MediaCodec;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import com.google.android.gms.location.LocationAvailability;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.stickersshowcase.StickersShowcaseScreen;

/* renamed from: ygd  reason: default package */
public final class ygd implements f4e, fwd, n28, nl8, of3, jh7 {
    public Object a;

    public /* synthetic */ ygd(Object obj) {
        this.a = obj;
    }

    public void a(Object obj) {
        ta6 ta6 = (ta6) obj;
        ta6.getClass();
        boolean z = ((LocationAvailability) this.a).o < 1000;
        ta6.a.getClass();
        udd.p("wf6", "onLocationAvailability: %s", Boolean.valueOf(z));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0146, code lost:
        r10 = (r10 = r10.b).f0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void accept(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r18
            bt8 r0 = (bt8) r0
            r1 = r17
            java.lang.Object r1 = r1.a
            ru.ok.tamtam.upload.workers.UploadDraftMediaWorker r1 = (ru.ok.tamtam.upload.workers.UploadDraftMediaWorker) r1
            r1.getClass()
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r3 = "onUploadUpdate %s"
            java.lang.String r4 = "UploadDraftMediaWorker"
            defpackage.udd.p(r4, r3, r2)
            wve r2 = r0.a
            boolean r2 = r2.a()
            r3 = 0
            r5 = 0
            java.lang.String r7 = "onUploadSuccess: attaches is null"
            java.lang.String r8 = "onUploadSuccess: draft is null"
            java.lang.String r9 = "onUploadSuccess: chat is null"
            java.lang.String r10 = ", messageUploadState = "
            if (r2 == 0) goto L_0x010b
            fm4 r2 = r1.d()
            yl4 r2 = r2.a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "onUploadSuccess: key = "
            r11.<init>(r12)
            r11.append(r2)
            r11.append(r10)
            r11.append(r0)
            java.lang.String r2 = r11.toString()
            defpackage.udd.p(r4, r2, new java.lang.Object[0])
            t52 r2 = r1.c()
            fm4 r10 = r1.d()
            yl4 r10 = r10.a
            long r10 = r10.a
            i22 r2 = r2.B(r10)
            if (r2 != 0) goto L_0x005f
            defpackage.udd.s(r4, r9, r3)
            goto L_0x0242
        L_0x005f:
            o62 r9 = r2.b
            j4a r15 = r9.f0
            if (r15 != 0) goto L_0x0070
            defpackage.udd.s(r4, r8, r3)
            dh7 r0 = defpackage.gh7.a()
            r1.C0 = r0
            goto L_0x0242
        L_0x0070:
            jj7 r8 = r15.a()
            if (r8 != 0) goto L_0x0081
            defpackage.udd.s(r4, r7, r3)
            dh7 r0 = defpackage.gh7.a()
            r1.C0 = r0
            goto L_0x0242
        L_0x0081:
            p10 r3 = r8.I()
            fm4 r4 = r1.d()
            yl4 r4 = r4.a
            java.lang.String r4 = r4.b
            iwe r7 = new iwe
            r8 = 0
            r7.<init>(r0, r8)
            defpackage.urd.N(r3, r4, r7)
            r3.c()
            r7e r0 = r1.X
            java.lang.Object r0 = r0.getValue()
            dm4 r0 = (dm4) r0
            r0.c(r15)
            t52 r10 = r1.c()
            long r11 = r2.a
            java.lang.Long r0 = r15.b()
            if (r0 == 0) goto L_0x00b4
            long r5 = r0.longValue()
        L_0x00b4:
            r13 = r5
            r10.k(r11, r13, r15)
            r7e r0 = r1.Y
            java.lang.Object r0 = r0.getValue()
            jee r0 = (jee) r0
            una r3 = una.b1
            java.util.List r3 = java.util.Collections.singletonList(r3)
            java.util.List r0 = r0.i(r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x00ce:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00f8
            java.lang.Object r3 = r0.next()
            zde r3 = (zde) r3
            tna r4 = r3.f
            boolean r5 = r4 instanceof bm4
            if (r5 == 0) goto L_0x00ce
            bm4 r4 = (bm4) r4
            long r4 = r4.o
            long r6 = r2.a
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x00ce
            r7e r4 = r1.Y
            java.lang.Object r4 = r4.getValue()
            jee r4 = (jee) r4
            long r5 = r3.a
            r4.d(r5)
            goto L_0x00ce
        L_0x00f8:
            r7e r0 = r1.c
            java.lang.Object r0 = r0.getValue()
            luf r0 = (luf) r0
            o1d.y(r0)
            fh7 r0 = defpackage.gh7.b()
            r1.C0 = r0
            goto L_0x0242
        L_0x010b:
            wve r2 = r0.a
            rxe r2 = r2.g
            rxe r11 = rxe.c
            if (r2 != r11) goto L_0x0219
            fm4 r2 = r1.d()
            yl4 r2 = r2.a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "onUploadProgress: key = "
            r11.<init>(r12)
            r11.append(r2)
            r11.append(r10)
            r11.append(r0)
            java.lang.String r10 = r11.toString()
            defpackage.udd.p(r4, r10, new java.lang.Object[0])
            t52 r10 = r1.c()
            fm4 r11 = r1.d()
            yl4 r11 = r11.a
            long r11 = r11.a
            i22 r10 = r10.B(r11)
            if (r10 == 0) goto L_0x014f
            o62 r10 = r10.b
            if (r10 == 0) goto L_0x014f
            j4a r10 = r10.f0
            if (r10 == 0) goto L_0x014f
            jj7 r10 = r10.a()
            goto L_0x0150
        L_0x014f:
            r10 = r3
        L_0x0150:
            fm4 r11 = r1.d()
            yl4 r11 = r11.a
            java.lang.String r11 = r11.b
            if (r10 == 0) goto L_0x01f8
            int r12 = r10.v()
            if (r12 > 0) goto L_0x0162
            goto L_0x01f8
        L_0x0162:
            java.lang.Object r10 = r10.a
            java.util.List r10 = (java.util.List) r10
            java.util.Iterator r10 = r10.iterator()
        L_0x016a:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x0180
            java.lang.Object r12 = r10.next()
            r13 = r12
            o10 r13 = (o10) r13
            java.lang.String r13 = r13.q
            boolean r13 = defpackage.hhd.f(r13, r11)
            if (r13 == 0) goto L_0x016a
            goto L_0x0181
        L_0x0180:
            r12 = r3
        L_0x0181:
            if (r12 != 0) goto L_0x0185
            goto L_0x01f8
        L_0x0185:
            wve r10 = r0.a
            float r10 = r10.e
            r1.B0 = r10
            t52 r10 = r1.c()
            long r11 = r2.a
            i22 r10 = r10.B(r11)
            if (r10 != 0) goto L_0x01a2
            defpackage.udd.s(r4, r9, r3)
            dh7 r0 = defpackage.gh7.a()
            r1.C0 = r0
            goto L_0x0242
        L_0x01a2:
            o62 r9 = r10.b
            j4a r9 = r9.f0
            if (r9 != 0) goto L_0x01b3
            defpackage.udd.s(r4, r8, r3)
            dh7 r0 = defpackage.gh7.a()
            r1.C0 = r0
            goto L_0x0242
        L_0x01b3:
            jj7 r8 = r9.a()
            if (r8 != 0) goto L_0x01c4
            defpackage.udd.s(r4, r7, r3)
            dh7 r0 = defpackage.gh7.a()
            r1.C0 = r0
            goto L_0x0242
        L_0x01c4:
            p10 r3 = r8.I()
            java.lang.String r2 = r2.b
            iwe r4 = new iwe
            r7 = 1
            r4.<init>(r0, r7)
            defpackage.urd.N(r3, r2, r4)
            r3.c()
            r7e r0 = r1.X
            java.lang.Object r0 = r0.getValue()
            dm4 r0 = (dm4) r0
            r0.c(r9)
            t52 r11 = r1.c()
            long r12 = r10.a
            java.lang.Long r0 = r9.b()
            if (r0 == 0) goto L_0x01f1
            long r5 = r0.longValue()
        L_0x01f1:
            r14 = r5
            r16 = r9
            r11.k(r12, r14, r16)
            goto L_0x0242
        L_0x01f8:
            fm4 r0 = r1.d()
            yl4 r0 = r0.a
            java.lang.String r0 = r0.b
            fm4 r2 = r1.d()
            yl4 r2 = r2.a
            long r2 = r2.a
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2}
            java.lang.String r2 = "cancelUploadIfAttachIsDeleted: chat or attach is deleted: attachLocalId =%s, chatId = %s"
            defpackage.udd.p(r4, r2, r0)
            r1.i()
            goto L_0x0242
        L_0x0219:
            fm4 r2 = r1.d()
            yl4 r2 = r2.a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "onUploadUpdate: failed. Unknown upload state. key = "
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r2 = ", state = "
            r5.append(r2)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            defpackage.udd.s(r4, r0, r3)
            java.lang.Throwable r0 = new java.lang.Throwable
            java.lang.String r2 = "Internal error. Unknown upload state"
            r0.<init>(r2)
            r1.e(r0)
        L_0x0242:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ygd.accept(java.lang.Object):void");
    }

    public void b(long j, int i, int i2, int i3) {
        ((MediaCodec) this.a).queueInputBuffer(i, 0, i2, j, i3);
    }

    public void c() {
    }

    public boolean d(pl8 pl8, MenuItem menuItem) {
        return false;
    }

    public void e(boolean z) {
        gx0 gx0 = (gx0) this.a;
        xwb xwb = gx0.Z0;
        xwb.log("OKRTCCall", "Screen capture has stopped, fast=" + z);
        gx0.w0.post(new t50((Object) this, z, 14));
    }

    public void f(hud hud) {
        mv4 mv4 = (mv4) ((z51) this.a).w0;
        mv4.getClass();
        k77[] k77Arr = StickersShowcaseScreen.z0;
        sxd m0 = ((StickersShowcaseScreen) mv4.b).m0();
        m0.getClass();
        long j = hud.a;
        Long valueOf = Long.valueOf(j);
        yr yrVar = m0.B0;
        g37 g37 = (g37) yrVar.get(valueOf);
        if (g37 == null || !g37.isActive()) {
            yrVar.put(Long.valueOf(j), taf.n(m0, m0.o.b(), (ru3) null, new rxd(m0, hud, (Continuation) null), 2));
        }
    }

    public void flush() {
    }

    public boolean g(List list) {
        ArrayList arrayList = new ArrayList(q23.H(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((eod) it.next()).c));
        }
        Set w0 = o23.w0(arrayList);
        boolean z = !w0.equals((Set) this.a);
        this.a = w0;
        return z;
    }

    public void i(int i, nw3 nw3, long j, int i2) {
        ((MediaCodec) this.a).queueSecureInputBuffer(i, 0, (MediaCodec.CryptoInfo) nw3.i, j, i2);
    }

    public void m(ktd ktd) {
        mv4 mv4 = (mv4) ((z51) this.a).w0;
        mv4.getClass();
        ixd ixd = ixd.c;
        k77[] k77Arr = StickersShowcaseScreen.z0;
        StickersShowcaseScreen stickersShowcaseScreen = (StickersShowcaseScreen) mv4.b;
        stickersShowcaseScreen.getClass();
        k77 k77 = StickersShowcaseScreen.z0[0];
        long longValue = ((Number) stickersShowcaseScreen.a.a(stickersShowcaseScreen)).longValue();
        d34 P1 = ixd.P1();
        P1.b(":stickers/preview?sticker_id=" + ktd.a + "&chat_id=" + longValue, (Bundle) null);
    }

    public String n() {
        return (String) this.a;
    }

    public void o(e4e e4e) {
    }

    public void r(pl8 pl8) {
        wle wle = (wle) this.a;
        boolean p = wle.f.a.p();
        Window.Callback callback = wle.g;
        if (p) {
            callback.onPanelClosed(108, pl8);
        } else if (callback.onPreparePanel(0, (View) null, pl8)) {
            callback.onMenuOpened(108, pl8);
        }
    }

    public void setParameters(Bundle bundle) {
        ((MediaCodec) this.a).setParameters(bundle);
    }

    public void shutdown() {
    }

    public void start() {
    }

    public void t(ktd ktd) {
        mv4 mv4 = (mv4) ((z51) this.a).w0;
        mv4.getClass();
        k77[] k77Arr = StickersShowcaseScreen.z0;
        sxd m0 = ((StickersShowcaseScreen) mv4.b).m0();
        long j = m0.b;
        if (j > 0) {
            ((luf) m0.Z.getValue()).a(new u0d(new t0d(j, ktd.a, 1)));
            taf.o(m0.y0, v03.b);
        }
        tt6 tt6 = (tt6) hxd.a.getAccessor().e();
        if (tt6 != null) {
            tt6.f(z3d.N(new st6(qt6.SEND_5_MESSAGES, 1), new st6(qt6.SEND_3_STICKERS, 1)), mnc.Q0);
        }
    }

    public ygd() {
        this.a = qw4.a;
    }
}
