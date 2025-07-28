package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.format.Time;
import android.util.Base64;
import android.util.Size;
import android.util.SparseArray;
import android.view.View;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;
import one.me.android.concurrent.SingleCoreActivity;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: hhd  reason: default package */
public abstract class hhd {
    public static boolean a;
    public static final jk9 b = new Object();
    public static final kk9 c = new Object();
    public static final /* synthetic */ int d = 0;

    public static String A(int i) {
        ArrayList arrayList = new ArrayList();
        if ((i & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        return String.join("|", arrayList);
    }

    public static final ArrayList D(ov0 ov0) {
        String str;
        try {
            ArrayList arrayList = new ArrayList(1);
            if (ov0.b()) {
                str = ov0.c();
            } else {
                byte[] bytes = ov0.c().getBytes(Charset.forName("UTF-8"));
                MessageDigest instance = MessageDigest.getInstance("SHA-1");
                instance.update(bytes, 0, bytes.length);
                str = Base64.encodeToString(instance.digest(), 11);
            }
            arrayList.add(str);
            return arrayList;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static final Object E(View view, int i) {
        Object tag = view.getTag();
        SparseArray sparseArray = tag instanceof SparseArray ? (SparseArray) tag : null;
        if (sparseArray != null) {
            return sparseArray.get(i);
        }
        return null;
    }

    public static boolean F(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean G(Context context) {
        Class<hhd> cls = hhd.class;
        try {
            boolean z = true;
            if (context.getPackageManager().getComponentEnabledSetting(new ComponentName("ru.oneme.app", SingleCoreActivity.class.getName())) != 1) {
                z = false;
            }
            a = z;
            String name = cls.getName();
            fn6 fn6 = udd.e;
            if (fn6 != null) {
                if (fn6.c()) {
                    fn6.d(tn7.X, name, "isEnabled=" + a, (Throwable) null);
                }
            }
            return a;
        } catch (Throwable th) {
            udd.s(cls.getName(), "fail to get component", th);
            return false;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00be, code lost:
        r45 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:?, code lost:
        r53.z();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x07ee, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x07ef, code lost:
        r5 = r0;
        defpackage.udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", r5);
        r0 = uzc.a.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x07fd, code lost:
        if (r0.hasNext() != false) goto L_0x07ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x07ff, code lost:
        ((defpackage.ny9) r0.next()).getClass();
        defpackage.ny9.a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x080c, code lost:
        r0 = defpackage.hr1.t(m4b.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x0812, code lost:
        if (r0 != 0) goto L_0x0814;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x0814, code lost:
        if (r0 != 1) goto L_0x0816;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x081b, code lost:
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x081c, code lost:
        throw r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ym8 H(ws8 r53) {
        /*
            r1 = r53
            java.lang.String r3 = "type"
            java.lang.String r4 = "text"
            r8 = 1
            java.lang.String r9 = "payloadCatching catch error"
            java.lang.String r10 = "ServerPayload/PayloadCatching"
            int r0 = defpackage.jjd.K(r53)     // Catch:{ all -> 0x0011 }
            r11 = r0
            goto L_0x0041
        L_0x0011:
            r0 = move-exception
            r11 = r0
            defpackage.udd.S(r10, r9, r11)
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x001c:
            boolean r12 = r0.hasNext()
            if (r12 == 0) goto L_0x002f
            java.lang.Object r12 = r0.next()
            ny9 r12 = (defpackage.ny9) r12
            r12.getClass()
            defpackage.ny9.a(r11)
            goto L_0x001c
        L_0x002f:
            int r0 = m4b.a
            int r0 = defpackage.hr1.t(r0)
            if (r0 == 0) goto L_0x0040
            if (r0 == r8) goto L_0x003f
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x003f:
            throw r11
        L_0x0040:
            r11 = 0
        L_0x0041:
            r12 = 0
            if (r11 != 0) goto L_0x0045
            return r12
        L_0x0045:
            zy r0 = new zy
            r0.<init>()
            vs8 r13 = vs8.b
            hw4 r14 = defpackage.hw4.a
            r29 = r0
            r25 = r12
            r28 = r25
            r30 = r28
            r32 = r30
            r40 = r32
            r42 = r40
            r43 = r42
            r31 = r13
            r41 = r14
            r14 = 0
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r26 = 0
            r33 = 0
            r34 = 0
            r36 = 0
            r37 = 0
            r38 = 0
        L_0x0077:
            if (r14 >= r11) goto L_0x0858
            java.lang.String r0 = defpackage.jjd.M(r53)     // Catch:{ all -> 0x007e }
            goto L_0x00ae
        L_0x007e:
            r0 = move-exception
            r2 = r0
            defpackage.udd.S(r10, r9, r2)
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0089:
            boolean r44 = r0.hasNext()
            if (r44 == 0) goto L_0x009c
            java.lang.Object r44 = r0.next()
            ny9 r44 = (defpackage.ny9) r44
            r44.getClass()
            defpackage.ny9.a(r2)
            goto L_0x0089
        L_0x009c:
            int r0 = m4b.a
            int r0 = defpackage.hr1.t(r0)
            if (r0 == 0) goto L_0x00ad
            if (r0 == r8) goto L_0x00ac
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00ac:
            throw r2
        L_0x00ad:
            r0 = r12
        L_0x00ae:
            if (r0 != 0) goto L_0x00b7
        L_0x00b0:
            r45 = r13
        L_0x00b2:
            r2 = 0
        L_0x00b3:
            r5 = 0
            goto L_0x0852
        L_0x00b7:
            int r2 = r0.hashCode()
            switch(r2) {
                case -1745040715: goto L_0x07de;
                case -1716357513: goto L_0x07cc;
                case -1249474914: goto L_0x077e;
                case -905962955: goto L_0x072f;
                case -892481550: goto L_0x06d0;
                case -295931082: goto L_0x0681;
                case -8339209: goto L_0x0646;
                case 3355: goto L_0x05f7;
                case 98494: goto L_0x05a8;
                case 115180: goto L_0x055a;
                case 3321850: goto L_0x04aa;
                case 3556653: goto L_0x0465;
                case 3560141: goto L_0x0416;
                case 3575610: goto L_0x038a;
                case 3744723: goto L_0x033c;
                case 109757599: goto L_0x032a;
                case 538738099: goto L_0x0318;
                case 538883521: goto L_0x02bf;
                case 999592402: goto L_0x0271;
                case 1195845394: goto L_0x0222;
                case 2077959257: goto L_0x00c3;
                default: goto L_0x00be;
            }
        L_0x00be:
            r45 = r13
        L_0x00c0:
            r2 = 0
            goto L_0x07e9
        L_0x00c3:
            java.lang.String r2 = "delayedAttributes"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x00cc
            goto L_0x00be
        L_0x00cc:
            int r0 = r53.x0()     // Catch:{ all -> 0x00d2 }
            r2 = r0
            goto L_0x0102
        L_0x00d2:
            r0 = move-exception
            r2 = r0
            defpackage.udd.S(r10, r9, r2)
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x00dd:
            boolean r42 = r0.hasNext()
            if (r42 == 0) goto L_0x00f0
            java.lang.Object r42 = r0.next()
            ny9 r42 = (defpackage.ny9) r42
            r42.getClass()
            defpackage.ny9.a(r2)
            goto L_0x00dd
        L_0x00f0:
            int r0 = m4b.a
            int r0 = defpackage.hr1.t(r0)
            if (r0 == 0) goto L_0x0101
            if (r0 == r8) goto L_0x0100
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0100:
            throw r2
        L_0x0101:
            r2 = 0
        L_0x0102:
            if (r2 != 0) goto L_0x0107
            r42 = r12
            goto L_0x00b0
        L_0x0107:
            r45 = r13
            r5 = -1
            r7 = 0
            r15 = 0
        L_0x010d:
            if (r15 >= r2) goto L_0x020f
            java.lang.String r0 = defpackage.jjd.M(r53)     // Catch:{ all -> 0x0114 }
            goto L_0x0144
        L_0x0114:
            r0 = move-exception
            r12 = r0
            defpackage.udd.S(r10, r9, r12)
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x011f:
            boolean r13 = r0.hasNext()
            if (r13 == 0) goto L_0x0132
            java.lang.Object r13 = r0.next()
            ny9 r13 = (defpackage.ny9) r13
            r13.getClass()
            defpackage.ny9.a(r12)
            goto L_0x011f
        L_0x0132:
            int r0 = m4b.a
            int r0 = defpackage.hr1.t(r0)
            if (r0 == 0) goto L_0x0143
            if (r0 == r8) goto L_0x0142
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0142:
            throw r12
        L_0x0143:
            r0 = 0
        L_0x0144:
            if (r0 != 0) goto L_0x0148
            goto L_0x020c
        L_0x0148:
            java.lang.String r12 = "timeToFire"
            boolean r12 = r0.equals(r12)
            if (r12 == 0) goto L_0x0193
            r12 = -1
            java.lang.Long r5 = java.lang.Long.valueOf(r12)
            long r48 = defpackage.jjd.J(r1, r12)     // Catch:{ all -> 0x015f }
            java.lang.Long r5 = java.lang.Long.valueOf(r48)     // Catch:{ all -> 0x015f }
            goto L_0x018d
        L_0x015f:
            r0 = move-exception
            defpackage.udd.S(r10, r9, r0)
            java.util.concurrent.CopyOnWriteArraySet r6 = uzc.a
            java.util.Iterator r6 = r6.iterator()
        L_0x0169:
            boolean r12 = r6.hasNext()
            if (r12 == 0) goto L_0x017c
            java.lang.Object r12 = r6.next()
            ny9 r12 = (defpackage.ny9) r12
            r12.getClass()
            defpackage.ny9.a(r0)
            goto L_0x0169
        L_0x017c:
            int r6 = m4b.a
            int r6 = defpackage.hr1.t(r6)
            if (r6 == 0) goto L_0x018d
            if (r6 == r8) goto L_0x018c
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x018c:
            throw r0
        L_0x018d:
            long r5 = r5.longValue()
            goto L_0x020c
        L_0x0193:
            java.lang.String r12 = "notifySender"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x01d9
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            boolean r0 = defpackage.jjd.E(r53)     // Catch:{ all -> 0x01a6 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x01a6 }
            goto L_0x01d4
        L_0x01a6:
            r0 = move-exception
            defpackage.udd.S(r10, r9, r0)
            java.util.concurrent.CopyOnWriteArraySet r12 = uzc.a
            java.util.Iterator r12 = r12.iterator()
        L_0x01b0:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x01c3
            java.lang.Object r13 = r12.next()
            ny9 r13 = (defpackage.ny9) r13
            r13.getClass()
            defpackage.ny9.a(r0)
            goto L_0x01b0
        L_0x01c3:
            int r12 = m4b.a
            int r12 = defpackage.hr1.t(r12)
            if (r12 == 0) goto L_0x01d4
            if (r12 == r8) goto L_0x01d3
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01d3:
            throw r0
        L_0x01d4:
            boolean r7 = r7.booleanValue()
            goto L_0x020c
        L_0x01d9:
            r53.z()     // Catch:{ all -> 0x01dd }
            goto L_0x020c
        L_0x01dd:
            r0 = move-exception
            r12 = r0
            defpackage.udd.S(r10, r9, r12)
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x01e8:
            boolean r13 = r0.hasNext()
            if (r13 == 0) goto L_0x01fb
            java.lang.Object r13 = r0.next()
            ny9 r13 = (defpackage.ny9) r13
            r13.getClass()
            defpackage.ny9.a(r12)
            goto L_0x01e8
        L_0x01fb:
            int r0 = m4b.a
            int r0 = defpackage.hr1.t(r0)
            if (r0 == 0) goto L_0x020c
            if (r0 == r8) goto L_0x020b
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x020b:
            throw r12
        L_0x020c:
            int r15 = r15 + r8
            goto L_0x010d
        L_0x020f:
            r12 = -1
            int r0 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x0219
            r42 = 0
            goto L_0x00b2
        L_0x0219:
            nd4 r0 = new nd4
            r0.<init>(r5, r7)
            r42 = r0
            goto L_0x00b2
        L_0x0222:
            r45 = r13
            java.lang.String r2 = "viewTime"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x022e
        L_0x022c:
            goto L_0x00c0
        L_0x022e:
            r5 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            long r12 = defpackage.jjd.J(r1, r5)     // Catch:{ all -> 0x023d }
            java.lang.Long r2 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x023d }
            goto L_0x026b
        L_0x023d:
            r0 = move-exception
            defpackage.udd.S(r10, r9, r0)
            java.util.concurrent.CopyOnWriteArraySet r5 = uzc.a
            java.util.Iterator r5 = r5.iterator()
        L_0x0247:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x025a
            java.lang.Object r6 = r5.next()
            ny9 r6 = (defpackage.ny9) r6
            r6.getClass()
            defpackage.ny9.a(r0)
            goto L_0x0247
        L_0x025a:
            int r5 = m4b.a
            int r5 = defpackage.hr1.t(r5)
            if (r5 == 0) goto L_0x026b
            if (r5 == r8) goto L_0x026a
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x026a:
            throw r0
        L_0x026b:
            long r34 = r2.longValue()
            goto L_0x00b2
        L_0x0271:
            r45 = r13
            java.lang.String r2 = "liveUntil"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x027c
        L_0x027b:
            goto L_0x022c
        L_0x027c:
            r5 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            long r12 = defpackage.jjd.J(r1, r5)     // Catch:{ all -> 0x028b }
            java.lang.Long r2 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x028b }
            goto L_0x02b9
        L_0x028b:
            r0 = move-exception
            defpackage.udd.S(r10, r9, r0)
            java.util.concurrent.CopyOnWriteArraySet r5 = uzc.a
            java.util.Iterator r5 = r5.iterator()
        L_0x0295:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x02a8
            java.lang.Object r6 = r5.next()
            ny9 r6 = (defpackage.ny9) r6
            r6.getClass()
            defpackage.ny9.a(r0)
            goto L_0x0295
        L_0x02a8:
            int r5 = m4b.a
            int r5 = defpackage.hr1.t(r5)
            if (r5 == 0) goto L_0x02b9
            if (r5 == r8) goto L_0x02b8
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x02b8:
            throw r0
        L_0x02b9:
            long r38 = r2.longValue()
            goto L_0x00b2
        L_0x02bf:
            r45 = r13
            java.lang.String r2 = "messagePreview"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x02ca
            goto L_0x027b
        L_0x02ca:
            mn r0 = new mn
            r2 = 23
            r5 = 0
            r0.<init>((int) r2, (boolean) r5)
            int r2 = defpackage.jjd.K(r53)
            if (r2 != 0) goto L_0x02dc
            r40 = 0
            goto L_0x00b2
        L_0x02dc:
            r5 = 0
        L_0x02dd:
            if (r5 >= r2) goto L_0x030f
            java.lang.String r6 = r53.z0()
            r6.getClass()
            java.lang.String r7 = "attachment"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L_0x02ff
            boolean r6 = r6.equals(r4)
            if (r6 != 0) goto L_0x02f8
            r53.z()
            goto L_0x030d
        L_0x02f8:
            java.lang.String r6 = defpackage.jjd.M(r53)
            r0.b = r6
            goto L_0x030d
        L_0x02ff:
            fy r6 = fy.b(r53)
            zy r7 = new zy
            r7.<init>(r8)
            r7.add(r6)
            r0.c = r7
        L_0x030d:
            int r5 = r5 + r8
            goto L_0x02dd
        L_0x030f:
            i62 r2 = new i62
            r2.<init>(r0)
            r40 = r2
            goto L_0x00b2
        L_0x0318:
            r45 = r13
            java.lang.String r2 = "attaches"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0324
            goto L_0x022c
        L_0x0324:
            zy r29 = zy.a(r53)
            goto L_0x00b2
        L_0x032a:
            r45 = r13
            java.lang.String r2 = "stats"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0336
            goto L_0x027b
        L_0x0336:
            ks8 r32 = ks8.a(r53)
            goto L_0x00b2
        L_0x033c:
            r45 = r13
            java.lang.String r2 = "zoom"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0348
            goto L_0x022c
        L_0x0348:
            r2 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            int r0 = defpackage.jjd.I(r53)     // Catch:{ all -> 0x0356 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0356 }
            goto L_0x0384
        L_0x0356:
            r0 = move-exception
            defpackage.udd.S(r10, r9, r0)
            java.util.concurrent.CopyOnWriteArraySet r2 = uzc.a
            java.util.Iterator r2 = r2.iterator()
        L_0x0360:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0373
            java.lang.Object r6 = r2.next()
            ny9 r6 = (defpackage.ny9) r6
            r6.getClass()
            defpackage.ny9.a(r0)
            goto L_0x0360
        L_0x0373:
            int r2 = m4b.a
            int r2 = defpackage.hr1.t(r2)
            if (r2 == 0) goto L_0x0384
            if (r2 == r8) goto L_0x0383
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0383:
            throw r0
        L_0x0384:
            int r36 = r5.intValue()
            goto L_0x00b2
        L_0x038a:
            r45 = r13
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0394
            goto L_0x027b
        L_0x0394:
            java.lang.String r0 = defpackage.jjd.M(r53)     // Catch:{ all -> 0x0399 }
            goto L_0x03c9
        L_0x0399:
            r0 = move-exception
            r2 = r0
            defpackage.udd.S(r10, r9, r2)
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x03a4:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x03b7
            java.lang.Object r5 = r0.next()
            ny9 r5 = (defpackage.ny9) r5
            r5.getClass()
            defpackage.ny9.a(r2)
            goto L_0x03a4
        L_0x03b7:
            int r0 = m4b.a
            int r0 = defpackage.hr1.t(r0)
            if (r0 == 0) goto L_0x03c8
            if (r0 == r8) goto L_0x03c7
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x03c7:
            throw r2
        L_0x03c8:
            r0 = 0
        L_0x03c9:
            r0.getClass()
            int r2 = r0.hashCode()
            switch(r2) {
                case 2614219: goto L_0x03f6;
                case 68091487: goto L_0x03eb;
                case 1456933091: goto L_0x03e0;
                case 1499988179: goto L_0x03d5;
                default: goto L_0x03d3;
            }
        L_0x03d3:
            r0 = -1
            goto L_0x0400
        L_0x03d5:
            java.lang.String r2 = "CHANNEL_ADMIN"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x03de
            goto L_0x03d3
        L_0x03de:
            r0 = 3
            goto L_0x0400
        L_0x03e0:
            java.lang.String r2 = "CHANNEL"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x03e9
            goto L_0x03d3
        L_0x03e9:
            r0 = 2
            goto L_0x0400
        L_0x03eb:
            java.lang.String r2 = "GROUP"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x03f4
            goto L_0x03d3
        L_0x03f4:
            r0 = r8
            goto L_0x0400
        L_0x03f6:
            java.lang.String r2 = "USER"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x03ff
            goto L_0x03d3
        L_0x03ff:
            r0 = 0
        L_0x0400:
            switch(r0) {
                case 0: goto L_0x0413;
                case 1: goto L_0x0410;
                case 2: goto L_0x040d;
                case 3: goto L_0x0407;
                default: goto L_0x0403;
            }
        L_0x0403:
            r31 = r45
            goto L_0x00b2
        L_0x0407:
            vs8 r0 = vs8.Y
        L_0x0409:
            r31 = r0
            goto L_0x00b2
        L_0x040d:
            vs8 r0 = vs8.X
            goto L_0x0409
        L_0x0410:
            vs8 r0 = vs8.o
            goto L_0x0409
        L_0x0413:
            vs8 r0 = vs8.c
            goto L_0x0409
        L_0x0416:
            r45 = r13
            java.lang.String r2 = "time"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0422
            goto L_0x022c
        L_0x0422:
            r5 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            long r12 = defpackage.jjd.J(r1, r5)     // Catch:{ all -> 0x0431 }
            java.lang.Long r2 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0431 }
            goto L_0x045f
        L_0x0431:
            r0 = move-exception
            defpackage.udd.S(r10, r9, r0)
            java.util.concurrent.CopyOnWriteArraySet r5 = uzc.a
            java.util.Iterator r5 = r5.iterator()
        L_0x043b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x044e
            java.lang.Object r6 = r5.next()
            ny9 r6 = (defpackage.ny9) r6
            r6.getClass()
            defpackage.ny9.a(r0)
            goto L_0x043b
        L_0x044e:
            int r5 = m4b.a
            int r5 = defpackage.hr1.t(r5)
            if (r5 == 0) goto L_0x045f
            if (r5 == r8) goto L_0x045e
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x045e:
            throw r0
        L_0x045f:
            long r19 = r2.longValue()
            goto L_0x00b2
        L_0x0465:
            r45 = r13
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x046f
            goto L_0x027b
        L_0x046f:
            java.lang.String r0 = defpackage.jjd.M(r53)     // Catch:{ all -> 0x0477 }
            r28 = r0
            goto L_0x00b2
        L_0x0477:
            r0 = move-exception
            r2 = r0
            defpackage.udd.S(r10, r9, r2)
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0482:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0495
            java.lang.Object r5 = r0.next()
            ny9 r5 = (defpackage.ny9) r5
            r5.getClass()
            defpackage.ny9.a(r2)
            goto L_0x0482
        L_0x0495:
            int r0 = m4b.a
            int r0 = defpackage.hr1.t(r0)
            if (r0 == 0) goto L_0x04a6
            if (r0 == r8) goto L_0x04a5
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x04a5:
            throw r2
        L_0x04a6:
            r28 = 0
            goto L_0x00b2
        L_0x04aa:
            r45 = r13
            java.lang.String r2 = "link"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x04b6
            goto L_0x022c
        L_0x04b6:
            int r0 = defpackage.jjd.K(r53)
            if (r0 != 0) goto L_0x04c0
            r30 = 0
            goto L_0x00b2
        L_0x04c0:
            r2 = 0
            r47 = 0
            r48 = 0
            r50 = 0
            r51 = 0
            r52 = 0
        L_0x04cb:
            if (r2 >= r0) goto L_0x054f
            java.lang.String r5 = r53.z0()
            r5.getClass()
            int r6 = r5.hashCode()
            switch(r6) {
                case -1361631597: goto L_0x0507;
                case 3575610: goto L_0x04fe;
                case 954925063: goto L_0x04f3;
                case 1437158258: goto L_0x04e8;
                case 1437210115: goto L_0x04dd;
                default: goto L_0x04db;
            }
        L_0x04db:
            r5 = -1
            goto L_0x0511
        L_0x04dd:
            java.lang.String r6 = "chatName"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x04e6
            goto L_0x04db
        L_0x04e6:
            r5 = 4
            goto L_0x0511
        L_0x04e8:
            java.lang.String r6 = "chatLink"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x04f1
            goto L_0x04db
        L_0x04f1:
            r5 = 3
            goto L_0x0511
        L_0x04f3:
            java.lang.String r6 = "message"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x04fc
            goto L_0x04db
        L_0x04fc:
            r5 = 2
            goto L_0x0511
        L_0x04fe:
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L_0x0505
            goto L_0x04db
        L_0x0505:
            r5 = r8
            goto L_0x0511
        L_0x0507:
            java.lang.String r6 = "chatId"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0510
            goto L_0x04db
        L_0x0510:
            r5 = 0
        L_0x0511:
            switch(r5) {
                case 0: goto L_0x0546;
                case 1: goto L_0x0527;
                case 2: goto L_0x0522;
                case 3: goto L_0x051d;
                case 4: goto L_0x0518;
                default: goto L_0x0514;
            }
        L_0x0514:
            r53.z()
            goto L_0x054c
        L_0x0518:
            java.lang.String r51 = defpackage.jjd.M(r53)
            goto L_0x054c
        L_0x051d:
            java.lang.String r52 = defpackage.jjd.M(r53)
            goto L_0x054c
        L_0x0522:
            ym8 r50 = H(r53)
            goto L_0x054c
        L_0x0527:
            java.lang.String r5 = r53.z0()
            if (r5 != 0) goto L_0x052f
        L_0x052d:
            r5 = r8
            goto L_0x0543
        L_0x052f:
            java.lang.String r6 = "FORWARD"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x0542
            java.lang.String r6 = "REPLY"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0540
            goto L_0x052d
        L_0x0540:
            r5 = 2
            goto L_0x0543
        L_0x0542:
            r5 = 3
        L_0x0543:
            r47 = r5
            goto L_0x054c
        L_0x0546:
            long r5 = r53.w0()
            r48 = r5
        L_0x054c:
            int r2 = r2 + r8
            goto L_0x04cb
        L_0x054f:
            rq8 r0 = new rq8
            r46 = r0
            r46.<init>(r47, r48, r50, r51, r52)
            r30 = r0
            goto L_0x00b2
        L_0x055a:
            r45 = r13
            java.lang.String r2 = "ttl"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0566
            goto L_0x027b
        L_0x0566:
            r2 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            int r0 = defpackage.jjd.I(r53)     // Catch:{ all -> 0x0574 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0574 }
            goto L_0x05a2
        L_0x0574:
            r0 = move-exception
            defpackage.udd.S(r10, r9, r0)
            java.util.concurrent.CopyOnWriteArraySet r2 = uzc.a
            java.util.Iterator r2 = r2.iterator()
        L_0x057e:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0591
            java.lang.Object r6 = r2.next()
            ny9 r6 = (defpackage.ny9) r6
            r6.getClass()
            defpackage.ny9.a(r0)
            goto L_0x057e
        L_0x0591:
            int r2 = m4b.a
            int r2 = defpackage.hr1.t(r2)
            if (r2 == 0) goto L_0x05a2
            if (r2 == r8) goto L_0x05a1
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x05a1:
            throw r0
        L_0x05a2:
            int r33 = r5.intValue()
            goto L_0x00b2
        L_0x05a8:
            r45 = r13
            java.lang.String r2 = "cid"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x05b4
            goto L_0x022c
        L_0x05b4:
            r5 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            long r12 = defpackage.jjd.J(r1, r5)     // Catch:{ all -> 0x05c3 }
            java.lang.Long r2 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x05c3 }
            goto L_0x05f1
        L_0x05c3:
            r0 = move-exception
            defpackage.udd.S(r10, r9, r0)
            java.util.concurrent.CopyOnWriteArraySet r5 = uzc.a
            java.util.Iterator r5 = r5.iterator()
        L_0x05cd:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x05e0
            java.lang.Object r6 = r5.next()
            ny9 r6 = (defpackage.ny9) r6
            r6.getClass()
            defpackage.ny9.a(r0)
            goto L_0x05cd
        L_0x05e0:
            int r5 = m4b.a
            int r5 = defpackage.hr1.t(r5)
            if (r5 == 0) goto L_0x05f1
            if (r5 == r8) goto L_0x05f0
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x05f0:
            throw r0
        L_0x05f1:
            long r26 = r2.longValue()
            goto L_0x00b2
        L_0x05f7:
            r45 = r13
            java.lang.String r2 = "id"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0603
            goto L_0x027b
        L_0x0603:
            r5 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            long r12 = defpackage.jjd.J(r1, r5)     // Catch:{ all -> 0x0612 }
            java.lang.Long r2 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0612 }
            goto L_0x0640
        L_0x0612:
            r0 = move-exception
            defpackage.udd.S(r10, r9, r0)
            java.util.concurrent.CopyOnWriteArraySet r5 = uzc.a
            java.util.Iterator r5 = r5.iterator()
        L_0x061c:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x062f
            java.lang.Object r6 = r5.next()
            ny9 r6 = (defpackage.ny9) r6
            r6.getClass()
            defpackage.ny9.a(r0)
            goto L_0x061c
        L_0x062f:
            int r5 = m4b.a
            int r5 = defpackage.hr1.t(r5)
            if (r5 == 0) goto L_0x0640
            if (r5 == r8) goto L_0x063f
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x063f:
            throw r0
        L_0x0640:
            long r17 = r2.longValue()
            goto L_0x00b2
        L_0x0646:
            r45 = r13
            java.lang.String r2 = "elements"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0652
            goto L_0x022c
        L_0x0652:
            sp8 r0 = r53.n()
            int r0 = r0.a()
            r2 = 7
            if (r0 != r2) goto L_0x0674
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r2 = r53.s0()
            r5 = 0
        L_0x0667:
            if (r5 >= r2) goto L_0x067b
            dp8 r6 = defpackage.gk9.h(r53)
            if (r6 == 0) goto L_0x0672
            r0.add(r6)
        L_0x0672:
            int r5 = r5 + r8
            goto L_0x0667
        L_0x0674:
            r53.z()
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x067b:
            java.util.List r41 = defpackage.o23.T(r0)
            goto L_0x00b2
        L_0x0681:
            r45 = r13
            java.lang.String r2 = "updateTime"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x068d
            goto L_0x027b
        L_0x068d:
            r5 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            long r12 = defpackage.jjd.J(r1, r5)     // Catch:{ all -> 0x069c }
            java.lang.Long r2 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x069c }
            goto L_0x06ca
        L_0x069c:
            r0 = move-exception
            defpackage.udd.S(r10, r9, r0)
            java.util.concurrent.CopyOnWriteArraySet r5 = uzc.a
            java.util.Iterator r5 = r5.iterator()
        L_0x06a6:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x06b9
            java.lang.Object r6 = r5.next()
            ny9 r6 = (defpackage.ny9) r6
            r6.getClass()
            defpackage.ny9.a(r0)
            goto L_0x06a6
        L_0x06b9:
            int r5 = m4b.a
            int r5 = defpackage.hr1.t(r5)
            if (r5 == 0) goto L_0x06ca
            if (r5 == r8) goto L_0x06c9
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x06c9:
            throw r0
        L_0x06ca:
            long r21 = r2.longValue()
            goto L_0x00b2
        L_0x06d0:
            r45 = r13
            java.lang.String r2 = "status"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x06dc
            goto L_0x022c
        L_0x06dc:
            java.util.HashMap r0 = ms8.a
            java.lang.String r0 = defpackage.jjd.M(r53)     // Catch:{ all -> 0x06e3 }
            goto L_0x0713
        L_0x06e3:
            r0 = move-exception
            r2 = r0
            defpackage.udd.S(r10, r9, r2)
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x06ee:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0701
            java.lang.Object r5 = r0.next()
            ny9 r5 = (defpackage.ny9) r5
            r5.getClass()
            defpackage.ny9.a(r2)
            goto L_0x06ee
        L_0x0701:
            int r0 = m4b.a
            int r0 = defpackage.hr1.t(r0)
            if (r0 == 0) goto L_0x0712
            if (r0 == r8) goto L_0x0711
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0711:
            throw r2
        L_0x0712:
            r0 = 0
        L_0x0713:
            if (r0 == 0) goto L_0x072c
            int r2 = r0.length()
            if (r2 != 0) goto L_0x071c
            goto L_0x072c
        L_0x071c:
            java.util.HashMap r2 = ms8.a
            java.lang.Object r0 = r2.get(r0)
            ms8 r0 = (ms8) r0
            if (r0 != 0) goto L_0x0728
            ms8 r0 = ms8.b
        L_0x0728:
            r25 = r0
            goto L_0x00b2
        L_0x072c:
            ms8 r0 = ms8.b
            goto L_0x0728
        L_0x072f:
            r45 = r13
            java.lang.String r2 = "sender"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x073b
            goto L_0x027b
        L_0x073b:
            r5 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            long r12 = defpackage.jjd.J(r1, r5)     // Catch:{ all -> 0x074a }
            java.lang.Long r2 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x074a }
            goto L_0x0778
        L_0x074a:
            r0 = move-exception
            defpackage.udd.S(r10, r9, r0)
            java.util.concurrent.CopyOnWriteArraySet r5 = uzc.a
            java.util.Iterator r5 = r5.iterator()
        L_0x0754:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0767
            java.lang.Object r6 = r5.next()
            ny9 r6 = (defpackage.ny9) r6
            r6.getClass()
            defpackage.ny9.a(r0)
            goto L_0x0754
        L_0x0767:
            int r5 = m4b.a
            int r5 = defpackage.hr1.t(r5)
            if (r5 == 0) goto L_0x0778
            if (r5 == r8) goto L_0x0777
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0777:
            throw r0
        L_0x0778:
            long r23 = r2.longValue()
            goto L_0x00b2
        L_0x077e:
            r45 = r13
            java.lang.String r2 = "options"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x078a
            goto L_0x022c
        L_0x078a:
            r2 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            int r0 = defpackage.jjd.I(r53)     // Catch:{ all -> 0x0798 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0798 }
            goto L_0x07c6
        L_0x0798:
            r0 = move-exception
            defpackage.udd.S(r10, r9, r0)
            java.util.concurrent.CopyOnWriteArraySet r6 = uzc.a
            java.util.Iterator r6 = r6.iterator()
        L_0x07a2:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x07b5
            java.lang.Object r7 = r6.next()
            ny9 r7 = (defpackage.ny9) r7
            r7.getClass()
            defpackage.ny9.a(r0)
            goto L_0x07a2
        L_0x07b5:
            int r6 = m4b.a
            int r6 = defpackage.hr1.t(r6)
            if (r6 == 0) goto L_0x07c6
            if (r6 == r8) goto L_0x07c5
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x07c5:
            throw r0
        L_0x07c6:
            int r37 = r5.intValue()
            goto L_0x00b3
        L_0x07cc:
            r45 = r13
            r2 = 0
            java.lang.String r5 = "reactionInfo"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x07d8
            goto L_0x07e9
        L_0x07d8:
            vr8 r43 = defpackage.n1g.G(r53)
            goto L_0x00b3
        L_0x07de:
            r45 = r13
            r2 = 0
            java.lang.String r5 = "constructorId"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x081d
        L_0x07e9:
            r53.z()     // Catch:{ all -> 0x07ee }
            goto L_0x00b3
        L_0x07ee:
            r0 = move-exception
            r5 = r0
            defpackage.udd.S(r10, r9, r5)
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x07f9:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x080c
            java.lang.Object r6 = r0.next()
            ny9 r6 = (defpackage.ny9) r6
            r6.getClass()
            defpackage.ny9.a(r5)
            goto L_0x07f9
        L_0x080c:
            int r0 = m4b.a
            int r0 = defpackage.hr1.t(r0)
            if (r0 == 0) goto L_0x00b3
            if (r0 == r8) goto L_0x081c
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x081c:
            throw r5
        L_0x081d:
            r5 = 0
            defpackage.jjd.J(r1, r5)     // Catch:{ all -> 0x0823 }
            goto L_0x0852
        L_0x0823:
            r0 = move-exception
            r7 = r0
            defpackage.udd.S(r10, r9, r7)
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x082e:
            boolean r12 = r0.hasNext()
            if (r12 == 0) goto L_0x0841
            java.lang.Object r12 = r0.next()
            ny9 r12 = (defpackage.ny9) r12
            r12.getClass()
            defpackage.ny9.a(r7)
            goto L_0x082e
        L_0x0841:
            int r0 = m4b.a
            int r0 = defpackage.hr1.t(r0)
            if (r0 == 0) goto L_0x0852
            if (r0 == r8) goto L_0x0851
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0851:
            throw r7
        L_0x0852:
            int r14 = r14 + r8
            r13 = r45
            r12 = 0
            goto L_0x0077
        L_0x0858:
            ym8 r0 = new ym8
            r16 = r0
            r16.<init>(r17, r19, r21, r23, r25, r26, r28, r29, r30, r31, r32, r33, r34, r36, r37, r38, r40, r41, r42, r43)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hhd.H(ws8):ym8");
    }

    public static hu3 I(hu3 hu3, hu3 hu32) {
        return hu32 == bw4.a ? hu3 : (hu3) hu32.fold(hu3, p33.c);
    }

    public static String J(tn7 tn7, String str, String str2, Long l) {
        StringBuilder sb = new StringBuilder();
        long longValue = l.longValue();
        ThreadLocal threadLocal = nn7.h;
        kn7 kn7 = (kn7) threadLocal.get();
        if (kn7 == null) {
            kn7 = new kn7();
            threadLocal.set(kn7);
        }
        String str3 = kn7.d;
        if (kn7.c != longValue || str3 == null) {
            Time time = kn7.a;
            time.set(longValue);
            StringBuilder sb2 = kn7.b;
            sb2.setLength(0);
            int i = (int) (longValue % 1000);
            d(sb2, time.month + 1);
            sb2.append('-');
            d(sb2, time.monthDay);
            sb2.append(' ');
            d(sb2, time.hour);
            sb2.append(':');
            d(sb2, time.minute);
            sb2.append(':');
            d(sb2, time.second);
            sb2.append('.');
            if (i < 10) {
                sb2.append('0');
            }
            if (i < 100) {
                sb2.append('0');
            }
            sb2.append(i);
            str3 = sb2.toString();
            kn7.d = str3;
            kn7.c = longValue;
        }
        sb.append(str3);
        sb.append(' ');
        sb.append(tn7.b);
        sb.append(' ');
        sb.append(str);
        sb.append(' ');
        if (str2 == null) {
            str2 = BuildConfig.FLAVOR;
        }
        sb.append(str2);
        return sb.toString();
    }

    public static void M() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static j8e N(ry ryVar, Bundle bundle, String str) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
        if (stringArrayList == null) {
            return null;
        }
        ryVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            oy oyVar = (oy) ryVar.a.get(it.next());
            if (oyVar != null) {
                arrayList.add(oyVar);
            }
        }
        if (!arrayList.isEmpty()) {
            return new j8e(ryVar.c, arrayList, stringArrayList);
        }
        return null;
    }

    public static void O(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static final void P(int i, View view, Object obj) {
        Object tag = view.getTag();
        SparseArray sparseArray = tag instanceof SparseArray ? (SparseArray) tag : null;
        if (sparseArray == null) {
            sparseArray = new SparseArray(2);
            view.setTag(sparseArray);
        }
        sparseArray.put(i, obj);
    }

    public static final xi5 Q(dyc dyc, u16 u16, u16 u162) {
        return new xi5(dyc, new lxc(u16, 7, u162), pyc.a);
    }

    public static final j56 a(Context context) {
        Size w = gwf.w(context);
        wia wia = context.getResources().getConfiguration().orientation == 1 ? new wia(Integer.valueOf(w.getWidth()), Integer.valueOf(w.getHeight())) : new wia(Integer.valueOf(w.getHeight()), Integer.valueOf(w.getWidth()));
        int intValue = ((Number) wia.a).intValue();
        int intValue2 = ((Number) wia.b).intValue();
        int max = Math.max(3, intValue / context.getResources().getDimensionPixelSize(r9a.a));
        int i = intValue / max;
        int X = a24.X(((float) 2) * dh4.c().getDisplayMetrics().density);
        int W = a24.W(((double) ((w.getWidth() / max) - ((max - 1) * X))) * 0.7d);
        int W2 = a24.W(Math.ceil(((double) ((intValue2 * max) / i)) * 1.8d));
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(r9a.b);
        return new j56(i, W2, max, X, W, dimensionPixelSize <= 0 ? null : new hbc(0.0f, dimensionPixelSize, dimensionPixelSize, 12));
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i2, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i2 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }

    public static void c(it4 it4, Set set) {
        List<hv3> list;
        List list2;
        List list3;
        List list4;
        it4 it42 = it4;
        Throwable th = null;
        String string = ((g2b) it42.b).a.g.getString("app.pushProxyList", (String) null);
        if (F(string)) {
            udd.p("hhd", "getProxiesFromPushString: empty string", new Object[0]);
            list = Collections.emptyList();
        } else {
            String[] split = string.split("\\s*;\\s*");
            ArrayList arrayList = new ArrayList(split.length);
            int length = split.length;
            int i = 0;
            int i2 = 0;
            while (i2 < length) {
                String[] split2 = split[i2].split("\\s*>\\s*");
                if (split2.length != 2) {
                    udd.s("hhd", "getProxiesFromPushString: failed to parse, no country from proxies delimiter", th);
                } else {
                    String str = split2[i];
                    if (F(str)) {
                        udd.p("hhd", "getCountriesFromString: empty string", new Object[0]);
                        list3 = Collections.emptyList();
                    } else {
                        list3 = Arrays.asList(str.split("\\s*,\\s*"));
                    }
                    String str2 = split2[1];
                    if (F(str2)) {
                        udd.n("hhd", "getProxiesFromString: empty string");
                        list4 = Collections.emptyList();
                    } else {
                        String[] split3 = str2.replace("\"", BuildConfig.FLAVOR).split("\\s*,\\s*");
                        if (split3.length == 0) {
                            udd.T("hhd", "data field have no data", new Object[i]);
                            list4 = Collections.emptyList();
                        } else {
                            ArrayList arrayList2 = new ArrayList(split3.length);
                            int length2 = split3.length;
                            int i3 = i;
                            while (i3 < length2) {
                                String[] split4 = split3[i3].split("\\s*:\\s*");
                                if (split4.length >= 2) {
                                    String trim = split4[i].trim();
                                    String trim2 = split4[1].trim();
                                    if (!trim.isEmpty() && !trim2.isEmpty()) {
                                        arrayList2.add(new cd3(trim, trim2, true));
                                    }
                                }
                                i3++;
                                i = 0;
                            }
                            list4 = arrayList2;
                        }
                    }
                    arrayList.add(new hv3(list3, list4));
                }
                i2++;
                th = null;
                i = 0;
            }
            list = arrayList;
        }
        if (list != null && !list.isEmpty()) {
            String string2 = ((g2b) it42.b).a.g.getString("app.location.country.code", (String) null);
            if (!F(string2)) {
                String trim3 = string2.toLowerCase().trim();
                for (hv3 hv3 : list) {
                    for (String lowerCase : hv3.a) {
                        if (!lowerCase.toLowerCase().trim().equals(trim3) || (list2 = hv3.b) == null || list2.isEmpty()) {
                            Set set2 = set;
                        } else {
                            set.addAll(list2);
                        }
                    }
                    Set set3 = set;
                }
            }
        }
    }

    public static void d(StringBuilder sb, int i) {
        if (i < 10) {
            sb.append('0');
        }
        sb.append(i);
    }

    public static boolean f(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static final Object h(fr6 fr6, tr6 tr6, long j, Object obj, er3 er3) {
        ub5 ub5 = new ub5(fr6.a(tr6, obj), (Continuation) null);
        return j == Long.MAX_VALUE ? n1g.f(new rb5(ub5, (Continuation) null), er3) : ez3.m0(j, ub5, er3);
    }

    public static String i(String str, String str2) {
        if (str2 == null) {
            str2 = BuildConfig.FLAVOR;
        }
        int f0 = h0e.f0(".", str2, 6);
        if (f0 != -1) {
            str2 = str2.substring(1 + f0, str2.length());
        }
        return j(str, str2);
    }

    public static String j(String str, String str2) {
        StringBuilder l = hr1.l(str);
        if (!(str2 == null || str2.length() == 0)) {
            l.append(' ');
            l.append(str2);
        }
        return h0e.B0(l.toString()).toString();
    }

    public static void n(int i, Collection collection) {
        boolean contains = collection.contains(Integer.valueOf(i));
        Locale locale = Locale.US;
        String A = A(i);
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(A(((Integer) it.next()).intValue()));
        }
        e07.j(c3d.i("Effects target ", A, " is not in the supported list ", "[" + String.join(", ", arrayList) + "]", "."), contains);
    }

    public static int o(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static int p(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i == 0 ? 0 : 1;
    }

    public static void q(Context context, String str) {
        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Copied Text", str));
    }

    public static cd3 r(it4 it4) {
        String B = ((g2b) it4.b).a.B();
        j2b j2b = (g2b) it4.b;
        String C = j2b.a.C();
        if (F(B) || F(C)) {
            return null;
        }
        return new cd3(B, C, j2b.a.c("server.useTls", true));
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object s(defpackage.fr6 r8, defpackage.tr6 r9, long r10, java.lang.Object r12, boolean r13, kotlin.coroutines.Continuation r14) {
        /*
            boolean r0 = r14 instanceof qb5
            if (r0 == 0) goto L_0x0014
            r0 = r14
            qb5 r0 = (qb5) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.Z = r1
        L_0x0012:
            r6 = r0
            goto L_0x001a
        L_0x0014:
            qb5 r0 = new qb5
            r0.<init>(r14)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r14 = r6.Y
            pu3 r0 = defpackage.pu3.a
            int r1 = r6.Z
            r7 = 1
            if (r1 == 0) goto L_0x0035
            if (r1 != r7) goto L_0x002d
            boolean r13 = r6.X
            tr6 r9 = r6.o
            defpackage.wx3.H(r14)
            goto L_0x0049
        L_0x002d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0035:
            defpackage.wx3.H(r14)
            r6.o = r9
            r6.X = r13
            r6.Z = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r12
            java.lang.Object r14 = h(r1, r2, r3, r5, r6)
            if (r14 != r0) goto L_0x0049
            return r0
        L_0x0049:
            e13 r14 = (defpackage.e13) r14
            r8 = 0
            if (r14 != 0) goto L_0x004f
            return r8
        L_0x004f:
            java.lang.Object r10 = r14.e0()
            b13 r10 = (defpackage.b13) r10
            boolean r11 = r10 instanceof com.facebook.imagepipeline.image.CloseableStaticBitmap
            r12 = 0
            if (r11 == 0) goto L_0x0061
            com.facebook.imagepipeline.image.CloseableStaticBitmap r10 = (com.facebook.imagepipeline.image.CloseableStaticBitmap) r10
            android.graphics.Bitmap r9 = r10.getUnderlyingBitmap()
            goto L_0x0083
        L_0x0061:
            boolean r11 = r10 instanceof defpackage.f13
            if (r11 == 0) goto L_0x0093
            f13 r10 = (defpackage.f13) r10
            android.graphics.drawable.Drawable r10 = r10.J()
            if (r10 == 0) goto L_0x0081
            hbc r9 = r9.i
            r11 = 200(0xc8, float:2.8E-43)
            if (r9 == 0) goto L_0x0076
            int r14 = r9.a
            goto L_0x0077
        L_0x0076:
            r14 = r11
        L_0x0077:
            if (r9 == 0) goto L_0x007b
            int r11 = r9.b
        L_0x007b:
            android.graphics.Bitmap r9 = defpackage.d8.E(r10, r14, r11)
        L_0x007f:
            r7 = r12
            goto L_0x0083
        L_0x0081:
            r9 = r8
            goto L_0x007f
        L_0x0083:
            if (r13 == 0) goto L_0x0092
            if (r7 == 0) goto L_0x0092
            if (r9 == 0) goto L_0x0091
            android.graphics.Bitmap$Config r8 = r9.getConfig()
            android.graphics.Bitmap r8 = r9.copy(r8, r12)
        L_0x0091:
            return r8
        L_0x0092:
            return r9
        L_0x0093:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hhd.s(fr6, tr6, long, java.lang.Object, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object t(fr6 fr6, tr6 tr6, long j, Object obj, Continuation continuation, int i) {
        if ((i & 2) != 0) {
            j = Long.MAX_VALUE;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            obj = null;
        }
        return s(fr6, tr6, j2, obj, true, continuation);
    }

    public static List v(it4 it4) {
        String string = ((g2b) it4.b).a.g.getString("app.currentProxyList", (String) null);
        if (F(string)) {
            return Collections.emptyList();
        }
        try {
            JSONArray jSONArray = new JSONArray(string);
            ArrayList arrayList = new ArrayList(jSONArray.length());
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    cd3 a2 = cd3.a((JSONObject) jSONArray.get(i));
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                } catch (JSONException e) {
                    udd.s("hhd", "parse proxy from string exception " + e.getMessage(), (Throwable) null);
                }
            }
            return arrayList;
        } catch (JSONException e2) {
            udd.s("hhd", "parse from string exception " + e2.getMessage(), (Throwable) null);
            return Collections.emptyList();
        }
    }

    public static final boolean y() {
        return Build.VERSION.SDK_INT <= 32 || ((Boolean) z0f.a.getValue()).booleanValue();
    }

    public abstract int B();

    public abstract int C();

    public abstract void K(i1 i1Var, i1 i1Var2);

    public abstract void L(i1 i1Var, Thread thread);

    public abstract boolean e(int i, int i2);

    public abstract boolean g(int i, int i2);

    public abstract boolean k(k1 k1Var, v0 v0Var, v0 v0Var2);

    public abstract boolean l(k1 k1Var, Object obj, Object obj2);

    public abstract boolean m(k1 k1Var, i1 i1Var, i1 i1Var2);

    public abstract void u(Rect rect, Rect rect2);

    public abstract v0 w(k1 k1Var);

    public abstract i1 x(k1 k1Var);

    public Object z(int i, int i2) {
        return null;
    }
}
