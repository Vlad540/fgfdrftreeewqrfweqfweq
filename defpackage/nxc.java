package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Provider;
import org.webrtc.PeerConnectionFactory;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Protos;

/* renamed from: nxc  reason: default package */
public final class nxc implements fw0, bf8, go4, u1e, uvc, ot4, Provider {
    public static final String[] X = {ApiProtocol.KEY_ID, "key", "metadata"};
    public Object a;
    public Object b;
    public Object c;
    public Object o;

    public /* synthetic */ nxc(Object obj) {
        this.b = obj;
    }

    public static void p(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            StringBuilder n = me4.n(str, ": EGL error: 0x");
            n.append(Integer.toHexString(eglGetError));
            throw new RuntimeException(n.toString());
        }
    }

    public static void y(String str) {
        FileInputStream fileInputStream;
        try {
            File file = new File(str);
            MessageDigest instance = MessageDigest.getInstance("MD5");
            fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    instance.update(bArr, 0, read);
                } else {
                    String.format("%32x", new Object[]{new BigInteger(1, instance.digest())});
                    fileInputStream.close();
                    return;
                }
            }
        } catch (IOException | SecurityException | NoSuchAlgorithmException e) {
            e.toString();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public void A(int i, re8 re8) {
        if (T(i, re8)) {
            ((eo4) this.c).f();
        }
    }

    public k96 B(ic8 ic8) {
        yc3 yc3;
        synchronized (this.a) {
            yc3 = (yc3) ((yr) this.c).get(ic8);
        }
        if (yc3 != null) {
            return yc3.b;
        }
        return null;
    }

    public void D(int i, re8 re8, i78 i78) {
        if (T(i, re8)) {
            ((af8) this.b).c(i78);
        }
    }

    public void E(int i, re8 re8, i78 i78) {
        if (T(i, re8)) {
            ((af8) this.b).m(i78);
        }
    }

    public void F(int i, re8 re8) {
        if (T(i, re8)) {
            ((eo4) this.c).c();
        }
    }

    public void G(SQLiteDatabase sQLiteDatabase) {
        String str = (String) this.a;
        str.getClass();
        e1f.b(sQLiteDatabase, 1, str, 1);
        String str2 = (String) this.o;
        str2.getClass();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
        sQLiteDatabase.execSQL("CREATE TABLE " + ((String) this.o) + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
    }

    public void H(int i, re8 re8) {
        if (T(i, re8)) {
            ((eo4) this.c).b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object I(long r27, java.lang.String r29, defpackage.eu0 r30, defpackage.yt0 r31, kotlin.coroutines.Continuation r32) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r3 = r32
            boolean r4 = r3 instanceof defpackage.mxc
            if (r4 == 0) goto L_0x0019
            r4 = r3
            mxc r4 = (defpackage.mxc) r4
            int r5 = r4.A0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x0019
            int r5 = r5 - r6
            r4.A0 = r5
            goto L_0x001e
        L_0x0019:
            mxc r4 = new mxc
            r4.<init>(r0, r3)
        L_0x001e:
            java.lang.Object r3 = r4.y0
            pu3 r5 = pu3.a
            int r6 = r4.A0
            jue r7 = jue.a
            r8 = 0
            r9 = 2
            r10 = 1
            if (r6 == 0) goto L_0x0056
            if (r6 == r10) goto L_0x0048
            if (r6 != r9) goto L_0x0040
            long r0 = r4.x0
            vo8 r2 = r4.w0
            yt0 r5 = r4.Z
            eu0 r6 = r4.Y
            java.lang.String r9 = r4.X
            nxc r4 = r4.o
            wx3.H(r3)
            goto L_0x00c2
        L_0x0040:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0048:
            long r0 = r4.x0
            yt0 r2 = r4.Z
            eu0 r6 = r4.Y
            java.lang.String r11 = r4.X
            nxc r12 = r4.o
            wx3.H(r3)
            goto L_0x0087
        L_0x0056:
            wx3.H(r3)
            java.lang.Object r3 = r0.o
            t97 r3 = (t97) r3
            java.lang.Object r3 = r3.getValue()
            b29 r3 = (defpackage.b29) r3
            r4.o = r0
            r6 = r29
            r4.X = r6
            r11 = r30
            r4.Y = r11
            r12 = r31
            r4.Z = r12
            r4.x0 = r1
            r4.A0 = r10
            java.lang.Object r3 = r3.a(r1, r4)
            if (r3 != r5) goto L_0x007c
            return r5
        L_0x007c:
            r24 = r12
            r12 = r0
            r0 = r1
            r2 = r24
            r25 = r11
            r11 = r6
            r6 = r25
        L_0x0087:
            vo8 r3 = (defpackage.vo8) r3
            if (r6 == 0) goto L_0x014b
            if (r3 != 0) goto L_0x008f
            goto L_0x014b
        L_0x008f:
            java.lang.Object r10 = r12.o
            t97 r10 = (t97) r10
            java.lang.Object r10 = r10.getValue()
            b29 r10 = (defpackage.b29) r10
            lxc r13 = new lxc
            r14 = 0
            r13.<init>((java.lang.Object) r11, (int) r14, (java.lang.Object) r6)
            r4.o = r12
            r4.X = r11
            r4.Y = r6
            r4.Z = r2
            r4.w0 = r3
            r4.x0 = r0
            r4.A0 = r9
            r10.getClass()
            xp r4 = new xp
            r9 = 3
            r4.<init>(r9, r13)
            nec r9 = r10.a
            r9.n(r0, r4)
            if (r7 != r5) goto L_0x00be
            return r5
        L_0x00be:
            r5 = r2
            r2 = r3
            r9 = r11
            r4 = r12
        L_0x00c2:
            java.lang.Object r3 = r4.c
            t97 r3 = (t97) r3
            java.lang.Object r3 = r3.getValue()
            tt0 r3 = (tt0) r3
            ove r10 = new ove
            long r11 = r2.x0
            long r13 = r2.b
            r2 = 0
            r26 = r10
            r27 = r11
            r29 = r13
            r31 = r2
            r26.<init>(r27, r29, r31)
            r3.c(r10)
            java.lang.Object r2 = r4.a
            java.lang.String r2 = (java.lang.String) r2
            fn6 r3 = udd.e
            if (r3 != 0) goto L_0x00ea
            goto L_0x0110
        L_0x00ea:
            boolean r10 = r3.c()
            if (r10 == 0) goto L_0x0110
            tn7 r10 = defpackage.tn7.X
            java.lang.String r11 = r5.X
            java.lang.String r12 = "Msg keyboard, sendCallback: callbackId:"
            java.lang.String r13 = "|payload:"
            java.lang.String r14 = "|msgId:"
            java.lang.StringBuilder r11 = defpackage.c3d.j(r12, r9, r13, r11, r14)
            r11.append(r0)
            java.lang.String r12 = "|btnP:"
            r11.append(r12)
            r11.append(r6)
            java.lang.String r11 = r11.toString()
            r3.d(r10, r2, r11, r8)
        L_0x0110:
            java.lang.Object r2 = r4.b
            t97 r2 = (t97) r2
            java.lang.Object r2 = r2.getValue()
            pk r2 = (defpackage.pk) r2
            java.lang.String r3 = r5.X
            hu0 r4 = r5.b
            gy9 r2 = (defpackage.gy9) r2
            boolean r5 = r2.p(r0)
            if (r5 != 0) goto L_0x0127
            goto L_0x014a
        L_0x0127:
            e99 r5 = new e99
            g2b r8 = r2.z()
            j2b r8 = (defpackage.j2b) r8
            i03 r8 = r8.a
            long r14 = r8.n()
            long r18 = java.lang.System.currentTimeMillis()
            r13 = r5
            r16 = r9
            r17 = r3
            r20 = r0
            r22 = r6
            r23 = r4
            r13.<init>(r14, r16, r17, r18, r20, r22, r23)
            defpackage.gy9.w(r2, r5)
        L_0x014a:
            return r7
        L_0x014b:
            java.lang.Object r0 = r12.a
            java.lang.String r0 = (java.lang.String) r0
            fn6 r1 = udd.e
            if (r1 != 0) goto L_0x0154
            goto L_0x0179
        L_0x0154:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x0179
            tn7 r2 = defpackage.tn7.Z
            if (r3 == 0) goto L_0x015f
            goto L_0x0160
        L_0x015f:
            r10 = 0
        L_0x0160:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Msg keyboard, fail sendCallback btnP:"
            r3.<init>(r4)
            r3.append(r6)
            java.lang.String r4 = "|msgExist:"
            r3.append(r4)
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            r1.d(r2, r0, r3, r8)
        L_0x0179:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nxc.I(long, java.lang.String, eu0, yt0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public boolean J(ic8 ic8) {
        boolean z;
        synchronized (this.a) {
            z = ((yr) this.c).get(ic8) != null;
        }
        return z;
    }

    public void K(int i, re8 re8, xi7 xi7, i78 i78) {
        if (T(i, re8)) {
            ((af8) this.b).g(xi7, i78);
        }
    }

    public void L(int i, re8 re8, xi7 xi7, i78 i78) {
        if (T(i, re8)) {
            ((af8) this.b).l(xi7, i78);
        }
    }

    public boolean M(String str) {
        String str2 = (String) this.a;
        if (str2 == null) {
            this.a = str;
            return false;
        } else if (str.equals(str2)) {
            return true;
        } else {
            String str3 = (String) this.c;
            if (str3 == null) {
                this.c = str;
                return false;
            } else if (str.equals(str3)) {
                return true;
            } else {
                if (((HashSet) this.o) == null) {
                    HashSet hashSet = new HashSet(16);
                    this.o = hashSet;
                    hashSet.add((String) this.a);
                    ((HashSet) this.o).add((String) this.c);
                }
                return !((HashSet) this.o).add(str);
            }
        }
    }

    public boolean N(ic8 ic8, int i) {
        yc3 yc3;
        synchronized (this.a) {
            yc3 = (yc3) ((yr) this.c).get(ic8);
        }
        cd8 cd8 = (cd8) ((WeakReference) this.o).get();
        return yc3 != null && yc3.e.a(i) && cd8 != null && cd8.s.s().a(i);
    }

    public boolean O(ic8 ic8, int i) {
        yc3 yc3;
        synchronized (this.a) {
            yc3 = (yc3) ((yr) this.c).get(ic8);
        }
        return yc3 != null && yc3.d.a(i);
    }

    public boolean P(ic8 ic8, v1d v1d) {
        yc3 yc3;
        synchronized (this.a) {
            yc3 = (yc3) ((yr) this.c).get(ic8);
        }
        if (yc3 != null) {
            w1d w1d = yc3.d;
            w1d.getClass();
            v1d.getClass();
            if (w1d.a.contains(v1d)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01df, code lost:
        r11 = 128;
        r15 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Q(byte[] r33, int r34, int r35, t1e r36, nf3 r37) {
        /*
            r32 = this;
            r0 = r32
            r1 = r34
            r2 = 4
            r3 = 128(0x80, float:1.794E-43)
            int r5 = r1 + r35
            java.lang.Object r6 = r0.a
            ija r6 = (ija) r6
            r7 = r33
            r6.E(r5, r7)
            r6.G(r1)
            int r1 = r6.a()
            r5 = 255(0xff, float:3.57E-43)
            r7 = 0
            r8 = 2
            if (r1 <= 0) goto L_0x00ab
            byte[] r1 = r6.a
            int r9 = r6.b
            byte r1 = r1[r9]
            r1 = r1 & r5
            r9 = 120(0x78, float:1.68E-43)
            if (r1 != r9) goto L_0x00ab
            java.lang.Object r1 = r0.o
            java.util.zip.Inflater r1 = (java.util.zip.Inflater) r1
            if (r1 != 0) goto L_0x0037
            java.util.zip.Inflater r1 = new java.util.zip.Inflater
            r1.<init>()
            r0.o = r1
        L_0x0037:
            java.lang.Object r1 = r0.o
            java.util.zip.Inflater r1 = (java.util.zip.Inflater) r1
            int r9 = oze.a
            int r9 = r6.a()
            if (r9 > 0) goto L_0x0044
            goto L_0x00ab
        L_0x0044:
            java.lang.Object r9 = r0.b
            ija r9 = (ija) r9
            byte[] r10 = r9.a
            int r10 = r10.length
            int r11 = r6.a()
            if (r10 >= r11) goto L_0x0059
            int r10 = r6.a()
            int r10 = r10 * r8
            r9.b(r10)
        L_0x0059:
            if (r1 != 0) goto L_0x0060
            java.util.zip.Inflater r1 = new java.util.zip.Inflater
            r1.<init>()
        L_0x0060:
            byte[] r10 = r6.a
            int r11 = r6.b
            int r12 = r6.a()
            r1.setInput(r10, r11, r12)
            r10 = r7
        L_0x006c:
            byte[] r11 = r9.a     // Catch:{ DataFormatException -> 0x00a3, all -> 0x0089 }
            int r12 = r11.length     // Catch:{ DataFormatException -> 0x00a3, all -> 0x0089 }
            int r12 = r12 - r10
            int r11 = r1.inflate(r11, r10, r12)     // Catch:{ DataFormatException -> 0x00a3, all -> 0x0089 }
            int r10 = r10 + r11
            boolean r11 = r1.finished()     // Catch:{ DataFormatException -> 0x00a3, all -> 0x0089 }
            if (r11 == 0) goto L_0x008b
            r9.F(r10)     // Catch:{ DataFormatException -> 0x00a3, all -> 0x0089 }
            r1.reset()
            byte[] r1 = r9.a
            int r9 = r9.c
            r6.E(r9, r1)
            goto L_0x00ab
        L_0x0089:
            r0 = move-exception
            goto L_0x00a7
        L_0x008b:
            boolean r11 = r1.needsDictionary()     // Catch:{ DataFormatException -> 0x00a3, all -> 0x0089 }
            if (r11 != 0) goto L_0x00a3
            boolean r11 = r1.needsInput()     // Catch:{ DataFormatException -> 0x00a3, all -> 0x0089 }
            if (r11 == 0) goto L_0x0098
            goto L_0x00a3
        L_0x0098:
            byte[] r11 = r9.a     // Catch:{ DataFormatException -> 0x00a3, all -> 0x0089 }
            int r12 = r11.length     // Catch:{ DataFormatException -> 0x00a3, all -> 0x0089 }
            if (r10 != r12) goto L_0x006c
            int r11 = r11.length     // Catch:{ DataFormatException -> 0x00a3, all -> 0x0089 }
            int r11 = r11 * r8
            r9.b(r11)     // Catch:{ DataFormatException -> 0x00a3, all -> 0x0089 }
            goto L_0x006c
        L_0x00a3:
            r1.reset()
            goto L_0x00ab
        L_0x00a7:
            r1.reset()
            throw r0
        L_0x00ab:
            java.lang.Object r0 = r0.c
            zna r0 = (zna) r0
            r0.c = r7
            r0.d = r7
            r0.e = r7
            r0.f = r7
            r0.g = r7
            r0.h = r7
            java.lang.Object r1 = r0.i
            ija r1 = (ija) r1
            r1.D(r7)
            r0.b = r7
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L_0x00c9:
            int r9 = r6.a()
            r10 = 3
            if (r9 < r10) goto L_0x02be
            int r9 = r6.c
            int r11 = r6.u()
            int r12 = r6.A()
            int r13 = r6.b
            int r13 = r13 + r12
            if (r13 <= r9) goto L_0x00e9
            r6.G(r9)
            r11 = r3
            r35 = r14
            r9 = 1
            r15 = 0
            goto L_0x02b1
        L_0x00e9:
            java.lang.Object r9 = r0.a
            int[] r9 = (int[]) r9
            if (r11 == r3) goto L_0x01e5
            switch(r11) {
                case 20: goto L_0x0161;
                case 21: goto L_0x0119;
                case 22: goto L_0x00f6;
                default: goto L_0x00f2;
            }
        L_0x00f2:
            r35 = r14
            goto L_0x01df
        L_0x00f6:
            r9 = 19
            if (r12 >= r9) goto L_0x00fb
            goto L_0x00f2
        L_0x00fb:
            int r9 = r6.A()
            r0.c = r9
            int r9 = r6.A()
            r0.d = r9
            r9 = 11
            r6.H(r9)
            int r9 = r6.A()
            r0.e = r9
            int r9 = r6.A()
            r0.f = r9
            goto L_0x00f2
        L_0x0119:
            if (r12 >= r2) goto L_0x011c
            goto L_0x00f2
        L_0x011c:
            r6.H(r10)
            int r9 = r6.u()
            r9 = r9 & r3
            if (r9 == 0) goto L_0x0128
            r9 = 1
            goto L_0x0129
        L_0x0128:
            r9 = r7
        L_0x0129:
            int r10 = r12 + -4
            if (r9 == 0) goto L_0x014a
            r9 = 7
            if (r10 >= r9) goto L_0x0131
            goto L_0x00f2
        L_0x0131:
            int r9 = r6.x()
            if (r9 >= r2) goto L_0x0138
            goto L_0x00f2
        L_0x0138:
            int r10 = r6.A()
            r0.g = r10
            int r10 = r6.A()
            r0.h = r10
            int r9 = r9 - r2
            r1.D(r9)
            int r10 = r12 + -11
        L_0x014a:
            int r9 = r1.b
            int r11 = r1.c
            if (r9 >= r11) goto L_0x00f2
            if (r10 <= 0) goto L_0x00f2
            int r11 = r11 - r9
            int r10 = java.lang.Math.min(r10, r11)
            byte[] r11 = r1.a
            r6.e(r9, r11, r10)
            int r9 = r9 + r10
            r1.G(r9)
            goto L_0x00f2
        L_0x0161:
            int r10 = r12 % 5
            if (r10 == r8) goto L_0x0166
            goto L_0x00f2
        L_0x0166:
            r6.H(r8)
            java.util.Arrays.fill(r9, r7)
            int r12 = r12 / 5
            r10 = r7
        L_0x016f:
            if (r10 >= r12) goto L_0x01da
            int r11 = r6.u()
            int r2 = r6.u()
            int r16 = r6.u()
            int r17 = r6.u()
            int r18 = r6.u()
            r32 = r9
            double r8 = (double) r2
            int r2 = r16 + -128
            double r4 = (double) r2
            r19 = 4608992865850220347(0x3ff66e978d4fdf3b, double:1.402)
            double r19 = r19 * r4
            r35 = r14
            double r14 = r19 + r8
            int r14 = (int) r14
            int r15 = r17 + -128
            double r2 = (double) r15
            r20 = 4599871095020959050(0x3fd60663c74fb54a, double:0.34414)
            double r20 = r20 * r2
            double r20 = r8 - r20
            r22 = 4604607620821057148(0x3fe6da3c21187e7c, double:0.71414)
            double r4 = r4 * r22
            double r4 = r20 - r4
            int r4 = (int) r4
            r20 = 4610659197712347431(0x3ffc5a1cac083127, double:1.772)
            double r2 = r2 * r20
            double r2 = r2 + r8
            int r2 = (int) r2
            int r3 = r18 << 24
            r5 = 255(0xff, float:3.57E-43)
            int r8 = oze.j(r14, r7, r5)
            int r8 = r8 << 16
            r3 = r3 | r8
            int r4 = oze.j(r4, r7, r5)
            int r4 = r4 << 8
            r3 = r3 | r4
            int r2 = oze.j(r2, r7, r5)
            r2 = r2 | r3
            r32[r11] = r2
            r2 = 1
            int r10 = r10 + r2
            r9 = r32
            r14 = r35
            r2 = 4
            r3 = 128(0x80, float:1.794E-43)
            r8 = 2
            goto L_0x016f
        L_0x01da:
            r35 = r14
            r2 = 1
            r0.b = r2
        L_0x01df:
            r9 = 1
            r11 = 128(0x80, float:1.794E-43)
            r15 = 0
            goto L_0x02ae
        L_0x01e5:
            r32 = r9
            r35 = r14
            int r2 = r0.c
            if (r2 == 0) goto L_0x0205
            int r2 = r0.d
            if (r2 == 0) goto L_0x0205
            int r2 = r0.g
            if (r2 == 0) goto L_0x0205
            int r2 = r0.h
            if (r2 == 0) goto L_0x0205
            int r2 = r1.c
            if (r2 == 0) goto L_0x0205
            int r3 = r1.b
            if (r3 != r2) goto L_0x0205
            boolean r2 = r0.b
            if (r2 != 0) goto L_0x020a
        L_0x0205:
            r9 = 1
            r11 = 128(0x80, float:1.794E-43)
            goto L_0x029c
        L_0x020a:
            r1.G(r7)
            int r2 = r0.g
            int r3 = r0.h
            int r2 = r2 * r3
            int[] r3 = new int[r2]
            r4 = r7
        L_0x0215:
            if (r4 >= r2) goto L_0x0254
            int r8 = r1.u()
            if (r8 == 0) goto L_0x0228
            r9 = 1
            int r10 = r4 + 1
            r8 = r32[r8]
            r3[r4] = r8
            r4 = r10
        L_0x0225:
            r11 = 128(0x80, float:1.794E-43)
            goto L_0x0215
        L_0x0228:
            r9 = 1
            int r8 = r1.u()
            if (r8 == 0) goto L_0x0225
            r10 = r8 & 64
            if (r10 != 0) goto L_0x0238
            r10 = r8 & 63
        L_0x0235:
            r11 = 128(0x80, float:1.794E-43)
            goto L_0x0242
        L_0x0238:
            r10 = r8 & 63
            int r10 = r10 << 8
            int r11 = r1.u()
            r10 = r10 | r11
            goto L_0x0235
        L_0x0242:
            r8 = r8 & r11
            if (r8 != 0) goto L_0x0248
            r8 = r32[r7]
            goto L_0x024e
        L_0x0248:
            int r8 = r1.u()
            r8 = r32[r8]
        L_0x024e:
            int r10 = r10 + r4
            java.util.Arrays.fill(r3, r4, r10, r8)
            r4 = r10
            goto L_0x0215
        L_0x0254:
            r9 = 1
            r11 = 128(0x80, float:1.794E-43)
            int r2 = r0.g
            int r4 = r0.h
            android.graphics.Bitmap$Config r8 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r18 = android.graphics.Bitmap.createBitmap(r3, r2, r4, r8)
            int r2 = r0.e
            float r2 = (float) r2
            int r3 = r0.c
            float r3 = (float) r3
            float r22 = r2 / r3
            int r2 = r0.f
            float r2 = (float) r2
            int r4 = r0.d
            float r4 = (float) r4
            float r19 = r2 / r4
            int r2 = r0.g
            float r2 = (float) r2
            float r26 = r2 / r3
            int r2 = r0.h
            float r2 = (float) r2
            float r27 = r2 / r4
            uw3 r2 = new uw3
            r14 = r2
            r29 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r31 = 0
            r16 = 0
            r17 = r16
            r15 = r16
            r20 = 0
            r21 = 0
            r23 = 0
            r30 = -2147483648(0xffffffff80000000, float:-0.0)
            r24 = r30
            r25 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r28 = 0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r15 = r2
            goto L_0x029d
        L_0x029c:
            r15 = 0
        L_0x029d:
            r0.c = r7
            r0.d = r7
            r0.e = r7
            r0.f = r7
            r0.g = r7
            r0.h = r7
            r1.D(r7)
            r0.b = r7
        L_0x02ae:
            r6.G(r13)
        L_0x02b1:
            r2 = r35
            if (r15 == 0) goto L_0x02b8
            r2.add(r15)
        L_0x02b8:
            r14 = r2
            r3 = r11
            r2 = 4
            r8 = 2
            goto L_0x00c9
        L_0x02be:
            r2 = r14
            xw3 r0 = new xw3
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = r0
            r9.<init>(r10, r12, r14)
            r1 = r37
            r1.accept(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nxc.Q(byte[], int, int, t1e, nf3):void");
    }

    public int R() {
        return 2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:23|24|34|35|36|38|39|40) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        if (r5 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        y(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0062, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0083, code lost:
        if (r1 != null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0085, code lost:
        y(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0088, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x0064 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void S(int r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = "nativeLoad() returned error for "
            java.lang.Object r1 = r5.c
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            if (r1 != 0) goto L_0x000c
            java.lang.System.load(r7)
            return
        L_0x000c:
            r1 = 4
            r6 = r6 & r1
            if (r6 != r1) goto L_0x0015
            java.lang.Object r6 = r5.a
        L_0x0012:
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x0018
        L_0x0015:
            java.lang.Object r6 = r5.o
            goto L_0x0012
        L_0x0018:
            r1 = 0
            java.lang.Object r2 = r5.b     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0064 }
            java.lang.Runtime r2 = (java.lang.Runtime) r2     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0064 }
            monitor-enter(r2)     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0064 }
            java.lang.Object r3 = r5.c     // Catch:{ all -> 0x005e }
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch:{ all -> 0x005e }
            java.lang.Object r5 = r5.b     // Catch:{ all -> 0x005e }
            java.lang.Runtime r5 = (java.lang.Runtime) r5     // Catch:{ all -> 0x005e }
            java.lang.Class<com.facebook.soloader.SoLoader> r4 = com.facebook.soloader.SoLoader.class
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ all -> 0x005c }
            java.lang.Object[] r6 = new java.lang.Object[]{r7, r4, r6}     // Catch:{ all -> 0x005c }
            java.lang.Object r5 = r3.invoke(r5, r6)     // Catch:{ all -> 0x005c }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x005c }
            if (r5 != 0) goto L_0x0042
            monitor-exit(r2)     // Catch:{ all -> 0x003f }
            if (r5 == 0) goto L_0x003e
            y(r7)
        L_0x003e:
            return
        L_0x003f:
            r6 = move-exception
            r1 = r5
            goto L_0x0060
        L_0x0042:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x003f }
            r6.<init>(r0)     // Catch:{ all -> 0x003f }
            r6.append(r7)     // Catch:{ all -> 0x003f }
            java.lang.String r0 = ": "
            r6.append(r0)     // Catch:{ all -> 0x003f }
            r6.append(r5)     // Catch:{ all -> 0x003f }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x003f }
            hld r5 = new hld     // Catch:{ all -> 0x005c }
            r5.<init>(r7, r1)     // Catch:{ all -> 0x005c }
            throw r5     // Catch:{ all -> 0x005c }
        L_0x005c:
            r6 = move-exception
            goto L_0x0060
        L_0x005e:
            r5 = move-exception
            r6 = r5
        L_0x0060:
            monitor-exit(r2)     // Catch:{ all -> 0x005c }
            throw r6     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0064 }
        L_0x0062:
            r5 = move-exception
            goto L_0x0083
        L_0x0064:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0062 }
            r5.<init>()     // Catch:{ all -> 0x0062 }
            java.lang.String r6 = "nativeLoad() error during invocation for "
            r5.append(r6)     // Catch:{ all -> 0x0062 }
            r5.append(r7)     // Catch:{ all -> 0x0062 }
            java.lang.String r6 = ": "
            r5.append(r6)     // Catch:{ all -> 0x0062 }
            r5.append(r1)     // Catch:{ all -> 0x0062 }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x0062 }
            java.lang.RuntimeException r5 = new java.lang.RuntimeException     // Catch:{ all -> 0x0062 }
            r5.<init>(r1)     // Catch:{ all -> 0x0062 }
            throw r5     // Catch:{ all -> 0x0062 }
        L_0x0083:
            if (r1 == 0) goto L_0x0088
            y(r7)
        L_0x0088:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nxc.S(int, java.lang.String):void");
    }

    public boolean T(int i, re8 re8) {
        mf8 mf8 = (mf8) this.a;
        re8 re82 = null;
        if (re8 != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= mf8.c.size()) {
                    break;
                } else if (((re8) mf8.c.get(i2)).d == re8.d) {
                    re82 = re8.b(Pair.create(mf8.b, re8.a));
                    break;
                } else {
                    i2++;
                }
            }
            if (re82 == null) {
                return false;
            }
        }
        int i3 = i + mf8.d;
        af8 af8 = (af8) this.b;
        int i4 = af8.b;
        pf8 pf8 = (pf8) this.o;
        if (i4 != i3 || !mze.a((re8) af8.c, re82)) {
            this.b = new af8((CopyOnWriteArrayList) ((af8) pf8.j).d, i3, re82, 0);
        }
        eo4 eo4 = (eo4) this.c;
        if (eo4.a == i3 && mze.a(eo4.b, re82)) {
            return true;
        }
        this.c = new eo4(((eo4) pf8.k).c, i3, re82);
        return true;
    }

    public void U() {
        EGLDisplay eGLDisplay = (EGLDisplay) this.a;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGL14.eglDestroySurface(eGLDisplay, (EGLSurface) this.c);
            EGL14.eglDestroyContext((EGLDisplay) this.a, (EGLContext) this.b);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate((EGLDisplay) this.a);
        }
        ((Surface) this.o).release();
        this.a = EGL14.EGL_NO_DISPLAY;
        this.b = EGL14.EGL_NO_CONTEXT;
        this.c = EGL14.EGL_NO_SURFACE;
        this.o = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        r1.b.j();
        r4 = (cd8) ((java.lang.ref.WeakReference) r4.o).get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        if (r4 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        if (r4.i() == false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        oze.W(r4.l, new uc3(r4, r5, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void V(ic8 r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.a
            monitor-enter(r0)
            java.lang.Object r1 = r4.c     // Catch:{ all -> 0x0011 }
            yr r1 = (yr) r1     // Catch:{ all -> 0x0011 }
            java.lang.Object r1 = r1.remove(r5)     // Catch:{ all -> 0x0011 }
            yc3 r1 = (yc3) r1     // Catch:{ all -> 0x0011 }
            if (r1 != 0) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            return
        L_0x0011:
            r4 = move-exception
            goto L_0x0041
        L_0x0013:
            java.lang.Object r2 = r4.b     // Catch:{ all -> 0x0011 }
            yr r2 = (yr) r2     // Catch:{ all -> 0x0011 }
            java.lang.Object r3 = r1.a     // Catch:{ all -> 0x0011 }
            r2.remove(r3)     // Catch:{ all -> 0x0011 }
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            k96 r0 = r1.b
            r0.j()
            java.lang.Object r4 = r4.o
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
            java.lang.Object r4 = r4.get()
            cd8 r4 = (cd8) r4
            if (r4 == 0) goto L_0x0040
            boolean r0 = r4.i()
            if (r0 == 0) goto L_0x0035
            goto L_0x0040
        L_0x0035:
            android.os.Handler r0 = r4.l
            uc3 r1 = new uc3
            r2 = 0
            r1.<init>(r4, r5, r2)
            oze.W(r0, r1)
        L_0x0040:
            return
        L_0x0041:
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nxc.V(ic8):void");
    }

    public void a(HashMap hashMap) {
        SQLiteDatabase writableDatabase;
        try {
            writableDatabase = ((c04) this.b).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            G(writableDatabase);
            for (dw0 m : hashMap.values()) {
                m(writableDatabase, m);
            }
            writableDatabase.setTransactionSuccessful();
            ((SparseArray) this.c).clear();
            writableDatabase.endTransaction();
        } catch (SQLException e) {
            throw new IOException(e);
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }

    public void b(dw0 dw0, boolean z) {
        SparseArray sparseArray = (SparseArray) this.c;
        int i = dw0.a;
        if (z) {
            sparseArray.delete(i);
        } else {
            sparseArray.put(i, (Object) null);
        }
    }

    public void c(a06 a06) {
        if (!tic.c((c97) this.o)) {
            udd.q("tt5", "Font already loading");
            return;
        }
        du9 du9 = new du9(new m5(14, this));
        t97 t97 = (t97) this.b;
        mbe mbe = (mbe) t97.getValue();
        mbe.getClass();
        nu9 n = du9.r(((nbe) mbe).a()).n(((nbe) ((mbe) t97.getValue())).b());
        c97 c97 = new c97(new qae(this, a06, 0), new qae(this, a06, 1), z3d.i);
        n.a(c97);
        this.o = c97;
    }

    public void d(dw0 dw0) {
        ((SparseArray) this.c).put(dw0.a, dw0);
    }

    public void e(int i, re8 re8, xi7 xi7, i78 i78) {
        if (T(i, re8)) {
            ((af8) this.b).e(xi7, i78);
        }
    }

    public boolean f() {
        try {
            SQLiteDatabase readableDatabase = ((c04) this.b).getReadableDatabase();
            String str = (String) this.a;
            str.getClass();
            return e1f.a(readableDatabase, 1, str) != -1;
        } catch (SQLException e) {
            throw new IOException(e);
        }
    }

    public void g(int i, re8 re8, Exception exc) {
        if (T(i, re8)) {
            ((eo4) this.c).e(exc);
        }
    }

    public Object get() {
        return new etf((Executor) ((Provider) this.a).get(), (a15) ((Provider) this.b).get(), (i37) ((Provider) this.c).get(), (m7e) ((Provider) this.o).get());
    }

    public void h(HashMap hashMap) {
        SQLiteDatabase writableDatabase;
        SparseArray sparseArray = (SparseArray) this.c;
        if (sparseArray.size() != 0) {
            try {
                writableDatabase = ((c04) this.b).getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i = 0; i < sparseArray.size(); i++) {
                    dw0 dw0 = (dw0) sparseArray.valueAt(i);
                    if (dw0 == null) {
                        int keyAt = sparseArray.keyAt(i);
                        String str = (String) this.o;
                        str.getClass();
                        writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(keyAt)});
                    } else {
                        m(writableDatabase, dw0);
                    }
                }
                writableDatabase.setTransactionSuccessful();
                sparseArray.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e) {
                throw new IOException(e);
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        }
    }

    public void i(long j) {
        String hexString = Long.toHexString(j);
        this.a = hexString;
        this.o = rf0.h("ExoPlayerCacheIndex", hexString);
    }

    public void j(HashMap hashMap, SparseArray sparseArray) {
        Cursor query;
        SQLiteDatabase writableDatabase;
        c04 c04 = (c04) this.b;
        oyb.k(((SparseArray) this.c).size() == 0);
        try {
            SQLiteDatabase readableDatabase = c04.getReadableDatabase();
            String str = (String) this.a;
            str.getClass();
            if (e1f.a(readableDatabase, 1, str) != 1) {
                writableDatabase = c04.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                G(writableDatabase);
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            }
            SQLiteDatabase readableDatabase2 = c04.getReadableDatabase();
            String str2 = (String) this.o;
            str2.getClass();
            query = readableDatabase2.query(str2, X, (String) null, (String[]) null, (String) null, (String) null, (String) null);
            while (query.moveToNext()) {
                int i = query.getInt(0);
                String string = query.getString(1);
                string.getClass();
                hashMap.put(string, new dw0(i, string, mif.a(new DataInputStream(new ByteArrayInputStream(query.getBlob(2))))));
                sparseArray.put(i, string);
            }
            query.close();
            return;
        } catch (SQLiteException e) {
            hashMap.clear();
            sparseArray.clear();
            throw new IOException(e);
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
        throw th;
    }

    public void k() {
        SQLiteDatabase writableDatabase;
        c04 c04 = (c04) this.b;
        String str = (String) this.a;
        str.getClass();
        try {
            String concat = "ExoPlayerCacheIndex".concat(str);
            writableDatabase = c04.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            int i = e1f.a;
            if (oze.f0(writableDatabase, "ExoPlayerVersions")) {
                writableDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), str});
            }
            writableDatabase.execSQL("DROP TABLE IF EXISTS " + concat);
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (SQLException e) {
            throw new IOException(e);
        } catch (SQLException e2) {
            throw new IOException(e2);
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }

    public void l(Object obj, ic8 ic8, w1d w1d, eya eya) {
        synchronized (this.a) {
            try {
                ic8 x = x(obj);
                if (x == null) {
                    ((yr) this.b).put(obj, ic8);
                    ((yr) this.c).put(ic8, new yc3(obj, new k96(), w1d, eya));
                } else {
                    yc3 yc3 = (yc3) ((yr) this.c).get(x);
                    oyb.l(yc3);
                    yc3.d = w1d;
                    yc3.e = eya;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void m(SQLiteDatabase sQLiteDatabase, dw0 dw0) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        mif.b(dw0.e, new DataOutputStream(byteArrayOutputStream));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put(ApiProtocol.KEY_ID, Integer.valueOf(dw0.a));
        contentValues.put("key", dw0.b);
        contentValues.put("metadata", byteArray);
        String str = (String) this.o;
        str.getClass();
        sQLiteDatabase.replaceOrThrow(str, (String) null, contentValues);
    }

    public void n(ic8 ic8, int i, xc3 xc3) {
        synchronized (this.a) {
            try {
                yc3 yc3 = (yc3) ((yr) this.c).get(ic8);
                if (yc3 != null) {
                    eya eya = yc3.g;
                    eya.getClass();
                    ui5 ui5 = new ui5(1);
                    ui5.b(eya.a);
                    ui5.a(i);
                    yc3.g = new eya(ui5.e());
                    yc3.c.add(xc3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public stf o() {
        try {
            return new stf(this);
        } finally {
            e13.S((e13) this.c);
            this.c = null;
            e13.U((ArrayList) this.o);
            this.o = null;
        }
    }

    public void q(yc3 yc3) {
        cd8 cd8 = (cd8) ((WeakReference) this.o).get();
        if (cd8 != null) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            while (atomicBoolean.get()) {
                atomicBoolean.set(false);
                xc3 xc3 = (xc3) yc3.c.poll();
                if (xc3 == null) {
                    yc3.f = false;
                    return;
                }
                AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
                oze.W(cd8.l, new zo5(cd8, x(yc3.a), new co1(this, xc3, atomicBoolean2, yc3, atomicBoolean, 2), 19));
                atomicBoolean2.set(false);
            }
        }
    }

    public void r(ic8 ic8) {
        synchronized (this.a) {
            try {
                yc3 yc3 = (yc3) ((yr) this.c).get(ic8);
                if (yc3 != null) {
                    eya eya = yc3.g;
                    yc3.g = eya.b;
                    yc3.c.add(new vc3(this, ic8, eya));
                    if (!yc3.f) {
                        yc3.f = true;
                        q(yc3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public eya s(ic8 ic8) {
        synchronized (this.a) {
            try {
                yc3 yc3 = (yc3) ((yr) this.c).get(ic8);
                if (yc3 == null) {
                    return null;
                }
                eya eya = yc3.e;
                return eya;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ws6 t() {
        ws6 j;
        synchronized (this.a) {
            j = ws6.j(((yr) this.b).values());
        }
        return j;
    }

    public void u(int i, re8 re8, xi7 xi7, i78 i78, IOException iOException, boolean z) {
        if (T(i, re8)) {
            ((af8) this.b).j(xi7, i78, iOException, z);
        }
    }

    public void v(int i, re8 re8) {
        if (T(i, re8)) {
            ((eo4) this.c).a();
        }
    }

    public void w(int i, re8 re8, int i2) {
        if (T(i, re8)) {
            ((eo4) this.c).d(i2);
        }
    }

    public ic8 x(Object obj) {
        ic8 ic8;
        synchronized (this.a) {
            ic8 = (ic8) ((yr) this.b).get(obj);
        }
        return ic8;
    }

    public c39 z(String str) {
        if (!((ConcurrentHashMap) this.o).containsKey(str)) {
            synchronized (this) {
                try {
                    if (!((ConcurrentHashMap) this.o).containsKey(str)) {
                        InputStream b2 = ((j39) this.a).b(str);
                        ((k39) this.b).getClass();
                        for (apa c2 : k39.a(b2)) {
                            ((c39) this.c).c(c2);
                        }
                        ((ConcurrentHashMap) this.o).put(str, str);
                    }
                } catch (IllegalArgumentException | IllegalStateException e) {
                    throw new IllegalStateException("Failed to read file " + str, e);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (c39) this.c;
    }

    public nxc(t97 t97) {
        t97 t972 = mqc.p;
        t97 t973 = mqc.d;
        t97 t974 = mqc.g;
        this.b = t972;
        this.c = t973;
        this.o = t97;
        this.a = t974;
    }

    public nxc(cd8 cd8) {
        this.b = new kgd();
        this.c = new kgd();
        this.a = new Object();
        this.o = new WeakReference(cd8);
    }

    public nxc(int i) {
        switch (i) {
            case 11:
                this.a = new ija();
                this.b = new ija();
                this.c = new zna(1);
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                this.b = Runtime.getRuntime();
                Method nativeLoadRuntimeMethod = t7e.getNativeLoadRuntimeMethod();
                this.c = nativeLoadRuntimeMethod;
                String str = null;
                String classLoaderLdLoadLibrary = nativeLoadRuntimeMethod != null ? t7e.getClassLoaderLdLoadLibrary() : null;
                this.a = classLoaderLdLoadLibrary;
                if (classLoaderLdLoadLibrary != null) {
                    String[] split = classLoaderLdLoadLibrary.split(":");
                    ArrayList arrayList = new ArrayList(split.length);
                    for (String str2 : split) {
                        if (!str2.contains("!")) {
                            arrayList.add(str2);
                        }
                    }
                    str = TextUtils.join(":", arrayList);
                }
                this.o = str;
                return;
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK /*16*/:
                this.a = new kgd();
                this.b = new SparseArray();
                this.c = new uq7();
                this.o = new kgd();
                return;
            default:
                this.b = null;
                this.c = new ArrayList();
                this.o = null;
                this.a = "";
                return;
        }
    }
}
