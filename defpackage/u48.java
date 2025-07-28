package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.view.Surface;
import androidx.media3.common.PlaybackException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: u48  reason: default package */
public final class u48 implements q38 {
    public final Context a;
    public final r38 b;
    public final m3d c;
    public final qh7 d;
    public final s48 e;
    public final wm0 f;
    public mn g;
    public j18 h;
    public boolean i;
    public boolean j;
    public t48 k = new t48();
    public t48 l = new t48();
    public yd3 m;
    public long n;
    public long o;

    /* JADX WARNING: type inference failed for: r0v2, types: [yd3, java.lang.Object] */
    public u48(Context context, r38 r38, m3d m3d, Looper looper, mn mnVar) {
        ? obj = new Object();
        obj.a = fza.F.l(bkb.g);
        obj.b = w1d.b;
        obj.c = eya.b;
        obj.d = e8c.X;
        obj.e = Bundle.EMPTY;
        obj.f = null;
        this.m = obj;
        this.d = new qh7(looper, z7e.a, new q48(this));
        this.a = context;
        this.b = r38;
        this.e = new s48(this, looper);
        this.c = m3d;
        this.f = mnVar;
        this.n = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    public static List i(List list) {
        if (list == null) {
            return Collections.emptyList();
        }
        nu7 nu7 = am7.c;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static cya j(cya cya) {
        cya cya2 = cya;
        if (cya2 == null) {
            return null;
        }
        if (cya2.o > 0.0f) {
            return cya2;
        }
        ez3.j0("Adjusting playback speed to 1.0f because negative playback speed isn't supported.");
        ArrayList arrayList = new ArrayList();
        AbstractCollection abstractCollection = cya2.x0;
        if (abstractCollection != null) {
            arrayList.addAll(abstractCollection);
        }
        return new cya(cya2.a, cya2.b, cya2.c, 1.0f, cya2.X, cya2.Y, cya2.Z, cya2.w0, arrayList, cya2.y0, cya2.z0);
    }

    public static jya o(int i2, l68 l68, long j2, boolean z) {
        return new jya((Object) null, i2, l68, (Object) null, i2, j2, j2, z ? 0 : -1, z ? 0 : -1);
    }

    public final long A() {
        return c();
    }

    public final void A0(int i2, l68 l68) {
        s0(ws6.n(l68), i2, i2 + 1);
    }

    public final int B() {
        return p0();
    }

    public final r8f C() {
        ez3.j0("Session doesn't support getting VideoSize");
        return r8f.e;
    }

    public final void C0(l68 l68) {
        U0(l68);
    }

    public final void D() {
        this.g.P().E.skipToPrevious();
    }

    public final void D0() {
        N(1);
    }

    public final void E() {
        T(p0(), 0);
    }

    public final boolean E0() {
        return ((fza) this.m.a).i;
    }

    public final k20 F() {
        return ((fza) this.m.a).o;
    }

    public final mpe F0() {
        return mpe.C;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v32, resolved type: w1d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v48, resolved type: ws6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: akb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: l68} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: l68} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: akb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: akb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v50, resolved type: l68} */
    /* JADX WARNING: type inference failed for: r0v2, types: [x78, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v52, types: [java.util.AbstractCollection, java.util.List] */
    /* JADX WARNING: type inference failed for: r9v42, types: [java.util.AbstractCollection, java.util.List] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void G(boolean r86, defpackage.t48 r87) {
        /*
            r85 = this;
            r0 = r85
            r2 = r87
            boolean r4 = r0.i
            if (r4 != 0) goto L_0x07bd
            boolean r4 = r0.j
            if (r4 != 0) goto L_0x000e
            goto L_0x07bd
        L_0x000e:
            t48 r4 = r0.k
            yd3 r5 = r0.m
            mn r6 = r0.g
            java.lang.Object r6 = r6.b
            v38 r6 = (defpackage.v38) r6
            android.media.session.MediaController r6 = r6.a
            java.lang.String r6 = r6.getPackageName()
            mn r7 = r0.g
            java.lang.Object r7 = r7.b
            v38 r7 = (defpackage.v38) r7
            android.media.session.MediaController r7 = r7.a
            long r7 = r7.getFlags()
            mn r9 = r0.g
            java.lang.Object r9 = r9.b
            v38 r9 = (defpackage.v38) r9
            uc8 r9 = r9.e
            mn6 r9 = r9.a()
            if (r9 == 0) goto L_0x003a
            r9 = 1
            goto L_0x003b
        L_0x003a:
            r9 = 0
        L_0x003b:
            mn r11 = r0.g
            java.lang.Object r11 = r11.b
            v38 r11 = (defpackage.v38) r11
            android.media.session.MediaController r11 = r11.a
            int r11 = r11.getRatingType()
            r38 r12 = r0.b
            long r13 = r12.Y
            mn r15 = r0.g
            int r1 = defpackage.oze.a
            r10 = 30
            if (r1 >= r10) goto L_0x0055
        L_0x0053:
            r1 = 0
            goto L_0x0066
        L_0x0055:
            java.lang.Object r1 = r15.b
            v38 r1 = (defpackage.v38) r1
            android.media.session.MediaController r1 = r1.a
            android.media.session.MediaController$PlaybackInfo r1 = r1.getPlaybackInfo()
            if (r1 != 0) goto L_0x0062
            goto L_0x0053
        L_0x0062:
            java.lang.String r1 = r1.getVolumeControlId()
        L_0x0066:
            java.util.List r10 = r4.d
            java.util.List r15 = r2.d
            if (r10 == r15) goto L_0x006e
            r10 = 1
            goto L_0x006f
        L_0x006e:
            r10 = 0
        L_0x006f:
            java.lang.String r3 = "initialCapacity"
            if (r10 == 0) goto L_0x00ce
            bkb r18 = defpackage.bkb.g
            r18 = r12
            r12 = 4
            defpackage.ete.l(r12, r3)
            r19 = r1
            java.lang.Object[] r1 = new java.lang.Object[r12]
            r20 = r6
            r21 = r13
            r6 = 0
            r12 = 0
        L_0x0085:
            int r13 = r15.size()
            if (r12 >= r13) goto L_0x00c1
            java.lang.Object r13 = r15.get(r12)
            sc8 r13 = (defpackage.sc8) r13
            gt6 r14 = defpackage.qa7.a
            c58 r14 = r13.a
            l68 r24 = defpackage.qa7.h(r14)
            akb r14 = new akb
            r27 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r29 = r7
            long r7 = r13.b
            r23 = r14
            r25 = r7
            r23.<init>(r24, r25, r27)
            r7 = 1
            int r8 = r6 + 1
            int r13 = r1.length
            if (r13 >= r8) goto L_0x00ba
            int r13 = r1.length
            int r13 = defpackage.ms6.h(r13, r8)
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r13)
        L_0x00ba:
            r1[r6] = r14
            int r12 = r12 + r7
            r6 = r8
            r7 = r29
            goto L_0x0085
        L_0x00c1:
            r29 = r7
            bkb r7 = new bkb
            e8c r1 = defpackage.ws6.h(r6, r1)
            r6 = 0
            r7.<init>(r1, r6)
            goto L_0x00e9
        L_0x00ce:
            r19 = r1
            r20 = r6
            r29 = r7
            r18 = r12
            r21 = r13
            java.lang.Object r1 = r5.a
            fza r1 = (defpackage.fza) r1
            vje r1 = r1.j
            bkb r1 = (defpackage.bkb) r1
            bkb r7 = new bkb
            ws6 r6 = r1.e
            akb r1 = r1.f
            r7.<init>(r6, r1)
        L_0x00e9:
            a88 r1 = r4.c
            a88 r6 = r2.c
            if (r1 != r6) goto L_0x00f4
            if (r86 == 0) goto L_0x00f2
            goto L_0x00f4
        L_0x00f2:
            r1 = 0
            goto L_0x00f5
        L_0x00f4:
            r1 = 1
        L_0x00f5:
            cya r8 = r4.b
            if (r8 != 0) goto L_0x00fc
            r14 = -1
            goto L_0x00fe
        L_0x00fc:
            long r14 = r8.y0
        L_0x00fe:
            cya r12 = r2.b
            if (r12 != 0) goto L_0x0108
            r25 = r8
            r13 = r9
            r8 = -1
            goto L_0x010d
        L_0x0108:
            r25 = r8
            r13 = r9
            long r8 = r12.y0
        L_0x010d:
            int r14 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r14 != 0) goto L_0x0119
            if (r86 == 0) goto L_0x0114
            goto L_0x0119
        L_0x0114:
            r15 = r12
            r26 = r13
            r14 = 0
            goto L_0x011d
        L_0x0119:
            r15 = r12
            r26 = r13
            r14 = 1
        L_0x011d:
            long r12 = defpackage.qa7.d(r6)
            if (r1 != 0) goto L_0x013d
            if (r14 != 0) goto L_0x013d
            if (r10 == 0) goto L_0x0128
            goto L_0x013d
        L_0x0128:
            java.lang.Object r1 = r5.a
            fza r1 = (defpackage.fza) r1
            n2d r8 = r1.c
            jya r8 = r8.a
            int r8 = r8.b
            z78 r1 = r1.z
            r75 = r1
            r24 = r3
            r23 = r15
            r1 = 0
            goto L_0x0207
        L_0x013d:
            java.util.List r10 = r2.d
            if (r10 == 0) goto L_0x0147
            r23 = -1
            int r23 = (r8 > r23 ? 1 : (r8 == r23 ? 0 : -1))
            if (r23 != 0) goto L_0x014c
        L_0x0147:
            r24 = r3
            r23 = r15
            goto L_0x016d
        L_0x014c:
            r23 = r15
            r15 = 0
        L_0x014f:
            int r0 = r10.size()
            if (r15 >= r0) goto L_0x016b
            java.lang.Object r0 = r10.get(r15)
            sc8 r0 = (defpackage.sc8) r0
            r24 = r3
            long r2 = r0.b
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0164
            goto L_0x016e
        L_0x0164:
            r0 = 1
            int r15 = r15 + r0
            r2 = r87
            r3 = r24
            goto L_0x014f
        L_0x016b:
            r24 = r3
        L_0x016d:
            r15 = -1
        L_0x016e:
            if (r6 == 0) goto L_0x0172
            r0 = 1
            goto L_0x0173
        L_0x0172:
            r0 = 0
        L_0x0173:
            if (r0 == 0) goto L_0x017c
            if (r1 == 0) goto L_0x017c
            z78 r2 = defpackage.qa7.k(r6, r11)
            goto L_0x0199
        L_0x017c:
            if (r0 != 0) goto L_0x0193
            if (r14 == 0) goto L_0x0193
            r2 = -1
            if (r15 != r2) goto L_0x0186
            z78 r2 = defpackage.z78.J
            goto L_0x0199
        L_0x0186:
            java.lang.Object r2 = r10.get(r15)
            sc8 r2 = (defpackage.sc8) r2
            c58 r2 = r2.a
            z78 r2 = defpackage.qa7.j(r2, r11)
            goto L_0x0199
        L_0x0193:
            java.lang.Object r2 = r5.a
            fza r2 = (defpackage.fza) r2
            z78 r2 = r2.z
        L_0x0199:
            ws6 r3 = r7.e
            r8 = -1
            if (r15 != r8) goto L_0x01df
            if (r1 == 0) goto L_0x01dc
            if (r0 == 0) goto L_0x01d4
            java.lang.String r0 = "Adding a fake MediaItem at the end of the list because there's no QueueItem with the active queue id and current Timeline should have currently playing MediaItem."
            defpackage.ez3.j0(r0)
            android.os.Bundle r0 = r6.a
            java.lang.String r1 = "android.media.metadata.MEDIA_ID"
            java.lang.CharSequence r0 = r0.getCharSequence(r1)
            if (r0 == 0) goto L_0x01b6
            java.lang.String r0 = r0.toString()
            goto L_0x01b7
        L_0x01b6:
            r0 = 0
        L_0x01b7:
            l68 r32 = defpackage.qa7.i(r0, r6, r11)
            bkb r7 = new bkb
            akb r0 = new akb
            r33 = -1
            r31 = r0
            r35 = r12
            r31.<init>(r32, r33, r35)
            r7.<init>(r3, r0)
            int r0 = r7.p()
            r1 = 1
            int r0 = r0 - r1
            r15 = r0
            r1 = 0
            goto L_0x0204
        L_0x01d4:
            bkb r7 = new bkb
            r1 = 0
            r7.<init>(r3, r1)
        L_0x01da:
            r15 = 0
            goto L_0x0204
        L_0x01dc:
            r1 = 0
            r8 = -1
            goto L_0x01e0
        L_0x01df:
            r1 = 0
        L_0x01e0:
            if (r15 == r8) goto L_0x01da
            bkb r7 = new bkb
            r7.<init>(r3, r1)
            if (r0 == 0) goto L_0x0204
            int r0 = r7.p()
            if (r15 < r0) goto L_0x01f1
            r0 = r1
            goto L_0x01f7
        L_0x01f1:
            akb r0 = r7.v(r15)
            l68 r0 = r0.a
        L_0x01f7:
            r0.getClass()
            java.lang.String r0 = r0.a
            l68 r0 = defpackage.qa7.i(r0, r6, r11)
            bkb r7 = r7.s(r15, r0, r12)
        L_0x0204:
            r75 = r2
            r8 = r15
        L_0x0207:
            java.lang.CharSequence r0 = r4.e
            r2 = r87
            java.lang.CharSequence r3 = r2.e
            if (r0 != r3) goto L_0x0218
            java.lang.Object r0 = r5.a
            fza r0 = (defpackage.fza) r0
            z78 r0 = r0.m
        L_0x0215:
            r62 = r0
            goto L_0x022b
        L_0x0218:
            if (r3 != 0) goto L_0x021d
            z78 r0 = defpackage.z78.J
            goto L_0x0215
        L_0x021d:
            x78 r0 = new x78
            r0.<init>()
            r0.a = r3
            z78 r3 = new z78
            r3.<init>(r0)
            r0 = r3
            goto L_0x0215
        L_0x022b:
            int r0 = r2.f
            int r0 = defpackage.qa7.s(r0)
            int r3 = r2.g
            boolean r58 = defpackage.qa7.u(r3)
            r4 = r23
            r3 = r25
            if (r3 == r4) goto L_0x0330
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            e8c r9 = defpackage.v1d.d
            r10 = 0
        L_0x0245:
            int r11 = r9.o
            if (r10 >= r11) goto L_0x025e
            v1d r11 = new v1d
            java.lang.Object r14 = r9.get(r10)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            r11.<init>(r14)
            r3.add(r11)
            r11 = 1
            int r10 = r10 + r11
            goto L_0x0245
        L_0x025e:
            if (r26 != 0) goto L_0x027a
            java.util.Iterator r9 = r3.iterator()
        L_0x0264:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x027a
            java.lang.Object r10 = r9.next()
            v1d r10 = (defpackage.v1d) r10
            int r11 = r10.a
            r14 = 40010(0x9c4a, float:5.6066E-41)
            if (r11 != r14) goto L_0x0264
            r3.remove(r10)
        L_0x027a:
            if (r4 == 0) goto L_0x02a1
            java.util.AbstractCollection r9 = r4.x0
            if (r9 == 0) goto L_0x02a1
            java.util.Iterator r9 = r9.iterator()
        L_0x0284:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x02a1
            java.lang.Object r10 = r9.next()
            bya r10 = (defpackage.bya) r10
            java.lang.String r11 = r10.a
            v1d r14 = new v1d
            android.os.Bundle r10 = r10.o
            if (r10 != 0) goto L_0x029a
            android.os.Bundle r10 = android.os.Bundle.EMPTY
        L_0x029a:
            r14.<init>(r11, r10)
            r3.add(r14)
            goto L_0x0284
        L_0x02a1:
            w1d r9 = new w1d
            r9.<init>(r3)
            if (r4 != 0) goto L_0x02b0
            po5 r3 = defpackage.ws6.b
            e8c r3 = defpackage.e8c.X
        L_0x02ac:
            r24 = r9
            goto L_0x032d
        L_0x02b0:
            java.util.AbstractCollection r3 = r4.x0
            if (r3 != 0) goto L_0x02b9
            po5 r3 = defpackage.ws6.b
            e8c r3 = defpackage.e8c.X
            goto L_0x02ac
        L_0x02b9:
            r11 = r24
            r10 = 4
            defpackage.ete.l(r10, r11)
            java.lang.Object[] r11 = new java.lang.Object[r10]
            java.util.Iterator r3 = r3.iterator()
            r10 = 0
        L_0x02c6:
            boolean r14 = r3.hasNext()
            if (r14 == 0) goto L_0x0327
            java.lang.Object r14 = r3.next()
            bya r14 = (defpackage.bya) r14
            java.lang.String r15 = r14.a
            android.os.Bundle r1 = r14.o
            if (r1 == 0) goto L_0x02e6
            r23 = r3
            java.lang.String r3 = "androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT"
            r24 = r9
            r9 = 0
            int r3 = r1.getInt(r3, r9)
            r34 = r3
            goto L_0x02ec
        L_0x02e6:
            r23 = r3
            r24 = r9
            r34 = 0
        L_0x02ec:
            android.os.Bundle r38 = android.os.Bundle.EMPTY
            v1d r3 = new v1d
            if (r1 != 0) goto L_0x02f4
            r1 = r38
        L_0x02f4:
            r3.<init>(r15, r1)
            t33 r1 = new t33
            java.lang.CharSequence r9 = r14.b
            r39 = 1
            r33 = -1
            int r14 = r14.c
            r36 = 0
            r31 = r1
            r32 = r3
            r35 = r14
            r37 = r9
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39)
            r3 = 1
            int r9 = r10 + 1
            int r3 = r11.length
            if (r3 >= r9) goto L_0x031e
            int r3 = r11.length
            int r3 = defpackage.ms6.h(r3, r9)
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r11, r3)
            r11 = r3
        L_0x031e:
            r11[r10] = r1
            r10 = r9
            r3 = r23
            r9 = r24
            r1 = 0
            goto L_0x02c6
        L_0x0327:
            r24 = r9
            e8c r3 = defpackage.ws6.h(r10, r11)
        L_0x032d:
            r9 = r24
            goto L_0x033a
        L_0x0330:
            java.lang.Object r1 = r5.b
            r9 = r1
            w1d r9 = (defpackage.w1d) r9
            java.lang.Object r1 = r5.d
            r3 = r1
            ws6 r3 = (defpackage.ws6) r3
        L_0x033a:
            w38 r1 = r2.a
            if (r1 == 0) goto L_0x0341
            int r10 = r1.c
            goto L_0x0342
        L_0x0341:
            r10 = 0
        L_0x0342:
            ui5 r11 = new ui5
            r14 = 1
            r11.<init>(r14)
            if (r4 != 0) goto L_0x034f
            r25 = r3
            r14 = 0
            goto L_0x0353
        L_0x034f:
            long r14 = r4.X
            r25 = r3
        L_0x0353:
            r2 = 4
            boolean r27 = defpackage.qa7.y(r14, r2)
            if (r27 == 0) goto L_0x0366
            r2 = 2
            boolean r2 = defpackage.qa7.y(r14, r2)
            if (r2 != 0) goto L_0x0364
            goto L_0x0366
        L_0x0364:
            r2 = 1
            goto L_0x036f
        L_0x0366:
            r2 = 512(0x200, double:2.53E-321)
            boolean r2 = defpackage.qa7.y(r14, r2)
            if (r2 == 0) goto L_0x0372
            goto L_0x0364
        L_0x036f:
            r11.a(r2)
        L_0x0372:
            r2 = 16384(0x4000, double:8.0948E-320)
            boolean r2 = defpackage.qa7.y(r14, r2)
            r3 = 2
            if (r2 == 0) goto L_0x037e
            r11.a(r3)
        L_0x037e:
            r2 = r4
            r3 = 32768(0x8000, double:1.61895E-319)
            boolean r3 = defpackage.qa7.y(r14, r3)
            if (r3 == 0) goto L_0x0390
            r3 = 1024(0x400, double:5.06E-321)
            boolean r3 = defpackage.qa7.y(r14, r3)
            if (r3 != 0) goto L_0x03b2
        L_0x0390:
            r3 = 65536(0x10000, double:3.2379E-319)
            boolean r3 = defpackage.qa7.y(r14, r3)
            if (r3 == 0) goto L_0x03a1
            r3 = 2048(0x800, double:1.0118E-320)
            boolean r3 = defpackage.qa7.y(r14, r3)
            if (r3 != 0) goto L_0x03b2
        L_0x03a1:
            r3 = 131072(0x20000, double:6.47582E-319)
            boolean r3 = defpackage.qa7.y(r14, r3)
            if (r3 == 0) goto L_0x03bc
            r3 = 8192(0x2000, double:4.0474E-320)
            boolean r3 = defpackage.qa7.y(r14, r3)
            if (r3 == 0) goto L_0x03bc
        L_0x03b2:
            r3 = 31
            r4 = 2
            int[] r3 = new int[]{r3, r4}
            r11.c(r3)
        L_0x03bc:
            r3 = 8
            boolean r3 = defpackage.qa7.y(r14, r3)
            if (r3 == 0) goto L_0x03c9
            r3 = 11
            r11.a(r3)
        L_0x03c9:
            r3 = 64
            boolean r3 = defpackage.qa7.y(r14, r3)
            if (r3 == 0) goto L_0x03d6
            r3 = 12
            r11.a(r3)
        L_0x03d6:
            r3 = 256(0x100, double:1.265E-321)
            boolean r3 = defpackage.qa7.y(r14, r3)
            r4 = 5
            r84 = r9
            if (r3 == 0) goto L_0x03e9
            r3 = 4
            int[] r9 = new int[]{r4, r3}
            r11.c(r9)
        L_0x03e9:
            r3 = r5
            r4 = 32
            boolean r4 = defpackage.qa7.y(r14, r4)
            if (r4 == 0) goto L_0x03fd
            r4 = 9
            r5 = 8
            int[] r4 = new int[]{r4, r5}
            r11.c(r4)
        L_0x03fd:
            r4 = 16
            boolean r4 = defpackage.qa7.y(r14, r4)
            r5 = 7
            if (r4 == 0) goto L_0x040e
            r4 = 6
            int[] r9 = new int[]{r5, r4}
            r11.c(r9)
        L_0x040e:
            r4 = r6
            r5 = 4194304(0x400000, double:2.0722615E-317)
            boolean r5 = defpackage.qa7.y(r14, r5)
            if (r5 == 0) goto L_0x041d
            r5 = 13
            r11.a(r5)
        L_0x041d:
            r5 = 1
            boolean r5 = defpackage.qa7.y(r14, r5)
            r6 = 3
            if (r5 == 0) goto L_0x0429
            r11.a(r6)
        L_0x0429:
            r5 = 34
            r9 = 26
            r6 = 1
            if (r10 != r6) goto L_0x0439
            int[] r5 = new int[]{r9, r5}
            r11.c(r5)
        L_0x0437:
            r5 = 6
            goto L_0x0448
        L_0x0439:
            r6 = 2
            if (r10 != r6) goto L_0x0437
            r6 = 25
            r10 = 33
            int[] r5 = new int[]{r9, r5, r6, r10}
            r11.c(r5)
            goto L_0x0437
        L_0x0448:
            int[] r5 = new int[r5]
            r5 = {23, 17, 18, 16, 21, 32} // fill-array
            r11.c(r5)
            r5 = 4
            long r5 = r29 & r5
            r9 = 0
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x046c
            r5 = 20
            r11.a(r5)
            r5 = 4096(0x1000, double:2.0237E-320)
            boolean r5 = defpackage.qa7.y(r14, r5)
            if (r5 == 0) goto L_0x046c
            r5 = 10
            r11.a(r5)
        L_0x046c:
            if (r26 == 0) goto L_0x048a
            r5 = 262144(0x40000, double:1.295163E-318)
            boolean r5 = defpackage.qa7.y(r14, r5)
            if (r5 == 0) goto L_0x047c
            r5 = 15
            r11.a(r5)
        L_0x047c:
            r5 = 2097152(0x200000, double:1.0361308E-317)
            boolean r5 = defpackage.qa7.y(r14, r5)
            if (r5 == 0) goto L_0x048a
            r5 = 14
            r11.a(r5)
        L_0x048a:
            eya r5 = new eya
            wi5 r6 = r11.e()
            r5.<init>(r6)
            androidx.media3.common.PlaybackException r50 = defpackage.qa7.m(r2)
            if (r2 != 0) goto L_0x04a0
            r6 = 0
            r11 = r85
        L_0x049c:
            r9 = r21
            goto L_0x0564
        L_0x04a0:
            int r6 = r2.a
            r9 = 7
            if (r6 == r9) goto L_0x04a9
            int r6 = r2.Y
            if (r6 != 0) goto L_0x04ad
        L_0x04a9:
            r11 = r85
            goto L_0x0561
        L_0x04ad:
            int r6 = defpackage.qa7.t(r6)
            f2d r9 = new f2d
            java.lang.CharSequence r10 = r2.Z
            if (r10 == 0) goto L_0x04bf
            java.lang.String r10 = r10.toString()
            r11 = r85
            goto L_0x0554
        L_0x04bf:
            r10 = -100
            r11 = r85
            android.content.Context r14 = r11.a
            if (r6 == r10) goto L_0x054e
            r10 = 1
            if (r6 == r10) goto L_0x0547
            r10 = -6
            if (r6 == r10) goto L_0x0540
            r10 = -5
            if (r6 == r10) goto L_0x0539
            r10 = -4
            if (r6 == r10) goto L_0x0532
            r10 = -3
            if (r6 == r10) goto L_0x052b
            r10 = -2
            if (r6 == r10) goto L_0x0524
            switch(r6) {
                case -110: goto L_0x051d;
                case -109: goto L_0x0516;
                case -108: goto L_0x050f;
                case -107: goto L_0x0508;
                case -106: goto L_0x0501;
                case -105: goto L_0x04fa;
                case -104: goto L_0x04f3;
                case -103: goto L_0x04ec;
                case -102: goto L_0x04e4;
                default: goto L_0x04dc;
            }
        L_0x04dc:
            int r10 = defpackage.cub.error_message_fallback
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x04e4:
            int r10 = defpackage.cub.error_message_authentication_expired
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x04ec:
            int r10 = defpackage.cub.error_message_premium_account_required
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x04f3:
            int r10 = defpackage.cub.error_message_concurrent_stream_limit
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x04fa:
            int r10 = defpackage.cub.error_message_parental_control_restricted
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x0501:
            int r10 = defpackage.cub.error_message_not_available_in_region
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x0508:
            int r10 = defpackage.cub.error_message_skip_limit_reached
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x050f:
            int r10 = defpackage.cub.error_message_setup_required
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x0516:
            int r10 = defpackage.cub.error_message_end_of_playlist
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x051d:
            int r10 = defpackage.cub.error_message_content_already_playing
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x0524:
            int r10 = defpackage.cub.error_message_invalid_state
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x052b:
            int r10 = defpackage.cub.error_message_bad_value
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x0532:
            int r10 = defpackage.cub.error_message_permission_denied
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x0539:
            int r10 = defpackage.cub.error_message_io
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x0540:
            int r10 = defpackage.cub.error_message_not_supported
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x0547:
            int r10 = defpackage.cub.error_message_info_cancelled
            java.lang.String r10 = r14.getString(r10)
            goto L_0x0554
        L_0x054e:
            int r10 = defpackage.cub.error_message_disconnected
            java.lang.String r10 = r14.getString(r10)
        L_0x0554:
            android.os.Bundle r14 = r2.z0
            if (r14 == 0) goto L_0x0559
            goto L_0x055b
        L_0x0559:
            android.os.Bundle r14 = android.os.Bundle.EMPTY
        L_0x055b:
            r9.<init>(r10, r6, r14)
            r6 = r9
            goto L_0x049c
        L_0x0561:
            r6 = 0
            goto L_0x049c
        L_0x0564:
            long r14 = defpackage.qa7.c(r2, r4, r9)
            long r47 = defpackage.qa7.a(r2, r4, r9)
            r16 = r5
            r21 = r6
            long r5 = defpackage.qa7.a(r2, r4, r9)
            r26 = r12
            long r11 = defpackage.qa7.d(r4)
            int r40 = defpackage.am7.e(r5, r11)
            long r5 = defpackage.qa7.a(r2, r4, r9)
            long r11 = defpackage.qa7.c(r2, r4, r9)
            long r41 = r5 - r11
            if (r4 != 0) goto L_0x058c
        L_0x058a:
            r5 = 0
            goto L_0x0599
        L_0x058c:
            java.lang.String r5 = "android.media.metadata.ADVERTISEMENT"
            long r5 = r4.a(r5)
            r11 = 0
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 == 0) goto L_0x058a
            r5 = 1
        L_0x0599:
            if (r2 != 0) goto L_0x05a0
            wxa r6 = defpackage.wxa.d
        L_0x059d:
            r56 = r6
            goto L_0x05a8
        L_0x05a0:
            wxa r6 = new wxa
            float r11 = r2.o
            r6.<init>(r11)
            goto L_0x059d
        L_0x05a8:
            if (r1 != 0) goto L_0x05af
            k20 r6 = defpackage.k20.g
        L_0x05ac:
            r64 = r6
            goto L_0x05d0
        L_0x05af:
            m20 r6 = r1.b
            if (r6 != 0) goto L_0x05b6
            k20 r6 = defpackage.k20.g
            goto L_0x05ac
        L_0x05b6:
            l20 r6 = r6.a
            int r33 = r6.a()
            int r34 = r6.b()
            int r35 = r6.c()
            k20 r6 = new k20
            r36 = 1
            r37 = 0
            r32 = r6
            r32.<init>(r33, r34, r35, r36, r37)
            goto L_0x05ac
        L_0x05d0:
            if (r2 != 0) goto L_0x05d5
        L_0x05d2:
            r69 = 0
            goto L_0x05dd
        L_0x05d5:
            int r6 = r2.a
            switch(r6) {
                case 3: goto L_0x05db;
                case 4: goto L_0x05db;
                case 5: goto L_0x05db;
                case 6: goto L_0x05db;
                case 7: goto L_0x05da;
                case 8: goto L_0x05da;
                case 9: goto L_0x05db;
                case 10: goto L_0x05db;
                case 11: goto L_0x05db;
                default: goto L_0x05da;
            }
        L_0x05da:
            goto L_0x05d2
        L_0x05db:
            r69 = 1
        L_0x05dd:
            if (r2 != 0) goto L_0x05e1
        L_0x05df:
            r6 = 1
            goto L_0x0616
        L_0x05e1:
            int r6 = r2.a     // Catch:{ LegacyConversions$ConversionException -> 0x0619 }
            switch(r6) {
                case 0: goto L_0x05df;
                case 1: goto L_0x05df;
                case 2: goto L_0x05fe;
                case 3: goto L_0x05fc;
                case 4: goto L_0x05fa;
                case 5: goto L_0x05fa;
                case 6: goto L_0x05fa;
                case 7: goto L_0x05df;
                case 8: goto L_0x05df;
                case 9: goto L_0x05fa;
                case 10: goto L_0x05fa;
                case 11: goto L_0x05fa;
                default: goto L_0x05e6;
            }     // Catch:{ LegacyConversions$ConversionException -> 0x0619 }
        L_0x05e6:
            androidx.media3.session.LegacyConversions$ConversionException r9 = new androidx.media3.session.LegacyConversions$ConversionException     // Catch:{ LegacyConversions$ConversionException -> 0x0619 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ LegacyConversions$ConversionException -> 0x0619 }
            java.lang.String r11 = "Invalid state of PlaybackStateCompat: "
            r10.<init>(r11)     // Catch:{ LegacyConversions$ConversionException -> 0x0619 }
            r10.append(r6)     // Catch:{ LegacyConversions$ConversionException -> 0x0619 }
            java.lang.String r6 = r10.toString()     // Catch:{ LegacyConversions$ConversionException -> 0x0619 }
            r9.<init>(r6)     // Catch:{ LegacyConversions$ConversionException -> 0x0619 }
            throw r9     // Catch:{ LegacyConversions$ConversionException -> 0x0619 }
        L_0x05fa:
            r6 = 2
            goto L_0x0616
        L_0x05fc:
            r6 = 3
            goto L_0x0616
        L_0x05fe:
            long r11 = defpackage.qa7.d(r4)     // Catch:{ LegacyConversions$ConversionException -> 0x0619 }
            r28 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r11 > r28 ? 1 : (r11 == r28 ? 0 : -1))
            if (r6 != 0) goto L_0x060c
            goto L_0x05fc
        L_0x060c:
            long r9 = defpackage.qa7.c(r2, r4, r9)     // Catch:{ LegacyConversions$ConversionException -> 0x0619 }
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 >= 0) goto L_0x0615
            goto L_0x05fc
        L_0x0615:
            r6 = 4
        L_0x0616:
            r72 = r6
            goto L_0x0642
        L_0x0619:
            int r6 = r2.a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Received invalid playback state "
            r9.<init>(r10)
            r9.append(r6)
            java.lang.String r6 = " from package "
            r9.append(r6)
            r6 = r20
            r9.append(r6)
            java.lang.String r6 = ". Keeping the previous state."
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            defpackage.ez3.A(r6)
            java.lang.Object r6 = r3.a
            fza r6 = (defpackage.fza) r6
            int r6 = r6.y
            goto L_0x0616
        L_0x0642:
            if (r2 != 0) goto L_0x0647
            r73 = 0
            goto L_0x0651
        L_0x0647:
            int r6 = r2.a
            r9 = 3
            if (r6 != r9) goto L_0x064e
            r6 = 1
            goto L_0x064f
        L_0x064e:
            r6 = 0
        L_0x064f:
            r73 = r6
        L_0x0651:
            if (r1 != 0) goto L_0x0658
            uf4 r6 = defpackage.uf4.e
        L_0x0655:
            r66 = r6
            goto L_0x067d
        L_0x0658:
            mu0 r6 = new mu0
            int r9 = r1.a
            r10 = 2
            if (r9 != r10) goto L_0x0661
            r9 = 1
            goto L_0x0662
        L_0x0661:
            r9 = 0
        L_0x0662:
            r6.<init>(r9)
            int r10 = r1.d
            r6.d = r10
            if (r9 != 0) goto L_0x0670
            if (r19 != 0) goto L_0x066e
            goto L_0x0670
        L_0x066e:
            r9 = 0
            goto L_0x0671
        L_0x0670:
            r9 = 1
        L_0x0671:
            defpackage.oyb.d(r9)
            r9 = r19
            r6.e = r9
            uf4 r6 = r6.b()
            goto L_0x0655
        L_0x067d:
            if (r1 != 0) goto L_0x0682
            r67 = 0
            goto L_0x0686
        L_0x0682:
            int r6 = r1.e
            r67 = r6
        L_0x0686:
            if (r1 != 0) goto L_0x068b
            r68 = 0
            goto L_0x0694
        L_0x068b:
            int r1 = r1.e
            if (r1 != 0) goto L_0x0691
            r1 = 1
            goto L_0x0692
        L_0x0691:
            r1 = 0
        L_0x0692:
            r68 = r1
        L_0x0694:
            java.lang.Object r1 = r3.a
            fza r1 = (defpackage.fza) r1
            long r9 = r1.A
            int r3 = r7.p()
            if (r8 < r3) goto L_0x06a2
            r6 = 0
            goto L_0x06a8
        L_0x06a2:
            akb r3 = r7.v(r8)
            l68 r6 = r3.a
        L_0x06a8:
            jya r32 = o(r8, r6, r14, r5)
            n2d r31 = new n2d
            r52 = r31
            long r34 = android.os.SystemClock.elapsedRealtime()
            r43 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r33 = r5
            r36 = r26
            r38 = r47
            r45 = r26
            r31.<init>(r32, r33, r34, r36, r38, r40, r41, r43, r45, r47)
            fza r3 = new fza
            r49 = r3
            jya r54 = defpackage.n2d.k
            r53 = r54
            r8f r59 = defpackage.r8f.e
            vw3 r65 = defpackage.vw3.c
            spe r82 = defpackage.spe.b
            mpe r83 = defpackage.mpe.C
            long r5 = r1.B
            r78 = r5
            long r5 = r1.C
            r80 = r5
            r51 = 0
            r55 = 0
            r61 = 0
            r63 = 1065353216(0x3f800000, float:1.0)
            r70 = 1
            r71 = 0
            r74 = 0
            r57 = r0
            r60 = r7
            r76 = r9
            r49.<init>(r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r78, r80, r82, r83)
            yd3 r5 = new yd3
            r6 = r87
            android.os.Bundle r1 = r6.h
            r31 = r5
            r32 = r3
            r33 = r84
            r34 = r16
            r35 = r25
            r36 = r1
            r37 = r21
            r31.<init>(r32, r33, r34, r35, r36, r37)
            r1 = r85
            t48 r8 = r1.k
            yd3 r9 = r1.m
            r10 = r18
            long r10 = r10.Y
            java.lang.Object r12 = r9.a
            fza r12 = (defpackage.fza) r12
            vje r12 = r12.j
            boolean r12 = r12.q()
            boolean r13 = r7.q()
            if (r12 == 0) goto L_0x072a
            if (r13 == 0) goto L_0x072a
            r0 = 0
            r3 = 0
            goto L_0x07a4
        L_0x072a:
            if (r12 == 0) goto L_0x073a
            if (r13 != 0) goto L_0x073a
            r12 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            r12 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            goto L_0x07a4
        L_0x073a:
            r12 = 3
            java.lang.Object r9 = r9.a
            fza r9 = (defpackage.fza) r9
            l68 r9 = r9.s()
            defpackage.oyb.l(r9)
            boolean r7 = r7.r(r9)
            if (r7 != 0) goto L_0x0756
            r7 = 4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            goto L_0x07a4
        L_0x0756:
            l68 r3 = r3.s()
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x079a
            cya r3 = r8.b
            a88 r7 = r8.c
            long r7 = defpackage.qa7.c(r3, r7, r10)
            long r2 = defpackage.qa7.c(r2, r4, r10)
            r9 = 0
            int r4 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x0781
            r4 = 1
            if (r0 != r4) goto L_0x0781
            r0 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r17 = r0
            goto L_0x0797
        L_0x0781:
            long r7 = r7 - r2
            long r2 = java.lang.Math.abs(r7)
            r7 = 100
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0795
            r0 = 5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = r0
        L_0x0792:
            r17 = 0
            goto L_0x0797
        L_0x0795:
            r3 = 0
            goto L_0x0792
        L_0x0797:
            r0 = r17
            goto L_0x07a4
        L_0x079a:
            r0 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x07a4:
            android.util.Pair r0 = android.util.Pair.create(r3, r0)
            java.lang.Object r2 = r0.first
            r4 = r2
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r0 = r0.second
            r7 = r0
            java.lang.Integer r7 = (java.lang.Integer) r7
            r0 = r85
            r1 = r86
            r2 = r87
            r3 = r5
            r5 = r7
            r0.c0(r1, r2, r3, r4, r5)
        L_0x07bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u48.G(boolean, t48):void");
    }

    public final long G0() {
        return e0();
    }

    public final void H(int i2, boolean z) {
        if (oze.a < 23) {
            ez3.j0("Session doesn't support setting mute state at API level less than 23");
            return;
        }
        if (z != z0()) {
            fza c2 = ((fza) this.m.a).c(l(), z);
            yd3 yd3 = this.m;
            i0(new yd3(c2, (w1d) yd3.b, (eya) yd3.c, (ws6) yd3.d, (Bundle) yd3.e, (f2d) null), (Integer) null, (Integer) null);
        }
        ((v38) this.g.b).a.adjustVolume(z ? -100 : 100, i2);
    }

    public final void H0(int i2, long j2, List list) {
        int i3 = i2;
        List list2 = list;
        if (list.isEmpty()) {
            v();
            return;
        }
        fza n2 = ((fza) this.m.a).n(bkb.g.t(0, list2), new n2d(o(i3, (l68) list2.get(i3), j2 == -9223372036854775807L ? 0 : j2, false), false, SystemClock.elapsedRealtime(), -9223372036854775807L, 0, 0, 0, -9223372036854775807L, -9223372036854775807L, 0), 0);
        yd3 yd3 = this.m;
        i0(new yd3(n2, (w1d) yd3.b, (eya) yd3.c, (ws6) yd3.d, (Bundle) yd3.e, (f2d) null), (Integer) null, (Integer) null);
        if (P()) {
            K();
        }
    }

    public final uf4 I() {
        return ((fza) this.m.a).q;
    }

    public final void I0(int i2) {
        L(i2, 1);
    }

    public final void J() {
        g0(1);
    }

    public final void J0() {
        this.g.P().E.skipToNext();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        if ((!((defpackage.fza) r13.m.a).j.q()) != false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void K() {
        /*
            r13 = this;
            tje r0 = new tje
            r0.<init>()
            boolean r1 = r13.P()
            r2 = 0
            if (r1 == 0) goto L_0x001d
            yd3 r1 = r13.m
            java.lang.Object r1 = r1.a
            fza r1 = (defpackage.fza) r1
            vje r1 = r1.j
            boolean r1 = r1.q()
            r3 = 1
            r1 = r1 ^ r3
            if (r1 == 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r3 = r2
        L_0x001e:
            defpackage.oyb.k(r3)
            yd3 r1 = r13.m
            java.lang.Object r1 = r1.a
            fza r1 = (defpackage.fza) r1
            vje r3 = r1.j
            bkb r3 = (defpackage.bkb) r3
            n2d r1 = r1.c
            jya r1 = r1.a
            int r1 = r1.b
            r4 = 0
            r3.n(r1, r0, r4)
            l68 r6 = r0.c
            long r7 = r3.u(r1)
            r9 = -1
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x0066
            yd3 r6 = r13.m
            java.lang.Object r6 = r6.a
            fza r6 = (defpackage.fza) r6
            boolean r6 = r6.t
            if (r6 == 0) goto L_0x0059
            mn r6 = r13.g
            y38 r6 = r6.P()
            android.media.session.MediaController$TransportControls r6 = r6.E
            r6.play()
            goto L_0x0104
        L_0x0059:
            mn r6 = r13.g
            y38 r6 = r6.P()
            android.media.session.MediaController$TransportControls r6 = r6.E
            r6.prepare()
            goto L_0x0104
        L_0x0066:
            d68 r7 = r6.f
            android.net.Uri r8 = r7.a
            if (r8 == 0) goto L_0x009f
            yd3 r6 = r13.m
            java.lang.Object r6 = r6.a
            fza r6 = (defpackage.fza) r6
            boolean r6 = r6.t
            if (r6 == 0) goto L_0x008b
            mn r6 = r13.g
            y38 r6 = r6.P()
            android.net.Uri r8 = r7.a
            android.os.Bundle r7 = r7.c
            if (r7 != 0) goto L_0x0084
            android.os.Bundle r7 = android.os.Bundle.EMPTY
        L_0x0084:
            android.media.session.MediaController$TransportControls r6 = r6.E
            r6.playFromUri(r8, r7)
            goto L_0x0104
        L_0x008b:
            mn r6 = r13.g
            y38 r6 = r6.P()
            android.net.Uri r8 = r7.a
            android.os.Bundle r7 = r7.c
            if (r7 != 0) goto L_0x0099
            android.os.Bundle r7 = android.os.Bundle.EMPTY
        L_0x0099:
            android.media.session.MediaController$TransportControls r6 = r6.E
            r6.prepareFromUri(r8, r7)
            goto L_0x0104
        L_0x009f:
            java.lang.String r8 = r7.b
            if (r8 == 0) goto L_0x00d5
            yd3 r6 = r13.m
            java.lang.Object r6 = r6.a
            fza r6 = (defpackage.fza) r6
            boolean r6 = r6.t
            if (r6 == 0) goto L_0x00c1
            mn r6 = r13.g
            y38 r6 = r6.P()
            java.lang.String r8 = r7.b
            android.os.Bundle r7 = r7.c
            if (r7 != 0) goto L_0x00bb
            android.os.Bundle r7 = android.os.Bundle.EMPTY
        L_0x00bb:
            android.media.session.MediaController$TransportControls r6 = r6.E
            r6.playFromSearch(r8, r7)
            goto L_0x0104
        L_0x00c1:
            mn r6 = r13.g
            y38 r6 = r6.P()
            java.lang.String r8 = r7.b
            android.os.Bundle r7 = r7.c
            if (r7 != 0) goto L_0x00cf
            android.os.Bundle r7 = android.os.Bundle.EMPTY
        L_0x00cf:
            android.media.session.MediaController$TransportControls r6 = r6.E
            r6.prepareFromSearch(r8, r7)
            goto L_0x0104
        L_0x00d5:
            yd3 r8 = r13.m
            java.lang.Object r8 = r8.a
            fza r8 = (defpackage.fza) r8
            boolean r8 = r8.t
            java.lang.String r6 = r6.a
            if (r8 == 0) goto L_0x00f3
            mn r8 = r13.g
            y38 r8 = r8.P()
            android.os.Bundle r7 = r7.c
            if (r7 != 0) goto L_0x00ed
            android.os.Bundle r7 = android.os.Bundle.EMPTY
        L_0x00ed:
            android.media.session.MediaController$TransportControls r8 = r8.E
            r8.playFromMediaId(r6, r7)
            goto L_0x0104
        L_0x00f3:
            mn r8 = r13.g
            y38 r8 = r8.P()
            android.os.Bundle r7 = r7.c
            if (r7 != 0) goto L_0x00ff
            android.os.Bundle r7 = android.os.Bundle.EMPTY
        L_0x00ff:
            android.media.session.MediaController$TransportControls r8 = r8.E
            r8.prepareFromMediaId(r6, r7)
        L_0x0104:
            yd3 r6 = r13.m
            java.lang.Object r6 = r6.a
            fza r6 = (defpackage.fza) r6
            n2d r6 = r6.c
            jya r6 = r6.a
            long r6 = r6.f
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x012b
            mn r6 = r13.g
            y38 r6 = r6.P()
            yd3 r7 = r13.m
            java.lang.Object r7 = r7.a
            fza r7 = (defpackage.fza) r7
            n2d r7 = r7.c
            jya r7 = r7.a
            long r7 = r7.f
            android.media.session.MediaController$TransportControls r6 = r6.E
            r6.seekTo(r7)
        L_0x012b:
            yd3 r6 = r13.m
            java.lang.Object r6 = r6.c
            eya r6 = (defpackage.eya) r6
            r7 = 20
            boolean r6 = r6.a(r7)
            if (r6 == 0) goto L_0x015e
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r7 = r2
        L_0x013f:
            int r8 = r3.p()
            if (r7 >= r8) goto L_0x015b
            if (r7 == r1) goto L_0x0158
            long r11 = r3.u(r7)
            int r8 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r8 == 0) goto L_0x0150
            goto L_0x0158
        L_0x0150:
            r3.n(r7, r0, r4)
            l68 r8 = r0.c
            r6.add(r8)
        L_0x0158:
            int r7 = r7 + 1
            goto L_0x013f
        L_0x015b:
            r13.h(r2, r6)
        L_0x015e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u48.K():void");
    }

    public final void K0() {
        this.g.P().E.fastForward();
    }

    public final void L(int i2, int i3) {
        int i4;
        uf4 I = I();
        if (I.b <= i2 && ((i4 = I.c) == 0 || i2 <= i4)) {
            fza c2 = ((fza) this.m.a).c(i2, z0());
            yd3 yd3 = this.m;
            i0(new yd3(c2, (w1d) yd3.b, (eya) yd3.c, (ws6) yd3.d, (Bundle) yd3.e, (f2d) null), (Integer) null, (Integer) null);
        }
        ((v38) this.g.b).a.setVolumeTo(i2, i3);
    }

    public final void L0() {
        this.g.P().E.rewind();
    }

    public final boolean M() {
        return this.j;
    }

    public final void N(int i2) {
        int l2 = l();
        int i3 = I().c;
        if (i3 == 0 || l2 + 1 <= i3) {
            fza c2 = ((fza) this.m.a).c(l2 + 1, z0());
            yd3 yd3 = this.m;
            i0(new yd3(c2, (w1d) yd3.b, (eya) yd3.c, (ws6) yd3.d, (Bundle) yd3.e, (f2d) null), (Integer) null, (Integer) null);
        }
        ((v38) this.g.b).a.adjustVolume(1, i2);
    }

    public final z78 N0() {
        l68 s = ((fza) this.m.a).s();
        return s == null ? z78.J : s.d;
    }

    public final int O() {
        return -1;
    }

    public final void O0(List list) {
        W(list);
    }

    public final boolean P() {
        return ((fza) this.m.a).y != 1;
    }

    public final long P0() {
        return ((fza) this.m.a).A;
    }

    public final void Q(mpe mpe) {
    }

    public final w1d Q0() {
        return (w1d) this.m.b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0090 A[SYNTHETIC, Splitter:B:20:0x0090] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void R() {
        /*
            r12 = this;
            boolean r0 = r12.i
            if (r0 != 0) goto L_0x00af
            boolean r0 = r12.j
            if (r0 == 0) goto L_0x000a
            goto L_0x00af
        L_0x000a:
            r0 = 1
            r12.j = r0
            t48 r10 = new t48
            mn r1 = r12.g
            w38 r2 = r1.N()
            mn r1 = r12.g
            cya r1 = r1.O()
            cya r3 = j(r1)
            mn r1 = r12.g
            java.lang.Object r1 = r1.b
            v38 r1 = (defpackage.v38) r1
            android.media.session.MediaController r1 = r1.a
            android.media.MediaMetadata r1 = r1.getMetadata()
            r4 = 0
            if (r1 == 0) goto L_0x0049
            yr r5 = defpackage.a88.c
            android.os.Parcel r5 = android.os.Parcel.obtain()
            r6 = 0
            r1.writeToParcel(r5, r6)
            r5.setDataPosition(r6)
            android.os.Parcelable$Creator<a88> r6 = defpackage.a88.CREATOR
            java.lang.Object r6 = r6.createFromParcel(r5)
            a88 r6 = (defpackage.a88) r6
            r5.recycle()
            r6.b = r1
            goto L_0x004a
        L_0x0049:
            r6 = r4
        L_0x004a:
            mn r1 = r12.g
            java.lang.Object r1 = r1.b
            v38 r1 = (defpackage.v38) r1
            android.media.session.MediaController r1 = r1.a
            java.util.List r1 = r1.getQueue()
            if (r1 == 0) goto L_0x005c
            java.util.ArrayList r4 = defpackage.sc8.a(r1)
        L_0x005c:
            java.util.List r5 = i(r4)
            mn r1 = r12.g
            java.lang.Object r1 = r1.b
            v38 r1 = (defpackage.v38) r1
            android.media.session.MediaController r1 = r1.a
            java.lang.CharSequence r7 = r1.getQueueTitle()
            mn r1 = r12.g
            java.lang.Object r1 = r1.b
            v38 r1 = (defpackage.v38) r1
            uc8 r1 = r1.e
            mn6 r1 = r1.a()
            r4 = -1
            if (r1 == 0) goto L_0x0081
            int r1 = r1.getRepeatMode()     // Catch:{ RemoteException -> 0x0081 }
            r8 = r1
            goto L_0x0082
        L_0x0081:
            r8 = r4
        L_0x0082:
            mn r1 = r12.g
            java.lang.Object r1 = r1.b
            v38 r1 = (defpackage.v38) r1
            uc8 r1 = r1.e
            mn6 r1 = r1.a()
            if (r1 == 0) goto L_0x0096
            int r1 = r1.getShuffleMode()     // Catch:{ RemoteException -> 0x0096 }
            r9 = r1
            goto L_0x0097
        L_0x0096:
            r9 = r4
        L_0x0097:
            mn r1 = r12.g
            java.lang.Object r1 = r1.b
            v38 r1 = (defpackage.v38) r1
            android.media.session.MediaController r1 = r1.a
            android.os.Bundle r11 = r1.getExtras()
            r1 = r10
            r4 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r12.G(r0, r10)
        L_0x00af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u48.R():void");
    }

    public final int R0() {
        return -1;
    }

    public final void S(int i2) {
        U(i2, i2 + 1);
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [ch7, java.lang.Object] */
    public final ch7 S0(v1d v1d, Bundle bundle) {
        w1d w1d = (w1d) this.m.b;
        w1d.getClass();
        boolean contains = w1d.a.contains(v1d);
        String str = v1d.b;
        if (contains) {
            this.g.P().V(str, bundle);
            return swb.A(new p2d(0));
        }
        ? obj = new Object();
        t38 t38 = new t38(1, this.b.X, obj);
        mn mnVar = this.g;
        mnVar.getClass();
        if (!TextUtils.isEmpty(str)) {
            ((v38) mnVar.b).a.sendCommand(str, bundle, t38);
            return obj;
        }
        throw new IllegalArgumentException("command must neither be null nor empty");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void T(int r36, long r37) {
        /*
            r35 = this;
            r0 = r35
            r1 = r36
            r2 = r37
            r4 = 1
            if (r1 < 0) goto L_0x000b
            r6 = r4
            goto L_0x000c
        L_0x000b:
            r6 = 0
        L_0x000c:
            defpackage.oyb.d(r6)
            int r6 = r35.p0()
            yd3 r7 = r0.m
            java.lang.Object r7 = r7.a
            fza r7 = (defpackage.fza) r7
            vje r7 = r7.j
            boolean r8 = r7.q()
            if (r8 != 0) goto L_0x0027
            int r8 = r7.p()
            if (r1 >= r8) goto L_0x002d
        L_0x0027:
            boolean r8 = r35.n()
            if (r8 == 0) goto L_0x002e
        L_0x002d:
            return
        L_0x002e:
            r8 = 2
            if (r1 == r6) goto L_0x005a
            yd3 r10 = r0.m
            java.lang.Object r10 = r10.a
            fza r10 = (defpackage.fza) r10
            vje r10 = r10.j
            bkb r10 = (defpackage.bkb) r10
            long r10 = r10.u(r1)
            r12 = -1
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r12 == 0) goto L_0x0055
            mn r6 = r0.g
            y38 r6 = r6.P()
            android.media.session.MediaController$TransportControls r6 = r6.E
            r6.skipToQueueItem(r10)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            goto L_0x005c
        L_0x0055:
            java.lang.String r10 = "Cannot seek to new media item due to the missing queue Id at media item, mediaItemIndex="
            us8.l(r1, r10)
        L_0x005a:
            r1 = r6
            r6 = 0
        L_0x005c:
            long r10 = r35.k()
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r14 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x006c
            r2 = r10
            r14 = 0
            goto L_0x007b
        L_0x006c:
            mn r14 = r0.g
            y38 r14 = r14.P()
            android.media.session.MediaController$TransportControls r14 = r14.E
            r14.seekTo(r2)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r4)
        L_0x007b:
            r8 = 0
            if (r6 != 0) goto L_0x00a7
            long r4 = r35.e0()
            long r15 = r35.c()
            int r10 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r10 >= 0) goto L_0x008d
            r4 = r2
            goto L_0x0091
        L_0x008d:
            long r4 = java.lang.Math.max(r2, r4)
        L_0x0091:
            int r10 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            if (r10 != 0) goto L_0x0097
            r10 = 0
            goto L_0x009c
        L_0x0097:
            r10 = 100
            long r10 = r10 * r4
            long r10 = r10 / r15
            int r10 = (int) r10
        L_0x009c:
            long r11 = r4 - r2
            r33 = r4
            r26 = r10
            r27 = r11
            r31 = r15
            goto L_0x00af
        L_0x00a7:
            r27 = r8
            r33 = r27
            r31 = r12
            r26 = 0
        L_0x00af:
            boolean r4 = r7.q()
            if (r4 != 0) goto L_0x00c2
            tje r4 = new tje
            r4.<init>()
            tje r4 = r7.n(r1, r4, r8)
            l68 r4 = r4.c
        L_0x00c0:
            r5 = 0
            goto L_0x00c4
        L_0x00c2:
            r4 = 0
            goto L_0x00c0
        L_0x00c4:
            jya r18 = o(r1, r4, r2, r5)
            yd3 r1 = r0.m
            java.lang.Object r1 = r1.a
            fza r1 = (defpackage.fza) r1
            n2d r2 = new n2d
            r17 = r2
            long r20 = android.os.SystemClock.elapsedRealtime()
            r29 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r19 = 0
            r22 = r31
            r24 = r33
            r17.<init>(r18, r19, r20, r22, r24, r26, r27, r29, r31, r33)
            fza r1 = r1.j(r2)
            int r2 = r1.y
            r3 = 1
            if (r2 == r3) goto L_0x00f3
            r2 = 2
            r3 = 0
            fza r1 = r1.f(r2, r3)
        L_0x00f3:
            r8 = r1
            yd3 r1 = new yd3
            yd3 r2 = r0.m
            java.lang.Object r3 = r2.b
            r9 = r3
            w1d r9 = (defpackage.w1d) r9
            java.lang.Object r3 = r2.e
            r12 = r3
            android.os.Bundle r12 = (android.os.Bundle) r12
            r13 = 0
            java.lang.Object r3 = r2.c
            r10 = r3
            eya r10 = (defpackage.eya) r10
            java.lang.Object r2 = r2.d
            r11 = r2
            ws6 r11 = (defpackage.ws6) r11
            r7 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r0.i0(r1, r14, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u48.T(int, long):void");
    }

    public final int T0() {
        return -1;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [ms6, ts6] */
    public final void U(int i2, int i3) {
        oyb.d(i2 >= 0 && i3 >= i2);
        int p = x0().p();
        int min = Math.min(i3, p);
        if (i2 < p && i2 != min) {
            bkb bkb = (bkb) ((fza) this.m.a).j;
            bkb.getClass();
            ? ms6 = new ms6(4);
            ws6 ws6 = bkb.e;
            ms6.e(ws6.subList(0, i2));
            ms6.e(ws6.subList(min, ws6.size()));
            bkb bkb2 = new bkb(ms6.j(), bkb.f);
            int p0 = p0();
            int i4 = min - i2;
            if (p0 >= i2) {
                p0 = p0 < min ? -1 : p0 - i4;
            }
            if (p0 == -1) {
                p0 = oze.j(i2, 0, bkb2.p() - 1);
                ez3.j0("Currently playing item is removed. Assumes item at " + p0 + " is the new current item");
            }
            fza m2 = ((fza) this.m.a).m(bkb2, p0);
            yd3 yd3 = this.m;
            i0(new yd3(m2, (w1d) yd3.b, (eya) yd3.c, (ws6) yd3.d, (Bundle) yd3.e, (f2d) null), (Integer) null, (Integer) null);
            if (P()) {
                while (i2 < min && i2 < this.k.d.size()) {
                    this.g.U(((sc8) this.k.d.get(i2)).a);
                    i2++;
                }
            }
        }
    }

    public final void U0(l68 l68) {
        t(l68, -9223372036854775807L);
    }

    public final void V() {
        this.g.P().E.skipToPrevious();
    }

    public final ws6 V0() {
        return (ws6) this.m.d;
    }

    public final void W(List list) {
        H0(0, -9223372036854775807L, list);
    }

    public final PlaybackException X() {
        return ((fza) this.m.a).a;
    }

    public final void Y(boolean z) {
        fza fza = (fza) this.m.a;
        if (fza.t != z) {
            this.n = am7.p(fza, this.n, this.o, this.b.Y);
            this.o = SystemClock.elapsedRealtime();
            fza d2 = ((fza) this.m.a).d(1, 0, z);
            yd3 yd3 = this.m;
            i0(new yd3(d2, (w1d) yd3.b, (eya) yd3.c, (ws6) yd3.d, (Bundle) yd3.e, (f2d) null), (Integer) null, (Integer) null);
            if (P() && (!((fza) this.m.a).j.q())) {
                if (z) {
                    this.g.P().E.play();
                } else {
                    this.g.P().E.pause();
                }
            }
        }
    }

    public final void Z(int i2) {
        T(i2, 0);
    }

    public final boolean a() {
        return ((fza) this.m.a).v;
    }

    public final long a0() {
        return ((fza) this.m.a).B;
    }

    public final boolean b() {
        return false;
    }

    public final long b0() {
        return k();
    }

    public final long c() {
        return ((fza) this.m.a).c.d;
    }

    public final void c0(boolean z, t48 t48, yd3 yd3, Integer num, Integer num2) {
        t48 t482 = this.k;
        yd3 yd32 = this.m;
        if (t482 != t48) {
            this.k = new t48(t48);
        }
        this.l = this.k;
        this.m = yd3;
        boolean z2 = false;
        r38 r38 = this.b;
        ws6 ws6 = (ws6) yd3.d;
        if (z) {
            r38.j();
            if (!((ws6) yd32.d).equals(ws6)) {
                if (Looper.myLooper() == r38.X.getLooper()) {
                    z2 = true;
                }
                oyb.k(z2);
                p38 p38 = r38.o;
                p38.getClass();
                p38.r();
                p38.g();
                return;
            }
            return;
        }
        vje vje = ((fza) yd32.a).j;
        fza fza = (fza) yd3.a;
        boolean equals = vje.equals(fza.j);
        qh7 qh7 = this.d;
        if (!equals) {
            qh7.c(0, new p48(yd3, 4));
        }
        if (!oze.a(t482.e, t48.e)) {
            qh7.c(15, new p48(yd3, 5));
        }
        if (num != null) {
            qh7.c(11, new xz(yd32, yd3, num, 16));
        }
        if (num2 != null) {
            qh7.c(1, new e44(yd3, 28, num2));
        }
        cya cya = t482.b;
        boolean z3 = cya != null && cya.a == 7;
        cya cya2 = t48.b;
        boolean z4 = cya2 != null && cya2.a == 7;
        if (!z3 || !z4 ? z3 != z4 : cya.Y != cya2.Y || !TextUtils.equals(cya.Z, cya2.Z)) {
            PlaybackException m2 = qa7.m(cya2);
            qh7.c(10, new k48(2, m2));
            if (m2 != null) {
                qh7.c(10, new k48(3, m2));
            }
        }
        if (t482.c != t48.c) {
            qh7.c(14, new q48(this));
        }
        fza fza2 = (fza) yd32.a;
        if (fza2.y != fza.y) {
            qh7.c(4, new p48(yd3, 6));
        }
        if (fza2.t != fza.t) {
            qh7.c(5, new p48(yd3, 7));
        }
        if (fza2.v != fza.v) {
            qh7.c(7, new p48(yd3, 8));
        }
        if (!fza2.g.equals(fza.g)) {
            qh7.c(12, new p48(yd3, 9));
        }
        if (fza2.h != fza.h) {
            qh7.c(8, new p48(yd3, 10));
        }
        if (fza2.i != fza.i) {
            qh7.c(9, new p48(yd3, 11));
        }
        if (!fza2.o.equals(fza.o)) {
            qh7.c(20, new p48(yd3, 0));
        }
        if (!fza2.q.equals(fza.q)) {
            qh7.c(29, new p48(yd3, 1));
        }
        if (!(fza2.r == fza.r && fza2.s == fza.s)) {
            qh7.c(30, new p48(yd3, 2));
        }
        if (!((eya) yd32.c).equals((eya) yd3.c)) {
            qh7.c(13, new p48(yd3, 3));
        }
        if (!((w1d) yd32.b).equals((w1d) yd3.b)) {
            r38.getClass();
            oyb.k(Looper.myLooper() == r38.X.getLooper());
            r38.o.e();
        }
        if (!((ws6) yd32.d).equals(ws6)) {
            r38.getClass();
            oyb.k(Looper.myLooper() == r38.X.getLooper());
            p38 p382 = r38.o;
            p382.getClass();
            p38.r();
            p382.g();
        }
        if (((f2d) yd3.f) != null) {
            r38.getClass();
            if (Looper.myLooper() == r38.X.getLooper()) {
                z2 = true;
            }
            oyb.k(z2);
            r38.o.getClass();
        }
        qh7.b();
    }

    public final void connect() {
        m3d m3d = this.c;
        int type = m3d.a.getType();
        r38 r38 = this.b;
        if (type == 0) {
            Object c2 = m3d.a.c();
            oyb.l(c2);
            r38.G(new zo5(this, 16, (uc8) c2));
            r38.X.post(new r48(this, 0));
            return;
        }
        r38.G(new r48(this, 1));
    }

    public final wxa d() {
        return ((fza) this.m.a).g;
    }

    public final void d0(int i2, List list) {
        oyb.d(i2 >= 0);
        if (!list.isEmpty()) {
            bkb bkb = (bkb) ((fza) this.m.a).j;
            if (bkb.q()) {
                H0(0, -9223372036854775807L, list);
                return;
            }
            int min = Math.min(i2, x0().p());
            bkb t = bkb.t(min, list);
            int p0 = p0();
            int size = list.size();
            if (p0 >= min) {
                p0 += size;
            }
            fza m2 = ((fza) this.m.a).m(t, p0);
            yd3 yd3 = this.m;
            i0(new yd3(m2, (w1d) yd3.b, (eya) yd3.c, (ws6) yd3.d, (Bundle) yd3.e, (f2d) null), (Integer) null, (Integer) null);
            if (P()) {
                h(min, list);
            }
        }
    }

    public final float e() {
        return 1.0f;
    }

    public final long e0() {
        return ((fza) this.m.a).c.e;
    }

    public final void f(wxa wxa) {
        if (!wxa.equals(d())) {
            fza e2 = ((fza) this.m.a).e(wxa);
            yd3 yd3 = this.m;
            i0(new yd3(e2, (w1d) yd3.b, (eya) yd3.c, (ws6) yd3.d, (Bundle) yd3.e, (f2d) null), (Integer) null, (Integer) null);
        }
        y38 P = this.g.P();
        float f2 = wxa.a;
        if (f2 != 0.0f) {
            P.E.setPlaybackSpeed(f2);
            return;
        }
        throw new IllegalArgumentException("speed must not be zero");
    }

    public final void f0() {
        this.g.P().E.skipToNext();
    }

    public final void g(float f2) {
        ez3.j0("Session doesn't support setting player volume");
    }

    public final void g0(int i2) {
        int l2 = l() - 1;
        if (l2 >= I().b) {
            fza c2 = ((fza) this.m.a).c(l2, z0());
            yd3 yd3 = this.m;
            i0(new yd3(c2, (w1d) yd3.b, (eya) yd3.c, (ws6) yd3.d, (Bundle) yd3.e, (f2d) null), (Integer) null, (Integer) null);
        }
        ((v38) this.g.b).a.adjustVolume(-1, i2);
    }

    public final int getPlaybackState() {
        return ((fza) this.m.a).y;
    }

    public final int getRepeatMode() {
        return ((fza) this.m.a).h;
    }

    public final void h(int i2, List list) {
        ArrayList arrayList = new ArrayList();
        tw0 tw0 = new tw0(this, new AtomicInteger(0), list, arrayList, i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            byte[] bArr = ((l68) list.get(i3)).d.k;
            if (bArr == null) {
                arrayList.add((Object) null);
                tw0.run();
            } else {
                ch7 n2 = this.f.n(bArr);
                arrayList.add(n2);
                Handler handler = this.b.X;
                Objects.requireNonNull(handler);
                n2.c(tw0, new y44(handler, 0));
            }
        }
    }

    public final spe h0() {
        return spe.b;
    }

    public final void i0(yd3 yd3, Integer num, Integer num2) {
        c0(false, this.k, yd3, num, num2);
    }

    public final boolean isConnected() {
        return this.j;
    }

    public final boolean j0() {
        return this.j;
    }

    public final long k() {
        long p = am7.p((fza) this.m.a, this.n, this.o, this.b.Y);
        this.n = p;
        return p;
    }

    public final z78 k0() {
        return ((fza) this.m.a).m;
    }

    public final int l() {
        fza fza = (fza) this.m.a;
        if (fza.q.a == 1) {
            return fza.r;
        }
        mn mnVar = this.g;
        if (mnVar == null) {
            return 0;
        }
        w38 N = mnVar.N();
        gt6 gt6 = qa7.a;
        if (N == null) {
            return 0;
        }
        return N.e;
    }

    public final vw3 l0() {
        ez3.j0("Session doesn't support getting Cue");
        return vw3.c;
    }

    public final void m(Surface surface) {
        ez3.j0("Session doesn't support setting Surface");
    }

    public final void m0(k20 k20, boolean z) {
        ez3.j0("Legacy session doesn't support setting audio attributes remotely");
    }

    public final boolean n() {
        return ((fza) this.m.a).c.b;
    }

    public final void n0(z78 z78) {
        ez3.j0("Session doesn't support setting playlist metadata");
    }

    public final int o0() {
        return -1;
    }

    public final long p() {
        return -9223372036854775807L;
    }

    public final int p0() {
        return ((fza) this.m.a).c.a.b;
    }

    public final void pause() {
        Y(false);
    }

    public final void play() {
        Y(true);
    }

    public final void prepare() {
        fza fza = (fza) this.m.a;
        if (fza.y == 1) {
            fza f2 = fza.f(fza.j.q() ? 4 : 2, (PlaybackException) null);
            yd3 yd3 = this.m;
            i0(new yd3(f2, (w1d) yd3.b, (eya) yd3.c, (ws6) yd3.d, (Bundle) yd3.e, (f2d) null), (Integer) null, (Integer) null);
            if (!((fza) this.m.a).j.q()) {
                K();
            }
        }
    }

    public final long q() {
        return ((fza) this.m.a).c.g;
    }

    public final void q0(boolean z) {
        H(1, z);
    }

    public final void r(int i2, long j2) {
        T(i2, j2);
    }

    public final void r0(hya hya) {
        this.d.e(hya);
    }

    public final void release() {
        Messenger messenger;
        if (!this.i) {
            this.i = true;
            j18 j18 = this.h;
            if (j18 != null) {
                h18 h18 = j18.a;
                qe4 qe4 = h18.f;
                if (!(qe4 == null || (messenger = h18.g) == null)) {
                    try {
                        qe4.E(7, (Bundle) null, messenger);
                    } catch (RemoteException unused) {
                    }
                }
                h18.b.disconnect();
                this.h = null;
            }
            mn mnVar = this.g;
            if (mnVar != null) {
                s48 s48 = this.e;
                if (s48 != null) {
                    if (((Set) mnVar.c).remove(s48)) {
                        try {
                            ((v38) mnVar.b).b(s48);
                        } finally {
                            s48.j((Handler) null);
                        }
                    }
                    s48.d.removeCallbacksAndMessages((Object) null);
                    this.g = null;
                } else {
                    throw new IllegalArgumentException("callback must not be null");
                }
            }
            this.j = false;
            this.d.d();
        }
    }

    public final eya s() {
        return (eya) this.m.c;
    }

    public final void s0(List list, int i2, int i3) {
        oyb.d(i2 >= 0 && i2 <= i3);
        int p = ((bkb) ((fza) this.m.a).j).p();
        if (i2 <= p) {
            int min = Math.min(i3, p);
            d0(min, list);
            U(i2, min);
        }
    }

    public final void seekTo(long j2) {
        T(p0(), j2);
    }

    public final void setPlaybackSpeed(float f2) {
        if (f2 != d().a) {
            fza e2 = ((fza) this.m.a).e(new wxa(f2));
            yd3 yd3 = this.m;
            i0(new yd3(e2, (w1d) yd3.b, (eya) yd3.c, (ws6) yd3.d, (Bundle) yd3.e, (f2d) null), (Integer) null, (Integer) null);
        }
        y38 P = this.g.P();
        if (f2 != 0.0f) {
            P.E.setPlaybackSpeed(f2);
            return;
        }
        throw new IllegalArgumentException("speed must not be zero");
    }

    public final void setRepeatMode(int i2) {
        if (i2 != getRepeatMode()) {
            fza i3 = ((fza) this.m.a).i(i2);
            yd3 yd3 = this.m;
            i0(new yd3(i3, (w1d) yd3.b, (eya) yd3.c, (ws6) yd3.d, (Bundle) yd3.e, (f2d) null), (Integer) null, (Integer) null);
        }
        y38 P = this.g.P();
        int n2 = qa7.n(i2);
        Bundle bundle = new Bundle();
        bundle.putInt(MediaSessionCompat.ACTION_ARGUMENT_REPEAT_MODE, n2);
        P.V(MediaSessionCompat.ACTION_SET_REPEAT_MODE, bundle);
    }

    public final void stop() {
        fza fza = (fza) this.m.a;
        if (fza.y != 1) {
            n2d n2d = fza.c;
            jya jya = n2d.a;
            long j2 = jya.f;
            long j3 = n2d.d;
            fza j4 = fza.j(new n2d(jya, false, SystemClock.elapsedRealtime(), j3, j2, am7.e(j2, j3), 0, -9223372036854775807L, j3, j2));
            fza fza2 = (fza) this.m.a;
            if (fza2.y != 1) {
                j4 = j4.f(1, fza2.a);
            }
            yd3 yd3 = this.m;
            i0(new yd3(j4, (w1d) yd3.b, (eya) yd3.c, (ws6) yd3.d, (Bundle) yd3.e, (f2d) null), (Integer) null, (Integer) null);
            this.g.P().E.stop();
        }
    }

    public final void t(l68 l68, long j2) {
        H0(0, j2, ws6.n(l68));
    }

    public final void t0(int i2, int i3) {
        u0(i2, i2 + 1, i3);
    }

    public final boolean u() {
        return ((fza) this.m.a).t;
    }

    public final void u0(int i2, int i3, int i4) {
        oyb.d(i2 >= 0 && i2 <= i3 && i4 >= 0);
        bkb bkb = (bkb) ((fza) this.m.a).j;
        int p = bkb.p();
        int min = Math.min(i3, p);
        int i5 = min - i2;
        int i6 = p - i5;
        int i7 = i6 - 1;
        int min2 = Math.min(i4, i6);
        if (i2 < p && i2 != min && i2 != min2) {
            int p0 = p0();
            if (p0 >= i2) {
                p0 = p0 < min ? -1 : p0 - i5;
            }
            if (p0 == -1) {
                p0 = oze.j(i2, 0, i7);
                ez3.j0("Currently playing item will be removed and added back to mimic move. Assumes item at " + p0 + " would be the new current item");
            }
            if (p0 >= min2) {
                p0 += i5;
            }
            ArrayList arrayList = new ArrayList(bkb.e);
            oze.R(arrayList, i2, min, min2);
            fza m2 = ((fza) this.m.a).m(new bkb(ws6.j(arrayList), bkb.f), p0);
            yd3 yd3 = this.m;
            i0(new yd3(m2, (w1d) yd3.b, (eya) yd3.c, (ws6) yd3.d, (Bundle) yd3.e, (f2d) null), (Integer) null, (Integer) null);
            if (P()) {
                ArrayList arrayList2 = new ArrayList();
                for (int i8 = 0; i8 < i5; i8++) {
                    arrayList2.add((sc8) this.k.d.get(i2));
                    this.g.U(((sc8) this.k.d.get(i2)).a);
                }
                for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                    this.g.t(((sc8) arrayList2.get(i9)).a, i9 + min2);
                }
            }
        }
    }

    public final void v() {
        U(0, Integer.MAX_VALUE);
    }

    public final int v0() {
        return 0;
    }

    public final void w(boolean z) {
        if (z != E0()) {
            fza k2 = ((fza) this.m.a).k(z);
            yd3 yd3 = this.m;
            i0(new yd3(k2, (w1d) yd3.b, (eya) yd3.c, (ws6) yd3.d, (Bundle) yd3.e, (f2d) null), (Integer) null, (Integer) null);
        }
        y38 P = this.g.P();
        gt6 gt6 = qa7.a;
        Bundle bundle = new Bundle();
        bundle.putInt(MediaSessionCompat.ACTION_ARGUMENT_SHUFFLE_MODE, z ? 1 : 0);
        P.V(MediaSessionCompat.ACTION_SET_SHUFFLE_MODE, bundle);
    }

    public final void w0(List list) {
        d0(Integer.MAX_VALUE, list);
    }

    public final int x() {
        return ((fza) this.m.a).c.f;
    }

    public final vje x0() {
        return ((fza) this.m.a).j;
    }

    public final long y() {
        return ((fza) this.m.a).C;
    }

    public final void z(hya hya) {
        this.d.a(hya);
    }

    public final boolean z0() {
        fza fza = (fza) this.m.a;
        if (fza.q.a == 1) {
            return fza.s;
        }
        mn mnVar = this.g;
        if (mnVar != null) {
            w38 N = mnVar.N();
            gt6 gt6 = qa7.a;
            if (N != null && N.e == 0) {
                return true;
            }
        }
        return false;
    }
}
