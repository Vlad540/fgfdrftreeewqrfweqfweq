package defpackage;

import java.io.File;
import java.net.URI;
import java.nio.ByteBuffer;
import kotlinx.coroutines.internal.ContextScope;
import one.me.sdk.transfer.exceptions.HttpErrorException;
import one.me.sdk.transfer.exceptions.UnexpectedResponseBodyException;

/* renamed from: ag5  reason: default package */
public final class ag5 {
    public final int a;
    public final String b;
    public final zpe c;
    public final String d;
    public final t97 e;
    public final t97 f;
    public final t97 g;
    public final URI h;
    public final File i;
    public final long j;
    public final m2d k;
    public final tc9 l;
    public final r7e m;
    public final tc9 n;
    public final r7e o;
    public final h37 p;
    public final ContextScope q;
    public long r;
    public String s;
    public final oxe t;
    public final boolean u;

    /* JADX WARNING: type inference failed for: r3v5, types: [java.lang.Object, m2d] */
    public ag5(String str, String str2, pae pae, r7e r7e, t97 t97, t97 t972, t97 t973, int i2, String str3, zpe zpe) {
        String str4;
        String str5;
        String str6 = str2;
        t97 t974 = t972;
        int i3 = i2;
        this.a = i3;
        this.b = str3;
        this.c = zpe;
        String name = ag5.class.getName();
        this.d = name;
        this.e = r7e;
        this.f = t973;
        this.g = t974;
        String str7 = str;
        this.h = new URI(str);
        File file = new File(str6);
        this.i = file;
        long length = file.length();
        this.j = length;
        ? obj = new Object();
        obj.f = zpe.b();
        int t2 = hr1.t(i2);
        if (t2 == 0) {
            str4 = "HTTP_UPLOAD_IMAGE";
        } else if (t2 == 1) {
            str4 = "HTTP_UPLOAD_AUDIO";
        } else if (t2 == 2) {
            str4 = "HTTP_UPLOAD_VIDEO";
        } else if (t2 != 3) {
            if (i3 == 1) {
                str5 = "PHOTO";
            } else if (i3 == 2) {
                str5 = "AUDIO";
            } else if (i3 == 3) {
                str5 = "VIDEO";
            } else if (i3 == 4) {
                str5 = "FILE";
            } else if (i3 == 5) {
                str5 = "STICKER";
            } else {
                throw null;
            }
            str4 = "HTTP_UPLOAD_".concat(str5);
        } else {
            str4 = "HTTP_UPLOAD_FILE";
        }
        obj.a = str4;
        this.k = obj;
        this.l = uc9.a();
        this.m = new r7e(new qf5(this, 0));
        this.n = uc9.a();
        this.o = new r7e(new xq(13, t974));
        this.p = lp.a();
        this.q = n1g.a((ju3) ((n3a) pae).d.getValue());
        this.t = new oxe(t97, zpe, length, i2);
        this.u = true;
        if (!file.exists()) {
            udd.s(name, "File by path not found=".concat(str6), (Throwable) null);
            throw new HttpErrorException("File not found", (am6) null, (String) null, 6);
        } else if (length == 0) {
            fn6 fn6 = udd.e;
            if (fn6 != null && fn6.c()) {
                fn6.d(tn7.w0, name, "Upload failed: trying to upload file with zero length", (Throwable) null);
            }
            throw new HttpErrorException("File is zero length", (am6) null, (String) null, 6);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.ag5 r8, defpackage.fle r9, defpackage.xve r10, java.nio.channels.AsynchronousFileChannel r11, i26 r12, kotlin.coroutines.Continuation r13) {
        /*
            r8.getClass()
            boolean r0 = r13 instanceof defpackage.xf5
            if (r0 == 0) goto L_0x0016
            r0 = r13
            xf5 r0 = (defpackage.xf5) r0
            int r1 = r0.z0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.z0 = r1
            goto L_0x001b
        L_0x0016:
            xf5 r0 = new xf5
            r0.<init>(r8, r13)
        L_0x001b:
            java.lang.Object r13 = r0.x0
            pu3 r1 = pu3.a
            int r2 = r0.z0
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x0069
            if (r2 == r6) goto L_0x005b
            if (r2 == r5) goto L_0x0048
            if (r2 == r4) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            wx3.H(r13)
            goto L_0x00c4
        L_0x0035:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003d:
            xve r8 = r0.Y
            fle r9 = r0.X
            ag5 r10 = r0.o
            wx3.H(r13)
            goto L_0x00b5
        L_0x0048:
            i26 r8 = r0.w0
            java.nio.channels.AsynchronousFileChannel r9 = r0.Z
            xve r10 = r0.Y
            fle r11 = r0.X
            ag5 r12 = r0.o
            wx3.H(r13)
            r2 = r10
            r5 = r11
            r6 = r12
            r12 = r8
            r11 = r9
            goto L_0x009b
        L_0x005b:
            i26 r12 = r0.w0
            java.nio.channels.AsynchronousFileChannel r11 = r0.Z
            xve r10 = r0.Y
            fle r9 = r0.X
            ag5 r8 = r0.o
            wx3.H(r13)
            goto L_0x0085
        L_0x0069:
            wx3.H(r13)
            java.net.URI r13 = r8.h
            java.lang.String r13 = r13.getHost()
            r0.o = r8
            r0.X = r9
            r0.Y = r10
            r0.Z = r11
            r0.w0 = r12
            r0.z0 = r6
            java.lang.Object r13 = r9.b(r13, r0)
            if (r13 != r1) goto L_0x0085
            goto L_0x00c6
        L_0x0085:
            r0.o = r8
            r0.X = r9
            r0.Y = r10
            r0.Z = r11
            r0.w0 = r12
            r0.z0 = r5
            java.lang.Object r13 = r8.f(r9, r10, r0)
            if (r13 != r1) goto L_0x0098
            goto L_0x00c6
        L_0x0098:
            r6 = r8
            r5 = r9
            r2 = r10
        L_0x009b:
            r0.o = r6
            r0.X = r5
            r0.Y = r2
            r0.Z = r7
            r0.w0 = r7
            r0.z0 = r4
            r8 = r6
            r9 = r5
            r10 = r2
            r13 = r0
            java.lang.Object r8 = r8.e(r9, r10, r11, r12, r13)
            if (r8 != r1) goto L_0x00b2
            goto L_0x00c6
        L_0x00b2:
            r8 = r2
            r9 = r5
            r10 = r6
        L_0x00b5:
            r0.o = r7
            r0.X = r7
            r0.Y = r7
            r0.z0 = r3
            java.lang.Object r8 = r10.d(r9, r8, r0)
            if (r8 != r1) goto L_0x00c4
            goto L_0x00c6
        L_0x00c4:
            jue r1 = jue.a
        L_0x00c6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ag5.a(ag5, fle, xve, java.nio.channels.AsynchronousFileChannel, sf5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final String b(String str) {
        String str2;
        int i2;
        int i3;
        try {
            int length = str.length();
            int i4 = 0;
            while (true) {
                i3 = -1;
                if (i4 >= length) {
                    i4 = -1;
                    break;
                } else if (str.charAt(i4) == '{') {
                    break;
                } else {
                    i4++;
                }
            }
            int length2 = str.length() - 1;
            if (length2 >= 0) {
                while (true) {
                    int i5 = length2 - 1;
                    if (str.charAt(length2) == '}') {
                        i3 = length2;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length2 = i5;
                    }
                }
            }
            str2 = str.substring(i4, i3 + 1);
        } catch (Throwable th) {
            str2 = new kcc(th);
        }
        if (str2 instanceof kcc) {
            str2 = null;
        }
        String str3 = str2;
        if (str3 == null && ((i2 = this.a) == 1 || i2 == 5)) {
            this.c.e(new UnexpectedResponseBodyException("Not found token in response", str));
        }
        return str3;
    }

    public final void c(xve xve, long j2, long j3, long j4) {
        StringBuilder sb = new StringBuilder();
        StringBuilder k2 = hr1.k(j2, "Content-Range: bytes ", "-");
        k2.append((j2 + j3) - 1);
        k2.append("/");
        k2.append(j4);
        k2.append("\n");
        sb.append(k2.toString());
        sb.append("Content-Length: " + j3 + "\n");
        sb.append(10);
        String sb2 = sb.toString();
        if (this.u) {
            String str = this.d;
            fn6 fn6 = udd.e;
            if (fn6 != null && fn6.c()) {
                tn7 tn7 = tn7.X;
                fn6.d(tn7, str, xve + ": remained headers " + sb2, (Throwable) null);
            }
        }
        ((ByteBuffer) this.o.getValue()).clear();
        ((ByteBuffer) this.o.getValue()).put(sb2.getBytes(e22.a));
        ((ByteBuffer) this.o.getValue()).flip();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(defpackage.fle r11, defpackage.xve r12, kotlin.coroutines.Continuation r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.wf5
            if (r0 == 0) goto L_0x0013
            r0 = r13
            wf5 r0 = (defpackage.wf5) r0
            int r1 = r0.x0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x0 = r1
            goto L_0x0018
        L_0x0013:
            wf5 r0 = new wf5
            r0.<init>(r10, r13)
        L_0x0018:
            java.lang.Object r13 = r0.Z
            pu3 r1 = pu3.a
            int r2 = r0.x0
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            xve r12 = r0.Y
            fle r11 = r0.X
            ag5 r10 = r0.o
            wx3.H(r13)
            goto L_0x005b
        L_0x002d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0035:
            wx3.H(r13)
            java.nio.ByteBuffer r13 = r11.d()
            r13.clear()
            java.nio.ByteBuffer r13 = r11.d()
            r0.o = r10
            r0.X = r11
            r0.Y = r12
            r0.x0 = r3
            cle r2 = r11.g
            if (r2 == 0) goto L_0x0220
            mu0 r4 = new mu0
            r4.<init>((java.nio.ByteBuffer) r13)
            java.lang.Object r13 = r2.h(r4, r0)
            if (r13 != r1) goto L_0x005b
            return r1
        L_0x005b:
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            am6 r0 = defpackage.pa2.l
            r1 = 4
            r2 = 0
            if (r13 <= 0) goto L_0x0218
            java.nio.ByteBuffer r4 = r11.d()
            byte[] r4 = r4.array()
            java.nio.charset.Charset r5 = e22.a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r4, r5)
            boolean r4 = r10.u
            if (r4 == 0) goto L_0x00a0
            java.lang.String r4 = r10.d
            fn6 r5 = udd.e
            if (r5 != 0) goto L_0x0081
            goto L_0x00a0
        L_0x0081:
            boolean r7 = r5.c()
            if (r7 == 0) goto L_0x00a0
            tn7 r7 = defpackage.tn7.X
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r12)
            java.lang.String r9 = " Got response = "
            r8.append(r9)
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            r5.d(r7, r4, r8, r2)
        L_0x00a0:
            java.nio.ByteBuffer r4 = r11.d()
            int r4 = r4.capacity()
            if (r13 < r4) goto L_0x00c4
            zpe r4 = r10.c
            one.me.sdk.transfer.exceptions.UnexpectedResponseBodyException r5 = new one.me.sdk.transfer.exceptions.UnexpectedResponseBodyException
            java.nio.ByteBuffer r11 = r11.d()
            int r11 = r11.capacity()
            java.lang.String r7 = "Read too much bytes in response="
            java.lang.String r8 = ", capacity="
            java.lang.String r11 = defpackage.me4.g(r7, r13, r11, r8)
            r5.<init>(r11, r6)
            r4.e(r5)
        L_0x00c4:
            int r11 = r10.a
            int r11 = hr1.t(r11)
            if (r11 == 0) goto L_0x00d9
            if (r11 == r1) goto L_0x00d0
            r11 = r2
            goto L_0x00e1
        L_0x00d0:
            java.lang.String r11 = r10.b(r6)
            java.lang.String r11 = z3d.B(r11)
            goto L_0x00e1
        L_0x00d9:
            java.lang.String r11 = r10.b(r6)
            java.lang.String r11 = z3d.v(r11)
        L_0x00e1:
            r10.s = r11
            vqe r11 = h0e.g0(r6)
            java.lang.Object r11 = myc.N(r11)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.CharSequence r11 = h0e.B0(r11)
            java.lang.String r11 = r11.toString()
            int r13 = r11.length()
            int r13 = r13 + -3
            int r1 = r11.length()
            java.lang.String r13 = r11.substring(r13, r1)
            java.lang.Integer r13 = o0e.G(r13)
            if (r13 == 0) goto L_0x01f1
            fz6 r11 = new fz6
            r0 = 299(0x12b, float:4.19E-43)
            r1 = 200(0xc8, float:2.8E-43)
            r11.<init>(r1, r0, r3)
            int r0 = r13.intValue()
            r4 = 0
            if (r1 > r0) goto L_0x011f
            int r11 = r11.b
            if (r0 > r11) goto L_0x011f
            r11 = r3
            goto L_0x0120
        L_0x011f:
            r11 = r4
        L_0x0120:
            if (r11 == 0) goto L_0x015d
            m2d r11 = r10.k
            r11.d = r4
            r11.e = r2
            zpe r13 = r10.c
            long r0 = r13.b()
            r11.g = r0
            hi5 r11 = r11.a()
            r13.a(r11)
            java.lang.String r10 = r10.d
            fn6 r11 = udd.e
            if (r11 != 0) goto L_0x013e
            goto L_0x015a
        L_0x013e:
            boolean r13 = r11.c()
            if (r13 == 0) goto L_0x015a
            tn7 r13 = defpackage.tn7.X
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            java.lang.String r12 = " Got successful response"
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r11.d(r13, r10, r12, r2)
        L_0x015a:
            jue r10 = jue.a
            return r10
        L_0x015d:
            zpe r11 = r10.c
            int r12 = r13.intValue()
            t97 r11 = r11.a
            java.lang.Object r11 = r11.getValue()
            bd r11 = (defpackage.bd) r11
            in7 r0 = r11.a()
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x0176
            goto L_0x017f
        L_0x0176:
            java.lang.String r0 = "HTTP_ERROR"
            java.lang.String r12 = java.lang.String.valueOf(r12)
            r11.g(r0, r12)
        L_0x017f:
            m2d r11 = r10.k
            java.lang.String r12 = r13.toString()
            r11.d = r3
            r11.e = r12
            zpe r10 = r10.c
            long r0 = r10.b()
            r11.g = r0
            hi5 r11 = r11.a()
            r10.a(r11)
            vqe r10 = h0e.g0(r6)
            dyc r11 = r10.a
            java.util.Iterator r11 = r11.iterator()
        L_0x01a2:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x01be
            u16 r12 = r10.b
            java.lang.Object r0 = r11.next()
            java.lang.Object r12 = r12.invoke(r0)
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "X-Reason"
            boolean r0 = p0e.Q(r0, r1, r4)
            if (r0 == 0) goto L_0x01a2
            goto L_0x01bf
        L_0x01be:
            r12 = r2
        L_0x01bf:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L_0x01ca
            java.lang.String r10 = ":"
            java.lang.String r10 = h0e.u0(r12, r10)
            goto L_0x01cc
        L_0x01ca:
            java.lang.String r10 = "'Empty'"
        L_0x01cc:
            int r11 = r13.intValue()
            am6 r10 = defpackage.pa2.o(r11, r10)
            am6 r11 = defpackage.pa2.g
            boolean r11 = r11.equals(r10)
            if (r11 != 0) goto L_0x01eb
            am6 r11 = defpackage.pa2.e
            boolean r11 = r11.equals(r10)
            if (r11 == 0) goto L_0x01e5
            goto L_0x01eb
        L_0x01e5:
            one.me.sdk.transfer.exceptions.HttpErrorException r11 = new one.me.sdk.transfer.exceptions.HttpErrorException
            r11.<init>(r2, r10, r6, r3)
            throw r11
        L_0x01eb:
            one.me.sdk.transfer.exceptions.HttpUrlExpiredException r11 = new one.me.sdk.transfer.exceptions.HttpUrlExpiredException
            r11.<init>(r2, r10, r6, r3)
            throw r11
        L_0x01f1:
            java.lang.String r10 = r10.d
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r12)
            java.lang.String r12 = " Got unknown response code="
            r13.append(r12)
            r13.append(r11)
            java.lang.String r12 = r13.toString()
            udd.s(r10, r12, r2)
            one.me.sdk.transfer.exceptions.HttpErrorException r10 = new one.me.sdk.transfer.exceptions.HttpErrorException
            java.lang.String r12 = "Unknown code: line='"
            java.lang.String r13 = "'"
            java.lang.String r11 = defpackage.wn6.i(r12, r11, r13)
            r10.<init>(r11, r0, r6)
            throw r10
        L_0x0218:
            one.me.sdk.transfer.exceptions.HttpErrorException r10 = new one.me.sdk.transfer.exceptions.HttpErrorException
            java.lang.String r11 = "Empty response"
            r10.<init>(r11, r0, r2, r1)
            throw r10
        L_0x0220:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Required value was null."
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ag5.d(fle, xve, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0137 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0152 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(defpackage.fle r20, defpackage.xve r21, java.nio.channels.AsynchronousFileChannel r22, i26 r23, kotlin.coroutines.Continuation r24) {
        /*
            r19 = this;
            r0 = r24
            boolean r1 = r0 instanceof defpackage.yf5
            if (r1 == 0) goto L_0x0017
            r1 = r0
            yf5 r1 = (defpackage.yf5) r1
            int r2 = r1.A0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.A0 = r2
            r2 = r19
            goto L_0x001e
        L_0x0017:
            yf5 r1 = new yf5
            r2 = r19
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r0 = r1.y0
            pu3 r3 = pu3.a
            int r4 = r1.A0
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L_0x0085
            if (r4 == r8) goto L_0x0071
            if (r4 == r7) goto L_0x0060
            if (r4 == r6) goto L_0x004d
            if (r4 != r5) goto L_0x0045
            i26 r2 = r1.w0
            java.nio.channels.AsynchronousFileChannel r4 = r1.Z
            xve r9 = r1.Y
            fle r10 = r1.X
            ag5 r11 = r1.o
            wx3.H(r0)
            r7 = r1
            r1 = r9
            r9 = r2
        L_0x0042:
            r2 = r11
            goto L_0x0191
        L_0x0045:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004d:
            i26 r2 = r1.w0
            java.nio.channels.AsynchronousFileChannel r4 = r1.Z
            xve r9 = r1.Y
            fle r10 = r1.X
            ag5 r11 = r1.o
            wx3.H(r0)
            r7 = r1
            r1 = r9
            r9 = r2
            r2 = r0
            goto L_0x015c
        L_0x0060:
            int r2 = r1.x0
            i26 r4 = r1.w0
            java.nio.channels.AsynchronousFileChannel r9 = r1.Z
            xve r10 = r1.Y
            fle r11 = r1.X
            ag5 r12 = r1.o
            wx3.H(r0)
            goto L_0x0138
        L_0x0071:
            i26 r2 = r1.w0
            java.nio.channels.AsynchronousFileChannel r4 = r1.Z
            xve r9 = r1.Y
            fle r10 = r1.X
            ag5 r11 = r1.o
            wx3.H(r0)
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r4
            r4 = r2
            goto L_0x0112
        L_0x0085:
            wx3.H(r0)
            r0 = r20
            r4 = r22
            r9 = r23
            r10 = r1
            r1 = r21
        L_0x0091:
            long r11 = r1.b
            long r13 = r1.c
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 != 0) goto L_0x00c4
            boolean r0 = r2.u
            if (r0 == 0) goto L_0x00c1
            java.lang.String r0 = r2.d
            fn6 r2 = udd.e
            if (r2 != 0) goto L_0x00a4
            goto L_0x00c1
        L_0x00a4:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x00c1
            tn7 r3 = defpackage.tn7.X
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = " wrote body content"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r4 = 0
            r2.d(r3, r0, r1, r4)
        L_0x00c1:
            jue r0 = jue.a
            return r0
        L_0x00c4:
            java.nio.ByteBuffer r11 = r0.c()
            r11.clear()
            java.nio.ByteBuffer r11 = r0.c()
            long r12 = r1.a
            long r14 = r1.c
            long r12 = r12 + r14
            r10.o = r2
            r10.X = r0
            r10.Y = r1
            r10.Z = r4
            r10.w0 = r9
            r10.A0 = r8
            zv1 r14 = new zv1
            kotlin.coroutines.Continuation r15 = urd.y(r10)
            r14.<init>(r8, r15)
            r14.n()
            ju r15 = defpackage.ju.b
            r19 = r4
            r20 = r11
            r21 = r12
            r23 = r14
            r24 = r15
            r19.read(r20, r21, r23, r24)
            java.lang.Object r11 = r14.m()
            if (r11 != r3) goto L_0x0102
            return r3
        L_0x0102:
            r12 = r2
            r16 = r11
            r11 = r0
            r0 = r16
            r17 = r10
            r10 = r1
            r1 = r17
            r18 = r9
            r9 = r4
            r4 = r18
        L_0x0112:
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            java.nio.ByteBuffer r0 = r11.c()
            r0.flip()
            java.nio.ByteBuffer r0 = r11.c()
            r1.o = r12
            r1.X = r11
            r1.Y = r10
            r1.Z = r9
            r1.w0 = r4
            r1.x0 = r2
            r1.A0 = r7
            java.lang.Object r0 = r11.e(r0, r1)
            if (r0 != r3) goto L_0x0138
            return r3
        L_0x0138:
            long r13 = r10.c
            long r7 = (long) r2
            long r13 = r13 + r7
            r10.c = r13
            oxe r2 = r12.t
            r1.o = r12
            r1.X = r11
            r1.Y = r10
            r1.Z = r9
            r1.w0 = r4
            r1.A0 = r6
            java.lang.Object r2 = r2.h(r1)
            if (r2 != r3) goto L_0x0153
            return r3
        L_0x0153:
            r7 = r1
            r1 = r10
            r10 = r11
            r11 = r12
            r16 = r9
            r9 = r4
            r4 = r16
        L_0x015c:
            java.lang.Number r2 = (java.lang.Number) r2
            long r12 = r2.longValue()
            m2d r2 = r11.k
            int r8 = (int) r12
            r2.b = r8
            float r2 = (float) r12
            long r12 = r11.j
            float r8 = (float) r12
            float r2 = r2 / r8
            r8 = 1065353216(0x3f800000, float:1.0)
            int r8 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r8 != 0) goto L_0x0179
            r0 = r10
            r2 = r11
        L_0x0174:
            r8 = 1
            r10 = r7
            r7 = 2
            goto L_0x0091
        L_0x0179:
            java.lang.Float r8 = new java.lang.Float
            r8.<init>(r2)
            r7.o = r11
            r7.X = r10
            r7.Y = r1
            r7.Z = r4
            r7.w0 = r9
            r7.A0 = r5
            java.lang.Object r2 = r9.invoke(r8, r7)
            if (r2 != r3) goto L_0x0042
            return r3
        L_0x0191:
            r0 = r10
            goto L_0x0174
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ag5.e(fle, xve, java.nio.channels.AsynchronousFileChannel, i26, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: qc9} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ea A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0112 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(defpackage.fle r19, defpackage.xve r20, kotlin.coroutines.Continuation r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r21
            boolean r2 = r1 instanceof defpackage.zf5
            if (r2 == 0) goto L_0x0017
            r2 = r1
            zf5 r2 = (defpackage.zf5) r2
            int r3 = r2.y0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.y0 = r3
            goto L_0x001c
        L_0x0017:
            zf5 r2 = new zf5
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.w0
            pu3 r3 = pu3.a
            int r4 = r2.y0
            r5 = 0
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            if (r4 == 0) goto L_0x0086
            if (r4 == r9) goto L_0x0072
            if (r4 == r8) goto L_0x005f
            if (r4 == r7) goto L_0x004c
            if (r4 != r6) goto L_0x0044
            java.lang.Object r0 = r2.Y
            r3 = r0
            qc9 r3 = (qc9) r3
            java.lang.Object r0 = r2.X
            xve r0 = (defpackage.xve) r0
            ag5 r2 = r2.o
            wx3.H(r1)     // Catch:{ all -> 0x0041 }
            goto L_0x0116
        L_0x0041:
            r0 = move-exception
            goto L_0x014e
        L_0x0044:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004c:
            qc9 r0 = r2.Z
            java.lang.Object r4 = r2.Y
            xve r4 = (defpackage.xve) r4
            java.lang.Object r7 = r2.X
            fle r7 = (defpackage.fle) r7
            ag5 r8 = r2.o
            wx3.H(r1)
            r1 = r0
            r0 = r4
            goto L_0x00ed
        L_0x005f:
            qc9 r4 = r2.Z
            java.lang.Object r0 = r2.Y
            xve r0 = (defpackage.xve) r0
            java.lang.Object r8 = r2.X
            fle r8 = (defpackage.fle) r8
            ag5 r9 = r2.o
            wx3.H(r1)     // Catch:{ all -> 0x006f }
            goto L_0x00c8
        L_0x006f:
            r0 = move-exception
            goto L_0x0158
        L_0x0072:
            qc9 r0 = r2.Z
            java.lang.Object r4 = r2.Y
            xve r4 = (defpackage.xve) r4
            java.lang.Object r9 = r2.X
            fle r9 = (defpackage.fle) r9
            ag5 r10 = r2.o
            wx3.H(r1)
            r1 = r0
            r0 = r10
            r10 = r4
            r4 = r9
            goto L_0x00a0
        L_0x0086:
            wx3.H(r1)
            tc9 r1 = r0.l
            r2.o = r0
            r4 = r19
            r2.X = r4
            r10 = r20
            r2.Y = r10
            r2.Z = r1
            r2.y0 = r9
            java.lang.Object r9 = r1.d(r2)
            if (r9 != r3) goto L_0x00a0
            return r3
        L_0x00a0:
            r7e r9 = r0.m     // Catch:{ all -> 0x0156 }
            java.lang.Object r9 = r9.getValue()     // Catch:{ all -> 0x0156 }
            java.nio.ByteBuffer r9 = (java.nio.ByteBuffer) r9     // Catch:{ all -> 0x0156 }
            r9.mark()     // Catch:{ all -> 0x0156 }
            r7e r9 = r0.m     // Catch:{ all -> 0x0156 }
            java.lang.Object r9 = r9.getValue()     // Catch:{ all -> 0x0156 }
            java.nio.ByteBuffer r9 = (java.nio.ByteBuffer) r9     // Catch:{ all -> 0x0156 }
            r2.o = r0     // Catch:{ all -> 0x0156 }
            r2.X = r4     // Catch:{ all -> 0x0156 }
            r2.Y = r10     // Catch:{ all -> 0x0156 }
            r2.Z = r1     // Catch:{ all -> 0x0156 }
            r2.y0 = r8     // Catch:{ all -> 0x0156 }
            java.lang.Object r8 = r4.e(r9, r2)     // Catch:{ all -> 0x0156 }
            if (r8 != r3) goto L_0x00c4
            return r3
        L_0x00c4:
            r9 = r0
            r8 = r4
            r0 = r10
            r4 = r1
        L_0x00c8:
            r7e r1 = r9.m     // Catch:{ all -> 0x006f }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x006f }
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1     // Catch:{ all -> 0x006f }
            r1.reset()     // Catch:{ all -> 0x006f }
            tc9 r4 = (tc9) r4
            r4.e(r5)
            tc9 r1 = r9.n
            r2.o = r9
            r2.X = r8
            r2.Y = r0
            r2.Z = r1
            r2.y0 = r7
            java.lang.Object r4 = r1.d(r2)
            if (r4 != r3) goto L_0x00eb
            return r3
        L_0x00eb:
            r7 = r8
            r8 = r9
        L_0x00ed:
            long r12 = r0.a     // Catch:{ all -> 0x014c }
            long r14 = r0.b     // Catch:{ all -> 0x014c }
            long r9 = r8.j     // Catch:{ all -> 0x014c }
            r16 = r9
            r10 = r8
            r11 = r0
            r10.c(r11, r12, r14, r16)     // Catch:{ all -> 0x014c }
            r7e r4 = r8.o     // Catch:{ all -> 0x014c }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x014c }
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4     // Catch:{ all -> 0x014c }
            r2.o = r8     // Catch:{ all -> 0x014c }
            r2.X = r0     // Catch:{ all -> 0x014c }
            r2.Y = r1     // Catch:{ all -> 0x014c }
            r2.Z = r5     // Catch:{ all -> 0x014c }
            r2.y0 = r6     // Catch:{ all -> 0x014c }
            java.lang.Object r2 = r7.e(r4, r2)     // Catch:{ all -> 0x014c }
            if (r2 != r3) goto L_0x0113
            return r3
        L_0x0113:
            r3 = r1
            r1 = r2
            r2 = r8
        L_0x0116:
            java.lang.Number r1 = (java.lang.Number) r1     // Catch:{ all -> 0x0041 }
            r1.longValue()     // Catch:{ all -> 0x0041 }
            tc9 r3 = (tc9) r3
            r3.e(r5)
            boolean r1 = r2.u
            if (r1 == 0) goto L_0x0147
            java.lang.String r1 = r2.d
            fn6 r2 = udd.e
            if (r2 != 0) goto L_0x012b
            goto L_0x0147
        L_0x012b:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x0147
            tn7 r3 = defpackage.tn7.X
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = " wrote headers"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2.d(r3, r1, r0, r5)
        L_0x0147:
            jue r0 = jue.a
            return r0
        L_0x014a:
            r3 = r1
            goto L_0x014e
        L_0x014c:
            r0 = move-exception
            goto L_0x014a
        L_0x014e:
            tc9 r3 = (tc9) r3
            r3.e(r5)
            throw r0
        L_0x0154:
            r4 = r1
            goto L_0x0158
        L_0x0156:
            r0 = move-exception
            goto L_0x0154
        L_0x0158:
            tc9 r4 = (tc9) r4
            r4.e(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ag5.f(fle, xve, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
