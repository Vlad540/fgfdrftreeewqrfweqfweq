package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.internal.Symbol;
import org.json.JSONArray;
import ru.ok.messages.views.fragments.base.FrgBase;

/* renamed from: kjd  reason: default package */
public final class kjd implements ljd {
    public static dg9 b;
    public static final int[] c = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] d = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] e = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final int[] f = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    public static final int[] g = {5, 8, 10, 12};
    public static final int[] h = {6, 9, 12, 15};
    public static final int[] i = {2, 4, 6, 8};
    public static final int[] j = {9, 11, 13, 16};
    public static final int[] k = {5, 8, 10, 12};
    public static final byte[] l = {0, 0, 0, 1};
    public static final float[] m = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object n = new Object();
    public static int[] o = new int[10];
    public static final ib5 p;
    public static final ib5[] q;
    public final /* synthetic */ int a = 1;

    static {
        ib5 ib5 = new ib5("CLIENT_TELEMETRY", 1);
        p = ib5;
        q = new ib5[]{ib5};
    }

    public static void A(dg9 dg9) {
        boolean z;
        synchronized (kjd.class) {
            z = b != null;
        }
        if (!z) {
            synchronized (kjd.class) {
                try {
                    if (b == null) {
                        b = dg9;
                    } else {
                        throw new IllegalStateException("Cannot re-initialize NativeLoader.");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static final void B(im imVar, boolean z) {
        if (z) {
            imVar.getWindow().addFlags(128);
        } else {
            imVar.getWindow().clearFlags(128);
        }
        imVar.setShowWhenLocked(z);
        imVar.setTurnScreenOn(z);
    }

    public static final Drawable C(int i2, int i3, Context context) {
        Drawable b2 = gq3.b(context, i2);
        js.D(b2, i3);
        return b2;
    }

    public static boolean D(String str) {
        dg9 dg9;
        synchronized (kjd.class) {
            dg9 = b;
            if (dg9 == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return dg9.c(str);
    }

    public static int E(v0a v0a) {
        int ordinal = v0a.ordinal();
        if (ordinal == 0) {
            return a24.X(((float) 28) * dh4.c().getDisplayMetrics().density);
        }
        if (ordinal == 1) {
            return a24.X(((float) 40) * dh4.c().getDisplayMetrics().density);
        }
        if (ordinal == 2) {
            return a24.X(((float) 52) * dh4.c().getDisplayMetrics().density);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void F(yvc yvc, long j2, u16 u16) {
        vx9 vx9 = new vx9(j2);
        ux9 ux9 = ux9.a;
        ete.g(3, ux9);
        Symbol symbol = bwc.a;
        wvc wvc = new wvc(yvc, vx9, ux9, awc.a, bwc.e, (l5e) u16, (k26) null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = yvc.Y;
        yvc.f(wvc, false);
    }

    public static tf9 G(int i2, byte[] bArr, int i3) {
        wx1 wx1 = new wx1(i2 + 2, i3, 3, bArr);
        int i4 = 4;
        wx1.t(4);
        int i5 = wx1.i(3);
        wx1.s();
        int i6 = wx1.i(2);
        boolean h2 = wx1.h();
        int i7 = wx1.i(5);
        int i8 = 0;
        for (int i9 = 0; i9 < 32; i9++) {
            if (wx1.h()) {
                i8 |= 1 << i9;
            }
        }
        int i10 = 6;
        int[] iArr = new int[6];
        for (int i11 = 0; i11 < 6; i11++) {
            iArr[i11] = wx1.i(8);
        }
        int i12 = wx1.i(8);
        int i13 = 0;
        for (int i14 = 0; i14 < i5; i14++) {
            if (wx1.h()) {
                i13 += 89;
            }
            if (wx1.h()) {
                i13 += 8;
            }
        }
        wx1.t(i13);
        if (i5 > 0) {
            wx1.t((8 - i5) * 2);
        }
        wx1.m();
        int m2 = wx1.m();
        if (m2 == 3) {
            wx1.s();
        }
        int m3 = wx1.m();
        int m4 = wx1.m();
        if (wx1.h()) {
            int m5 = wx1.m();
            int m6 = wx1.m();
            int m7 = wx1.m();
            int m8 = wx1.m();
            m3 -= (m5 + m6) * ((m2 == 1 || m2 == 2) ? 2 : 1);
            m4 -= (m7 + m8) * (m2 == 1 ? 2 : 1);
        }
        int i15 = m4;
        int i16 = m3;
        wx1.m();
        wx1.m();
        int m9 = wx1.m();
        for (int i17 = wx1.h() ? 0 : i5; i17 <= i5; i17++) {
            wx1.m();
            wx1.m();
            wx1.m();
        }
        wx1.m();
        wx1.m();
        wx1.m();
        wx1.m();
        wx1.m();
        wx1.m();
        if (wx1.h() && wx1.h()) {
            int i18 = 0;
            while (i18 < i4) {
                int i19 = 0;
                while (i19 < i10) {
                    if (!wx1.h()) {
                        wx1.m();
                    } else {
                        int min = Math.min(64, 1 << ((i18 << 1) + 4));
                        if (i18 > 1) {
                            wx1.n();
                        }
                        for (int i20 = 0; i20 < min; i20++) {
                            wx1.n();
                        }
                    }
                    i19 += i18 == 3 ? 3 : 1;
                    i10 = 6;
                }
                i18++;
                i4 = 4;
                i10 = 6;
            }
        }
        wx1.t(2);
        if (wx1.h()) {
            wx1.t(8);
            wx1.m();
            wx1.m();
            wx1.s();
        }
        int m10 = wx1.m();
        boolean z = false;
        int i21 = 0;
        for (int i22 = 0; i22 < m10; i22++) {
            if (i22 != 0) {
                z = wx1.h();
            }
            if (z) {
                wx1.s();
                wx1.m();
                for (int i23 = 0; i23 <= i21; i23++) {
                    if (!wx1.h()) {
                        wx1.s();
                    }
                }
            } else {
                int m11 = wx1.m();
                int m12 = wx1.m();
                int i24 = m11 + m12;
                for (int i25 = 0; i25 < m11; i25++) {
                    wx1.m();
                    wx1.s();
                }
                for (int i26 = 0; i26 < m12; i26++) {
                    wx1.m();
                    wx1.s();
                }
                i21 = i24;
            }
        }
        if (wx1.h()) {
            for (int i27 = 0; i27 < wx1.m(); i27++) {
                wx1.t(m9 + 5);
            }
        }
        wx1.t(2);
        float f2 = 1.0f;
        if (wx1.h()) {
            if (wx1.h()) {
                int i28 = wx1.i(8);
                if (i28 == 255) {
                    int i29 = wx1.i(16);
                    int i30 = wx1.i(16);
                    if (!(i29 == 0 || i30 == 0)) {
                        f2 = ((float) i29) / ((float) i30);
                    }
                } else if (i28 < 17) {
                    f2 = m[i28];
                }
            }
            if (wx1.h()) {
                wx1.s();
            }
            if (wx1.h()) {
                wx1.t(4);
                if (wx1.h()) {
                    wx1.t(24);
                }
            }
            if (wx1.h()) {
                wx1.m();
                wx1.m();
            }
            wx1.s();
            if (wx1.h()) {
                i15 *= 2;
            }
        }
        return new tf9(i6, h2, i7, i8, iArr, i12, i16, i15, f2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0160  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.xf9 H(int r22, byte[] r23, int r24) {
        /*
            r0 = 1
            int r1 = r22 + 1
            wx1 r2 = new wx1
            r3 = 3
            r4 = r23
            r5 = r24
            r2.<init>((int) r1, (int) r5, (int) r3, (byte[]) r4)
            r1 = 8
            int r4 = r2.i(r1)
            int r5 = r2.i(r1)
            int r6 = r2.i(r1)
            int r7 = r2.m()
            r3 = 100
            r8 = 3
            if (r4 == r3) goto L_0x004c
            r3 = 110(0x6e, float:1.54E-43)
            if (r4 == r3) goto L_0x004c
            r3 = 122(0x7a, float:1.71E-43)
            if (r4 == r3) goto L_0x004c
            r3 = 244(0xf4, float:3.42E-43)
            if (r4 == r3) goto L_0x004c
            r3 = 44
            if (r4 == r3) goto L_0x004c
            r3 = 83
            if (r4 == r3) goto L_0x004c
            r3 = 86
            if (r4 == r3) goto L_0x004c
            r3 = 118(0x76, float:1.65E-43)
            if (r4 == r3) goto L_0x004c
            r3 = 128(0x80, float:1.794E-43)
            if (r4 == r3) goto L_0x004c
            r3 = 138(0x8a, float:1.93E-43)
            if (r4 != r3) goto L_0x0049
            goto L_0x004c
        L_0x0049:
            r3 = r0
            r11 = 0
            goto L_0x009e
        L_0x004c:
            int r3 = r2.m()
            if (r3 != r8) goto L_0x0057
            boolean r11 = r2.h()
            goto L_0x0058
        L_0x0057:
            r11 = 0
        L_0x0058:
            r2.m()
            r2.m()
            r2.s()
            boolean r12 = r2.h()
            if (r12 == 0) goto L_0x009e
            if (r3 == r8) goto L_0x006b
            r12 = r1
            goto L_0x006d
        L_0x006b:
            r12 = 12
        L_0x006d:
            r13 = 0
        L_0x006e:
            if (r13 >= r12) goto L_0x009e
            boolean r14 = r2.h()
            if (r14 == 0) goto L_0x009b
            r14 = 6
            if (r13 >= r14) goto L_0x007c
            r14 = 16
            goto L_0x007e
        L_0x007c:
            r14 = 64
        L_0x007e:
            r16 = r1
            r17 = r16
            r15 = 0
        L_0x0083:
            if (r15 >= r14) goto L_0x009b
            if (r16 == 0) goto L_0x0093
            int r16 = r2.n()
            int r10 = r16 + r17
            int r10 = r10 + 256
            int r10 = r10 % 256
            r16 = r10
        L_0x0093:
            if (r16 != 0) goto L_0x0096
            goto L_0x0098
        L_0x0096:
            r17 = r16
        L_0x0098:
            int r15 = r15 + 1
            goto L_0x0083
        L_0x009b:
            int r13 = r13 + 1
            goto L_0x006e
        L_0x009e:
            int r10 = r2.m()
            int r13 = r10 + 4
            int r14 = r2.m()
            if (r14 != 0) goto L_0x00b3
            int r10 = r2.m()
            int r10 = r10 + 4
            r0 = r10
        L_0x00b1:
            r1 = 0
            goto L_0x00d5
        L_0x00b3:
            if (r14 != r0) goto L_0x00d3
            boolean r10 = r2.h()
            r2.n()
            r2.n()
            int r12 = r2.m()
            long r8 = (long) r12
            r12 = 0
        L_0x00c5:
            long r0 = (long) r12
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d0
            r2.m()
            int r12 = r12 + 1
            goto L_0x00c5
        L_0x00d0:
            r1 = r10
            r0 = 0
            goto L_0x00d5
        L_0x00d3:
            r0 = 0
            goto L_0x00b1
        L_0x00d5:
            r2.m()
            r2.s()
            int r8 = r2.m()
            r9 = 1
            int r8 = r8 + r9
            int r10 = r2.m()
            int r10 = r10 + r9
            boolean r12 = r2.h()
            int r9 = 2 - r12
            int r10 = r10 * r9
            if (r12 != 0) goto L_0x00f2
            r2.s()
        L_0x00f2:
            r2.s()
            r17 = 16
            int r8 = r8 * 16
            int r10 = r10 * 16
            boolean r17 = r2.h()
            if (r17 == 0) goto L_0x0134
            int r17 = r2.m()
            int r18 = r2.m()
            int r19 = r2.m()
            int r20 = r2.m()
            if (r3 != 0) goto L_0x0115
            r15 = 1
            goto L_0x0128
        L_0x0115:
            r21 = 2
            r15 = 3
            if (r3 != r15) goto L_0x011e
            r22 = 1
        L_0x011c:
            r15 = 1
            goto L_0x0121
        L_0x011e:
            r22 = r21
            goto L_0x011c
        L_0x0121:
            if (r3 != r15) goto L_0x0125
            r15 = r21
        L_0x0125:
            int r9 = r9 * r15
            r15 = r22
        L_0x0128:
            int r17 = r17 + r18
            int r17 = r17 * r15
            int r8 = r8 - r17
            int r19 = r19 + r20
            int r19 = r19 * r9
            int r10 = r10 - r19
        L_0x0134:
            r9 = r10
            boolean r3 = r2.h()
            r10 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L_0x0169
            boolean r3 = r2.h()
            if (r3 == 0) goto L_0x0169
            r3 = 8
            int r3 = r2.i(r3)
            r15 = 255(0xff, float:3.57E-43)
            if (r3 != r15) goto L_0x0160
            r15 = 16
            int r3 = r2.i(r15)
            int r2 = r2.i(r15)
            if (r3 == 0) goto L_0x0169
            if (r2 == 0) goto L_0x0169
            float r3 = (float) r3
            float r2 = (float) r2
            float r10 = r3 / r2
            goto L_0x0169
        L_0x0160:
            r2 = 17
            if (r3 >= r2) goto L_0x0169
            float[] r2 = m
            r2 = r2[r3]
            r10 = r2
        L_0x0169:
            xf9 r2 = new xf9
            r3 = r2
            r15 = r0
            r16 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kjd.H(int, byte[], int):xf9");
    }

    public static int I(wx1 wx1, int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 3 && wx1.h(); i3++) {
            i2++;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 += 1 << iArr[i5];
        }
        return wx1.i(iArr[i2]) + i4;
    }

    public static final void J(View view, float f2) {
        view.setClipToOutline(true);
        view.setOutlineProvider(new tp0(f2));
    }

    public static final Uri K(Uri uri, l68 l68) {
        String str;
        Uri.Builder buildUpon = uri.buildUpon();
        m68.a.getClass();
        Integer num = l68.d.H;
        if (num == null || (str = num.toString()) == null) {
            str = String.valueOf(0);
        }
        return buildUpon.appendQueryParameter("MediaItemType", str).build();
    }

    public static int L(pda pda, u0a u0a, s0a s0a, boolean z) {
        if (z) {
            int ordinal = u0a.ordinal();
            if (ordinal == 0) {
                int ordinal2 = s0a.ordinal();
                if (ordinal2 == 0 || ordinal2 == 1) {
                    pda.getText();
                } else if (ordinal2 == 2) {
                    return pda.getText().a;
                } else {
                    if (ordinal2 == 3) {
                        pda.getText();
                    } else if (ordinal2 == 4) {
                        pda.getText();
                        return -15987442;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            } else if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
                int ordinal3 = s0a.ordinal();
                if (ordinal3 == 0) {
                    pda.getText();
                    return -16745729;
                } else if (ordinal3 == 1) {
                    return pda.getText().b;
                } else {
                    if (ordinal3 == 2) {
                        return pda.getText().e;
                    }
                    if (ordinal3 == 3) {
                        return pda.getText().c;
                    }
                    if (ordinal3 == 4) {
                        pda.getText();
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            int ordinal4 = u0a.ordinal();
            if (ordinal4 == 0) {
                int ordinal5 = s0a.ordinal();
                if (ordinal5 == 0 || ordinal5 == 1) {
                    return pda.c().c.e;
                }
                if (ordinal5 == 2) {
                    return pda.c().c.d;
                }
                if (ordinal5 == 3) {
                    return pda.c().c.e;
                }
                if (ordinal5 == 4) {
                    return pda.c().c.i;
                }
                throw new NoWhenBranchMatchedException();
            } else if (ordinal4 == 1 || ordinal4 == 2 || ordinal4 == 3) {
                int ordinal6 = s0a.ordinal();
                if (ordinal6 == 0) {
                    pda.getText();
                    return -16745729;
                } else if (ordinal6 == 1) {
                    return pda.getText().b;
                } else {
                    if (ordinal6 == 2) {
                        return pda.getText().e;
                    }
                    if (ordinal6 == 3) {
                        return pda.getText().c;
                    }
                    if (ordinal6 == 4) {
                        pda.getText();
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return -1;
    }

    public static final EnumSet M(String str) {
        r72 r72;
        JSONArray jSONArray = new JSONArray(str);
        EnumSet<E> noneOf = EnumSet.noneOf(r72.class);
        Iterator it = gwf.S(0, jSONArray.length()).iterator();
        while (((ez6) it).c) {
            try {
                r72 = r72.valueOf(jSONArray.getString(((ez6) it).a()));
            } catch (Throwable th) {
                r72 = new kcc(th);
            }
            if (r72 instanceof kcc) {
                r72 = null;
            }
            r72 r722 = r72;
            if (r722 != null) {
                noneOf.add(r722);
            }
        }
        return noneOf;
    }

    public static tk7 N(yk7 yk7) {
        int i2;
        yk7 yk72 = yk7;
        int t = hr1.t(yk72.A0);
        int i3 = 0;
        if (t != 0) {
            i2 = 1;
            if (!(t == 1 || t == 2)) {
                i2 = 3;
                if (t != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } else {
            i2 = 0;
        }
        String uri = yk72.b.toString();
        Integer num = yk72.Y;
        if (num != null) {
            i3 = num.intValue();
        }
        int i4 = i3;
        Long l2 = yk72.Z;
        long longValue = l2 != null ? l2.longValue() : 0;
        return new tk7(i2, yk72.a, uri, yk72.z0.toString(), i4, longValue, yk72.c, yk72.X, yk72.b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r3 = android.net.Uri.parse(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final yk7 O(tk7 r18) {
        /*
            r0 = r18
            java.lang.String r1 = r0.c
            java.lang.String r2 = r0.o
            if (r2 == 0) goto L_0x0012
            android.net.Uri r2 = android.net.Uri.parse(r2)
            if (r2 != 0) goto L_0x000f
            goto L_0x0012
        L_0x000f:
            r17 = r2
            goto L_0x0017
        L_0x0012:
            android.net.Uri r2 = android.net.Uri.parse(r1)
            goto L_0x000f
        L_0x0017:
            yk7 r2 = new yk7
            if (r1 == 0) goto L_0x0024
            android.net.Uri r3 = android.net.Uri.parse(r1)
            if (r3 != 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r6 = r3
            goto L_0x0026
        L_0x0024:
            r6 = r17
        L_0x0026:
            java.lang.String r3 = r0.Z
            if (r3 != 0) goto L_0x00b2
            r3 = 2
            if (r1 != 0) goto L_0x002f
            goto L_0x00ac
        L_0x002f:
            java.lang.String r4 = "."
            r5 = 6
            int r4 = defpackage.h0e.f0(r4, r1, r5)
            r5 = -1
            if (r4 != r5) goto L_0x003b
            goto L_0x00ac
        L_0x003b:
            int r5 = r1.length()     // Catch:{ all -> 0x00ac }
            java.lang.String r1 = r1.substring(r4, r5)     // Catch:{ all -> 0x00ac }
            java.util.Locale r4 = java.util.Locale.getDefault()     // Catch:{ all -> 0x00ac }
            java.lang.String r1 = r1.toLowerCase(r4)     // Catch:{ all -> 0x00ac }
            android.webkit.MimeTypeMap r4 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r1 = r4.getMimeTypeFromExtension(r1)
            if (r1 == 0) goto L_0x00ac
            int r4 = r1.length()
            if (r4 != 0) goto L_0x005c
            goto L_0x00ac
        L_0x005c:
            r4 = 11
            int[] r4 = defpackage.hr1.w(r4)
            int r5 = r4.length
            r7 = 0
            r8 = r7
        L_0x0065:
            if (r8 >= r5) goto L_0x0077
            r9 = r4[r8]
            java.lang.String r10 = us8.f(r9)
            boolean r10 = r10.equalsIgnoreCase(r1)
            if (r10 == 0) goto L_0x0074
            goto L_0x0078
        L_0x0074:
            int r8 = r8 + 1
            goto L_0x0065
        L_0x0077:
            r9 = r7
        L_0x0078:
            r1 = 1
            if (r9 != 0) goto L_0x007c
            r9 = r1
        L_0x007c:
            java.lang.String r4 = us8.f(r9)
            int r5 = r4.length()
            if (r5 != 0) goto L_0x0087
            goto L_0x0098
        L_0x0087:
            java.lang.String r5 = "image/"
            boolean r5 = defpackage.p0e.Q(r4, r5, r1)
            if (r5 == 0) goto L_0x0098
            java.lang.String r5 = "djvu"
            boolean r5 = defpackage.h0e.R(r4, r5, r1)
            if (r5 != 0) goto L_0x0098
            goto L_0x00a7
        L_0x0098:
            int r5 = r4.length()
            if (r5 != 0) goto L_0x009f
            goto L_0x00a8
        L_0x009f:
            java.lang.String r5 = "video/"
            boolean r1 = defpackage.p0e.Q(r4, r5, r1)
            if (r1 == 0) goto L_0x00a8
        L_0x00a7:
            r7 = r9
        L_0x00a8:
            if (r7 != 0) goto L_0x00ab
            goto L_0x00ac
        L_0x00ab:
            r3 = r7
        L_0x00ac:
            java.lang.String r1 = us8.f(r3)
            r7 = r1
            goto L_0x00b3
        L_0x00b2:
            r7 = r3
        L_0x00b3:
            int r1 = r0.X
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            long r3 = r0.Y
            java.lang.Long r12 = java.lang.Long.valueOf(r3)
            long r9 = r0.w0
            r13 = 0
            long r4 = r0.b
            r8 = -1
            r14 = 0
            r15 = 0
            r3 = r2
            r3.<init>(r4, r6, r7, r8, r9, r11, r12, r13, r14, r15, r17)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kjd.O(tk7):yk7");
    }

    public static String P(int i2) {
        return rf0.f(i2, "ProfileItemId(value=", ")");
    }

    public static boolean Q(to1 to1) {
        if (Looper.myLooper() == null) {
            r7e r7e = bf4.c;
            if (((ThreadLocal) r7e.getValue()) != null) {
                ThreadLocal threadLocal = (ThreadLocal) r7e.getValue();
                bf4 bf4 = new bf4(threadLocal);
                Looper looper = bf4.b;
                try {
                    to1.invoke(bf4);
                    if (hhd.f(looper.getThread(), Thread.currentThread())) {
                        threadLocal.remove();
                        return true;
                    }
                    throw new IllegalStateException("Illegal thread".toString());
                } catch (Throwable th) {
                    if (hhd.f(looper.getThread(), Thread.currentThread())) {
                        bf4.a.remove();
                        throw th;
                    }
                    throw new IllegalStateException("Illegal thread".toString());
                }
            }
        }
        return false;
    }

    public static int R(int i2, byte[] bArr) {
        int i3;
        synchronized (n) {
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
                    int[] iArr = o;
                    if (iArr.length <= i5) {
                        o = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    o[i5] = i4;
                    i4 += 3;
                    i5++;
                }
            }
            i3 = i2 - i5;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = o[i8] - i7;
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

    public static final void S(View view, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if ((marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0) != i2) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams2.bottomMargin = i2;
            view.setLayoutParams(marginLayoutParams2);
        }
    }

    public static final void T(View view, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if ((marginLayoutParams != null ? marginLayoutParams.topMargin : 0) != i2) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams2.topMargin = i2;
            view.setLayoutParams(marginLayoutParams2);
        }
    }

    public static final void U(ViewGroup viewGroup, boolean z) {
        int i2 = z ? 0 : 4;
        if (viewGroup.getVisibility() != i2) {
            viewGroup.setVisibility(i2);
        }
    }

    public static final void V(bve bve) {
        bve.e(zpe.class, new vrd(7));
        bve.e(ewe.class, new vrd(8));
        bve.e(aqe.class, new vrd(9));
        bve.e(h6e.class, new vrd(10));
        bve.e(n6e.class, new vrd(11));
        bve.e(gm6.class, new vrd(12));
        bve.e(cm6.class, new vrd(13));
        bve.e(j5e.class, new vrd(14));
        bve.e(xr0.class, new vrd(15));
        bve.e(ile.class, new w8d(11));
        bve.c(pf4.class, new w8d(10));
    }

    public static void W(int i2) {
        boolean z = true;
        if (!(i2 == 100 || i2 == 102 || i2 == 104)) {
            if (i2 == 105) {
                i2 = 105;
            } else {
                z = false;
            }
        }
        a24.i(z, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i2));
    }

    public static String X(int i2) {
        if (i2 == 100) {
            return "HIGH_ACCURACY";
        }
        if (i2 == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i2 == 104) {
            return "LOW_POWER";
        }
        if (i2 == 105) {
            return "PASSIVE";
        }
        throw new IllegalArgumentException();
    }

    public static void c(vx5 vx5, int i2, FrgBase frgBase, String str) {
        vx5.getClass();
        hd0 hd0 = new hd0(vx5);
        hd0.f(i2, frgBase, str, 1);
        hd0.d(false);
    }

    public static final bs d(Object... objArr) {
        bs bsVar = new bs(objArr.length);
        for (Object add : objArr) {
            bsVar.add(add);
        }
        return bsVar;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Integer[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Integer[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Integer[], java.io.Serializable] */
    public static final Bundle e(Collection collection) {
        Bundle bundle = new Bundle((collection.size() * 5) + 1);
        bundle.putInt("size", collection.size());
        int[] iArr = new int[collection.size()];
        ? r2 = new Integer[collection.size()];
        ? r3 = new Integer[collection.size()];
        ? r4 = new Integer[collection.size()];
        int i2 = 0;
        for (Object next : collection) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                pq3 pq3 = (pq3) next;
                iArr[i2] = pq3.a;
                bundle.putParcelable(wn6.h(i2, "text_"), pq3.b);
                r2[i2] = pq3.c;
                r3[i2] = pq3.d;
                r4[i2] = pq3.e;
                i2 = i3;
            } else {
                p23.G();
                throw null;
            }
        }
        bundle.putIntArray("ids", iArr);
        bundle.putSerializable("textColors", r2);
        bundle.putSerializable("icons", r3);
        bundle.putSerializable("iconColors", r4);
        return bundle;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: kcc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: kcc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: kcc} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List f(android.os.Bundle r15) {
        /*
            java.lang.String r0 = "size"
            int r0 = r15.getInt(r0)     // Catch:{ all -> 0x0076 }
            java.lang.String r1 = "ids"
            int[] r1 = r15.getIntArray(r1)     // Catch:{ all -> 0x0076 }
            java.lang.String r2 = "Required value was null."
            if (r1 == 0) goto L_0x0082
            java.lang.String r3 = "textColors"
            java.io.Serializable r3 = r15.getSerializable(r3)     // Catch:{ all -> 0x0076 }
            java.lang.Integer[] r3 = (java.lang.Integer[]) r3     // Catch:{ all -> 0x0076 }
            java.lang.String r4 = "icons"
            java.io.Serializable r4 = r15.getSerializable(r4)     // Catch:{ all -> 0x0076 }
            java.lang.Integer[] r4 = (java.lang.Integer[]) r4     // Catch:{ all -> 0x0076 }
            java.lang.String r5 = "iconColors"
            java.io.Serializable r5 = r15.getSerializable(r5)     // Catch:{ all -> 0x0076 }
            java.lang.Integer[] r5 = (java.lang.Integer[]) r5     // Catch:{ all -> 0x0076 }
            r6 = 0
            fz6 r0 = defpackage.gwf.S(r6, r0)     // Catch:{ all -> 0x0076 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0076 }
            r7 = 10
            int r7 = defpackage.q23.H(r0, r7)     // Catch:{ all -> 0x0076 }
            r6.<init>(r7)     // Catch:{ all -> 0x0076 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0076 }
        L_0x003c:
            r7 = r0
            ez6 r7 = (defpackage.ez6) r7     // Catch:{ all -> 0x0076 }
            boolean r7 = r7.c     // Catch:{ all -> 0x0076 }
            if (r7 == 0) goto L_0x0091
            r7 = r0
            ez6 r7 = (defpackage.ez6) r7     // Catch:{ all -> 0x0076 }
            int r7 = r7.a()     // Catch:{ all -> 0x0076 }
            pq3 r14 = new pq3     // Catch:{ all -> 0x0076 }
            r9 = r1[r7]     // Catch:{ all -> 0x0076 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0076 }
            r8.<init>()     // Catch:{ all -> 0x0076 }
            java.lang.String r10 = "text_"
            r8.append(r10)     // Catch:{ all -> 0x0076 }
            r8.append(r7)     // Catch:{ all -> 0x0076 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0076 }
            android.os.Parcelable r8 = r15.getParcelable(r8)     // Catch:{ all -> 0x0076 }
            if (r8 == 0) goto L_0x0078
            r10 = r8
            mge r10 = (mge) r10     // Catch:{ all -> 0x0076 }
            r11 = r3[r7]     // Catch:{ all -> 0x0076 }
            r12 = r4[r7]     // Catch:{ all -> 0x0076 }
            r13 = r5[r7]     // Catch:{ all -> 0x0076 }
            r8 = r14
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0076 }
            r6.add(r14)     // Catch:{ all -> 0x0076 }
            goto L_0x003c
        L_0x0076:
            r15 = move-exception
            goto L_0x008c
        L_0x0078:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0076 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0076 }
            r15.<init>(r0)     // Catch:{ all -> 0x0076 }
            throw r15     // Catch:{ all -> 0x0076 }
        L_0x0082:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0076 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0076 }
            r15.<init>(r0)     // Catch:{ all -> 0x0076 }
            throw r15     // Catch:{ all -> 0x0076 }
        L_0x008c:
            kcc r6 = new kcc
            r6.<init>(r15)
        L_0x0091:
            java.lang.Throwable r15 = defpackage.mcc.a(r6)
            if (r15 == 0) goto L_0x009a
            r15.printStackTrace()
        L_0x009a:
            boolean r15 = r6 instanceof defpackage.kcc
            if (r15 == 0) goto L_0x009f
            r6 = 0
        L_0x009f:
            java.util.List r6 = (java.util.List) r6
            if (r6 != 0) goto L_0x00a5
            hw4 r6 = defpackage.hw4.a
        L_0x00a5:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kjd.f(android.os.Bundle):java.util.List");
    }

    public static au0 g(pda pda, u0a u0a, s0a s0a, boolean z) {
        if (z) {
            int ordinal = u0a.ordinal();
            if (ordinal == 0) {
                int ordinal2 = s0a.ordinal();
                if (ordinal2 == 0) {
                    pda.b().a.getClass();
                    pda.c().a.getClass();
                    return new au0(-16751924, -16745729);
                } else if (ordinal2 == 1) {
                    return new au0(pda.c().a.a, Integer.valueOf(pda.b().a.e));
                } else if (ordinal2 == 2) {
                    return new au0(pda.c().a.b, Integer.valueOf(pda.b().a.f));
                } else if (ordinal2 == 3) {
                    return new au0(pda.c().a.d, Integer.valueOf(pda.b().a.j));
                } else if (ordinal2 == 4) {
                    pda.b().a.getClass();
                    pda.c().a.getClass();
                    return new au0(-1907998, -1);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (ordinal == 1) {
                return new au0(pda.c().a.c, Integer.valueOf(pda.b().a.g));
            } else if (ordinal == 2 || ordinal == 3) {
                return new au0(pda.c().a.f, (Integer) null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            int ordinal3 = u0a.ordinal();
            if (ordinal3 == 0) {
                int ordinal4 = s0a.ordinal();
                if (ordinal4 == 0) {
                    return new au0(pda.c().a.r, Integer.valueOf(pda.c().a.r));
                } else if (ordinal4 == 1) {
                    return new au0(pda.c().a.j, Integer.valueOf(pda.c().a.j));
                } else if (ordinal4 == 2) {
                    return new au0(pda.c().a.k, Integer.valueOf(pda.c().a.k));
                } else if (ordinal4 == 3) {
                    return new au0(pda.c().a.n, Integer.valueOf(pda.c().a.n));
                } else if (ordinal4 == 4) {
                    return new au0(pda.c().a.i, Integer.valueOf(pda.c().a.i));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (ordinal3 == 1) {
                return new au0(pda.c().a.l, Integer.valueOf(pda.c().a.l));
            } else if (ordinal3 == 2 || ordinal3 == 3) {
                return new au0(pda.c().a.f, (Integer) null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0041 A[SYNTHETIC, Splitter:B:21:0x0041] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0052 A[SYNTHETIC, Splitter:B:32:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x006a A[Catch:{ Exception -> 0x0134 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0080 A[Catch:{ Exception -> 0x0134 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0085 A[Catch:{ Exception -> 0x0134 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x008e A[Catch:{ all -> 0x0099 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0092 A[Catch:{ all -> 0x0099 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0095 A[Catch:{ all -> 0x0099 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x009b A[SYNTHETIC, Splitter:B:65:0x009b] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00a2 A[Catch:{ Exception -> 0x0134 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00cf A[Catch:{ Exception -> 0x0134 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00d0 A[Catch:{ Exception -> 0x0134 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.CharSequence h(java.lang.CharSequence r9, android.widget.TextView r10, int r11) {
        /*
            if (r9 == 0) goto L_0x013c
            boolean r0 = defpackage.h0e.c0(r9)
            if (r0 == 0) goto L_0x000a
            goto L_0x013c
        L_0x000a:
            r0 = 1
            if (r11 > 0) goto L_0x0016
            android.text.TextUtils$TruncateAt r11 = android.text.TextUtils.TruncateAt.END
            r10.setEllipsize(r11)
            r10.setMaxLines(r0)
            return r9
        L_0x0016:
            r1 = 0
            r10.setEllipsize(r1)     // Catch:{ Exception -> 0x0134 }
            int r2 = r9.length()     // Catch:{ Exception -> 0x0134 }
            int r2 = r2 - r0
            int r3 = r9.length()     // Catch:{ Exception -> 0x0134 }
            java.lang.CharSequence r2 = r9.subSequence(r2, r3)     // Catch:{ Exception -> 0x0134 }
            int r3 = r2.length()     // Catch:{ Exception -> 0x0134 }
            r4 = 0
            boolean r5 = r2 instanceof android.text.Spanned     // Catch:{ all -> 0x003e }
            if (r5 == 0) goto L_0x0034
            r5 = r2
            android.text.Spanned r5 = (android.text.Spanned) r5     // Catch:{ all -> 0x003e }
            goto L_0x0035
        L_0x0034:
            r5 = r1
        L_0x0035:
            if (r5 == 0) goto L_0x003e
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            java.lang.Object[] r3 = r5.getSpans(r4, r3, r6)     // Catch:{ all -> 0x003e }
            goto L_0x003f
        L_0x003e:
            r3 = r1
        L_0x003f:
            if (r3 != 0) goto L_0x0043
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0134 }
        L_0x0043:
            int r3 = r3.length     // Catch:{ Exception -> 0x0134 }
            if (r3 != 0) goto L_0x0048
            r3 = r0
            goto L_0x0049
        L_0x0048:
            r3 = r4
        L_0x0049:
            r3 = r3 ^ r0
            if (r3 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r2 = r1
        L_0x004e:
            java.lang.Class<android.text.style.ImageSpan> r3 = android.text.style.ImageSpan.class
            if (r2 == 0) goto L_0x0071
            int r5 = r2.length()     // Catch:{ Exception -> 0x0134 }
            boolean r6 = r2 instanceof android.text.Spanned     // Catch:{ all -> 0x0065 }
            if (r6 == 0) goto L_0x005d
            android.text.Spanned r2 = (android.text.Spanned) r2     // Catch:{ all -> 0x0065 }
            goto L_0x005e
        L_0x005d:
            r2 = r1
        L_0x005e:
            if (r2 == 0) goto L_0x0065
            java.lang.Object[] r2 = r2.getSpans(r4, r5, r3)     // Catch:{ all -> 0x0065 }
            goto L_0x0066
        L_0x0065:
            r2 = r1
        L_0x0066:
            android.text.style.ImageSpan[] r2 = (android.text.style.ImageSpan[]) r2     // Catch:{ Exception -> 0x0134 }
            if (r2 == 0) goto L_0x0071
            java.lang.Object r2 = defpackage.cs.Y(r2)     // Catch:{ Exception -> 0x0134 }
            android.text.style.ImageSpan r2 = (android.text.style.ImageSpan) r2     // Catch:{ Exception -> 0x0134 }
            goto L_0x0072
        L_0x0071:
            r2 = r1
        L_0x0072:
            if (r2 == 0) goto L_0x0085
            android.graphics.drawable.Drawable r5 = r2.getDrawable()     // Catch:{ Exception -> 0x0134 }
            if (r5 == 0) goto L_0x0085
            android.graphics.Rect r5 = r5.getBounds()     // Catch:{ Exception -> 0x0134 }
            if (r5 == 0) goto L_0x0085
            int r5 = r5.width()     // Catch:{ Exception -> 0x0134 }
            goto L_0x0086
        L_0x0085:
            r5 = r4
        L_0x0086:
            int r6 = r9.length()     // Catch:{ Exception -> 0x0134 }
            boolean r7 = r9 instanceof android.text.Spanned     // Catch:{ all -> 0x0099 }
            if (r7 == 0) goto L_0x0092
            r7 = r9
            android.text.Spanned r7 = (android.text.Spanned) r7     // Catch:{ all -> 0x0099 }
            goto L_0x0093
        L_0x0092:
            r7 = r1
        L_0x0093:
            if (r7 == 0) goto L_0x0099
            java.lang.Object[] r1 = r7.getSpans(r4, r6, r3)     // Catch:{ all -> 0x0099 }
        L_0x0099:
            if (r1 != 0) goto L_0x009d
            android.text.style.ImageSpan[] r1 = new android.text.style.ImageSpan[r4]     // Catch:{ Exception -> 0x0134 }
        L_0x009d:
            int r3 = r1.length     // Catch:{ Exception -> 0x0134 }
            r6 = r4
            r7 = r6
        L_0x00a0:
            if (r6 >= r3) goto L_0x00bc
            r8 = r1[r6]     // Catch:{ Exception -> 0x0134 }
            android.text.style.ImageSpan r8 = (android.text.style.ImageSpan) r8     // Catch:{ Exception -> 0x0134 }
            android.graphics.drawable.Drawable r8 = r8.getDrawable()     // Catch:{ Exception -> 0x0134 }
            if (r8 == 0) goto L_0x00b7
            android.graphics.Rect r8 = r8.getBounds()     // Catch:{ Exception -> 0x0134 }
            if (r8 == 0) goto L_0x00b7
            int r8 = r8.width()     // Catch:{ Exception -> 0x0134 }
            goto L_0x00b8
        L_0x00b7:
            r8 = r4
        L_0x00b8:
            int r7 = r7 + r8
            int r6 = r6 + 1
            goto L_0x00a0
        L_0x00bc:
            android.text.TextPaint r1 = r10.getPaint()     // Catch:{ Exception -> 0x0134 }
            java.lang.String r3 = r9.toString()     // Catch:{ Exception -> 0x0134 }
            float r1 = r1.measureText(r3)     // Catch:{ Exception -> 0x0134 }
            float r3 = (float) r7     // Catch:{ Exception -> 0x0134 }
            float r1 = r1 + r3
            float r3 = (float) r11     // Catch:{ Exception -> 0x0134 }
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x00d0
            return r9
        L_0x00d0:
            int r1 = r9.length()     // Catch:{ Exception -> 0x0134 }
            android.text.TextPaint r3 = r10.getPaint()     // Catch:{ Exception -> 0x0134 }
            android.text.StaticLayout$Builder r1 = android.text.StaticLayout.Builder.obtain(r9, r4, r1, r3, r11)     // Catch:{ Exception -> 0x0134 }
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL     // Catch:{ Exception -> 0x0134 }
            android.text.StaticLayout$Builder r1 = r1.setAlignment(r3)     // Catch:{ Exception -> 0x0134 }
            android.text.StaticLayout$Builder r1 = r1.setIncludePad(r4)     // Catch:{ Exception -> 0x0134 }
            android.text.StaticLayout$Builder r1 = r1.setMaxLines(r0)     // Catch:{ Exception -> 0x0134 }
            android.text.StaticLayout$Builder r1 = r1.setBreakStrategy(r4)     // Catch:{ Exception -> 0x0134 }
            android.text.StaticLayout$Builder r1 = r1.setHyphenationFrequency(r4)     // Catch:{ Exception -> 0x0134 }
            int r11 = r11 - r5
            android.text.StaticLayout$Builder r11 = r1.setEllipsizedWidth(r11)     // Catch:{ Exception -> 0x0134 }
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.END     // Catch:{ Exception -> 0x0134 }
            android.text.StaticLayout$Builder r11 = r11.setEllipsize(r1)     // Catch:{ Exception -> 0x0134 }
            android.text.StaticLayout r11 = r11.build()     // Catch:{ Exception -> 0x0134 }
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder     // Catch:{ Exception -> 0x0134 }
            java.lang.CharSequence r3 = r11.getText()     // Catch:{ Exception -> 0x0134 }
            r1.<init>(r3)     // Catch:{ Exception -> 0x0134 }
            int r3 = r11.getLineStart(r4)     // Catch:{ Exception -> 0x0134 }
            int r11 = r11.getLineEnd(r4)     // Catch:{ Exception -> 0x0134 }
            r1.subSequence(r3, r11)     // Catch:{ Exception -> 0x0134 }
            defpackage.h0e.B0(r1)     // Catch:{ Exception -> 0x0134 }
            boolean r11 = r1.equals(r9)     // Catch:{ Exception -> 0x0134 }
            if (r11 != 0) goto L_0x0133
            if (r2 == 0) goto L_0x0133
            java.lang.String r11 = " "
            r1.append(r11)     // Catch:{ Exception -> 0x0134 }
            int r11 = r1.length()     // Catch:{ Exception -> 0x0134 }
            int r11 = r11 - r0
            int r3 = r1.length()     // Catch:{ Exception -> 0x0134 }
            r4 = 18
            r1.setSpan(r2, r11, r3, r4)     // Catch:{ Exception -> 0x0134 }
        L_0x0133:
            return r1
        L_0x0134:
            android.text.TextUtils$TruncateAt r11 = android.text.TextUtils.TruncateAt.END
            r10.setEllipsize(r11)
            r10.setMaxLines(r0)
        L_0x013c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kjd.h(java.lang.CharSequence, android.widget.TextView, int):java.lang.CharSequence");
    }

    public static float i(v0a v0a) {
        float f2;
        float f3;
        int ordinal = v0a.ordinal();
        if (ordinal == 0) {
            f2 = dh4.c().getDisplayMetrics().density;
            f3 = 10.0f;
        } else if (ordinal == 1) {
            f2 = dh4.c().getDisplayMetrics().density;
            f3 = 12.0f;
        } else if (ordinal == 2) {
            f2 = dh4.c().getDisplayMetrics().density;
            f3 = 16.0f;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return f2 * f3;
    }

    public static final void j(View view, Rect rect, float f2) {
        view.setClipToOutline(true);
        view.setOutlineProvider(new ogc(rect, f2));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: osf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: psf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: osf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: osf} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void k(android.app.Activity r6, boolean r7) {
        /*
            android.view.Window r0 = r6.getWindow()
            android.view.View r0 = r0.getDecorView()
            s59 r1 = defpackage.km4.y0
            km4 r1 = r1.n(r6)
            pda r1 = r1.g()
            c33 r1 = r1.g()
            c33 r2 = c33.b
            r3 = 1
            r4 = 0
            if (r1 != r2) goto L_0x001e
            r1 = r3
            goto L_0x001f
        L_0x001e:
            r1 = r4
        L_0x001f:
            android.view.Window r2 = r6.getWindow()
            if (r7 == 0) goto L_0x0029
            r5 = -15263716(0xffffffffff17181c, float:-2.0083861E38)
            goto L_0x002a
        L_0x0029:
            r5 = r4
        L_0x002a:
            r2.setNavigationBarColor(r5)
            android.view.Window r6 = r6.getWindow()
            mod r2 = new mod
            r2.<init>((android.view.View) r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 30
            if (r0 < r5) goto L_0x0048
            psf r0 = new psf
            android.view.WindowInsetsController r5 = r6.getInsetsController()
            r0.<init>(r5, r2)
            r0.l = r6
            goto L_0x004d
        L_0x0048:
            osf r0 = new osf
            r0.<init>(r6, r2)
        L_0x004d:
            if (r7 == 0) goto L_0x0051
        L_0x004f:
            r3 = r4
            goto L_0x0053
        L_0x0051:
            if (r1 != 0) goto L_0x004f
        L_0x0053:
            r0.G(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kjd.k(android.app.Activity, boolean):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: osf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: psf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: osf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: osf} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void l(android.app.Activity r6, boolean r7) {
        /*
            android.view.Window r0 = r6.getWindow()
            android.view.View r0 = r0.getDecorView()
            s59 r1 = defpackage.km4.y0
            km4 r1 = r1.n(r6)
            pda r1 = r1.g()
            c33 r1 = r1.g()
            c33 r2 = c33.b
            r3 = 1
            r4 = 0
            if (r1 != r2) goto L_0x001e
            r1 = r3
            goto L_0x001f
        L_0x001e:
            r1 = r4
        L_0x001f:
            android.view.Window r6 = r6.getWindow()
            mod r2 = new mod
            r2.<init>((android.view.View) r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 30
            if (r0 < r5) goto L_0x003a
            psf r0 = new psf
            android.view.WindowInsetsController r5 = r6.getInsetsController()
            r0.<init>(r5, r2)
            r0.l = r6
            goto L_0x003f
        L_0x003a:
            osf r0 = new osf
            r0.<init>(r6, r2)
        L_0x003f:
            if (r7 == 0) goto L_0x0043
        L_0x0041:
            r3 = r4
            goto L_0x0045
        L_0x0043:
            if (r1 != 0) goto L_0x0041
        L_0x0045:
            r0.H(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kjd.l(android.app.Activity, boolean):void");
    }

    public static int m(int i2, int i3) {
        long j2 = ((long) i2) + ((long) i3);
        int i4 = (int) j2;
        if (j2 == ((long) i4)) {
            return i4;
        }
        throw new ArithmeticException(rf0.g("overflow: checkedAdd(", i2, ", ", i3, ")"));
    }

    public static void n(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static tkc o(Bundle bundle, Bundle bundle2) {
        if (bundle != null) {
            bundle.setClassLoader(tkc.class.getClassLoader());
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state".toString());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                linkedHashMap.put((String) parcelableArrayList.get(i2), parcelableArrayList2.get(i2));
            }
            return new tkc(linkedHashMap);
        } else if (bundle2 == null) {
            return new tkc();
        } else {
            HashMap hashMap = new HashMap();
            for (String next : bundle2.keySet()) {
                hashMap.put(next, bundle2.get(next));
            }
            return new tkc(hashMap);
        }
    }

    public static final boolean p(int i2, int i3) {
        return i2 == i3;
    }

    public static int q(byte[] bArr, int i2, int i3, boolean[] zArr) {
        int i4 = i3 - i2;
        boolean z = false;
        swb.h(i4 >= 0);
        if (i4 == 0) {
            return i3;
        }
        if (zArr[0]) {
            n(zArr);
            return i2 - 3;
        } else if (i4 > 1 && zArr[1] && bArr[i2] == 1) {
            n(zArr);
            return i2 - 2;
        } else if (i4 <= 2 || !zArr[2] || bArr[i2] != 0 || bArr[i2 + 1] != 1) {
            int i5 = i3 - 1;
            int i6 = i2 + 2;
            while (i6 < i5) {
                byte b2 = bArr[i6];
                if ((b2 & 254) == 0) {
                    int i7 = i6 - 2;
                    if (bArr[i7] == 0 && bArr[i6 - 1] == 0 && b2 == 1) {
                        n(zArr);
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
            n(zArr);
            return i2 - 1;
        }
    }

    public static final ju3 r(Executor executor) {
        ju3 ju3;
        ni4 ni4 = executor instanceof ni4 ? (ni4) executor : null;
        return (ni4 == null || (ju3 = ni4.a) == null) ? new s15(executor) : ju3;
    }

    public static final String s(Collection collection) {
        ArrayList arrayList = new ArrayList(q23.H(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((r72) it.next()).name());
        }
        return new JSONArray(arrayList).toString();
    }

    public static final Map t(byte[] bArr) {
        if (bArr == null) {
            return iw4.a;
        }
        gt5 gt5 = new gt5(0);
        gr8.mergeFrom(gt5, bArr);
        EnumMap enumMap = new EnumMap(r72.class);
        long[] jArr = (long[]) gt5.b;
        if (!(!(jArr.length == 0))) {
            return enumMap;
        }
        enumMap.put(r72.E0, jArr);
        return enumMap;
    }

    public static final Set u(byte[] bArr) {
        if (bArr == null) {
            return qw4.a;
        }
        gt5 gt5 = new gt5(1);
        gr8.mergeFrom(gt5, bArr);
        return z3d.r(gt5);
    }

    public static final List v(byte[] bArr) {
        if (bArr == null) {
            return hw4.a;
        }
        gt5 gt5 = new gt5(2);
        gr8.mergeFrom(gt5, bArr);
        return z3d.s(gt5);
    }

    public static final HashSet w(String str) {
        HashSet hashSet = new HashSet();
        try {
            for (String add : h0e.q0(str, new String[]{","}, false, 6)) {
                hashSet.add(add);
            }
        } catch (Throwable th) {
            udd.s("WorkersQueue/TagsTypeConverter", "fail to convert string to tags", th);
        }
        return hashSet;
    }

    public static wx1 x(byte[] bArr) {
        byte b2 = bArr[0];
        if (b2 == Byte.MAX_VALUE || b2 == 100 || b2 == 64 || b2 == 113) {
            return new wx1(bArr, bArr.length, 2, (byte) 0);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        byte b3 = copyOf[0];
        if (b3 == -2 || b3 == -1 || b3 == 37 || b3 == -14 || b3 == -24) {
            for (int i2 = 0; i2 < copyOf.length - 1; i2 += 2) {
                byte b4 = copyOf[i2];
                int i3 = i2 + 1;
                copyOf[i2] = copyOf[i3];
                copyOf[i3] = b4;
            }
        }
        wx1 wx1 = new wx1(copyOf, copyOf.length, 2, (byte) 0);
        if (copyOf[0] == 31) {
            wx1 wx12 = new wx1(copyOf, copyOf.length, 2, (byte) 0);
            while (wx12.b() >= 16) {
                wx12.t(2);
                int i4 = wx12.i(14) & 16383;
                int min = Math.min(8 - wx1.d, 14);
                int i5 = wx1.d;
                int i6 = (8 - i5) - min;
                byte[] bArr2 = wx1.b;
                int i7 = wx1.c;
                byte b5 = (byte) (((65280 >> i5) | ((1 << i6) - 1)) & bArr2[i7]);
                bArr2[i7] = b5;
                int i8 = 14 - min;
                bArr2[i7] = (byte) (b5 | ((i4 >>> i8) << i6));
                int i9 = i7 + 1;
                while (i8 > 8) {
                    wx1.b[i9] = (byte) (i4 >>> (i8 - 8));
                    i8 -= 8;
                    i9++;
                }
                int i10 = 8 - i8;
                byte[] bArr3 = wx1.b;
                byte b6 = (byte) (bArr3[i9] & ((1 << i10) - 1));
                bArr3[i9] = b6;
                bArr3[i9] = (byte) (((i4 & ((1 << i8) - 1)) << i10) | b6);
                wx1.t(14);
                wx1.a();
            }
        }
        wx1.o(copyOf.length, copyOf);
        return wx1;
    }

    public static final PointF y(Context context) {
        ync C = udd.C(context);
        int X = C.b - a24.X(((float) 118) * dh4.c().getDisplayMetrics().density);
        float f2 = (float) 16;
        return new PointF((float) me4.p(f2, dh4.c().getDisplayMetrics().density, X), (float) (me4.p(f2, dh4.c().getDisplayMetrics().density, C.a - a24.X(((float) 174) * dh4.c().getDisplayMetrics().density)) - C.d));
    }

    public static final int z(bs bsVar, Object obj, int i2) {
        int i3 = bsVar.c;
        if (i3 == 0) {
            return -1;
        }
        try {
            int h2 = e07.h(i3, i2, bsVar.a);
            if (h2 < 0 || hhd.f(obj, bsVar.b[h2])) {
                return h2;
            }
            int i4 = h2 + 1;
            while (i4 < i3 && bsVar.a[i4] == i2) {
                if (hhd.f(obj, bsVar.b[i4])) {
                    return i4;
                }
                i4++;
            }
            int i5 = h2 - 1;
            while (i5 >= 0 && bsVar.a[i5] == i2) {
                if (hhd.f(obj, bsVar.b[i5])) {
                    return i5;
                }
                i5--;
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public float a(View view, ViewGroup viewGroup) {
        return view.getTranslationX();
    }

    public final float b(View view, ViewGroup viewGroup) {
        switch (this.a) {
            case 0:
                return view.getTranslationY() - ((float) viewGroup.getHeight());
            default:
                return view.getTranslationY() + ((float) viewGroup.getHeight());
        }
    }
}
