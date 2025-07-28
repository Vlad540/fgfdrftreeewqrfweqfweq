package defpackage;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.media3.common.ParserException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlinx.coroutines.internal.ScopeCoroutine;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: h2g  reason: default package */
public abstract class h2g implements jx4 {
    public static final x3a a = new x3a(28, (Object) "SAMPLED_TRACE");
    public static final u57 b = new u57(2);
    public static boolean c;

    public static void A(Drawable drawable, ColorStateList colorStateList) {
        um4.h(drawable, colorStateList);
    }

    public static void B(Drawable drawable, PorterDuff.Mode mode) {
        um4.i(drawable, mode);
    }

    public static boolean C(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static final Object D(ScopeCoroutine scopeCoroutine, ScopeCoroutine scopeCoroutine2, i26 i26) {
        Object obj;
        Object makeCompletingOnce$kotlinx_coroutines_core;
        try {
            ete.g(2, i26);
            obj = i26.invoke(scopeCoroutine2, scopeCoroutine);
        } catch (Throwable th) {
            obj = new r73(th, false);
        }
        pu3 pu3 = pu3.a;
        if (obj == pu3 || (makeCompletingOnce$kotlinx_coroutines_core = scopeCoroutine.makeCompletingOnce$kotlinx_coroutines_core(obj)) == j47.b) {
            return pu3;
        }
        if (!(makeCompletingOnce$kotlinx_coroutines_core instanceof r73)) {
            return j47.a(makeCompletingOnce$kotlinx_coroutines_core);
        }
        throw ((r73) makeCompletingOnce$kotlinx_coroutines_core).a;
    }

    public static final JSONArray E(List list) {
        JSONArray jSONArray = new JSONArray();
        for (Object next : list) {
            if (next instanceof List) {
                next = E((List) next);
            } else if (next instanceof Map) {
                next = F((Map) next);
            }
            jSONArray.put(next);
        }
        return jSONArray;
    }

    public static final JSONObject F(Map map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof List) {
                value = E((List) value);
            } else if (value instanceof Map) {
                value = F((Map) value);
            }
            jSONObject.putOpt(String.valueOf(key), value);
        }
        return jSONObject;
    }

    public static boolean G(int i, ija ija, boolean z) {
        if (ija.a() < 7) {
            if (z) {
                return false;
            }
            throw ParserException.a((RuntimeException) null, "too short header: " + ija.a());
        } else if (ija.u() != i) {
            if (z) {
                return false;
            }
            throw ParserException.a((RuntimeException) null, "expected header type " + Integer.toHexString(i));
        } else if (ija.u() == 118 && ija.u() == 111 && ija.u() == 114 && ija.u() == 98 && ija.u() == 105 && ija.u() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw ParserException.a((RuntimeException) null, "expected characters 'vorbis'");
        }
    }

    public static Parcelable H(String str, Bundle bundle) {
        ClassLoader classLoader = h2g.class.getClassLoader();
        a24.o(classLoader);
        bundle.setClassLoader(classLoader);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(classLoader);
        return bundle2.getParcelable(str);
    }

    public static void I(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            Parcelable H = H("MapOptions", bundle);
            if (H != null) {
                J(bundle2, "MapOptions", H);
            }
            Parcelable H2 = H("StreetViewPanoramaOptions", bundle);
            if (H2 != null) {
                J(bundle2, "StreetViewPanoramaOptions", H2);
            }
            Parcelable H3 = H("camera", bundle);
            if (H3 != null) {
                J(bundle2, "camera", H3);
            }
            if (bundle.containsKey("position")) {
                bundle2.putString("position", bundle.getString("position"));
            }
            if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
                bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
            }
        }
    }

    public static void J(Bundle bundle, String str, Parcelable parcelable) {
        ClassLoader classLoader = h2g.class.getClassLoader();
        a24.o(classLoader);
        bundle.setClassLoader(classLoader);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(classLoader);
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }

    public static uyc a(String str, d8 d8Var, syc[] sycArr) {
        if (!(!h0e.c0(str))) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        } else if (!d8Var.equals(t0e.f)) {
            bd4 bd4 = new bd4(str);
            return new uyc(str, d8Var, ((ArrayList) bd4.o).size(), cs.g0(sycArr), bd4);
        } else {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead".toString());
        }
    }

    public static boolean b(ela[] elaArr, ela[] elaArr2) {
        if (elaArr == null || elaArr2 == null || elaArr.length != elaArr2.length) {
            return false;
        }
        for (int i = 0; i < elaArr.length; i++) {
            ela ela = elaArr[i];
            char c2 = ela.a;
            ela ela2 = elaArr2[i];
            if (c2 != ela2.a || ela.b.length != ela2.b.length) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [kcc] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(android.view.View r13, pda r14) {
        /*
            java.lang.String r0 = "c"
            r1 = 2
            r2 = 0
            r3 = 1
            pw4 r4 = defpackage.pw4.a
            boolean r5 = r13 instanceof mhe
            if (r5 == 0) goto L_0x0012
            mhe r13 = (mhe) r13
            r13.onThemeChanged(r14)
            goto L_0x01a3
        L_0x0012:
            boolean r5 = r13 instanceof androidx.recyclerview.widget.RecyclerView
            r6 = 0
            if (r5 == 0) goto L_0x016b
            androidx.recyclerview.widget.RecyclerView r13 = (androidx.recyclerview.widget.RecyclerView) r13
            int r5 = r13.getItemDecorationCount()
            r7 = r2
            r8 = r7
        L_0x001f:
            if (r7 >= r5) goto L_0x005b
            int r9 = r13.getItemDecorationCount()
            if (r7 < 0) goto L_0x0041
            if (r7 >= r9) goto L_0x0041
            java.util.ArrayList r9 = r13.H0
            java.lang.Object r9 = r9.get(r7)
            l6c r9 = (defpackage.l6c) r9
            boolean r10 = r9 instanceof mhe
            if (r10 == 0) goto L_0x0038
            mhe r9 = (mhe) r9
            goto L_0x0039
        L_0x0038:
            r9 = r6
        L_0x0039:
            if (r9 == 0) goto L_0x003f
            r9.onThemeChanged(r14)
            r8 = r3
        L_0x003f:
            int r7 = r7 + r3
            goto L_0x001f
        L_0x0041:
            java.lang.IndexOutOfBoundsException r13 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r7)
            java.lang.String r0 = " is an invalid index for size "
            r14.append(r0)
            r14.append(r9)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L_0x005b:
            if (r8 == 0) goto L_0x0060
            r13.Y()
        L_0x0060:
            java.lang.Class<t6c> r5 = defpackage.t6c.class
            java.lang.Class<androidx.recyclerview.widget.RecyclerView> r7 = androidx.recyclerview.widget.RecyclerView.class
            java.lang.reflect.Field r7 = r7.getDeclaredField(r0)     // Catch:{ all -> 0x0085 }
            r7.setAccessible(r3)     // Catch:{ all -> 0x0085 }
            java.lang.Object r7 = r7.get(r13)     // Catch:{ all -> 0x0085 }
            t6c r7 = (defpackage.t6c) r7     // Catch:{ all -> 0x0085 }
            java.lang.String r8 = "a"
            java.lang.reflect.Field r8 = r5.getDeclaredField(r8)     // Catch:{ all -> 0x0085 }
            r8.setAccessible(r3)     // Catch:{ all -> 0x0085 }
            java.lang.Object r8 = r8.get(r7)     // Catch:{ all -> 0x0085 }
            boolean r9 = r8 instanceof java.util.List     // Catch:{ all -> 0x0085 }
            if (r9 == 0) goto L_0x0088
            java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x0085 }
            goto L_0x0089
        L_0x0085:
            r13 = move-exception
            goto L_0x0143
        L_0x0088:
            r8 = r6
        L_0x0089:
            hw4 r9 = defpackage.hw4.a
            if (r8 != 0) goto L_0x008e
            r8 = r9
        L_0x008e:
            java.lang.reflect.Field r0 = r5.getDeclaredField(r0)     // Catch:{ all -> 0x0085 }
            r0.setAccessible(r3)     // Catch:{ all -> 0x0085 }
            java.lang.Object r0 = r0.get(r7)     // Catch:{ all -> 0x0085 }
            boolean r5 = r0 instanceof java.util.List     // Catch:{ all -> 0x0085 }
            if (r5 == 0) goto L_0x00a0
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0085 }
            goto L_0x00a1
        L_0x00a0:
            r0 = r6
        L_0x00a1:
            if (r0 != 0) goto L_0x00a4
            goto L_0x00a5
        L_0x00a4:
            r9 = r0
        L_0x00a5:
            f6c r0 = r13.getAdapter()     // Catch:{ all -> 0x0085 }
            if (r0 == 0) goto L_0x00d6
            int r5 = r0.j()     // Catch:{ all -> 0x0085 }
            fz6 r5 = defpackage.gwf.S(r2, r5)     // Catch:{ all -> 0x0085 }
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet     // Catch:{ all -> 0x0085 }
            r6.<init>()     // Catch:{ all -> 0x0085 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0085 }
        L_0x00bc:
            r7 = r5
            ez6 r7 = (defpackage.ez6) r7     // Catch:{ all -> 0x0085 }
            boolean r7 = r7.c     // Catch:{ all -> 0x0085 }
            if (r7 == 0) goto L_0x00d6
            r7 = r5
            ez6 r7 = (defpackage.ez6) r7     // Catch:{ all -> 0x0085 }
            int r7 = r7.a()     // Catch:{ all -> 0x0085 }
            int r7 = r0.l(r7)     // Catch:{ all -> 0x0085 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0085 }
            r6.add(r7)     // Catch:{ all -> 0x0085 }
            goto L_0x00bc
        L_0x00d6:
            if (r6 != 0) goto L_0x00da
            qw4 r6 = defpackage.qw4.a     // Catch:{ all -> 0x0085 }
        L_0x00da:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0085 }
            r0.<init>()     // Catch:{ all -> 0x0085 }
            java.util.Iterator r5 = r6.iterator()     // Catch:{ all -> 0x0085 }
        L_0x00e3:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0085 }
            if (r6 == 0) goto L_0x0113
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0085 }
            java.lang.Number r6 = (java.lang.Number) r6     // Catch:{ all -> 0x0085 }
            int r6 = r6.intValue()     // Catch:{ all -> 0x0085 }
            androidx.recyclerview.widget.b r7 = r13.getRecycledViewPool()     // Catch:{ all -> 0x0085 }
            b7c r7 = r7.getRecycledView(r6)     // Catch:{ all -> 0x0085 }
            q8 r10 = new q8     // Catch:{ all -> 0x0085 }
            r10.<init>(r6, r2, r13)     // Catch:{ all -> 0x0085 }
            if (r7 != 0) goto L_0x0104
            r6 = r4
            goto L_0x010f
        L_0x0104:
            ij4 r6 = new ij4     // Catch:{ all -> 0x0085 }
            ke r11 = new ke     // Catch:{ all -> 0x0085 }
            r12 = 6
            r11.<init>((int) r12, (java.lang.Object) r7)     // Catch:{ all -> 0x0085 }
            r6.<init>(r11, r3, r10)     // Catch:{ all -> 0x0085 }
        L_0x010f:
            defpackage.u23.L(r0, r6)     // Catch:{ all -> 0x0085 }
            goto L_0x00e3
        L_0x0113:
            java.util.List[] r13 = new java.util.List[r1]     // Catch:{ all -> 0x0085 }
            r13[r2] = r8     // Catch:{ all -> 0x0085 }
            r13[r3] = r9     // Catch:{ all -> 0x0085 }
            dyc r13 = defpackage.cs.K(r13)     // Catch:{ all -> 0x0085 }
            x51 r5 = defpackage.x51.x0     // Catch:{ all -> 0x0085 }
            xi5 r13 = defpackage.myc.P(r13, r5)     // Catch:{ all -> 0x0085 }
            es r5 = new es     // Catch:{ all -> 0x0085 }
            r5.<init>(r1, r0)     // Catch:{ all -> 0x0085 }
            dyc[] r0 = new defpackage.dyc[r1]     // Catch:{ all -> 0x0085 }
            r0[r2] = r13     // Catch:{ all -> 0x0085 }
            r0[r3] = r5     // Catch:{ all -> 0x0085 }
            dyc r13 = defpackage.cs.K(r0)     // Catch:{ all -> 0x0085 }
            x51 r0 = defpackage.x51.w0     // Catch:{ all -> 0x0085 }
            xi5 r13 = defpackage.myc.P(r13, r0)     // Catch:{ all -> 0x0085 }
            o8 r0 = new o8     // Catch:{ all -> 0x0085 }
            r0.<init>(r3)     // Catch:{ all -> 0x0085 }
            vqe r1 = new vqe     // Catch:{ all -> 0x0085 }
            r1.<init>(r13, r0)     // Catch:{ all -> 0x0085 }
            goto L_0x0148
        L_0x0143:
            kcc r1 = new kcc
            r1.<init>(r13)
        L_0x0148:
            boolean r13 = r1 instanceof defpackage.kcc
            if (r13 == 0) goto L_0x014d
            goto L_0x014e
        L_0x014d:
            r4 = r1
        L_0x014e:
            dyc r4 = (defpackage.dyc) r4
            o8 r13 = new o8
            r13.<init>(r2)
            p8 r0 = new p8
            r0.<init>(r2, r14)
            xi5 r13 = defpackage.hhd.Q(r4, r13, r0)
            p8 r0 = new p8
            r0.<init>(r3, r14)
            vqe r13 = defpackage.myc.R(r13, r0)
            defpackage.myc.J(r13)
            goto L_0x01a3
        L_0x016b:
            boolean r0 = r13 instanceof android.widget.TextView
            if (r0 == 0) goto L_0x01a3
            android.widget.TextView r13 = (android.widget.TextView) r13
            java.lang.CharSequence r0 = r13.getText()
            boolean r1 = r0 instanceof android.text.Spanned
            if (r1 == 0) goto L_0x017c
            android.text.Spanned r0 = (android.text.Spanned) r0
            goto L_0x017d
        L_0x017c:
            r0 = r6
        L_0x017d:
            if (r0 == 0) goto L_0x01a3
            java.lang.CharSequence r13 = r13.getText()
            int r13 = r13.length()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.Object[] r13 = r0.getSpans(r2, r13, r1)
            if (r13 == 0) goto L_0x01a3
            int r0 = r13.length
        L_0x0190:
            if (r2 >= r0) goto L_0x01a3
            r1 = r13[r2]
            boolean r4 = r1 instanceof mhe
            if (r4 == 0) goto L_0x019b
            mhe r1 = (mhe) r1
            goto L_0x019c
        L_0x019b:
            r1 = r6
        L_0x019c:
            if (r1 == 0) goto L_0x01a1
            r1.onThemeChanged(r14)
        L_0x01a1:
            int r2 = r2 + r3
            goto L_0x0190
        L_0x01a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h2g.c(android.view.View, pda):void");
    }

    public static float[] d(int i, float[] fArr) {
        if (i >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int min = Math.min(i, length);
                float[] fArr2 = new float[i];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0083, code lost:
        r13 = 0;
        r15 = 1;
        r16 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008d, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0096 A[Catch:{ NumberFormatException -> 0x00aa }, LOOP:3: B:22:0x0068->B:41:0x0096, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0095 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.ela[] e(java.lang.String r17) {
        /*
            r0 = r17
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r5 = r2
            r4 = 1
        L_0x000a:
            int r6 = r17.length()
            if (r4 >= r6) goto L_0x00de
        L_0x0010:
            int r6 = r17.length()
            r7 = 69
            r8 = 101(0x65, float:1.42E-43)
            if (r4 >= r6) goto L_0x0034
            char r6 = r0.charAt(r4)
            int r9 = r6 + -65
            int r10 = r6 + -90
            int r10 = r10 * r9
            if (r10 <= 0) goto L_0x002c
            int r9 = r6 + -97
            int r10 = r6 + -122
            int r10 = r10 * r9
            if (r10 > 0) goto L_0x0031
        L_0x002c:
            if (r6 == r8) goto L_0x0031
            if (r6 == r7) goto L_0x0031
            goto L_0x0034
        L_0x0031:
            int r4 = r4 + 1
            goto L_0x0010
        L_0x0034:
            java.lang.String r5 = r0.substring(r5, r4)
            java.lang.String r5 = r5.trim()
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L_0x00d7
            char r6 = r5.charAt(r2)
            r9 = 122(0x7a, float:1.71E-43)
            if (r6 == r9) goto L_0x00c9
            char r6 = r5.charAt(r2)
            r9 = 90
            if (r6 != r9) goto L_0x0054
            goto L_0x00c9
        L_0x0054:
            int r6 = r5.length()     // Catch:{ NumberFormatException -> 0x00aa }
            float[] r6 = new float[r6]     // Catch:{ NumberFormatException -> 0x00aa }
            int r9 = r5.length()     // Catch:{ NumberFormatException -> 0x00aa }
            r11 = r2
            r10 = 1
        L_0x0060:
            if (r10 >= r9) goto L_0x00b4
            r13 = r2
            r14 = r13
            r15 = r14
            r16 = r15
            r12 = r10
        L_0x0068:
            int r3 = r5.length()     // Catch:{ NumberFormatException -> 0x00aa }
            if (r12 >= r3) goto L_0x009a
            char r3 = r5.charAt(r12)     // Catch:{ NumberFormatException -> 0x00aa }
            r2 = 32
            if (r3 == r2) goto L_0x0091
            if (r3 == r7) goto L_0x008f
            if (r3 == r8) goto L_0x008f
            switch(r3) {
                case 44: goto L_0x0091;
                case 45: goto L_0x0088;
                case 46: goto L_0x007e;
                default: goto L_0x007d;
            }     // Catch:{ NumberFormatException -> 0x00aa }
        L_0x007d:
            goto L_0x008d
        L_0x007e:
            if (r14 != 0) goto L_0x0083
            r13 = 0
            r14 = 1
            goto L_0x0093
        L_0x0083:
            r13 = 0
            r15 = 1
            r16 = 1
            goto L_0x0093
        L_0x0088:
            if (r12 == r10) goto L_0x008d
            if (r13 != 0) goto L_0x008d
            goto L_0x0083
        L_0x008d:
            r13 = 0
            goto L_0x0093
        L_0x008f:
            r13 = 1
            goto L_0x0093
        L_0x0091:
            r13 = 0
            r15 = 1
        L_0x0093:
            if (r15 == 0) goto L_0x0096
            goto L_0x009a
        L_0x0096:
            int r12 = r12 + 1
            r2 = 0
            goto L_0x0068
        L_0x009a:
            if (r10 >= r12) goto L_0x00ac
            int r2 = r11 + 1
            java.lang.String r3 = r5.substring(r10, r12)     // Catch:{ NumberFormatException -> 0x00aa }
            float r3 = java.lang.Float.parseFloat(r3)     // Catch:{ NumberFormatException -> 0x00aa }
            r6[r11] = r3     // Catch:{ NumberFormatException -> 0x00aa }
            r11 = r2
            goto L_0x00ac
        L_0x00aa:
            r0 = move-exception
            goto L_0x00bb
        L_0x00ac:
            if (r16 == 0) goto L_0x00b1
            r10 = r12
        L_0x00af:
            r2 = 0
            goto L_0x0060
        L_0x00b1:
            int r10 = r12 + 1
            goto L_0x00af
        L_0x00b4:
            float[] r2 = d(r11, r6)     // Catch:{ NumberFormatException -> 0x00aa }
            r3 = r2
            r2 = 0
            goto L_0x00cb
        L_0x00bb:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "error in parsing \""
            java.lang.String r3 = "\""
            java.lang.String r2 = wn6.i(r2, r5, r3)
            r1.<init>(r2, r0)
            throw r1
        L_0x00c9:
            float[] r3 = new float[r2]
        L_0x00cb:
            char r5 = r5.charAt(r2)
            ela r2 = new ela
            r2.<init>(r5, r3)
            r1.add(r2)
        L_0x00d7:
            int r2 = r4 + 1
            r5 = r4
            r4 = r2
            r2 = 0
            goto L_0x000a
        L_0x00de:
            int r4 = r4 - r5
            r2 = 1
            if (r4 != r2) goto L_0x00f8
            int r2 = r17.length()
            if (r5 >= r2) goto L_0x00f8
            char r0 = r0.charAt(r5)
            r2 = 0
            float[] r3 = new float[r2]
            ela r4 = new ela
            r4.<init>(r0, r3)
            r1.add(r4)
            goto L_0x00f9
        L_0x00f8:
            r2 = 0
        L_0x00f9:
            ela[] r0 = new defpackage.ela[r2]
            java.lang.Object[] r0 = r1.toArray(r0)
            ela[] r0 = (defpackage.ela[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h2g.e(java.lang.String):ela[]");
    }

    public static Path f(String str) {
        Path path = new Path();
        try {
            u(e(str), path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing ".concat(str), e);
        }
    }

    public static ela[] g(ela[] elaArr) {
        ela[] elaArr2 = new ela[elaArr.length];
        for (int i = 0; i < elaArr.length; i++) {
            elaArr2[i] = new ela(elaArr[i]);
        }
        return elaArr2;
    }

    public static final void h(File file) {
        if (file.exists() && !ng5.J(file)) {
            throw new IOException("Can't delete " + file);
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean i() {
        /*
            java.lang.String r0 = "delivery_metrics_exported_to_big_query_enabled"
            r1 = 0
            defpackage.ih5.b()     // Catch:{ IllegalStateException -> 0x0045 }
            ih5 r2 = defpackage.ih5.b()
            r2.a()
            java.lang.String r3 = "com.google.firebase.messaging"
            android.content.Context r2 = r2.a
            android.content.SharedPreferences r3 = r2.getSharedPreferences(r3, r1)
            java.lang.String r4 = "export_to_big_query"
            boolean r5 = r3.contains(r4)
            if (r5 == 0) goto L_0x0022
            boolean r0 = r3.getBoolean(r4, r1)
            return r0
        L_0x0022:
            android.content.pm.PackageManager r3 = r2.getPackageManager()     // Catch:{  }
            if (r3 == 0) goto L_0x0045
            java.lang.String r2 = r2.getPackageName()     // Catch:{  }
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r2 = r3.getApplicationInfo(r2, r4)     // Catch:{  }
            if (r2 == 0) goto L_0x0045
            android.os.Bundle r3 = r2.metaData     // Catch:{  }
            if (r3 == 0) goto L_0x0045
            boolean r3 = r3.containsKey(r0)     // Catch:{  }
            if (r3 == 0) goto L_0x0045
            android.os.Bundle r2 = r2.metaData     // Catch:{  }
            boolean r0 = r2.getBoolean(r0, r1)     // Catch:{  }
            return r0
        L_0x0045:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h2g.i():boolean");
    }

    public static Map j(wwc wwc) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator b0 = wwc.b0();
        while (b0.hasNext()) {
            Object V = wwc.V(b0.next());
            Object obj = linkedHashMap.get(V);
            if (obj == null && !linkedHashMap.containsKey(V)) {
                obj = new Object();
            }
            j7c j7c = (j7c) obj;
            j7c.a++;
            linkedHashMap.put(V, j7c);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (!(entry instanceof z67) || (entry instanceof c77)) {
                entry.setValue(Integer.valueOf(((j7c) entry.getValue()).a));
            } else {
                ete.b0(entry, "kotlin.collections.MutableMap.MutableEntry");
                throw null;
            }
        }
        ete.f(linkedHashMap);
        return linkedHashMap;
    }

    public static TextDirectionHeuristic k(efe efe) {
        return efe == gfe.a ? TextDirectionHeuristics.LTR : efe == gfe.b ? TextDirectionHeuristics.RTL : efe == gfe.c ? TextDirectionHeuristics.FIRSTSTRONG_LTR : efe == gfe.d ? TextDirectionHeuristics.FIRSTSTRONG_RTL : efe == gfe.e ? TextDirectionHeuristics.ANYRTL_LTR : efe == ffe.c ? TextDirectionHeuristics.LOCALE : TextDirectionHeuristics.FIRSTSTRONG_LTR;
    }

    public static final ju3 l(aec aec) {
        Map map = aec.k;
        Object obj = map.get("QueryDispatcher");
        if (obj == null) {
            Executor executor = aec.b;
            if (executor == null) {
                executor = null;
            }
            obj = kjd.r(executor);
            map.put("QueryDispatcher", obj);
        }
        return (ju3) obj;
    }

    public static final ju3 m(aec aec) {
        Map map = aec.k;
        Object obj = map.get("TransactionDispatcher");
        if (obj == null) {
            qm qmVar = aec.c;
            if (qmVar == null) {
                qmVar = null;
            }
            obj = kjd.r(qmVar);
            map.put("TransactionDispatcher", obj);
        }
        return (ju3) obj;
    }

    public static int n(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static final int o(int i) {
        if (i == 0) {
            return 0;
        }
        return Color.parseColor(String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(i & 16777215)}, 1)));
    }

    public static boolean p(int i) {
        return (i & 32768) != 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: t29} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: t29} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: t29} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: t29} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: t29} */
    /* JADX WARNING: type inference failed for: r5v1, types: [s86, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x014f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void q(android.content.Intent r17) {
        /*
            r0 = r17
            boolean r1 = C(r17)
            if (r1 == 0) goto L_0x0011
            java.lang.String r1 = "_nr"
            android.os.Bundle r2 = r17.getExtras()
            r(r1, r2)
        L_0x0011:
            r1 = 0
            if (r0 == 0) goto L_0x0026
            java.lang.String r2 = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"
            java.lang.String r3 = r17.getAction()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0021
            goto L_0x0026
        L_0x0021:
            boolean r2 = i()
            goto L_0x0027
        L_0x0026:
            r2 = r1
        L_0x0027:
            if (r2 == 0) goto L_0x01bb
            jib r2 = com.google.firebase.messaging.FirebaseMessaging.l
            java.lang.Object r2 = r2.get()
            rre r2 = (defpackage.rre) r2
            if (r2 != 0) goto L_0x0035
            goto L_0x01bb
        L_0x0035:
            r3 = 0
            if (r0 != 0) goto L_0x003a
            goto L_0x0156
        L_0x003a:
            android.os.Bundle r4 = r17.getExtras()
            if (r4 != 0) goto L_0x0042
            android.os.Bundle r4 = android.os.Bundle.EMPTY
        L_0x0042:
            java.lang.String r5 = "google.ttl"
            java.lang.Object r5 = r4.get(r5)
            boolean r6 = r5 instanceof java.lang.Integer
            if (r6 == 0) goto L_0x0054
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r1 = r5.intValue()
        L_0x0052:
            r13 = r1
            goto L_0x0064
        L_0x0054:
            boolean r6 = r5 instanceof java.lang.String
            if (r6 == 0) goto L_0x0052
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ NumberFormatException -> 0x0060 }
            int r1 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x0060 }
            goto L_0x0052
        L_0x0060:
            java.util.Objects.toString(r5)
            goto L_0x0052
        L_0x0064:
            java.lang.String r1 = "google.to"
            java.lang.String r1 = r4.getString(r1)
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 != 0) goto L_0x0072
        L_0x0070:
            r9 = r1
            goto L_0x0090
        L_0x0072:
            ih5 r1 = defpackage.ih5.b()     // Catch:{ InterruptedException | ExecutionException -> 0x01b4 }
            java.lang.Object r5 = defpackage.lh5.m     // Catch:{ InterruptedException | ExecutionException -> 0x01b4 }
            r1.a()     // Catch:{ InterruptedException | ExecutionException -> 0x01b4 }
            l83 r1 = r1.d     // Catch:{ InterruptedException | ExecutionException -> 0x01b4 }
            java.lang.Class<mh5> r5 = defpackage.mh5.class
            java.lang.Object r1 = r1.a(r5)     // Catch:{ InterruptedException | ExecutionException -> 0x01b4 }
            lh5 r1 = (defpackage.lh5) r1     // Catch:{ InterruptedException | ExecutionException -> 0x01b4 }
            n6g r1 = r1.c()     // Catch:{ InterruptedException | ExecutionException -> 0x01b4 }
            java.lang.Object r1 = defpackage.gwf.a(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x01b4 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ InterruptedException | ExecutionException -> 0x01b4 }
            goto L_0x0070
        L_0x0090:
            ih5 r1 = defpackage.ih5.b()
            r1.a()
            android.content.Context r1 = r1.a
            java.lang.String r11 = r1.getPackageName()
            boolean r1 = wq3.q(r4)
            if (r1 == 0) goto L_0x00a7
            r29 r1 = defpackage.r29.DISPLAY_NOTIFICATION
        L_0x00a5:
            r10 = r1
            goto L_0x00aa
        L_0x00a7:
            r29 r1 = defpackage.r29.DATA_MESSAGE
            goto L_0x00a5
        L_0x00aa:
            java.lang.String r1 = "google.message_id"
            java.lang.String r1 = r4.getString(r1)
            if (r1 != 0) goto L_0x00b8
            java.lang.String r1 = "message_id"
            java.lang.String r1 = r4.getString(r1)
        L_0x00b8:
            java.lang.String r5 = ""
            if (r1 == 0) goto L_0x00be
            r8 = r1
            goto L_0x00bf
        L_0x00be:
            r8 = r5
        L_0x00bf:
            java.lang.String r1 = "from"
            java.lang.String r1 = r4.getString(r1)
            if (r1 == 0) goto L_0x00d0
            java.lang.String r6 = "/topics/"
            boolean r6 = r1.startsWith(r6)
            if (r6 == 0) goto L_0x00d0
            r3 = r1
        L_0x00d0:
            if (r3 == 0) goto L_0x00d4
            r14 = r3
            goto L_0x00d5
        L_0x00d4:
            r14 = r5
        L_0x00d5:
            java.lang.String r1 = "collapse_key"
            java.lang.String r1 = r4.getString(r1)
            if (r1 == 0) goto L_0x00df
            r12 = r1
            goto L_0x00e0
        L_0x00df:
            r12 = r5
        L_0x00e0:
            java.lang.String r1 = "google.c.a.m_l"
            java.lang.String r1 = r4.getString(r1)
            if (r1 == 0) goto L_0x00ea
            r15 = r1
            goto L_0x00eb
        L_0x00ea:
            r15 = r5
        L_0x00eb:
            java.lang.String r1 = "google.c.a.c_l"
            java.lang.String r1 = r4.getString(r1)
            if (r1 == 0) goto L_0x00f6
            r16 = r1
            goto L_0x00f8
        L_0x00f6:
            r16 = r5
        L_0x00f8:
            java.lang.String r1 = "google.c.sender.id"
            boolean r3 = r4.containsKey(r1)
            r5 = 0
            if (r3 == 0) goto L_0x010b
            java.lang.String r1 = r4.getString(r1)     // Catch:{ NumberFormatException -> 0x010b }
            long r3 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x010b }
            goto L_0x0149
        L_0x010b:
            ih5 r1 = defpackage.ih5.b()
            r1.a()
            rh5 r3 = r1.c
            java.lang.String r4 = r3.e
            if (r4 == 0) goto L_0x011d
            long r3 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x011d }
            goto L_0x0149
        L_0x011d:
            r1.a()
            java.lang.String r1 = r3.b
            java.lang.String r3 = "1:"
            boolean r3 = r1.startsWith(r3)
            if (r3 != 0) goto L_0x012f
            long r3 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x0139 }
            goto L_0x0149
        L_0x012f:
            java.lang.String r3 = ":"
            java.lang.String[] r1 = r1.split(r3)
            int r3 = r1.length
            r4 = 2
            if (r3 >= r4) goto L_0x013b
        L_0x0139:
            r3 = r5
            goto L_0x0149
        L_0x013b:
            r3 = 1
            r1 = r1[r3]
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L_0x0145
            goto L_0x0139
        L_0x0145:
            long r3 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x0139 }
        L_0x0149:
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x014f
            r6 = r3
            goto L_0x0150
        L_0x014f:
            r6 = r5
        L_0x0150:
            t29 r3 = new t29
            r5 = r3
            r5.<init>(r6, r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x0156:
            if (r3 != 0) goto L_0x0159
            goto L_0x01bb
        L_0x0159:
            java.lang.String r1 = "google.product_id"
            r4 = 111881503(0x6ab2d1f, float:6.438935E-35)
            int r0 = r0.getIntExtra(r1, r4)     // Catch:{ RuntimeException -> 0x01bb }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ RuntimeException -> 0x01bb }
            ka0 r1 = new ka0     // Catch:{ RuntimeException -> 0x01bb }
            r1.<init>(r0)     // Catch:{ RuntimeException -> 0x01bb }
            java.lang.String r0 = "proto"
            cy4 r4 = new cy4     // Catch:{ RuntimeException -> 0x01bb }
            r4.<init>(r0)     // Catch:{ RuntimeException -> 0x01bb }
            hs1 r0 = new hs1     // Catch:{ RuntimeException -> 0x01bb }
            r0.<init>()     // Catch:{ RuntimeException -> 0x01bb }
            sre r2 = (defpackage.sre) r2     // Catch:{ RuntimeException -> 0x01bb }
            java.util.Set r5 = r2.a     // Catch:{ RuntimeException -> 0x01bb }
            boolean r6 = r5.contains(r4)     // Catch:{ RuntimeException -> 0x01bb }
            if (r6 == 0) goto L_0x01a4
            s86 r5 = new s86     // Catch:{ RuntimeException -> 0x01bb }
            hb0 r6 = r2.b     // Catch:{ RuntimeException -> 0x01bb }
            tre r2 = r2.c     // Catch:{ RuntimeException -> 0x01bb }
            r5.<init>()     // Catch:{ RuntimeException -> 0x01bb }
            r5.a = r6     // Catch:{ RuntimeException -> 0x01bb }
            java.lang.String r6 = "FCM_CLIENT_EVENT_LOGGING"
            r5.b = r6     // Catch:{ RuntimeException -> 0x01bb }
            r5.c = r4     // Catch:{ RuntimeException -> 0x01bb }
            r5.o = r0     // Catch:{ RuntimeException -> 0x01bb }
            r5.X = r2     // Catch:{ RuntimeException -> 0x01bb }
            u29 r0 = new u29     // Catch:{ RuntimeException -> 0x01bb }
            r0.<init>(r3)     // Catch:{ RuntimeException -> 0x01bb }
            h90 r2 = new h90     // Catch:{ RuntimeException -> 0x01bb }
            r2.<init>(r0, r1)     // Catch:{ RuntimeException -> 0x01bb }
            r5.o(r2)     // Catch:{ RuntimeException -> 0x01bb }
            goto L_0x01bb
        L_0x01a4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ RuntimeException -> 0x01bb }
            java.lang.String r1 = "%s is not supported byt this factory. Supported encodings are: %s."
            java.lang.Object[] r2 = new java.lang.Object[]{r4, r5}     // Catch:{ RuntimeException -> 0x01bb }
            java.lang.String r1 = java.lang.String.format(r1, r2)     // Catch:{ RuntimeException -> 0x01bb }
            r0.<init>(r1)     // Catch:{ RuntimeException -> 0x01bb }
            throw r0     // Catch:{ RuntimeException -> 0x01bb }
        L_0x01b4:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x01bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h2g.q(android.content.Intent):void");
    }

    public static void r(String str, Bundle bundle) {
        try {
            ih5.b();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            String str2 = null;
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException unused) {
                }
            }
            if (bundle.containsKey("google.c.a.udt")) {
                str2 = bundle.getString("google.c.a.udt");
            }
            if (str2 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(str2));
                } catch (NumberFormatException unused2) {
                }
            }
            String str3 = wq3.q(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str3);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                bundle2.toString();
            }
            ih5 b2 = ih5.b();
            b2.a();
            hr1.r(b2.d.a(cd.class));
        } catch (IllegalStateException unused3) {
        }
    }

    public static final String s(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (iu7.G(charAt)) {
                sb.append(charAt);
            } else {
                sb.append('*');
            }
        }
        return sb.toString();
    }

    public static final void t(File file) {
        if (file.exists()) {
            if (!file.isDirectory()) {
                throw new IOException(file + " is not a directory");
            }
        } else if (!file.mkdirs()) {
            throw new IOException("Can't create " + file);
        }
    }

    public static void u(ela[] elaArr, Path path) {
        int i;
        int i2;
        int i3;
        char c2;
        int i4;
        ela ela;
        int i5;
        char c3;
        int i6;
        int i7;
        ela ela2;
        float f;
        float f2;
        int i8;
        char c4;
        int i9;
        int i10;
        float f3;
        float f4;
        int i11;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        ela[] elaArr2 = elaArr;
        Path path2 = path;
        int i12 = 6;
        float[] fArr = new float[6];
        int length = elaArr2.length;
        int i13 = 0;
        char c5 = 'm';
        while (i13 < length) {
            ela ela3 = elaArr2[i13];
            char c6 = ela3.a;
            float f15 = fArr[0];
            float f16 = fArr[1];
            float f17 = fArr[2];
            float f18 = fArr[3];
            float f19 = fArr[4];
            float f20 = fArr[5];
            switch (c6) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = i12;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path2.moveTo(f19, f20);
                    f15 = f19;
                    f17 = f15;
                    f16 = f20;
                    f18 = f16;
                    break;
            }
            i = 2;
            float f21 = f19;
            float f22 = f20;
            float f23 = f15;
            float f24 = f16;
            int i14 = 0;
            while (true) {
                float[] fArr2 = ela3.b;
                if (i14 < fArr2.length) {
                    if (c6 != 'A') {
                        if (c6 != 'C') {
                            if (c6 == 'H') {
                                float[] fArr3 = fArr2;
                                i2 = i14;
                                c2 = c6;
                                i3 = i13;
                                i4 = length;
                                ela = ela3;
                                path2.lineTo(fArr3[i2], f24);
                                f23 = fArr3[i2];
                            } else if (c6 == 'Q') {
                                float[] fArr4 = fArr2;
                                i8 = i14;
                                c4 = c6;
                                i9 = i13;
                                i10 = length;
                                ela = ela3;
                                int i15 = i8 + 1;
                                int i16 = i8 + 2;
                                int i17 = i8 + 3;
                                path2.quadTo(fArr4[i8], fArr4[i15], fArr4[i16], fArr4[i17]);
                                f3 = fArr4[i8];
                                f4 = fArr4[i15];
                                f23 = fArr4[i16];
                                f24 = fArr4[i17];
                            } else if (c6 == 'V') {
                                float[] fArr5 = fArr2;
                                i2 = i14;
                                c2 = c6;
                                i3 = i13;
                                i4 = length;
                                ela = ela3;
                                path2.lineTo(f23, fArr5[i2]);
                                f24 = fArr5[i2];
                            } else if (c6 != 'a') {
                                if (c6 != 'c') {
                                    if (c6 == 'h') {
                                        float[] fArr6 = fArr2;
                                        i2 = i14;
                                        float f25 = f24;
                                        path2.rLineTo(fArr6[i2], 0.0f);
                                        f23 += fArr6[i2];
                                    } else if (c6 == 'q') {
                                        float[] fArr7 = fArr2;
                                        i2 = i14;
                                        float f26 = f24;
                                        float f27 = f23;
                                        int i18 = i2 + 1;
                                        int i19 = i2 + 2;
                                        int i20 = i2 + 3;
                                        path2.rQuadTo(fArr7[i2], fArr7[i18], fArr7[i19], fArr7[i20]);
                                        float f28 = f27 + fArr7[i2];
                                        float f29 = f27 + fArr7[i19];
                                        f24 = f26 + fArr7[i20];
                                        f18 = fArr7[i18] + f26;
                                        f17 = f28;
                                        c2 = c6;
                                        i3 = i13;
                                        i4 = length;
                                        f23 = f29;
                                    } else if (c6 == 'v') {
                                        float[] fArr8 = fArr2;
                                        i2 = i14;
                                        float f30 = f23;
                                        path2.rLineTo(0.0f, fArr8[i2]);
                                        f24 += fArr8[i2];
                                    } else if (c6 != 'L') {
                                        if (c6 == 'M') {
                                            float[] fArr9 = fArr2;
                                            i2 = i14;
                                            f23 = fArr9[i2];
                                            f24 = fArr9[i2 + 1];
                                            if (i2 > 0) {
                                                path2.lineTo(f23, f24);
                                            } else {
                                                path2.moveTo(f23, f24);
                                            }
                                        } else if (c6 != 'S') {
                                            if (c6 == 'T') {
                                                float[] fArr10 = fArr2;
                                                i11 = i14;
                                                float f31 = f24;
                                                float f32 = f23;
                                                if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                                    f5 = (f32 * 2.0f) - f17;
                                                    f6 = (f31 * 2.0f) - f18;
                                                } else {
                                                    f5 = f32;
                                                    f6 = f31;
                                                }
                                                int i21 = i11 + 1;
                                                path2.quadTo(f5, f6, fArr10[i11], fArr10[i21]);
                                                f7 = fArr10[i11];
                                                f8 = fArr10[i21];
                                            } else if (c6 == 'l') {
                                                float[] fArr11 = fArr2;
                                                i2 = i14;
                                                int i22 = i2 + 1;
                                                path2.rLineTo(fArr11[i2], fArr11[i22]);
                                                f23 += fArr11[i2];
                                                f24 += fArr11[i22];
                                            } else if (c6 == 'm') {
                                                float[] fArr12 = fArr2;
                                                i2 = i14;
                                                float f33 = fArr12[i2];
                                                f23 += f33;
                                                float f34 = fArr12[i2 + 1];
                                                f24 += f34;
                                                if (i2 > 0) {
                                                    path2.rLineTo(f33, f34);
                                                } else {
                                                    path2.rMoveTo(f33, f34);
                                                }
                                            } else if (c6 == 's') {
                                                if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                                    float f35 = f23 - f17;
                                                    f12 = f24 - f18;
                                                    f11 = f35;
                                                } else {
                                                    f12 = 0.0f;
                                                    f11 = 0.0f;
                                                }
                                                int i23 = i14 + 1;
                                                int i24 = i14 + 2;
                                                int i25 = i14 + 3;
                                                float[] fArr13 = fArr2;
                                                i11 = i14;
                                                float f36 = f24;
                                                float f37 = f23;
                                                path.rCubicTo(f11, f12, fArr2[i14], fArr2[i23], fArr2[i24], fArr2[i25]);
                                                f5 = f37 + fArr13[i11];
                                                f6 = f36 + fArr13[i23];
                                                f7 = f37 + fArr13[i24];
                                                f8 = fArr13[i25] + f36;
                                            } else if (c6 != 't') {
                                                i2 = i14;
                                            } else {
                                                if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                                    f13 = f23 - f17;
                                                    f14 = f24 - f18;
                                                } else {
                                                    f14 = 0;
                                                    f13 = 0;
                                                }
                                                int i26 = i14 + 1;
                                                path2.rQuadTo(f13, f14, fArr2[i14], fArr2[i26]);
                                                float f38 = f13 + f23;
                                                float f39 = f14 + f24;
                                                f23 += fArr2[i14];
                                                f24 += fArr2[i26];
                                                f18 = f39;
                                                i2 = i14;
                                                c2 = c6;
                                                i3 = i13;
                                                i4 = length;
                                                f17 = f38;
                                            }
                                            f18 = f6;
                                            f17 = f5;
                                            c2 = c6;
                                            i3 = i13;
                                            i4 = length;
                                            f23 = f7;
                                            f24 = f8;
                                        } else {
                                            float[] fArr14 = fArr2;
                                            i2 = i14;
                                            float f40 = f24;
                                            float f41 = f23;
                                            if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                                f9 = (f40 * 2.0f) - f18;
                                                f10 = (f41 * 2.0f) - f17;
                                            } else {
                                                f10 = f41;
                                                f9 = f40;
                                            }
                                            int i27 = i2 + 1;
                                            int i28 = i2 + 2;
                                            int i29 = i2 + 3;
                                            path.cubicTo(f10, f9, fArr14[i2], fArr14[i27], fArr14[i28], fArr14[i29]);
                                            float f42 = fArr14[i2];
                                            float f43 = fArr14[i27];
                                            f23 = fArr14[i28];
                                            f24 = fArr14[i29];
                                            f18 = f43;
                                            f17 = f42;
                                        }
                                        f22 = f24;
                                        f21 = f23;
                                    } else {
                                        float[] fArr15 = fArr2;
                                        i2 = i14;
                                        int i30 = i2 + 1;
                                        path2.lineTo(fArr15[i2], fArr15[i30]);
                                        f23 = fArr15[i2];
                                        f24 = fArr15[i30];
                                    }
                                    c2 = c6;
                                    i3 = i13;
                                    i4 = length;
                                } else {
                                    float[] fArr16 = fArr2;
                                    i11 = i14;
                                    float f44 = f24;
                                    float f45 = f23;
                                    int i31 = i11 + 2;
                                    int i32 = i11 + 3;
                                    int i33 = i11 + 4;
                                    int i34 = i11 + 5;
                                    path.rCubicTo(fArr16[i11], fArr16[i11 + 1], fArr16[i31], fArr16[i32], fArr16[i33], fArr16[i34]);
                                    f5 = f45 + fArr16[i31];
                                    f6 = f44 + fArr16[i32];
                                    f7 = f45 + fArr16[i33];
                                    f8 = fArr16[i34] + f44;
                                    f18 = f6;
                                    f17 = f5;
                                    c2 = c6;
                                    i3 = i13;
                                    i4 = length;
                                    f23 = f7;
                                    f24 = f8;
                                }
                                ela = ela3;
                            } else {
                                float[] fArr17 = fArr2;
                                i5 = i14;
                                float f46 = f24;
                                float f47 = f23;
                                int i35 = i5 + 5;
                                int i36 = i5 + 6;
                                c3 = c6;
                                i7 = length;
                                ela2 = ela3;
                                i6 = i13;
                                ela.a(path, f47, f46, fArr17[i35] + f47, fArr17[i36] + f46, fArr17[i5], fArr17[i5 + 1], fArr17[i5 + 2], fArr17[i5 + 3] != 0.0f, fArr17[i5 + 4] != 0.0f);
                                f = f47 + fArr17[i35];
                                f2 = f46 + fArr17[i36];
                            }
                            i14 = i2 + i;
                            ela[] elaArr3 = elaArr;
                            ela3 = ela;
                            length = i4;
                            c5 = c2;
                            c6 = c5;
                            i13 = i3;
                        } else {
                            float[] fArr18 = fArr2;
                            i8 = i14;
                            c4 = c6;
                            i9 = i13;
                            i10 = length;
                            ela = ela3;
                            int i37 = i8 + 2;
                            int i38 = i8 + 3;
                            int i39 = i8 + 4;
                            int i40 = i8 + 5;
                            path.cubicTo(fArr18[i8], fArr18[i8 + 1], fArr18[i37], fArr18[i38], fArr18[i39], fArr18[i40]);
                            f23 = fArr18[i39];
                            f24 = fArr18[i40];
                            f3 = fArr18[i37];
                            f4 = fArr18[i38];
                        }
                        f17 = f3;
                        f18 = f4;
                        i14 = i2 + i;
                        ela[] elaArr32 = elaArr;
                        ela3 = ela;
                        length = i4;
                        c5 = c2;
                        c6 = c5;
                        i13 = i3;
                    } else {
                        float[] fArr19 = fArr2;
                        i5 = i14;
                        c3 = c6;
                        i6 = i13;
                        i7 = length;
                        ela2 = ela3;
                        int i41 = i5 + 5;
                        int i42 = i5 + 6;
                        ela.a(path, f23, f24, fArr19[i41], fArr19[i42], fArr19[i5], fArr19[i5 + 1], fArr19[i5 + 2], fArr19[i5 + 3] != 0.0f, fArr19[i5 + 4] != 0.0f);
                        f = fArr19[i41];
                        f2 = fArr19[i42];
                    }
                    f18 = f24;
                    f17 = f23;
                    i14 = i2 + i;
                    ela[] elaArr322 = elaArr;
                    ela3 = ela;
                    length = i4;
                    c5 = c2;
                    c6 = c5;
                    i13 = i3;
                } else {
                    fArr[0] = f23;
                    fArr[1] = f24;
                    fArr[2] = f17;
                    fArr[3] = f18;
                    fArr[4] = f21;
                    fArr[5] = f22;
                    c5 = ela3.a;
                    i13++;
                    elaArr2 = elaArr;
                    length = length;
                    i12 = 6;
                }
            }
        }
    }

    public static a39 v(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            int i2 = oze.a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                ez3.j0("Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(oua.a(new ija(Base64.decode(split[1], 0))));
                } catch (RuntimeException e) {
                    ez3.k0("Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new ydf(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new a39((List) arrayList);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009b, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009c, code lost:
        defpackage.urd.l(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009f, code lost:
        throw r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void w(dy r5, bk r6) {
        /*
            java.io.FileInputStream r5 = r5.c()
            if (r5 == 0) goto L_0x00a0
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            r1 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r5, r1)
            java.io.DataInputStream r5 = new java.io.DataInputStream     // Catch:{ all -> 0x0092 }
            r5.<init>(r0)     // Catch:{ all -> 0x0092 }
            qe4 r1 = new qe4     // Catch:{ all -> 0x0045 }
            r2 = 29
            r1.<init>((int) r2)     // Catch:{ all -> 0x0045 }
        L_0x0019:
            int r2 = r5.available()     // Catch:{ all -> 0x0045 }
            if (r2 <= 0) goto L_0x008a
            java.lang.String r2 = r5.readUTF()     // Catch:{ all -> 0x0045 }
            int r3 = r5.readUnsignedByte()     // Catch:{ all -> 0x0045 }
            jk9 r4 = defpackage.dte.b     // Catch:{ all -> 0x0045 }
            r4.getClass()     // Catch:{ all -> 0x0045 }
            java.util.LinkedHashMap r4 = defpackage.dte.c     // Catch:{ all -> 0x0045 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0045 }
            java.lang.Object r3 = defpackage.ju7.Q(r4, r3)     // Catch:{ all -> 0x0045 }
            dte r3 = (defpackage.dte) r3     // Catch:{ all -> 0x0045 }
            int r3 = r3.ordinal()     // Catch:{ all -> 0x0045 }
            switch(r3) {
                case 0: goto L_0x007e;
                case 1: goto L_0x0075;
                case 2: goto L_0x006c;
                case 3: goto L_0x0067;
                case 4: goto L_0x005e;
                case 5: goto L_0x0055;
                case 6: goto L_0x0050;
                case 7: goto L_0x0047;
                default: goto L_0x003f;
            }     // Catch:{ all -> 0x0045 }
        L_0x003f:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x0045 }
            r6.<init>()     // Catch:{ all -> 0x0045 }
            throw r6     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r6 = move-exception
            goto L_0x0094
        L_0x0047:
            java.lang.String r3 = ct0.F(r5, r1)     // Catch:{ all -> 0x0045 }
            java.util.Set r3 = defpackage.a06.J(r3)     // Catch:{ all -> 0x0045 }
            goto L_0x0086
        L_0x0050:
            java.lang.String r3 = ct0.F(r5, r1)     // Catch:{ all -> 0x0045 }
            goto L_0x0086
        L_0x0055:
            boolean r3 = r5.readBoolean()     // Catch:{ all -> 0x0045 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0045 }
            goto L_0x0086
        L_0x005e:
            java.lang.String r3 = r5.readUTF()     // Catch:{ all -> 0x0045 }
            java.util.Set r3 = defpackage.a06.J(r3)     // Catch:{ all -> 0x0045 }
            goto L_0x0086
        L_0x0067:
            java.lang.String r3 = r5.readUTF()     // Catch:{ all -> 0x0045 }
            goto L_0x0086
        L_0x006c:
            long r3 = r5.readLong()     // Catch:{ all -> 0x0045 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0045 }
            goto L_0x0086
        L_0x0075:
            float r3 = r5.readFloat()     // Catch:{ all -> 0x0045 }
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch:{ all -> 0x0045 }
            goto L_0x0086
        L_0x007e:
            int r3 = r5.readInt()     // Catch:{ all -> 0x0045 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0045 }
        L_0x0086:
            r6.invoke(r2, r3)     // Catch:{ all -> 0x0045 }
            goto L_0x0019
        L_0x008a:
            r6 = 0
            defpackage.urd.l(r5, r6)     // Catch:{ all -> 0x0092 }
            defpackage.urd.l(r0, r6)
            goto L_0x00a0
        L_0x0092:
            r5 = move-exception
            goto L_0x009a
        L_0x0094:
            throw r6     // Catch:{ all -> 0x0095 }
        L_0x0095:
            r1 = move-exception
            defpackage.urd.l(r5, r6)     // Catch:{ all -> 0x0092 }
            throw r1     // Catch:{ all -> 0x0092 }
        L_0x009a:
            throw r5     // Catch:{ all -> 0x009b }
        L_0x009b:
            r6 = move-exception
            defpackage.urd.l(r0, r5)
            throw r6
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h2g.w(dy, bk):void");
    }

    public static c9 x(ija ija, boolean z, boolean z2) {
        if (z) {
            G(3, ija, false);
        }
        ija.s((int) ija.l(), f22.c);
        long l = ija.l();
        String[] strArr = new String[((int) l)];
        for (int i = 0; ((long) i) < l; i++) {
            strArr[i] = ija.s((int) ija.l(), f22.c);
        }
        if (!z2 || (ija.u() & 1) != 0) {
            return new c9(27, strArr);
        }
        throw ParserException.a((RuntimeException) null, "framing bit expected to be set");
    }

    public static final void y(File file, File file2) {
        if (!file.renameTo(file2)) {
            throw new IOException("Can't rename " + file + " to " + file2);
        }
    }

    public static void z(Drawable drawable, int i) {
        um4.g(drawable, i);
    }
}
