package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.sdk.vendor.SystemServicesManager;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: n06  reason: default package */
public abstract class n06 {
    public static m06 a;
    public static final Object[] b = new Object[0];
    public static final Object c = new Object();
    public static final ns7 d = new ns7(18);
    public static r4g e;

    public static void A(h1e h1e, int i, nf3 nf3) {
        long k = h1e.k(i);
        List q = h1e.q(k);
        if (!q.isEmpty()) {
            if (i != h1e.u() - 1) {
                long k2 = h1e.k(i + 1) - h1e.k(i);
                if (k2 > 0) {
                    nf3.accept(new xw3(k, k2, q));
                    return;
                }
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static void B(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int[] drawableState = textInputLayout.getDrawableState();
            int[] drawableState2 = checkableImageButton.getDrawableState();
            int length = drawableState.length;
            int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
            System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
            int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
            Drawable mutate = drawable.mutate();
            um4.h(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    public static void C(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = eaf.a;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = false;
        int i = 1;
        boolean z2 = onLongClickListener != null;
        if (hasOnClickListeners || z2) {
            z = true;
        }
        checkableImageButton.setFocusable(z);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z2);
        if (!z) {
            i = 2;
        }
        checkableImageButton.setImportantForAccessibility(i);
    }

    public static final Object[] D(Collection collection) {
        int size = collection.size();
        Object[] objArr = b;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArr2 = new Object[size];
        int i = 0;
        while (true) {
            int i2 = i + 1;
            objArr2[i] = it.next();
            if (i2 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i3);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArr2, i2);
            }
            i = i2;
        }
    }

    public static final Object[] E(Collection collection, Object[] objArr) {
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr2 = size <= objArr.length ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
                while (true) {
                    int i2 = i + 1;
                    objArr2[i] = it.next();
                    if (i2 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i3);
                    } else if (!it.hasNext()) {
                        if (objArr2 != objArr) {
                            return Arrays.copyOf(objArr2, i2);
                        }
                        objArr[i2] = null;
                        return objArr;
                    }
                    i = i2;
                }
            } else if (objArr.length <= 0) {
                return objArr;
            } else {
                objArr[0] = null;
                return objArr;
            }
        } else if (objArr.length <= 0) {
            return objArr;
        } else {
            objArr[0] = null;
            return objArr;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005a A[LOOP:0: B:21:0x0054->B:23:0x005a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void F(defpackage.h1e r13, defpackage.t1e r14, defpackage.nf3 r15) {
        /*
            long r0 = r14.b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            if (r4 != 0) goto L_0x000e
            r4 = r5
            goto L_0x0027
        L_0x000e:
            int r4 = r13.h(r0)
            r6 = -1
            if (r4 != r6) goto L_0x0019
            int r4 = r13.u()
        L_0x0019:
            if (r4 <= 0) goto L_0x0027
            int r6 = r4 + -1
            long r6 = r13.k(r6)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x0027
            int r4 = r4 + -1
        L_0x0027:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0052
            int r2 = r13.u()
            if (r4 >= r2) goto L_0x0052
            java.util.List r11 = r13.q(r0)
            long r2 = r13.k(r4)
            boolean r6 = r11.isEmpty()
            if (r6 != 0) goto L_0x0052
            long r7 = r14.b
            int r6 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x0052
            xw3 r12 = new xw3
            long r9 = r2 - r7
            r6 = r12
            r6.<init>(r7, r9, r11)
            r15.accept(r12)
            r2 = 1
            goto L_0x0053
        L_0x0052:
            r2 = r5
        L_0x0053:
            r3 = r4
        L_0x0054:
            int r6 = r13.u()
            if (r3 >= r6) goto L_0x0060
            A(r13, r3, r15)
            int r3 = r3 + 1
            goto L_0x0054
        L_0x0060:
            boolean r14 = r14.a
            if (r14 == 0) goto L_0x0089
            if (r2 == 0) goto L_0x0068
            int r4 = r4 + -1
        L_0x0068:
            if (r5 >= r4) goto L_0x0070
            A(r13, r5, r15)
            int r5 = r5 + 1
            goto L_0x0068
        L_0x0070:
            if (r2 == 0) goto L_0x0089
            xw3 r14 = new xw3
            java.util.List r11 = r13.q(r0)
            long r7 = r13.k(r4)
            long r2 = r13.k(r4)
            long r9 = r0 - r2
            r6 = r14
            r6.<init>(r7, r9, r11)
            r15.accept(r14)
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n06.F(h1e, t1e, nf3):void");
    }

    public static final void G(bve bve) {
        bve.e(znc.class, new vrd(16));
        bve.e(SystemServicesManager.PushTokenGeneratedListener.class, new vrd(17));
        bve.e(b9e.class, new vrd(18));
        bve.c(pp7.class, new w8d(12));
        bve.e(x0f.class, new vrd(19));
        bve.e(kdf.class, new vrd(20));
        bve.e(aq.class, new vrd(21));
        bve.e(rf4.class, new vrd(22));
        bve.e(tf4.class, new vrd(23));
        bve.e(sma.class, new vrd(24));
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [er3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(defpackage.rj5 r4, java.lang.Object r5, java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof defpackage.pl5
            if (r0 == 0) goto L_0x0013
            r0 = r7
            pl5 r0 = (defpackage.pl5) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            pl5 r0 = new pl5
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.X
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 == r3) goto L_0x002b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x002b:
            java.lang.Object r6 = r0.o
            defpackage.wx3.H(r7)
            goto L_0x003f
        L_0x0031:
            defpackage.wx3.H(r7)
            r0.o = r6
            r0.Y = r3
            java.lang.Object r4 = r4.a(r5, r0)
            if (r4 != r1) goto L_0x003f
            return
        L_0x003f:
            kotlinx.coroutines.flow.internal.AbortFlowException r4 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r4.<init>(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n06.a(rj5, java.lang.Object, java.lang.Object, kotlin.coroutines.Continuation):void");
    }

    public static void b(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                um4.h(drawable, colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                um4.h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                um4.i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static void c(View view, bea bea, pda pda) {
        boolean z = bea instanceof zda;
        s0a s0a = s0a.c;
        u0a u0a = u0a.o;
        v0a v0a = v0a.b;
        OneMeButton oneMeButton = null;
        if (z) {
            jea jea = ((zda) bea).a;
            if (jea instanceof gea) {
                if (view instanceof OneMeButton) {
                    oneMeButton = (OneMeButton) view;
                }
                if (oneMeButton != null) {
                    oneMeButton.setSize(v0a);
                    oneMeButton.setMode(u0a);
                    oneMeButton.setAppearance(s0a);
                }
            } else if (!(jea instanceof iea) && !(jea instanceof hea)) {
                throw new NoWhenBranchMatchedException();
            }
        } else if ((bea instanceof vda) || (bea instanceof wda)) {
            if (view instanceof OneMeButton) {
                oneMeButton = (OneMeButton) view;
            }
            if (oneMeButton != null) {
                oneMeButton.setSize(v0a);
                oneMeButton.setMode(u0a);
                oneMeButton.setAppearance(s0a);
                oneMeButton.setCustomTheme(pda);
            }
        } else if (!(bea instanceof yda)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public static void d(View view, dea dea, boolean z) {
        boolean z2 = dea instanceof aea;
        v0a v0a = v0a.b;
        s0a s0a = s0a.c;
        u0a u0a = u0a.o;
        raa raa = null;
        if (z2) {
            aea aea = (aea) dea;
            jea jea = z ? aea.b : aea.a;
            if (jea instanceof iea) {
                if (view instanceof raa) {
                    raa = (raa) view;
                }
                if (raa != null) {
                    raa.setCollapsedStyle(naa.b);
                }
            } else if (jea instanceof gea) {
                if (view instanceof OneMeButton) {
                    raa = (OneMeButton) view;
                }
                if (raa != null) {
                    raa.setSize(v0a);
                    raa.setMode(u0a);
                    raa.setAppearance(s0a);
                }
            } else if (jea instanceof hea) {
                ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
                if (imageView != null) {
                    urd.B(new f5c((Object) (hea) jea, (Continuation) null, 6), imageView);
                }
            } else if (jea != null) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (dea instanceof cea) {
            if (view instanceof OneMeButton) {
                raa = (OneMeButton) view;
            }
            if (raa != null) {
                raa.setSize(v0a.a);
                raa.setMode(u0a);
                raa.setAppearance(s0a);
            }
        } else if ((dea instanceof xda) || (dea instanceof wda)) {
            if (view instanceof OneMeButton) {
                raa = (OneMeButton) view;
            }
            if (raa != null) {
                raa.setSize(v0a);
                raa.setMode(u0a);
                raa.setAppearance(s0a);
            }
        } else if (!(dea instanceof yda)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public static void e(View view, dea dea, boolean z) {
        boolean z2 = dea instanceof aea;
        s0a s0a = s0a.c;
        s0a s0a2 = s0a.o;
        raa raa = null;
        if (z2) {
            aea aea = (aea) dea;
            jea jea = z ? aea.b : aea.a;
            u0a u0a = z ? u0a.a : u0a.b;
            if (jea instanceof iea) {
                if (view instanceof raa) {
                    raa = (raa) view;
                }
                if (raa != null) {
                    raa.setCollapsedStyle(naa.a);
                }
            } else if (jea instanceof gea) {
                if (view instanceof OneMeButton) {
                    raa = (OneMeButton) view;
                }
                if (raa != null) {
                    raa.setSize(v0a.a);
                    raa.setMode(u0a);
                    if (z) {
                        s0a = s0a2;
                    }
                    raa.setAppearance(s0a);
                }
            } else if (jea instanceof hea) {
                ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
                if (imageView != null) {
                    urd.B(new wua(view, (Continuation) null, 19, false), imageView);
                }
            } else if (jea != null) {
                throw new NoWhenBranchMatchedException();
            }
        } else if ((dea instanceof cea) || (dea instanceof xda) || (dea instanceof wda)) {
            if (view instanceof OneMeButton) {
                raa = (OneMeButton) view;
            }
            if (raa != null) {
                raa.setSize(v0a.b);
                raa.setMode(u0a.o);
                if (z) {
                    s0a = s0a2;
                }
                raa.setAppearance(s0a);
            }
        } else if (!(dea instanceof yda)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final vgc f(rr3 rr3, wr3 wr3, wr3 wr32) {
        vgc vgc = new vgc(rr3, (String) null, (wr3) null, (wr3) null, false, -1);
        vgc.c(wr32);
        vgc.a(wr3);
        return vgc;
    }

    public static final void g(String str) {
        s();
    }

    public static void j(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static ImageView.ScaleType l(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static final void m() {
        s();
    }

    public static String n(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static String o(tf3 tf3, q00 q00) {
        String d2;
        if (tf3 != null && (d2 = tf3.d()) != null && d2.length() != 0) {
            String d3 = tf3.d();
            return d3 == null ? BuildConfig.FLAVOR : d3;
        } else if (q00.d.length() <= 0) {
            return "Unknown";
        } else {
            String str = q00.d;
            String str2 = q00.e;
            return (str2 == null || str2.isEmpty()) ? str : me4.i(str, " ", str2);
        }
    }

    public static Set p() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", (Class[]) null).invoke((Object) null, (Object[]) null);
            if (invoke == null) {
                return Collections.emptySet();
            }
            Set<Object> set = (Set) invoke;
            for (Object obj : set) {
                if (!(obj instanceof int[])) {
                    return Collections.emptySet();
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.emptySet();
        }
    }

    public static m06 s() {
        hk9 hk9;
        m06 m06 = a;
        if (m06 != null) {
            return m06;
        }
        synchronized (n06.class) {
            hk9 = new hk9(9);
            a = hk9;
        }
        return hk9;
    }

    public static boolean t(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean u(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    public static boolean v(XmlPullParser xmlPullParser, String str) {
        return u(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static final boolean w() {
        s();
        return false;
    }

    public static String x(String str, Object... objArr) {
        int indexOf;
        String str2;
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e2) {
                    String str3 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str3, e2);
                    StringBuilder m = hr1.m("<", str3, " threw ");
                    m.append(e2.getClass().getName());
                    m.append(">");
                    str2 = m.toString();
                }
            }
            objArr[i2] = str2;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + str.length());
        int i3 = 0;
        while (i < objArr.length && (indexOf = str.indexOf("%s", i3)) != -1) {
            sb.append(str, i3, indexOf);
            sb.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        sb.append(str, i3, str.length());
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static float y(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    public static si9 z(ws8 ws8) {
        int i;
        String str;
        String str2;
        try {
            i = jjd.K(ws8);
        } catch (Throwable th) {
            udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = uzc.a.iterator();
            while (it.hasNext()) {
                ((ny9) it.next()).getClass();
                ny9.a(th);
            }
            int t = hr1.t(m4b.a);
            if (t == 0) {
                i = 0;
            } else if (t != 1) {
                throw new NoWhenBranchMatchedException();
            } else {
                throw th;
            }
        }
        if (i == 0) {
            return null;
        }
        List list = hw4.a;
        String str3 = null;
        List list2 = list;
        for (int i2 = 0; i2 < i; i2++) {
            try {
                str = jjd.M(ws8);
            } catch (Throwable th2) {
                udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                Iterator it2 = uzc.a.iterator();
                while (it2.hasNext()) {
                    ((ny9) it2.next()).getClass();
                    ny9.a(th2);
                }
                int t2 = hr1.t(m4b.a);
                if (t2 == 0) {
                    str = null;
                } else if (t2 != 1) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    throw th2;
                }
            }
            if (str != null) {
                if (str.equals("name")) {
                    try {
                        str2 = jjd.M(ws8);
                    } catch (Throwable th3) {
                        udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                        Iterator it3 = uzc.a.iterator();
                        while (it3.hasNext()) {
                            ((ny9) it3.next()).getClass();
                            ny9.a(th3);
                        }
                        int t3 = hr1.t(m4b.a);
                        if (t3 == 0) {
                            str2 = null;
                        } else if (t3 != 1) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            throw th3;
                        }
                    }
                    if (str2 != null) {
                        str3 = str2;
                    }
                } else if (str.equals("avatars")) {
                    ArrayList T = jjd.T(ws8, new dd9(18));
                    list2 = T != null ? o23.T(T) : null;
                    if (list2 == null) {
                        list2 = list;
                    }
                } else {
                    try {
                        ws8.z();
                    } catch (Throwable th4) {
                        udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                        Iterator it4 = uzc.a.iterator();
                        while (it4.hasNext()) {
                            ((ny9) it4.next()).getClass();
                            ny9.a(th4);
                        }
                        int t4 = hr1.t(m4b.a);
                        if (t4 != 0) {
                            if (t4 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th4;
                        }
                    }
                }
            }
        }
        if (str3 == null || str3.length() == 0 || list2.isEmpty()) {
            return null;
        }
        if (str3 != null) {
            return new si9(str3, list2);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public ok h(Context context, Looper looper, h2d h2d, Object obj, oa6 oa6, pa6 pa6) {
        return i(context, looper, h2d, obj, oa6, pa6);
    }

    public ok i(Context context, Looper looper, h2d h2d, Object obj, oa6 oa6, pa6 pa6) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public abstract List k(String str, List list);

    public abstract mge q();

    public abstract Integer r();
}
