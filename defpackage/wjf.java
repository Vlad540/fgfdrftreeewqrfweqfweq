package defpackage;

import android.net.Uri;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: wjf  reason: default package */
public final class wjf implements i75 {
    public Object X;
    public final Object a;
    public boolean b;
    public final Object c;
    public final Object o;

    public wjf(oz2 oz2, j8e j8e, ul7 ul7, oj1 oj1, boolean z) {
        this.a = oz2;
        this.c = j8e;
        this.o = ul7;
        this.X = oj1;
        this.b = z;
    }

    public static String a(wjf wjf, String str) {
        wjf.getClass();
        byte[] decode = Base64.decode(str, 0);
        wjf.d().init(2, wjf.e(), new IvParameterSpec(cs.T(0, decode, wjf.d().getBlockSize())));
        return new String(wjf.d().doFinal(cs.T(wjf.d().getBlockSize(), decode, decode.length)), e22.a);
    }

    public bpe B(int i, int i2) {
        n58 n58 = new n58();
        if (i2 == 1) {
            ((ArrayList) this.c).add(n58);
        } else if (i2 != 2) {
            ((ArrayList) this.o).add(n58);
        } else {
            ((ArrayList) this.a).add(n58);
        }
        return n58;
    }

    public void M(vtc vtc) {
        this.X = vtc;
    }

    public String b(String str) {
        d().init(1, e());
        byte[] doFinal = d().doFinal(str.getBytes(e22.a));
        byte[] iv = d().getIV();
        byte[] bArr = new byte[(iv.length + doFinal.length)];
        System.arraycopy(iv, 0, bArr, 0, iv.length);
        System.arraycopy(doFinal, 0, bArr, iv.length, doFinal.length);
        return Base64.encodeToString(bArr, 0);
    }

    public void c() {
        ((xwb) this.o).log("Condition", "Condition # " + ((String) this.a) + " - 🔥 " + ((AtomicLong) this.X).incrementAndGet());
        synchronized (this) {
            try {
                if (!this.b) {
                    this.b = true;
                    Iterator it = ((ArrayList) this.c).iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        ((xwb) this.o).log("Condition", "Condition # " + ((String) this.a) + " - executing from queue " + ((String) pair.first) + " " + ((AtomicLong) this.X).incrementAndGet());
                        ((Runnable) pair.second).run();
                    }
                    ((ArrayList) this.c).clear();
                } else {
                    throw new IllegalStateException("Is already fired");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Cipher d() {
        return (Cipher) ((r7e) this.X).getValue();
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.security.KeyStore$Entry] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public javax.crypto.SecretKey e() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.o
            r7e r0 = (r7e) r0
            java.lang.Object r0 = r0.getValue()
            java.security.KeyStore r0 = (java.security.KeyStore) r0
            java.lang.Object r1 = r4.a
            java.lang.String r1 = (java.lang.String) r1
            r2 = 0
            java.security.KeyStore$Entry r0 = r0.getEntry(r1, r2)
            boolean r3 = r0 instanceof java.security.KeyStore.SecretKeyEntry
            if (r3 == 0) goto L_0x001a
            r2 = r0
            java.security.KeyStore$SecretKeyEntry r2 = (java.security.KeyStore.SecretKeyEntry) r2
        L_0x001a:
            if (r2 == 0) goto L_0x0022
            javax.crypto.SecretKey r0 = r2.getSecretKey()
            if (r0 != 0) goto L_0x0069
        L_0x0022:
            android.security.keystore.KeyGenParameterSpec$Builder r0 = new android.security.keystore.KeyGenParameterSpec$Builder
            r2 = 3
            r0.<init>(r1, r2)
            java.lang.String r1 = "CBC"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            android.security.keystore.KeyGenParameterSpec$Builder r0 = r0.setBlockModes(r1)
            java.lang.String r1 = "PKCS7Padding"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            android.security.keystore.KeyGenParameterSpec$Builder r0 = r0.setEncryptionPaddings(r1)
            boolean r4 = r4.b
            r1 = 1
            if (r4 == 0) goto L_0x004e
            r0.setUserAuthenticationRequired(r1)
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r4 < r2) goto L_0x0052
            r0.setUserAuthenticationParameters(120, 2)
            goto L_0x0052
        L_0x004e:
            r4 = 0
            r0.setUserAuthenticationRequired(r4)
        L_0x0052:
            android.security.keystore.KeyGenParameterSpec$Builder r4 = r0.setRandomizedEncryptionRequired(r1)
            android.security.keystore.KeyGenParameterSpec r4 = r4.build()
            java.lang.String r0 = "AES"
            java.lang.String r1 = "AndroidKeyStore"
            javax.crypto.KeyGenerator r0 = javax.crypto.KeyGenerator.getInstance(r0, r1)
            r0.init(r4)
            javax.crypto.SecretKey r0 = r0.generateKey()
        L_0x0069:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wjf.e():javax.crypto.SecretKey");
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(org.json.JSONObject r23) {
        /*
            r22 = this;
            r1 = r22
            boolean r0 = r1.b
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.Object r0 = r1.c
            r2 = r0
            j8e r2 = (j8e) r2
            r2.getClass()
            r0 = r23
            ope r0 = r2.j(r0)     // Catch:{ JSONException -> 0x0016 }
            goto L_0x0024
        L_0x0016:
            r0 = move-exception
            r4 = r0
            java.lang.Object r0 = r2.a
            xwb r0 = (defpackage.xwb) r0
            java.lang.String r2 = "RoomPartsUpdateParser"
            java.lang.String r5 = "Room participants update parse error"
            r0.logException(r2, r5, r4)
            r0 = 0
        L_0x0024:
            if (r0 != 0) goto L_0x0027
            return
        L_0x0027:
            java.lang.Object r1 = r1.X
            oj1 r1 = (defpackage.oj1) r1
            pe1 r2 = r1.b
            ke1 r4 = r2.a
            ge1 r4 = r4.a
            java.lang.Object r5 = r0.X
            java.util.List r5 = (java.util.List) r5
            boolean r4 = o23.R(r5, r4)
            java.lang.Object r6 = r0.c
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r0.o
            w2d r7 = (defpackage.w2d) r7
            r2.m(r7, r6)
            ob1 r6 = r1.e
            java.lang.Object r8 = r0.Y
            nu7 r8 = (defpackage.nu7) r8
            if (r8 == 0) goto L_0x006f
            java.lang.Object r9 = r8.a
            java.util.List r9 = (java.util.List) r9
            r2.g(r7, r9)
            java.lang.Object r8 = r8.b
            java.util.List r8 = (java.util.List) r8
            java.util.Iterator r8 = r8.iterator()
        L_0x005b:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x006f
            java.lang.Object r9 = r8.next()
            ie1 r9 = (defpackage.ie1) r9
            sja r10 = r6.n
            ge1 r11 = r9.b
            r10.onStateChanged(r11, r9)
            goto L_0x005b
        L_0x006f:
            boolean r8 = r7 instanceof defpackage.v2d
            qe4 r9 = r1.c
            int r0 = r0.b
            if (r8 != 0) goto L_0x007c
            r21 = r0
            r23 = r5
            goto L_0x00d6
        L_0x007c:
            r11 = r7
            v2d r11 = (defpackage.v2d) r11
            dr9 r12 = new dr9
            r10 = 14
            r12.<init>(r10)
            dr9 r13 = new dr9
            r10 = 14
            r13.<init>(r10)
            dr9 r14 = new dr9
            r10 = 14
            r14.<init>(r10)
            dr9 r15 = new dr9
            r10 = 14
            r15.<init>(r10)
            dr9 r10 = new dr9
            r3 = 14
            r10.<init>(r3)
            dr9 r3 = new dr9
            r22 = r10
            r10 = 14
            r3.<init>(r10)
            dr9 r10 = new dr9
            r23 = r5
            r5 = 14
            r10.<init>(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r21 = r0
            nfc r0 = new nfc
            r16 = r10
            r10 = 22
            r0.<init>(r10, r5)
            a30 r5 = new a30
            r20 = 1
            r19 = r16
            r16 = r22
            r10 = r5
            r17 = r0
            r18 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r9.o(r5)
        L_0x00d6:
            java.lang.String r0 = "get-rooms"
            java.lang.String r3 = "command"
            java.lang.String r5 = "Signaling is not ready or released"
            otf r10 = r1.g
            if (r4 == 0) goto L_0x014f
            w2d r4 = r2.k
            boolean r4 = hhd.f(r7, r4)
            if (r4 == 0) goto L_0x00e9
            goto L_0x014f
        L_0x00e9:
            w2d r4 = r2.k
            boolean r4 = hhd.f(r4, r7)
            if (r4 == 0) goto L_0x00f2
            goto L_0x010c
        L_0x00f2:
            r2.n(r7)
            b3d r4 = r6.f
            jj1 r6 = new jj1
            boolean r11 = r7 instanceof defpackage.v2d
            if (r11 == 0) goto L_0x0105
            r11 = r7
            v2d r11 = (defpackage.v2d) r11
            q2d r11 = r9.y(r11)
            goto L_0x0106
        L_0x0105:
            r11 = 0
        L_0x0106:
            r6.<init>(r7, r11)
            r4.onCurrentParticipantActiveRoomChanged(r6)
        L_0x010c:
            ke1 r4 = r2.a
            boolean r4 = r4.a()
            if (r4 != 0) goto L_0x014f
            h87 r4 = new h87
            r6 = 23
            r4.<init>(r6, r1)
            h87 r6 = new h87
            r11 = 24
            r6.<init>(r11, r1)
            java.lang.Object r11 = r10.b
            s16 r11 = (s16) r11
            java.lang.Object r11 = r11.invoke()
            mfd r11 = (defpackage.mfd) r11
            if (r11 != 0) goto L_0x0137
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            r6.invoke(r0)
            goto L_0x01aa
        L_0x0137:
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            r5.put((java.lang.String) r3, (java.lang.Object) r0)
            yw0 r0 = new yw0
            r3 = 1
            r0.<init>(r10, r6, r4, r3)
            qs r3 = new qs
            r4 = 6
            r3.<init>(r10, r6, r4)
            r11.j(r5, r0, r3)
            goto L_0x01aa
        L_0x014f:
            if (r8 == 0) goto L_0x01aa
            r4 = r7
            v2d r4 = (defpackage.v2d) r4
            q2d r4 = r9.y(r4)
            if (r4 == 0) goto L_0x01aa
            ge1 r4 = r4.f
            if (r4 == 0) goto L_0x01aa
            w2d r6 = r2.k
            java.util.Map r6 = r2.d(r6)
            java.util.Set r6 = r6.keySet()
            boolean r4 = r6.contains(r4)
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x01aa
            h87 r4 = new h87
            r6 = 23
            r4.<init>(r6, r1)
            h87 r6 = new h87
            r11 = 24
            r6.<init>(r11, r1)
            java.lang.Object r11 = r10.b
            s16 r11 = (s16) r11
            java.lang.Object r11 = r11.invoke()
            mfd r11 = (defpackage.mfd) r11
            if (r11 != 0) goto L_0x0193
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            r6.invoke(r0)
            goto L_0x01aa
        L_0x0193:
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            r5.put((java.lang.String) r3, (java.lang.Object) r0)
            yw0 r0 = new yw0
            r3 = 1
            r0.<init>(r10, r6, r4, r3)
            qs r3 = new qs
            r4 = 6
            r3.<init>(r10, r6, r4)
            r11.j(r5, r0, r3)
        L_0x01aa:
            w2d r0 = r2.k
            java.util.Map r0 = r2.d(r0)
            java.util.Set r0 = r0.keySet()
            int r0 = r0.size()
            int r0 = r0 + 1
            w2d r2 = r2.k
            boolean r2 = hhd.f(r7, r2)
            if (r2 == 0) goto L_0x01e8
            r2 = r21
            if (r2 == r0) goto L_0x01ea
            boolean r0 = r23.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01ea
            lhd r0 = new lhd
            r3 = 16
            r0.<init>((int) r3, (java.lang.Object) r7)
            av3 r3 = new av3
            r4 = 1
            r3.<init>(r1, r4, r7)
            h87 r4 = new h87
            r5 = 22
            r4.<init>(r5, r1)
            afc r1 = r1.f
            r1.G(r0, r3, r4)
            goto L_0x01ea
        L_0x01e8:
            r2 = r21
        L_0x01ea:
            if (r8 == 0) goto L_0x023e
            r11 = r7
            v2d r11 = (defpackage.v2d) r11
            dr9 r12 = new dr9
            r0 = 14
            r12.<init>(r0)
            dr9 r13 = new dr9
            r0 = 14
            r13.<init>(r0)
            dr9 r14 = new dr9
            r0 = 14
            r14.<init>(r0)
            dr9 r15 = new dr9
            r0 = 14
            r15.<init>(r0)
            dr9 r0 = new dr9
            r1 = 14
            r0.<init>(r1)
            dr9 r1 = new dr9
            r3 = 14
            r1.<init>(r3)
            dr9 r3 = new dr9
            r4 = 14
            r3.<init>(r4)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            nfc r4 = new nfc
            r5 = 22
            r4.<init>(r5, r2)
            a30 r2 = new a30
            r20 = 1
            r10 = r2
            r16 = r0
            r17 = r4
            r18 = r1
            r19 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r9.o(r2)
        L_0x023e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wjf.f(org.json.JSONObject):void");
    }

    public void g(JSONObject jSONObject) {
        z2d z2d;
        if (this.b) {
            oz2 oz2 = (oz2) this.a;
            oz2.getClass();
            try {
                z2d = oz2.a(jSONObject);
            } catch (JSONException e) {
                ((xwb) oz2.b).logException("SessionRoomParser", "Can't parse room update notification", e);
                z2d = null;
            }
            if (z2d != null) {
                ((oj1) this.X).d(z2d);
            }
        }
    }

    public void h(JSONObject jSONObject) {
        za6 za6;
        if (this.b) {
            oz2 oz2 = (oz2) this.a;
            oz2.getClass();
            try {
                za6 = oz2.d(jSONObject);
            } catch (JSONException e) {
                ((xwb) oz2.b).logException("SessionRoomParser", "Can't parse rooms update notification", e);
                za6 = null;
            }
            if (za6 != null) {
                oj1 oj1 = (oj1) this.X;
                oj1.getClass();
                for (z2d d : (List) za6.a) {
                    oj1.d(d);
                }
            }
        }
    }

    public stf i(String str) {
        d().init(1, e());
        return new stf(d());
    }

    public void w() {
        this.b = true;
    }

    public wjf(String str, xwb xwb) {
        this.b = false;
        this.c = new ArrayList();
        this.X = new AtomicLong();
        this.a = str;
        this.o = xwb;
    }

    public wjf(String str, boolean z) {
        this.a = str;
        this.b = z;
        this.c = wjf.class.getName();
        this.o = new r7e(new vif(2));
        this.X = new r7e(new vif(3));
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.Object, le4] */
    public wjf(m58 m58) {
        m58 m582 = m58;
        this.a = new ArrayList();
        this.c = new ArrayList();
        this.o = new ArrayList();
        m582.S(this);
        ? obj = new Object();
        while (true) {
            l58 l58 = m582.b;
            r74 r74 = l58.b;
            if (r74 != null) {
                int g = m582.a.g(r74, obj);
                boolean z = this.b;
                if (z && ((vtc) this.X) != null) {
                    return;
                }
                if (g == 1) {
                    long j = obj.a;
                    Uri uri = l58.a.getUri();
                    if (uri != null) {
                        l58.close();
                        l58.G(new yz3(uri, 0, 1, (byte[]) null, Collections.emptyMap(), j, -1, (String) null, 0, (Object) null));
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else if (g == -1 && z) {
                    return;
                } else {
                    if (g == -1) {
                        throw new RuntimeException("Invalid media specified=" + m582.c);
                    }
                }
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
    }
}
