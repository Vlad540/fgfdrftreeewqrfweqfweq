package defpackage;

import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.location.Location;
import android.media.MediaRoute2Info;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.b;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.exoplayer2.ParserException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.protocol.HTTP;
import org.webrtc.MediaStreamTrack;

/* renamed from: swb  reason: default package */
public abstract class swb {
    public static final String[][] a = {new String[]{":-)", "😊"}, new String[]{":)", "😊"}, new String[]{":-(", "😞"}, new String[]{":(", "😞"}, new String[]{";-)", "😉"}, new String[]{";)", "😉"}, new String[]{":-D", "😂"}, new String[]{":D", "😂"}, new String[]{":-@", "😞"}, new String[]{":@", "😞"}, new String[]{"^o)", "😑"}, new String[]{":-S", "🙈"}, new String[]{":S", "🙈"}, new String[]{"*-)", "😏"}, new String[]{"*)", "😏"}, new String[]{":-|", "😠"}, new String[]{":|", "😠"}, new String[]{"8oI", "😡"}, new String[]{";(", "😢"}, new String[]{":'(", "😢"}, new String[]{":-P", "😜"}, new String[]{":P", "😜"}, new String[]{":-$", "😊"}, new String[]{":$", "😊"}, new String[]{":-O", "😳"}, new String[]{":O", "😳"}, new String[]{"|-)", "😪"}, new String[]{"|)", "😪"}, new String[]{"(ch)", "😊"}, new String[]{"(lo)", "😍"}, new String[]{"(sr)", "😔"}, new String[]{"|-(", "😴"}, new String[]{"|(", "😴"}, new String[]{"(H)", "😎"}, new String[]{"(hu)", "😬"}, new String[]{"(tr)", "😞"}, new String[]{"(md)", "😵"}, new String[]{"(fr)", "😄"}, new String[]{"(dt)", "😟"}, new String[]{"(sc)", "😬"}, new String[]{"(Y)", "👍"}, new String[]{"(N)", "👎"}, new String[]{"(v)", "✌"}, new String[]{"(L)", "❤"}, new String[]{"(U)", "💔"}, new String[]{"(K)", "💋"}, new String[]{"(F)", "⚘"}, new String[]{"(*)", "★"}, new String[]{"(^)", "🎂"}, new String[]{"(G)", "🎁"}, new String[]{"(B)", "🍺"}, new String[]{"(D)", "🍸"}, new String[]{"(CC)", "☕"}, new String[]{"(pi)", "🍕"}, new String[]{"(pl)", "🍴"}, new String[]{"(ic)", "🍦"}, new String[]{"($)", "💰"}, new String[]{"(co)", "💻"}, new String[]{"(so)", "⚽"}, new String[]{"(te)", "🎾"}, new String[]{"(nt)", "♬"}, new String[]{"(I)", "💡"}, new String[]{"(E)", "✉"}, new String[]{"(Z)", "👦"}, new String[]{"(X)", "👧"}, new String[]{"(S)", "🌙"}};
    public static final Object[] b = new Object[0];
    public static final ib5[] c = {new ib5("name_ulr_private", 1), new ib5("name_sleep_segment_request", 1), new ib5("get_last_activity_feature_id", 1), new ib5("support_context_feature_id", 1), new ib5("get_current_location", 2), new ib5("get_last_location_with_request", 1), new ib5("set_mock_mode_with_callback", 1), new ib5("set_mock_location_with_callback", 1), new ib5("inject_location_with_callback", 1), new ib5("location_updates_with_callback", 1), new ib5("use_safe_parcelable_in_intents", 1), new ib5("flp_debug_updates", 1), new ib5("google_location_accuracy_enabled", 1), new ib5("geofences_with_callback", 1), new ib5("location_enabled", 1)};
    public static ArrayList d;
    public static Field e;
    public static Integer f;
    public static Integer g;
    public static Integer h;
    public static boolean i;

    public static bs6 A(Object obj) {
        return obj == null ? bs6.b : new bs6(obj);
    }

    public static final boolean B(h97 h97) {
        return h97 == null || h0e.c0(h97.a);
    }

    public static final RippleDrawable C(int i2, int i3) {
        ColorStateList valueOf = ColorStateList.valueOf(i3);
        ColorDrawable colorDrawable = i2 != 0 ? new ColorDrawable(i2) : null;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setColor(-65536);
        return new RippleDrawable(valueOf, colorDrawable, shapeDrawable);
    }

    public static vf4 D(Context context) {
        int i2;
        long j;
        vf4 vf4 = vf4.c;
        vf4 vf42 = vf4.b;
        if (vf42 != null) {
            return vf42;
        }
        int i3 = Build.VERSION.SDK_INT;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        try {
            if (activityManager.isLowRamDevice()) {
                return vf4;
            }
            i2 = activityManager.getMemoryClass();
            if (Build.VERSION.SDK_INT >= 31 && p20.o() != null && cs.L(p20.o().toUpperCase(Locale.getDefault()).hashCode(), vf4.a)) {
                return vf4;
            }
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < availableProcessors; i6++) {
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile("/sys/devices/system/cpu/cpu" + i6 + "/cpufreq/cpuinfo_max_freq", "r");
                    String readLine = randomAccessFile.readLine();
                    if (readLine != null) {
                        if (readLine.length() != 0) {
                            i5 += Integer.parseInt(readLine) / 1000;
                            i4++;
                        }
                    }
                    randomAccessFile.close();
                } catch (FileNotFoundException | IOException unused) {
                }
            }
            int ceil = i4 == 0 ? -1 : (int) Math.ceil(((double) i5) / ((double) i4));
            try {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                j = memoryInfo.totalMem;
            } catch (Throwable unused2) {
                j = -1;
            }
            if (availableProcessors > 2 && i2 > 100 && ((availableProcessors > 4 || ceil == -1 || ceil > 1250) && (j == -1 || j >= 2147483648L))) {
                vf4 = (availableProcessors < 8 || i2 <= 160 || (ceil != -1 && ceil <= 2050)) ? vf4.o : vf4.X;
            }
            fn6 fn6 = udd.e;
            if (fn6 != null && fn6.c()) {
                tn7 tn7 = tn7.X;
                String str = Build.MANUFACTURER;
                StringBuilder sb = new StringBuilder("selected_class = ");
                sb.append(vf4);
                sb.append(": (cpu_count = ");
                sb.append(availableProcessors);
                sb.append(", freq = ");
                th2.l(sb, ceil, ", memoryClass = ", i2, ", android version ");
                sb.append(i3);
                sb.append(", manufacture ");
                sb.append(str);
                sb.append(")");
                fn6.d(tn7, "DevicePerformanceClass", sb.toString(), (Throwable) null);
            }
            vf4.b = vf4;
            return vf4;
        } catch (Throwable unused3) {
            i2 = 0;
        }
    }

    public static kre E(int i2, cre... creArr) {
        kre kre = new kre();
        for (cre cre : creArr) {
            if (cre != null) {
                kre.T(cre);
            }
        }
        kre.W(i2);
        return kre;
    }

    public static void F(Context context, String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        try {
            context.startActivity(intent);
            udd.q("swb", "openExternalBrowser: flagActivityNoHistory = false");
        } catch (ActivityNotFoundException e2) {
            a06.H(0, context, context.getString(cic.v));
            udd.s("swb", "openWebLink: " + e2.getMessage(), (Throwable) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0081 A[Catch:{ Exception -> 0x015c }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0086 A[Catch:{ Exception -> 0x015c }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d7 A[Catch:{ Exception -> 0x015c }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0141 A[Catch:{ Exception -> 0x015c }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0143 A[Catch:{ Exception -> 0x015c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void G(android.content.Context r14, java.lang.String r15) {
        /*
            r0 = 1
            r1 = 0
            boolean r2 = r1g.p(r15)     // Catch:{ all -> 0x0028 }
            if (r2 != 0) goto L_0x0028
            android.text.Spannable$Factory r2 = android.text.Spannable.Factory.getInstance()     // Catch:{ all -> 0x0028 }
            android.text.Spannable r2 = r2.newSpannable(r15)     // Catch:{ all -> 0x0028 }
            android.text.util.Linkify.addLinks(r2, r0)     // Catch:{ all -> 0x0028 }
            int r3 = r2.length()     // Catch:{ all -> 0x0028 }
            java.lang.Class<android.text.style.URLSpan> r4 = android.text.style.URLSpan.class
            java.lang.Object[] r2 = r2.getSpans(r1, r3, r4)     // Catch:{ all -> 0x0028 }
            android.text.style.URLSpan[] r2 = (android.text.style.URLSpan[]) r2     // Catch:{ all -> 0x0028 }
            int r3 = r2.length     // Catch:{ all -> 0x0028 }
            if (r3 <= 0) goto L_0x0028
            r2 = r2[r1]     // Catch:{ all -> 0x0028 }
            java.lang.String r15 = r2.getURL()     // Catch:{ all -> 0x0028 }
        L_0x0028:
            r2 = 0
            android.net.Uri r3 = android.net.Uri.parse(r15)     // Catch:{ Exception -> 0x015c }
            gg7 r4 = defpackage.gg7.q     // Catch:{ Exception -> 0x015c }
            boolean r5 = r4.d(r3)     // Catch:{ Exception -> 0x015c }
            if (r5 == 0) goto L_0x015c
            k93 r5 = defpackage.vl.b()     // Catch:{ Exception -> 0x015c }
            o2a r5 = (o2a) r5     // Catch:{ Exception -> 0x015c }
            w4 r5 = r5.getAccessor()     // Catch:{ Exception -> 0x015c }
            java.lang.Class<di3> r6 = defpackage.di3.class
            java.lang.Object r5 = r5.c(r6)     // Catch:{ Exception -> 0x015c }
            di3 r5 = (defpackage.di3) r5     // Catch:{ Exception -> 0x015c }
            k93 r6 = defpackage.vl.b()     // Catch:{ Exception -> 0x015c }
            o2a r6 = (o2a) r6     // Catch:{ Exception -> 0x015c }
            t52 r6 = r6.e()     // Catch:{ Exception -> 0x015c }
            java.util.List r7 = r4.b(r6, r3)     // Catch:{ Exception -> 0x015c }
            boolean r8 = r7.isEmpty()     // Catch:{ Exception -> 0x015c }
            java.util.Set r9 = r6.k
            if (r8 != 0) goto L_0x0071
            java.lang.Object r8 = r7.get(r1)     // Catch:{ Exception -> 0x015c }
            i22 r8 = (defpackage.i22) r8     // Catch:{ Exception -> 0x015c }
            long r10 = r8.a     // Catch:{ Exception -> 0x015c }
            java.lang.Long r8 = java.lang.Long.valueOf(r10)     // Catch:{ Exception -> 0x015c }
            boolean r8 = r9.contains(r8)     // Catch:{ Exception -> 0x015c }
            if (r8 == 0) goto L_0x0071
            r8 = r0
            goto L_0x0072
        L_0x0071:
            r8 = r1
        L_0x0072:
            tf7 r10 = new tf7     // Catch:{ Exception -> 0x015c }
            r10.<init>(r4, r0)     // Catch:{ Exception -> 0x015c }
            fg7 r3 = r4.c(r3, r10)     // Catch:{ Exception -> 0x015c }
            boolean r10 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x015c }
            if (r10 != 0) goto L_0x0086
            java.util.List r3 = java.util.Collections.emptyList()     // Catch:{ Exception -> 0x015c }
            goto L_0x00d1
        L_0x0086:
            java.util.concurrent.ConcurrentHashMap r5 = r5.b     // Catch:{ Exception -> 0x015c }
            java.util.Collection r5 = r5.values()     // Catch:{ Exception -> 0x015c }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x015c }
            r10 = r2
        L_0x0091:
            boolean r11 = r5.hasNext()     // Catch:{ Exception -> 0x015c }
            if (r11 == 0) goto L_0x00c9
            java.lang.Object r11 = r5.next()     // Catch:{ Exception -> 0x015c }
            tf3 r11 = (defpackage.tf3) r11     // Catch:{ Exception -> 0x015c }
            oi3 r12 = r11.a     // Catch:{ Exception -> 0x015c }
            ni3 r12 = r12.c     // Catch:{ Exception -> 0x015c }
            java.lang.String r12 = r12.p     // Catch:{ Exception -> 0x015c }
            boolean r13 = android.text.TextUtils.isEmpty(r12)     // Catch:{ Exception -> 0x015c }
            if (r13 != 0) goto L_0x00bb
            android.net.Uri r12 = android.net.Uri.parse(r12)     // Catch:{ Exception -> 0x015c }
            tf7 r13 = new tf7     // Catch:{ Exception -> 0x015c }
            r13.<init>(r4, r0)     // Catch:{ Exception -> 0x015c }
            fg7 r12 = r4.c(r12, r13)     // Catch:{ Exception -> 0x015c }
            boolean r12 = r3.equals(r12)     // Catch:{ Exception -> 0x015c }
            goto L_0x00bc
        L_0x00bb:
            r12 = r1
        L_0x00bc:
            if (r12 == 0) goto L_0x0091
            if (r10 != 0) goto L_0x00c5
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ Exception -> 0x015c }
            r10.<init>()     // Catch:{ Exception -> 0x015c }
        L_0x00c5:
            r10.add(r11)     // Catch:{ Exception -> 0x015c }
            goto L_0x0091
        L_0x00c9:
            if (r10 != 0) goto L_0x00d0
            java.util.List r3 = java.util.Collections.emptyList()     // Catch:{ Exception -> 0x015c }
            goto L_0x00d1
        L_0x00d0:
            r3 = r10
        L_0x00d1:
            boolean r4 = r3.isEmpty()     // Catch:{ Exception -> 0x015c }
            if (r4 != 0) goto L_0x00f5
            java.lang.Object r3 = r3.get(r1)     // Catch:{ Exception -> 0x015c }
            tf3 r3 = (defpackage.tf3) r3     // Catch:{ Exception -> 0x015c }
            long r3 = r3.n()     // Catch:{ Exception -> 0x015c }
            i22 r3 = r6.E(r3)     // Catch:{ Exception -> 0x015c }
            if (r3 == 0) goto L_0x00f6
            long r4 = r3.a     // Catch:{ Exception -> 0x015c }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x015c }
            boolean r4 = r9.contains(r4)     // Catch:{ Exception -> 0x015c }
            if (r4 == 0) goto L_0x00f6
            r8 = r0
            goto L_0x00f6
        L_0x00f5:
            r3 = r2
        L_0x00f6:
            if (r8 != 0) goto L_0x0391
            ki3 r4 = defpackage.ki3.o
            if (r3 == 0) goto L_0x0114
            tf3 r5 = r3.k()     // Catch:{ Exception -> 0x015c }
            if (r5 == 0) goto L_0x0110
            oi3 r5 = r5.a     // Catch:{ Exception -> 0x015c }
            ni3 r5 = r5.c     // Catch:{ Exception -> 0x015c }
            java.util.List r5 = r5.n     // Catch:{ Exception -> 0x015c }
            boolean r5 = r5.contains(r4)     // Catch:{ Exception -> 0x015c }
            if (r5 == 0) goto L_0x0110
            r5 = r0
            goto L_0x0111
        L_0x0110:
            r5 = r1
        L_0x0111:
            if (r5 == 0) goto L_0x0114
            goto L_0x013f
        L_0x0114:
            boolean r3 = r7.isEmpty()     // Catch:{ Exception -> 0x015c }
            if (r3 != 0) goto L_0x013e
            java.lang.Object r3 = r7.get(r1)     // Catch:{ Exception -> 0x015c }
            i22 r3 = (defpackage.i22) r3     // Catch:{ Exception -> 0x015c }
            tf3 r3 = r3.k()     // Catch:{ Exception -> 0x015c }
            if (r3 == 0) goto L_0x0134
            oi3 r3 = r3.a     // Catch:{ Exception -> 0x015c }
            ni3 r3 = r3.c     // Catch:{ Exception -> 0x015c }
            java.util.List r3 = r3.n     // Catch:{ Exception -> 0x015c }
            boolean r3 = r3.contains(r4)     // Catch:{ Exception -> 0x015c }
            if (r3 == 0) goto L_0x0134
            r3 = r0
            goto L_0x0135
        L_0x0134:
            r3 = r1
        L_0x0135:
            if (r3 == 0) goto L_0x013e
            java.lang.Object r3 = r7.get(r1)     // Catch:{ Exception -> 0x015c }
            i22 r3 = (defpackage.i22) r3     // Catch:{ Exception -> 0x015c }
            goto L_0x013f
        L_0x013e:
            r3 = r2
        L_0x013f:
            if (r3 != 0) goto L_0x0143
            goto L_0x0391
        L_0x0143:
            k93 r4 = defpackage.vl.b()     // Catch:{ Exception -> 0x015c }
            o2a r4 = (o2a) r4     // Catch:{ Exception -> 0x015c }
            w4 r4 = r4.getAccessor()     // Catch:{ Exception -> 0x015c }
            java.lang.Class<z5a> r5 = z5a.class
            java.lang.Object r4 = r4.c(r5)     // Catch:{ Exception -> 0x015c }
            z5a r4 = (z5a) r4     // Catch:{ Exception -> 0x015c }
            long r5 = r3.a     // Catch:{ Exception -> 0x015c }
            r4.a(r5)     // Catch:{ Exception -> 0x015c }
            goto L_0x0391
        L_0x015c:
            android.content.pm.PackageManager r3 = r14.getPackageManager()
            java.util.ArrayList r4 = d
            java.lang.String r5 = "http://www.example.com"
            java.lang.String r6 = "android.intent.action.VIEW"
            if (r4 != 0) goto L_0x019c
            android.content.Intent r4 = new android.content.Intent
            android.net.Uri r7 = android.net.Uri.parse(r5)
            r4.<init>(r6, r7)
            java.util.List r4 = r3.queryIntentActivities(r4, r1)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            d = r7
            java.util.Iterator r4 = r4.iterator()
        L_0x0180:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x019c
            java.lang.Object r7 = r4.next()
            android.content.pm.ResolveInfo r7 = (android.content.pm.ResolveInfo) r7
            android.content.pm.ActivityInfo r7 = r7.activityInfo
            if (r7 == 0) goto L_0x0180
            android.content.pm.ApplicationInfo r7 = r7.applicationInfo
            if (r7 == 0) goto L_0x0180
            java.util.ArrayList r8 = d
            java.lang.String r7 = r7.packageName
            r8.add(r7)
            goto L_0x0180
        L_0x019c:
            android.content.Intent r4 = new android.content.Intent
            r4.<init>(r6)
            android.net.Uri r7 = android.net.Uri.parse(r15)
            r4.setData(r7)
            r7 = 268435456(0x10000000, float:2.5243549E-29)
            r4.setFlags(r7)
            android.content.pm.ResolveInfo r3 = r3.resolveActivity(r4, r1)
            java.lang.String r7 = "swb"
            if (r3 == 0) goto L_0x01c4
            android.content.pm.ActivityInfo r3 = r3.activityInfo
            if (r3 == 0) goto L_0x01c4
            java.util.ArrayList r8 = d
            java.lang.String r3 = r3.packageName
            boolean r3 = r8.contains(r3)
            if (r3 == 0) goto L_0x01c4
            goto L_0x01e1
        L_0x01c4:
            r14.startActivity(r4)     // Catch:{ ActivityNotFoundException -> 0x01e1 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ ActivityNotFoundException -> 0x01e1 }
            r3.<init>()     // Catch:{ ActivityNotFoundException -> 0x01e1 }
            java.lang.String r4 = "openExternalApp started activity: "
            r3.append(r4)     // Catch:{ ActivityNotFoundException -> 0x01e1 }
            java.lang.String r4 = r1g.v(r15)     // Catch:{ ActivityNotFoundException -> 0x01e1 }
            r3.append(r4)     // Catch:{ ActivityNotFoundException -> 0x01e1 }
            java.lang.String r3 = r3.toString()     // Catch:{ ActivityNotFoundException -> 0x01e1 }
            udd.q(r7, r3)     // Catch:{ ActivityNotFoundException -> 0x01e1 }
            goto L_0x0391
        L_0x01e1:
            vl r3 = defpackage.vl.o
            j2b r3 = r3.a()
            kp r3 = r3.c
            x97 r3 = r3.g
            java.lang.String r4 = "app.messages.inAppBrowser"
            boolean r3 = r3.getBoolean(r4, r0)
            if (r3 == 0) goto L_0x038e
            android.net.Uri r3 = android.net.Uri.parse(r15)
            java.lang.String r4 = am7.a
            if (r4 == 0) goto L_0x01fd
            goto L_0x02f2
        L_0x01fd:
            android.content.pm.PackageManager r4 = r14.getPackageManager()
            android.content.Intent r8 = new android.content.Intent
            android.net.Uri r5 = android.net.Uri.parse(r5)
            r8.<init>(r6, r5)
            android.content.pm.ResolveInfo r5 = r4.resolveActivity(r8, r1)
            if (r5 == 0) goto L_0x0215
            android.content.pm.ActivityInfo r5 = r5.activityInfo
            java.lang.String r5 = r5.packageName
            goto L_0x0216
        L_0x0215:
            r5 = r2
        L_0x0216:
            java.util.List r9 = r4.queryIntentActivities(r8, r1)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x0223:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x024e
            java.lang.Object r11 = r9.next()
            android.content.pm.ResolveInfo r11 = (android.content.pm.ResolveInfo) r11
            android.content.Intent r12 = new android.content.Intent
            r12.<init>()
            java.lang.String r13 = "android.support.customtabs.action.CustomTabsService"
            r12.setAction(r13)
            android.content.pm.ActivityInfo r13 = r11.activityInfo
            java.lang.String r13 = r13.packageName
            r12.setPackage(r13)
            android.content.pm.ResolveInfo r12 = r4.resolveService(r12, r1)
            if (r12 == 0) goto L_0x0223
            android.content.pm.ActivityInfo r11 = r11.activityInfo
            java.lang.String r11 = r11.packageName
            r10.add(r11)
            goto L_0x0223
        L_0x024e:
            boolean r4 = r10.isEmpty()
            if (r4 == 0) goto L_0x0258
            am7.a = r2
            goto L_0x02f0
        L_0x0258:
            java.lang.String[] r4 = am7.b
            r4 = r4[r1]
            boolean r9 = r10.contains(r4)
            if (r9 == 0) goto L_0x0265
            r10.remove(r4)
        L_0x0265:
            int r4 = r10.size()
            if (r4 != r0) goto L_0x0275
            java.lang.Object r4 = r10.get(r1)
            java.lang.String r4 = (java.lang.String) r4
            am7.a = r4
            goto L_0x02f0
        L_0x0275:
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            if (r4 != 0) goto L_0x02c5
            android.content.pm.PackageManager r4 = r14.getPackageManager()     // Catch:{ RuntimeException -> 0x02b5 }
            r9 = 64
            java.util.List r4 = r4.queryIntentActivities(r8, r9)     // Catch:{ RuntimeException -> 0x02b5 }
            if (r4 == 0) goto L_0x02bc
            int r8 = r4.size()     // Catch:{ RuntimeException -> 0x02b5 }
            if (r8 != 0) goto L_0x028e
            goto L_0x02bc
        L_0x028e:
            java.util.Iterator r4 = r4.iterator()     // Catch:{ RuntimeException -> 0x02b5 }
        L_0x0292:
            boolean r8 = r4.hasNext()     // Catch:{ RuntimeException -> 0x02b5 }
            if (r8 == 0) goto L_0x02bc
            java.lang.Object r8 = r4.next()     // Catch:{ RuntimeException -> 0x02b5 }
            android.content.pm.ResolveInfo r8 = (android.content.pm.ResolveInfo) r8     // Catch:{ RuntimeException -> 0x02b5 }
            android.content.IntentFilter r9 = r8.filter     // Catch:{ RuntimeException -> 0x02b5 }
            if (r9 != 0) goto L_0x02a3
            goto L_0x0292
        L_0x02a3:
            int r11 = r9.countDataAuthorities()     // Catch:{ RuntimeException -> 0x02b5 }
            if (r11 == 0) goto L_0x0292
            int r9 = r9.countDataPaths()     // Catch:{ RuntimeException -> 0x02b5 }
            if (r9 != 0) goto L_0x02b0
            goto L_0x0292
        L_0x02b0:
            android.content.pm.ActivityInfo r8 = r8.activityInfo     // Catch:{ RuntimeException -> 0x02b5 }
            if (r8 != 0) goto L_0x02c5
            goto L_0x0292
        L_0x02b5:
            java.lang.String r4 = "CustomTabsHelper"
            java.lang.String r8 = "Runtime exception while getting specialized handlers"
            udd.s(r4, r8, r2)
        L_0x02bc:
            boolean r4 = r10.contains(r5)
            if (r4 == 0) goto L_0x02c5
            am7.a = r5
            goto L_0x02f0
        L_0x02c5:
            java.lang.String r4 = "com.android.chrome"
            boolean r5 = r10.contains(r4)
            if (r5 == 0) goto L_0x02d0
            am7.a = r4
            goto L_0x02f0
        L_0x02d0:
            java.lang.String r4 = "com.chrome.beta"
            boolean r5 = r10.contains(r4)
            if (r5 == 0) goto L_0x02db
            am7.a = r4
            goto L_0x02f0
        L_0x02db:
            java.lang.String r4 = "com.chrome.dev"
            boolean r5 = r10.contains(r4)
            if (r5 == 0) goto L_0x02e6
            am7.a = r4
            goto L_0x02f0
        L_0x02e6:
            java.lang.String r4 = "com.google.android.apps.chrome"
            boolean r5 = r10.contains(r4)
            if (r5 == 0) goto L_0x02f0
            am7.a = r4
        L_0x02f0:
            java.lang.String r4 = am7.a
        L_0x02f2:
            boolean r5 = r1g.p(r4)
            if (r5 == 0) goto L_0x030b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "openCustomTab: return false, empty packagename "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            udd.q(r7, r0)
            goto L_0x038a
        L_0x030b:
            r7e r5 = defpackage.wce.a0
            wce r5 = fja.E(r14)
            int r5 = r5.N
            android.content.Intent r8 = new android.content.Intent
            r8.<init>(r6)
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r5 = r5 | r6
            java.lang.String r6 = "android.support.customtabs.extra.TOOLBAR_COLOR"
            android.os.Bundle r5 = defpackage.wn6.g(r5, r6)
            java.lang.String r6 = "android.support.customtabs.extra.SESSION"
            boolean r9 = r8.hasExtra(r6)
            if (r9 != 0) goto L_0x0334
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            r9.putBinder(r6, r2)
            r8.putExtras(r9)
        L_0x0334:
            java.lang.String r6 = "android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS"
            r8.putExtra(r6, r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r8.putExtras(r0)
            r8.putExtras(r5)
            java.lang.String r0 = "androidx.browser.customtabs.extra.SHARE_STATE"
            r8.putExtra(r0, r1)
            r8.setPackage(r4)
            boolean r0 = r14 instanceof android.app.Activity     // Catch:{ ActivityNotFoundException -> 0x0374 }
            if (r0 == 0) goto L_0x0357
            r8.setData(r3)     // Catch:{ ActivityNotFoundException -> 0x0374 }
            r14.startActivity(r8, r2)     // Catch:{ ActivityNotFoundException -> 0x0374 }
            goto L_0x035a
        L_0x0357:
            r14.startActivity(r8)     // Catch:{ ActivityNotFoundException -> 0x0374 }
        L_0x035a:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "openCustomTab: "
            r14.<init>(r15)
            java.lang.String r15 = r3.toString()
            java.lang.String r15 = r1g.v(r15)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            udd.q(r7, r14)
            goto L_0x0391
        L_0x0374:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "openCustomTab: return false, exception "
            r1.<init>(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            udd.q(r7, r0)
        L_0x038a:
            F(r14, r15)
            goto L_0x0391
        L_0x038e:
            F(r14, r15)
        L_0x0391:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.swb.G(android.content.Context, java.lang.String):void");
    }

    public static final GradientDrawable H(Integer num, Integer num2, Integer num3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(num.intValue());
        if (!(num2 == null || num3 == null)) {
            gradientDrawable.setStroke(num3.intValue(), num2.intValue());
        }
        return gradientDrawable;
    }

    public static void I(Context context, String str) {
        if (context == null) {
            udd.r("swb", "playVideoLink: can't play " + str + " on a null context");
            return;
        }
        vl.b().b().g("MESSAGE_LINK_OPEN", MediaStreamTrack.VIDEO_TRACK_KIND);
        G(context, str);
    }

    public static int J(InputStream inputStream, byte[] bArr, int i2) {
        inputStream.getClass();
        if (i2 >= 0) {
            int i3 = 0;
            while (i3 < i2) {
                int read = inputStream.read(bArr, i3, i2 - i3);
                if (read == -1) {
                    break;
                }
                i3 += read;
            }
            return i3;
        }
        throw new IndexOutOfBoundsException("len is negative");
    }

    public static void K(cre cre, List list, ArrayList arrayList) {
        ArrayList arrayList2;
        int i2 = 0;
        if (cre instanceof kre) {
            kre kre = (kre) cre;
            int size = kre.V0.size();
            while (i2 < size) {
                K(kre.U(i2), list, arrayList);
                i2++;
            }
            return;
        }
        ArrayList arrayList3 = cre.X;
        if (!(!(arrayList3 == null || arrayList3.isEmpty())) && (arrayList2 = cre.Y) != null && arrayList2.size() == list.size() && arrayList2.containsAll(list)) {
            int size2 = arrayList == null ? 0 : arrayList.size();
            while (i2 < size2) {
                cre.c((View) arrayList.get(i2));
                i2++;
            }
            for (int size3 = list.size() - 1; size3 >= 0; size3--) {
                cre.F((View) list.get(size3));
            }
        }
    }

    public static final GradientDrawable L(Integer num, Integer num2, Integer num3, int i2) {
        float f2 = (float) i2;
        float[] fArr = new float[8];
        for (int i3 = 0; i3 < 8; i3++) {
            fArr[i3] = f2;
        }
        return M(num, num2, num3, fArr);
    }

    public static final GradientDrawable M(Integer num, Integer num2, Integer num3, float[] fArr) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadii(fArr);
        if (num != null) {
            gradientDrawable.setColor(num.intValue());
        }
        if (!(num2 == null || num3 == null)) {
            gradientDrawable.setStroke(num3.intValue(), num2.intValue());
        }
        return gradientDrawable;
    }

    public static void N(b bVar, File file, mg5 mg5) {
        try {
            Uri f2 = mg5.f(bVar, file);
            stf stf = new stf(bVar);
            ((Intent) stf.b).setType("image/*");
            stf.K(f2);
            stf.L((CharSequence) null);
            stf.M();
        } catch (Exception e2) {
            udd.s("swb", "sharePhoto error", e2);
        }
    }

    public static void O(Context context, String str) {
        try {
            stf stf = new stf(context);
            ((Intent) stf.b).setType(HTTP.PLAIN_TEXT_TYPE);
            stf.L(str);
            stf.M();
        } catch (Exception e2) {
            udd.s("swb", "shareText error", e2);
        }
    }

    public static void P(Context context, File file, mg5 mg5) {
        try {
            Uri f2 = mg5.f(context, file);
            stf stf = new stf(context);
            ((Intent) stf.b).setType("video/*");
            stf.K(f2);
            stf.L((CharSequence) null);
            stf.M();
        } catch (Exception e2) {
            udd.s("swb", "shareVideo error", e2);
        }
    }

    public static final StateListDrawable Q(GradientDrawable gradientDrawable, GradientDrawable gradientDrawable2, GradientDrawable gradientDrawable3) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        if (gradientDrawable2 != null) {
            stateListDrawable.addState(new int[]{16842919}, gradientDrawable2);
            stateListDrawable.addState(new int[]{16842908}, gradientDrawable2);
            stateListDrawable.addState(new int[]{16843518}, gradientDrawable2);
        }
        if (gradientDrawable3 != null) {
            stateListDrawable.addState(new int[]{-16842910}, gradientDrawable3);
        }
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }

    public static ta8 R(MediaRoute2Info mediaRoute2Info) {
        if (mediaRoute2Info == null) {
            return null;
        }
        ul7 ul7 = new ul7(d4.r(mediaRoute2Info), y98.j(mediaRoute2Info).toString());
        int a2 = y98.a(mediaRoute2Info);
        Bundle bundle = (Bundle) ul7.a;
        bundle.putInt("connectionState", a2);
        bundle.putInt("volumeHandling", y98.y(mediaRoute2Info));
        bundle.putInt("volumeMax", y98.C(mediaRoute2Info));
        bundle.putInt("volume", y98.D(mediaRoute2Info));
        Bundle j = d4.j(mediaRoute2Info);
        if (j == null) {
            bundle.putBundle("extras", (Bundle) null);
        } else {
            bundle.putBundle("extras", new Bundle(j));
        }
        bundle.putBoolean("enabled", true);
        bundle.putBoolean("canDisconnect", false);
        CharSequence z = y98.z(mediaRoute2Info);
        if (z != null) {
            bundle.putString("status", z.toString());
        }
        Uri i2 = y98.i(mediaRoute2Info);
        if (i2 != null) {
            bundle.putString("iconUri", i2.toString());
        }
        Bundle j2 = d4.j(mediaRoute2Info);
        if (j2 == null || !j2.containsKey("androidx.mediarouter.media.KEY_EXTRAS") || !j2.containsKey("androidx.mediarouter.media.KEY_DEVICE_TYPE") || !j2.containsKey("androidx.mediarouter.media.KEY_CONTROL_FILTERS")) {
            return null;
        }
        Bundle bundle2 = j2.getBundle("androidx.mediarouter.media.KEY_EXTRAS");
        if (bundle2 == null) {
            bundle.putBundle("extras", (Bundle) null);
        } else {
            bundle.putBundle("extras", new Bundle(bundle2));
        }
        bundle.putInt("deviceType", j2.getInt("androidx.mediarouter.media.KEY_DEVICE_TYPE", 0));
        bundle.putInt("playbackType", j2.getInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", 1));
        ArrayList parcelableArrayList = j2.getParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS");
        if (parcelableArrayList != null) {
            ul7.j(parcelableArrayList);
        }
        return ul7.o();
    }

    public static String S(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str2;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = objArr.length;
            if (i3 >= length) {
                break;
            }
            Object obj = objArr[i3];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e2) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
                    sb.append(name);
                    sb.append("@");
                    sb.append(hexString);
                    String sb2 = sb.toString();
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(sb2), e2);
                    String name2 = e2.getClass().getName();
                    StringBuilder sb3 = new StringBuilder(name2.length() + sb2.length() + 8 + 1);
                    sb3.append("<");
                    sb3.append(sb2);
                    sb3.append(" threw ");
                    sb3.append(name2);
                    sb3.append(">");
                    str2 = sb3.toString();
                }
            }
            objArr[i3] = str2;
            i3++;
        }
        StringBuilder sb4 = new StringBuilder(str.length() + (length * 16));
        int i4 = 0;
        while (true) {
            length2 = objArr.length;
            if (i2 >= length2 || (indexOf = str.indexOf("%s", i4)) == -1) {
                sb4.append(str, i4, str.length());
            } else {
                sb4.append(str, i4, indexOf);
                sb4.append(objArr[i2]);
                i4 = indexOf + 2;
                i2++;
            }
        }
        sb4.append(str, i4, str.length());
        if (i2 < length2) {
            sb4.append(" [");
            sb4.append(objArr[i2]);
            for (int i5 = i2 + 1; i5 < objArr.length; i5++) {
                sb4.append(", ");
                sb4.append(objArr[i5]);
            }
            sb4.append(']');
        }
        return sb4.toString();
    }

    public static void a(ch7 ch7, h36 h36, Executor executor) {
        ch7.c(new p36(ch7, 0, h36), executor);
    }

    public static void b(cre cre, ArrayList arrayList) {
        if (cre != null) {
            int i2 = 0;
            if (cre instanceof kre) {
                kre kre = (kre) cre;
                int size = kre.V0.size();
                while (i2 < size) {
                    b(kre.U(i2), arrayList);
                    i2++;
                }
                return;
            }
            ArrayList arrayList2 = cre.X;
            if (!(!(arrayList2 == null || arrayList2.isEmpty()))) {
                ArrayList arrayList3 = cre.Y;
                if (arrayList3 == null || arrayList3.isEmpty()) {
                    int size2 = arrayList.size();
                    while (i2 < size2) {
                        cre.c((View) arrayList.get(i2));
                        i2++;
                    }
                }
            }
        }
    }

    public static final RippleDrawable c(int i2, int i3, int i4, int i5) {
        float[] fArr = new float[8];
        Arrays.fill(fArr, (float) i5);
        return new RippleDrawable(ColorStateList.valueOf(i3), Q(M(Integer.valueOf(i2), (Integer) null, (Integer) null, fArr), (GradientDrawable) null, M(Integer.valueOf(i4), (Integer) null, (Integer) null, fArr)), M(-65536, (Integer) null, (Integer) null, fArr));
    }

    public static void d(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void e(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void f(String str, boolean z) {
        if (!z) {
            throw ParserException.a((RuntimeException) null, str);
        }
    }

    public static void g(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void h(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void i(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    public static boolean j(String str) {
        HashMap hashMap = wr3.c;
        sr3 sr3 = (sr3) hashMap.get(str);
        if (sr3 == null) {
            return false;
        }
        sr3.a.a();
        hashMap.remove(str);
        return true;
    }

    public static final boolean k(long j, List list) {
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yx2 yx2 = (yx2) it.next();
            if (yx2.a() <= j && j <= yx2.b()) {
                return true;
            }
        }
        return false;
    }

    public static hld l(String str, UnsatisfiedLinkError unsatisfiedLinkError) {
        hld hld;
        if (unsatisfiedLinkError.getMessage() == null || !unsatisfiedLinkError.getMessage().contains("ELF")) {
            Matcher matcher = Pattern.compile("\\P{ASCII}+").matcher(str);
            if (matcher.find()) {
                matcher.group();
                hld = new hld(str, "corrupted lib name: " + unsatisfiedLinkError.toString());
            } else {
                hld = new hld(str, unsatisfiedLinkError.toString());
            }
        } else {
            hld = new hld(str, unsatisfiedLinkError.toString());
        }
        hld.initCause(unsatisfiedLinkError);
        return hld;
    }

    public static final yx2 m(long j, List list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            yx2 yx2 = (yx2) obj;
            if (yx2.a() <= j && j <= yx2.b()) {
                break;
            }
        }
        return (yx2) obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: yx2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.yx2 n(long r5, java.util.List r7) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x0009:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0022
            java.lang.Object r1 = r7.next()
            r2 = r1
            yx2 r2 = (defpackage.yx2) r2
            long r2 = r2.a()
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x0009
            r0.add(r1)
            goto L_0x0009
        L_0x0022:
            java.util.Iterator r5 = r0.iterator()
            boolean r6 = r5.hasNext()
            if (r6 != 0) goto L_0x002e
            r5 = 0
            goto L_0x0059
        L_0x002e:
            java.lang.Object r6 = r5.next()
            boolean r7 = r5.hasNext()
            if (r7 != 0) goto L_0x003a
        L_0x0038:
            r5 = r6
            goto L_0x0059
        L_0x003a:
            r7 = r6
            yx2 r7 = (defpackage.yx2) r7
            long r0 = r7.b()
        L_0x0041:
            java.lang.Object r7 = r5.next()
            r2 = r7
            yx2 r2 = (defpackage.yx2) r2
            long r2 = r2.b()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0052
            r6 = r7
            r0 = r2
        L_0x0052:
            boolean r7 = r5.hasNext()
            if (r7 != 0) goto L_0x0041
            goto L_0x0038
        L_0x0059:
            yx2 r5 = (defpackage.yx2) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.swb.n(long, java.util.List):yx2");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: yx2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.yx2 o(long r5, java.util.List r7) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x0009:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0022
            java.lang.Object r1 = r7.next()
            r2 = r1
            yx2 r2 = (defpackage.yx2) r2
            long r2 = r2.b()
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x0009
            r0.add(r1)
            goto L_0x0009
        L_0x0022:
            java.util.Iterator r5 = r0.iterator()
            boolean r6 = r5.hasNext()
            if (r6 != 0) goto L_0x002e
            r5 = 0
            goto L_0x0059
        L_0x002e:
            java.lang.Object r6 = r5.next()
            boolean r7 = r5.hasNext()
            if (r7 != 0) goto L_0x003a
        L_0x0038:
            r5 = r6
            goto L_0x0059
        L_0x003a:
            r7 = r6
            yx2 r7 = (defpackage.yx2) r7
            long r0 = r7.b()
        L_0x0041:
            java.lang.Object r7 = r5.next()
            r2 = r7
            yx2 r2 = (defpackage.yx2) r2
            long r2 = r2.b()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0052
            r6 = r7
            r0 = r2
        L_0x0052:
            boolean r7 = r5.hasNext()
            if (r7 != 0) goto L_0x0041
            goto L_0x0038
        L_0x0059:
            yx2 r5 = (defpackage.yx2) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.swb.o(long, java.util.List):yx2");
    }

    public static View p(View view, String str) {
        WeakHashMap weakHashMap = eaf.a;
        if (str.equals(t9f.k(view))) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View p = p(viewGroup.getChildAt(i2), str);
            if (p != null) {
                return p;
            }
        }
        return null;
    }

    public static void q(yr yrVar, View view) {
        if (view.getVisibility() == 0) {
            WeakHashMap weakHashMap = eaf.a;
            String k = t9f.k(view);
            if (k != null) {
                yrVar.put(k, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    q(yrVar, viewGroup.getChildAt(i2));
                }
            }
        }
    }

    public static final void r(ViewPager2 viewPager2) {
        RecyclerView recyclerView = (RecyclerView) myc.O(myc.L(new es(8, viewPager2), x51.D0));
        if (recyclerView != null) {
            recyclerView.setId(qhc.U0);
        }
    }

    public static wr3 s(Bundle bundle) {
        String string;
        Bundle bundle2;
        if (bundle == null || (string = bundle.getString("ControllerChangeHandler.className")) == null || (bundle2 = bundle.getBundle("ControllerChangeHandler.savedState")) == null) {
            return null;
        }
        try {
            Class l = udd.l(string, true);
            wr3 wr3 = (wr3) (l != null ? l.newInstance() : null);
            if (wr3 == null) {
                return null;
            }
            wr3.h(bundle2);
            return wr3;
        } catch (Exception e2) {
            StringBuilder m = hr1.m("An exception occurred while creating a new instance of ", string, ". ");
            m.append(e2.getMessage());
            throw new RuntimeException(m.toString());
        }
    }

    public static vhb t(String str) {
        if (str.equals("http/1.0")) {
            return vhb.b;
        }
        if (str.equals("http/1.1")) {
            return vhb.c;
        }
        if (str.equals("h2_prior_knowledge")) {
            return vhb.Y;
        }
        if (str.equals("h2")) {
            return vhb.X;
        }
        if (str.equals("spdy/3.1")) {
            return vhb.o;
        }
        if (str.equals("quic")) {
            return vhb.Z;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    public static Object u(Future future) {
        Object obj;
        if (future.isDone()) {
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
        throw new IllegalStateException(n06.x("Future was expected to be done: %s", new Object[]{future}));
    }

    public static Field v() {
        if (e == null) {
            Field declaredField = Location.class.getDeclaredField("mFieldsMask");
            e = declaredField;
            declaredField.setAccessible(true);
        }
        return e;
    }

    public static int w() {
        if (g == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_BEARING_ACCURACY_MASK");
            declaredField.setAccessible(true);
            g = Integer.valueOf(declaredField.getInt((Object) null));
        }
        return g.intValue();
    }

    public static int x() {
        if (f == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_SPEED_ACCURACY_MASK");
            declaredField.setAccessible(true);
            f = Integer.valueOf(declaredField.getInt((Object) null));
        }
        return f.intValue();
    }

    public static int y() {
        if (h == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_VERTICAL_ACCURACY_MASK");
            declaredField.setAccessible(true);
            h = Integer.valueOf(declaredField.getInt((Object) null));
        }
        return h.intValue();
    }

    public static ArrayList z(List list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (Object i2 : list) {
            MediaRoute2Info i3 = d4.i(i2);
            if (i3 != null) {
                arrayList.add(d4.r(i3));
            }
        }
        return arrayList;
    }
}
