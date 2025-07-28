package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.animation.BaseInterpolator;
import androidx.media3.common.ParserException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.SortedSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import me.leolin.shortcutbadger.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: oyb  reason: default package */
public abstract class oyb {
    public static final gk9 a = new gk9(10);
    public static final int[][] b = {new int[]{-46922, -30155}, new int[]{-14019, -31958}, new int[]{-15408683, -16529630}, new int[]{-16197645, -11298561}, new int[]{-4220929, -11374849}};
    public static Boolean c = null;
    public static Boolean d = null;
    public static Boolean e = null;
    public static Boolean f = null;
    public static final String g = "oyb";
    public static jk9 h;

    public static lg8 A(String str) {
        Matcher matcher = lg8.d.matcher(str);
        if (matcher.lookingAt()) {
            String group = matcher.group(1);
            Locale locale = Locale.US;
            String lowerCase = group.toLowerCase(locale);
            matcher.group(2).toLowerCase(locale);
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = lg8.e.matcher(str);
            int end = matcher.end();
            while (end < str.length()) {
                matcher2.region(end, str.length());
                if (matcher2.lookingAt()) {
                    String group2 = matcher2.group(1);
                    if (group2 == null) {
                        end = matcher2.end();
                    } else {
                        String group3 = matcher2.group(2);
                        if (group3 == null) {
                            group3 = matcher2.group(3);
                        } else if (p0e.Q(group3, "'", false) && group3.endsWith("'") && group3.length() > 2) {
                            group3 = group3.substring(1, group3.length() - 1);
                        }
                        arrayList.add(group2);
                        arrayList.add(group3);
                        end = matcher2.end();
                    }
                } else {
                    throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + str.substring(end) + "\" for: \"" + str + '\"').toString());
                }
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return new lg8(str, lowerCase, (String[]) array);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
    }

    public static final void B(int i, int i2, int i3, int i4, int[] iArr) {
        if (iArr.length > 1) {
            float f2 = (float) i4;
            float f3 = (float) i3;
            int i5 = (int) ((f2 / f3) * ((float) i));
            if (1 > i2 || i2 >= i5) {
                i2 = i5;
            } else {
                i = (int) ((f3 / f2) * ((float) i2));
            }
            iArr[0] = i;
            iArr[1] = i2;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r4 = r4.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long C(i22 r4) {
        /*
            long r0 = r4.m()
            xm8 r4 = r4.c
            if (r4 == 0) goto L_0x000f
            vo8 r4 = r4.a
            if (r4 == 0) goto L_0x000f
            long r2 = r4.o
            goto L_0x0014
        L_0x000f:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0014:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0019
            r0 = r2
        L_0x0019:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oyb.C(i22):long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[EDGE_INSN: B:20:0x0043->B:13:0x0043 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent D(android.content.Context r5, android.content.Intent r6) {
        /*
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            r0 = 0
            java.util.List r5 = r5.queryIntentActivities(r6, r0)
            boolean r0 = r5.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x0011
            return r1
        L_0x0011:
            android.content.Intent r0 = android.content.Intent.createChooser(r6, r1)
            java.util.Iterator r5 = r5.iterator()
        L_0x0019:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0043
            java.lang.Object r2 = r5.next()
            r3 = r2
            android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
            android.content.pm.ActivityInfo r3 = r3.activityInfo
            java.lang.String r3 = r3.packageName
            java.lang.String r4 = "org.telegram.messenger"
            boolean r4 = defpackage.hhd.f(r3, r4)
            if (r4 != 0) goto L_0x0042
            java.lang.String r4 = "org.telegram.messenger.beta"
            boolean r4 = defpackage.hhd.f(r3, r4)
            if (r4 != 0) goto L_0x0042
            java.lang.String r4 = "org.telegram.messenger.web"
            boolean r3 = defpackage.hhd.f(r3, r4)
            if (r3 == 0) goto L_0x0019
        L_0x0042:
            r1 = r2
        L_0x0043:
            android.content.pm.ResolveInfo r1 = (android.content.pm.ResolveInfo) r1
            if (r1 == 0) goto L_0x007f
            java.lang.Object r5 = r6.clone()
            android.content.Intent r5 = (android.content.Intent) r5
            android.content.pm.ActivityInfo r6 = r1.activityInfo
            java.lang.String r6 = r6.packageName
            r5.setPackage(r6)
            android.content.ComponentName r6 = new android.content.ComponentName
            android.content.pm.ActivityInfo r2 = r1.activityInfo
            java.lang.String r3 = r2.packageName
            java.lang.String r2 = r2.name
            r6.<init>(r3, r2)
            r5.setComponent(r6)
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            r5.addFlags(r6)
            android.content.pm.LabeledIntent r6 = new android.content.pm.LabeledIntent
            android.content.pm.ActivityInfo r2 = r1.activityInfo
            java.lang.String r2 = r2.packageName
            int r3 = r1.labelRes
            int r1 = r1.icon
            r6.<init>(r5, r2, r3, r1)
            android.content.pm.LabeledIntent[] r5 = new android.content.pm.LabeledIntent[]{r6}
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            java.lang.String r6 = "android.intent.extra.INITIAL_INTENTS"
            r0.putExtra(r6, r5)
        L_0x007f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oyb.D(android.content.Context, android.content.Intent):android.content.Intent");
    }

    public static Intent E(Context context, boolean z) {
        if (!z) {
            return new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT", Uri.fromParts("package", context.getPackageName(), (String) null));
        }
        Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
        intent.setPackage("com.miui.securitycenter");
        intent.putExtra("extra_package_uid", Process.myUid());
        intent.putExtra("extra_pkgname", context.getPackageName());
        return intent;
    }

    public static boolean F(Iterable iterable, Comparator comparator) {
        Object obj;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            obj = ((SortedSet) iterable).comparator();
            if (obj == null) {
                obj = og9.a;
            }
        } else if (!(iterable instanceof sld)) {
            return false;
        } else {
            obj = ((lt6) ((sld) iterable)).o;
        }
        return comparator.equals(obj);
    }

    public static void G(Context context) {
        boolean z;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (!udd.B(context).getBoolean("proxy_notification_initialized", false)) {
            try {
                Context applicationContext = context.getApplicationContext();
                PackageManager packageManager = applicationContext.getPackageManager();
                if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled"))) {
                    z = applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
                    new vr2((Object) context, z, (Object) new vde(), 3).run();
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            z = true;
            new vr2((Object) context, z, (Object) new vde(), 3).run();
        }
    }

    public static void H(i62 i62, long j, md4 md4) {
        if (((h62) x(j, i62.d(md4)).b) == null) {
            i62.a(new h62(j, j), md4);
        }
    }

    public static boolean I(long j, h62 h62) {
        return h62 != null && h62.a <= j && j <= h62.b;
    }

    public static boolean J(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (c == null) {
            c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        c.booleanValue();
        if (d == null) {
            d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return d.booleanValue() && Build.VERSION.SDK_INT >= 30;
    }

    public static void K(ArrayList arrayList) {
        Iterator it;
        ArrayList arrayList2 = arrayList;
        int i = 1;
        if (arrayList.size() > 1) {
            ArrayList arrayList3 = null;
            boolean z = true;
            while (z && arrayList.size() > i) {
                Iterator it2 = arrayList.iterator();
                boolean z2 = false;
                while (it2.hasNext()) {
                    h62 h62 = (h62) it2.next();
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    } else {
                        arrayList3.clear();
                    }
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            it = it2;
                            break;
                        }
                        h62 h622 = (h62) it3.next();
                        if (h62 != h622) {
                            long j = h62.a;
                            long j2 = h622.a;
                            int i2 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                            long j3 = h62.b;
                            it = it2;
                            long j4 = h622.b;
                            if ((i2 >= 0 && j <= j4) || (j3 >= j2 && j3 <= j4)) {
                                h62 h623 = new h62(Math.min(j, j2), Math.max(j3, j4));
                                arrayList3.add(h62);
                                arrayList3.add(h622);
                                arrayList2.add(h623);
                                z2 = true;
                            }
                            if (z2) {
                                break;
                            }
                            it2 = it;
                        }
                    }
                    arrayList2.removeAll(arrayList3);
                    if (z2) {
                        break;
                    }
                    it2 = it;
                }
                z = z2;
                i = 1;
            }
            Collections.sort(arrayList2, new yz(16));
        }
    }

    public static Integer L(JSONObject jSONObject, String str, Integer num) {
        String optString = jSONObject.optString(str);
        if (optString == null || optString.length() == 0) {
            return num;
        }
        try {
            if (optString.length() == 7) {
                optString = "#FF".concat(h0e.k0(optString, "#"));
            }
            return Integer.valueOf(Color.parseColor(optString));
        } catch (Throwable th) {
            throw new RuntimeException("TamThemeFactory/optColor: error while parse color by key ".concat(str), th);
        }
    }

    public static long M(int i, String str) {
        int t = t(str, 0, i, false);
        Matcher matcher = ht3.m.matcher(str);
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        while (t < i) {
            int t2 = t(str, t + 1, i, true);
            matcher.region(t, t2);
            if (i3 == -1 && matcher.usePattern(ht3.m).matches()) {
                i3 = Integer.parseInt(matcher.group(1));
                i6 = Integer.parseInt(matcher.group(2));
                i7 = Integer.parseInt(matcher.group(3));
            } else if (i4 != -1 || !matcher.usePattern(ht3.l).matches()) {
                if (i5 == -1) {
                    Pattern pattern = ht3.k;
                    if (matcher.usePattern(pattern).matches()) {
                        i5 = h0e.a0(pattern.pattern(), matcher.group(1).toLowerCase(Locale.US), 0, false, 6) / 4;
                    }
                }
                if (i2 == -1 && matcher.usePattern(ht3.j).matches()) {
                    i2 = Integer.parseInt(matcher.group(1));
                }
            } else {
                i4 = Integer.parseInt(matcher.group(1));
            }
            t = t(str, t2 + 1, i, false);
        }
        if (70 <= i2 && 99 >= i2) {
            i2 += 1900;
        }
        if (i2 >= 0 && 69 >= i2) {
            i2 += 2000;
        }
        if (!(i2 >= 1601)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (i5 == -1) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (1 > i4 || 31 < i4) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (i3 < 0 || 23 < i3) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (i6 < 0 || 59 < i6) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (i7 < 0 || 59 < i7) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(nze.e);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i2);
            gregorianCalendar.set(2, i5 - 1);
            gregorianCalendar.set(5, i4);
            gregorianCalendar.set(11, i3);
            gregorianCalendar.set(12, i6);
            gregorianCalendar.set(13, i7);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
    }

    public static String N(h62 h62) {
        if (h62 == null) {
            return null;
        }
        Date date = new Date(h62.a);
        Date date2 = new Date(h62.b);
        return String.format(Locale.ENGLISH, "time[%tF %tT %tL - %tF %tT %tL], millis[%d - %d]", new Object[]{date, date, date, date2, date2, date2, Long.valueOf(date.getTime()), Long.valueOf(date2.getTime())});
    }

    public static String O(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        if (arrayList == null || arrayList.size() <= 0) {
            sb.append("chunks count=0");
        } else {
            sb.append("chunks count=");
            sb.append(arrayList.size());
            sb.append(": ");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sb.append(N((h62) it.next()));
                sb.append(", ");
            }
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        defpackage.urd.l(r2, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] P(java.io.File r3) {
        /*
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.util.zip.GZIPOutputStream r1 = new java.util.zip.GZIPOutputStream
            r1.<init>(r0)
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r3)
            p(r2, r1, 8192)     // Catch:{ all -> 0x001e }
            r3 = 0
            defpackage.urd.l(r2, r3)
            r1.close()
            byte[] r3 = r0.toByteArray()
            return r3
        L_0x001e:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0020 }
        L_0x0020:
            r0 = move-exception
            defpackage.urd.l(r2, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oyb.P(java.io.File):byte[]");
    }

    public static void Q(Context context, Uri uri, String str) {
        Object obj;
        try {
            stf stf = new stf(context);
            ((Intent) stf.b).setType(str);
            stf.K(uri);
            stf.M();
            obj = jue.a;
        } catch (Throwable th) {
            obj = new kcc(th);
        }
        Throwable a2 = mcc.a(obj);
        if (a2 != null) {
            udd.s(g, "shareMedia: failed", a2);
        }
    }

    public static void R(Context context, CharSequence charSequence) {
        Object obj;
        try {
            stf stf = new stf(context);
            ((Intent) stf.b).setType("text/plain");
            stf.L(charSequence);
            Intent D = D(context, stf.v());
            if (D != null) {
                context.startActivity(D);
                obj = jue.a;
            } else {
                obj = null;
            }
        } catch (Throwable th) {
            obj = new kcc(th);
        }
        Throwable a2 = mcc.a(obj);
        if (a2 != null) {
            udd.s(g, "showInviteDialog error", a2);
        }
    }

    public static final int[] a(pda pda) {
        int ordinal = pda.g().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return new int[]{r1g.G(-1, 0.2f), 0};
            } else if (ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return new int[]{r1g.G(-1, 0.5f), 0};
    }

    public static void b(String str, Throwable th) {
        String str2;
        if (th != null) {
            Throwable th2 = th;
            while (true) {
                if (th2 == null) {
                    str2 = Log.getStackTraceString(th).trim().replace("\t", "    ");
                    break;
                } else if (th2 instanceof UnknownHostException) {
                    str2 = "UnknownHostException (no network)";
                    break;
                } else {
                    th2 = th2.getCause();
                }
            }
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            String valueOf = String.valueOf(str);
            new StringBuilder(me4.e(valueOf.length() + 4, str2.replace("\n", "\n  ")));
        }
    }

    public static void c(Object obj, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void d(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(String str, boolean z) {
        if (!z) {
            throw ParserException.a((RuntimeException) null, str);
        }
    }

    public static void f(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void g(Object obj) {
        obj.getClass();
    }

    public static void h(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final void i(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder k = hr1.k(j, "size=", " offset=");
            k.append(j2);
            k.append(" byteCount=");
            k.append(j3);
            throw new ArrayIndexOutOfBoundsException(k.toString());
        }
    }

    public static void j(Object obj, boolean z) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void k(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void l(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    public static void m(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static ArrayList n(i62 i62, long j, md4 md4) {
        ArrayList arrayList = new ArrayList();
        Iterator it = i62.d(md4).iterator();
        while (it.hasNext()) {
            h62 h62 = (h62) it.next();
            if (h62.b >= j) {
                if (h62.a > j) {
                    arrayList.add(h62);
                } else if (I(j, h62)) {
                    long j2 = 1 + j;
                    long j3 = h62.b;
                    if (j2 <= j3) {
                        if (j2 == -1) {
                            udd.S("Chunk.Builder", BuildConfig.FLAVOR, new IllegalStateException("start time is -1"));
                        }
                        if (j3 == -1) {
                            udd.S("Chunk.Builder", BuildConfig.FLAVOR, new IllegalStateException("end time is -1"));
                        }
                        arrayList.add(new h62(j2, j3));
                    }
                }
            }
        }
        return arrayList;
    }

    public static int o(JSONObject jSONObject, String str, int i) {
        String optString = jSONObject.optString(str);
        if (optString == null || optString.length() == 0) {
            return i;
        }
        try {
            if (optString.length() == 7) {
                optString = "#FF".concat(h0e.k0(optString, "#"));
            }
            return Color.parseColor(optString);
        } catch (Throwable th) {
            throw new RuntimeException("TamThemeFactory/color: error while parse color by key ".concat(str), th);
        }
    }

    public static final long p(InputStream inputStream, OutputStream outputStream, int i) {
        byte[] bArr = new byte[i];
        int read = inputStream.read(bArr);
        long j = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j += (long) read;
            read = inputStream.read(bArr);
        }
        return j;
    }

    public static wce r(String str, String str2) {
        String str3;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i = jSONObject.getInt("version");
            if (i <= 1) {
                boolean z = jSONObject.getBoolean("night");
                ck9 ck9 = z ? ck9.e0 : db4.e0;
                JSONObject jSONObject2 = jSONObject.getJSONObject("colors");
                String string = jSONObject.getString("title");
                k33 k33 = new k33(o(jSONObject2, "accent", ck9.k), o(jSONObject2, "accentText", ck9.l), o(jSONObject2, "background", ck9.m), o(jSONObject2, "bubbleBorder", ck9.p), o(jSONObject2, "bubbleBorderHighLight", ck9.n), o(jSONObject2, "bubbleClickableBackground", ck9.o), o(jSONObject2, "bubbleControlBackground", ck9.q), o(jSONObject2, "bubbleControlsText", ck9.s), o(jSONObject2, "bubbleDecoratorBackground", ck9.r), o(jSONObject2, "bubbleDecoratorText", ck9.t), o(jSONObject2, "bubbleOuterBorder", ck9.u), o(jSONObject2, "bubbleSecondaryText", ck9.v), o(jSONObject2, "buttonTint", ck9.w), o(jSONObject2, "chatBackground", ck9.x), o(jSONObject2, "destructive", ck9.y), o(jSONObject2, "lightBadgeBackground", ck9.z), o(jSONObject2, "highlightBackground", ck9.A), o(jSONObject2, "incomingBubbleBackground", ck9.B), o(jSONObject2, "incomingBubbleBackgroundHighlighted", ck9.C), o(jSONObject2, "outgoingBubbleBackground", ck9.D), o(jSONObject2, "outgoingBubbleBackgroundHighlighted", ck9.E), o(jSONObject2, "primaryText", ck9.F), o(jSONObject2, "profileBackground", ck9.G), o(jSONObject2, "secondaryBackground", ck9.H), o(jSONObject2, "secondaryButton", ck9.I), o(jSONObject2, "secondaryText", ck9.J), o(jSONObject2, "separatorBackground", ck9.K), o(jSONObject2, "statusBarBackground", ck9.L), o(jSONObject2, "tertiaryText", ck9.M), o(jSONObject2, "toolBarBackground", ck9.N), o(jSONObject2, "unreadBackground", ck9.O), o(jSONObject2, "unreadBackgroundMuted", ck9.P), o(jSONObject2, "unreadText", ck9.Q), o(jSONObject2, "callAccent", ck9.R), o(jSONObject2, "callBackground", ck9.S), o(jSONObject2, "callControl", ck9.T), o(jSONObject2, "groupCallBackground", ck9.U), L(jSONObject2, "switchThumb", ck9.V), L(jSONObject2, "switchThumbChecked", ck9.W), L(jSONObject2, "switchTrack", ck9.X), L(jSONObject2, "switchTrackChecked", ck9.Y), L(jSONObject2, "switchTint", ck9.Z));
                String string2 = jSONObject.getString("author");
                if (str2 == null) {
                    str3 = string + ".ttstyle";
                } else {
                    str3 = str2;
                }
                return new wce(string, string2, z, i, str3, k33, kk9.o, kk9.c);
            }
            throw new IllegalStateException();
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static ObjectAnimator s(View view, mre mre, int i, int i2, float f2, float f3, float f4, float f5, BaseInterpolator baseInterpolator, cre cre) {
        float f6;
        float f7;
        View view2 = view;
        mre mre2 = mre;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) mre2.b.getTag(job.transition_position);
        if (iArr != null) {
            f6 = ((float) (iArr[0] - i)) + translationX;
            f7 = ((float) (iArr[1] - i2)) + translationY;
        } else {
            f6 = f2;
            f7 = f3;
        }
        view.setTranslationX(f6);
        view.setTranslationY(f7);
        if (f6 == f4 && f7 == f5) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f6, f4}), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f7, f5})});
        nre nre = new nre(view, mre2.b, translationX, translationY);
        cre.a(nre);
        ofPropertyValuesHolder.addListener(nre);
        ofPropertyValuesHolder.setInterpolator(baseInterpolator);
        return ofPropertyValuesHolder;
    }

    public static int t(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != 9) || charAt >= 127 || ('0' <= charAt && '9' >= charAt) || (('a' <= charAt && 'z' >= charAt) || (('A' <= charAt && 'Z' >= charAt) || charAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static void u(IllegalArgumentException illegalArgumentException) {
        b(BuildConfig.FLAVOR, illegalArgumentException);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0055, code lost:
        if (r9 > 0) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006e, code lost:
        if (r13 > 0) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0098, code lost:
        if (r13 > 0) goto L_0x009a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList v(java.util.List r5, java.util.List r6, long r7, int r9, long r10, int r12, long r13) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r5)
            int r5 = r6.size()
            r1 = 0
            if (r5 <= 0) goto L_0x0090
            r5 = 0
            java.lang.Object r5 = r6.get(r5)
            ym8 r5 = (ym8) r5
            int r3 = r6.size()
            int r3 = r3 + -1
            java.lang.Object r6 = r6.get(r3)
            ym8 r6 = (ym8) r6
            nd4 r3 = r5.H0
            if (r3 == 0) goto L_0x0027
            long r3 = r3.a
            goto L_0x0029
        L_0x0027:
            long r3 = r5.b
        L_0x0029:
            nd4 r5 = r6.H0
            if (r5 == 0) goto L_0x0030
            long r5 = r5.a
            goto L_0x0032
        L_0x0030:
            long r5 = r6.b
        L_0x0032:
            if (r9 <= 0) goto L_0x0066
            if (r12 <= 0) goto L_0x0066
            int r9 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r9 <= 0) goto L_0x0049
            int r12 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r12 < 0) goto L_0x003f
            goto L_0x004d
        L_0x003f:
            if (r9 <= 0) goto L_0x0047
            long r9 = java.lang.Math.max(r10, r3)
            r10 = r9
            goto L_0x004d
        L_0x0047:
            r10 = r3
            goto L_0x004d
        L_0x0049:
            long r10 = java.lang.Math.min(r7, r3)
        L_0x004d:
            int r9 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r9 <= 0) goto L_0x0060
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 > 0) goto L_0x0058
            if (r9 <= 0) goto L_0x005e
            goto L_0x009a
        L_0x0058:
            if (r9 <= 0) goto L_0x005e
            long r5 = java.lang.Math.min(r13, r5)
        L_0x005e:
            r13 = r5
            goto L_0x009a
        L_0x0060:
            long r5 = java.lang.Math.max(r7, r5)
            r7 = r5
            goto L_0x009b
        L_0x0066:
            if (r12 <= 0) goto L_0x007c
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 > 0) goto L_0x0073
            int r9 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r9 <= 0) goto L_0x0071
            goto L_0x009d
        L_0x0071:
            r13 = r5
            goto L_0x009d
        L_0x0073:
            int r9 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r9 <= 0) goto L_0x0071
            long r5 = java.lang.Math.min(r13, r5)
            goto L_0x0071
        L_0x007c:
            if (r9 <= 0) goto L_0x008f
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 < 0) goto L_0x0083
            goto L_0x009b
        L_0x0083:
            int r5 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r5 <= 0) goto L_0x008d
            long r5 = java.lang.Math.max(r10, r3)
            r10 = r5
            goto L_0x009b
        L_0x008d:
            r10 = r3
            goto L_0x009b
        L_0x008f:
            return r0
        L_0x0090:
            int r5 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r5 <= 0) goto L_0x0095
            goto L_0x0096
        L_0x0095:
            r10 = r7
        L_0x0096:
            int r5 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r5 <= 0) goto L_0x009b
        L_0x009a:
            r7 = r13
        L_0x009b:
            r13 = r7
            r7 = r10
        L_0x009d:
            r5 = -1
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            java.lang.String r10 = ""
            java.lang.String r11 = "Chunk.Builder"
            if (r9 != 0) goto L_0x00b1
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r12 = "start time is -1"
            r9.<init>(r12)
            defpackage.udd.S(r11, r10, r9)
        L_0x00b1:
            int r5 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x00bf
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "end time is -1"
            r5.<init>(r6)
            defpackage.udd.S(r11, r10, r5)
        L_0x00bf:
            h62 r5 = new h62
            r5.<init>(r7, r13)
            r0.add(r5)
            K(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oyb.v(java.util.List, java.util.List, long, int, long, int, long):java.util.ArrayList");
    }

    public static boolean w(i62 i62, long j, long j2, md4 md4) {
        wia x = x(j, i62.d(md4));
        Object obj = x.b;
        if (obj == null) {
            return false;
        }
        p7 c2 = ((h62) obj).c();
        c2.b(j2);
        i62.d(md4).remove(((Integer) x.a).intValue());
        i62.e(md4);
        i62.a(c2.a(), md4);
        return true;
    }

    public static wia x(long j, ArrayList arrayList) {
        h62 h62;
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                h62 = null;
                i = -1;
                break;
            }
            h62 = (h62) arrayList.get(i);
            long j2 = h62.a;
            long j3 = h62.b;
            if (j2 != j3) {
                if (j >= j2 && j <= j3) {
                    break;
                }
            } else if (j == j2) {
                break;
            }
            i++;
        }
        return new wia(Integer.valueOf(i), h62);
    }

    public static h62 y(long j, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        h62 h62 = null;
        while (it.hasNext()) {
            h62 h622 = (h62) it.next();
            long j2 = h622.b;
            if (j2 < j && (h62 == null || j2 > h62.b)) {
                h62 = h622;
            }
        }
        return h62;
    }

    public static wia z(ArrayList arrayList) {
        h62 h62 = null;
        int i = -1;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            h62 h622 = (h62) arrayList.get(i2);
            if (h62 != null) {
                if (h62.b > h622.b) {
                }
            }
            i = i2;
            h62 = h622;
        }
        return new wia(Integer.valueOf(i), h62);
    }
}
