package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.ServiceConfigurationError;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;
import ru.ok.android.externcalls.TracerLibraryManifest;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: at7  reason: default package */
public abstract class at7 {
    public static volatile u3d A0;
    public static final duf X = new duf((Object) null, (Object) null, (Object) null);
    public static duf Y;
    public static final int[] Z = new int[2];
    public static volatile vd6 b;
    public static final Object c = new Object();
    public static volatile String o;
    public static hnc w0;
    public static boolean x0;
    public static q0a y0;
    public static final /* synthetic */ int z0 = 0;
    public final /* synthetic */ int a;

    public /* synthetic */ at7(int i) {
        this.a = i;
    }

    public static void A(View view, boolean z) {
        if (view != null) {
            view.setVisibility(z ? 8 : 0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003d, code lost:
        if (r0.length() > 0) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0076, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        defpackage.urd.l(r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007a, code lost:
        throw r0;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String B(android.content.Context r7) {
        /*
            java.lang.String r0 = "tracer"
            r1 = 0
            android.content.SharedPreferences r1 = r7.getSharedPreferences(r0, r1)
            java.lang.String r2 = "device_id"
            r3 = 0
            java.lang.String r4 = r1.getString(r2, r3)
            if (r4 != 0) goto L_0x0013
            java.lang.String r5 = "00000000-0000-0000-0000-000000000000"
            goto L_0x0014
        L_0x0013:
            r5 = r4
        L_0x0014:
            java.io.File r7 = r7.getFilesDir()     // Catch:{ IOException -> 0x007b }
            java.io.File r7 = defpackage.ng5.N(r7, r0)     // Catch:{ IOException -> 0x007b }
            defpackage.h2g.t(r7)     // Catch:{ IOException -> 0x007b }
            java.lang.String r0 = "device_id.txt"
            java.io.File r7 = defpackage.ng5.N(r7, r0)
            boolean r0 = r7.exists()
            if (r0 != 0) goto L_0x002d
        L_0x002b:
            r0 = r3
            goto L_0x003f
        L_0x002d:
            java.lang.String r0 = defpackage.ng5.M(r7)     // Catch:{ IOException -> 0x002b }
            java.lang.CharSequence r0 = defpackage.h0e.B0(r0)     // Catch:{ IOException -> 0x002b }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x002b }
            int r6 = r0.length()     // Catch:{ IOException -> 0x002b }
            if (r6 <= 0) goto L_0x002b
        L_0x003f:
            if (r0 == 0) goto L_0x0042
            return r0
        L_0x0042:
            if (r4 != 0) goto L_0x004d
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            goto L_0x004e
        L_0x004d:
            r0 = r4
        L_0x004e:
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{  }
            r6.<init>(r7)     // Catch:{  }
            java.nio.charset.Charset r7 = defpackage.e22.a     // Catch:{ all -> 0x0074 }
            byte[] r7 = r0.getBytes(r7)     // Catch:{ all -> 0x0074 }
            r6.write(r7)     // Catch:{ all -> 0x0074 }
            java.io.FileDescriptor r7 = r6.getFD()     // Catch:{ all -> 0x0074 }
            r7.sync()     // Catch:{ all -> 0x0074 }
            defpackage.urd.l(r6, r3)     // Catch:{  }
            if (r4 == 0) goto L_0x0073
            android.content.SharedPreferences$Editor r7 = r1.edit()
            android.content.SharedPreferences$Editor r7 = r7.remove(r2)
            r7.apply()
        L_0x0073:
            return r0
        L_0x0074:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r0 = move-exception
            defpackage.urd.l(r6, r7)     // Catch:{  }
            throw r0     // Catch:{  }
        L_0x007b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.at7.B(android.content.Context):java.lang.String");
    }

    public static void C(View view, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams.getMarginEnd() != i) {
            marginLayoutParams.setMarginEnd(i);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public static void D(View view, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams.getMarginStart() != i) {
            marginLayoutParams.setMarginStart(i);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public static void E(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static final int F(String str) {
        int length = str.length();
        if (length == 2) {
            StringBuilder sb = new StringBuilder("#");
            for (int i = 0; i < 8; i++) {
                sb.append(str.charAt(1));
            }
            return Color.parseColor(sb.toString());
        } else if (length == 4) {
            return Color.parseColor("#" + str.charAt(1) + str.charAt(1) + str.charAt(2) + str.charAt(2) + str.charAt(3) + str.charAt(3));
        } else if (length == 7) {
            return Color.parseColor(str);
        } else {
            if (length != 9) {
                return 0;
            }
            return Color.parseColor(str);
        }
    }

    public static final boe G(String str) {
        Set p = p();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((u3d) p).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (hhd.f(((boe) next).namespace(), str)) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() > 1) {
            StringBuilder m = hr1.m("More then one manifest found for ", str, ": ");
            m.append(o23.c0(arrayList, (String) null, (String) null, (String) null, x51.B0, 31));
            throw new IllegalStateException(m.toString().toString());
        } else if (arrayList.size() == 1) {
            return (boe) arrayList.get(0);
        } else {
            try {
                String str2 = str + ".TracerLibraryManifest";
                boe newInstance = Class.forName(str2).newInstance();
                if (hhd.f(newInstance.namespace(), str)) {
                    return newInstance;
                }
                throw new IllegalStateException(("Unexpected " + str2 + ".namespace()").toString());
            } catch (Throwable th) {
                NoSuchElementException noSuchElementException = new NoSuchElementException("No manifest found for ".concat(str));
                noSuchElementException.initCause(th);
                throw noSuchElementException;
            }
        }
    }

    public static void H(xzc xzc, String str) {
        int w = w(new v25(str).e(1, "Orientation"));
        if (w != 0) {
            Matrix matrix = new Matrix();
            matrix.setRotate((float) w);
            Bitmap decodeFile = BitmapFactory.decodeFile(str, (BitmapFactory.Options) null);
            Bitmap createBitmap = Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true);
            decodeFile.recycle();
            O(str, createBitmap, xzc);
            createBitmap.recycle();
        }
    }

    public static boolean I(xzc xzc, String str, String str2) {
        vqc vqc = (vqc) xzc;
        vqc.getClass();
        long j = (long) 1920;
        return J(str, str2, (int) vqc.o(PmsKey.image-width, j), (int) vqc.o(PmsKey.image-height, j), (int) (vqc.g.getFloat(PmsKey.image-quality.name(), 0.8f) * ((float) 100)));
    }

    public static boolean J(String str, String str2, int i, int i2, int i3) {
        Point r = r(str, false);
        int i4 = r.x;
        int i5 = r.y;
        if (i4 > i5) {
            int i6 = i2;
            i2 = i;
            i = i6;
        }
        if (i4 <= i && i5 <= i2) {
            return false;
        }
        int e = new v25(str).e(1, "Orientation");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = v(r, i, i2);
        Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
        try {
            M(str2, decodeFile, i3);
            v25 v25 = new v25(str2);
            v25.F("Orientation", String.valueOf(e));
            v25.B();
            return true;
        } finally {
            if (decodeFile != null) {
                decodeFile.recycle();
            }
        }
    }

    public static Bitmap K(int i, int i2, Bitmap bitmap) {
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        return (height < i || height > i2 || width < i || width > i2) ? (height < i || width < i) ? Bitmap.createScaledBitmap(bitmap, i, i, false) : Bitmap.createScaledBitmap(bitmap, i2, i2, false) : bitmap;
    }

    public static void L(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            Q(runnable, 0);
        }
    }

    public static void M(String str, Bitmap bitmap, int i) {
        N(str, bitmap, i, Bitmap.CompressFormat.JPEG);
    }

    public static void N(String str, Bitmap bitmap, int i, Bitmap.CompressFormat compressFormat) {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(str);
            try {
                bitmap.compress(compressFormat, i, fileOutputStream2);
                udd.p("at7", "save bitmap success! %s", str);
                ete.n(fileOutputStream2);
            } catch (IOException e) {
                e = e;
                fileOutputStream = fileOutputStream2;
                try {
                    udd.s("at7", "save bitmap failure!", e);
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    ete.n(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                ete.n(fileOutputStream);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            udd.s("at7", "save bitmap failure!", e);
            throw e;
        }
    }

    public static void O(String str, Bitmap bitmap, xzc xzc) {
        try {
            vqc vqc = (vqc) xzc;
            vqc.getClass();
            M(str, bitmap, (int) (vqc.g.getFloat(PmsKey.image-quality.name(), 0.8f) * ((float) 100)));
        } catch (IOException unused) {
        }
    }

    public static Bitmap P(int i, int i2, Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        float width = ((float) i) / ((float) bitmap.getWidth());
        float height = ((float) i2) / ((float) bitmap.getHeight());
        Matrix matrix = new Matrix();
        matrix.setScale(width, height, 0.0f, 0.0f);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setMatrix(matrix);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, new Paint(2));
        return createBitmap;
    }

    public static xi4 Q(Runnable runnable, long j) {
        return de.a().c(runnable, j, TimeUnit.MILLISECONDS);
    }

    public static void R(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(m4b.h(15, i, "csd-"), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    public static void S(ViewGroup viewGroup) {
        viewGroup.setEnabled(false);
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                if (childAt instanceof Spinner) {
                    Spinner spinner = (Spinner) childAt;
                    if (spinner.getSelectedView() != null) {
                        spinner.getSelectedView().setEnabled(false);
                    }
                } else if (childAt instanceof ViewGroup) {
                    S((ViewGroup) childAt);
                }
                childAt.setEnabled(false);
            }
        }
    }

    public static vn1 T(List list, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(ct0.A(((xc4) it.next()).c()));
        }
        return hwf.f(new xz(hwf.f(new b52(ct0.K(arrayList), scheduledExecutorService, 5000, 7)), executor, list, 6));
    }

    public static Bitmap U(Context context, int i) {
        Drawable b2 = gq3.b(context, i);
        if (b2 != null) {
            um4.h(b2, ColorStateList.valueOf(-16745729));
        }
        Bitmap createBitmap = Bitmap.createBitmap(b2.getIntrinsicWidth(), b2.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        b2.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        b2.draw(canvas);
        return createBitmap;
    }

    public static final String V(String str) {
        return (str == null || str.length() == 0) ? BuildConfig.FLAVOR : h0e.B0(h0e.k0(str, "https://max.ru/joincall/")).toString();
    }

    public static final String W(String str) {
        return (str == null || str.length() == 0) ? BuildConfig.FLAVOR : rf0.h("https://max.ru/joincall/", str);
    }

    public static jg8 X(Object obj) {
        return new jg8(obj.getClass().getSimpleName());
    }

    public static final void Y(kxc kxc, Object obj) {
        Object n = kxc.n(obj);
        if (!(n instanceof l12)) {
            jue jue = (jue) n;
            return;
        }
        Object obj2 = ((m12) xs7.M(bw4.a, new o12(kxc, obj, (Continuation) null))).a;
    }

    public static int a(int i, double d) {
        return (Double.hashCode(d) + i) * 31;
    }

    public static final LinkedHashMap b(AttributeSet attributeSet) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            linkedHashMap.put(attributeSet.getAttributeName(i), Integer.valueOf(i));
        }
        return linkedHashMap;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [er3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object d(defpackage.d5b r4, defpackage.s16 r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof defpackage.x4b
            if (r0 == 0) goto L_0x0013
            r0 = r6
            x4b r0 = (defpackage.x4b) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            x4b r0 = new x4b
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.X
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            s16 r5 = r0.o
            defpackage.wx3.H(r6)     // Catch:{ all -> 0x0029 }
            goto L_0x0066
        L_0x0029:
            r4 = move-exception
            goto L_0x006c
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0033:
            defpackage.wx3.H(r6)
            xhd r6 = xhd.c
            hu3 r2 = r0.b
            fu3 r6 = r2.get(r6)
            if (r6 != r4) goto L_0x0070
            r0.getClass()     // Catch:{ all -> 0x0029 }
            r0.o = r5     // Catch:{ all -> 0x0029 }
            r0.Y = r3     // Catch:{ all -> 0x0029 }
            zv1 r6 = new zv1     // Catch:{ all -> 0x0029 }
            kotlin.coroutines.Continuation r0 = defpackage.urd.y(r0)     // Catch:{ all -> 0x0029 }
            r6.<init>(r3, r0)     // Catch:{ all -> 0x0029 }
            r6.n()     // Catch:{ all -> 0x0029 }
            ty0 r0 = new ty0     // Catch:{ all -> 0x0029 }
            r2 = 9
            r0.<init>(r2, r6)     // Catch:{ all -> 0x0029 }
            a5b r4 = (defpackage.a5b) r4     // Catch:{ all -> 0x0029 }
            r4.k(r0)     // Catch:{ all -> 0x0029 }
            java.lang.Object r4 = r6.m()     // Catch:{ all -> 0x0029 }
            if (r4 != r1) goto L_0x0066
            return r1
        L_0x0066:
            r5.invoke()
            jue r4 = defpackage.jue.a
            return r4
        L_0x006c:
            r5.invoke()
            throw r4
        L_0x0070:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.at7.d(d5b, s16, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static void e(View view, int i) {
        if (view.getPaddingBottom() != i) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
        }
    }

    public static void f(View view, int i) {
        WeakHashMap weakHashMap = eaf.a;
        if (view.getPaddingEnd() != i) {
            view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), i, view.getPaddingBottom());
        }
    }

    public static void g(View view, int i) {
        WeakHashMap weakHashMap = eaf.a;
        if (view.getPaddingStart() != i) {
            view.setPaddingRelative(i, view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
        }
    }

    public static void h(View view, int i) {
        if (view.getPaddingTop() != i) {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public static c97 i(View view, j6 j6Var) {
        nu9 n = new n73(7, view).t(300, TimeUnit.MILLISECONDS).n(de.a());
        c97 c97 = new c97(new ric(j6Var), new lpa(17), z3d.i);
        n.a(c97);
        return c97;
    }

    public static void j(Rect rect, View view) {
        int[] iArr = Z;
        view.getLocationInWindow(iArr);
        int i = iArr[1];
        Rect rect2 = i < rect.top ? new Rect(0, rect.top - i, view.getWidth(), view.getHeight()) : null;
        if (view.getHeight() + i > rect.bottom) {
            int height = view.getHeight() - ((view.getHeight() + i) - rect.bottom);
            if (rect2 == null) {
                rect2 = new Rect(0, 0, view.getWidth(), height);
            } else {
                rect2.bottom = height;
            }
        }
        if (rect2 != null) {
            view.setClipBounds(rect2);
        } else {
            view.setClipBounds((Rect) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008c, code lost:
        if (defpackage.h0e.R(r14, "test-keys", false) != false) goto L_0x008e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01a6 A[LOOP:0: B:72:0x01a0->B:74:0x01a6, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final c9e k(android.content.Context r21) {
        /*
            c9e r16 = new c9e
            kd8 r0 = nne.c
            if (r0 == 0) goto L_0x0008
            r2 = r0
            goto L_0x0009
        L_0x0008:
            r2 = 0
        L_0x0009:
            java.lang.Object r2 = r2.a
            java.lang.String r2 = (java.lang.String) r2
            if (r0 == 0) goto L_0x0011
            r3 = r0
            goto L_0x0012
        L_0x0011:
            r3 = 0
        L_0x0012:
            long r3 = r3.o
            if (r0 == 0) goto L_0x0018
            r5 = r0
            goto L_0x0019
        L_0x0018:
            r5 = 0
        L_0x0019:
            java.lang.Object r5 = r5.b
            java.lang.String r5 = (java.lang.String) r5
            if (r0 == 0) goto L_0x0021
            r6 = r0
            goto L_0x0022
        L_0x0021:
            r6 = 0
        L_0x0022:
            java.lang.Object r6 = r6.X
            java.lang.String r6 = (java.lang.String) r6
            if (r0 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            java.lang.Object r0 = r0.c
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = p3d.a
            java.lang.String r9 = android.os.Build.MODEL
            java.lang.String r10 = t(r21)
            java.lang.String r11 = android.os.Build.MANUFACTURER
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.String r12 = java.lang.String.valueOf(r0)
            android.app.ActivityManager$RunningAppProcessInfo r13 = new android.app.ActivityManager$RunningAppProcessInfo
            r13.<init>()
            android.app.ActivityManager.getMyMemoryState(r13)
            int r13 = r13.importance
            r15 = 100
            r17 = 1
            if (r13 == r15) goto L_0x0056
            r15 = 200(0xc8, float:2.8E-43)
            if (r13 != r15) goto L_0x0054
            goto L_0x0056
        L_0x0054:
            r13 = 0
            goto L_0x0058
        L_0x0056:
            r13 = r17
        L_0x0058:
            r13 = r13 ^ 1
            android.content.ContentResolver r15 = r21.getContentResolver()
            java.lang.String r1 = "android_id"
            java.lang.String r1 = android.provider.Settings.Secure.getString(r15, r1)
            java.lang.String r15 = android.os.Build.PRODUCT
            java.lang.String r14 = "sdk"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x007b
            java.lang.String r14 = "google_sdk"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x007b
            if (r1 != 0) goto L_0x0079
            goto L_0x007b
        L_0x0079:
            r1 = 0
            goto L_0x007d
        L_0x007b:
            r1 = r17
        L_0x007d:
            java.lang.String r14 = android.os.Build.TAGS
            if (r1 != 0) goto L_0x0091
            if (r14 == 0) goto L_0x0091
            java.lang.String r15 = "test-keys"
            r18 = r13
            r13 = 0
            boolean r14 = defpackage.h0e.R(r14, r15, r13)
            if (r14 == 0) goto L_0x0093
        L_0x008e:
            r13 = r17
            goto L_0x00b2
        L_0x0091:
            r18 = r13
        L_0x0093:
            java.io.File r13 = new java.io.File
            java.lang.String r14 = "/system/app/Superuser.apk"
            r13.<init>(r14)
            boolean r13 = r13.exists()
            if (r13 == 0) goto L_0x00a1
            goto L_0x008e
        L_0x00a1:
            java.io.File r13 = new java.io.File
            java.lang.String r14 = "/system/xbin/su"
            r13.<init>(r14)
            if (r1 != 0) goto L_0x00b1
            boolean r1 = r13.exists()
            if (r1 == 0) goto L_0x00b1
            goto L_0x008e
        L_0x00b1:
            r13 = 0
        L_0x00b2:
            ht7 r1 = new ht7
            r1.<init>()
            r21.getApplicationContext()
            java.lang.String r14 = android.os.Build.BOARD
            java.lang.String r15 = "board"
            r1.put(r15, r14)
            java.lang.String r14 = android.os.Build.BRAND
            java.lang.String r15 = "brand"
            r1.put(r15, r14)
            java.lang.String r14 = ", "
            java.lang.String[] r15 = android.os.Build.SUPPORTED_ABIS
            java.lang.String r14 = android.text.TextUtils.join(r14, r15)
            java.lang.String r15 = "cpuABI"
            r1.put(r15, r14)
            java.lang.String r14 = android.os.Build.DEVICE
            java.lang.String r15 = "device"
            r1.put(r15, r14)
            java.lang.String r14 = "manufacturer"
            r1.put(r14, r11)
            java.lang.String r14 = "model"
            r1.put(r14, r9)
            java.lang.Runtime r14 = java.lang.Runtime.getRuntime()
            int r14 = r14.availableProcessors()
            java.lang.String r14 = java.lang.String.valueOf(r14)
            java.lang.String r15 = "cpuCount"
            r1.put(r15, r14)
            java.lang.String r14 = java.lang.String.valueOf(r0)
            java.lang.String r15 = "osVersionSdkInt"
            r1.put(r15, r14)
            java.lang.String r14 = android.os.Build.VERSION.RELEASE
            java.lang.String r15 = "osVersionRelease"
            r1.put(r15, r14)
            java.lang.String r14 = defpackage.xs7.B()
            java.lang.String r15 = r21.getPackageName()
            boolean r17 = r14.equals(r15)
            if (r17 == 0) goto L_0x011d
            r20 = r11
            r19 = r12
            r17 = r13
            r14 = 0
            goto L_0x013b
        L_0x011d:
            r17 = r13
            r13 = 58
            r19 = r12
            r12 = 6
            r20 = r11
            r11 = 0
            int r12 = defpackage.h0e.Z(r14, r13, r11, r11, r12)
            int r13 = r15.length()
            if (r12 != r13) goto L_0x013b
            boolean r11 = defpackage.p0e.Q(r14, r15, r11)
            if (r11 == 0) goto L_0x013b
            java.lang.String r14 = r14.substring(r12)
        L_0x013b:
            if (r14 == 0) goto L_0x0145
            java.lang.String r11 = "processName"
            java.lang.Object r11 = r1.put(r11, r14)
            java.lang.String r11 = (java.lang.String) r11
        L_0x0145:
            java.lang.String r11 = "phone"
            r12 = r21
            java.lang.Object r11 = r12.getSystemService(r11)
            boolean r13 = r11 instanceof android.telephony.TelephonyManager
            if (r13 == 0) goto L_0x0154
            android.telephony.TelephonyManager r11 = (android.telephony.TelephonyManager) r11
            goto L_0x0155
        L_0x0154:
            r11 = 0
        L_0x0155:
            if (r11 == 0) goto L_0x015c
            java.lang.String r11 = r11.getNetworkOperatorName()
            goto L_0x015d
        L_0x015c:
            r11 = 0
        L_0x015d:
            if (r11 == 0) goto L_0x0167
            java.lang.String r13 = "operatorName"
            java.lang.Object r11 = r1.put(r13, r11)
            java.lang.String r11 = (java.lang.String) r11
        L_0x0167:
            android.content.pm.PackageManager r11 = r21.getPackageManager()
            java.lang.String r12 = r21.getPackageName()
            r13 = 30
            if (r0 < r13) goto L_0x017c
            android.content.pm.InstallSourceInfo r0 = r11.getInstallSourceInfo(r12)
            java.lang.String r0 = hia.o(r0)
            goto L_0x0180
        L_0x017c:
            java.lang.String r0 = r11.getInstallerPackageName(r12)
        L_0x0180:
            if (r0 == 0) goto L_0x0187
            java.lang.String r11 = "installer"
            r1.put(r11, r0)
        L_0x0187:
            ht7 r14 = r1.b()
            java.util.Set r0 = p()
            java.util.ArrayList r1 = new java.util.ArrayList
            r11 = 10
            int r11 = defpackage.q23.H(r0, r11)
            r1.<init>(r11)
            u3d r0 = (defpackage.u3d) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x01a0:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x01c9
            java.lang.Object r11 = r0.next()
            boe r11 = (boe) r11
            lk6 r12 = new lk6
            java.lang.String r13 = r11.namespace()
            java.lang.String r15 = r11.versionName()
            r21 = r0
            java.lang.String r0 = r11.buildUuid()
            java.lang.String r11 = r11.environment()
            r12.<init>(r13, r15, r0, r11)
            r1.add(r12)
            r0 = r21
            goto L_0x01a0
        L_0x01c9:
            java.util.Set r15 = defpackage.o23.w0(r1)
            r0 = r16
            r1 = r2
            r2 = r3
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r20
            r11 = r19
            r12 = r18
            r13 = r17
            r0.<init>(r1, r2, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.at7.k(android.content.Context):c9e");
    }

    public static boolean o(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static final Set p() {
        u3d u3d = A0;
        if (u3d != null) {
            return u3d;
        }
        u3d u3d2 = new u3d();
        try {
            for (Object add : Arrays.asList(new boe[]{new TracerLibraryManifest(), new ru.ok.android.externcalls.sdk.audio.TracerLibraryManifest(), new wne()})) {
                u3d2.add(add);
            }
            A0 = u3d2;
            return z3d.h(u3d2);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static Point q(FileDescriptor fileDescriptor, int i) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFileDescriptor(fileDescriptor, (Rect) null, options);
        Point point = new Point(options.outWidth, options.outHeight);
        return (i == 6 || i == 8) ? new Point(point.y, point.x) : point;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Point r(java.lang.String r2, boolean r3) {
        /*
            r0 = 1
            if (r3 == 0) goto L_0x000f
            v25 r3 = new v25     // Catch:{ IOException -> 0x000f }
            r3.<init>((java.lang.String) r2)     // Catch:{ IOException -> 0x000f }
            java.lang.String r1 = "Orientation"
            int r3 = r3.e(r0, r1)     // Catch:{ IOException -> 0x000f }
            goto L_0x0010
        L_0x000f:
            r3 = r0
        L_0x0010:
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            r1.inJustDecodeBounds = r0
            android.graphics.BitmapFactory.decodeFile(r2, r1)
            android.graphics.Point r2 = new android.graphics.Point
            int r0 = r1.outWidth
            int r1 = r1.outHeight
            r2.<init>(r0, r1)
            r0 = 6
            if (r3 == r0) goto L_0x002a
            r0 = 8
            if (r3 != r0) goto L_0x0034
        L_0x002a:
            android.graphics.Point r3 = new android.graphics.Point
            int r0 = r2.y
            int r2 = r2.x
            r3.<init>(r0, r2)
            r2 = r3
        L_0x0034:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.at7.r(java.lang.String, boolean):android.graphics.Point");
    }

    public static int[] s(int i, int i2, int i3, int i4) {
        float f = (float) i4;
        float f2 = (float) i3;
        int i5 = (int) ((f / f2) * ((float) i));
        if (i5 > i2) {
            i = (int) ((f2 / f) * ((float) i2));
        } else {
            i2 = i5;
        }
        Size size = new Size(i, i2);
        return new int[]{size.getWidth(), size.getHeight()};
    }

    public static final String t(Context context) {
        String str = o;
        if (str != null) {
            return str;
        }
        synchronized (c) {
            String str2 = o;
            if (str2 != null) {
                return str2;
            }
            String B = B(context.getApplicationContext());
            o = B;
            return B;
        }
    }

    public static final Uri u(Cursor cursor, int i) {
        Object obj;
        try {
            obj = cursor.getString(i);
        } catch (Throwable th) {
            obj = new kcc(th);
        }
        if (obj instanceof kcc) {
            obj = null;
        }
        String str = (String) obj;
        if (!(str == null || str.length() == 0)) {
            try {
                if (lp.o(str)) {
                    return x(str);
                }
                return null;
            } catch (Throwable th2) {
                udd.S("LocalMediaRepository:Cursor:getUri", "Failure Uri.fromFile(File(" + str + "))", th2);
            }
        }
        return null;
    }

    public static int v(Point point, int i, int i2) {
        int i3 = 1;
        while (true) {
            if (point.x / i3 <= i && point.y / i3 <= i2) {
                return i3;
            }
            i3 *= 2;
        }
    }

    public static int w(int i) {
        if (i == 3) {
            return 180;
        }
        if (i != 6) {
            return i != 8 ? 0 : 270;
        }
        return 90;
    }

    public static Uri x(String str) {
        String y = y(str);
        if (TextUtils.isEmpty(y)) {
            return null;
        }
        return Uri.parse(y);
    }

    public static String y(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Pattern pattern = ehe.a;
        return (!str.regionMatches(true, 0, "file:", 0, 5) && !str.regionMatches(true, 0, "http", 0, 4) && !str.regionMatches(true, 0, "content", 0, 7) && !str.regionMatches(true, 0, "android.resource:/", 0, 18) && !str.regionMatches(true, 0, "res:/", 0, 5)) ? "file:".concat(str) : str;
    }

    public static final void z(nl0 nl0) {
        if (nl0.a()) {
            ((View) nl0.getValue()).setVisibility(8);
        }
    }

    public a39 l(f39 f39) {
        ByteBuffer byteBuffer = f39.X;
        byteBuffer.getClass();
        oyb.d(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return m(f39, byteBuffer);
    }

    public abstract a39 m(f39 f39, ByteBuffer byteBuffer);

    public abstract Object n();

    public String toString() {
        switch (this.a) {
            case 10:
                return n().toString();
            default:
                return super.toString();
        }
    }
}
