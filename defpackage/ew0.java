package defpackage;

import android.content.Context;
import androidx.media3.common.VideoFrameProcessingException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: ew0  reason: default package */
public final class ew0 implements fw0 {
    public final Object X;
    public boolean Y;
    public Object Z;
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;
    public final Object o;
    public Object w0;

    public ew0(Context context, y5c y5c, re5 re5) {
        this.a = 3;
        this.b = false;
        this.Y = false;
        this.c = fja.g(context);
        this.o = y5c;
        this.X = re5;
    }

    public static int g(cw0 cw0, int i) {
        int hashCode = cw0.b.hashCode() + (cw0.a * 31);
        if (i >= 2) {
            return (hashCode * 31) + cw0.e.hashCode();
        }
        long a2 = yp3.a(cw0.e);
        return (hashCode * 31) + ((int) (a2 ^ (a2 >>> 32)));
    }

    public static int l(dw0 dw0, int i) {
        int hashCode = dw0.b.hashCode() + (dw0.a * 31);
        if (i >= 2) {
            return (hashCode * 31) + dw0.e.hashCode();
        }
        long a2 = zp3.a(dw0.e);
        return (hashCode * 31) + ((int) (a2 ^ (a2 >>> 32)));
    }

    private final void m(long j) {
    }

    private final void n(long j) {
    }

    public static cw0 r(int i, DataInputStream dataInputStream) {
        y54 y54;
        int readInt = dataInputStream.readInt();
        String readUTF = dataInputStream.readUTF();
        if (i < 2) {
            long readLong = dataInputStream.readLong();
            qe4 qe4 = new qe4(13);
            qe4.s(Long.valueOf(readLong), "exo_len");
            y54 = y54.c.b(qe4);
        } else {
            int readInt2 = dataInputStream.readInt();
            HashMap hashMap = new HashMap();
            int i2 = 0;
            while (i2 < readInt2) {
                String readUTF2 = dataInputStream.readUTF();
                int readInt3 = dataInputStream.readInt();
                if (readInt3 >= 0) {
                    int min = Math.min(readInt3, 10485760);
                    byte[] bArr = mze.f;
                    int i3 = 0;
                    while (i3 != readInt3) {
                        int i4 = i3 + min;
                        bArr = Arrays.copyOf(bArr, i4);
                        dataInputStream.readFully(bArr, i3, min);
                        min = Math.min(readInt3 - i4, 10485760);
                        i3 = i4;
                    }
                    hashMap.put(readUTF2, bArr);
                    i2++;
                } else {
                    throw new IOException(m4b.h(31, readInt3, "Invalid value size: "));
                }
            }
            y54 = new y54(hashMap);
        }
        return new cw0(readInt, readUTF, y54);
    }

    public static dw0 s(int i, DataInputStream dataInputStream) {
        z54 z54;
        int readInt = dataInputStream.readInt();
        String readUTF = dataInputStream.readUTF();
        if (i < 2) {
            long readLong = dataInputStream.readLong();
            nu7 nu7 = new nu7(13, false);
            nu7.j(Long.valueOf(readLong), "exo_len");
            z54 = z54.c.b(nu7);
        } else {
            z54 = mif.a(dataInputStream);
        }
        return new dw0(readInt, readUTF, z54);
    }

    public void a(HashMap hashMap) {
        DataOutputStream dataOutputStream;
        Object obj = this.o;
        Object obj2 = this.X;
        DataOutputStream dataOutputStream2 = null;
        Object obj3 = this.c;
        switch (this.a) {
            case 0:
                Cipher cipher = (Cipher) obj3;
                mn mnVar = (mn) this.Z;
                try {
                    ay V = mnVar.V();
                    vcc vcc = (vcc) this.w0;
                    if (vcc == null) {
                        this.w0 = new vcc(V, 0);
                    } else {
                        vcc.a(V);
                    }
                    vcc vcc2 = (vcc) this.w0;
                    DataOutputStream dataOutputStream3 = new DataOutputStream(vcc2);
                    try {
                        dataOutputStream3.writeInt(2);
                        boolean z = this.b;
                        dataOutputStream3.writeInt(z ? 1 : 0);
                        if (z) {
                            byte[] bArr = new byte[16];
                            int i = mze.a;
                            ((SecureRandom) obj2).nextBytes(bArr);
                            dataOutputStream3.write(bArr);
                            cipher.init(1, (SecretKeySpec) obj, new IvParameterSpec(bArr));
                            dataOutputStream3.flush();
                            dataOutputStream = new DataOutputStream(new CipherOutputStream(vcc2, cipher));
                        } else {
                            dataOutputStream = dataOutputStream3;
                        }
                        dataOutputStream2.writeInt(hashMap.size());
                        int i2 = 0;
                        for (cw0 cw0 : hashMap.values()) {
                            dataOutputStream2.writeInt(cw0.a);
                            dataOutputStream2.writeUTF(cw0.b);
                            s39.a(cw0.e, dataOutputStream2);
                            i2 += g(cw0, 2);
                        }
                        dataOutputStream2.writeInt(i2);
                        dataOutputStream2.close();
                        ((File) mnVar.c).delete();
                        int i3 = mze.a;
                        this.Y = false;
                        return;
                    } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                        throw new IllegalStateException(e);
                    } catch (Throwable th) {
                        th = th;
                        dataOutputStream2 = dataOutputStream3;
                        mze.h(dataOutputStream2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    mze.h(dataOutputStream2);
                    throw th;
                }
            default:
                Cipher cipher2 = (Cipher) obj3;
                b2b b2b = (b2b) this.Z;
                try {
                    ay E = b2b.E();
                    vcc vcc3 = (vcc) this.w0;
                    if (vcc3 == null) {
                        this.w0 = new vcc(E, 1);
                    } else {
                        vcc3.a(E);
                    }
                    vcc vcc4 = (vcc) this.w0;
                    DataOutputStream dataOutputStream4 = new DataOutputStream(vcc4);
                    try {
                        dataOutputStream4.writeInt(2);
                        boolean z2 = this.b;
                        dataOutputStream4.writeInt(z2 ? 1 : 0);
                        if (z2) {
                            byte[] bArr2 = new byte[16];
                            int i4 = oze.a;
                            ((SecureRandom) obj2).nextBytes(bArr2);
                            dataOutputStream4.write(bArr2);
                            cipher2.init(1, (SecretKeySpec) obj, new IvParameterSpec(bArr2));
                            dataOutputStream4.flush();
                            dataOutputStream2 = new DataOutputStream(new CipherOutputStream(vcc4, cipher2));
                        } else {
                            dataOutputStream2 = dataOutputStream4;
                        }
                        dataOutputStream2.writeInt(hashMap.size());
                        int i5 = 0;
                        for (dw0 dw0 : hashMap.values()) {
                            dataOutputStream2.writeInt(dw0.a);
                            dataOutputStream2.writeUTF(dw0.b);
                            mif.b(dw0.e, dataOutputStream2);
                            i5 += l(dw0, 2);
                        }
                        dataOutputStream2.writeInt(i5);
                        dataOutputStream2.close();
                        ((File) b2b.c).delete();
                        int i6 = oze.a;
                        this.Y = false;
                        return;
                    } catch (InvalidAlgorithmParameterException | InvalidKeyException e2) {
                        throw new IllegalStateException(e2);
                    } catch (Throwable th3) {
                        th = th3;
                        dataOutputStream2 = dataOutputStream4;
                        oze.h(dataOutputStream2);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    oze.h(dataOutputStream2);
                    throw th;
                }
        }
    }

    public void b(dw0 dw0, boolean z) {
        this.Y = true;
    }

    public void c() {
        synchronized (this.Z) {
            this.Y = true;
            ((ArrayDeque) this.w0).clear();
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ((ExecutorService) this.c).submit(new vr2((Object) this, true, (Object) new my1(this, 5, countDownLatch), 6));
        countDownLatch.await();
    }

    public void d(dw0 dw0) {
        this.Y = true;
    }

    public void e(Exception exc) {
        synchronized (this.Z) {
            try {
                if (!this.Y) {
                    this.Y = true;
                    ((h4f) this.X).c(VideoFrameProcessingException.a(exc));
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public boolean f() {
        switch (this.a) {
            case 0:
                mn mnVar = (mn) this.Z;
                return ((File) mnVar.b).exists() || ((File) mnVar.c).exists();
            default:
                b2b b2b = (b2b) this.Z;
                return ((File) b2b.b).exists() || ((File) b2b.c).exists();
        }
    }

    public void h(HashMap hashMap) {
        switch (this.a) {
            case 0:
                if (this.Y) {
                    a(hashMap);
                    return;
                }
                return;
            default:
                if (this.Y) {
                    a(hashMap);
                    return;
                }
                return;
        }
    }

    public void i(long j) {
        int i = this.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:122:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j(java.util.HashMap r14, android.util.SparseArray r15) {
        /*
            r13 = this;
            r0 = -1
            r1 = 0
            java.lang.Object r2 = r13.o
            r3 = 16
            java.lang.Object r4 = r13.c
            r5 = 2
            r6 = 0
            r7 = 1
            int r8 = r13.a
            switch(r8) {
                case 0: goto L_0x00e9;
                default: goto L_0x0010;
            }
        L_0x0010:
            boolean r8 = r13.Y
            r8 = r8 ^ r7
            defpackage.oyb.k(r8)
            java.lang.Object r8 = r13.Z
            b2b r8 = (defpackage.b2b) r8
            java.lang.Object r9 = r8.b
            java.io.File r9 = (java.io.File) r9
            java.lang.Object r10 = r8.b
            java.io.File r10 = (java.io.File) r10
            boolean r9 = r9.exists()
            java.lang.Object r8 = r8.c
            java.io.File r8 = (java.io.File) r8
            if (r9 != 0) goto L_0x0032
            boolean r9 = r8.exists()
            if (r9 == 0) goto L_0x00e8
        L_0x0032:
            java.io.BufferedInputStream r9 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x00d7, all -> 0x00d0 }
            boolean r11 = r8.exists()     // Catch:{ IOException -> 0x00d7, all -> 0x00d0 }
            if (r11 == 0) goto L_0x0040
            r10.delete()     // Catch:{ IOException -> 0x00d7, all -> 0x00d0 }
            r8.renameTo(r10)     // Catch:{ IOException -> 0x00d7, all -> 0x00d0 }
        L_0x0040:
            java.io.FileInputStream r11 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00d7, all -> 0x00d0 }
            r11.<init>(r10)     // Catch:{ IOException -> 0x00d7, all -> 0x00d0 }
            r9.<init>(r11)     // Catch:{ IOException -> 0x00d7, all -> 0x00d0 }
            java.io.DataInputStream r11 = new java.io.DataInputStream     // Catch:{ IOException -> 0x00d7, all -> 0x00d0 }
            r11.<init>(r9)     // Catch:{ IOException -> 0x00d7, all -> 0x00d0 }
            int r6 = r11.readInt()     // Catch:{ IOException -> 0x0085, all -> 0x0082 }
            if (r6 < 0) goto L_0x0061
            if (r6 <= r5) goto L_0x0056
            goto L_0x0061
        L_0x0056:
            int r12 = r11.readInt()     // Catch:{ IOException -> 0x0085, all -> 0x0082 }
            r12 = r12 & r7
            if (r12 == 0) goto L_0x008e
            javax.crypto.Cipher r4 = (javax.crypto.Cipher) r4
            if (r4 != 0) goto L_0x0066
        L_0x0061:
            defpackage.oze.h(r11)
            goto L_0x00dc
        L_0x0066:
            byte[] r13 = new byte[r3]     // Catch:{ IOException -> 0x0085, all -> 0x0082 }
            r11.readFully(r13)     // Catch:{ IOException -> 0x0085, all -> 0x0082 }
            javax.crypto.spec.IvParameterSpec r3 = new javax.crypto.spec.IvParameterSpec     // Catch:{ IOException -> 0x0085, all -> 0x0082 }
            r3.<init>(r13)     // Catch:{ IOException -> 0x0085, all -> 0x0082 }
            javax.crypto.spec.SecretKeySpec r2 = (javax.crypto.spec.SecretKeySpec) r2     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException -> 0x0087 }
            int r13 = defpackage.oze.a     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException -> 0x0087 }
            r4.init(r5, r2, r3)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException -> 0x0087 }
            java.io.DataInputStream r13 = new java.io.DataInputStream     // Catch:{ IOException -> 0x0085, all -> 0x0082 }
            javax.crypto.CipherInputStream r2 = new javax.crypto.CipherInputStream     // Catch:{ IOException -> 0x0085, all -> 0x0082 }
            r2.<init>(r9, r4)     // Catch:{ IOException -> 0x0085, all -> 0x0082 }
            r13.<init>(r2)     // Catch:{ IOException -> 0x0085, all -> 0x0082 }
            goto L_0x0095
        L_0x0082:
            r13 = move-exception
            r6 = r11
            goto L_0x00d1
        L_0x0085:
            r6 = r11
            goto L_0x00d7
        L_0x0087:
            r13 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0085, all -> 0x0082 }
            r0.<init>(r13)     // Catch:{ IOException -> 0x0085, all -> 0x0082 }
            throw r0     // Catch:{ IOException -> 0x0085, all -> 0x0082 }
        L_0x008e:
            boolean r2 = r13.b     // Catch:{ IOException -> 0x0085, all -> 0x0082 }
            if (r2 == 0) goto L_0x0094
            r13.Y = r7     // Catch:{ IOException -> 0x0085, all -> 0x0082 }
        L_0x0094:
            r13 = r11
        L_0x0095:
            int r2 = r13.readInt()     // Catch:{ IOException -> 0x00b6, all -> 0x00b2 }
            r3 = r1
            r4 = r3
        L_0x009b:
            if (r3 >= r2) goto L_0x00b8
            dw0 r5 = s(r6, r13)     // Catch:{ IOException -> 0x00b6, all -> 0x00b2 }
            java.lang.String r9 = r5.b
            r14.put(r9, r5)     // Catch:{ IOException -> 0x00b6, all -> 0x00b2 }
            int r11 = r5.a     // Catch:{ IOException -> 0x00b6, all -> 0x00b2 }
            r15.put(r11, r9)     // Catch:{ IOException -> 0x00b6, all -> 0x00b2 }
            int r5 = l(r5, r6)     // Catch:{ IOException -> 0x00b6, all -> 0x00b2 }
            int r4 = r4 + r5
            int r3 = r3 + r7
            goto L_0x009b
        L_0x00b2:
            r14 = move-exception
            r6 = r13
            r13 = r14
            goto L_0x00d1
        L_0x00b6:
            r6 = r13
            goto L_0x00d7
        L_0x00b8:
            int r2 = r13.readInt()     // Catch:{ IOException -> 0x00b6, all -> 0x00b2 }
            int r3 = r13.read()     // Catch:{ IOException -> 0x00b6, all -> 0x00b2 }
            if (r3 != r0) goto L_0x00c3
            r1 = r7
        L_0x00c3:
            if (r2 != r4) goto L_0x00cc
            if (r1 != 0) goto L_0x00c8
            goto L_0x00cc
        L_0x00c8:
            defpackage.oze.h(r13)
            goto L_0x00e8
        L_0x00cc:
            defpackage.oze.h(r13)
            goto L_0x00dc
        L_0x00d0:
            r13 = move-exception
        L_0x00d1:
            if (r6 == 0) goto L_0x00d6
            defpackage.oze.h(r6)
        L_0x00d6:
            throw r13
        L_0x00d7:
            if (r6 == 0) goto L_0x00dc
            defpackage.oze.h(r6)
        L_0x00dc:
            r14.clear()
            r15.clear()
            r10.delete()
            r8.delete()
        L_0x00e8:
            return
        L_0x00e9:
            boolean r8 = r13.Y
            r8 = r8 ^ r7
            swb.h(r8)
            java.lang.Object r8 = r13.Z
            mn r8 = (defpackage.mn) r8
            java.lang.Object r9 = r8.b
            java.io.File r9 = (java.io.File) r9
            java.lang.Object r10 = r8.b
            java.io.File r10 = (java.io.File) r10
            boolean r9 = r9.exists()
            java.lang.Object r8 = r8.c
            java.io.File r8 = (java.io.File) r8
            if (r9 != 0) goto L_0x010b
            boolean r9 = r8.exists()
            if (r9 == 0) goto L_0x01c1
        L_0x010b:
            java.io.BufferedInputStream r9 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x01b0, all -> 0x01a9 }
            boolean r11 = r8.exists()     // Catch:{ IOException -> 0x01b0, all -> 0x01a9 }
            if (r11 == 0) goto L_0x0119
            r10.delete()     // Catch:{ IOException -> 0x01b0, all -> 0x01a9 }
            r8.renameTo(r10)     // Catch:{ IOException -> 0x01b0, all -> 0x01a9 }
        L_0x0119:
            java.io.FileInputStream r11 = new java.io.FileInputStream     // Catch:{ IOException -> 0x01b0, all -> 0x01a9 }
            r11.<init>(r10)     // Catch:{ IOException -> 0x01b0, all -> 0x01a9 }
            r9.<init>(r11)     // Catch:{ IOException -> 0x01b0, all -> 0x01a9 }
            java.io.DataInputStream r11 = new java.io.DataInputStream     // Catch:{ IOException -> 0x01b0, all -> 0x01a9 }
            r11.<init>(r9)     // Catch:{ IOException -> 0x01b0, all -> 0x01a9 }
            int r6 = r11.readInt()     // Catch:{ IOException -> 0x015e, all -> 0x015b }
            if (r6 < 0) goto L_0x013a
            if (r6 <= r5) goto L_0x012f
            goto L_0x013a
        L_0x012f:
            int r12 = r11.readInt()     // Catch:{ IOException -> 0x015e, all -> 0x015b }
            r12 = r12 & r7
            if (r12 == 0) goto L_0x0167
            javax.crypto.Cipher r4 = (javax.crypto.Cipher) r4
            if (r4 != 0) goto L_0x013f
        L_0x013a:
            defpackage.mze.h(r11)
            goto L_0x01b5
        L_0x013f:
            byte[] r13 = new byte[r3]     // Catch:{ IOException -> 0x015e, all -> 0x015b }
            r11.readFully(r13)     // Catch:{ IOException -> 0x015e, all -> 0x015b }
            javax.crypto.spec.IvParameterSpec r3 = new javax.crypto.spec.IvParameterSpec     // Catch:{ IOException -> 0x015e, all -> 0x015b }
            r3.<init>(r13)     // Catch:{ IOException -> 0x015e, all -> 0x015b }
            javax.crypto.spec.SecretKeySpec r2 = (javax.crypto.spec.SecretKeySpec) r2     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException -> 0x0160 }
            int r13 = defpackage.mze.a     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException -> 0x0160 }
            r4.init(r5, r2, r3)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException -> 0x0160 }
            java.io.DataInputStream r13 = new java.io.DataInputStream     // Catch:{ IOException -> 0x015e, all -> 0x015b }
            javax.crypto.CipherInputStream r2 = new javax.crypto.CipherInputStream     // Catch:{ IOException -> 0x015e, all -> 0x015b }
            r2.<init>(r9, r4)     // Catch:{ IOException -> 0x015e, all -> 0x015b }
            r13.<init>(r2)     // Catch:{ IOException -> 0x015e, all -> 0x015b }
            goto L_0x016e
        L_0x015b:
            r13 = move-exception
            r6 = r11
            goto L_0x01aa
        L_0x015e:
            r6 = r11
            goto L_0x01b0
        L_0x0160:
            r13 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x015e, all -> 0x015b }
            r0.<init>(r13)     // Catch:{ IOException -> 0x015e, all -> 0x015b }
            throw r0     // Catch:{ IOException -> 0x015e, all -> 0x015b }
        L_0x0167:
            boolean r2 = r13.b     // Catch:{ IOException -> 0x015e, all -> 0x015b }
            if (r2 == 0) goto L_0x016d
            r13.Y = r7     // Catch:{ IOException -> 0x015e, all -> 0x015b }
        L_0x016d:
            r13 = r11
        L_0x016e:
            int r2 = r13.readInt()     // Catch:{ IOException -> 0x018f, all -> 0x018b }
            r3 = r1
            r4 = r3
        L_0x0174:
            if (r3 >= r2) goto L_0x0191
            cw0 r5 = r(r6, r13)     // Catch:{ IOException -> 0x018f, all -> 0x018b }
            java.lang.String r9 = r5.b
            r14.put(r9, r5)     // Catch:{ IOException -> 0x018f, all -> 0x018b }
            int r11 = r5.a     // Catch:{ IOException -> 0x018f, all -> 0x018b }
            r15.put(r11, r9)     // Catch:{ IOException -> 0x018f, all -> 0x018b }
            int r5 = g(r5, r6)     // Catch:{ IOException -> 0x018f, all -> 0x018b }
            int r4 = r4 + r5
            int r3 = r3 + r7
            goto L_0x0174
        L_0x018b:
            r14 = move-exception
            r6 = r13
            r13 = r14
            goto L_0x01aa
        L_0x018f:
            r6 = r13
            goto L_0x01b0
        L_0x0191:
            int r2 = r13.readInt()     // Catch:{ IOException -> 0x018f, all -> 0x018b }
            int r3 = r13.read()     // Catch:{ IOException -> 0x018f, all -> 0x018b }
            if (r3 != r0) goto L_0x019c
            r1 = r7
        L_0x019c:
            if (r2 != r4) goto L_0x01a5
            if (r1 != 0) goto L_0x01a1
            goto L_0x01a5
        L_0x01a1:
            defpackage.mze.h(r13)
            goto L_0x01c1
        L_0x01a5:
            defpackage.mze.h(r13)
            goto L_0x01b5
        L_0x01a9:
            r13 = move-exception
        L_0x01aa:
            if (r6 == 0) goto L_0x01af
            defpackage.mze.h(r6)
        L_0x01af:
            throw r13
        L_0x01b0:
            if (r6 == 0) goto L_0x01b5
            defpackage.mze.h(r6)
        L_0x01b5:
            r14.clear()
            r15.clear()
            r10.delete()
            r8.delete()
        L_0x01c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ew0.j(java.util.HashMap, android.util.SparseArray):void");
    }

    public void k() {
        switch (this.a) {
            case 0:
                mn mnVar = (mn) this.Z;
                ((File) mnVar.b).delete();
                ((File) mnVar.c).delete();
                return;
            default:
                b2b b2b = (b2b) this.Z;
                ((File) b2b.b).delete();
                ((File) b2b.c).delete();
                return;
        }
    }

    public void o(my1 my1) {
        try {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (Thread.currentThread() == ((Thread) ((Future) this.o).get(500, timeUnit))) {
                try {
                    my1.run();
                } catch (Exception e) {
                    e(e);
                }
            } else {
                try {
                    ((ExecutorService) this.c).submit(new zbe(this, 11, my1)).get(500, timeUnit);
                } catch (RuntimeException | ExecutionException | TimeoutException e2) {
                    e(e2);
                }
            }
        } catch (InterruptedException e3) {
            throw e3;
        } catch (Exception e4) {
            e(e4);
        }
    }

    public void p(cw0 cw0, boolean z) {
        this.Y = true;
    }

    public void q(cw0 cw0) {
        this.Y = true;
    }

    /* JADX WARNING: type inference failed for: r4v9, types: [androidx.media3.common.VideoFrameProcessingException, java.lang.Exception] */
    public void t(i4f i4f) {
        synchronized (this.Z) {
            this.Y = true;
            ((ArrayDeque) this.w0).clear();
        }
        ((ExecutorService) this.c).submit(new vr2((Object) this, true, (Object) i4f, 6));
        if (this.b) {
            ((ExecutorService) this.c).shutdown();
            if (!((ExecutorService) this.c).awaitTermination(500, TimeUnit.MILLISECONDS)) {
                ((h4f) this.X).c(new Exception("Release timed out. OpenGL resources may not be cleaned up properly."));
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a7, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002f, code lost:
        r6 = r0;
        r0 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.a6c u(java.util.concurrent.Executor r17, defpackage.rf3 r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            java.lang.String r2 = "Listener Executor can't be null."
            defpackage.e07.o(r0, r2)
            r1.w0 = r0
            r0 = r18
            r1.Z = r0
            java.lang.Object r0 = r1.o
            r2 = r0
            y5c r2 = (defpackage.y5c) r2
            r2.getClass()
            java.lang.Object r3 = r2.h
            monitor-enter(r3)
            long r4 = r2.p     // Catch:{ all -> 0x0033 }
            r6 = 1
            long r4 = r4 + r6
            r2.p = r4     // Catch:{ all -> 0x0033 }
            x5c r0 = r2.k     // Catch:{ all -> 0x0033 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0033 }
            r7 = 0
            switch(r0) {
                case 0: goto L_0x003c;
                case 1: goto L_0x0036;
                case 2: goto L_0x0036;
                case 3: goto L_0x003c;
                case 4: goto L_0x002d;
                case 5: goto L_0x002d;
                case 6: goto L_0x003c;
                case 7: goto L_0x003c;
                case 8: goto L_0x003c;
                default: goto L_0x002b;
            }     // Catch:{ all -> 0x0033 }
        L_0x002b:
            goto L_0x00a7
        L_0x002d:
            na0 r0 = r2.n     // Catch:{ all -> 0x0033 }
        L_0x002f:
            r6 = r0
            r0 = 0
            goto L_0x00ac
        L_0x0033:
            r0 = move-exception
            goto L_0x00ff
        L_0x0036:
            na0 r0 = r2.o     // Catch:{ all -> 0x0033 }
            r0.getClass()     // Catch:{ all -> 0x0033 }
            goto L_0x002f
        L_0x003c:
            x5c r0 = r2.k     // Catch:{ all -> 0x0033 }
            x5c r14 = defpackage.x5c.o     // Catch:{ all -> 0x0033 }
            if (r0 != r14) goto L_0x0052
            na0 r0 = r2.n     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x004c
            na0 r0 = r2.o     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x004c
            r0 = 1
            goto L_0x004d
        L_0x004c:
            r0 = r7
        L_0x004d:
            java.lang.String r8 = "Expected recorder to be idle but a recording is either pending or in progress."
            defpackage.e07.p(r8, r0)     // Catch:{ all -> 0x0033 }
        L_0x0052:
            na0 r0 = new na0     // Catch:{ IOException -> 0x008b }
            java.lang.Object r8 = r1.X     // Catch:{ IOException -> 0x008b }
            r9 = r8
            re5 r9 = (defpackage.re5) r9     // Catch:{ IOException -> 0x008b }
            java.lang.Object r8 = r1.w0     // Catch:{ IOException -> 0x008b }
            r10 = r8
            java.util.concurrent.Executor r10 = (java.util.concurrent.Executor) r10     // Catch:{ IOException -> 0x008b }
            java.lang.Object r8 = r1.Z     // Catch:{ IOException -> 0x008b }
            r11 = r8
            rf3 r11 = (defpackage.rf3) r11     // Catch:{ IOException -> 0x008b }
            boolean r12 = r1.b     // Catch:{ IOException -> 0x008b }
            boolean r13 = r1.Y     // Catch:{ IOException -> 0x008b }
            r8 = r0
            r6 = r14
            r14 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch:{ IOException -> 0x008b }
            java.lang.Object r8 = r1.c     // Catch:{ IOException -> 0x008b }
            android.content.Context r8 = (android.content.Context) r8     // Catch:{ IOException -> 0x008b }
            r0.g(r8)     // Catch:{ IOException -> 0x008b }
            r2.o = r0     // Catch:{ IOException -> 0x008b }
            x5c r0 = r2.k     // Catch:{ IOException -> 0x008b }
            if (r0 != r6) goto L_0x008d
            x5c r0 = defpackage.x5c.b     // Catch:{ IOException -> 0x008b }
            r2.B(r0)     // Catch:{ IOException -> 0x008b }
            ryc r0 = r2.e     // Catch:{ IOException -> 0x008b }
            o5c r6 = new o5c     // Catch:{ IOException -> 0x008b }
            r8 = 0
            r6.<init>(r2, r8)     // Catch:{ IOException -> 0x008b }
            r0.execute(r6)     // Catch:{ IOException -> 0x008b }
            goto L_0x00a7
        L_0x008b:
            r0 = move-exception
            goto L_0x00aa
        L_0x008d:
            x5c r6 = defpackage.x5c.x0     // Catch:{ IOException -> 0x008b }
            if (r0 != r6) goto L_0x00a2
            x5c r0 = defpackage.x5c.b     // Catch:{ IOException -> 0x008b }
            r2.B(r0)     // Catch:{ IOException -> 0x008b }
            ryc r0 = r2.e     // Catch:{ IOException -> 0x008b }
            o5c r6 = new o5c     // Catch:{ IOException -> 0x008b }
            r8 = 1
            r6.<init>(r2, r8)     // Catch:{ IOException -> 0x008b }
            r0.execute(r6)     // Catch:{ IOException -> 0x008b }
            goto L_0x00a7
        L_0x00a2:
            x5c r0 = defpackage.x5c.b     // Catch:{ IOException -> 0x008b }
            r2.B(r0)     // Catch:{ IOException -> 0x008b }
        L_0x00a7:
            r0 = 0
        L_0x00a8:
            r6 = 0
            goto L_0x00ac
        L_0x00aa:
            r7 = 5
            goto L_0x00a8
        L_0x00ac:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            if (r6 != 0) goto L_0x00f7
            if (r7 == 0) goto L_0x00e4
            java.util.Objects.toString(r0)
            na0 r3 = new na0
            java.lang.Object r6 = r1.X
            r9 = r6
            re5 r9 = (defpackage.re5) r9
            java.lang.Object r6 = r1.w0
            r10 = r6
            java.util.concurrent.Executor r10 = (java.util.concurrent.Executor) r10
            java.lang.Object r6 = r1.Z
            r11 = r6
            rf3 r11 = (defpackage.rf3) r11
            boolean r12 = r1.b
            boolean r13 = r1.Y
            r8 = r3
            r14 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r2.j(r3, r7, r0)
            a6c r0 = new a6c
            java.lang.Object r2 = r1.o
            r9 = r2
            y5c r9 = (defpackage.y5c) r9
            java.lang.Object r1 = r1.X
            r12 = r1
            re5 r12 = (defpackage.re5) r12
            r13 = 1
            r8 = r0
            r10 = r4
            r8.<init>(r9, r10, r12, r13)
            goto L_0x00f6
        L_0x00e4:
            a6c r0 = new a6c
            java.lang.Object r2 = r1.o
            r9 = r2
            y5c r9 = (defpackage.y5c) r9
            java.lang.Object r1 = r1.X
            r12 = r1
            re5 r12 = (defpackage.re5) r12
            r13 = 0
            r8 = r0
            r10 = r4
            r8.<init>(r9, r10, r12, r13)
        L_0x00f6:
            return r0
        L_0x00f7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "A recording is already in progress. Previous recordings must be stopped before a new recording can be started."
            r0.<init>(r1)
            throw r0
        L_0x00ff:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ew0.u(java.util.concurrent.Executor, rf3):a6c");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001d, code lost:
        if (r5 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001f, code lost:
        e(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void v(defpackage.i4f r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.Z
            monitor-enter(r0)
            boolean r1 = r4.Y     // Catch:{ all -> 0x0009 }
            if (r1 == 0) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return
        L_0x0009:
            r4 = move-exception
            goto L_0x0023
        L_0x000b:
            vr2 r1 = new vr2     // Catch:{ RejectedExecutionException -> 0x001b }
            r2 = 0
            r3 = 6
            r1.<init>((java.lang.Object) r4, (boolean) r2, (java.lang.Object) r5, (int) r3)     // Catch:{ RejectedExecutionException -> 0x001b }
            java.lang.Object r5 = r4.c     // Catch:{ RejectedExecutionException -> 0x001b }
            java.util.concurrent.ExecutorService r5 = (java.util.concurrent.ExecutorService) r5     // Catch:{ RejectedExecutionException -> 0x001b }
            r5.submit(r1)     // Catch:{ RejectedExecutionException -> 0x001b }
            r5 = 0
            goto L_0x001c
        L_0x001b:
            r5 = move-exception
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            if (r5 == 0) goto L_0x0022
            r4.e(r5)
        L_0x0022:
            return
        L_0x0023:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ew0.v(i4f):void");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Object, i4f] */
    public void w(i4f i4f) {
        synchronized (this.Z) {
            try {
                if (!this.Y) {
                    ((ArrayDeque) this.w0).add(i4f);
                    v(new Object());
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public void x() {
        if (z3d.k((Context) this.c, "android.permission.RECORD_AUDIO") != -1) {
            e07.p("The Recorder this recording is associated to doesn't support audio.", ((z90) y5c.l(((y5c) this.o).D)).b.e != 0);
            this.b = true;
            return;
        }
        throw new SecurityException("Attempted to enable audio for recording but application does not have RECORD_AUDIO permission granted.");
    }

    public ew0(zq1 zq1, ryc ryc) {
        this.a = 2;
        this.b = false;
        this.Y = false;
        this.X = new Object();
        this.Z = new mv4(6);
        this.c = zq1;
        this.o = ryc;
    }

    public ew0(ExecutorService executorService, boolean z, h4f h4f) {
        this.a = 4;
        this.c = executorService;
        this.o = executorService.submit(new be(2));
        this.b = z;
        this.X = h4f;
        this.Z = new Object();
        this.w0 = new ArrayDeque();
    }

    public ew0(File file, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = false;
                this.c = null;
                this.o = null;
                this.X = null;
                this.Z = new b2b(file);
                return;
            default:
                this.b = false;
                this.c = null;
                this.o = null;
                this.X = null;
                this.Z = new mn(file);
                return;
        }
    }
}
