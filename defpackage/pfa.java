package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import java.io.CharConversionException;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: pfa  reason: default package */
public abstract class pfa {
    public static final String[] a = {"standard", "accelerate", "decelerate", "linear"};
    public static final byte[] b = {0, 0, 0, 1};
    public static final float[] c = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object d = new Object();
    public static int[] e = new int[10];
    public static final Object f = new Object();
    public static boolean g;
    public static int h;
    public static Context i;
    public static b3g j;

    /* JADX WARNING: Removed duplicated region for block: B:134:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0185  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.yf9 A(int r30, byte[] r31, int r32) {
        /*
            r0 = 1
            int r1 = r30 + 1
            wx1 r2 = new wx1
            r3 = 4
            r4 = r31
            r5 = r32
            r2.<init>((int) r1, (int) r5, (int) r3, (byte[]) r4)
            r1 = 8
            int r4 = r2.i(r1)
            int r5 = r2.i(r1)
            int r6 = r2.i(r1)
            int r7 = r2.m()
            r3 = 16
            r8 = 86
            r9 = 44
            r10 = 244(0xf4, float:3.42E-43)
            r11 = 122(0x7a, float:1.71E-43)
            r12 = 110(0x6e, float:1.54E-43)
            r13 = 100
            r14 = 3
            if (r4 == r13) goto L_0x0051
            if (r4 == r12) goto L_0x0051
            if (r4 == r11) goto L_0x0051
            if (r4 == r10) goto L_0x0051
            if (r4 == r9) goto L_0x0051
            r15 = 83
            if (r4 == r15) goto L_0x0051
            if (r4 == r8) goto L_0x0051
            r15 = 118(0x76, float:1.65E-43)
            if (r4 == r15) goto L_0x0051
            r15 = 128(0x80, float:1.794E-43)
            if (r4 == r15) goto L_0x0051
            r15 = 138(0x8a, float:1.93E-43)
            if (r4 != r15) goto L_0x004b
            goto L_0x0051
        L_0x004b:
            r15 = r0
            r11 = 0
            r12 = 0
            r13 = 0
            goto L_0x00b4
        L_0x0051:
            int r15 = r2.m()
            if (r15 != r14) goto L_0x005c
            boolean r16 = r2.h()
            goto L_0x005e
        L_0x005c:
            r16 = 0
        L_0x005e:
            int r17 = r2.m()
            int r18 = r2.m()
            r2.s()
            boolean r19 = r2.h()
            if (r19 == 0) goto L_0x00ae
            if (r15 == r14) goto L_0x0072
            goto L_0x0076
        L_0x0072:
            r19 = 12
            r1 = r19
        L_0x0076:
            r10 = 0
        L_0x0077:
            if (r10 >= r1) goto L_0x00ae
            boolean r19 = r2.h()
            if (r19 == 0) goto L_0x00a5
            r11 = 6
            if (r10 >= r11) goto L_0x0084
            r11 = r3
            goto L_0x0086
        L_0x0084:
            r11 = 64
        L_0x0086:
            r12 = 0
            r20 = 8
            r21 = 8
        L_0x008b:
            if (r12 >= r11) goto L_0x00a5
            if (r20 == 0) goto L_0x009b
            int r20 = r2.n()
            int r13 = r20 + r21
            int r13 = r13 + 256
            int r13 = r13 % 256
            r20 = r13
        L_0x009b:
            if (r20 != 0) goto L_0x009e
            goto L_0x00a0
        L_0x009e:
            r21 = r20
        L_0x00a0:
            int r12 = r12 + 1
            r13 = 100
            goto L_0x008b
        L_0x00a5:
            int r10 = r10 + 1
            r11 = 122(0x7a, float:1.71E-43)
            r12 = 110(0x6e, float:1.54E-43)
            r13 = 100
            goto L_0x0077
        L_0x00ae:
            r13 = r16
            r11 = r17
            r12 = r18
        L_0x00b4:
            int r1 = r2.m()
            int r1 = r1 + 4
            int r10 = r2.m()
            if (r10 != 0) goto L_0x00cf
            int r16 = r2.m()
            int r16 = r16 + 4
            r20 = r10
            r23 = r15
            r24 = r16
        L_0x00cc:
            r25 = 0
            goto L_0x00fc
        L_0x00cf:
            if (r10 != r0) goto L_0x00f5
            boolean r16 = r2.h()
            r2.n()
            r2.n()
            int r8 = r2.m()
            r20 = r10
            long r9 = (long) r8
            r23 = r15
            r8 = 0
        L_0x00e5:
            long r14 = (long) r8
            int r14 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r14 >= 0) goto L_0x00f0
            r2.m()
            int r8 = r8 + 1
            goto L_0x00e5
        L_0x00f0:
            r25 = r16
            r24 = 0
            goto L_0x00fc
        L_0x00f5:
            r20 = r10
            r23 = r15
            r24 = 0
            goto L_0x00cc
        L_0x00fc:
            r2.m()
            r2.s()
            int r8 = r2.m()
            int r8 = r8 + r0
            int r9 = r2.m()
            int r9 = r9 + r0
            boolean r14 = r2.h()
            int r10 = 2 - r14
            int r9 = r9 * r10
            if (r14 != 0) goto L_0x0118
            r2.s()
        L_0x0118:
            r2.s()
            int r8 = r8 * r3
            int r9 = r9 * r3
            boolean r15 = r2.h()
            r16 = 2
            if (r15 == 0) goto L_0x015c
            int r15 = r2.m()
            int r26 = r2.m()
            int r27 = r2.m()
            int r28 = r2.m()
            if (r23 != 0) goto L_0x013b
            r3 = r0
            r29 = r3
            goto L_0x014e
        L_0x013b:
            r0 = r23
            r3 = 3
            if (r0 != r3) goto L_0x0144
            r3 = 1
            r29 = 1
            goto L_0x0147
        L_0x0144:
            r29 = r16
            r3 = 1
        L_0x0147:
            if (r0 != r3) goto L_0x014c
            r0 = r16
            goto L_0x014d
        L_0x014c:
            r0 = r3
        L_0x014d:
            int r10 = r10 * r0
        L_0x014e:
            int r15 = r15 + r26
            int r15 = r15 * r29
            int r8 = r8 - r15
            int r27 = r27 + r28
            int r27 = r27 * r10
            int r9 = r9 - r27
        L_0x0159:
            r0 = 44
            goto L_0x015e
        L_0x015c:
            r3 = r0
            goto L_0x0159
        L_0x015e:
            if (r4 == r0) goto L_0x0174
            r0 = 86
            if (r4 == r0) goto L_0x0174
            r0 = 100
            if (r4 == r0) goto L_0x0174
            r0 = 110(0x6e, float:1.54E-43)
            if (r4 == r0) goto L_0x0174
            r0 = 122(0x7a, float:1.71E-43)
            if (r4 == r0) goto L_0x0174
            r0 = 244(0xf4, float:3.42E-43)
            if (r4 != r0) goto L_0x017a
        L_0x0174:
            r0 = r5 & 16
            if (r0 == 0) goto L_0x017a
            r15 = 0
            goto L_0x017c
        L_0x017a:
            r15 = 16
        L_0x017c:
            boolean r0 = r2.h()
            r10 = -1
            r17 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x025a
            boolean r0 = r2.h()
            if (r0 == 0) goto L_0x01b6
            r0 = 8
            int r3 = r2.i(r0)
            r0 = 255(0xff, float:3.57E-43)
            if (r3 != r0) goto L_0x01a8
            r0 = 16
            int r3 = r2.i(r0)
            int r0 = r2.i(r0)
            if (r3 == 0) goto L_0x01b6
            if (r0 == 0) goto L_0x01b6
            float r3 = (float) r3
            float r0 = (float) r0
            float r17 = r3 / r0
            goto L_0x01b6
        L_0x01a8:
            r0 = 17
            if (r3 >= r0) goto L_0x01b1
            float[] r0 = c
            r17 = r0[r3]
            goto L_0x01b6
        L_0x01b1:
            java.lang.String r0 = "Unexpected aspect_ratio_idc value: "
            us8.l(r3, r0)
        L_0x01b6:
            boolean r0 = r2.h()
            if (r0 == 0) goto L_0x01bf
            r2.s()
        L_0x01bf:
            boolean r0 = r2.h()
            if (r0 == 0) goto L_0x01f1
            r0 = 3
            r2.t(r0)
            boolean r0 = r2.h()
            if (r0 == 0) goto L_0x01d1
            r0 = 1
            goto L_0x01d3
        L_0x01d1:
            r0 = r16
        L_0x01d3:
            boolean r3 = r2.h()
            if (r3 == 0) goto L_0x01ef
            r3 = 8
            int r10 = r2.i(r3)
            int r16 = r2.i(r3)
            r2.t(r3)
            int r10 = defpackage.z23.h(r10)
            int r3 = defpackage.z23.i(r16)
            goto L_0x01f3
        L_0x01ef:
            r3 = r10
            goto L_0x01f3
        L_0x01f1:
            r0 = r10
            r3 = r0
        L_0x01f3:
            boolean r16 = r2.h()
            if (r16 == 0) goto L_0x01ff
            r2.m()
            r2.m()
        L_0x01ff:
            boolean r16 = r2.h()
            r30 = r0
            if (r16 == 0) goto L_0x020c
            r0 = 65
            r2.t(r0)
        L_0x020c:
            boolean r0 = r2.h()
            if (r0 == 0) goto L_0x0215
            E(r2)
        L_0x0215:
            boolean r16 = r2.h()
            if (r16 == 0) goto L_0x021e
            E(r2)
        L_0x021e:
            if (r0 != 0) goto L_0x0222
            if (r16 == 0) goto L_0x0225
        L_0x0222:
            r2.s()
        L_0x0225:
            r2.s()
            boolean r0 = r2.h()
            if (r0 == 0) goto L_0x024f
            r2.s()
            r2.m()
            r2.m()
            r2.m()
            r2.m()
            int r0 = r2.m()
            r2.m()
            r22 = r0
            r21 = r3
            r19 = r10
            r10 = r17
            r0 = r30
            goto L_0x0260
        L_0x024f:
            r0 = r30
            r21 = r3
            r19 = r10
        L_0x0255:
            r22 = r15
            r10 = r17
            goto L_0x0260
        L_0x025a:
            r0 = r10
            r19 = r0
            r21 = r19
            goto L_0x0255
        L_0x0260:
            yf9 r2 = new yf9
            r3 = r2
            r16 = r20
            r15 = r1
            r17 = r24
            r18 = r25
            r20 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pfa.A(int, byte[], int):yf9");
    }

    public static void B(String str) {
        throw new CharConversionException(wn6.i("Unsupported UCS-4 endianness (", str, ") detected"));
    }

    public static boolean C(xu5 xu5, j93 j93, int i2, iqe iqe, l13 l13, ad9 ad9) {
        a39 a39;
        if (j93.a.size() <= 1) {
            ws6 ws6 = j93.a;
            if (((hs4) ws6.get(i2)).a.size() <= 1) {
                if (l13.j()) {
                    return true;
                }
                String str = iqe.b;
                if (str != null && !str.equals(xu5.n)) {
                    return true;
                }
                if (iqe.b == null && !ad9.h(xu5.n)) {
                    return true;
                }
                gs4 gs4 = (gs4) ((hs4) ws6.get(i2)).a.get(0);
                if (gs4.d && (a39 = xu5.k) != null) {
                    int i3 = 0;
                    while (true) {
                        x29[] x29Arr = a39.a;
                        if (i3 >= x29Arr.length) {
                            break;
                        } else if (x29Arr[i3] instanceof ckd) {
                            return true;
                        } else {
                            i3++;
                        }
                    }
                }
                return !gs4.g.a.isEmpty() || !j93.c.a.isEmpty();
            }
        }
        return !j93.e;
    }

    public static boolean D(xu5 xu5, j93 j93, int i2, iqe iqe, l13 l13, ad9 ad9) {
        if (j93.a.size() <= 1) {
            ws6 ws6 = j93.a;
            if (((hs4) ws6.get(i2)).a.size() <= 1) {
                gs4 gs4 = (gs4) ((hs4) ws6.get(i2)).a.get(0);
                if (l13.d() || iqe.d != 0) {
                    return true;
                }
                String str = iqe.c;
                if (str != null && !str.equals(xu5.n)) {
                    return true;
                }
                if ((str == null && !ad9.h(xu5.n)) || xu5.x != 1.0f) {
                    return true;
                }
                ws6 ws62 = gs4.g.b;
                return !ws62.isEmpty() && u(ws62, xu5) == -1.0f;
            }
        }
        return !j93.f;
    }

    public static void E(wx1 wx1) {
        int m = wx1.m() + 1;
        wx1.t(8);
        for (int i2 = 0; i2 < m; i2++) {
            wx1.m();
            wx1.m();
            wx1.s();
        }
        wx1.t(20);
    }

    public static int F(int i2, byte[] bArr) {
        int i3;
        synchronized (d) {
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2) {
                while (true) {
                    if (i4 >= i2 - 2) {
                        i4 = i2;
                        break;
                    }
                    try {
                        if (bArr[i4] == 0 && bArr[i4 + 1] == 0 && bArr[i4 + 2] == 3) {
                            break;
                        }
                        i4++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i4 < i2) {
                    int[] iArr = e;
                    if (iArr.length <= i5) {
                        e = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    e[i5] = i4;
                    i4 += 3;
                    i5++;
                }
            }
            i3 = i2 - i5;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = e[i8] - i7;
                System.arraycopy(bArr, i7, bArr, i6, i9);
                int i10 = i6 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i6 = i10 + 2;
                bArr[i11] = 0;
                i7 += i9 + 3;
            }
            System.arraycopy(bArr, i7, bArr, i6, i3 - i6);
        }
        return i3;
    }

    public static final Iterator G(Iterator it, int i2, int i3, boolean z) {
        return !it.hasNext() ? gw4.a : r1g.r(new xjd(i2, i3, it, z, (Continuation) null));
    }

    public static b3g H(Context context) {
        a24.o(context);
        "preferredRenderer: ".concat("null");
        b3g b3g = j;
        if (b3g != null) {
            return b3g;
        }
        int i2 = xa6.e;
        int a2 = xa6.a(context, 13400000);
        if (a2 == 0) {
            b3g J = J(context, 0);
            j = J;
            try {
                Parcel R = J.R(J.G0(), 9);
                int readInt = R.readInt();
                R.recycle();
                String packageName = context.getPackageName();
                if (readInt == 2 && !packageName.equals("com.google.android.apps.photos")) {
                    try {
                        b3g b3g2 = j;
                        ks9 ks9 = new ks9(I(context, 0));
                        Parcel G0 = b3g2.G0();
                        u1g.c(G0, ks9);
                        b3g2.H0(G0, 11);
                    } catch (UnsatisfiedLinkError unused) {
                        i = null;
                        j = J(context, 1);
                    } catch (RemoteException e2) {
                        throw new RuntimeException(e2);
                    }
                }
                try {
                    b3g b3g3 = j;
                    ks9 ks92 = new ks9(I(context, 0).getResources());
                    Parcel G02 = b3g3.G0();
                    u1g.c(G02, ks92);
                    G02.writeInt(19020000);
                    b3g3.H0(G02, 6);
                    return j;
                } catch (RemoteException e3) {
                    throw new RuntimeException(e3);
                }
            } catch (RemoteException e4) {
                throw new RuntimeException(e4);
            }
        } else {
            throw new GooglePlayServicesNotAvailableException(a2);
        }
    }

    public static Context I(Context context, int i2) {
        Context context2;
        Context context3 = i;
        if (context3 != null) {
            return context3;
        }
        String str = i2 == 1 ? "com.google.android.gms.maps_legacy_dynamite" : "com.google.android.gms.maps_core_dynamite";
        try {
            context2 = gr4.b(context, gr4.b, str).a;
        } catch (Exception unused) {
            if (!str.equals("com.google.android.gms.maps_dynamite")) {
                try {
                    context2 = gr4.b(context, gr4.b, "com.google.android.gms.maps_dynamite").a;
                } catch (Exception unused2) {
                    int i3 = xa6.e;
                    try {
                        context2 = context.createPackageContext("com.google.android.gms", 3);
                    } catch (PackageManager.NameNotFoundException unused3) {
                        context2 = null;
                    }
                }
            } else {
                int i4 = xa6.e;
                context2 = context.createPackageContext("com.google.android.gms", 3);
            }
        }
        i = context2;
        if (context2 != null) {
            return context2;
        }
        throw new RuntimeException("Unable to load maps module, maps container context is null");
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [vyf, b3g] */
    public static b3g J(Context context, int i2) {
        Class<?> loadClass;
        ClassLoader classLoader = I(context, i2).getClassLoader();
        try {
            a24.o(classLoader);
            loadClass = classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl");
            IBinder iBinder = (IBinder) loadClass.newInstance();
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                return queryLocalInterface instanceof b3g ? (b3g) queryLocalInterface : new vyf(iBinder, "com.google.android.gms.maps.internal.ICreator", 3);
            }
            throw new RuntimeException("Unable to load maps module, IBinder for com.google.android.gms.maps.internal.CreatorImpl is null");
        } catch (InstantiationException e2) {
            throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(loadClass.getName()), e2);
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException("Unable to call the default constructor of ".concat(loadClass.getName()), e3);
        } catch (ClassNotFoundException e4) {
            throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl", e4);
        }
    }

    public static final mq3 a(int i2) {
        int i3 = uq3.$EnumSwitchMapping$0[hr1.t(i2)];
        if (i3 == 1) {
            return new wq3();
        }
        if (i3 == 2) {
            return new sq3();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte valueOf : bArr) {
            sb.append(String.format("%02x", new Object[]{Byte.valueOf(valueOf)}));
        }
        return sb.toString();
    }

    public static final void c(int i2, int i3) {
        if (i2 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException((i2 != i3 ? rf0.g("Both size ", i2, " and step ", i3, " must be greater than zero.") : rf0.f(i2, "size ", " must be greater than zero.")).toString());
        }
    }

    public static void d(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void e(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static int f(long j2, long j3) {
        int i2 = (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1));
        if (i2 < 0) {
            return -1;
        }
        return i2 == 0 ? 0 : 1;
    }

    public static long[] g(Serializable serializable) {
        if (serializable instanceof int[]) {
            int[] iArr = (int[]) serializable;
            long[] jArr = new long[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                jArr[i2] = (long) iArr[i2];
            }
            return jArr;
        } else if (serializable instanceof long[]) {
            return (long[]) serializable;
        } else {
            return null;
        }
    }

    public static void h(q25 q25, OutputStream outputStream, int i2) {
        byte[] bArr = new byte[8192];
        while (i2 > 0) {
            int min = Math.min(i2, 8192);
            int read = q25.read(bArr, 0, min);
            if (read == min) {
                i2 -= read;
                outputStream.write(bArr, 0, read);
            } else {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
        }
    }

    public static void i(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static final void j(int i2, int i3) {
        if (i2 > i3) {
            throw new IndexOutOfBoundsException(rf0.g("toIndex (", i2, ") is greater than size (", i3, ")."));
        }
    }

    public static pcb k(Collection collection, mge mge, mge mge2) {
        return new pcb(mge, mge2, p23.B(new kc3(j8a.z0, new hge(l8a.d2), 1, false), new kc3(j8a.B0, new hge(l8a.e2), 2, false)), jjd.j(new wia("profile:memberslist:ids_to_delete", o23.t0(collection))));
    }

    public static pcb l(Collection collection, mge mge, mge mge2) {
        return new pcb(mge, mge2, p23.B(new kc3(j8a.A0, new hge(l8a.d2), 1, false), new kc3(j8a.C0, new hge(l8a.f2), 1, false), new kc3(j8a.B0, new hge(l8a.e2), 2, false)), jjd.j(new wia("profile:memberslist:ids_to_delete", o23.t0(collection))));
    }

    public static int m(byte[] bArr, int i2, int i3, boolean[] zArr) {
        int i4 = i3 - i2;
        boolean z = false;
        oyb.k(i4 >= 0);
        if (i4 == 0) {
            return i3;
        }
        if (zArr[0]) {
            d(zArr);
            return i2 - 3;
        } else if (i4 > 1 && zArr[1] && bArr[i2] == 1) {
            d(zArr);
            return i2 - 2;
        } else if (i4 <= 2 || !zArr[2] || bArr[i2] != 0 || bArr[i2 + 1] != 1) {
            int i5 = i3 - 1;
            int i6 = i2 + 2;
            while (i6 < i5) {
                byte b2 = bArr[i6];
                if ((b2 & 254) == 0) {
                    int i7 = i6 - 2;
                    if (bArr[i7] == 0 && bArr[i6 - 1] == 0 && b2 == 1) {
                        d(zArr);
                        return i7;
                    }
                    i6 -= 2;
                }
                i6 += 3;
            }
            zArr[0] = i4 <= 2 ? !(i4 != 2 ? !zArr[1] || bArr[i5] != 1 : !(zArr[2] && bArr[i3 + -2] == 0 && bArr[i5] == 1)) : bArr[i3 + -3] == 0 && bArr[i3 + -2] == 0 && bArr[i5] == 1;
            zArr[1] = i4 <= 1 ? !(!zArr[2] || bArr[i5] != 0) : bArr[i3 + -2] == 0 && bArr[i5] == 0;
            if (bArr[i5] == 0) {
                z = true;
            }
            zArr[2] = z;
            return i3;
        } else {
            d(zArr);
            return i2 - 1;
        }
    }

    public static long n(long j2, o62 o62) {
        long j3;
        Comparable comparable;
        Long b2;
        j4a j4a = o62.f0;
        if (j4a == null) {
            j3 = 0;
        } else {
            j3 = o62.g0;
            if (j3 == 0 && (j4a.b() == null || ((b2 = j4a.b()) != null && b2.longValue() == 0))) {
                j3 = o62.h0;
            }
        }
        long j4 = 0L;
        Comparable[] comparableArr = {Long.valueOf(o62.P), Long.valueOf(j2), Long.valueOf(j3)};
        if (comparableArr.length == 0) {
            comparable = null;
        } else {
            Comparable comparable2 = comparableArr[0];
            int i2 = 1;
            int length = comparableArr.length - 1;
            if (1 <= length) {
                while (true) {
                    Comparable comparable3 = comparableArr[i2];
                    if (comparable2.compareTo(comparable3) < 0) {
                        comparable2 = comparable3;
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            comparable = comparable2;
        }
        if (comparable != null) {
            j4 = comparable;
        }
        long longValue = ((Number) j4).longValue();
        return longValue == 0 ? o62.k : longValue;
    }

    public static final es o(View view) {
        return new es(6, new naf(view, (Continuation) null));
    }

    public static int p(Context context) {
        float fraction;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        boolean z = displayMetrics.widthPixels < displayMetrics.heightPixels;
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(z ? tmb.mr_dialog_fixed_width_minor : tmb.mr_dialog_fixed_width_major, typedValue, true);
        int i2 = typedValue.type;
        if (i2 == 5) {
            fraction = typedValue.getDimension(displayMetrics);
        } else if (i2 != 6) {
            return -2;
        } else {
            int i3 = displayMetrics.widthPixels;
            fraction = typedValue.getFraction((float) i3, (float) i3);
        }
        return (int) fraction;
    }

    public static int q(int i2) {
        return i2 >= a24.X(((float) 200) * dh4.c().getDisplayMetrics().density) ? a24.X(((float) 90) * dh4.c().getDisplayMetrics().density) : i2 >= a24.X(((float) 72) * dh4.c().getDisplayMetrics().density) ? a24.X(((float) 36) * dh4.c().getDisplayMetrics().density) : i2 >= a24.X(((float) 64) * dh4.c().getDisplayMetrics().density) ? a24.X(((float) 32) * dh4.c().getDisplayMetrics().density) : i2 >= a24.X(((float) 48) * dh4.c().getDisplayMetrics().density) ? a24.X(((float) 28) * dh4.c().getDisplayMetrics().density) : i2 >= a24.X(((float) 36) * dh4.c().getDisplayMetrics().density) ? a24.X(((float) 24) * dh4.c().getDisplayMetrics().density) : i2 >= a24.X(((float) 32) * dh4.c().getDisplayMetrics().density) ? a24.X(((float) 20) * dh4.c().getDisplayMetrics().density) : i2 >= 28 ? a24.X(((float) 16) * dh4.c().getDisplayMetrics().density) : a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
    }

    public static int r(String str) {
        int g2 = c49.g(str);
        if (g2 == 4) {
            return 2;
        }
        return g2;
    }

    public static Matrix s(ms msVar, ms msVar2, int i2) {
        int t = hr1.t(i2);
        int i3 = msVar.c;
        int i4 = msVar.b;
        int i5 = msVar2.c;
        int i6 = msVar2.b;
        if (t == 0) {
            Matrix matrix = new Matrix();
            matrix.setScale(((float) i4) / ((float) i6), ((float) i3) / ((float) i5), 0.0f, 0.0f);
            return matrix;
        } else if (t == 1) {
            float f2 = ((float) i6) / ((float) i4);
            float f3 = (float) i5;
            float f4 = f3 / ((float) i3);
            float min = Math.min(f2, f4);
            Matrix matrix2 = new Matrix();
            matrix2.setScale(min / f2, min / f4, ((float) i6) / 2.0f, f3 / 2.0f);
            return matrix2;
        } else if (t == 2) {
            float f5 = ((float) i6) / ((float) i4);
            float f6 = (float) i5;
            float f7 = f6 / ((float) i3);
            float max = Math.max(f5, f7);
            Matrix matrix3 = new Matrix();
            matrix3.setScale(max / f5, max / f7, ((float) i6) / 2.0f, f6 / 2.0f);
            return matrix3;
        } else {
            throw new IllegalArgumentException("Unknown scale type = ".concat(i2 != 1 ? i2 != 2 ? i2 != 3 ? "null" : "CENTER_CROP" : "FIT_CENTER" : "NONE"));
        }
    }

    public static final ArrayList t(pwc pwc) {
        ugd ugd;
        pwc.getClass();
        ArrayList arrayList = new ArrayList(pwc.a);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((rwc) next).f) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            rwc rwc = (rwc) it2.next();
            yk7 O = kjd.O(rwc.a);
            String f2 = pwc.f(rwc);
            tk7 tk7 = rwc.a;
            if (f2 == null) {
                ugd = pwc.l(rwc);
            } else {
                int i2 = tk7.a;
                if (pwc.l == 2) {
                    i2 = 7;
                }
                ugd = new ugd(i2, f2);
            }
            Uri a2 = kpa.b(rwc.c, tk7) ? kpa.a(rwc.c, tk7) : O.z0;
            boolean z = tk7.a == 7;
            Uri parse = Uri.parse(ugd.b);
            kpa kpa = rwc.c;
            arrayList3.add(new qwc(O, z, parse, a2, (String) null, (RectF) null, (Rect) null, kpa != null ? kpa.X : null));
        }
        return arrayList3;
    }

    public static float u(ws6 ws6, xu5 xu5) {
        int i2 = xu5.w;
        int i3 = i2 % 180;
        int i4 = xu5.u;
        int i5 = xu5.t;
        int i6 = i3 == 0 ? i5 : i4;
        int i7 = i2 % 180 == 0 ? i4 : i5;
        float f2 = 0.0f;
        for (int i8 = 0; i8 < ws6.size(); i8++) {
            uw7 uw7 = (uw7) ws6.get(i8);
            if (!(uw7 instanceof uw7)) {
                return -1.0f;
            }
            if (uw7 instanceof flc) {
                flc flc = (flc) uw7;
                flc.getClass();
                float f3 = flc.a;
                if (f3 % 90.0f != 0.0f) {
                    return -1.0f;
                }
                f2 += f3;
                int i9 = ((f2 % 180.0f) > 0.0f ? 1 : ((f2 % 180.0f) == 0.0f ? 0 : -1));
                i6 = i9 == 0 ? i5 : i4;
                i7 = i9 == 0 ? i4 : i5;
            } else if (!uw7.c(i6, i7)) {
                return -1.0f;
            }
        }
        float f4 = f2 % 360.0f;
        if (f4 % 90.0f == 0.0f) {
            return f4;
        }
        return -1.0f;
    }

    public static void v(ad9 ad9, ws6 ws6, xu5 xu5) {
        float u = u(ws6, xu5);
        if (u == 90.0f || u == 180.0f || u == 270.0f) {
            int round = 360 - Math.round(u);
            oyb.j("The additional rotation cannot be changed after adding track formats.", ad9.e.size() == 0 || ad9.v == round);
            ad9.v = round;
        }
    }

    public static final int w(Context context) {
        return Math.min(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels);
    }

    public static final nqc x(Context context) {
        context.getApplicationContext().getClass();
        return nqc.a;
    }

    public static uf9 y(int i2, byte[] bArr, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr;
        int i9;
        int i10;
        int i11;
        int i12;
        wx1 wx1 = new wx1(i2 + 2, i3, 4, bArr);
        int i13 = 4;
        wx1.t(4);
        int i14 = wx1.i(3);
        wx1.s();
        int i15 = wx1.i(2);
        boolean h2 = wx1.h();
        int i16 = wx1.i(5);
        int i17 = 0;
        for (int i18 = 0; i18 < 32; i18++) {
            if (wx1.h()) {
                i17 |= 1 << i18;
            }
        }
        int[] iArr2 = new int[6];
        for (int i19 = 0; i19 < 6; i19++) {
            iArr2[i19] = wx1.i(8);
        }
        int i20 = wx1.i(8);
        int i21 = 0;
        for (int i22 = 0; i22 < i14; i22++) {
            if (wx1.h()) {
                i21 += 89;
            }
            if (wx1.h()) {
                i21 += 8;
            }
        }
        wx1.t(i21);
        if (i14 > 0) {
            wx1.t((8 - i14) * 2);
        }
        wx1.m();
        int m = wx1.m();
        if (m == 3) {
            wx1.s();
        }
        int m2 = wx1.m();
        int m3 = wx1.m();
        if (wx1.h()) {
            int m4 = wx1.m();
            int m5 = wx1.m();
            int m6 = wx1.m();
            int m7 = wx1.m();
            m2 -= (m4 + m5) * ((m == 1 || m == 2) ? 2 : 1);
            m3 -= (m6 + m7) * (m == 1 ? 2 : 1);
        }
        int i23 = m3;
        int i24 = m2;
        int m8 = wx1.m();
        int m9 = wx1.m();
        int m10 = wx1.m();
        int i25 = -1;
        int i26 = -1;
        for (int i27 = wx1.h() ? 0 : i14; i27 <= i14; i27++) {
            wx1.m();
            i26 = Math.max(wx1.m(), i26);
            wx1.m();
        }
        wx1.m();
        wx1.m();
        wx1.m();
        wx1.m();
        wx1.m();
        wx1.m();
        if (wx1.h() && wx1.h()) {
            int i28 = 0;
            while (i28 < i13) {
                int i29 = 0;
                while (i29 < 6) {
                    if (!wx1.h()) {
                        wx1.m();
                    } else {
                        int min = Math.min(64, 1 << ((i28 << 1) + i13));
                        if (i28 > 1) {
                            wx1.n();
                        }
                        for (int i30 = 0; i30 < min; i30++) {
                            wx1.n();
                        }
                    }
                    i29 += i28 == 3 ? 3 : 1;
                    i13 = 4;
                }
                i28++;
                i13 = 4;
            }
        }
        wx1.t(2);
        if (wx1.h()) {
            wx1.t(8);
            wx1.m();
            wx1.m();
            wx1.s();
        }
        int m11 = wx1.m();
        int[] iArr3 = new int[0];
        int[] iArr4 = new int[0];
        int i31 = 0;
        int i32 = -1;
        int i33 = -1;
        while (i31 < m11) {
            if (i31 == 0 || !wx1.h()) {
                i11 = m11;
                i7 = i16;
                i8 = i17;
                iArr = iArr2;
                i9 = i20;
                i10 = i26;
                int m12 = wx1.m();
                int m13 = wx1.m();
                iArr3 = new int[m12];
                int i34 = 0;
                while (i34 < m12) {
                    iArr3[i34] = (i34 > 0 ? iArr3[i34 - 1] : 0) - (wx1.m() + 1);
                    wx1.s();
                    i34++;
                }
                iArr4 = new int[m13];
                int i35 = 0;
                while (i35 < m13) {
                    iArr4[i35] = wx1.m() + 1 + (i35 > 0 ? iArr4[i35 - 1] : 0);
                    wx1.s();
                    i35++;
                }
                int i36 = m13;
                i32 = m12;
                i12 = i36;
            } else {
                i11 = m11;
                int i37 = i32 + i33;
                int m14 = (1 - ((wx1.h() ? 1 : 0) * true)) * (wx1.m() + 1);
                i10 = i26;
                int i38 = i37 + 1;
                i9 = i20;
                boolean[] zArr = new boolean[i38];
                iArr = iArr2;
                for (int i39 = 0; i39 <= i37; i39++) {
                    if (!wx1.h()) {
                        zArr[i39] = wx1.h();
                    } else {
                        zArr[i39] = true;
                    }
                }
                int[] iArr5 = new int[i38];
                int[] iArr6 = new int[i38];
                int i40 = 0;
                for (int i41 = i33 - 1; i41 >= 0; i41--) {
                    int i42 = iArr4[i41] + m14;
                    if (i42 < 0 && zArr[i32 + i41]) {
                        iArr5[i40] = i42;
                        i40++;
                    }
                }
                if (m14 < 0 && zArr[i37]) {
                    iArr5[i40] = m14;
                    i40++;
                }
                i8 = i17;
                int i43 = i40;
                i7 = i16;
                for (int i44 = 0; i44 < i32; i44++) {
                    int i45 = iArr3[i44] + m14;
                    if (i45 < 0 && zArr[i44]) {
                        iArr5[i43] = i45;
                        i43++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr5, i43);
                int i46 = 0;
                for (int i47 = i32 - 1; i47 >= 0; i47--) {
                    int i48 = iArr3[i47] + m14;
                    if (i48 > 0 && zArr[i47]) {
                        iArr6[i46] = i48;
                        i46++;
                    }
                }
                if (m14 > 0 && zArr[i37]) {
                    iArr6[i46] = m14;
                    i46++;
                }
                i12 = i46;
                for (int i49 = 0; i49 < i33; i49++) {
                    int i50 = iArr4[i49] + m14;
                    if (i50 > 0 && zArr[i32 + i49]) {
                        iArr6[i12] = i50;
                        i12++;
                    }
                }
                iArr4 = Arrays.copyOf(iArr6, i12);
                iArr3 = copyOf;
                i32 = i43;
            }
            i31++;
            i33 = i12;
            m11 = i11;
            i26 = i10;
            i20 = i9;
            iArr2 = iArr;
            i17 = i8;
            i16 = i7;
        }
        int i51 = i16;
        int i52 = i17;
        int[] iArr7 = iArr2;
        int i53 = i20;
        int i54 = i26;
        if (wx1.h()) {
            int m15 = wx1.m();
            for (int i55 = 0; i55 < m15; i55++) {
                wx1.t(m10 + 5);
            }
        }
        int i56 = 2;
        wx1.t(2);
        float f2 = 1.0f;
        if (wx1.h()) {
            if (wx1.h()) {
                int i57 = wx1.i(8);
                if (i57 == 255) {
                    int i58 = wx1.i(16);
                    int i59 = wx1.i(16);
                    if (!(i58 == 0 || i59 == 0)) {
                        f2 = ((float) i58) / ((float) i59);
                    }
                } else if (i57 < 17) {
                    f2 = c[i57];
                } else {
                    us8.l(i57, "Unexpected aspect_ratio_idc value: ");
                }
            }
            if (wx1.h()) {
                wx1.s();
            }
            if (wx1.h()) {
                wx1.t(3);
                if (wx1.h()) {
                    i56 = 1;
                }
                if (wx1.h()) {
                    int i60 = wx1.i(8);
                    int i61 = wx1.i(8);
                    wx1.t(8);
                    i25 = z23.h(i60);
                    i6 = z23.i(i61);
                } else {
                    i6 = -1;
                }
            } else {
                i56 = -1;
                i6 = -1;
            }
            if (wx1.h()) {
                wx1.m();
                wx1.m();
            }
            wx1.s();
            if (wx1.h()) {
                i23 *= 2;
            }
            i4 = i56;
            i5 = i23;
        } else {
            i5 = i23;
            i6 = -1;
            i4 = -1;
        }
        return new uf9(i15, h2, i51, i52, m8, m9, iArr7, i53, i24, i5, f2, i54, i25, i4, i6);
    }

    public static Set z(String str) {
        Character ch;
        if (str.length() == 0) {
            return qw4.a;
        }
        String substring = str.substring(h0e.Z(str, '(', 0, false, 6) + 1, h0e.e0(str, ')', 0, 6));
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque();
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < substring.length()) {
            char charAt = substring.charAt(i3);
            int i5 = i4 + 1;
            if (charAt == '\'' || charAt == '\"' || charAt == '`') {
                if (arrayDeque.isEmpty()) {
                    arrayDeque.push(Character.valueOf(charAt));
                } else {
                    Character ch2 = (Character) arrayDeque.peek();
                    if (ch2 != null && ch2.charValue() == charAt) {
                        arrayDeque.pop();
                    }
                }
            } else if (charAt == '[') {
                if (arrayDeque.isEmpty()) {
                    arrayDeque.push(Character.valueOf(charAt));
                }
            } else if (charAt == ']') {
                if (!arrayDeque.isEmpty() && (ch = (Character) arrayDeque.peek()) != null && ch.charValue() == '[') {
                    arrayDeque.pop();
                }
            } else if (charAt == ',' && arrayDeque.isEmpty()) {
                String substring2 = substring.substring(i2 + 1, i4);
                int length = substring2.length() - 1;
                int i6 = 0;
                boolean z = false;
                while (i6 <= length) {
                    boolean z2 = hhd.o(substring2.charAt(!z ? i6 : length), 32) <= 0;
                    if (!z) {
                        if (!z2) {
                            z = true;
                        } else {
                            i6++;
                        }
                    } else if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                }
                arrayList.add(substring2.subSequence(i6, length + 1).toString());
                i2 = i4;
            }
            i3++;
            i4 = i5;
        }
        arrayList.add(h0e.B0(substring.substring(i2 + 1)).toString());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String str2 = (String) next;
            String[] strArr = p16.d;
            int i7 = 0;
            while (true) {
                if (i7 >= 9) {
                    break;
                } else if (p0e.Q(str2, strArr[i7], false)) {
                    arrayList2.add(next);
                    break;
                } else {
                    i7++;
                }
            }
        }
        return o23.w0(arrayList2);
    }
}
