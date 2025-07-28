package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import org.apache.http.HttpStatus;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ct0  reason: default package */
public abstract class ct0 {
    public static final int[] a = {2002, 2000, 1920, 1601, 1600, MultiFileUploader.MSG_TRY_UPLOAD_NEXT, 1000, 960, 800, 800, 480, HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_BAD_REQUEST, 2048};
    public static final o36 b = new Object();
    public static final hk9 c = new hk9(16);

    public static ch7 A(ch7 ch7) {
        ch7.getClass();
        return ch7.isDone() ? ch7 : hwf.f(new n36(ch7, 1));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0081, code lost:
        if (r9 != 11) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0088, code lost:
        if (r9 != 11) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008d, code lost:
        if (r9 != 8) goto L_0x0090;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static x3 B(wx1 r9) {
        /*
            r0 = 16
            int r1 = r9.i(r0)
            int r0 = r9.i(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L_0x0018
            r0 = 24
            int r0 = r9.i(r0)
            r2 = 7
            goto L_0x0019
        L_0x0018:
            r2 = r3
        L_0x0019:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L_0x0021
            int r0 = r0 + 2
        L_0x0021:
            r1 = 2
            int r2 = r9.i(r1)
            r4 = 3
            if (r2 != r4) goto L_0x0032
        L_0x0029:
            r9.i(r1)
            boolean r2 = r9.h()
            if (r2 != 0) goto L_0x0029
        L_0x0032:
            r2 = 10
            int r2 = r9.i(r2)
            boolean r5 = r9.h()
            if (r5 == 0) goto L_0x0047
            int r5 = r9.i(r4)
            if (r5 <= 0) goto L_0x0047
            r9.t(r1)
        L_0x0047:
            boolean r5 = r9.h()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r5 == 0) goto L_0x0055
            r5 = r7
            goto L_0x0056
        L_0x0055:
            r5 = r6
        L_0x0056:
            int r9 = r9.i(r3)
            int[] r8 = a
            if (r5 != r6) goto L_0x0065
            r6 = 13
            if (r9 != r6) goto L_0x0065
            r9 = r8[r9]
            goto L_0x0093
        L_0x0065:
            if (r5 != r7) goto L_0x0092
            r6 = 14
            if (r9 >= r6) goto L_0x0092
            r6 = r8[r9]
            int r2 = r2 % 5
            r7 = 1
            r8 = 8
            if (r2 == r7) goto L_0x008b
            r7 = 11
            if (r2 == r1) goto L_0x0086
            if (r2 == r4) goto L_0x008b
            if (r2 == r3) goto L_0x007d
            goto L_0x0090
        L_0x007d:
            if (r9 == r4) goto L_0x0083
            if (r9 == r8) goto L_0x0083
            if (r9 != r7) goto L_0x0090
        L_0x0083:
            int r9 = r6 + 1
            goto L_0x0093
        L_0x0086:
            if (r9 == r8) goto L_0x0083
            if (r9 != r7) goto L_0x0090
            goto L_0x0083
        L_0x008b:
            if (r9 == r4) goto L_0x0083
            if (r9 != r8) goto L_0x0090
            goto L_0x0083
        L_0x0090:
            r9 = r6
            goto L_0x0093
        L_0x0092:
            r9 = 0
        L_0x0093:
            x3 r1 = new x3
            r1.<init>(r5, r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ct0.B(wx1):x3");
    }

    public static void C(ch7 ch7, sn1 sn1) {
        D(true, ch7, sn1, pa2.j());
    }

    public static void D(boolean z, ch7 ch7, sn1 sn1, mh4 mh4) {
        ch7.getClass();
        sn1.getClass();
        mh4.getClass();
        a(ch7, new b2b(sn1), mh4);
        if (z) {
            sn1.a(new re(27, ch7), pa2.j());
        }
    }

    public static int E(int i, ija ija) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return ija.u() + 1;
            case 7:
                return ija.A() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case Protos.Attaches.Attach.PRESENT /*12*/:
            case 13:
            case Protos.Attaches.Attach.LOCATION /*14*/:
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String F(java.io.DataInputStream r10, qe4 r11) {
        /*
            int r0 = r10.readUnsignedByte()
            r1 = 15
            r0 = r0 & r1
            if (r0 == r1) goto L_0x0027
            switch(r0) {
                case 8: goto L_0x0022;
                case 9: goto L_0x001d;
                case 10: goto L_0x0018;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Extra too long"
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x0018:
            int r0 = r10.readInt()
            goto L_0x0028
        L_0x001d:
            int r0 = r10.readUnsignedShort()
            goto L_0x0028
        L_0x0022:
            int r0 = r10.readUnsignedByte()
            goto L_0x0028
        L_0x0027:
            r0 = -1
        L_0x0028:
            java.lang.Object r1 = r11.c
            byte[] r1 = (byte[]) r1
            java.lang.Object r2 = r11.b
            char[] r2 = (char[]) r2
            int r3 = r1.length
            if (r3 >= r0) goto L_0x003f
        L_0x0033:
            int r3 = r3 << 1
            if (r3 < r0) goto L_0x0033
            byte[] r1 = new byte[r3]
            r11.c = r1
            char[] r2 = new char[r3]
            r11.b = r2
        L_0x003f:
            r11 = 0
            r10.readFully(r1, r11, r0)
            r10 = r11
            r3 = r10
        L_0x0045:
            if (r10 >= r0) goto L_0x0059
            byte r4 = r1[r10]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = 127(0x7f, float:1.78E-43)
            if (r4 <= r5) goto L_0x0050
            goto L_0x0059
        L_0x0050:
            int r10 = r10 + 1
            int r5 = r3 + 1
            char r4 = (char) r4
            r2[r3] = r4
            r3 = r5
            goto L_0x0045
        L_0x0059:
            if (r10 >= r0) goto L_0x00ed
            byte r4 = r1[r10]
            r5 = r4 & 255(0xff, float:3.57E-43)
            int r6 = r5 >> 4
            java.lang.String r7 = "malformed input: partial character at end"
            r8 = 128(0x80, float:1.794E-43)
            java.lang.String r9 = "malformed input around byte "
            switch(r6) {
                case 0: goto L_0x00e3;
                case 1: goto L_0x00e3;
                case 2: goto L_0x00e3;
                case 3: goto L_0x00e3;
                case 4: goto L_0x00e3;
                case 5: goto L_0x00e3;
                case 6: goto L_0x00e3;
                case 7: goto L_0x00e3;
                case 8: goto L_0x006a;
                case 9: goto L_0x006a;
                case 10: goto L_0x006a;
                case 11: goto L_0x006a;
                case 12: goto L_0x00b8;
                case 13: goto L_0x00b8;
                case 14: goto L_0x0074;
                default: goto L_0x006a;
            }
        L_0x006a:
            java.io.UTFDataFormatException r11 = new java.io.UTFDataFormatException
            java.lang.String r10 = defpackage.wn6.h(r10, r9)
            r11.<init>(r10)
            throw r11
        L_0x0074:
            int r5 = r10 + 3
            if (r5 > r0) goto L_0x00b2
            int r6 = r10 + 1
            byte r6 = r1[r6]
            r7 = r6 & 192(0xc0, float:2.69E-43)
            if (r7 != r8) goto L_0x00a6
            int r10 = r10 + 2
            byte r10 = r1[r10]
            r7 = r10 & 192(0xc0, float:2.69E-43)
            if (r7 != r8) goto L_0x009c
            int r7 = r3 + 1
            r4 = r4 & 15
            int r4 = r4 << 12
            r6 = r6 & 63
            int r6 = r6 << 6
            r4 = r4 | r6
            r10 = r10 & 63
            r10 = r10 | r4
            char r10 = (char) r10
            r2[r3] = r10
            r10 = r5
            r3 = r7
            goto L_0x0059
        L_0x009c:
            java.io.UTFDataFormatException r10 = new java.io.UTFDataFormatException
            java.lang.String r11 = defpackage.wn6.h(r5, r9)
            r10.<init>(r11)
            throw r10
        L_0x00a6:
            java.io.UTFDataFormatException r11 = new java.io.UTFDataFormatException
            int r10 = r10 + 2
            java.lang.String r10 = defpackage.wn6.h(r10, r9)
            r11.<init>(r10)
            throw r11
        L_0x00b2:
            java.io.UTFDataFormatException r10 = new java.io.UTFDataFormatException
            r10.<init>(r7)
            throw r10
        L_0x00b8:
            int r5 = r10 + 2
            if (r5 > r0) goto L_0x00dd
            int r10 = r10 + 1
            byte r10 = r1[r10]
            r6 = r10 & 192(0xc0, float:2.69E-43)
            if (r6 != r8) goto L_0x00d3
            int r6 = r3 + 1
            r4 = r4 & 31
            int r4 = r4 << 6
            r10 = r10 & 63
            r10 = r10 | r4
            char r10 = (char) r10
            r2[r3] = r10
            r10 = r5
            r3 = r6
            goto L_0x0059
        L_0x00d3:
            java.io.UTFDataFormatException r10 = new java.io.UTFDataFormatException
            java.lang.String r11 = defpackage.wn6.h(r5, r9)
            r10.<init>(r11)
            throw r10
        L_0x00dd:
            java.io.UTFDataFormatException r10 = new java.io.UTFDataFormatException
            r10.<init>(r7)
            throw r10
        L_0x00e3:
            int r10 = r10 + 1
            int r4 = r3 + 1
            char r5 = (char) r5
            r2[r3] = r5
            r3 = r4
            goto L_0x0059
        L_0x00ed:
            java.lang.String r10 = new java.lang.String
            r10.<init>(r2, r11, r3)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ct0.F(java.io.DataInputStream, qe4):java.lang.String");
    }

    public static final Object G(Object obj) {
        return obj instanceof r73 ? new kcc(((r73) obj).a) : obj;
    }

    public static int H(int i, int i2, Context context) {
        TypedValue D = bm3.D(context, i);
        return (D == null || D.type != 16) ? i2 : D.data;
    }

    public static TimeInterpolator I(Context context, int i, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (!z(valueOf, "cubic-bezier") && !z(valueOf, ClientCookie.PATH_ATTR)) {
                return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
            }
            if (z(valueOf, "cubic-bezier")) {
                String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
                if (split.length == 4) {
                    return dla.b(p(0, split), p(1, split), p(2, split), p(3, split));
                }
                throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
            } else if (z(valueOf, ClientCookie.PATH_ATTR)) {
                return dla.c(h2g.f(valueOf.substring(5, valueOf.length() - 1)));
            } else {
                throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
            }
        } else {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
    }

    public static final void J(xy2 xy2, Object obj, String str, Integer num) {
        try {
            Field declaredField = xy2.a().getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(obj, num);
        } catch (Throwable unused) {
        }
    }

    public static og7 K(ArrayList arrayList) {
        return new og7(new ArrayList(arrayList), false, pa2.j());
    }

    public static final Object L(Object obj, u16 u16) {
        Throwable a2 = mcc.a(obj);
        return a2 == null ? u16 != null ? new s73(obj, u16) : obj : new r73(a2, false);
    }

    public static String M(int i) {
        switch (i) {
            case 0:
                return "eof";
            case 34:
                return "string";
            case 39:
                return "name";
            case 44:
                return "`,`";
            case 49:
                return "number";
            case 58:
                return "`:`";
            case 91:
                return "`[`";
            case 93:
                return "`]`";
            case 98:
                return "boolean";
            case 110:
                return "null";
            case 123:
                return "`{`";
            case 125:
                return "`}`";
            default:
                throw new AssertionError();
        }
    }

    public static oy1 N(ch7 ch7, au auVar, Executor executor) {
        oy1 oy1 = new oy1(auVar, ch7);
        ch7.c(oy1, executor);
        return oy1;
    }

    public static final void O(bve bve) {
        bve.c(z24.class, new y7b(28));
        bve.e(w76.class, new n5b(25));
        bve.e(sab.class, new n5b(26));
    }

    public static final void P(bve bve) {
        bve.c(z24.class, new w8d(6));
    }

    public static final void Q(DataOutputStream dataOutputStream, String str, dte dte) {
        dataOutputStream.writeUTF(str);
        dataOutputStream.writeByte(dte.a);
    }

    public static final void R(DataOutputStream dataOutputStream, String str, dte dte, dte dte2, String str2, qe4 qe4) {
        int i;
        if (str2.length() < 21845) {
            Q(dataOutputStream, str, dte);
            dataOutputStream.writeUTF(str2);
            return;
        }
        Q(dataOutputStream, str, dte2);
        int length = str2.length();
        char[] cArr = (char[]) qe4.b;
        int length2 = cArr.length;
        if (length2 < length) {
            do {
                length2 <<= 1;
            } while (length2 < length);
            cArr = new char[length2];
            qe4.b = cArr;
        }
        str2.getChars(0, length, cArr, 0);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = 3;
            if (i2 >= length) {
                break;
            }
            char c2 = cArr[i2];
            if (c2 <= 127) {
                i = 1;
            } else if (c2 <= 2047) {
                i = 2;
            }
            i3 += i;
            i2++;
        }
        int a2 = dte2.a();
        byte[] bArr = (byte[]) qe4.c;
        if (i3 <= 127) {
            bArr[0] = (byte) (a2 | 8);
            bArr[1] = (byte) i3;
            i = 2;
        } else if (i3 <= 32767) {
            bArr[0] = (byte) (a2 | 9);
            bArr[1] = (byte) (i3 >> 8);
            bArr[2] = (byte) i3;
        } else {
            bArr[0] = (byte) (a2 | 10);
            bArr[1] = (byte) (i3 >> 24);
            bArr[2] = (byte) ((i3 >> 16) & 255);
            bArr[3] = (byte) ((i3 >> 8) & 255);
            bArr[4] = (byte) i3;
            i = 5;
        }
        dataOutputStream.write(bArr, 0, i);
        byte[] bArr2 = (byte[]) qe4.c;
        int length3 = bArr2.length;
        if (length3 < i3) {
            do {
                length3 <<= 1;
            } while (length3 < i3);
            bArr2 = new byte[length3];
            qe4.c = bArr2;
        }
        if (length == i3) {
            for (int i4 = 0; i4 < length; i4++) {
                bArr2[i4] = (byte) cArr[i4];
            }
        } else {
            int i5 = 0;
            for (int i6 = 0; i6 < length; i6++) {
                char c3 = cArr[i6];
                if (c3 <= 127) {
                    bArr2[i5] = (byte) c3;
                    i5++;
                } else if (c3 <= 2047) {
                    int i7 = i5 + 1;
                    bArr2[i5] = (byte) ((c3 >> 6) | 192);
                    i5 += 2;
                    bArr2[i7] = (byte) ((c3 & '?') | 128);
                } else {
                    bArr2[i5] = (byte) ((c3 >> 12) | 224);
                    int i8 = i5 + 2;
                    bArr2[i5 + 1] = (byte) (((c3 >> 6) & 63) | 128);
                    i5 += 3;
                    bArr2[i8] = (byte) ((c3 & '?') | 128);
                }
            }
        }
        dataOutputStream.write(bArr2, 0, i3);
    }

    public static void a(ch7 ch7, i36 i36, Executor executor) {
        i36.getClass();
        ch7.c(new q36(ch7, 0, i36), executor);
    }

    public static og7 b(Collection collection) {
        return new og7(new ArrayList(collection), true, pa2.j());
    }

    public static final boolean c(Uri uri, Uri uri2) {
        if (uri == null || uri2 == null) {
            return false;
        }
        return o23.c0(uri.getPathSegments(), "/", (String) null, (String) null, (u16) null, 62).equals(o23.c0(uri2.getPathSegments(), "/", (String) null, (String) null, (u16) null, 62));
    }

    public static int d(int i) {
        if (i < 3) {
            ete.l(i, "expectedSize");
            return i + 1;
        } else if (i < 1073741824) {
            return (int) Math.ceil(((double) i) / 0.75d);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0088, code lost:
        if (r13 == r1.g) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0097, code lost:
        if ((r20.u() * 1000) == r1) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a5, code lost:
        if (r6 == r1) goto L_0x00a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean e(ija r20, ti5 r21, int r22, defpackage.le4 r23) {
        /*
            r0 = r20
            r1 = r21
            r2 = 10
            r3 = 1
            int r4 = r0.b
            long r5 = r20.w()
            r7 = 16
            long r7 = r5 >>> r7
            r9 = r22
            long r9 = (long) r9
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            r10 = 0
            if (r9 == 0) goto L_0x001a
            return r10
        L_0x001a:
            r11 = 1
            long r7 = r7 & r11
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x0023
            r7 = r3
            goto L_0x0024
        L_0x0023:
            r7 = r10
        L_0x0024:
            r8 = 12
            long r13 = r5 >> r8
            r15 = 15
            long r13 = r13 & r15
            int r9 = (int) r13
            r13 = 8
            long r13 = r5 >> r13
            long r13 = r13 & r15
            int r13 = (int) r13
            r14 = 4
            long r17 = r5 >> r14
            long r14 = r17 & r15
            int r14 = (int) r14
            long r15 = r5 >> r3
            r17 = 7
            r19 = r9
            long r8 = r15 & r17
            int r8 = (int) r8
            long r5 = r5 & r11
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 != 0) goto L_0x0048
            r5 = r3
            goto L_0x0049
        L_0x0048:
            r5 = r10
        L_0x0049:
            r6 = 7
            if (r14 > r6) goto L_0x0052
            int r6 = r1.h
            int r6 = r6 - r3
            if (r14 != r6) goto L_0x00c3
            goto L_0x0059
        L_0x0052:
            if (r14 > r2) goto L_0x00c3
            int r6 = r1.h
            r9 = 2
            if (r6 != r9) goto L_0x00c3
        L_0x0059:
            if (r8 != 0) goto L_0x005c
            goto L_0x0060
        L_0x005c:
            int r6 = r1.j
            if (r8 != r6) goto L_0x00c3
        L_0x0060:
            if (r5 != 0) goto L_0x00c3
            long r5 = r20.B()     // Catch:{ NumberFormatException -> 0x00c3 }
            if (r7 == 0) goto L_0x006b
        L_0x0068:
            r7 = r23
            goto L_0x0070
        L_0x006b:
            int r7 = r1.c
            long r7 = (long) r7
            long r5 = r5 * r7
            goto L_0x0068
        L_0x0070:
            r7.a = r5
            r5 = r19
            int r5 = E(r5, r0)
            r6 = -1
            if (r5 == r6) goto L_0x00c3
            int r6 = r1.c
            if (r5 > r6) goto L_0x00c3
            if (r13 != 0) goto L_0x0082
            goto L_0x00a7
        L_0x0082:
            r5 = 11
            if (r13 > r5) goto L_0x008b
            int r1 = r1.g
            if (r13 != r1) goto L_0x00c3
            goto L_0x00a7
        L_0x008b:
            int r1 = r1.f
            r5 = 12
            if (r13 != r5) goto L_0x009a
            int r2 = r20.u()
            int r2 = r2 * 1000
            if (r2 != r1) goto L_0x00c3
            goto L_0x00a7
        L_0x009a:
            r5 = 14
            if (r13 > r5) goto L_0x00c3
            int r6 = r20.A()
            if (r13 != r5) goto L_0x00a5
            int r6 = r6 * r2
        L_0x00a5:
            if (r6 != r1) goto L_0x00c3
        L_0x00a7:
            int r1 = r20.u()
            int r2 = r0.b
            byte[] r0 = r0.a
            int r2 = r2 - r3
            int r5 = oze.a
            r5 = r10
        L_0x00b3:
            if (r4 >= r2) goto L_0x00c0
            byte r6 = r0[r4]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r5 = r5 ^ r6
            int[] r6 = oze.q
            r5 = r6[r5]
            int r4 = r4 + r3
            goto L_0x00b3
        L_0x00c0:
            if (r1 != r5) goto L_0x00c3
            goto L_0x00c4
        L_0x00c3:
            r3 = r10
        L_0x00c4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ct0.e(ija, ti5, int, le4):boolean");
    }

    public static boolean f(byte[] bArr, String str) {
        if (bArr.length != str.length()) {
            return false;
        }
        Collection dz6 = new dz6(0, bArr.length - 1, 1);
        if (!(dz6 instanceof Collection) || !dz6.isEmpty()) {
            ez6 it = dz6.iterator();
            while (it.c) {
                int a2 = it.a();
                if (((byte) str.charAt(a2)) != bArr[a2]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final x66 g(ge1 ge1, boolean z) {
        try {
            return x87.l(ge1, new JSONObject().put("sdk", (Object) new JSONObject().put("type", (Object) "bad-net").put("value", z)));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        urd.l(r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void h(sz5 r4) {
        /*
            lg7 r0 = hwf.c()
            java.lang.String r1 = "SELECT name FROM sqlite_master WHERE type = 'trigger'"
            android.database.Cursor r1 = r4.q0(r1)
        L_0x000a:
            boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x0019 }
            r3 = 0
            if (r2 == 0) goto L_0x001b
            java.lang.String r2 = r1.getString(r3)     // Catch:{ all -> 0x0019 }
            r0.add(r2)     // Catch:{ all -> 0x0019 }
            goto L_0x000a
        L_0x0019:
            r4 = move-exception
            goto L_0x0049
        L_0x001b:
            r2 = 0
            urd.l(r1, r2)
            lg7 r0 = hwf.a(r0)
            java.util.ListIterator r0 = r0.listIterator(r3)
        L_0x0027:
            r1 = r0
            jg7 r1 = (jg7) r1
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0048
            java.lang.Object r1 = r1.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "room_fts_content_sync_"
            boolean r2 = p0e.Q(r1, r2, r3)
            if (r2 == 0) goto L_0x0027
            java.lang.String r2 = "DROP TRIGGER IF EXISTS "
            java.lang.String r1 = r2.concat(r1)
            r4.U(r1)
            goto L_0x0027
        L_0x0048:
            return
        L_0x0049:
            throw r4     // Catch:{ all -> 0x004a }
        L_0x004a:
            r0 = move-exception
            urd.l(r1, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ct0.h(sz5):void");
    }

    public static final void i() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new AndroidRuntimeException("Methods that affect the view hierarchy can can only be called from the main thread.");
        }
    }

    public static boolean j(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0226, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x03c1, code lost:
        r2 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x04b4  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x04d4  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x04d6  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x04df  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x0515  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0544  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x0558  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static xe6 k(et1 r12) {
        /*
            clb r0 = clb.c
            r0.getClass()
            k96 r0 = r0.a     // Catch:{ InterruptedException | ExecutionException -> 0x0569 }
            ch7 r0 = r0.m()     // Catch:{ InterruptedException | ExecutionException -> 0x0569 }
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x0569 }
            alb r0 = (alb) r0     // Catch:{ InterruptedException | ExecutionException -> 0x0569 }
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL
            java.lang.Object r3 = r12.a(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x002b
            int r3 = r3.intValue()
            if (r3 != r4) goto L_0x002b
            r3 = r5
            goto L_0x002c
        L_0x002b:
            r3 = r6
        L_0x002c:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk> r7 = androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk.class
            boolean r3 = r0.a(r7, r3)
            if (r3 == 0) goto L_0x003c
            androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk r3 = new androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk
            r3.<init>(r12)
            r1.add(r3)
        L_0x003c:
            java.lang.Object r3 = r12.a(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk> r3 = androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk.class
            boolean r3 = r0.a(r3, r6)
            if (r3 == 0) goto L_0x0052
            androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk r3 = new androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk
            r3.<init>()
            r1.add(r3)
        L_0x0052:
            java.util.HashSet r3 = androidx.camera.camera2.internal.compat.quirk.JpegHalCorruptImageQuirk.a
            java.lang.String r7 = android.os.Build.DEVICE
            java.util.Locale r8 = java.util.Locale.US
            java.lang.String r7 = r7.toLowerCase(r8)
            boolean r3 = r3.contains(r7)
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.JpegHalCorruptImageQuirk> r7 = androidx.camera.camera2.internal.compat.quirk.JpegHalCorruptImageQuirk.class
            boolean r3 = r0.a(r7, r3)
            if (r3 == 0) goto L_0x0070
            androidx.camera.camera2.internal.compat.quirk.JpegHalCorruptImageQuirk r3 = new androidx.camera.camera2.internal.compat.quirk.JpegHalCorruptImageQuirk
            r3.<init>()
            r1.add(r3)
        L_0x0070:
            java.util.HashSet r3 = androidx.camera.camera2.internal.compat.quirk.JpegCaptureDownsizingQuirk.a
            java.lang.String r7 = android.os.Build.MODEL
            java.lang.String r9 = r7.toLowerCase(r8)
            boolean r3 = r3.contains(r9)
            if (r3 == 0) goto L_0x008e
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r3 = r12.a(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r3 != 0) goto L_0x008e
            r3 = r5
            goto L_0x008f
        L_0x008e:
            r3 = r6
        L_0x008f:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.JpegCaptureDownsizingQuirk> r9 = androidx.camera.camera2.internal.compat.quirk.JpegCaptureDownsizingQuirk.class
            boolean r3 = r0.a(r9, r3)
            if (r3 == 0) goto L_0x009f
            androidx.camera.camera2.internal.compat.quirk.JpegCaptureDownsizingQuirk r3 = new androidx.camera.camera2.internal.compat.quirk.JpegCaptureDownsizingQuirk
            r3.<init>()
            r1.add(r3)
        L_0x009f:
            java.lang.Object r3 = r12.a(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L_0x00af
            int r3 = r3.intValue()
            if (r3 != r4) goto L_0x00af
            r3 = r5
            goto L_0x00b0
        L_0x00af:
            r3 = r6
        L_0x00b0:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk> r9 = androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk.class
            boolean r3 = r0.a(r9, r3)
            if (r3 == 0) goto L_0x00c0
            androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk r3 = new androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk
            r3.<init>(r12)
            r1.add(r3)
        L_0x00c0:
            java.lang.String r3 = android.os.Build.HARDWARE
            java.lang.String r9 = "samsungexynos7420"
            boolean r9 = r9.equalsIgnoreCase(r3)
            if (r9 != 0) goto L_0x00d2
            java.lang.String r9 = "universal7420"
            boolean r3 = r9.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x00e2
        L_0x00d2:
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r3 = r12.a(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r3 != r5) goto L_0x00e2
            r3 = r5
            goto L_0x00e3
        L_0x00e2:
            r3 = r6
        L_0x00e3:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk> r9 = androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk.class
            boolean r3 = r0.a(r9, r3)
            if (r3 == 0) goto L_0x00f3
            androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk r3 = new androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk
            r3.<init>()
            r1.add(r3)
        L_0x00f3:
            java.lang.Object r2 = r12.a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L_0x0103
            int r2 = r2.intValue()
            if (r2 != r4) goto L_0x0103
            r2 = r5
            goto L_0x0104
        L_0x0103:
            r2 = r6
        L_0x0104:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk> r3 = androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk.class
            boolean r2 = r0.a(r3, r2)
            if (r2 == 0) goto L_0x0114
            androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk r2 = new androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk
            r2.<init>()
            r1.add(r2)
        L_0x0114:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk> r2 = androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk.class
            boolean r2 = r0.a(r2, r6)
            if (r2 == 0) goto L_0x0124
            androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk r2 = new androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk
            r2.<init>()
            r1.add(r2)
        L_0x0124:
            java.util.List r2 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk.a
            java.lang.String r2 = r7.toUpperCase(r8)
            java.util.List r3 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk.a
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L_0x0142
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r2 = r12.a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 != r5) goto L_0x0142
            r2 = r5
            goto L_0x0143
        L_0x0142:
            r2 = r6
        L_0x0143:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk> r3 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk.class
            boolean r2 = r0.a(r3, r2)
            if (r2 == 0) goto L_0x0153
            androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk r2 = new androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk
            r2.<init>()
            r1.add(r2)
        L_0x0153:
            java.util.List r2 = androidx.camera.camera2.internal.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk.a
            java.lang.String r2 = r7.toUpperCase(r8)
            java.util.List r3 = androidx.camera.camera2.internal.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk.a
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L_0x0171
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r2 = r12.a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 != r5) goto L_0x0171
            r2 = r5
            goto L_0x0172
        L_0x0171:
            r2 = r6
        L_0x0172:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk> r3 = androidx.camera.camera2.internal.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk.class
            boolean r2 = r0.a(r3, r2)
            if (r2 == 0) goto L_0x0182
            androidx.camera.camera2.internal.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk r2 = new androidx.camera.camera2.internal.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk
            r2.<init>()
            r1.add(r2)
        L_0x0182:
            java.lang.String r2 = android.os.Build.BRAND
            java.lang.String r3 = "motorola"
            boolean r8 = r3.equalsIgnoreCase(r2)
            if (r8 == 0) goto L_0x0195
            java.lang.String r8 = "MotoG3"
            boolean r8 = r8.equalsIgnoreCase(r7)
            if (r8 == 0) goto L_0x0195
            goto L_0x01e3
        L_0x0195:
            java.lang.String r8 = "samsung"
            boolean r9 = r8.equalsIgnoreCase(r2)
            if (r9 == 0) goto L_0x01a6
            java.lang.String r9 = "SM-G532F"
            boolean r9 = r9.equalsIgnoreCase(r7)
            if (r9 == 0) goto L_0x01a6
            goto L_0x01e3
        L_0x01a6:
            boolean r9 = r8.equalsIgnoreCase(r2)
            if (r9 == 0) goto L_0x01b5
            java.lang.String r9 = "SM-J700F"
            boolean r9 = r9.equalsIgnoreCase(r7)
            if (r9 == 0) goto L_0x01b5
            goto L_0x01e3
        L_0x01b5:
            boolean r9 = r8.equalsIgnoreCase(r2)
            if (r9 == 0) goto L_0x01c4
            java.lang.String r9 = "SM-A920F"
            boolean r9 = r9.equalsIgnoreCase(r7)
            if (r9 == 0) goto L_0x01c4
            goto L_0x01e3
        L_0x01c4:
            boolean r8 = r8.equalsIgnoreCase(r2)
            if (r8 == 0) goto L_0x01d3
            java.lang.String r8 = "SM-J415F"
            boolean r8 = r8.equalsIgnoreCase(r7)
            if (r8 == 0) goto L_0x01d3
            goto L_0x01e3
        L_0x01d3:
            java.lang.String r8 = "xiaomi"
            boolean r2 = r8.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x01e5
            java.lang.String r2 = "Mi A1"
            boolean r2 = r2.equalsIgnoreCase(r7)
            if (r2 == 0) goto L_0x01e5
        L_0x01e3:
            r2 = r5
            goto L_0x01e6
        L_0x01e5:
            r2 = r6
        L_0x01e6:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.YuvImageOnePixelShiftQuirk> r7 = androidx.camera.camera2.internal.compat.quirk.YuvImageOnePixelShiftQuirk.class
            boolean r2 = r0.a(r7, r2)
            if (r2 == 0) goto L_0x01f6
            androidx.camera.camera2.internal.compat.quirk.YuvImageOnePixelShiftQuirk r2 = new androidx.camera.camera2.internal.compat.quirk.YuvImageOnePixelShiftQuirk
            r2.<init>()
            r1.add(r2)
        L_0x01f6:
            java.util.List r2 = androidx.camera.camera2.internal.compat.quirk.FlashTooSlowQuirk.a
            java.util.Iterator r2 = r2.iterator()
        L_0x01fc:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0226
            java.lang.Object r7 = r2.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = android.os.Build.MODEL
            java.util.Locale r9 = java.util.Locale.US
            java.lang.String r8 = r8.toUpperCase(r9)
            boolean r7 = r8.startsWith(r7)
            if (r7 == 0) goto L_0x01fc
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r2 = r12.a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 != r5) goto L_0x0226
            r2 = r5
            goto L_0x0227
        L_0x0226:
            r2 = r6
        L_0x0227:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.FlashTooSlowQuirk> r7 = androidx.camera.camera2.internal.compat.quirk.FlashTooSlowQuirk.class
            boolean r2 = r0.a(r7, r2)
            if (r2 == 0) goto L_0x0237
            androidx.camera.camera2.internal.compat.quirk.FlashTooSlowQuirk r2 = new androidx.camera.camera2.internal.compat.quirk.FlashTooSlowQuirk
            r2.<init>()
            r1.add(r2)
        L_0x0237:
            java.lang.String r2 = android.os.Build.BRAND
            java.lang.String r7 = "SAMSUNG"
            boolean r2 = r2.equalsIgnoreCase(r7)
            if (r2 == 0) goto L_0x0257
            int r2 = android.os.Build.VERSION.SDK_INT
            r7 = 33
            if (r2 >= r7) goto L_0x0257
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r2 = r12.a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 != 0) goto L_0x0257
            r2 = r5
            goto L_0x0258
        L_0x0257:
            r2 = r6
        L_0x0258:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk> r7 = androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk.class
            boolean r2 = r0.a(r7, r2)
            if (r2 == 0) goto L_0x0268
            androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk r2 = new androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk
            r2.<init>()
            r1.add(r2)
        L_0x0268:
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL
            java.lang.Object r7 = r12.a(r2)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L_0x027a
            int r7 = r7.intValue()
            if (r7 != r4) goto L_0x027a
            r7 = r5
            goto L_0x027b
        L_0x027a:
            r7 = r6
        L_0x027b:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk> r8 = androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk.class
            boolean r7 = r0.a(r8, r7)
            if (r7 == 0) goto L_0x028b
            androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk r7 = new androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk
            r7.<init>()
            r1.add(r7)
        L_0x028b:
            java.lang.Object r7 = r12.a(r2)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L_0x029b
            int r7 = r7.intValue()
            if (r7 != r4) goto L_0x029b
            r7 = r5
            goto L_0x029c
        L_0x029b:
            r7 = r6
        L_0x029c:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk> r8 = androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk.class
            boolean r7 = r0.a(r8, r7)
            if (r7 == 0) goto L_0x02ac
            androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk r7 = new androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk
            r7.<init>()
            r1.add(r7)
        L_0x02ac:
            java.lang.Object r7 = r12.a(r2)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L_0x02bc
            int r7 = r7.intValue()
            if (r7 != r4) goto L_0x02bc
            r7 = r5
            goto L_0x02bd
        L_0x02bc:
            r7 = r6
        L_0x02bd:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk> r8 = androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk.class
            boolean r7 = r0.a(r8, r7)
            if (r7 == 0) goto L_0x02cd
            androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk r7 = new androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk
            r7.<init>()
            r1.add(r7)
        L_0x02cd:
            java.util.List r7 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk.a
            java.lang.String r7 = android.os.Build.MODEL
            java.util.Locale r8 = java.util.Locale.US
            java.lang.String r9 = r7.toLowerCase(r8)
            java.util.List r10 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk.b
            boolean r9 = r10.contains(r9)
            if (r9 == 0) goto L_0x02ef
            android.hardware.camera2.CameraCharacteristics$Key r9 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r9 = r12.a(r9)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            if (r9 != 0) goto L_0x02ef
            r9 = r5
            goto L_0x02f0
        L_0x02ef:
            r9 = r6
        L_0x02f0:
            java.util.List r10 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk.a
            java.lang.String r11 = r7.toLowerCase(r8)
            boolean r10 = r10.contains(r11)
            if (r9 != 0) goto L_0x0301
            if (r10 == 0) goto L_0x02ff
            goto L_0x0301
        L_0x02ff:
            r9 = r6
            goto L_0x0302
        L_0x0301:
            r9 = r5
        L_0x0302:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk> r10 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk.class
            boolean r9 = r0.a(r10, r9)
            if (r9 == 0) goto L_0x0312
            androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk r9 = new androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk
            r9.<init>()
            r1.add(r9)
        L_0x0312:
            java.util.List r9 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk.a
            java.lang.String r9 = r7.toLowerCase(r8)
            java.util.List r10 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk.a
            boolean r9 = r10.contains(r9)
            if (r9 == 0) goto L_0x0330
            android.hardware.camera2.CameraCharacteristics$Key r9 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r9 = r12.a(r9)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            if (r9 != r5) goto L_0x0330
            r9 = r5
            goto L_0x0331
        L_0x0330:
            r9 = r6
        L_0x0331:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk> r10 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk.class
            boolean r9 = r0.a(r10, r9)
            if (r9 == 0) goto L_0x0341
            androidx.camera.camera2.internal.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk r9 = new androidx.camera.camera2.internal.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk
            r9.<init>()
            r1.add(r9)
        L_0x0341:
            java.util.List r9 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk.a
            java.lang.String r7 = r7.toLowerCase(r8)
            java.util.List r8 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk.a
            boolean r7 = r8.contains(r7)
            if (r7 == 0) goto L_0x035f
            android.hardware.camera2.CameraCharacteristics$Key r7 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r7 = r12.a(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r7 != 0) goto L_0x035f
            r7 = r5
            goto L_0x0360
        L_0x035f:
            r7 = r6
        L_0x0360:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk> r8 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk.class
            boolean r7 = r0.a(r8, r7)
            if (r7 == 0) goto L_0x0370
            androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk r7 = new androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk
            r7.<init>()
            r1.add(r7)
        L_0x0370:
            java.lang.Object r2 = r12.a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L_0x0380
            int r2 = r2.intValue()
            if (r2 != r4) goto L_0x0380
            r2 = r5
            goto L_0x0381
        L_0x0380:
            r2 = r6
        L_0x0381:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk> r4 = androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk.class
            boolean r2 = r0.a(r4, r2)
            if (r2 == 0) goto L_0x0391
            androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk r2 = new androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk
            r2.<init>()
            r1.add(r2)
        L_0x0391:
            java.util.List r2 = androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk.b
            java.util.Iterator r2 = r2.iterator()
        L_0x0397:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x03c1
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r7 = android.os.Build.MODEL
            java.util.Locale r8 = java.util.Locale.US
            java.lang.String r7 = r7.toUpperCase(r8)
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L_0x0397
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r2 = r12.a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 != 0) goto L_0x03c1
            r2 = r5
            goto L_0x03c2
        L_0x03c1:
            r2 = r6
        L_0x03c2:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk> r4 = androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk.class
            boolean r2 = r0.a(r4, r2)
            if (r2 == 0) goto L_0x03d2
            androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk r2 = new androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk
            r2.<init>(r12)
            r1.add(r2)
        L_0x03d2:
            java.lang.String r2 = android.os.Build.MANUFACTURER
            java.lang.String r4 = "HUAWEI"
            boolean r7 = r4.equalsIgnoreCase(r2)
            if (r7 == 0) goto L_0x03e7
            java.lang.String r7 = "HUAWEI ALE-L04"
            java.lang.String r8 = android.os.Build.MODEL
            boolean r7 = r7.equalsIgnoreCase(r8)
            if (r7 == 0) goto L_0x03e7
            goto L_0x043f
        L_0x03e7:
            java.lang.String r7 = "Samsung"
            boolean r8 = r7.equalsIgnoreCase(r2)
            if (r8 == 0) goto L_0x03fa
            java.lang.String r8 = "sm-j320f"
            java.lang.String r9 = android.os.Build.MODEL
            boolean r8 = r8.equalsIgnoreCase(r9)
            if (r8 == 0) goto L_0x03fa
            goto L_0x043f
        L_0x03fa:
            boolean r8 = r7.equalsIgnoreCase(r2)
            if (r8 == 0) goto L_0x040b
            java.lang.String r8 = "sm-j700f"
            java.lang.String r9 = android.os.Build.MODEL
            boolean r8 = r8.equalsIgnoreCase(r9)
            if (r8 == 0) goto L_0x040b
            goto L_0x043f
        L_0x040b:
            boolean r8 = r7.equalsIgnoreCase(r2)
            if (r8 == 0) goto L_0x041c
            java.lang.String r8 = "sm-j111f"
            java.lang.String r9 = android.os.Build.MODEL
            boolean r8 = r8.equalsIgnoreCase(r9)
            if (r8 == 0) goto L_0x041c
            goto L_0x043f
        L_0x041c:
            java.lang.String r8 = "OPPO"
            boolean r8 = r8.equalsIgnoreCase(r2)
            if (r8 == 0) goto L_0x042f
            java.lang.String r8 = "A37F"
            java.lang.String r9 = android.os.Build.MODEL
            boolean r8 = r8.equalsIgnoreCase(r9)
            if (r8 == 0) goto L_0x042f
            goto L_0x043f
        L_0x042f:
            boolean r7 = r7.equalsIgnoreCase(r2)
            if (r7 == 0) goto L_0x0441
            java.lang.String r7 = "sm-j510fn"
            java.lang.String r8 = android.os.Build.MODEL
            boolean r7 = r7.equalsIgnoreCase(r8)
            if (r7 == 0) goto L_0x0441
        L_0x043f:
            r7 = r5
            goto L_0x0442
        L_0x0441:
            r7 = r6
        L_0x0442:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk> r8 = androidx.camera.camera2.internal.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk.class
            boolean r7 = r0.a(r8, r7)
            if (r7 == 0) goto L_0x0452
            androidx.camera.camera2.internal.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk r7 = new androidx.camera.camera2.internal.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk
            r7.<init>()
            r1.add(r7)
        L_0x0452:
            java.lang.String r7 = "Huawei"
            boolean r2 = r7.equalsIgnoreCase(r2)
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk> r7 = androidx.camera.camera2.internal.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk.class
            boolean r2 = r0.a(r7, r2)
            if (r2 == 0) goto L_0x0468
            androidx.camera.camera2.internal.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk r2 = new androidx.camera.camera2.internal.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk
            r2.<init>()
            r1.add(r2)
        L_0x0468:
            boolean r2 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.e()
            if (r2 != 0) goto L_0x04ab
            boolean r2 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.f()
            if (r2 != 0) goto L_0x04ab
            boolean r2 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.i()
            if (r2 != 0) goto L_0x04ab
            boolean r2 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.g()
            if (r2 != 0) goto L_0x04ab
            java.lang.String r2 = android.os.Build.MODEL
            java.lang.String r7 = "pixel 4 xl"
            boolean r7 = r7.equalsIgnoreCase(r2)
            if (r7 == 0) goto L_0x0491
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 29
            if (r7 != r8) goto L_0x0491
            goto L_0x04ab
        L_0x0491:
            java.lang.String r7 = android.os.Build.BRAND
            boolean r3 = r3.equalsIgnoreCase(r7)
            if (r3 == 0) goto L_0x04a2
            java.lang.String r3 = "moto e13"
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x04a2
            goto L_0x04ab
        L_0x04a2:
            boolean r2 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.h()
            if (r2 == 0) goto L_0x04a9
            goto L_0x04ab
        L_0x04a9:
            r2 = r6
            goto L_0x04ac
        L_0x04ab:
            r2 = r5
        L_0x04ac:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk> r3 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.class
            boolean r2 = r0.a(r3, r2)
            if (r2 == 0) goto L_0x04bc
            androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk r2 = new androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk
            r2.<init>()
            r1.add(r2)
        L_0x04bc:
            java.lang.String r2 = android.os.Build.MODEL
            java.lang.String r3 = "Pixel 8"
            boolean r3 = r3.equalsIgnoreCase(r2)
            if (r3 == 0) goto L_0x04d6
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r12 = r12.a(r3)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r12 != 0) goto L_0x04d6
            r12 = r5
            goto L_0x04d7
        L_0x04d6:
            r12 = r6
        L_0x04d7:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.TemporalNoiseQuirk> r3 = androidx.camera.camera2.internal.compat.quirk.TemporalNoiseQuirk.class
            boolean r12 = r0.a(r3, r12)
            if (r12 == 0) goto L_0x04e7
            androidx.camera.camera2.internal.compat.quirk.TemporalNoiseQuirk r12 = new androidx.camera.camera2.internal.compat.quirk.TemporalNoiseQuirk
            r12.<init>()
            r1.add(r12)
        L_0x04e7:
            java.util.HashSet r12 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk.a
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r7 = r2.toLowerCase(r3)
            boolean r12 = r12.contains(r7)
            if (r12 != 0) goto L_0x053c
            int r12 = android.os.Build.VERSION.SDK_INT
            r7 = 31
            if (r12 < r7) goto L_0x0507
            java.lang.String r12 = "Spreadtrum"
            java.lang.String r7 = tp3.k()
            boolean r12 = r12.equalsIgnoreCase(r7)
            if (r12 != 0) goto L_0x053c
        L_0x0507:
            java.lang.String r12 = android.os.Build.HARDWARE
            java.lang.String r7 = r12.toLowerCase(r3)
            java.lang.String r8 = "ums"
            boolean r7 = r7.startsWith(r8)
            if (r7 != 0) goto L_0x053c
            java.lang.String r7 = android.os.Build.BRAND
            java.lang.String r8 = "itel"
            boolean r8 = r8.equalsIgnoreCase(r7)
            if (r8 == 0) goto L_0x052c
            java.lang.String r12 = r12.toLowerCase(r3)
            java.lang.String r3 = "sp"
            boolean r12 = r12.startsWith(r3)
            if (r12 == 0) goto L_0x052c
            goto L_0x053c
        L_0x052c:
            boolean r12 = r4.equalsIgnoreCase(r7)
            if (r12 == 0) goto L_0x053b
            java.lang.String r12 = "FIG-LX1"
            boolean r12 = r12.equalsIgnoreCase(r2)
            if (r12 == 0) goto L_0x053b
            goto L_0x053c
        L_0x053b:
            r5 = r6
        L_0x053c:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk> r12 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk.class
            boolean r12 = r0.a(r12, r5)
            if (r12 == 0) goto L_0x054c
            androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk r12 = new androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk
            r12.<init>()
            r1.add(r12)
        L_0x054c:
            boolean r12 = androidx.camera.camera2.internal.compat.quirk.AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.e()
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk> r2 = androidx.camera.camera2.internal.compat.quirk.AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.class
            boolean r12 = r0.a(r2, r12)
            if (r12 == 0) goto L_0x0560
            androidx.camera.camera2.internal.compat.quirk.AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk r12 = new androidx.camera.camera2.internal.compat.quirk.AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk
            r12.<init>()
            r1.add(r12)
        L_0x0560:
            xe6 r12 = new xe6
            r12.<init>(r1)
            xe6.o(r12)
            return r12
        L_0x0569:
            r12 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Unexpected error in QuirkSettings StateObservable"
            r0.<init>(r1, r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ct0.k(et1):xe6");
    }

    public static void l(int i, yze yze) {
        yze.E(7);
        byte[] bArr = yze.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    public static Object m(Future future) {
        boolean isDone = future.isDone();
        e07.p("Future was expected to be done, " + future, isDone);
        return s(future);
    }

    public static final ObjectAnimator n(View view, boolean z) {
        float f = 1.0f;
        float f2 = z ? 0.0f : 1.0f;
        if (!z) {
            f = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{f2, f});
        ofFloat.addListener(new ag(view, z));
        return ofFloat;
    }

    public static void o(InputStream inputStream) {
        inputStream.read();
        inputStream.read();
        inputStream.read();
        inputStream.read();
    }

    public static float p(int i, String[] strArr) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    /* JADX WARNING: type inference failed for: r8v10, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.animation.ValueAnimator q(android.widget.Space r7, ks3 r8, ks3 r9, int r10) {
        /*
            r0 = r10 & 1
            r1 = 0
            if (r0 == 0) goto L_0x0006
            r8 = r1
        L_0x0006:
            r10 = r10 & 2
            if (r10 == 0) goto L_0x000b
            r9 = r1
        L_0x000b:
            lg7 r10 = hwf.c()
            r0 = -1
            r2 = 1
            r3 = 0
            if (r8 == 0) goto L_0x0053
            int r4 = r8.b
            int r5 = r8.f
            int r4 = r4 - r5
            android.view.ViewGroup$LayoutParams r5 = r7.getLayoutParams()
            boolean r6 = r5 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r6 == 0) goto L_0x0024
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            goto L_0x0025
        L_0x0024:
            r5 = r1
        L_0x0025:
            if (r5 == 0) goto L_0x002a
            int r5 = r5.topMargin
            goto L_0x002b
        L_0x002a:
            r5 = r3
        L_0x002b:
            boolean r8 = r8.a
            if (r8 == 0) goto L_0x0031
            r8 = r2
            goto L_0x0032
        L_0x0031:
            r8 = r0
        L_0x0032:
            int r8 = r8 * r4
            int r8 = r8 + r5
            android.view.ViewGroup$LayoutParams r4 = r7.getLayoutParams()
            boolean r5 = r4 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r5 == 0) goto L_0x003f
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            goto L_0x0040
        L_0x003f:
            r4 = r1
        L_0x0040:
            if (r4 == 0) goto L_0x0045
            int r4 = r4.topMargin
            goto L_0x0046
        L_0x0045:
            r4 = r3
        L_0x0046:
            int[] r8 = new int[]{r4, r8}
            java.lang.String r4 = "top"
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofInt(r4, r8)
            r10.add(r8)
        L_0x0053:
            if (r9 == 0) goto L_0x0091
            int r8 = r9.b
            int r4 = r9.f
            int r8 = r8 - r4
            android.view.ViewGroup$LayoutParams r4 = r7.getLayoutParams()
            boolean r5 = r4 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r5 == 0) goto L_0x0065
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            goto L_0x0066
        L_0x0065:
            r4 = r1
        L_0x0066:
            if (r4 == 0) goto L_0x006b
            int r4 = r4.bottomMargin
            goto L_0x006c
        L_0x006b:
            r4 = r3
        L_0x006c:
            boolean r9 = r9.a
            if (r9 == 0) goto L_0x0071
            r0 = r2
        L_0x0071:
            int r0 = r0 * r8
            int r0 = r0 + r4
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            boolean r9 = r8 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r9 == 0) goto L_0x007e
            r1 = r8
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
        L_0x007e:
            if (r1 == 0) goto L_0x0083
            int r8 = r1.bottomMargin
            goto L_0x0084
        L_0x0083:
            r8 = r3
        L_0x0084:
            int[] r8 = new int[]{r8, r0}
            java.lang.String r9 = "bottom"
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofInt(r9, r8)
            r10.add(r8)
        L_0x0091:
            lg7 r8 = hwf.a(r10)
            android.animation.PropertyValuesHolder[] r9 = new android.animation.PropertyValuesHolder[r3]
            java.lang.Object[] r8 = r8.toArray(r9)
            android.animation.PropertyValuesHolder[] r8 = (android.animation.PropertyValuesHolder[]) r8
            int r9 = r8.length
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r9)
            android.animation.PropertyValuesHolder[] r8 = (android.animation.PropertyValuesHolder[]) r8
            android.animation.ValueAnimator r8 = android.animation.ValueAnimator.ofPropertyValuesHolder(r8)
            zf r9 = new zf
            r10 = 0
            r9.<init>(r7, r10)
            r8.addUpdateListener(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ct0.q(android.widget.Space, ks3, ks3, int):android.animation.ValueAnimator");
    }

    public static final ObjectAnimator r(View view, float f) {
        return ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{view.getTranslationY(), view.getTranslationY() + f});
    }

    public static Object s(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static wia t(InputStream inputStream) {
        inputStream.skip(7);
        int read = inputStream.read() & 255;
        int read2 = inputStream.read() & 255;
        int read3 = inputStream.read() & 255;
        if (read != 157 || read2 != 1 || read3 != 42) {
            return null;
        }
        return new wia(Integer.valueOf((inputStream.read() & 255) | ((inputStream.read() & 255) << 8)), Integer.valueOf(((inputStream.read() & 255) << 8) | (inputStream.read() & 255)));
    }

    public static wia u(InputStream inputStream) {
        o(inputStream);
        if ((inputStream.read() & 255) != 47) {
            return null;
        }
        int read = inputStream.read();
        return new wia(Integer.valueOf(((inputStream.read() & 255) | ((read & 63) << 8)) + 1), Integer.valueOf((((inputStream.read() & 15) << 10) | ((inputStream.read() & 255) << 2) | ((read & 192) >> 6)) + 1));
    }

    public static int v(int i) {
        return i <= 9 ? i + 48 : i + 87;
    }

    public static as6 w(Object obj) {
        return obj == null ? as6.c : new as6(0, obj);
    }

    public static boolean x(Throwable th) {
        return oze.a == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean y(Throwable th) {
        return oze.a == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }

    public static boolean z(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }
}
