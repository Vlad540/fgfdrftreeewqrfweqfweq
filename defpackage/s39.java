package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.util.Size;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Surface;
import java.io.DataOutputStream;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: s39  reason: default package */
public final class s39 {
    public Object a;
    public Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;

    public s39(t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, jg8 jg8) {
        this.a = jg8;
        this.b = t97;
        this.c = t973;
        this.d = t974;
        this.e = t975;
        this.f = t972;
    }

    public static void a(y54 y54, DataOutputStream dataOutputStream) {
        Set<Map.Entry> entrySet = y54.b.entrySet();
        dataOutputStream.writeInt(entrySet.size());
        for (Map.Entry entry : entrySet) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public tp6 b(a10 r29, o10 r30) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            r2 = r30
            long r3 = r1.w0
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            g10 r4 = r2.n
            if (r3 <= 0) goto L_0x0025
            boolean r3 = r4.a()
            if (r3 != 0) goto L_0x0022
            boolean r3 = r4.b()
            if (r3 == 0) goto L_0x0025
            boolean r3 = r28.i(r29, r30)
            if (r3 != 0) goto L_0x0025
        L_0x0022:
            tp6 r0 = tp6.m
            return r0
        L_0x0025:
            java.lang.String r3 = r29.a()
            java.lang.Object r5 = r0.e
            t97 r5 = (defpackage.t97) r5
            r6 = 0
            r7 = 0
            boolean r8 = r1.X
            java.lang.String r9 = r2.r
            if (r8 == 0) goto L_0x00d2
            java.lang.Object r3 = r0.c
            t97 r3 = (defpackage.t97) r3
            java.lang.Object r3 = r3.getValue()
            bf5 r3 = (bf5) r3
            a10 r10 = r2.b
            if (r10 == 0) goto L_0x0046
            java.lang.String r11 = r10.y0
            goto L_0x0047
        L_0x0046:
            r11 = r7
        L_0x0047:
            if (r11 == 0) goto L_0x0059
            int r11 = r11.length()
            if (r11 != 0) goto L_0x0050
            goto L_0x0059
        L_0x0050:
            java.lang.String r10 = r10.y0
            mg5 r3 = (mg5) r3
            java.io.File r3 = r3.l(r10)
            goto L_0x0083
        L_0x0059:
            if (r10 == 0) goto L_0x005e
            java.lang.String r11 = r10.x0
            goto L_0x005f
        L_0x005e:
            r11 = r7
        L_0x005f:
            if (r11 == 0) goto L_0x007b
            int r11 = r11.length()
            if (r11 != 0) goto L_0x0068
            goto L_0x007b
        L_0x0068:
            int r11 = r9.length()
            if (r11 != 0) goto L_0x007b
            long r10 = r10.w0
            java.lang.String r10 = java.lang.String.valueOf(r10)
            mg5 r3 = (mg5) r3
            java.io.File r3 = r3.l(r10)
            goto L_0x0083
        L_0x007b:
            mg5 r3 = (mg5) r3
            java.lang.String r10 = r2.q
            java.io.File r3 = r3.l(r10)
        L_0x0083:
            boolean r10 = r3.exists()
            if (r10 == 0) goto L_0x008e
            android.net.Uri r3 = android.net.Uri.fromFile(r3)
            goto L_0x008f
        L_0x008e:
            r3 = r7
        L_0x008f:
            if (r9 == 0) goto L_0x00b6
            int r10 = r9.length()
            if (r10 != 0) goto L_0x0098
            goto L_0x00b6
        L_0x0098:
            java.io.File r10 = new java.io.File
            r10.<init>(r9)
            boolean r10 = r10.exists()
            if (r10 == 0) goto L_0x00b6
            int r10 = defpackage.lp.i
            java.lang.String r10 = ".mp4"
            boolean r10 = r9.endsWith(r10)
            if (r10 != 0) goto L_0x00b6
            java.lang.String r9 = defpackage.at7.y(r9)
            android.net.Uri r9 = mg5.r(r9)
            goto L_0x00cc
        L_0x00b6:
            java.lang.String r9 = r29.a()
            if (r9 == 0) goto L_0x00c2
            android.net.Uri r9 = android.net.Uri.parse(r9)
            if (r9 != 0) goto L_0x00cc
        L_0x00c2:
            java.lang.String r9 = r1.z0
            if (r9 == 0) goto L_0x00cb
            android.net.Uri r9 = android.net.Uri.parse(r9)
            goto L_0x00cc
        L_0x00cb:
            r9 = r7
        L_0x00cc:
            if (r3 != 0) goto L_0x0106
            if (r9 == 0) goto L_0x0106
            r3 = r9
            goto L_0x0106
        L_0x00d2:
            if (r9 == 0) goto L_0x00eb
            int r10 = r9.length()
            if (r10 != 0) goto L_0x00db
            goto L_0x00eb
        L_0x00db:
            java.io.File r10 = new java.io.File
            r10.<init>(r9)
            boolean r9 = r10.exists()
            if (r9 == 0) goto L_0x00eb
            android.net.Uri r9 = android.net.Uri.fromFile(r10)
            goto L_0x00ec
        L_0x00eb:
            r9 = r7
        L_0x00ec:
            if (r9 != 0) goto L_0x00f3
            android.net.Uri r3 = mg5.r(r3)
            r9 = r3
        L_0x00f3:
            java.lang.Object r3 = r5.getValue()
            wz r3 = (wz) r3
            r10 r3 = (r10) r3
            android.net.Uri r3 = r3.c(r2, r6)
            if (r9 != 0) goto L_0x0106
            if (r3 != 0) goto L_0x0106
            tp6 r0 = tp6.m
            return r0
        L_0x0106:
            j10 r10 = j10.c
            g10 r11 = g10.c
            java.lang.Object r12 = r0.f
            t97 r12 = (defpackage.t97) r12
            r13 = 1
            j10 r14 = r2.a
            if (r14 != r10) goto L_0x0129
            if (r8 == 0) goto L_0x0129
            java.lang.Object r8 = r12.getValue()
            hb2 r8 = (hb2) r8
            boolean r8 = r8.b(r13)
            if (r8 != 0) goto L_0x0126
            if (r4 == r11) goto L_0x0126
        L_0x0123:
            r24 = r13
            goto L_0x013a
        L_0x0126:
            r24 = r6
            goto L_0x013a
        L_0x0129:
            if (r14 != r10) goto L_0x0126
            java.lang.Object r8 = r12.getValue()
            hb2 r8 = (hb2) r8
            boolean r8 = r8.d()
            if (r8 != 0) goto L_0x0126
            if (r4 == r11) goto L_0x0126
            goto L_0x0123
        L_0x013a:
            if (r9 != 0) goto L_0x0144
            if (r3 != 0) goto L_0x0141
            tp6 r0 = tp6.m
            return r0
        L_0x0141:
            r17 = r3
            goto L_0x0146
        L_0x0144:
            r17 = r9
        L_0x0146:
            java.lang.Object r0 = r0.a
            jg8 r0 = (jg8) r0
            java.lang.Object r4 = r0.o
            r7e r4 = (defpackage.r7e) r4
            java.lang.Object r4 = r4.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            int r21 = r4.intValue()
            if (r3 != 0) goto L_0x0166
            java.lang.Object r3 = r5.getValue()
            wz r3 = (wz) r3
            r10 r3 = (r10) r3
            android.net.Uri r3 = r3.c(r2, r6)
        L_0x0166:
            r22 = r3
            int r3 = r1.c
            int r4 = r1.o
            hbc r23 = r0.t(r3, r4, r13)
            java.lang.String r0 = r1.x0
            if (r0 == 0) goto L_0x0178
            android.net.Uri r7 = android.net.Uri.parse(r0)
        L_0x0178:
            r26 = r7
            tp6 r0 = new tp6
            java.lang.String r2 = r2.q
            r27 = 256(0x100, float:3.59E-43)
            long r3 = r1.w0
            int r5 = r1.c
            int r6 = r1.o
            boolean r1 = r1.X
            r14 = r0
            r15 = r3
            r18 = r5
            r19 = r6
            r20 = r1
            r25 = r2
            r14.<init>(r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s39.b(a10, o10):tp6");
    }

    public c2d c() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        Size size = (Size) this.d;
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        Surface surface = new Surface(surfaceTexture);
        y1d d2 = y1d.d((r39) this.c, size);
        d2.b.c = 1;
        cs6 cs6 = new cs6(surface);
        this.a = cs6;
        ct0.a(ct0.A(cs6.e), new qe4((Object) surface, 26, (Object) surfaceTexture), pa2.j());
        d2.b((cs6) this.a, zq4.d, -1);
        z1d z1d = (z1d) this.f;
        if (z1d != null) {
            z1d.b();
        }
        z1d z1d2 = new z1d(new fp6(2, this));
        this.f = z1d2;
        d2.f = z1d2;
        return d2.c();
    }

    public cw0 d(String str) {
        return (cw0) ((HashMap) this.a).get(str);
    }

    public cw0 e(String str) {
        HashMap hashMap = (HashMap) this.a;
        cw0 cw0 = (cw0) hashMap.get(str);
        if (cw0 != null) {
            return cw0;
        }
        SparseArray sparseArray = (SparseArray) this.b;
        int size = sparseArray.size();
        int i = 0;
        int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (keyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            keyAt = i;
        }
        cw0 cw02 = new cw0(keyAt, str, y54.c);
        hashMap.put(str, cw02);
        sparseArray.put(keyAt, str);
        ((SparseBooleanArray) this.d).put(keyAt, true);
        ((ew0) this.e).q(cw02);
        return cw02;
    }

    public void f(long j) {
        ew0 ew0;
        ew0 ew02 = (ew0) this.e;
        ew02.i(j);
        ew0 ew03 = (ew0) this.f;
        if (ew03 != null) {
            ew03.i(j);
        }
        boolean f2 = ew02.f();
        SparseArray sparseArray = (SparseArray) this.b;
        HashMap hashMap = (HashMap) this.a;
        if (f2 || (ew0 = (ew0) this.f) == null || !ew0.f()) {
            ew02.j(hashMap, sparseArray);
        } else {
            ((ew0) this.f).j(hashMap, sparseArray);
            ew02.a(hashMap);
        }
        ew0 ew04 = (ew0) this.f;
        if (ew04 != null) {
            ew04.k();
            this.f = null;
        }
    }

    public void g(String str) {
        HashMap hashMap = (HashMap) this.a;
        cw0 cw0 = (cw0) hashMap.get(str);
        if (cw0 != null && cw0.c.isEmpty() && cw0.d.isEmpty()) {
            hashMap.remove(str);
            SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.d;
            int i = cw0.a;
            boolean z = sparseBooleanArray.get(i);
            ((ew0) this.e).p(cw0, z);
            SparseArray sparseArray = (SparseArray) this.b;
            if (z) {
                sparseArray.remove(i);
                sparseBooleanArray.delete(i);
                return;
            }
            sparseArray.put(i, (Object) null);
            ((SparseBooleanArray) this.c).put(i, true);
        }
    }

    public synchronized void h(iqe iqe) {
        try {
            oyb.k(((AtomicInteger) this.e).getAndDecrement() > 0);
            wx a2 = ((iqe) this.f).a();
            if (!oze.a(iqe.b, ((iqe) this.d).b)) {
                a2.b(iqe.b);
            }
            if (!oze.a(iqe.c, ((iqe) this.d).c)) {
                a2.d(iqe.c);
            }
            int i = iqe.a;
            iqe iqe2 = (iqe) this.d;
            if (i != iqe2.a) {
                a2.a = i;
            }
            int i2 = iqe.d;
            if (i2 != iqe2.d) {
                a2.b = i2;
            }
            iqe a3 = a2.a();
            this.f = a3;
            if (((AtomicInteger) this.e).get() == 0 && !((iqe) this.d).equals((iqe) this.f)) {
                ((h8e) ((zd6) this.c)).d(new ii4(this, 23, a3));
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public boolean i(a10 a10, o10 o10) {
        if (!a10.X && o10.n.b()) {
            int i = zp4.o;
            long m = ((f03) ((t97) this.b).getValue()).m();
            eq4 eq4 = eq4.MILLISECONDS;
            if (zp4.c(zp4.g(mt0.Q(m, eq4), mt0.Q(o10.o, eq4)), gpa.a) > 0) {
                return true;
            }
        }
        return false;
    }

    public void j() {
        ((ew0) this.e).h((HashMap) this.a);
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.c;
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            ((SparseArray) this.b).remove(sparseBooleanArray.keyAt(i));
        }
        sparseBooleanArray.clear();
        ((SparseBooleanArray) this.d).clear();
    }

    public s39(j93 j93, qh7 qh7, zd6 zd6, iqe iqe) {
        this.a = j93;
        this.b = qh7;
        this.c = zd6;
        this.d = iqe;
        this.f = iqe;
        this.e = new AtomicInteger();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a8, code lost:
        r11 = (android.util.Size) r0.get(0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public s39(defpackage.et1 r11, defpackage.si4 r12, defpackage.ar1 r13) {
        /*
            r10 = this;
            r10.<init>()
            g4e r0 = new g4e
            r0.<init>()
            r1 = 0
            r10.f = r1
            r39 r2 = new r39
            r2.<init>()
            r10.c = r2
            r10.e = r13
            j8e r11 = r11.b()
            r13 = 34
            android.util.Size[] r11 = r11.o(r13)
            r13 = 0
            if (r11 != 0) goto L_0x0028
            android.util.Size r11 = new android.util.Size
            r11.<init>(r13, r13)
            goto L_0x00ae
        L_0x0028:
            androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk r0 = r0.a
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = "Huawei"
            java.lang.String r2 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = "mha-l29"
            java.lang.String r2 = android.os.Build.MODEL
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0063
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r2 = r11.length
            r3 = r13
        L_0x0047:
            if (r3 >= r2) goto L_0x005b
            r4 = r11[r3]
            d63 r5 = defpackage.g4e.c
            android.util.Size r6 = defpackage.g4e.b
            int r5 = r5.compare(r4, r6)
            if (r5 < 0) goto L_0x0058
            r0.add(r4)
        L_0x0058:
            int r3 = r3 + 1
            goto L_0x0047
        L_0x005b:
            android.util.Size[] r11 = new android.util.Size[r13]
            java.lang.Object[] r11 = r0.toArray(r11)
            android.util.Size[] r11 = (android.util.Size[]) r11
        L_0x0063:
            java.util.List r0 = java.util.Arrays.asList(r11)
            xb4 r2 = new xb4
            r3 = 10
            r2.<init>(r3)
            java.util.Collections.sort(r0, r2)
            android.util.Size r12 = r12.e()
            int r2 = r12.getWidth()
            long r2 = (long) r2
            int r12 = r12.getHeight()
            long r4 = (long) r12
            long r2 = r2 * r4
            r4 = 307200(0x4b000, double:1.51777E-318)
            long r2 = java.lang.Math.min(r2, r4)
            int r12 = r11.length
            r4 = r13
        L_0x0089:
            if (r4 >= r12) goto L_0x00a8
            r5 = r11[r4]
            int r6 = r5.getWidth()
            long r6 = (long) r6
            int r8 = r5.getHeight()
            long r8 = (long) r8
            long r6 = r6 * r8
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x009e
            r11 = r5
            goto L_0x00ae
        L_0x009e:
            if (r6 <= 0) goto L_0x00a4
            if (r1 == 0) goto L_0x00a8
            r11 = r1
            goto L_0x00ae
        L_0x00a4:
            int r4 = r4 + 1
            r1 = r5
            goto L_0x0089
        L_0x00a8:
            java.lang.Object r11 = r0.get(r13)
            android.util.Size r11 = (android.util.Size) r11
        L_0x00ae:
            r10.d = r11
            java.util.Objects.toString(r11)
            c2d r11 = r10.c()
            r10.b = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s39.<init>(et1, si4, ar1):void");
    }

    public s39(File file) {
        this.a = new HashMap();
        this.b = new SparseArray();
        this.c = new SparseBooleanArray();
        this.d = new SparseBooleanArray();
        ew0 ew0 = new ew0(new File(file, "cached_content_index.exi"), 0);
        int i = mze.a;
        this.e = ew0;
        this.f = null;
    }

    public s39(ryc ryc, vd6 vd6, Handler handler, s30 s30, xe6 xe6, xe6 xe62) {
        this.a = ryc;
        this.b = vd6;
        this.c = handler;
        this.d = s30;
        this.e = xe6;
        this.f = xe62;
    }
}
