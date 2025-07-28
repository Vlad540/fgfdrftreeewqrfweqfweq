package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraCharacteristics;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Environment;
import android.os.RemoteException;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.view.Menu;
import android.webkit.MimeTypeMap;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: js  reason: default package */
public abstract class js {
    public static final Continuation[] a = new Continuation[0];
    public static final xb4 b = new xb4(4);
    public static final Object c = new Object();
    public static final /* synthetic */ int d = 0;
    public static ScheduledExecutorService e;
    public static sma f;

    public static long A(long... jArr) {
        if (jArr.length > 0) {
            long j = jArr[0];
            for (int i = 1; i < jArr.length; i++) {
                long j2 = jArr[i];
                if (j2 > j) {
                    j = j2;
                }
            }
            return j;
        }
        throw new IllegalArgumentException();
    }

    public static void B(at4 at4, ByteBuffer byteBuffer, int i, long j) {
        int b2;
        byteBuffer.position(0);
        byteBuffer.limit(i);
        while (byteBuffer.remaining() > 0 && (b2 = at4.b(j, byteBuffer)) != -1) {
            j += (long) b2;
        }
        if (byteBuffer.remaining() <= 0) {
            byteBuffer.position(0);
            return;
        }
        throw new UnsatisfiedLinkError("ELF file truncated");
    }

    public static void C(String str, boolean z, f03 f03) {
        if (z) {
            ((i03) f03).l("app.chat.background.dark.id", str);
        } else {
            ((i03) f03).l("app.chat.background.light.id", str);
        }
    }

    public static final void D(Drawable drawable, int i) {
        if (drawable != null) {
            um4.g(drawable, i);
            um4.i(drawable, PorterDuff.Mode.SRC_IN);
        }
    }

    public static final void E(ProgressBar progressBar, int i) {
        Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
        if (indeterminateDrawable == null) {
            indeterminateDrawable = progressBar.getProgressDrawable();
        }
        if (indeterminateDrawable != null) {
            D(indeterminateDrawable, i);
        }
    }

    public static JSONArray F(Iterable iterable) {
        String str;
        JSONArray jSONArray = new JSONArray();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            d3d d3d = (d3d) it.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("versionName", d3d.b);
            jSONObject.put("versionCode", d3d.a);
            jSONObject.put("environment", d3d.c);
            jSONObject.put("sessionUuid", d3d.d);
            jSONObject.put("processName", d3d.e);
            int i = d3d.f;
            if (i == 1) {
                str = "BLANK";
            } else if (i == 2) {
                str = "CRASH";
            } else if (i == 3) {
                str = "ANR";
            } else if (i == 4) {
                str = "NATIVE";
            } else {
                throw null;
            }
            jSONObject.put("status", str);
            z9d z9d = d3d.g;
            jSONObject.put("maxSeverity", z9d != null ? z9d.equals(z9d.c) ? "FATAL" : z9d.equals(z9d.o) ? "ERROR" : z9d.equals(z9d.X) ? "WARNING" : z9d.equals(z9d.Y) ? "NOTICE" : z9d.equals(z9d.Z) ? "INFO" : "DEBUG" : null);
            jSONObject.put("isInBackground", d3d.h);
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public static ArrayList G(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(Long.valueOf(jSONArray.getLong(i)));
            }
            return arrayList;
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static RectF H(float[] fArr) {
        RectF rectF = new RectF(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
        for (int i = 1; i < fArr.length; i += 2) {
            float round = ((float) Math.round(fArr[i - 1] * 10.0f)) / 10.0f;
            float round2 = ((float) Math.round(fArr[i] * 10.0f)) / 10.0f;
            float f2 = rectF.left;
            if (round < f2) {
                f2 = round;
            }
            rectF.left = f2;
            float f3 = rectF.top;
            if (round2 < f3) {
                f3 = round2;
            }
            rectF.top = f3;
            float f4 = rectF.right;
            if (round <= f4) {
                round = f4;
            }
            rectF.right = round;
            float f5 = rectF.bottom;
            if (round2 <= f5) {
                round2 = f5;
            }
            rectF.bottom = round2;
        }
        rectF.sort();
        return rectF;
    }

    public static final void I(bve bve) {
        bve.c(z24.class, new w8d(14));
        bve.e(i57.class, new vrd(25));
        bve.e(m53.class, new vrd(26));
        bve.e(p86.class, new yud(1));
        bve.e(b96.class, new yud(2));
        bve.e(kff.class, new yud(3));
        Class<pf4> cls = pf4.class;
        bve.c(cls, new w8d(15));
        Class<q57> cls2 = q57.class;
        bve.c(cls2, new w8d(16));
        bve.c(cls2, new w8d(17));
        bve.c(cls2, new w8d(18));
        bve.c(cls2, new w8d(19));
        bve.c(cls2, new w8d(20));
        bve.c(cls, new w8d(21));
        bve.c(cls2, new w8d(22));
        bve.c(cls, new w8d(13));
    }

    public static void a(wce wce, TextView textView, int i) {
        int i2 = wce.k;
        int i3 = wce.l;
        textView.setBackground(swb.c(i2, wce.i, n1g.c0(i2, 0.3f), i));
        textView.setTextColor(new ColorStateList(new int[][]{new int[]{16842919}, new int[]{-16842910}, new int[0]}, new int[]{i3, i3, i3}));
    }

    public static final void b(wce wce, Menu menu, Integer num) {
        if (menu != null) {
            int size = menu.size();
            for (int i = 0; i < size; i++) {
                Drawable icon = menu.getItem(i).getIcon();
                if (icon != null) {
                    D(icon, num != null ? num.intValue() : wce.w);
                }
            }
        }
    }

    public static final void c(wce wce, SwitchCompat switchCompat) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        switchCompat.setTextColor(wce.F);
        if (!wce.equals(db4.e0) && (num = wce.W) != null && (num2 = wce.V) != null && (num3 = wce.Y) != null && (num4 = wce.X) != null) {
            switchCompat.setThumbTintList(new ColorStateList(new int[][]{new int[]{16842912}, new int[0]}, new int[]{num.intValue(), num2.intValue()}));
            switchCompat.setTrackTintList(new ColorStateList(new int[][]{new int[]{16842912}, new int[0]}, new int[]{num3.intValue(), num4.intValue()}));
        }
    }

    public static final void d(wce wce, Toolbar toolbar, TextView textView, TextView textView2, int i, int i2) {
        if (toolbar != null) {
            toolbar.setPopupTheme(wce.j);
            toolbar.setBackgroundColor(wce.N);
            Drawable navigationIcon = toolbar.getNavigationIcon();
            int i3 = wce.w;
            if (navigationIcon != null) {
                navigationIcon.mutate();
                navigationIcon.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
            }
            Drawable overflowIcon = toolbar.getOverflowIcon();
            if (overflowIcon != null) {
                D(overflowIcon, i3);
            }
            try {
                Field declaredField = Toolbar.class.getDeclaredField("x0");
                declaredField.setAccessible(true);
                ((Drawable) declaredField.get(toolbar)).mutate().setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
            } catch (Exception e2) {
                udd.s("ThemeHelper", "applyToToolbar: ", e2);
            }
        }
        if (textView != null) {
            textView.setTextColor(i);
        }
        if (textView2 != null) {
            textView2.setTextColor(i2);
        }
    }

    public static String e(String str) {
        if (r1g.p(str) || ".".equals(str) || "..".equals(str)) {
            return "(invalid)";
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if ((charAt >= 0 && charAt <= 31) || charAt == '\"' || charAt == '*' || charAt == '/' || charAt == ':' || charAt == '<' || charAt == '\\' || charAt == '|' || charAt == 127 || charAt == '>' || charAt == '?') {
                sb.append('_');
            } else {
                sb.append(charAt);
            }
        }
        byte[] bytes = sb.toString().getBytes(StandardCharsets.UTF_8);
        if (bytes.length > 255) {
            while (bytes.length > 252) {
                sb.deleteCharAt(sb.length() / 2);
                bytes = sb.toString().getBytes(StandardCharsets.UTF_8);
            }
            sb.insert(sb.length() / 2, "...");
        }
        return sb.toString();
    }

    public static final String f(Long l, Long l2) {
        int compareTo = l2.compareTo(l);
        return compareTo > 0 ? "<" : compareTo < 0 ? ">" : "=";
    }

    public static au9 g(OneMeRoomDatabase oneMeRoomDatabase, String[] strArr, Callable callable) {
        Executor executor = oneMeRoomDatabase.b;
        if (executor == null) {
            executor = null;
        }
        oid oid = cnc.a;
        y15 y15 = new y15(executor, false);
        return new au9(new ov9(new n73(2, new w48((Object) strArr, 27, (Object) oneMeRoomDatabase)).r(y15), y15, 1).n(y15), new ss8(29, new ox7(callable)), 0);
    }

    public static float h(float f2, float f3, float f4) {
        float f5 = f2 / (f4 / 2.0f);
        float f6 = f3 / 2.0f;
        if (f5 < 1.0f) {
            return (f6 * f5 * f5 * f5) + 0.0f;
        }
        float f7 = f5 - 2.0f;
        return (((f7 * f7 * f7) + 2.0f) * f6) + 0.0f;
    }

    public static final int i(int i, Object obj) {
        return (i * 31) + (obj != null ? obj.hashCode() : 0);
    }

    public static String[] j(at4 at4) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        int i;
        long j6;
        long j7;
        long j8;
        long j9;
        char c2;
        long j10;
        long j11;
        long j12;
        short s;
        long j13;
        long j14;
        long j15;
        long j16;
        at4 at42 = at4;
        int i2 = 8;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        long v = v(at42, allocate, 0);
        if (v == 1179403647) {
            B(at42, allocate, 1, 4);
            boolean z = ((short) (allocate.get() & 255)) == 1;
            B(at42, allocate, 1, 5);
            if (((short) (allocate.get() & 255)) == 2) {
                allocate.order(ByteOrder.BIG_ENDIAN);
            }
            if (z) {
                j = v(at42, allocate, 28);
            } else {
                B(at42, allocate, 8, 32);
                j = allocate.getLong();
            }
            if (z) {
                B(at42, allocate, 2, 44);
                j2 = (long) (allocate.getShort() & 65535);
            } else {
                B(at42, allocate, 2, 56);
                j2 = (long) (allocate.getShort() & 65535);
            }
            B(at42, allocate, 2, z ? 42 : 54);
            short s2 = allocate.getShort() & 65535;
            if (j2 == 65535) {
                if (z) {
                    j16 = v(at42, allocate, 32);
                } else {
                    B(at42, allocate, 8, 40);
                    j16 = allocate.getLong();
                }
                j2 = z ? v(at42, allocate, j16 + 28) : v(at42, allocate, j16 + 44);
            }
            long j17 = j;
            long j18 = 0;
            while (true) {
                if (j18 >= j2) {
                    j3 = 0;
                    break;
                }
                if ((z ? v(at42, allocate, j17) : v(at42, allocate, j17)) != 2) {
                    j17 += (long) s2;
                    j18++;
                } else if (z) {
                    j3 = v(at42, allocate, j17 + 4);
                } else {
                    B(at42, allocate, 8, j17 + 8);
                    j3 = allocate.getLong();
                }
            }
            if (j3 != 0) {
                long j19 = j3;
                int i3 = 0;
                long j20 = 0;
                while (true) {
                    if (z) {
                        j4 = v(at42, allocate, j19);
                    } else {
                        B(at42, allocate, i2, j19);
                        j4 = allocate.getLong();
                    }
                    char c3 = 65535;
                    if (j4 != 1) {
                        j5 = j3;
                        if (j4 == 5) {
                            if (z) {
                                j15 = v(at42, allocate, j19 + 4);
                            } else {
                                B(at42, allocate, 8, j19 + 8);
                                j15 = allocate.getLong();
                            }
                            j20 = j15;
                        }
                    } else if (i3 != Integer.MAX_VALUE) {
                        i3++;
                        j5 = j3;
                    } else {
                        throw new UnsatisfiedLinkError("malformed DT_NEEDED section");
                    }
                    j19 += z ? 8 : 16;
                    if (j4 != 0) {
                        long j21 = j2;
                        long j22 = j20;
                        j2 = j21;
                        j3 = j5;
                        i2 = 8;
                    } else if (j20 != 0) {
                        long j23 = j;
                        int i4 = 0;
                        while (true) {
                            if (((long) i4) >= j2) {
                                i = i3;
                                j6 = 0;
                                j7 = 0;
                                break;
                            }
                            if ((z ? v(at42, allocate, j23) : v(at42, allocate, j23)) == 1) {
                                if (z) {
                                    j11 = j2;
                                    j12 = v(at42, allocate, j23 + 8);
                                } else {
                                    j11 = j2;
                                    B(at42, allocate, 8, j23 + 16);
                                    j12 = allocate.getLong();
                                }
                                if (z) {
                                    j13 = v(at42, allocate, j23 + 20);
                                    s = s2;
                                    i = i3;
                                } else {
                                    s = s2;
                                    i = i3;
                                    B(at42, allocate, 8, j23 + 40);
                                    j13 = allocate.getLong();
                                }
                                if (j12 > j20 || j20 >= j13 + j12) {
                                    s2 = s;
                                } else {
                                    if (z) {
                                        j14 = v(at42, allocate, j23 + 4);
                                    } else {
                                        B(at42, allocate, 8, j23 + 8);
                                        j14 = allocate.getLong();
                                    }
                                    j7 = j14 + (j20 - j12);
                                    j6 = 0;
                                }
                            } else {
                                i = i3;
                                j11 = j2;
                            }
                            j23 += (long) s2;
                            i4++;
                            i3 = i;
                            j2 = j11;
                        }
                        if (j7 != j6) {
                            int i5 = i;
                            String[] strArr = new String[i5];
                            long j24 = j5;
                            int i6 = 0;
                            while (true) {
                                if (z) {
                                    j8 = v(at42, allocate, j24);
                                } else {
                                    B(at42, allocate, 8, j24);
                                    j8 = allocate.getLong();
                                }
                                if (j8 == 1) {
                                    if (z) {
                                        j10 = v(at42, allocate, j24 + 4);
                                    } else {
                                        B(at42, allocate, 8, j24 + 8);
                                        j10 = allocate.getLong();
                                    }
                                    long j25 = j10 + j7;
                                    StringBuilder sb = new StringBuilder();
                                    while (true) {
                                        long j26 = j25 + 1;
                                        j9 = j7;
                                        B(at42, allocate, 1, j25);
                                        short s3 = (short) (allocate.get() & 255);
                                        if (s3 == 0) {
                                            break;
                                        }
                                        sb.append((char) s3);
                                        j25 = j26;
                                        j7 = j9;
                                    }
                                    strArr[i6] = sb.toString();
                                    c2 = 65535;
                                    if (i6 != Integer.MAX_VALUE) {
                                        i6++;
                                    } else {
                                        throw new UnsatisfiedLinkError("malformed DT_NEEDED section");
                                    }
                                } else {
                                    j9 = j7;
                                    c2 = c3;
                                }
                                j24 += z ? 8 : 16;
                                if (j8 != 0) {
                                    c3 = c2;
                                    j7 = j9;
                                } else if (i6 == i5) {
                                    return strArr;
                                } else {
                                    throw new UnsatisfiedLinkError("malformed DT_NEEDED section");
                                }
                            }
                        } else {
                            throw new UnsatisfiedLinkError("did not find file offset of DT_STRTAB table");
                        }
                    } else {
                        throw new UnsatisfiedLinkError("Dynamic section string-table not found");
                    }
                }
            } else {
                throw new UnsatisfiedLinkError("ELF file does not contain dynamic linking information");
            }
        } else {
            throw new UnsatisfiedLinkError("file is not ELF: magic is 0x" + Long.toHexString(v) + ", it should be " + Long.toHexString(1179403647));
        }
    }

    public static ArrayList k(String str) {
        int i;
        z9d z9d;
        JSONArray jSONArray = new JSONArray(str);
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        int i2 = 0;
        while (i2 < length) {
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            String string = jSONObject.getString("versionName");
            long j = jSONObject.getLong("versionCode");
            String optString = jSONObject.optString("environment", BuildConfig.FLAVOR);
            String str2 = optString.length() > 0 ? optString : null;
            String optString2 = jSONObject.optString("sessionUuid", BuildConfig.FLAVOR);
            if (optString2.length() <= 0) {
                optString2 = null;
            }
            if (optString2 == null) {
                optString2 = UUID.randomUUID().toString();
            }
            String optString3 = jSONObject.optString("processName", BuildConfig.FLAVOR);
            if (optString3.length() <= 0) {
                optString3 = null;
            }
            String string2 = jSONObject.getString("status");
            if (string2 != null) {
                if (string2.equals("BLANK")) {
                    i = 1;
                } else if (string2.equals("CRASH")) {
                    i = 2;
                } else if (string2.equals("ANR")) {
                    i = 3;
                } else if (string2.equals("NATIVE")) {
                    i = 4;
                } else {
                    throw new IllegalArgumentException("No enum constant ru.ok.tracer.session.SessionState.Status.".concat(string2));
                }
                String optString4 = jSONObject.optString("maxSeverity", BuildConfig.FLAVOR);
                if (optString4.length() <= 0) {
                    optString4 = null;
                }
                if (optString4 != null) {
                    int hashCode = optString4.hashCode();
                    z9d = z9d.w0;
                    switch (hashCode) {
                        case -1986360616:
                            if (optString4.equals("NOTICE")) {
                                z9d = z9d.Y;
                                break;
                            } else {
                                break;
                            }
                        case 2251950:
                            if (optString4.equals("INFO")) {
                                z9d = z9d.Z;
                                break;
                            } else {
                                break;
                            }
                        case 64921139:
                            boolean equals = optString4.equals("DEBUG");
                            break;
                        case 66247144:
                            if (optString4.equals("ERROR")) {
                                z9d = z9d.o;
                                break;
                            } else {
                                break;
                            }
                        case 66665700:
                            if (optString4.equals("FATAL")) {
                                z9d = z9d.c;
                                break;
                            } else {
                                break;
                            }
                        case 1842428796:
                            if (optString4.equals("WARNING")) {
                                z9d = z9d.X;
                                break;
                            } else {
                                break;
                            }
                    }
                } else {
                    z9d = null;
                }
                arrayList.add(new d3d(j, string, str2, optString2, optString3, i, z9d, jSONObject.optBoolean("isInBackground")));
                i2++;
            } else {
                throw new NullPointerException("Name is null");
            }
        }
        return arrayList;
    }

    public static String l(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments == null || pathSegments.size() <= 2) {
            return null;
        }
        String str = pathSegments.get(0);
        if (r1g.p(str) || !str.equalsIgnoreCase("external_files")) {
            return null;
        }
        Uri.Builder buildUpon = Uri.fromFile(Environment.getExternalStorageDirectory()).buildUpon();
        for (int i = 1; i < pathSegments.size(); i++) {
            buildUpon.appendPath(pathSegments.get(i));
        }
        String path = buildUpon.build().getPath();
        if (lp.o(path)) {
            return path;
        }
        return null;
    }

    public static String m(f03 f03, boolean z) {
        return z ? ((i03) f03).g.getString("app.chat.background.dark.id", (String) null) : ((i03) f03).g.getString("app.chat.background.light.id", (String) null);
    }

    public static ColorStateList n(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (drawable instanceof ColorStateListDrawable) {
            return ((ColorStateListDrawable) drawable).getColorStateList();
        }
        return null;
    }

    public static float[] o(RectF rectF) {
        float f2 = rectF.left;
        float f3 = rectF.top;
        float f4 = rectF.right;
        float f5 = rectF.bottom;
        return new float[]{f2, f3, f4, f3, f4, f5, f2, f5};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0063, code lost:
        if (r10 != null) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0065, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007a, code lost:
        if (r10 != null) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007d, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String p(android.content.Context r10, android.net.Uri r11, java.lang.String r12, java.lang.String[] r13) {
        /*
            java.lang.String r0 = "file://"
            java.lang.String r1 = java.util.Arrays.toString(r13)
            java.lang.Object[] r1 = new java.lang.Object[]{r11, r12, r1}
            java.lang.String r2 = "getDataColumn: uri = %s, selection = %s, selection args = %s"
            java.lang.String r3 = "js"
            defpackage.udd.p(r3, r2, r1)
            java.lang.String r1 = "_data"
            java.lang.String[] r6 = new java.lang.String[]{r1}
            r2 = 0
            android.content.ContentResolver r4 = r10.getContentResolver()     // Catch:{ Exception -> 0x006b, all -> 0x0069 }
            r9 = 0
            r5 = r11
            r7 = r12
            r8 = r13
            android.database.Cursor r10 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x006b, all -> 0x0069 }
            if (r10 == 0) goto L_0x0063
            boolean r12 = r10.moveToFirst()     // Catch:{ Exception -> 0x005d }
            if (r12 == 0) goto L_0x0063
            int r12 = r10.getColumnIndexOrThrow(r1)     // Catch:{ Exception -> 0x005d }
            java.lang.String r12 = r10.getString(r12)     // Catch:{ Exception -> 0x005d }
            boolean r13 = defpackage.r1g.p(r12)     // Catch:{ Exception -> 0x005d }
            if (r13 == 0) goto L_0x003e
            r10.close()
            return r2
        L_0x003e:
            java.lang.String r13 = "/"
            boolean r13 = r12.startsWith(r13)     // Catch:{ Exception -> 0x005d }
            if (r13 == 0) goto L_0x004a
            r10.close()
            return r12
        L_0x004a:
            boolean r13 = r12.startsWith(r0)     // Catch:{ Exception -> 0x005d }
            if (r13 == 0) goto L_0x005f
            java.lang.String r13 = ""
            java.lang.String r11 = r12.replace(r0, r13)     // Catch:{ Exception -> 0x005d }
            r10.close()
            return r11
        L_0x005a:
            r11 = move-exception
            r2 = r10
            goto L_0x007e
        L_0x005d:
            r12 = move-exception
            goto L_0x006d
        L_0x005f:
            r10.close()
            return r2
        L_0x0063:
            if (r10 == 0) goto L_0x007d
        L_0x0065:
            r10.close()
            goto L_0x007d
        L_0x0069:
            r11 = move-exception
            goto L_0x007e
        L_0x006b:
            r12 = move-exception
            r10 = r2
        L_0x006d:
            java.lang.String r13 = "getDataColumn: error for uri = %s, e = %s"
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x005a }
            java.lang.Object[] r11 = new java.lang.Object[]{r11, r12}     // Catch:{ all -> 0x005a }
            defpackage.udd.t(r3, r13, r11)     // Catch:{ all -> 0x005a }
            if (r10 == 0) goto L_0x007d
            goto L_0x0065
        L_0x007d:
            return r2
        L_0x007e:
            if (r2 == 0) goto L_0x0083
            r2.close()
        L_0x0083:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.js.p(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    public static final Drawable q(int i, int i2, Context context) {
        Drawable b2 = gq3.b(context, i);
        if (b2 != null) {
            Drawable mutate = b2.mutate();
            D(mutate, i2);
            return mutate;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [cu5[], java.io.Serializable] */
    public static og0 r(Context context, bd4 bd4) {
        Cursor cursor;
        bd4 bd42 = bd4;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = (String) bd42.b;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (resolveContentProvider != null) {
            String str2 = resolveContentProvider.packageName;
            String str3 = (String) bd42.c;
            if (str2.equals(str3)) {
                Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature byteArray : signatureArr) {
                    arrayList.add(byteArray.toByteArray());
                }
                xb4 xb4 = b;
                Collections.sort(arrayList, xb4);
                List list = (List) bd42.X;
                if (list == null) {
                    list = xs7.L(resources, 0);
                }
                int i = 0;
                loop1:
                while (true) {
                    cursor = null;
                    if (i >= list.size()) {
                        resolveContentProvider = null;
                        break;
                    }
                    ArrayList arrayList2 = new ArrayList((Collection) list.get(i));
                    Collections.sort(arrayList2, xb4);
                    if (arrayList.size() == arrayList2.size()) {
                        int i2 = 0;
                        while (i2 < arrayList.size()) {
                            if (Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                                i2++;
                            }
                        }
                        break loop1;
                    }
                    i++;
                }
                if (resolveContentProvider == null) {
                    return new og0(1, (Serializable) null, 7);
                }
                String str4 = resolveContentProvider.authority;
                ArrayList arrayList3 = new ArrayList();
                Uri build = new Uri.Builder().scheme("content").authority(str4).build();
                Uri build2 = new Uri.Builder().scheme("content").authority(str4).appendPath("file").build();
                ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
                try {
                    String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                    String[] strArr2 = {(String) bd42.o};
                    if (acquireUnstableContentProviderClient != null) {
                        try {
                            cursor = acquireUnstableContentProviderClient.query(build, strArr, "query = ?", strArr2, (String) null, (CancellationSignal) null);
                        } catch (RemoteException unused) {
                        }
                    }
                    if (cursor != null) {
                        if (cursor.getCount() > 0) {
                            int columnIndex = cursor.getColumnIndex("result_code");
                            arrayList3 = new ArrayList();
                            int columnIndex2 = cursor.getColumnIndex("_id");
                            int columnIndex3 = cursor.getColumnIndex("file_id");
                            int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                            int columnIndex5 = cursor.getColumnIndex("font_weight");
                            int columnIndex6 = cursor.getColumnIndex("font_italic");
                            while (cursor.moveToNext()) {
                                arrayList3.add(new cu5(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, columnIndex != -1 ? cursor.getInt(columnIndex) : 0));
                            }
                        }
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (acquireUnstableContentProviderClient != null) {
                        acquireUnstableContentProviderClient.close();
                    }
                    return new og0(0, (Serializable) (cu5[]) arrayList3.toArray(new cu5[0]), 7);
                } catch (Throwable th) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (acquireUnstableContentProviderClient != null) {
                        acquireUnstableContentProviderClient.close();
                    }
                    throw th;
                }
            } else {
                throw new PackageManager.NameNotFoundException(me4.j("Found content provider ", str, ", but package was not ", str3));
            }
        } else {
            throw new PackageManager.NameNotFoundException(rf0.h("No package found for authority: ", str));
        }
    }

    public static String s(String str) {
        try {
            MimeTypeMap singleton = MimeTypeMap.getSingleton();
            int lastIndexOf = str.lastIndexOf(46);
            if (lastIndexOf == -1) {
                return null;
            }
            String substring = str.substring(lastIndexOf + 1);
            String mimeTypeFromExtension = singleton.getMimeTypeFromExtension(substring.toLowerCase());
            return (!r1g.p(mimeTypeFromExtension) || r1g.p(substring)) ? mimeTypeFromExtension : "application/".concat(substring);
        } catch (Exception e2) {
            udd.r("js", "getMimeTypeFromFileName: failed, e: " + e2.toString());
            return null;
        }
    }

    public static String t(Context context, Uri uri, wu4 wu4) {
        try {
            String uri2 = uri.toString();
            try {
                String path = uri.getPath();
                if (!r1g.p(path)) {
                    File file = new File(path);
                    if (file.exists()) {
                        udd.p("js", "getPath: from file: " + uri2, new Object[0]);
                        return file.getAbsolutePath();
                    }
                } else {
                    udd.p("js", "getPath: path from uri.getPath is empty, uri = %s", uri2);
                }
                File file2 = new File(uri.toString());
                if (file2.exists()) {
                    udd.p("js", "getPath: from file: " + uri2, new Object[0]);
                    return file2.getAbsolutePath();
                }
            } catch (Exception e2) {
                udd.s("js", "getPath: error check file exists", e2);
            }
            char c2 = 65535;
            if (uri2.contains("com.google.android.apps.photos.contentprovider")) {
                try {
                    String str = uri2.split("/1/")[1];
                    int indexOf = str.indexOf("/ACTUAL");
                    if (indexOf != -1) {
                        uri = Uri.parse(URLDecoder.decode(str.substring(0, indexOf), StandardCharsets.UTF_8));
                    }
                } catch (Exception e3) {
                    udd.s("js", "getPath: error on get google photos uri", e3);
                }
            }
            if (DocumentsContract.isDocumentUri(context, uri)) {
                if ("com.android.externalstorage.documents".equals(uri.getAuthority())) {
                    udd.p("js", "getPath: is external document: " + uri, new Object[0]);
                    String[] split = DocumentsContract.getDocumentId(uri).split(":");
                    if ("primary".equalsIgnoreCase(split[0])) {
                        return Environment.getExternalStorageDirectory() + "/" + split[1];
                    }
                } else if ("com.android.providers.downloads.documents".equals(uri.getAuthority())) {
                    udd.p("js", "getPath: is download document: " + uri, new Object[0]);
                    String documentId = DocumentsContract.getDocumentId(uri);
                    if (r1g.p(documentId) || !documentId.toLowerCase().startsWith("raw:")) {
                        return p(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), (String) null, (String[]) null);
                    }
                    String substring = documentId.substring(4);
                    if (lp.o(substring)) {
                        return substring;
                    }
                    return null;
                } else if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
                    udd.p("js", "getPath: is media document: " + uri, new Object[0]);
                    String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
                    String str2 = split2[0];
                    int hashCode = str2.hashCode();
                    if (hashCode != 93166550) {
                        if (hashCode != 100313435) {
                            if (hashCode == 112202875) {
                                if (str2.equals("video")) {
                                    c2 = 1;
                                }
                            }
                        } else if (str2.equals("image")) {
                            c2 = 0;
                        }
                    } else if (str2.equals("audio")) {
                        c2 = 2;
                    }
                    return p(context, c2 != 0 ? c2 != 1 ? c2 != 2 ? null : MediaStore.Audio.Media.EXTERNAL_CONTENT_URI : MediaStore.Video.Media.EXTERNAL_CONTENT_URI : MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "_id=?", new String[]{split2[1]});
                }
            } else if ("content".equalsIgnoreCase(uri.getScheme())) {
                String authority = uri.getAuthority();
                if (!r1g.p(authority) && authority.equalsIgnoreCase(wu4.a)) {
                    udd.p("js", "getPath: from application content scheme: " + uri, new Object[0]);
                    String l = l(uri);
                    if (!r1g.p(l)) {
                        return l;
                    }
                }
                udd.p("js", "getPath: from content scheme: " + uri, new Object[0]);
                return p(context, uri, (String) null, (String[]) null);
            } else if ("file".equalsIgnoreCase(uri.getScheme())) {
                udd.p("js", "getPath: from file scheme: " + uri, new Object[0]);
                return uri.getPath();
            }
        } catch (Exception e4) {
            udd.t("js", "getPath: error for uri %s, e: %s", uri, e4.toString());
        }
        return null;
    }

    public static final sma u(Context context) {
        sma sma = f;
        if (sma != null) {
            return sma;
        }
        sma sma2 = new sma(context.getApplicationContext());
        f = sma2;
        return sma2;
    }

    public static long v(at4 at4, ByteBuffer byteBuffer, long j) {
        B(at4, byteBuffer, 4, j);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    public static int w(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static boolean x(ku1 ku1, String str) {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) ku1.a(str).a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i : iArr) {
                    if (i == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (CameraAccessExceptionCompat e2) {
            throw new Exception(new Exception(e2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0106, code lost:
        if (r0.contains(r10.getFilesDir().getParent()) == false) goto L_0x011f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean y(android.net.Uri r9, android.content.Context r10, g15 r11) {
        /*
            java.lang.String r0 = r9.getPath()
            boolean r1 = defpackage.r1g.p(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000d
            goto L_0x011f
        L_0x000d:
            r1 = r2
        L_0x000e:
            r3 = 1
            r4 = 10
            java.lang.String r5 = "/"
            if (r1 >= r4) goto L_0x0045
            boolean r4 = defpackage.r1g.p(r0)
            if (r4 == 0) goto L_0x001d
            r6 = r0
            goto L_0x003a
        L_0x001d:
            java.lang.String[] r4 = r0.split(r5)
            int r6 = r4.length
            if (r6 <= 0) goto L_0x0027
            r6 = r4[r2]
            goto L_0x0029
        L_0x0027:
            java.lang.String r6 = ""
        L_0x0029:
            r7 = r3
        L_0x002a:
            int r8 = r4.length
            if (r7 >= r8) goto L_0x003a
            r8 = r4[r7]
            java.lang.String r6 = me4.i(r6, r5, r8)
            java.lang.String r6 = android.system.Os.readlink(r6)     // Catch:{ Exception -> 0x0037 }
        L_0x0037:
            int r7 = r7 + 1
            goto L_0x002a
        L_0x003a:
            boolean r4 = r0.equals(r6)
            if (r4 == 0) goto L_0x0041
            goto L_0x0046
        L_0x0041:
            int r1 = r1 + 1
            r0 = r6
            goto L_0x000e
        L_0x0045:
            r0 = 0
        L_0x0046:
            if (r0 != 0) goto L_0x004a
            goto L_0x0108
        L_0x004a:
            boolean r1 = defpackage.r1g.p(r0)
            if (r1 == 0) goto L_0x0052
            goto L_0x00dc
        L_0x0052:
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x0060 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0060 }
            java.lang.String r1 = r1.getCanonicalPath()     // Catch:{ Exception -> 0x0060 }
            if (r1 == 0) goto L_0x00dc
            r0 = r1
            goto L_0x00dc
        L_0x0060:
            boolean r1 = defpackage.r1g.p(r0)
            if (r1 == 0) goto L_0x0068
            goto L_0x00dc
        L_0x0068:
            java.lang.String r1 = "/./"
            java.lang.String r0 = r0.replace(r1, r5)
        L_0x006e:
            java.lang.String r1 = "//"
            java.lang.String r1 = r0.replace(r1, r5)
            boolean r4 = r0.equals(r1)
            if (r4 == 0) goto L_0x0120
            java.lang.String[] r0 = r0.split(r5)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r4 = r0.length
            if (r4 <= 0) goto L_0x008b
            r4 = r0[r2]
            r1.add(r4)
        L_0x008b:
            r4 = r3
        L_0x008c:
            int r6 = r0.length
            if (r4 >= r6) goto L_0x00ae
            r6 = r0[r4]
            java.lang.String r7 = ".."
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L_0x00a8
            int r7 = r1.size()
            if (r7 <= 0) goto L_0x00a8
            int r6 = r1.size()
            int r6 = r6 - r3
            r1.remove(r6)
            goto L_0x00ab
        L_0x00a8:
            r1.add(r6)
        L_0x00ab:
            int r4 = r4 + 1
            goto L_0x008c
        L_0x00ae:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r4 = r1.size()
            if (r4 <= 0) goto L_0x00c2
            java.lang.Object r4 = r1.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            r0.append(r4)
        L_0x00c2:
            r4 = r3
        L_0x00c3:
            int r6 = r1.size()
            if (r4 >= r6) goto L_0x00d8
            r0.append(r5)
            java.lang.Object r6 = r1.get(r4)
            java.lang.String r6 = (java.lang.String) r6
            r0.append(r6)
            int r4 = r4 + 1
            goto L_0x00c3
        L_0x00d8:
            java.lang.String r0 = r0.toString()
        L_0x00dc:
            boolean r1 = defpackage.r1g.p(r0)
            if (r1 != 0) goto L_0x011f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "/data/data/"
            r1.<init>(r4)
            java.lang.String r4 = r10.getPackageName()
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L_0x0108
            java.io.File r10 = r10.getFilesDir()
            java.lang.String r10 = r10.getParent()
            boolean r10 = r0.contains(r10)
            if (r10 == 0) goto L_0x011f
        L_0x0108:
            if (r11 == 0) goto L_0x011e
            ru.ok.tamtam.util.HandledException r10 = new ru.ok.tamtam.util.HandledException
            java.lang.String r9 = r9.toString()
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.String r0 = "Uri is internal: %s"
            r10.<init>(r0, r9)
            r4a r11 = (defpackage.r4a) r11
            r11.c(r10, r3)
        L_0x011e:
            return r3
        L_0x011f:
            return r2
        L_0x0120:
            r0 = r1
            goto L_0x006e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.js.y(android.net.Uri, android.content.Context, g15):boolean");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [vve, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, pxe] */
    /* JADX WARNING: type inference failed for: r4v0, types: [af8, java.lang.Object] */
    public static wve z(gwe gwe) {
        fwe fwe;
        ? obj = new Object();
        obj.g = rxe.b;
        String str = gwe.b;
        tu1 tu1 = gwe.a;
        qxe qxe = null;
        if (tu1 == null) {
            fwe = null;
        } else {
            ? obj2 = new Object();
            obj2.d = str;
            obj2.a = tu1.b;
            obj2.b = tu1.a;
            obj2.c = (String) tu1.c;
            fwe = new fwe(obj2);
        }
        obj.a = fwe;
        pxe pxe = gwe.i;
        if (pxe != null) {
            ? obj3 = new Object();
            obj3.a = pxe.a;
            obj3.b = pxe.b;
            qxe = new qxe(obj3);
        }
        obj.h = qxe;
        obj.g = gwe.h;
        obj.b = gwe.c;
        obj.c = gwe.d;
        obj.d = gwe.e;
        obj.f = gwe.g;
        obj.e = gwe.f;
        obj.i = gwe.j;
        return new wve(obj);
    }
}
