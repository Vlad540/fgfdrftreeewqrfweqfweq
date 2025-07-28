package defpackage;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.inject.Provider;
import kotlin.NoWhenBranchMatchedException;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.profile.ProfileScreen;
import one.me.stickerspreview.set.StickerSetBottomSheet;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.upload.workers.UploadDraftMediaWorker;

/* renamed from: wwc  reason: default package */
public final class wwc implements ta9, nbc, v51, pm1, of3, iba, jyc, Provider, i8, i36, u1e, k7d, dj7, htd, k1e, tm0 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ wwc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void A(long j, boolean z) {
        ((i26) this.b).invoke(Long.valueOf(j), Boolean.valueOf(z));
    }

    public void B() {
        ((gqe) this.b).getClass();
    }

    public void E(gj7 gj7, long j, long j2) {
        boolean z;
        gvf gvf = (gvf) this.b;
        if (gvf != null) {
            synchronized (vx3.d) {
                z = vx3.e;
            }
            if (!z) {
                ((uy3) gvf.b).x(new IOException(new ConcurrentModificationException()));
                return;
            }
            gvf.o();
        }
    }

    public boolean F(long j) {
        boolean z;
        long j2 = j;
        boolean z2 = false;
        do {
            long f = f();
            if (f == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (jyc jyc : (jyc[]) this.b) {
                long f2 = jyc.f();
                boolean z3 = f2 != Long.MIN_VALUE && f2 <= j2;
                if (f2 == f || z3) {
                    z |= jyc.F(j2);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: le1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: le1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: le1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: le1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void G(le1 r5) {
        /*
            r4 = this;
            java.lang.Object r4 = r4.b
            ik1 r4 = (ik1) r4
            gk1 r4 = r4.c1
            if (r4 == 0) goto L_0x005c
            yg1 r4 = (yg1) r4
            smc r5 = one.me.calls.ui.ui.call.CallScreen.T0
            one.me.calls.ui.ui.call.CallScreen r4 = r4.a
            aj1 r4 = r4.z0()
            u81 r5 = r4.s()
            grd r0 = r4.H0
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            boolean r1 = r5.g
            t0c r2 = r4.A0
            zqd r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            lm1 r2 = (lm1) r2
            le1 r2 = r2.b
            r3 = 0
            if (r1 == 0) goto L_0x0031
            r2 = r3
            goto L_0x0057
        L_0x0031:
            boolean r5 = r5.m
            if (r5 != 0) goto L_0x0036
            goto L_0x0057
        L_0x0036:
            java.util.Set r5 = r0.keySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x003e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0054
            java.lang.Object r0 = r5.next()
            r1 = r0
            le1 r1 = (le1) r1
            boolean r1 = hhd.f(r1, r2)
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x003e
            r3 = r0
        L_0x0054:
            r2 = r3
            le1 r2 = (le1) r2
        L_0x0057:
            po1 r4 = r4.c
            r4.i(r2)
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wwc.G(le1):void");
    }

    public void H() {
        e40.a((e40) this.b);
    }

    public void I() {
        e40.a((e40) this.b);
    }

    public void J(jba jba) {
        ((oq2) this.b).b.invoke(jba);
    }

    public void K() {
        e40.a((e40) this.b);
    }

    public void N() {
        e40.a((e40) this.b);
    }

    public void O(String str, Bitmap bitmap) {
        gqe gqe = (gqe) this.b;
        gqe.getClass();
        gqe.E0 = str;
        gqe.B0 = true;
        gqe.setImageBitmap(bitmap);
    }

    public void P() {
        yg1 yg1 = ((ik1) this.b).c1;
        if (yg1 != null) {
            smc smc = CallScreen.T0;
            yg1.a.z0().Z.c();
        }
    }

    public void Q(byte[] bArr, int i, int i2, t1e t1e, nf3 nf3) {
        uw3 uw3;
        ija ija = (ija) this.b;
        ija.E(i2 + i, bArr);
        ija.G(i);
        ArrayList arrayList = new ArrayList();
        while (ija.a() > 0) {
            oyb.c("Incomplete Mp4Webvtt Top Level box header found.", ija.a() >= 8);
            int g = ija.g();
            if (ija.g() == 1987343459) {
                int i3 = g - 8;
                CharSequence charSequence = null;
                sw3 sw3 = null;
                while (i3 > 0) {
                    oyb.c("Incomplete vtt cue box header found.", i3 >= 8);
                    int g2 = ija.g();
                    int g3 = ija.g();
                    int i4 = g2 - 8;
                    byte[] bArr2 = ija.a;
                    int i5 = ija.b;
                    int i6 = oze.a;
                    String str = new String(bArr2, i5, i4, f22.c);
                    ija.H(i4);
                    i3 = (i3 - 8) - i4;
                    if (g3 == 1937011815) {
                        qqf qqf = new qqf();
                        sqf.e(str, qqf);
                        sw3 = qqf.b();
                    } else if (g3 == 1885436268) {
                        charSequence = sqf.f((String) null, str.trim(), Collections.emptyList());
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (sw3 != null) {
                    sw3.a = charSequence;
                    uw3 = sw3.a();
                } else {
                    Pattern pattern = sqf.a;
                    qqf qqf2 = new qqf();
                    qqf2.c = charSequence;
                    uw3 = qqf2.b().a();
                }
                arrayList.add(uw3);
            } else {
                ija.H(g - 8);
            }
        }
        nf3.accept(new xw3(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    public int R() {
        return 2;
    }

    public void S(le1 le1) {
        yg1 yg1 = ((ik1) this.b).c1;
        if (yg1 != null) {
            smc smc = CallScreen.T0;
            yg1.a.z0().v(le1);
        }
    }

    public sz0 U(gj7 gj7, long j, long j2, IOException iOException, int i) {
        gvf gvf = (gvf) this.b;
        if (gvf != null) {
            ((uy3) gvf.b).x(iOException);
        }
        return ul7.X;
    }

    public Object V(Object obj) {
        return ((Thread) obj).getState();
    }

    public boolean W(CharSequence charSequence, bpa bpa) {
        String str = bpa.b;
        if (str.length() == 0) {
            return false;
        }
        Matcher matcher = ((lhd) this.b).s(str).matcher(charSequence);
        if (!matcher.lookingAt()) {
            return false;
        }
        return matcher.matches();
    }

    public void X(Exception exc) {
        oyb.b("Audio sink error", exc);
        otf otf = ((l28) this.b).V1;
        Handler handler = (Handler) otf.a;
        if (handler != null) {
            handler.post(new w50(otf, exc, 1));
        }
    }

    public void Y(Object obj, boolean z) {
        ov0 ov0 = (ov0) obj;
        j8e j8e = (j8e) this.b;
        synchronized (j8e) {
            if (z) {
                try {
                    ((LinkedHashSet) j8e.o).add(ov0);
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            } else {
                ((LinkedHashSet) j8e.o).remove(ov0);
            }
        }
    }

    public void Z(String str, sf7 sf7) {
        ProfileScreen profileScreen = (ProfileScreen) ((seb) this.b).X;
        profileScreen.q0().x(1, str, sf7);
        int ordinal = sf7.ordinal();
        if (ordinal != 0) {
            if (ordinal == 4) {
                fgb q0 = profileScreen.q0();
                String a2 = ((gg7) q0.C0.getValue()).a(str);
                if (a2 != null) {
                    q0.v(a2);
                    return;
                }
                return;
            } else if (ordinal != 6) {
                return;
            }
        }
        profileScreen.q0().v(str);
    }

    public /* bridge */ /* synthetic */ void a(Object obj) {
        Void voidR = (Void) obj;
    }

    public void a0(String str, sf7 sf7, MotionEvent motionEvent) {
        List list;
        ProfileScreen profileScreen = (ProfileScreen) ((seb) this.b).X;
        ocb ocb = (ocb) profileScreen.q0().M0.getValue();
        ocb.getClass();
        int ordinal = sf7.ordinal();
        if (ordinal == 0 || ordinal == 4 || ordinal == 6) {
            int t = hr1.t(bm3.u(str) ? 3 : bm3.v(str) ? 2 : 1);
            j8e j8e = ocb.a;
            if (t != 0) {
                if (t == 1) {
                    mn mnVar = (mn) j8e.c;
                    list = p23.B(new pq3[]{(pq3) mnVar.b, (pq3) mnVar.c});
                } else if (t == 2) {
                    f2b f2b = (f2b) j8e.b;
                    list = p23.B(new pq3[]{(pq3) f2b.b, (pq3) f2b.c});
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (sf7 == sf7.X) {
                v2b v2b = (v2b) ((e3) j8e.o).a;
                list = p23.B(new pq3[]{(pq3) v2b.b, (pq3) v2b.c});
            } else {
                otf otf = (otf) j8e.a;
                list = p23.B(new pq3[]{(pq3) otf.a, (pq3) otf.b});
            }
        } else {
            list = null;
        }
        if (list != null && !list.isEmpty()) {
            profileScreen.q0().x(2, str, sf7);
            pfa.a(1).k().f(motionEvent.getRawX(), motionEvent.getRawY()).h(jjd.j(new wia[]{new wia("profile:contextmenu:link", str), new wia("profile:contextmenu:link_type", Integer.valueOf(sf7.ordinal()))})).i(new lge(str)).e(list).build().q(profileScreen);
            View view = profileScreen.getView();
            if (view != null) {
                lp.K(view, je6.LONG_PRESS);
            }
        }
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 7:
                wve wve = (wve) obj;
                wy1 wy1 = (wy1) this.b;
                wy1.getClass();
                if (wve.a()) {
                    String str = wve.h.a;
                    d0d d0d = wy1.a;
                    if (d0d == null) {
                        d0d = null;
                    }
                    long j = wy1.o;
                    i22 i22 = (i22) ((aw2) ((bv2) d0d.J.getValue())).m(j).a.getValue();
                    if (i22 != null) {
                        pn2 pn2 = r3;
                        pn2 pn22 = new pn2(i22.b.a, 0, (String) null, false, (String) null, (HashMap) null, (String) null, str, wy1.X, (Long) null, false, 0);
                        n83 n83 = wy1.w0;
                        if (n83 != null) {
                            yhd L = ((gy9) wy1.a()).L(pn2, ((nbe) wy1.q()).a());
                            d0d d0d2 = wy1.a;
                            if (d0d2 == null) {
                                d0d2 = null;
                            }
                            lce lce = (lce) d0d2.I.getValue();
                            lce.getClass();
                            ho5 j2 = L.j(new ice(lce, 3, 0));
                            pn1 pn1 = new pn1(new mod(8, wy1), 2, new gvf(7, wy1));
                            j2.k(pn1);
                            n83.a(pn1);
                            return;
                        }
                        return;
                    }
                    udd.s(wy1.Z, us8.i(j, "updateChatAvatar: chat not found, chatId="), (Throwable) null);
                    wy1.y();
                    return;
                }
                return;
            default:
                List<fm4> list = (List) obj;
                gm4 gm4 = (gm4) this.b;
                gm4.getClass();
                udd.q(gm4.g, wn6.h(list.size(), "startUploads: count = "));
                for (fm4 fm4 : list) {
                    k77 k77 = gm4.f[1];
                    uc5 uc5 = (uc5) gm4.c.get();
                    uc5.getClass();
                    StringBuilder sb = new StringBuilder("UploadDraftMediaWorker/");
                    yl4 yl4 = fm4.a;
                    sb.append(yl4.a);
                    sb.append(":");
                    String str2 = yl4.b;
                    sb.append(str2);
                    String sb2 = sb.toString();
                    bfa backoffCriteria = new bfa(UploadDraftMediaWorker.class).setConstraints(new if3(2, false, false, false, false, -1, -1, o23.w0(new LinkedHashSet()))).setExpedited(vga.a).setBackoffCriteria(he0.a, 10000, TimeUnit.MILLISECONDS);
                    HashMap hashMap = new HashMap();
                    hashMap.put("workName", sb2);
                    hashMap.put(ApiProtocol.PARAM_CHAT_ID, Long.valueOf(yl4.a));
                    hashMap.put("attachLocalId", str2);
                    hashMap.put("draft.path", fm4.b);
                    hashMap.put("draft.lastModified", Long.valueOf(fm4.c));
                    hashMap.put("draft.uploadType", sxe.q(fm4.d));
                    f3f f3f = fm4.e;
                    if (f3f != null) {
                        hashMap.put("draft.videoConvertOptions", true);
                        hashMap.put("draft.videoConvertOptions.quality", f3f.a.name());
                        hashMap.put("draft.videoConvertOptions.startTrimPosition", Float.valueOf(f3f.b));
                        hashMap.put("draft.videoConvertOptions.endTrimPosition", Float.valueOf(f3f.c));
                        hashMap.put("draft.videoConvertOptions.mute", Boolean.valueOf(f3f.d));
                    }
                    zy3 zy3 = new zy3(hashMap);
                    zy3.f(zy3);
                    uc5.a.b(sb2, a35.b, backoffCriteria.setInputData(zy3).build(), false).O();
                }
                return;
        }
    }

    public boolean b() {
        for (jyc b2 : (jyc[]) this.b) {
            if (b2.b()) {
                return true;
            }
        }
        return false;
    }

    public Iterator b0() {
        return ((Iterable) this.b).iterator();
    }

    public Long c0(Long l) {
        if (l.longValue() < 0) {
            this.b = null;
            return null;
        }
        Long l2 = (Long) this.b;
        this.b = l;
        if (l2 != null && l.longValue() >= l2.longValue()) {
            return Long.valueOf(l.longValue() - l2.longValue());
        }
        return null;
    }

    public void e(Throwable th) {
        ((lr6) this.b).close();
    }

    public long f() {
        long j = Long.MAX_VALUE;
        for (jyc f : (jyc[]) this.b) {
            long f2 = f.f();
            if (f2 != Long.MIN_VALUE) {
                j = Math.min(j, f2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public void g(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        try {
            ((mm0) this.b).a(bitmap);
        } finally {
            bitmap.recycle();
        }
    }

    public Object get() {
        return ((s16) this.b).invoke();
    }

    public void m(ktd ktd) {
    }

    public void n() {
        e40.a((e40) this.b);
    }

    public void q() {
        e40.a((e40) this.b);
    }

    public long r() {
        long j = Long.MAX_VALUE;
        for (jyc r : (jyc[]) this.b) {
            long r2 = r.r();
            if (r2 != Long.MIN_VALUE) {
                j = Math.min(j, r2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public void t(ktd ktd) {
        k77[] k77Arr = StickerSetBottomSheet.E0;
        ((ttd) ((StickerSetBottomSheet) this.b).w0.getValue()).s(ktd.a);
    }

    public void u(long j) {
        for (jyc u : (jyc[]) this.b) {
            u.u(j);
        }
    }

    public void v(le1 le1, Point point) {
        le1 le12;
        yg1 yg1;
        ik1 ik1 = (ik1) this.b;
        bga bga = ik1.a1;
        if (bga != null && (le12 = bga.c) != null && (yg1 = ik1.c1) != null) {
            smc smc = CallScreen.T0;
            yg1.a.z0().x(le12, (Point) null);
        }
    }

    public void w(Object obj) {
        a c;
        Map map = (Map) obj;
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
        }
        c cVar = (c) this.b;
        qx5 qx5 = (qx5) cVar.F.pollFirst();
        if (qx5 != null && (c = cVar.c.c(qx5.a)) != null) {
            c.K0(qx5.b, strArr, iArr);
        }
    }

    public void x(gj7 gj7, long j, long j2, boolean z) {
    }

    public void y(le1 le1) {
        yg1 yg1 = ((ik1) this.b).c1;
        if (yg1 != null) {
            smc smc = CallScreen.T0;
            yl1 yl1 = yg1.a.z0().Z;
            yl1.getClass();
            if (!le1.equals(le1.c)) {
                po1 po1 = yl1.b;
                if (((zw3) po1.b().getValue()).h) {
                    po1.h(le1, false);
                }
            }
        }
    }

    public void z() {
        e40.a((e40) this.b);
    }

    public wwc(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = 0;
        this.b = oneMeRoomDatabase;
        new sh(oneMeRoomDatabase, 21);
    }

    public wwc(xe6 xe6) {
        this.a = 29;
        this.b = xe6.j(TorchFlashRequiredFor3aUpdateQuirk.class);
    }

    public wwc(CameraDevice cameraDevice) {
        this.a = 6;
        cameraDevice.getClass();
        this.b = new ibe(cameraDevice, (d8) null);
    }

    public wwc(int i) {
        this.a = i;
        switch (i) {
            case 18:
                this.b = new ija();
                return;
            case 21:
                this.b = new lhd(100);
                return;
            case 26:
                this.b = new smc(9);
                return;
            default:
                return;
        }
    }

    public wwc(w4 w4Var) {
        this.a = 19;
        this.b = new r7e(new jq2(w4Var, 11));
    }
}
