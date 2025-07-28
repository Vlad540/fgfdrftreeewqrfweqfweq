package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.a;
import java.io.Closeable;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import ru.ok.messages.views.dialogs.FrgDlgPermissions;

/* renamed from: urd  reason: default package */
public abstract class urd {
    public static boolean a;
    public static final kk9 b = new Object();
    public static final String[] c = {"android.permission.READ_CONTACTS", "android.permission.GET_ACCOUNTS"};
    public static final String[] d = {"android.permission.READ_CONTACTS"};
    public static final String[] e = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
    public static final String[] f = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"};
    public static final String[] g = {"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"};
    public static SharedPreferences h;
    public static final /* synthetic */ int i = 0;

    public static void A(Context context, String[] strArr, int[] iArr) {
        if (Arrays.equals(strArr, c)) {
            SharedPreferences.Editor edit = u(context).edit();
            for (int i2 = 0; i2 < strArr.length; i2++) {
                edit.putBoolean(strArr[i2], iArr[i2] == 0);
            }
            edit.commit();
        }
    }

    public static final void B(k26 k26, View view) {
        Object obj;
        Object tag = view.getTag(wqb.oneme_theme_attach_listener);
        if ((tag instanceof View.OnAttachStateChangeListener ? (View.OnAttachStateChangeListener) tag : null) != null) {
            try {
                obj = view.getResources().getResourceName(view.getId());
            } catch (Throwable th) {
                obj = new kcc(th);
            }
            if (mcc.a(obj) != null) {
                obj = view.getClass().getName();
            }
            udd.T("ViewThemeUtils", "try to observe onThemeChanged more than once for " + ((String) obj), new Object[0]);
            return;
        }
        gcf gcf = new gcf(k26, view);
        view.setTag(wqb.oneme_theme_attach_listener, gcf);
        if (view.isAttachedToWindow()) {
            gcf.onViewAttachedToWindow(view);
        }
        view.addOnAttachStateChangeListener(gcf);
    }

    public static wib C(byte[] bArr) {
        int s;
        yze yze = new yze(bArr);
        if (yze.c < 32) {
            return null;
        }
        yze.H(0);
        if (yze.h() != yze.c() + 4 || yze.h() != 1886614376 || (s = rx.s(yze.h())) > 1) {
            return null;
        }
        UUID uuid = new UUID(yze.p(), yze.p());
        if (s == 1) {
            yze.I(yze.y() * 16);
        }
        int y = yze.y();
        if (y != yze.c()) {
            return null;
        }
        byte[] bArr2 = new byte[y];
        yze.g(0, bArr2, y);
        return new wib(uuid, s, bArr2);
    }

    public static byte[] D(UUID uuid, byte[] bArr) {
        wib C = C(bArr);
        if (C == null) {
            return null;
        }
        UUID uuid2 = C.a;
        if (uuid.equals(uuid2)) {
            return C.c;
        }
        String valueOf = String.valueOf(uuid);
        new StringBuilder(String.valueOf(uuid2).length() + valueOf.length() + 33);
        return null;
    }

    public static void E(int i2, int i3, int i4, int i5, nv4 nv4) {
        int i6;
        int i7;
        if (i4 > i5) {
            i6 = (int) ((((float) i5) / ((float) i4)) * ((float) i2));
            i7 = i2;
        } else {
            i7 = (int) ((((float) i4) / ((float) i5)) * ((float) i3));
            i6 = i3;
        }
        nv4.b = i2;
        nv4.c = i3;
        nv4.d = i7;
        nv4.e = i6;
    }

    public static long H(yze yze, int i2, int i3) {
        yze.H(i2);
        if (yze.c() < 5) {
            return -9223372036854775807L;
        }
        int h2 = yze.h();
        if ((8388608 & h2) != 0 || ((2096896 & h2) >> 8) != i3 || (h2 & 32) == 0 || yze.v() < 7 || yze.c() < 7 || (yze.v() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        yze.g(0, bArr, 6);
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[4]) & 255) >> 7);
    }

    public static void I(a aVar, String[] strArr, int i2) {
        try {
            aVar.requestPermissions(strArr, i2);
            L(u(aVar.e0()), strArr);
        } catch (Exception e2) {
            q0a q0a = at7.y0;
            if (q0a == null) {
                q0a = null;
            }
            q0a.getClass();
            udd.s("urd", "Can't request permission", e2);
        }
    }

    public static void J(uw6 uw6, String str, int i2, int i3, boolean z) {
        if (uw6.b.equals(str)) {
            List list = uw6.a;
            if (((yt0) ((fu0) list.get(i2)).get(i3)).w0 != z) {
                yt0 yt0 = (yt0) ((fu0) list.get(i2)).get(i3);
                vt0 vt0 = new vt0(yt0.a, yt0.b, yt0.c);
                vt0.d = yt0.o;
                vt0.e = yt0.X;
                vt0.h = yt0.Z;
                vt0.f = yt0.Y;
                vt0.g = z;
                ((fu0) list.get(i2)).set(i3, new yt0(vt0));
            }
        }
    }

    public static void K(m00 m00, long j, long j2, boolean z) {
        boolean K = ete.K(m00);
        if ((m00.d != null || K) && !z && j2 != 0) {
            if (j2 - j <= 3000) {
                j = 0;
            }
            if (K) {
                k10 a2 = m00.b().d.d.a();
                a2.j = j;
                a2.b = (long) ((int) j2);
                a2.f = false;
                n10 n10 = new n10(a2);
                m00 j3 = m00.b().d.j();
                j3.d = n10;
                o10 a3 = j3.a();
                u00 a4 = m00.b().a();
                a4.e = a3;
                m00.r = new v00(a4);
                return;
            }
            k10 a5 = m00.c().a();
            a5.j = j;
            a5.b = (long) ((int) j2);
            a5.f = false;
            m00.d = new n10(a5);
        }
    }

    public static void L(SharedPreferences sharedPreferences, String[] strArr) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (String str : strArr) {
            edit.putBoolean(str + "_req", true);
        }
        edit.apply();
    }

    public static final rf1 M(bgd bgd) {
        return new rf1(bgd.a, bgd.b, bgd.c, bgd.d, bgd.e, bgd.f);
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [e10, java.lang.Object] */
    public static void N(p10 p10, String str, of3 of3) {
        for (int i2 = 0; i2 < p10.b(); i2++) {
            o10 d2 = p10.d(i2);
            if (ete.w(str, d2.q)) {
                m00 j = d2.j();
                of3.accept(j);
                p10.e(i2, j.a());
                return;
            }
            if (d2.g()) {
                f10 f10 = d2.g;
                if (f10.a()) {
                    o10 o10 = f10.g;
                    if (ete.w(str, o10.q)) {
                        m00 j2 = o10.j();
                        of3.accept(j2);
                        ? obj = new Object();
                        obj.a = f10.a;
                        obj.b = f10.b;
                        obj.c = f10.c;
                        obj.d = f10.d;
                        obj.e = f10.e;
                        obj.f = f10.f;
                        obj.g = o10;
                        obj.h = f10.h;
                        obj.g = j2.a();
                        m00 j3 = d2.j();
                        j3.g = new f10(obj);
                        p10.e(i2, j3.a());
                        return;
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public static void O(m00 m00, g10 g10, long j) {
        m00.i = g10;
        if (g10.b()) {
            m00.j = j;
        }
        if (g10 == g10.a) {
            m00.k = 0.0f;
        }
    }

    /* JADX WARNING: type inference failed for: r1v19, types: [p00, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void P(vo8 r22, p10 r23, defpackage.jj7 r24) {
        /*
            r0 = r23
            r1 = r24
            java.lang.Object r2 = r1.b
            vw6 r2 = (vw6) r2
            r0.b = r2
            boolean r2 = r22.o()
            if (r2 == 0) goto L_0x0011
            return
        L_0x0011:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            p10 r3 = r24.I()
            r5 = 0
        L_0x001b:
            int r6 = r24.v()
            if (r5 >= r6) goto L_0x0287
            o10 r6 = r1.u(r5)
            r7 = 0
        L_0x0026:
            int r8 = r23.b()
            if (r7 >= r8) goto L_0x0271
            o10 r8 = r0.d(r7)
            java.lang.String r9 = r8.q
            boolean r9 = r2.contains(r9)
            if (r9 == 0) goto L_0x003e
        L_0x0038:
            r16 = r2
            r17 = r3
            goto L_0x0265
        L_0x003e:
            j10 r9 = r6.a
            j10 r10 = r8.a
            if (r9 == r10) goto L_0x0045
            goto L_0x0038
        L_0x0045:
            boolean r9 = r8.f()
            q00 r10 = r8.k
            v00 r11 = r8.j
            n10 r12 = r8.d
            l00 r13 = r8.e
            a10 r14 = r8.b
            q00 r15 = r6.k
            v00 r4 = r6.j
            n10 r1 = r6.d
            l00 r0 = r6.e
            r16 = r2
            a10 r2 = r6.b
            if (r9 == 0) goto L_0x007f
            boolean r9 = r6.f()
            if (r9 == 0) goto L_0x007f
            r17 = r10
            long r9 = r14.w0
            r18 = r14
            r19 = r15
            long r14 = r2.w0
            int r9 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r9 == 0) goto L_0x0076
            goto L_0x0085
        L_0x0076:
            r9 = r17
            r10 = r19
            r17 = r3
            r19 = r4
            goto L_0x00dd
        L_0x007f:
            r17 = r10
            r18 = r14
            r19 = r15
        L_0x0085:
            boolean r9 = r8.a()
            if (r9 == 0) goto L_0x0099
            boolean r9 = r6.a()
            if (r9 == 0) goto L_0x0099
            long r9 = r13.a
            long r14 = r0.a
            int r9 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r9 == 0) goto L_0x0076
        L_0x0099:
            boolean r9 = r8.i()
            if (r9 == 0) goto L_0x00ad
            boolean r9 = r6.i()
            if (r9 == 0) goto L_0x00ad
            long r9 = r12.a
            long r14 = r1.a
            int r9 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r9 == 0) goto L_0x0076
        L_0x00ad:
            boolean r9 = r8.c()
            if (r9 == 0) goto L_0x00c1
            boolean r9 = r6.c()
            if (r9 == 0) goto L_0x00c1
            long r9 = r11.a
            long r14 = r4.a
            int r9 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r9 == 0) goto L_0x0076
        L_0x00c1:
            boolean r9 = r8.b()
            if (r9 == 0) goto L_0x00e0
            boolean r9 = r6.b()
            if (r9 == 0) goto L_0x00e0
            r9 = r17
            long r14 = r9.b
            r17 = r3
            r10 = r19
            r19 = r4
            long r3 = r10.b
            int r3 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x00e8
        L_0x00dd:
            r3 = r18
            goto L_0x0108
        L_0x00e0:
            r9 = r17
            r10 = r19
            r17 = r3
            r19 = r4
        L_0x00e8:
            boolean r3 = r8.f()
            if (r3 == 0) goto L_0x0265
            boolean r3 = r6.f()
            if (r3 != 0) goto L_0x00f6
            goto L_0x0265
        L_0x00f6:
            r3 = r18
            long r14 = r3.w0
            r20 = 0
            int r4 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r4 != 0) goto L_0x0265
            long r14 = r2.w0
            int r4 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r4 == 0) goto L_0x0265
            if (r5 != r7) goto L_0x0265
        L_0x0108:
            boolean r4 = r6.f()
            if (r4 != 0) goto L_0x012c
            boolean r4 = r6.a()
            if (r4 != 0) goto L_0x012c
            boolean r4 = r6.i()
            if (r4 != 0) goto L_0x012c
            boolean r4 = r6.c()
            if (r4 != 0) goto L_0x012c
            boolean r4 = r6.b()
            if (r4 != 0) goto L_0x012c
            boolean r4 = r6.e()
            if (r4 == 0) goto L_0x0262
        L_0x012c:
            m00 r4 = r6.j()
            java.lang.String r7 = r8.r
            r4.m = r7
            java.lang.String r7 = r8.q
            r4.l = r7
            g10 r7 = r8.n
            r4.i = r7
            long r14 = r8.t
            r4.o = r14
            long r14 = r8.u
            r4.p = r14
            long r14 = r8.v
            r4.u = r14
            long r14 = r8.o
            r4.j = r14
            c10 r7 = r8.w
            r4.w = r7
            boolean r7 = r8.x
            if (r7 == 0) goto L_0x015a
            boolean r7 = r6.y
            if (r7 == 0) goto L_0x015a
            r7 = 1
            goto L_0x015b
        L_0x015a:
            r7 = 0
        L_0x015b:
            r4.x = r7
            boolean r7 = r6.i()
            if (r7 == 0) goto L_0x018e
            boolean r7 = r1.g
            if (r7 != 0) goto L_0x018e
            k10 r1 = r1.a()
            long r14 = r12.k
            r1.j = r14
            int r7 = r12.e
            r1.d = r7
            int r7 = r12.f
            r1.e = r7
            m10 r7 = r12.l
            r1.k = r7
            boolean r7 = r12.o
            r1.n = r7
            int r7 = r12.p
            r1.o = r7
            int r7 = r12.q
            r1.p = r7
            n10 r7 = new n10
            r7.<init>(r1)
            r4.d = r7
        L_0x018e:
            boolean r1 = defpackage.ete.L(r6)
            if (r1 == 0) goto L_0x01e2
            boolean r1 = defpackage.ete.L(r8)
            if (r1 == 0) goto L_0x01e2
            o10 r1 = r11.d
            n10 r1 = r1.d
            r7 = r19
            o10 r11 = r7.d
            n10 r11 = r11.d
            k10 r11 = r11.a()
            long r14 = r1.k
            r11.j = r14
            int r12 = r1.e
            r11.d = r12
            int r12 = r1.f
            r11.e = r12
            m10 r12 = r1.l
            r11.k = r12
            boolean r12 = r1.o
            r11.n = r12
            int r12 = r1.p
            r11.o = r12
            int r1 = r1.q
            r11.p = r1
            n10 r1 = new n10
            r1.<init>(r11)
            o10 r11 = r7.d
            m00 r11 = r11.j()
            r11.d = r1
            o10 r1 = r11.a()
            u00 r7 = r7.a()
            r7.e = r1
            v00 r1 = new v00
            r1.<init>(r7)
            r4.r = r1
        L_0x01e2:
            boolean r1 = r6.b()
            if (r1 == 0) goto L_0x0218
            p00 r1 = new p00
            r1.<init>()
            java.lang.String r7 = r10.a
            r1.a = r7
            long r11 = r10.b
            r1.b = r11
            java.lang.String r7 = r10.c
            r1.c = r7
            java.lang.String r7 = r10.f
            r1.f = r7
            java.lang.String r7 = r10.g
            r1.g = r7
            java.lang.String r7 = r10.h
            r1.h = r7
            java.lang.String r7 = r10.d
            r1.d = r7
            java.lang.String r7 = r10.e
            r1.e = r7
            java.lang.String r7 = r9.h
            r1.h = r7
            q00 r7 = new q00
            r7.<init>(r1)
            r4.s = r7
        L_0x0218:
            boolean r1 = r6.f()
            if (r1 == 0) goto L_0x022d
            z00 r1 = r2.b()
            java.lang.String r2 = r3.y0
            r1.j = r2
            a10 r2 = new a10
            r2.<init>(r1)
            r4.b = r2
        L_0x022d:
            boolean r1 = r6.e()
            if (r1 == 0) goto L_0x0245
            x00 r1 = r6.m
            w00 r1 = r1.a()
            x00 r2 = r8.m
            y00 r2 = r2.i
            r1.i = r2
            x00 r1 = r1.a()
            r4.v = r1
        L_0x0245:
            boolean r1 = r6.a()
            if (r1 == 0) goto L_0x025e
            k00 r0 = r0.a()
            long r1 = r13.g
            r0.g = r1
            long r1 = r13.h
            r0.h = r1
            l00 r1 = new l00
            r1.<init>(r0)
            r4.e = r1
        L_0x025e:
            o10 r6 = r4.a()
        L_0x0262:
            r0 = r17
            goto L_0x0274
        L_0x0265:
            int r7 = r7 + 1
            r0 = r23
            r1 = r24
            r2 = r16
            r3 = r17
            goto L_0x0026
        L_0x0271:
            r16 = r2
            r0 = r3
        L_0x0274:
            r0.e(r5, r6)
            java.lang.String r1 = r6.q
            r2 = r16
            r2.add(r1)
            int r5 = r5 + 1
            r1 = r24
            r3 = r0
            r0 = r23
            goto L_0x001b
        L_0x0287:
            r0 = r3
            jj7 r0 = r0.c()
            java.lang.Object r0 = r0.a
            java.util.List r0 = (java.util.List) r0
            r1 = r23
            r1.a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.urd.P(vo8, p10, jj7):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        if (r7[r3] != 0) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        r2 = r2 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean Q(java.lang.String[] r6, int[] r7, java.lang.String[] r8) {
        /*
            int r0 = r8.length
            r1 = 0
            r2 = r1
        L_0x0003:
            r3 = 1
            if (r2 >= r0) goto L_0x0026
            r4 = r8[r2]
            int r5 = r6.length
            if (r5 < r3) goto L_0x0025
            int r5 = r7.length
            if (r5 >= r3) goto L_0x000f
            goto L_0x0025
        L_0x000f:
            r3 = r1
        L_0x0010:
            int r5 = r6.length
            if (r3 >= r5) goto L_0x0025
            r5 = r6[r3]
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x0022
            r3 = r7[r3]
            if (r3 != 0) goto L_0x0025
            int r2 = r2 + 1
            goto L_0x0003
        L_0x0022:
            int r3 = r3 + 1
            goto L_0x0010
        L_0x0025:
            return r1
        L_0x0026:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.urd.Q(java.lang.String[], int[], java.lang.String[]):boolean");
    }

    public static boolean R(r5 r5Var, a aVar, String[] strArr, int[] iArr, String[] strArr2, int i2, int i3) {
        boolean z;
        if (Q(strArr, iArr, strArr2)) {
            udd.p("urd", "all permissions granted", new Object[0]);
            return true;
        }
        int length = strArr2.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                z = false;
                break;
            }
            String str = strArr2[i4];
            int i5 = Build.VERSION.SDK_INT;
            if ((i5 >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? i5 >= 32 ? b8.a(r5Var, str) : i5 == 31 ? a8.b(r5Var, str) : z7.c(r5Var, str) : false) {
                z = true;
                break;
            }
            i4++;
        }
        if (z) {
            udd.p("urd", "some permissions denied", new Object[0]);
            a06.H(0, r5Var, r5Var.getString(i3));
        } else {
            FrgDlgPermissions o1 = FrgDlgPermissions.o1((String[]) null, FrgDlgPermissions.K1, i2, FrgDlgPermissions.L1, true);
            if (aVar != null) {
                o1.l1(aVar.d0(), "ru.ok.messages.views.dialogs.FrgDlgPermissions");
            } else {
                o1.l1(r5Var.P(), "ru.ok.messages.views.dialogs.FrgDlgPermissions");
            }
            udd.p("urd", "some permissions denied forever", new Object[0]);
        }
        return false;
    }

    public static boolean S(a aVar, String[] strArr, int[] iArr, String[] strArr2, int i2, int i3) {
        r5 c0 = aVar.c0();
        return c0 != null && R(c0, aVar, strArr, iArr, strArr2, i2, i3);
    }

    public static Object T(i26 i26, Object obj, Continuation continuation) {
        hu3 context = continuation.getContext();
        Object hcc = context == bw4.a ? new hcc(continuation) : new er3(context, continuation);
        ete.g(2, i26);
        return i26.invoke(obj, hcc);
    }

    public static final void a(OutputStream outputStream, String str) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            outputStream.write(str.charAt(i2));
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, Object obj, int i2, int i3) {
        for (Object obj2 : spannableStringBuilder.getSpans(i2, i3, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i2 && spannableStringBuilder.getSpanEnd(obj2) == i3 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i2, i3, 33);
    }

    public static byte[] e(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (!(bArr == null || bArr.length == 0)) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: wr0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: wr0} */
    /* JADX WARNING: type inference failed for: r13v5, types: [wr0, java.lang.Object, tld] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void f(long r21, defpackage.wr0 r23, int r24, java.util.ArrayList r25, int r26, int r27, java.util.ArrayList r28) {
        /*
            r0 = r23
            r1 = r24
            r10 = r25
            r2 = r26
            r11 = r27
            r12 = r28
            r3 = 0
            r4 = 1
            if (r2 >= r11) goto L_0x0012
            r5 = r4
            goto L_0x0013
        L_0x0012:
            r5 = r3
        L_0x0013:
            java.lang.String r6 = "Failed requirement."
            if (r5 == 0) goto L_0x01ca
            r5 = r2
        L_0x0018:
            if (r5 >= r11) goto L_0x0033
            java.lang.Object r7 = r10.get(r5)
            uu0 r7 = (defpackage.uu0) r7
            int r7 = r7.c()
            if (r7 < r1) goto L_0x0029
            int r5 = r5 + 1
            goto L_0x0018
        L_0x0029:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r6.toString()
            r0.<init>(r1)
            throw r0
        L_0x0033:
            java.lang.Object r5 = r25.get(r26)
            uu0 r5 = (defpackage.uu0) r5
            int r6 = r11 + -1
            java.lang.Object r6 = r10.get(r6)
            uu0 r6 = (defpackage.uu0) r6
            int r7 = r5.c()
            r13 = -1
            if (r1 != r7) goto L_0x0061
            java.lang.Object r5 = r12.get(r2)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            int r2 = r2 + 1
            java.lang.Object r7 = r10.get(r2)
            uu0 r7 = (defpackage.uu0) r7
            r20 = r7
            r7 = r2
            r2 = r5
            r5 = r20
            goto L_0x0063
        L_0x0061:
            r7 = r2
            r2 = r13
        L_0x0063:
            byte r8 = r5.f(r1)
            byte r9 = r6.f(r1)
            r14 = 4
            r15 = 2
            if (r8 == r9) goto L_0x013c
            int r3 = r7 + 1
        L_0x0071:
            if (r3 >= r11) goto L_0x0090
            int r5 = r3 + -1
            java.lang.Object r5 = r10.get(r5)
            uu0 r5 = (defpackage.uu0) r5
            byte r5 = r5.f(r1)
            java.lang.Object r6 = r10.get(r3)
            uu0 r6 = (defpackage.uu0) r6
            byte r6 = r6.f(r1)
            if (r5 == r6) goto L_0x008d
            int r4 = r4 + 1
        L_0x008d:
            int r3 = r3 + 1
            goto L_0x0071
        L_0x0090:
            long r5 = r0.b
            long r8 = (long) r14
            long r5 = r5 / r8
            long r5 = r5 + r21
            long r14 = (long) r15
            long r5 = r5 + r14
            int r3 = r4 * 2
            long r14 = (long) r3
            long r14 = r14 + r5
            r0.x0(r4)
            r0.x0(r2)
            r2 = r7
        L_0x00a3:
            if (r2 >= r11) goto L_0x00c7
            java.lang.Object r3 = r10.get(r2)
            uu0 r3 = (defpackage.uu0) r3
            byte r3 = r3.f(r1)
            if (r2 == r7) goto L_0x00bf
            int r4 = r2 + -1
            java.lang.Object r4 = r10.get(r4)
            uu0 r4 = (defpackage.uu0) r4
            byte r4 = r4.f(r1)
            if (r3 == r4) goto L_0x00c4
        L_0x00bf:
            r3 = r3 & 255(0xff, float:3.57E-43)
            r0.x0(r3)
        L_0x00c4:
            int r2 = r2 + 1
            goto L_0x00a3
        L_0x00c7:
            wr0 r6 = new wr0
            r6.<init>()
        L_0x00cc:
            if (r7 >= r11) goto L_0x0136
            java.lang.Object r2 = r10.get(r7)
            uu0 r2 = (defpackage.uu0) r2
            byte r2 = r2.f(r1)
            int r3 = r7 + 1
            r4 = r3
        L_0x00db:
            if (r4 >= r11) goto L_0x00ee
            java.lang.Object r5 = r10.get(r4)
            uu0 r5 = (defpackage.uu0) r5
            byte r5 = r5.f(r1)
            if (r2 == r5) goto L_0x00eb
            r5 = r4
            goto L_0x00ef
        L_0x00eb:
            int r4 = r4 + 1
            goto L_0x00db
        L_0x00ee:
            r5 = r11
        L_0x00ef:
            if (r3 != r5) goto L_0x0112
            int r2 = r1 + 1
            java.lang.Object r3 = r10.get(r7)
            uu0 r3 = (defpackage.uu0) r3
            int r3 = r3.c()
            if (r2 != r3) goto L_0x0112
            java.lang.Object r2 = r12.get(r7)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r0.x0(r2)
            r17 = r5
            r13 = r6
            r18 = r8
            goto L_0x012f
        L_0x0112:
            long r2 = r6.b
            long r2 = r2 / r8
            long r2 = r2 + r14
            int r2 = (int) r2
            int r2 = r2 * r13
            r0.x0(r2)
            int r16 = r1 + 1
            r2 = r14
            r4 = r6
            r17 = r5
            r5 = r16
            r13 = r6
            r6 = r25
            r18 = r8
            r8 = r17
            r9 = r28
            f(r2, r4, r5, r6, r7, r8, r9)
        L_0x012f:
            r6 = r13
            r7 = r17
            r8 = r18
            r13 = -1
            goto L_0x00cc
        L_0x0136:
            r13 = r6
            r0.t0(r13)
            goto L_0x01c9
        L_0x013c:
            int r4 = r5.c()
            int r8 = r6.c()
            int r4 = java.lang.Math.min(r4, r8)
            r8 = r1
        L_0x0149:
            if (r8 >= r4) goto L_0x015a
            byte r9 = r5.f(r8)
            byte r13 = r6.f(r8)
            if (r9 != r13) goto L_0x015a
            int r3 = r3 + 1
            int r8 = r8 + 1
            goto L_0x0149
        L_0x015a:
            long r8 = r0.b
            long r13 = (long) r14
            long r8 = r8 / r13
            long r8 = r8 + r21
            r17 = r13
            long r13 = (long) r15
            long r8 = r8 + r13
            long r13 = (long) r3
            long r8 = r8 + r13
            r13 = 1
            long r8 = r8 + r13
            int r4 = -r3
            r0.x0(r4)
            r0.x0(r2)
            int r4 = r1 + r3
        L_0x0172:
            if (r1 >= r4) goto L_0x0180
            byte r2 = r5.f(r1)
            r2 = r2 & 255(0xff, float:3.57E-43)
            r0.x0(r2)
            int r1 = r1 + 1
            goto L_0x0172
        L_0x0180:
            int r1 = r7 + 1
            if (r1 != r11) goto L_0x01aa
            java.lang.Object r1 = r10.get(r7)
            uu0 r1 = (defpackage.uu0) r1
            int r1 = r1.c()
            if (r4 != r1) goto L_0x019e
            java.lang.Object r1 = r12.get(r7)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r0.x0(r1)
            goto L_0x01c9
        L_0x019e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01aa:
            wr0 r13 = new wr0
            r13.<init>()
            long r1 = r13.b
            long r1 = r1 / r17
            long r1 = r1 + r8
            int r1 = (int) r1
            r2 = -1
            int r1 = r1 * r2
            r0.x0(r1)
            r1 = r8
            r3 = r13
            r5 = r25
            r6 = r7
            r7 = r27
            r8 = r28
            f(r1, r3, r4, r5, r6, r7, r8)
            r0.t0(r13)
        L_0x01c9:
            return
        L_0x01ca:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r6.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.urd.f(long, wr0, int, java.util.ArrayList, int, int, java.util.ArrayList):void");
    }

    public static boolean j(Context context, String[] strArr) {
        for (String d2 : strArr) {
            if (d8.d(context, d2) != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(Context context) {
        if (j(context, v())) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return j(context, new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED"});
        }
        return false;
    }

    public static final void l(Closeable closeable, Throwable th) {
        if (closeable == null) {
            return;
        }
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            jjd.d(th, th2);
        }
    }

    public static int m(x6c x6c, o57 o57, View view, View view2, androidx.recyclerview.widget.a aVar, boolean z) {
        if (aVar.w() == 0 || x6c.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(androidx.recyclerview.widget.a.M(view) - androidx.recyclerview.widget.a.M(view2)) + 1;
        }
        return Math.min(o57.n(), o57.c(view2) - o57.f(view));
    }

    public static int n(x6c x6c, o57 o57, View view, View view2, androidx.recyclerview.widget.a aVar, boolean z, boolean z2) {
        if (aVar.w() == 0 || x6c.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (x6c.b() - Math.max(androidx.recyclerview.widget.a.M(view), androidx.recyclerview.widget.a.M(view2))) - 1) : Math.max(0, Math.min(androidx.recyclerview.widget.a.M(view), androidx.recyclerview.widget.a.M(view2)));
        if (!z) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(o57.c(view2) - o57.f(view))) / ((float) (Math.abs(androidx.recyclerview.widget.a.M(view) - androidx.recyclerview.widget.a.M(view2)) + 1)))) + ((float) (o57.m() - o57.f(view))));
    }

    public static int o(x6c x6c, o57 o57, View view, View view2, androidx.recyclerview.widget.a aVar, boolean z) {
        if (aVar.w() == 0 || x6c.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return x6c.b();
        }
        return (int) ((((float) (o57.c(view2) - o57.f(view))) / ((float) (Math.abs(androidx.recyclerview.widget.a.M(view) - androidx.recyclerview.widget.a.M(view2)) + 1))) * ((float) x6c.b()));
    }

    public static Continuation p(i26 i26, Object obj, Continuation continuation) {
        if (i26 instanceof bh0) {
            return ((bh0) i26).n(obj, continuation);
        }
        hu3 context = continuation.getContext();
        return context == bw4.a ? new f07(i26, obj, continuation) : new g07(continuation, context, i26, obj);
    }

    public static synchronized void q() {
        synchronized (urd.class) {
            if (!a) {
                kjd.D("static-webp");
                a = true;
            }
        }
    }

    public static fu3 r(fu3 fu3, gu3 gu3) {
        if (hhd.f(fu3.getKey(), gu3)) {
            return fu3;
        }
        return null;
    }

    public static Drawable t(Context context, TypedArray typedArray, int i2) {
        int resourceId = typedArray.getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        return context.getDrawable(resourceId);
    }

    public static SharedPreferences u(Context context) {
        if (h == null) {
            h = context.getSharedPreferences("permissions_prefs", 0);
        }
        return h;
    }

    public static String[] v() {
        if (Build.VERSION.SDK_INT >= 33) {
            return g;
        }
        knc.a.getClass();
        return jnc.c;
    }

    public static pgc w(z66 z66) {
        if (z66.p == null) {
            z66.p = new pgc();
        }
        return z66.p;
    }

    public static fja x(TypedArray typedArray, int i2) {
        switch (typedArray.getInt(i2, -2)) {
            case -1:
                return null;
            case 0:
                return jlc.m;
            case 1:
                return jlc.l;
            case 2:
                return jlc.j;
            case 3:
                return jlc.k;
            case 4:
                return jlc.f;
            case 5:
                return jlc.h;
            case 6:
                return jlc.g;
            case 7:
                return jlc.n;
            case 8:
                return jlc.i;
            default:
                throw new RuntimeException("XML attribute not specified!");
        }
    }

    public static Continuation y(Continuation continuation) {
        er3 er3 = continuation instanceof er3 ? (er3) continuation : null;
        if (er3 != null && (continuation = er3.c) == null) {
            fr3 fr3 = (fr3) er3.getContext().get(cqc.c);
            if (fr3 == null || (continuation = fr3.interceptContinuation(er3)) == null) {
                continuation = er3;
            }
            er3.c = continuation;
        }
        return continuation;
    }

    public static hu3 z(fu3 fu3, gu3 gu3) {
        return hhd.f(fu3.getKey(), gu3) ? bw4.a : fu3;
    }

    public abstract void F(j1 j1Var, j1 j1Var2);

    public abstract void G(j1 j1Var, Thread thread);

    public abstract boolean c(Object obj, Object obj2);

    public abstract boolean d(Object obj, Object obj2);

    public abstract boolean g(l1 l1Var, w0 w0Var, w0 w0Var2);

    public abstract boolean h(l1 l1Var, Object obj, Object obj2);

    public abstract boolean i(l1 l1Var, j1 j1Var, j1 j1Var2);

    public Object s(Object obj, Object obj2) {
        return null;
    }
}
