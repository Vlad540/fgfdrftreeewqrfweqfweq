package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.NoCopySpan;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: mt0  reason: default package */
public abstract class mt0 {
    public static final int[] a = {16842755, 16843041, 16843093, 16843097, 16843551, 16843754, 16843771, 16843778, 16843779};
    public static final int[] b = {16842755, 16843189, 16843190, 16843556, 16843557, 16843558, 16843866, 16843867};
    public static final int[] c = {16842755, 16843780, 16843781, 16843782, 16843783, 16843784, 16843785, 16843786, 16843787, 16843788, 16843789, 16843979, 16843980, 16844062};
    public static final int[] d = {16842755, 16843781, 16844062};
    public static final int[] e = {16843161};
    public static final int[] f = {16842755, 16843213};
    public static final char[] g = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final int[] h = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};
    public static m1g i;

    public static final void A(Editable editable, int i2, int i3, boolean z, uu7 uu7) {
        Class<?> cls = uu7.getClass();
        String obj = editable.toString();
        List<uu7> g0 = cs.g0(editable.getSpans(i2, i3, cls));
        for (uu7 uu72 : g0) {
            if (editable.getSpanStart(uu72) <= i2 && editable.getSpanEnd(uu72) >= i3) {
                B(editable, uu72, i2, i3);
                return;
            }
        }
        if (!z) {
            for (int i4 = i2; i4 < i3; i4++) {
                if (!iu7.G(obj.charAt(i4))) {
                    for (uu7 uu73 : g0) {
                        int spanStart = editable.getSpanStart(uu73);
                        if (i4 > editable.getSpanEnd(uu73) || spanStart > i4) {
                        }
                    }
                }
            }
            for (uu7 B : g0) {
                B(editable, B, i2, i3);
            }
            return;
        }
        pa2.L(editable, uu7, i2, i3);
    }

    public static final void B(Spannable spannable, qt3 qt3, int i2, int i3) {
        int spanStart = spannable.getSpanStart(qt3);
        if (spanStart != -1) {
            int spanEnd = spannable.getSpanEnd(qt3);
            if (spanStart < i2 || spanEnd > i3) {
                int spanFlags = spannable.getSpanFlags(qt3);
                spannable.removeSpan(qt3);
                if (spanStart < i2) {
                    spannable.setSpan(qt3.copy(), spanStart, i2, spanFlags);
                }
                if (spanEnd > i3) {
                    spannable.setSpan(qt3.copy(), i3, spanEnd, spanFlags);
                    return;
                }
                return;
            }
            spannable.removeSpan(qt3);
        }
    }

    public static final void C(Spannable spannable, Class cls, int i2, int i3) {
        try {
            for (Object removeSpan : spannable.getSpans(i2, i3, cls)) {
                spannable.removeSpan(removeSpan);
            }
        } catch (Throwable unused) {
        }
    }

    public static String D(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        if (str2 == null) {
            str2 = BuildConfig.FLAVOR;
        }
        int[] q = q(str2);
        if (q[0] != -1) {
            sb.append(str2);
            z(q[1], q[2], sb);
            return sb.toString();
        }
        int[] q2 = q(str);
        if (q[3] == 0) {
            sb.append(str, 0, q2[3]);
            sb.append(str2);
            return sb.toString();
        } else if (q[2] == 0) {
            sb.append(str, 0, q2[2]);
            sb.append(str2);
            return sb.toString();
        } else {
            int i2 = q[1];
            if (i2 != 0) {
                int i3 = q2[0] + 1;
                sb.append(str, 0, i3);
                sb.append(str2);
                return z(q[1] + i3, i3 + q[2], sb);
            } else if (str2.charAt(i2) == '/') {
                sb.append(str, 0, q2[1]);
                sb.append(str2);
                int i4 = q2[1];
                return z(i4, q[2] + i4, sb);
            } else {
                int i5 = q2[0] + 2;
                int i6 = q2[1];
                if (i5 >= i6 || i6 != q2[2]) {
                    int lastIndexOf = str.lastIndexOf(47, q2[2] - 1);
                    int i7 = lastIndexOf == -1 ? q2[1] : lastIndexOf + 1;
                    sb.append(str, 0, i7);
                    sb.append(str2);
                    return z(q2[1], i7 + q[2], sb);
                }
                sb.append(str, 0, i6);
                sb.append('/');
                sb.append(str2);
                int i8 = q2[1];
                return z(i8, q[2] + i8 + 1, sb);
            }
        }
    }

    public static Uri E(String str, String str2) {
        return Uri.parse(D(str, str2));
    }

    public static CharSequence F(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        try {
            if (charSequence instanceof bmd) {
                return (SpannableString) charSequence;
            }
            int i2 = bmd.a;
            return oa2.F(charSequence, true);
        } catch (Throwable th) {
            udd.s("Markdown", "fail to make safeCopy of " + charSequence, th);
            return charSequence;
        }
    }

    public static final void I(Field field, s16 s16) {
        field.set((Object) null, new v97(new h83(3, s16)));
    }

    public static void L(wx1 wx1) {
        wx1.t(3);
        wx1.t(8);
        boolean h2 = wx1.h();
        boolean h3 = wx1.h();
        if (h2) {
            wx1.t(5);
        }
        if (h3) {
            wx1.t(6);
        }
    }

    public static void M(wx1 wx1) {
        int i2;
        int i3 = wx1.i(2);
        int i4 = 6;
        if (i3 == 0) {
            wx1.t(6);
            return;
        }
        int i5 = 5;
        int x = x(wx1, 5, 8, 16) + 1;
        if (i3 == 1) {
            wx1.t(x * 7);
        } else if (i3 == 2) {
            boolean h2 = wx1.h();
            int i6 = h2 ? 1 : 5;
            if (h2) {
                i5 = 7;
            }
            if (h2) {
                i4 = 8;
            }
            int i7 = 0;
            while (i7 < x) {
                if (wx1.h()) {
                    wx1.t(7);
                    i2 = 0;
                } else {
                    if (wx1.i(2) == 3 && wx1.i(i5) * i6 != 0) {
                        wx1.s();
                    }
                    i2 = wx1.i(i4) * i6;
                    if (!(i2 == 0 || i2 == 180)) {
                        wx1.s();
                    }
                    wx1.s();
                }
                if (!(i2 == 0 || i2 == 180 || !wx1.h())) {
                    i7++;
                }
                i7++;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, dld] */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, dld] */
    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.Object, dld] */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x012e, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0130, code lost:
        r2 = r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.dld N(defpackage.g75 r21, boolean r22, boolean r23) {
        /*
            r0 = r21
            r1 = r23
            r2 = 1
            long r3 = r21.x()
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r8 = 4096(0x1000, double:2.0237E-320)
            if (r7 == 0) goto L_0x0017
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            r8 = r3
        L_0x0017:
            int r8 = (int) r8
            ija r9 = new ija
            r10 = 64
            r9.<init>((int) r10)
            r10 = 0
            r11 = r10
            r12 = r11
        L_0x0022:
            if (r11 >= r8) goto L_0x0031
            r14 = 8
            r9.D(r14)
            byte[] r15 = r9.a
            boolean r15 = r0.r(r15, r10, r14, r2)
            if (r15 != 0) goto L_0x0034
        L_0x0031:
            r4 = r10
            goto L_0x0130
        L_0x0034:
            long r15 = r9.w()
            int r13 = r9.g()
            r17 = 1
            int r17 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r17 != 0) goto L_0x0055
            byte[] r15 = r9.a
            r0.m(r14, r15, r14)
            r15 = 16
            r9.F(r15)
            long r17 = r9.o()
            r5 = r17
            r17 = r3
            goto L_0x0070
        L_0x0055:
            r17 = 0
            int r17 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r17 != 0) goto L_0x006c
            long r17 = r21.x()
            int r19 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
            if (r19 == 0) goto L_0x006c
            long r15 = r21.s()
            long r17 = r17 - r15
            long r5 = (long) r14
            long r15 = r17 + r5
        L_0x006c:
            r17 = r3
            r5 = r15
            r15 = r14
        L_0x0070:
            long r2 = (long) r15
            int r4 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x007b
            kk9 r0 = new kk9
            r0.<init>()
            return r0
        L_0x007b:
            int r11 = r11 + r15
            r4 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r13 != r4) goto L_0x0095
            int r2 = (int) r5
            int r8 = r8 + r2
            if (r7 == 0) goto L_0x0092
            long r2 = (long) r8
            int r2 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r2 <= 0) goto L_0x0092
            r2 = r17
            int r8 = (int) r2
        L_0x008d:
            r3 = r2
            r2 = 1
        L_0x008f:
            r5 = -1
            goto L_0x0022
        L_0x0092:
            r2 = r17
            goto L_0x008d
        L_0x0095:
            r4 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r13 == r4) goto L_0x009f
            r4 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r13 != r4) goto L_0x00a2
        L_0x009f:
            r5 = 1
            goto L_0x012e
        L_0x00a2:
            r4 = 1835295092(0x6d646174, float:4.4175247E27)
            if (r13 != r4) goto L_0x00a8
            r12 = 1
        L_0x00a8:
            long r14 = (long) r11
            long r14 = r14 + r5
            long r14 = r14 - r2
            r20 = r11
            long r10 = (long) r8
            int r10 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r10 < 0) goto L_0x00b5
            r2 = 0
            goto L_0x0131
        L_0x00b5:
            long r5 = r5 - r2
            int r2 = (int) r5
            int r11 = r20 + r2
            r3 = 1718909296(0x66747970, float:2.8862439E23)
            if (r13 != r3) goto L_0x0121
            r3 = 8
            if (r2 >= r3) goto L_0x00c8
            kk9 r0 = new kk9
            r0.<init>()
            return r0
        L_0x00c8:
            r9.D(r2)
            byte[] r3 = r9.a
            r4 = 0
            r0.m(r4, r3, r2)
            int r2 = r9.g()
            boolean r2 = u(r2, r1)
            if (r2 == 0) goto L_0x00dc
            r12 = 1
        L_0x00dc:
            r2 = 4
            r9.H(r2)
            int r3 = r9.a()
            int r3 = r3 / r2
            if (r12 != 0) goto L_0x0102
            if (r3 <= 0) goto L_0x0102
            int[] r13 = new int[r3]
            r2 = r4
        L_0x00ec:
            if (r2 >= r3) goto L_0x0100
            int r5 = r9.g()
            r13[r2] = r5
            boolean r5 = u(r5, r1)
            if (r5 == 0) goto L_0x00fd
            r5 = 1
            r12 = 1
            goto L_0x0104
        L_0x00fd:
            r5 = 1
            int r2 = r2 + r5
            goto L_0x00ec
        L_0x0100:
            r5 = 1
            goto L_0x0104
        L_0x0102:
            r5 = 1
            r13 = 0
        L_0x0104:
            if (r12 != 0) goto L_0x0128
            lk9 r0 = new lk9
            r0.<init>()
            if (r13 == 0) goto L_0x011e
            int r1 = defpackage.rs6.c
            int r1 = r13.length
            if (r1 != 0) goto L_0x0113
            goto L_0x0120
        L_0x0113:
            rs6 r1 = new rs6
            int r2 = r13.length
            int[] r2 = java.util.Arrays.copyOf(r13, r2)
            r1.<init>(r2)
            goto L_0x0120
        L_0x011e:
            int r1 = defpackage.rs6.c
        L_0x0120:
            return r0
        L_0x0121:
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0128
            r0.t(r2)
        L_0x0128:
            r10 = r4
            r2 = r5
            r3 = r17
            goto L_0x008f
        L_0x012e:
            r2 = r5
            goto L_0x0131
        L_0x0130:
            r2 = r4
        L_0x0131:
            if (r12 != 0) goto L_0x0136
            gf6 r0 = defpackage.gf6.X
            return r0
        L_0x0136:
            r0 = r22
            if (r0 == r2) goto L_0x0142
            if (r2 == 0) goto L_0x013f
            smc r0 = smc.o
            goto L_0x0141
        L_0x013f:
            smc r0 = smc.X
        L_0x0141:
            return r0
        L_0x0142:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mt0.N(g75, boolean, boolean):dld");
    }

    public static void O(String str, s16 s16) {
        sda sda = new sda(s16);
        sda.setDaemon(true);
        if (str != null) {
            sda.setName(str);
        }
        sda.start();
    }

    public static final long P(int i2, eq4 eq4) {
        if (eq4.compareTo(eq4.SECONDS) > 0) {
            return Q((long) i2, eq4);
        }
        return i(eq4.NANOSECONDS.a.convert((long) i2, eq4.a));
    }

    public static final long Q(long j, eq4 eq4) {
        eq4 eq42 = eq4.NANOSECONDS;
        long convert = eq4.a.convert(4611686018426999999L, eq42.a);
        int i2 = ((-convert) > j ? 1 : ((-convert) == j ? 0 : -1));
        TimeUnit timeUnit = eq4.a;
        return (i2 > 0 || j > convert) ? g(gwf.k(eq4.MILLISECONDS.a.convert(j, timeUnit), -4611686018427387903L, 4611686018427387903L)) : i(eq42.a.convert(j, timeUnit));
    }

    public static final void R(bve bve) {
        bve.c(z24.class, new w8d(0));
        bve.c(pf4.class, new w8d(1));
    }

    public static final void S(bve bve) {
        bve.c(z24.class, new w8d(8));
    }

    public static final void a(lg7 lg7, View view, boolean z) {
        float f2 = 1.0f;
        float f3 = 0.0f;
        float f4 = z ? 0.0f : 1.0f;
        if (!z) {
            f2 = 0.0f;
        }
        float f5 = z ? -(dh4.c().getDisplayMetrics().density * 50.0f) : 0.0f;
        if (!z) {
            f3 = -(dh4.c().getDisplayMetrics().density * 50.0f);
        }
        view.setTranslationY(f5);
        lg7.add(ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{f4, f2}));
        lg7.add(ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{f5, f3}));
    }

    public static final void b(int i2, int i3, int i4, int i5, View view, View view2) {
        if (view != null) {
            view.post(new a93(view2, i2, i3, i4, i5, view, 0));
        }
    }

    public static final ObjectAnimator c(View view, boolean z, float f2, float f3, long j) {
        view.setAlpha(f2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{f2, f3});
        ofFloat.setStartDelay(z ? j - 50 : 0);
        ofFloat.setDuration(50);
        return ofFloat;
    }

    public static qwa d(Context context, float f2, float f3, int i2, int i3, ewa ewa) {
        ync C = udd.C(context);
        float f4 = (float) 16;
        return new qwa((-f2) + ((float) a24.X(dh4.c().getDisplayMetrics().density * f4)), ((((float) C.b) - f2) - ((float) i2)) - ((float) a24.X(dh4.c().getDisplayMetrics().density * f4)), (-f3) + ((float) a24.X(dh4.c().getDisplayMetrics().density * f4)) + ((float) C.c) + ((float) ewa.a), (((((float) (C.a - C.d)) - f3) - ((float) i3)) - ((float) a24.X(f4 * dh4.c().getDisplayMetrics().density))) - ((float) ewa.b));
    }

    public static xz3 e(jac jac, String str, mxb mxb, int i2) {
        wz3 wz3 = new wz3(0);
        wz3.b = E(str, mxb.c);
        wz3.g = mxb.a;
        wz3.h = mxb.b;
        String a2 = jac.a();
        if (a2 == null) {
            a2 = mxb.b(((gj0) jac.b.get(0)).a).toString();
        }
        wz3.e(a2);
        wz3.c(i2);
        return wz3.a();
    }

    public static final void f(Spannable spannable, boolean z) {
        Object[] objArr;
        int spanStart;
        int spanEnd;
        int length;
        try {
            objArr = spannable.getSpans(0, spannable.length(), Object.class);
        } catch (Throwable unused) {
            objArr = null;
        }
        if (objArr != null) {
            for (Object obj : objArr) {
                if (obj == null || ((z && (obj instanceof NoCopySpan)) || (spanStart = spannable.getSpanStart(obj)) < 0 || (spanEnd = spannable.getSpanEnd(obj)) < 0 || spanEnd < spanStart || spanStart > (length = spannable.length()) || spanEnd > length)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static final long g(long j) {
        long j2 = (j << 1) + 1;
        int i2 = zp4.o;
        int i3 = bq4.a;
        return j2;
    }

    public static final long h(long j) {
        return (-4611686018426L > j || j >= 4611686018427L) ? g(gwf.k(j, -4611686018427387903L, 4611686018427387903L)) : i(j * ((long) 1000000));
    }

    public static final long i(long j) {
        long j2 = j << 1;
        int i2 = zp4.o;
        int i3 = bq4.a;
        return j2;
    }

    public static final void j(View view, boolean z, long j, u16 u16) {
        int i2 = o1a.m;
        Object tag = view.getTag(i2);
        if (tag == null) {
            boolean z2 = false;
            if ((view.getVisibility() == 0) == z) {
                if (u16 != null) {
                    if (view.getVisibility() == 0) {
                        z2 = true;
                    }
                    u16.invoke(Boolean.valueOf(z2));
                    return;
                }
                return;
            }
        }
        boolean f2 = hhd.f(tag, "fade_in");
        boolean f3 = hhd.f(tag, "fade_out");
        if (f2 && z) {
            return;
        }
        if (!f3 || z) {
            String str = z ? "fade_in" : "fade_out";
            view.animate().cancel();
            view.clearAnimation();
            Animation animation = view.getAnimation();
            if (animation != null) {
                animation.setAnimationListener((Animation.AnimationListener) null);
            }
            float f4 = z ? 0.0f : 1.0f;
            float f5 = z ? 1.0f : 0.0f;
            view.animate().setDuration(j).alpha(f5).setInterpolator(z ? new DecelerateInterpolator() : new AccelerateInterpolator()).setListener(new rg(view, i2, str, f4, f5, z, u16)).start();
        }
    }

    public static /* synthetic */ void k(View view, boolean z, long j, u16 u16, int i2) {
        if ((i2 & 2) != 0) {
            j = 150;
        }
        if ((i2 & 4) != 0) {
            u16 = null;
        }
        j(view, z, j, u16);
    }

    public static final rg6 l(List list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((rg6) obj) instanceof qg6)) {
                break;
            }
        }
        return (rg6) obj;
    }

    public static e8c m(kt0 kt0, ArrayList arrayList) {
        ts6 i2 = ws6.i();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            Bundle bundle = (Bundle) arrayList.get(i3);
            bundle.getClass();
            i2.a(kt0.e(bundle));
        }
        return i2.j();
    }

    public static List n(kt0 kt0, ArrayList arrayList, e8c e8c) {
        return arrayList == null ? e8c : m(kt0, arrayList);
    }

    public static final Field o(Field field, String str) {
        try {
            Field declaredField = ExecutorsRegistrar.class.getDeclaredField(str);
            declaredField.setAccessible(true);
            field.setInt(declaredField, declaredField.getModifiers() & -17);
            return declaredField;
        } catch (Throwable th) {
            udd.s("ReplaceExecutorRegistrarLogic", "fail to fetch executor field ".concat(str), th);
            return null;
        }
    }

    public static final Class p(w67 w67) {
        Class a2 = ((vy2) w67).a();
        if (!a2.isPrimitive()) {
            return a2;
        }
        String name = a2.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? a2 : Double.class;
            case 104431:
                return !name.equals("int") ? a2 : Integer.class;
            case 3039496:
                return !name.equals("byte") ? a2 : Byte.class;
            case 3052374:
                return !name.equals("char") ? a2 : Character.class;
            case 3327612:
                return !name.equals("long") ? a2 : Long.class;
            case 3625364:
                return !name.equals("void") ? a2 : Void.class;
            case 64711720:
                return !name.equals("boolean") ? a2 : Boolean.class;
            case 97526364:
                return !name.equals("float") ? a2 : Float.class;
            case 109413500:
                return !name.equals("short") ? a2 : Short.class;
            default:
                return a2;
        }
    }

    public static int[] q(String str) {
        int i2;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i3 = indexOf4 + 2;
        if (i3 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i3) == '/') {
            i2 = str.indexOf(47, indexOf4 + 3);
            if (i2 == -1 || i2 > indexOf2) {
                i2 = indexOf2;
            }
        } else {
            i2 = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i2;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    public static final boolean s(View view) {
        Object tag = view.getTag(o1a.m);
        boolean f2 = hhd.f(tag, "fade_in");
        boolean f3 = hhd.f(tag, "fade_out");
        if (tag == null) {
            if (view.getVisibility() != 0) {
                return false;
            }
        } else if (!f2 && (f3 || view.getVisibility() != 0)) {
            return false;
        }
        return true;
    }

    public static boolean u(int i2, boolean z) {
        if ((i2 >>> 8) == 3368816) {
            return true;
        }
        if (i2 == 1751476579 && z) {
            return true;
        }
        int[] iArr = h;
        for (int i3 = 0; i3 < 29; i3++) {
            if (iArr[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    public static final rg6 v(List list) {
        Object obj;
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (!(((rg6) obj) instanceof qg6)) {
                break;
            }
        }
        return (rg6) obj;
    }

    public static final boolean w(View view, boolean z) {
        if (view != null && view.getVisibility() == 0) {
            return z || view.getAlpha() != 0.0f;
        }
        return false;
    }

    public static int x(wx1 wx1, int i2, int i3, int i4) {
        oyb.d(Math.max(Math.max(i2, i3), i4) <= 31);
        int i5 = (1 << i2) - 1;
        int i6 = (1 << i3) - 1;
        kjd.m(kjd.m(i5, i6), 1 << i4);
        if (wx1.b() < i2) {
            return -1;
        }
        int i7 = wx1.i(i2);
        if (i7 != i5) {
            return i7;
        }
        if (wx1.b() < i3) {
            return -1;
        }
        int i8 = wx1.i(i3);
        int i9 = i7 + i8;
        if (i8 != i6) {
            return i9;
        }
        if (wx1.b() < i4) {
            return -1;
        }
        return i9 + wx1.i(i4);
    }

    public static afc y(ija ija) {
        ija.H(1);
        int x = ija.x();
        long j = ((long) ija.b) + ((long) x);
        int i2 = x / 18;
        long[] jArr = new long[i2];
        long[] jArr2 = new long[i2];
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            long o = ija.o();
            if (o == -1) {
                jArr = Arrays.copyOf(jArr, i3);
                jArr2 = Arrays.copyOf(jArr2, i3);
                break;
            }
            jArr[i3] = o;
            jArr2[i3] = ija.o();
            ija.H(2);
            i3++;
        }
        ija.H((int) (j - ((long) ija.b)));
        return new afc(jArr, jArr2);
    }

    public static String z(int i2, int i3, StringBuilder sb) {
        int i4;
        int i5;
        if (i2 >= i3) {
            return sb.toString();
        }
        if (sb.charAt(i2) == '/') {
            i2++;
        }
        int i6 = i2;
        int i7 = i6;
        while (i6 <= i3) {
            if (i6 == i3) {
                i4 = i6;
            } else if (sb.charAt(i6) == '/') {
                i4 = i6 + 1;
            } else {
                i6++;
            }
            int i8 = i7 + 1;
            if (i6 == i8 && sb.charAt(i7) == '.') {
                sb.delete(i7, i4);
                i3 -= i4 - i7;
            } else {
                if (i6 == i7 + 2 && sb.charAt(i7) == '.' && sb.charAt(i8) == '.') {
                    i5 = sb.lastIndexOf("/", i7 - 2) + 1;
                    int i9 = i5 > i2 ? i5 : i2;
                    sb.delete(i9, i4);
                    i3 -= i4 - i9;
                } else {
                    i5 = i6 + 1;
                }
                i7 = i5;
            }
            i6 = i7;
        }
        return sb.toString();
    }

    public abstract void G(boolean z);

    public abstract void H(boolean z);

    public abstract void J();

    public abstract void K(int i2);

    public abstract void r(int i2);

    public abstract boolean t();
}
