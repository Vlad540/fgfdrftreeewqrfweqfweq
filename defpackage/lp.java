package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.keystore.KeyGenParameterSpec;
import android.view.View;
import androidx.media3.common.ParserException;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ProtocolException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;
import one.me.common.drawable.SavedMessagesIconDrawable;

/* renamed from: lp  reason: default package */
public abstract class lp implements bh9 {
    public static final int[] a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    public static final t13 c = new t13(20);
    public static final vg0 d = new vg0(14);
    public static final int[] e = {16842919};
    public static final int[] f = {16842908};
    public static final int[] g = {16842913, 16842919};
    public static final int[] h = {16842913};
    public static final /* synthetic */ int i = 0;

    public static final int A(int i2, int i3) {
        if (i3 == 255) {
            return i2;
        }
        if (i3 == 0) {
            return i2 & 16777215;
        }
        return (i2 & 16777215) | ((((i2 >>> 24) * (i3 + (i3 >> 7))) >> 8) << 24);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v59, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v68, resolved type: java.lang.String} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static nzc B(ws8 r26) {
        /*
            r1 = r26
            java.lang.String r2 = "payloadCatching catch error"
            java.lang.String r3 = "ServerPayload/PayloadCatching"
            r5 = 1
            int r0 = defpackage.jjd.K(r26)     // Catch:{ all -> 0x000d }
            r6 = r0
            goto L_0x003d
        L_0x000d:
            r0 = move-exception
            r6 = r0
            defpackage.udd.S(r3, r2, r6)
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x002b
            java.lang.Object r7 = r0.next()
            ny9 r7 = (defpackage.ny9) r7
            r7.getClass()
            defpackage.ny9.a(r6)
            goto L_0x0018
        L_0x002b:
            int r0 = m4b.a
            int r0 = defpackage.hr1.t(r0)
            if (r0 == 0) goto L_0x003c
            if (r0 == r5) goto L_0x003b
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x003b:
            throw r6
        L_0x003c:
            r6 = 0
        L_0x003d:
            r7 = 0
            if (r6 != 0) goto L_0x0041
            return r7
        L_0x0041:
            hw4 r8 = defpackage.hw4.a
            r9 = 0
            r15 = r7
            r18 = r15
            r19 = r18
            r16 = r8
            r17 = r16
            r13 = r9
            r20 = r13
            r11 = 0
        L_0x0052:
            if (r11 >= r6) goto L_0x030e
            java.lang.String r0 = defpackage.jjd.M(r26)     // Catch:{ all -> 0x0059 }
            goto L_0x0089
        L_0x0059:
            r0 = move-exception
            r12 = r0
            defpackage.udd.S(r3, r2, r12)
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0064:
            boolean r22 = r0.hasNext()
            if (r22 == 0) goto L_0x0077
            java.lang.Object r22 = r0.next()
            ny9 r22 = (defpackage.ny9) r22
            r22.getClass()
            defpackage.ny9.a(r12)
            goto L_0x0064
        L_0x0077:
            int r0 = m4b.a
            int r0 = defpackage.hr1.t(r0)
            if (r0 == 0) goto L_0x0088
            if (r0 == r5) goto L_0x0087
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0087:
            throw r12
        L_0x0088:
            r0 = r7
        L_0x0089:
            if (r0 != 0) goto L_0x008d
            goto L_0x0309
        L_0x008d:
            int r12 = r0.hashCode()
            r4 = 7
            switch(r12) {
                case -2072608278: goto L_0x028f;
                case -1307828855: goto L_0x0248;
                case -8339209: goto L_0x01db;
                case 98494: goto L_0x0190;
                case 3556653: goto L_0x014d;
                case 538738099: goto L_0x00df;
                case 1094519557: goto L_0x0097;
                default: goto L_0x0095;
            }
        L_0x0095:
            goto L_0x0297
        L_0x0097:
            java.lang.String r4 = "replyTo"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x00a1
            goto L_0x0297
        L_0x00a1:
            long r23 = defpackage.jjd.J(r1, r9)     // Catch:{ all -> 0x00ad }
            java.lang.Long r0 = java.lang.Long.valueOf(r23)     // Catch:{ all -> 0x00ad }
            r18 = r0
            goto L_0x0309
        L_0x00ad:
            r0 = move-exception
            defpackage.udd.S(r3, r2, r0)
            java.util.concurrent.CopyOnWriteArraySet r4 = uzc.a
            java.util.Iterator r4 = r4.iterator()
        L_0x00b7:
            boolean r12 = r4.hasNext()
            if (r12 == 0) goto L_0x00ca
            java.lang.Object r12 = r4.next()
            ny9 r12 = (defpackage.ny9) r12
            r12.getClass()
            defpackage.ny9.a(r0)
            goto L_0x00b7
        L_0x00ca:
            int r4 = m4b.a
            int r4 = defpackage.hr1.t(r4)
            if (r4 == 0) goto L_0x00db
            if (r4 == r5) goto L_0x00da
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00da:
            throw r0
        L_0x00db:
            r18 = r7
            goto L_0x0309
        L_0x00df:
            java.lang.String r12 = "attaches"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x00e9
            goto L_0x0297
        L_0x00e9:
            sp8 r0 = r26.n()     // Catch:{ all -> 0x0115 }
            int r0 = r0.a()     // Catch:{ all -> 0x0115 }
            if (r0 != r4) goto L_0x010a
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0115 }
            r0.<init>()     // Catch:{ all -> 0x0115 }
            int r4 = r26.s0()     // Catch:{ all -> 0x0115 }
            r12 = 0
        L_0x00fd:
            if (r12 >= r4) goto L_0x010e
            fy r7 = fy.b(r26)     // Catch:{ all -> 0x0115 }
            r0.add(r7)     // Catch:{ all -> 0x0115 }
            int r12 = r12 + 1
            r7 = 0
            goto L_0x00fd
        L_0x010a:
            r26.z()     // Catch:{ all -> 0x0115 }
            r0 = 0
        L_0x010e:
            if (r0 == 0) goto L_0x0117
            java.util.List r0 = defpackage.o23.T(r0)     // Catch:{ all -> 0x0115 }
            goto L_0x0118
        L_0x0115:
            r0 = move-exception
            goto L_0x011c
        L_0x0117:
            r0 = r8
        L_0x0118:
            r16 = r0
            goto L_0x0309
        L_0x011c:
            defpackage.udd.S(r3, r2, r0)
            java.util.concurrent.CopyOnWriteArraySet r4 = uzc.a
            java.util.Iterator r4 = r4.iterator()
        L_0x0125:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0138
            java.lang.Object r7 = r4.next()
            ny9 r7 = (defpackage.ny9) r7
            r7.getClass()
            defpackage.ny9.a(r0)
            goto L_0x0125
        L_0x0138:
            int r4 = m4b.a
            int r4 = defpackage.hr1.t(r4)
            if (r4 == 0) goto L_0x0149
            if (r4 == r5) goto L_0x0148
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0148:
            throw r0
        L_0x0149:
            r16 = r8
            goto L_0x0309
        L_0x014d:
            java.lang.String r4 = "text"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0157
            goto L_0x0297
        L_0x0157:
            java.lang.String r0 = defpackage.jjd.M(r26)     // Catch:{ all -> 0x015e }
            r15 = r0
            goto L_0x0309
        L_0x015e:
            r0 = move-exception
            r4 = r0
            defpackage.udd.S(r3, r2, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0169:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x017c
            java.lang.Object r7 = r0.next()
            ny9 r7 = (defpackage.ny9) r7
            r7.getClass()
            defpackage.ny9.a(r4)
            goto L_0x0169
        L_0x017c:
            int r0 = m4b.a
            int r0 = defpackage.hr1.t(r0)
            if (r0 == 0) goto L_0x018d
            if (r0 == r5) goto L_0x018c
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x018c:
            throw r4
        L_0x018d:
            r15 = 0
            goto L_0x0309
        L_0x0190:
            java.lang.String r4 = "cid"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x019a
            goto L_0x0297
        L_0x019a:
            java.lang.Long r4 = java.lang.Long.valueOf(r9)
            long r12 = defpackage.jjd.J(r1, r9)     // Catch:{ all -> 0x01a7 }
            java.lang.Long r4 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x01a7 }
            goto L_0x01d5
        L_0x01a7:
            r0 = move-exception
            defpackage.udd.S(r3, r2, r0)
            java.util.concurrent.CopyOnWriteArraySet r7 = uzc.a
            java.util.Iterator r7 = r7.iterator()
        L_0x01b1:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto L_0x01c4
            java.lang.Object r12 = r7.next()
            ny9 r12 = (defpackage.ny9) r12
            r12.getClass()
            defpackage.ny9.a(r0)
            goto L_0x01b1
        L_0x01c4:
            int r7 = m4b.a
            int r7 = defpackage.hr1.t(r7)
            if (r7 == 0) goto L_0x01d5
            if (r7 == r5) goto L_0x01d4
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01d4:
            throw r0
        L_0x01d5:
            long r13 = r4.longValue()
            goto L_0x0309
        L_0x01db:
            java.lang.String r7 = "elements"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x01e5
            goto L_0x0297
        L_0x01e5:
            sp8 r0 = r26.n()     // Catch:{ all -> 0x0210 }
            int r0 = r0.a()     // Catch:{ all -> 0x0210 }
            if (r0 != r4) goto L_0x0205
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0210 }
            r0.<init>()     // Catch:{ all -> 0x0210 }
            int r4 = r26.s0()     // Catch:{ all -> 0x0210 }
            r7 = 0
        L_0x01f9:
            if (r7 >= r4) goto L_0x0209
            dp8 r12 = defpackage.gk9.h(r26)     // Catch:{ all -> 0x0210 }
            r0.add(r12)     // Catch:{ all -> 0x0210 }
            int r7 = r7 + 1
            goto L_0x01f9
        L_0x0205:
            r26.z()     // Catch:{ all -> 0x0210 }
            r0 = 0
        L_0x0209:
            if (r0 == 0) goto L_0x0212
            java.util.List r0 = defpackage.o23.T(r0)     // Catch:{ all -> 0x0210 }
            goto L_0x0213
        L_0x0210:
            r0 = move-exception
            goto L_0x0217
        L_0x0212:
            r0 = r8
        L_0x0213:
            r17 = r0
            goto L_0x0309
        L_0x0217:
            defpackage.udd.S(r3, r2, r0)
            java.util.concurrent.CopyOnWriteArraySet r4 = uzc.a
            java.util.Iterator r4 = r4.iterator()
        L_0x0220:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0233
            java.lang.Object r7 = r4.next()
            ny9 r7 = (defpackage.ny9) r7
            r7.getClass()
            defpackage.ny9.a(r0)
            goto L_0x0220
        L_0x0233:
            int r4 = m4b.a
            int r4 = defpackage.hr1.t(r4)
            if (r4 == 0) goto L_0x0244
            if (r4 == r5) goto L_0x0243
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0243:
            throw r0
        L_0x0244:
            r17 = r8
            goto L_0x0309
        L_0x0248:
            java.lang.String r4 = "editOn"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0251
            goto L_0x0297
        L_0x0251:
            long r24 = defpackage.jjd.J(r1, r9)     // Catch:{ all -> 0x025d }
            java.lang.Long r0 = java.lang.Long.valueOf(r24)     // Catch:{ all -> 0x025d }
            r19 = r0
            goto L_0x0309
        L_0x025d:
            r0 = move-exception
            defpackage.udd.S(r3, r2, r0)
            java.util.concurrent.CopyOnWriteArraySet r4 = uzc.a
            java.util.Iterator r4 = r4.iterator()
        L_0x0267:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x027a
            java.lang.Object r7 = r4.next()
            ny9 r7 = (defpackage.ny9) r7
            r7.getClass()
            defpackage.ny9.a(r0)
            goto L_0x0267
        L_0x027a:
            int r4 = m4b.a
            int r4 = defpackage.hr1.t(r4)
            if (r4 == 0) goto L_0x028b
            if (r4 == r5) goto L_0x028a
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x028a:
            throw r0
        L_0x028b:
            r19 = 0
            goto L_0x0309
        L_0x028f:
            java.lang.String r4 = "saveTime"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x02ca
        L_0x0297:
            r26.z()     // Catch:{ all -> 0x029b }
            goto L_0x0309
        L_0x029b:
            r0 = move-exception
            r4 = r0
            defpackage.udd.S(r3, r2, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x02a6:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x02b9
            java.lang.Object r7 = r0.next()
            ny9 r7 = (defpackage.ny9) r7
            r7.getClass()
            defpackage.ny9.a(r4)
            goto L_0x02a6
        L_0x02b9:
            int r0 = m4b.a
            int r0 = defpackage.hr1.t(r0)
            if (r0 == 0) goto L_0x0309
            if (r0 == r5) goto L_0x02c9
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x02c9:
            throw r4
        L_0x02ca:
            java.lang.Long r4 = java.lang.Long.valueOf(r9)
            long r20 = defpackage.jjd.J(r1, r9)     // Catch:{ all -> 0x02d7 }
            java.lang.Long r4 = java.lang.Long.valueOf(r20)     // Catch:{ all -> 0x02d7 }
            goto L_0x0305
        L_0x02d7:
            r0 = move-exception
            defpackage.udd.S(r3, r2, r0)
            java.util.concurrent.CopyOnWriteArraySet r7 = uzc.a
            java.util.Iterator r7 = r7.iterator()
        L_0x02e1:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto L_0x02f4
            java.lang.Object r12 = r7.next()
            ny9 r12 = (defpackage.ny9) r12
            r12.getClass()
            defpackage.ny9.a(r0)
            goto L_0x02e1
        L_0x02f4:
            int r7 = m4b.a
            int r7 = defpackage.hr1.t(r7)
            if (r7 == 0) goto L_0x0305
            if (r7 == r5) goto L_0x0304
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0304:
            throw r0
        L_0x0305:
            long r20 = r4.longValue()
        L_0x0309:
            int r11 = r11 + 1
            r7 = 0
            goto L_0x0052
        L_0x030e:
            java.util.Iterator r0 = r16.iterator()
        L_0x0312:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x032d
            java.lang.Object r1 = r0.next()
            fy r1 = (fy) r1
            boolean r2 = r1 instanceof fpa
            if (r2 == 0) goto L_0x0312
            fpa r1 = (fpa) r1
            boolean r2 = r1.w0
            if (r2 == 0) goto L_0x0312
            java.lang.String r2 = r1.z0
            r1.X = r2
            goto L_0x0312
        L_0x032d:
            nzc r0 = new nzc
            r12 = r0
            r12.<init>(r13, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lp.B(ws8):nzc");
    }

    public static jn C(String str) {
        int i2;
        String str2;
        boolean Q = p0e.Q(str, "HTTP/1.", false);
        vhb vhb = vhb.HTTP_1_0;
        if (Q) {
            i2 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt == 1) {
                    vhb = vhb.HTTP_1_1;
                } else {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
            }
        } else if (p0e.Q(str, "ICY ", false)) {
            i2 = 4;
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int i3 = i2 + 3;
        if (str.length() >= i3) {
            try {
                int parseInt = Integer.parseInt(str.substring(i2, i3));
                if (str.length() <= i3) {
                    str2 = BuildConfig.FLAVOR;
                } else if (str.charAt(i3) == ' ') {
                    str2 = str.substring(i2 + 4);
                } else {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                return new jn(parseInt, 21, vhb, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public static e D(wx1 wx1, boolean z) {
        int i2 = wx1.i(5);
        if (i2 == 31) {
            i2 = wx1.i(6) + 32;
        }
        int s = s(wx1);
        int i3 = wx1.i(4);
        String h2 = wn6.h(i2, "mp4a.40.");
        if (i2 == 5 || i2 == 29) {
            s = s(wx1);
            int i4 = wx1.i(5);
            if (i4 == 31) {
                i4 = wx1.i(6) + 32;
            }
            i2 = i4;
            if (i2 == 22) {
                i3 = wx1.i(4);
            }
        }
        if (z) {
            if (!(i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 6 || i2 == 7 || i2 == 17)) {
                switch (i2) {
                    case 19:
                    case SavedMessagesIconDrawable.SMALL_ICON_SIZE /*20*/:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw ParserException.c("Unsupported audio object type: " + i2);
                }
            }
            if (wx1.h()) {
                ez3.j0("Unexpected frameLengthFlag = 1");
            }
            if (wx1.h()) {
                wx1.t(14);
            }
            boolean h3 = wx1.h();
            if (i3 != 0) {
                if (i2 == 6 || i2 == 20) {
                    wx1.t(3);
                }
                if (h3) {
                    if (i2 == 22) {
                        wx1.t(16);
                    }
                    if (i2 == 17 || i2 == 19 || i2 == 20 || i2 == 23) {
                        wx1.t(3);
                    }
                    wx1.t(1);
                }
                switch (i2) {
                    case 17:
                    case 19:
                    case SavedMessagesIconDrawable.SMALL_ICON_SIZE /*20*/:
                    case 21:
                    case 22:
                    case 23:
                        int i5 = wx1.i(2);
                        if (i5 == 2 || i5 == 3) {
                            throw ParserException.c("Unsupported epConfig: " + i5);
                        }
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        int i6 = b[i3];
        if (i6 != -1) {
            return new e(s, i6, h2);
        }
        throw ParserException.a((RuntimeException) null, (String) null);
    }

    public static y33 E(int i2, ija ija) {
        int g2 = ija.g();
        if (ija.g() == 1684108385) {
            ija.H(8);
            String q = ija.q(g2 - 16);
            return new y33("und", q, q);
        }
        ez3.j0("Failed to parse comment attribute: " + rx.e(i2));
        return null;
    }

    public static ul F(ija ija) {
        int g2 = ija.g();
        if (ija.g() == 1684108385) {
            int g3 = ija.g() & 16777215;
            String str = g3 == 13 ? "image/jpeg" : g3 == 14 ? "image/png" : null;
            if (str == null) {
                us8.l(g3, "Unrecognized cover art flags: ");
                return null;
            }
            ija.H(4);
            int i2 = g2 - 16;
            byte[] bArr = new byte[i2];
            ija.e(0, bArr, i2);
            return new ul(str, (String) null, 3, bArr);
        }
        ez3.j0("Failed to parse cover art attribute");
        return null;
    }

    public static ofe G(int i2, ija ija, String str) {
        int g2 = ija.g();
        if (ija.g() == 1684108385 && g2 >= 22) {
            ija.H(10);
            int A = ija.A();
            if (A > 0) {
                String h2 = wn6.h(A, BuildConfig.FLAVOR);
                int A2 = ija.A();
                if (A2 > 0) {
                    h2 = h2 + "/" + A2;
                }
                return new ofe(str, (String) null, ws6.n(h2));
            }
        }
        ez3.j0("Failed to parse index/count attribute: " + rx.e(i2));
        return null;
    }

    public static int H(ija ija) {
        int g2 = ija.g();
        if (ija.g() == 1684108385) {
            ija.H(8);
            int i2 = g2 - 16;
            if (i2 == 1) {
                return ija.u();
            }
            if (i2 == 2) {
                return ija.A();
            }
            if (i2 == 3) {
                return ija.x();
            }
            if (i2 == 4 && (ija.a[ija.b] & 128) == 0) {
                return ija.y();
            }
        }
        ez3.j0("Failed to parse data atom to int");
        return -1;
    }

    public static yo6 I(int i2, String str, ija ija, boolean z, boolean z2) {
        int H = H(ija);
        if (z2) {
            H = Math.min(1, H);
        }
        if (H >= 0) {
            return z ? new ofe(str, (String) null, ws6.n(Integer.toString(H))) : new y33("und", str, Integer.toString(H));
        }
        ez3.j0("Failed to parse uint8 attribute: " + rx.e(i2));
        return null;
    }

    public static ofe J(int i2, ija ija, String str) {
        int g2 = ija.g();
        if (ija.g() == 1684108385) {
            ija.H(8);
            return new ofe(str, (String) null, ws6.n(ija.q(g2 - 16)));
        }
        ez3.j0("Failed to parse text attribute: " + rx.e(i2));
        return null;
    }

    public static final boolean K(View view, ke6 ke6) {
        Object obj;
        try {
            obj = Boolean.valueOf(view.performHapticFeedback(ke6.a()));
        } catch (Throwable th) {
            obj = new kcc(th);
        }
        Object obj2 = Boolean.FALSE;
        if (obj instanceof kcc) {
            obj = obj2;
        }
        return ((Boolean) obj).booleanValue();
    }

    public static r2c L(Integer num) {
        int intValue = num.intValue();
        for (r2c r2c : r2c.values()) {
            if (r2c.a == intValue) {
                return r2c;
            }
        }
        return r2c.b;
    }

    public static int M(Object obj, Object obj2, int i2, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i3;
        int i4;
        int F = gp0.F(obj);
        int i5 = F & i2;
        int R = R(i5, obj3);
        if (R == 0) {
            return -1;
        }
        int i6 = ~i2;
        int i7 = F & i6;
        int i8 = -1;
        while (true) {
            i3 = R - 1;
            i4 = iArr[i3];
            if ((i4 & i6) != i7 || !am7.j(obj, objArr[i3]) || (objArr2 != null && !am7.j(obj2, objArr2[i3]))) {
                int i9 = i4 & i2;
                if (i9 == 0) {
                    return -1;
                }
                int i10 = i9;
                i8 = i3;
                R = i10;
            }
        }
        int i11 = i4 & i2;
        if (i8 == -1) {
            S(i5, i11, obj3);
        } else {
            iArr[i8] = z(iArr[i8], i11, i2);
        }
        return i3;
    }

    public static final void N(Drawable drawable, Drawable.Callback callback, eqe eqe) {
        if (drawable != null) {
            drawable.setCallback(callback);
            dqe dqe = drawable instanceof dqe ? (dqe) drawable : null;
            if (dqe != null) {
                dqe.l(eqe);
            }
        }
    }

    public static boolean O(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i2 : iArr) {
            if (i2 == 16842910) {
                z = true;
            } else if (i2 == 16842908 || i2 == 16842919 || i2 == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }

    public static sz0 P(int i2, r74 r74, ija ija) {
        sz0 c2 = sz0.c(r74, ija);
        while (true) {
            int i3 = c2.b;
            if (i3 == i2) {
                return c2;
            }
            us8.l(i3, "Ignoring unknown WAV chunk: ");
            long j = c2.c;
            long j2 = 8 + j;
            if (j % 2 != 0) {
                j2 = 9 + j;
            }
            if (j2 <= 2147483647L) {
                r74.z((int) j2);
                c2 = sz0.c(r74, ija);
            } else {
                throw ParserException.c("Chunk is too large (~2GB+) to skip; id: " + i3);
            }
        }
    }

    public static boolean Q(File file, Object obj) {
        ObjectOutputStream objectOutputStream;
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                objectOutputStream = new ObjectOutputStream(fileOutputStream2);
                try {
                    objectOutputStream.writeObject(obj);
                    g(fileOutputStream2, objectOutputStream);
                    return true;
                } catch (Exception e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    try {
                        udd.s("lp", "Failed to store object to file", e);
                        g(fileOutputStream, objectOutputStream);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        g(fileOutputStream, objectOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    g(fileOutputStream, objectOutputStream);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                objectOutputStream = null;
                fileOutputStream = fileOutputStream2;
                udd.s("lp", "Failed to store object to file", e);
                g(fileOutputStream, objectOutputStream);
                return false;
            } catch (Throwable th3) {
                th = th3;
                objectOutputStream = null;
                fileOutputStream = fileOutputStream2;
                g(fileOutputStream, objectOutputStream);
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            objectOutputStream = null;
            udd.s("lp", "Failed to store object to file", e);
            g(fileOutputStream, objectOutputStream);
            return false;
        } catch (Throwable th4) {
            th = th4;
            objectOutputStream = null;
            g(fileOutputStream, objectOutputStream);
            throw th;
        }
    }

    public static int R(int i2, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i2] & 255 : obj instanceof short[] ? ((short[]) obj)[i2] & 65535 : ((int[]) obj)[i2];
    }

    public static void S(int i2, int i3, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i2] = (byte) i3;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i2] = (short) i3;
        } else {
            ((int[]) obj)[i2] = i3;
        }
    }

    public static final long[] T(zb9 zb9) {
        long[] jArr = new long[zb9.d];
        long[] jArr2 = zb9.b;
        long[] jArr3 = zb9.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                long j = jArr3[i2];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            jArr[i3] = jArr2[(i2 << 3) + i5];
                            i3++;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return jArr;
    }

    public static final ArrayList U(zb9 zb9) {
        ArrayList arrayList = new ArrayList(zb9.d);
        long[] jArr = zb9.b;
        long[] jArr2 = zb9.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr2[i2];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            arrayList.add(Long.valueOf(jArr[(i2 << 3) + i4]));
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return arrayList;
    }

    public static final zb9 V(Collection collection) {
        zb9 zb9 = new zb9(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zb9.a(((Number) it.next()).longValue());
        }
        return zb9;
    }

    public static BiometricPrompt.CryptoObject W(stf stf) {
        IdentityCredential identityCredential;
        if (stf == null) {
            return null;
        }
        Cipher cipher = (Cipher) stf.b;
        if (cipher != null) {
            return pw3.b(cipher);
        }
        Signature signature = (Signature) stf.a;
        if (signature != null) {
            return pw3.a(signature);
        }
        Mac mac = (Mac) stf.c;
        if (mac != null) {
            return pw3.c(mac);
        }
        if (Build.VERSION.SDK_INT < 30 || (identityCredential = (IdentityCredential) stf.o) == null) {
            return null;
        }
        return qw3.a(identityCredential);
    }

    public static h37 a() {
        return new h37((g37) null);
    }

    public static final e00 b(int i2) {
        switch (fxe.$EnumSwitchMapping$0[hr1.t(i2)]) {
            case 1:
                return e00.b;
            case 2:
                return e00.X;
            case 3:
                return e00.F0;
            case 4:
            case 5:
                return e00.o;
            case 6:
                return e00.z0;
            case 7:
                return e00.Y;
            case 8:
                return e00.Z;
            default:
                return e00.b;
        }
    }

    public static final Object c(Collection collection, Continuation continuation) {
        return collection.isEmpty() ? hw4.a : new dd0((yc4[]) collection.toArray(new yc4[0])).a(continuation);
    }

    public static void d(hu3 hu3) {
        g37 g37 = (g37) hu3.get(xhd.c);
        if (g37 != null) {
            g37.cancel((CancellationException) null);
        }
    }

    public static final void e(hu3 hu3, CancellationException cancellationException) {
        dyc<g37> children;
        g37 g37 = (g37) hu3.get(xhd.c);
        if (g37 != null && (children = g37.getChildren()) != null) {
            for (g37 cancel : children) {
                cancel.cancel(cancellationException);
            }
        }
    }

    public static boolean f(r74 r74) {
        ija ija = new ija(8);
        int i2 = sz0.c(r74, ija).b;
        if (i2 != 1380533830 && i2 != 1380333108) {
            return false;
        }
        r74.r(ija.a, 0, 4, false);
        ija.G(0);
        int g2 = ija.g();
        if (g2 == 1463899717) {
            return true;
        }
        ez3.A("Unsupported form type: " + g2);
        return false;
    }

    public static void g(Closeable... closeableArr) {
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e2) {
                    udd.p("lp", "Failed to close output stream: " + e2.getMessage(), new Object[0]);
                }
            }
        }
    }

    public static final zb9 h(zb9 zb9) {
        zb9 zb92 = new zb9(zb9.d);
        long[] jArr = zb9.b;
        long[] jArr2 = zb9.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr2[i2];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            zb92.a(jArr[(i2 << 3) + i4]);
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return zb92;
    }

    public static final void i(Drawable drawable, Drawable drawable2) {
        if (drawable2 != null && drawable != null && drawable != drawable2) {
            drawable.setBounds(drawable2.getBounds());
            drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
            drawable.setLevel(drawable2.getLevel());
            drawable.setVisible(drawable2.isVisible(), false);
            drawable.setState(drawable2.getState());
        }
    }

    public static CameraDevice.StateCallback j(ArrayList arrayList) {
        return arrayList.isEmpty() ? new CameraDevice.StateCallback() : arrayList.size() == 1 ? (CameraDevice.StateCallback) arrayList.get(0) : new ut1(arrayList);
    }

    public static stf k() {
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            KeyGenParameterSpec.Builder b2 = ow3.b("androidxBiometric", 3);
            ow3.d(b2);
            ow3.e(b2);
            KeyGenerator instance2 = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            ow3.c(instance2, ow3.a(b2));
            instance2.generateKey();
            Cipher instance3 = Cipher.getInstance("AES/CBC/PKCS7Padding");
            instance3.init(1, (SecretKey) instance.getKey("androidxBiometric", (char[]) null));
            return new stf(instance3);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException unused) {
            return null;
        }
    }

    public static Object l(int i2) {
        if (i2 >= 2 && i2 <= 1073741824 && Integer.highestOneBit(i2) == i2) {
            return i2 <= 256 ? new byte[i2] : i2 <= 65536 ? new short[i2] : new int[i2];
        }
        throw new IllegalArgumentException(wn6.h(i2, "must be power of 2 between 2^1 and 2^30: "));
    }

    public static final void m(hu3 hu3) {
        g37 g37 = (g37) hu3.get(xhd.c);
        if (g37 != null && !g37.isActive()) {
            throw g37.getCancellationException();
        }
    }

    public static boolean n(File file) {
        if (file == null) {
            return false;
        }
        try {
            return file.exists() && file.canRead();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean o(String str) {
        return !r1g.p(str) && n(new File(str));
    }

    public static int p(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return j33.h(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
    }

    public static final g37 q(hu3 hu3) {
        g37 g37 = (g37) hu3.get(xhd.c);
        if (g37 != null) {
            return g37;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + hu3).toString());
    }

    public static File r(File file, String str) {
        String str2;
        File file2 = new File(file, str);
        if (!file2.exists()) {
            return file2;
        }
        int lastIndexOf = str.lastIndexOf(46);
        int i2 = 0;
        while (i2 < 100) {
            if (lastIndexOf != -1) {
                str2 = str.substring(0, lastIndexOf) + "(" + (i2 + 1) + ")" + str.substring(lastIndexOf);
            } else {
                StringBuilder n = me4.n(str, "(");
                n.append(i2 + 1);
                n.append(")");
                str2 = n.toString();
            }
            File file3 = new File(file, str2);
            if (!file3.exists()) {
                return file3;
            }
            i2++;
            file2 = file3;
        }
        return file2;
    }

    public static int s(wx1 wx1) {
        int i2 = wx1.i(4);
        if (i2 == 15) {
            if (wx1.b() >= 24) {
                return wx1.i(24);
            }
            throw ParserException.a((RuntimeException) null, "AAC header insufficient data");
        } else if (i2 < 13) {
            return a[i2];
        } else {
            throw ParserException.a((RuntimeException) null, "AAC header wrong Sampling Frequency Index");
        }
    }

    public static final aj4 t(g37 g37, boolean z, t37 t37) {
        if (g37 instanceof i47) {
            return ((i47) g37).invokeOnCompletionInternal$kotlinx_coroutines_core(z, t37);
        }
        return g37.invokeOnCompletion(t37.c(), z, new f(1, t37, t37.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 28));
    }

    public static final boolean u(hu3 hu3) {
        g37 g37 = (g37) hu3.get(xhd.c);
        if (g37 != null) {
            return g37.isActive();
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [er3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object v(java.util.ArrayList r4, kotlin.coroutines.Continuation r5) {
        /*
            boolean r0 = r5 instanceof defpackage.fd0
            if (r0 == 0) goto L_0x0013
            r0 = r5
            fd0 r0 = (defpackage.fd0) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            fd0 r0 = new fd0
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.X
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.util.Iterator r4 = r0.o
            defpackage.wx3.H(r5)
            goto L_0x0038
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            defpackage.wx3.H(r5)
            java.util.Iterator r4 = r4.iterator()
        L_0x0038:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x004f
            java.lang.Object r5 = r4.next()
            g37 r5 = (defpackage.g37) r5
            r0.o = r4
            r0.Y = r3
            java.lang.Object r5 = r5.join(r0)
            if (r5 != r1) goto L_0x0038
            return r1
        L_0x004f:
            jue r4 = defpackage.jue.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lp.v(java.util.ArrayList, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [er3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object w(defpackage.g37[] r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof defpackage.ed0
            if (r0 == 0) goto L_0x0013
            r0 = r7
            ed0 r0 = (defpackage.ed0) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            ed0 r0 = new ed0
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.Z
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.w0
            r3 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            int r6 = r0.Y
            int r2 = r0.X
            java.lang.Object[] r4 = r0.o
            g37[] r4 = (defpackage.g37[]) r4
            defpackage.wx3.H(r7)
            r7 = r4
            goto L_0x0053
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0038:
            defpackage.wx3.H(r7)
            int r7 = r6.length
            r2 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x0040:
            if (r2 >= r6) goto L_0x0055
            r4 = r7[r2]
            r0.o = r7
            r0.X = r2
            r0.Y = r6
            r0.w0 = r3
            java.lang.Object r4 = r4.join(r0)
            if (r4 != r1) goto L_0x0053
            return r1
        L_0x0053:
            int r2 = r2 + r3
            goto L_0x0040
        L_0x0055:
            jue r6 = defpackage.jue.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lp.w(g37[], kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static long x(String str) {
        if (r1g.p(str)) {
            return 0;
        }
        try {
            return new File(str).lastModified();
        } catch (Exception unused) {
            return 0;
        }
    }

    public static Object y(File file) {
        ObjectInputStream objectInputStream;
        Throwable th;
        FileInputStream fileInputStream;
        if (!n(file)) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                objectInputStream = new ObjectInputStream(fileInputStream);
                try {
                    Object readObject = objectInputStream.readObject();
                    g(fileInputStream, objectInputStream);
                    return readObject;
                } catch (Throwable th2) {
                    th = th2;
                    g(fileInputStream, objectInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                objectInputStream = null;
                g(fileInputStream, objectInputStream);
                throw th;
            }
        } catch (Throwable th4) {
            fileInputStream = null;
            th = th4;
            objectInputStream = null;
            g(fileInputStream, objectInputStream);
            throw th;
        }
    }

    public static int z(int i2, int i3, int i4) {
        return (i2 & (~i4)) | (i3 & i4);
    }
}
