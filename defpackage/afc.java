package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.net.Uri;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.EditText;
import androidx.cardview.widget.CardView;
import com.google.android.material.datepicker.MaterialCalendar;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.BufferUnderflowException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.inject.Provider;
import kotlin.NoWhenBranchMatchedException;
import org.apache.http.conn.params.ConnManagerParams;
import org.json.JSONObject;
import org.webrtc.CameraVideoCapturer;

/* renamed from: afc  reason: default package */
public final class afc implements of3, ws1, CameraVideoCapturer.CameraSwitchHandler, gf5, af1, wx7, Provider, nn1 {
    public static final Object c = new Object();
    public static tsf o;
    public Object a;
    public Object b;

    public /* synthetic */ afc(Object obj) {
        this.b = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0027 A[SYNTHETIC, Splitter:B:14:0x0027] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002c A[SYNTHETIC, Splitter:B:18:0x002c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.afc i(android.content.Context r3) {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0023 }
            java.io.File r3 = r3.getFilesDir()     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0023 }
            r2.<init>(r3, r0)     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0023 }
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0023 }
            java.lang.String r0 = "rw"
            r3.<init>(r2, r0)     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0023 }
            java.nio.channels.FileChannel r3 = r3.getChannel()     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0023 }
            java.nio.channels.FileLock r0 = r3.lock()     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0021 }
            afc r2 = new afc     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0025 }
            r2.<init>((java.lang.Object) r3, (java.lang.Object) r0)     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0025 }
            return r2
        L_0x0021:
            r0 = r1
            goto L_0x0025
        L_0x0023:
            r3 = r1
            r0 = r3
        L_0x0025:
            if (r0 == 0) goto L_0x002a
            r0.release()     // Catch:{ IOException -> 0x002a }
        L_0x002a:
            if (r3 == 0) goto L_0x002f
            r3.close()     // Catch:{ IOException -> 0x002f }
        L_0x002f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afc.i(android.content.Context):afc");
    }

    public static n6g k(Context context, Intent intent, boolean z) {
        tsf tsf;
        synchronized (c) {
            try {
                if (o == null) {
                    o = new tsf(context);
                }
                tsf = o;
            } finally {
                while (true) {
                }
            }
        }
        if (!z) {
            return tsf.b(intent).j(new gr(2), new g95(27));
        }
        if (b0d.t().w(context)) {
            synchronized (kef.b) {
                try {
                    kef.a(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        kef.c.a(kef.a);
                    }
                    tsf.b(intent).i(new xle(14, (Object) intent));
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            tsf.b(intent);
        }
        return gwf.o(-1);
    }

    /* JADX INFO: finally extract failed */
    public void A(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = ((EditText) this.a).getContext().obtainStyledAttributes(attributeSet, nwb.AppCompatTextView, i, 0);
        try {
            boolean z = true;
            if (obtainStyledAttributes.hasValue(nwb.AppCompatTextView_emojiCompatEnabled)) {
                z = obtainStyledAttributes.getBoolean(nwb.AppCompatTextView_emojiCompatEnabled, true);
            }
            obtainStyledAttributes.recycle();
            H(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void B(Throwable th) {
        ((rh9) this.b).getClass();
        zb5 zb5 = (zb5) this.a;
        c5b a2 = zb5.a();
        ji0 ji0 = zb5.b;
        a2.d(ji0, "NetworkFetchProducer", th, (Map) null);
        zb5.a().e(ji0, "NetworkFetchProducer", false);
        ji0.h("network", "default");
        zb5.a.e(th);
    }

    public void C(InputStream inputStream, int i) {
        kl8 kl8;
        n06.s();
        rh9 rh9 = (rh9) this.b;
        qe4 qe4 = (qe4) rh9.b;
        if (i > 0) {
            qe4.getClass();
            kl8 = new kl8((il8) qe4.b, i);
        } else {
            qe4.getClass();
            kl8 = new kl8((il8) qe4.b);
        }
        w66 w66 = (w66) rh9.c;
        byte[] bArr = (byte[]) w66.get(16384);
        while (true) {
            try {
                int read = inputStream.read(bArr);
                zb5 zb5 = (zb5) this.a;
                if (read < 0) {
                    ((bm3) rh9.d).y(zb5);
                    rh9.c(kl8, zb5);
                    w66.g(bArr);
                    kl8.close();
                    n06.s();
                    return;
                } else if (read > 0) {
                    kl8.write(bArr, 0, read);
                    rh9.d(kl8, zb5);
                    int i2 = kl8.c;
                    zb5.a.i(i > 0 ? ((float) i2) / ((float) i) : 1.0f - ((float) Math.exp(((double) (-i2)) / 50000.0d)));
                }
            } catch (Throwable th) {
                w66.g(bArr);
                kl8.close();
                throw th;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0223, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a8, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a9, code lost:
        if (r5 == false) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ab, code lost:
        if (r5 == true) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ad, code lost:
        if (r5 == true) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00af, code lost:
        if (r5 == true) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b3, code lost:
        r0.c.put(java.lang.Integer.valueOf(r7.a), r7);
        r7 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void D(android.content.Context r12, android.content.res.XmlResourceParser r13) {
        /*
            r11 = this;
            bf3 r0 = new bf3
            r0.<init>()
            int r1 = r13.getAttributeCount()
            r2 = 0
            r3 = r2
        L_0x000b:
            if (r3 >= r1) goto L_0x023c
            java.lang.String r4 = r13.getAttributeName(r3)
            java.lang.String r5 = r13.getAttributeValue(r3)
            if (r4 == 0) goto L_0x0238
            if (r5 != 0) goto L_0x001b
            goto L_0x0238
        L_0x001b:
            java.lang.String r6 = "id"
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x0238
            java.lang.String r1 = "/"
            boolean r1 = r5.contains(r1)
            r3 = 1
            r4 = -1
            if (r1 == 0) goto L_0x0045
            r1 = 47
            int r1 = r5.indexOf(r1)
            int r1 = r1 + r3
            java.lang.String r1 = r5.substring(r1)
            android.content.res.Resources r7 = r12.getResources()
            java.lang.String r8 = r12.getPackageName()
            int r1 = r7.getIdentifier(r1, r6, r8)
            goto L_0x0046
        L_0x0045:
            r1 = r4
        L_0x0046:
            if (r1 != r4) goto L_0x0056
            int r6 = r5.length()
            if (r6 <= r3) goto L_0x0056
            java.lang.String r1 = r5.substring(r3)
            int r1 = java.lang.Integer.parseInt(r1)
        L_0x0056:
            int r5 = r13.getEventType()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r6 = 0
            r7 = r6
        L_0x005c:
            if (r5 == r3) goto L_0x0230
            if (r5 == 0) goto L_0x0220
            r8 = 3
            r9 = 2
            if (r5 == r9) goto L_0x00c1
            if (r5 == r8) goto L_0x0068
            goto L_0x0223
        L_0x0068:
            java.lang.String r5 = r13.getName()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            java.util.Locale r10 = java.util.Locale.ROOT     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            java.lang.String r5 = r5.toLowerCase(r10)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            int r10 = r5.hashCode()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            switch(r10) {
                case -2075718416: goto L_0x009e;
                case -190376483: goto L_0x0094;
                case 426575017: goto L_0x008a;
                case 2146106725: goto L_0x007a;
                default: goto L_0x0079;
            }     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
        L_0x0079:
            goto L_0x00a8
        L_0x007a:
            java.lang.String r10 = "constraintset"
            boolean r5 = r5.equals(r10)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            if (r5 == 0) goto L_0x00a8
            r5 = r2
            goto L_0x00a9
        L_0x0084:
            r12 = move-exception
            goto L_0x0229
        L_0x0087:
            r12 = move-exception
            goto L_0x022d
        L_0x008a:
            java.lang.String r10 = "constraintoverride"
            boolean r5 = r5.equals(r10)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            if (r5 == 0) goto L_0x00a8
            r5 = r9
            goto L_0x00a9
        L_0x0094:
            java.lang.String r10 = "constraint"
            boolean r5 = r5.equals(r10)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            if (r5 == 0) goto L_0x00a8
            r5 = r3
            goto L_0x00a9
        L_0x009e:
            java.lang.String r10 = "guideline"
            boolean r5 = r5.equals(r10)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            if (r5 == 0) goto L_0x00a8
            r5 = r8
            goto L_0x00a9
        L_0x00a8:
            r5 = r4
        L_0x00a9:
            if (r5 == 0) goto L_0x0230
            if (r5 == r3) goto L_0x00b3
            if (r5 == r9) goto L_0x00b3
            if (r5 == r8) goto L_0x00b3
            goto L_0x0223
        L_0x00b3:
            java.util.HashMap r5 = r0.c     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            int r8 = r7.a     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r5.put(r8, r7)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r7 = r6
            goto L_0x0223
        L_0x00c1:
            java.lang.String r5 = r13.getName()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            int r10 = r5.hashCode()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            switch(r10) {
                case -2025855158: goto L_0x012a;
                case -1984451626: goto L_0x0120;
                case -1962203927: goto L_0x0116;
                case -1269513683: goto L_0x010c;
                case -1238332596: goto L_0x0102;
                case -71750448: goto L_0x00f8;
                case 366511058: goto L_0x00ed;
                case 1331510167: goto L_0x00e4;
                case 1791837707: goto L_0x00d9;
                case 1803088381: goto L_0x00ce;
                default: goto L_0x00cc;
            }     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
        L_0x00cc:
            goto L_0x0134
        L_0x00ce:
            java.lang.String r8 = "Constraint"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            if (r5 == 0) goto L_0x0134
            r8 = r2
            goto L_0x0135
        L_0x00d9:
            java.lang.String r8 = "CustomAttribute"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            if (r5 == 0) goto L_0x0134
            r8 = 8
            goto L_0x0135
        L_0x00e4:
            java.lang.String r9 = "Barrier"
            boolean r5 = r5.equals(r9)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            if (r5 == 0) goto L_0x0134
            goto L_0x0135
        L_0x00ed:
            java.lang.String r8 = "CustomMethod"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            if (r5 == 0) goto L_0x0134
            r8 = 9
            goto L_0x0135
        L_0x00f8:
            java.lang.String r8 = "Guideline"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            if (r5 == 0) goto L_0x0134
            r8 = r9
            goto L_0x0135
        L_0x0102:
            java.lang.String r8 = "Transform"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            if (r5 == 0) goto L_0x0134
            r8 = 5
            goto L_0x0135
        L_0x010c:
            java.lang.String r8 = "PropertySet"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            if (r5 == 0) goto L_0x0134
            r8 = 4
            goto L_0x0135
        L_0x0116:
            java.lang.String r8 = "ConstraintOverride"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            if (r5 == 0) goto L_0x0134
            r8 = r3
            goto L_0x0135
        L_0x0120:
            java.lang.String r8 = "Motion"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            if (r5 == 0) goto L_0x0134
            r8 = 7
            goto L_0x0135
        L_0x012a:
            java.lang.String r8 = "Layout"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            if (r5 == 0) goto L_0x0134
            r8 = 6
            goto L_0x0135
        L_0x0134:
            r8 = r4
        L_0x0135:
            java.lang.String r5 = "XML parser error must be within a Constraint "
            switch(r8) {
                case 0: goto L_0x0217;
                case 1: goto L_0x020e;
                case 2: goto L_0x0201;
                case 3: goto L_0x01f4;
                case 4: goto L_0x01cf;
                case 5: goto L_0x01aa;
                case 6: goto L_0x0184;
                case 7: goto L_0x015e;
                case 8: goto L_0x013c;
                case 9: goto L_0x013c;
                default: goto L_0x013a;
            }
        L_0x013a:
            goto L_0x0223
        L_0x013c:
            if (r7 == 0) goto L_0x0145
            java.util.HashMap r5 = r7.f     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            ne3.a(r12, r13, r5)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            goto L_0x0223
        L_0x0145:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r2.append(r5)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            int r13 = r13.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r2.append(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            java.lang.String r13 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r12.<init>(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            throw r12     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
        L_0x015e:
            if (r7 == 0) goto L_0x016b
            ye3 r5 = r7.c     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r5.a(r12, r8)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            goto L_0x0223
        L_0x016b:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r2.append(r5)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            int r13 = r13.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r2.append(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            java.lang.String r13 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r12.<init>(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            throw r12     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
        L_0x0184:
            if (r7 == 0) goto L_0x0191
            xe3 r5 = r7.d     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r5.a(r12, r8)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            goto L_0x0223
        L_0x0191:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r2.append(r5)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            int r13 = r13.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r2.append(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            java.lang.String r13 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r12.<init>(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            throw r12     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
        L_0x01aa:
            if (r7 == 0) goto L_0x01b6
            af3 r5 = r7.e     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r5.a(r12, r8)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            goto L_0x0223
        L_0x01b6:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r2.append(r5)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            int r13 = r13.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r2.append(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            java.lang.String r13 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r12.<init>(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            throw r12     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
        L_0x01cf:
            if (r7 == 0) goto L_0x01db
            ze3 r5 = r7.b     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r5.a(r12, r8)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            goto L_0x0223
        L_0x01db:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r2.append(r5)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            int r13 = r13.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r2.append(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            java.lang.String r13 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r12.<init>(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            throw r12     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
        L_0x01f4:
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            we3 r7 = bf3.f(r12, r5, r2)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            xe3 r5 = r7.d     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r5.h0 = r3     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            goto L_0x0223
        L_0x0201:
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            we3 r7 = bf3.f(r12, r5, r2)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            xe3 r5 = r7.d     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r5.a = r3     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            goto L_0x0223
        L_0x020e:
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            we3 r7 = bf3.f(r12, r5, r3)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            goto L_0x0223
        L_0x0217:
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            we3 r7 = bf3.f(r12, r5, r2)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            goto L_0x0223
        L_0x0220:
            r13.getName()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
        L_0x0223:
            int r5 = r13.next()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            goto L_0x005c
        L_0x0229:
            r12.printStackTrace()
            goto L_0x0230
        L_0x022d:
            r12.printStackTrace()
        L_0x0230:
            java.lang.Object r11 = r11.b
            android.util.SparseArray r11 = (android.util.SparseArray) r11
            r11.put(r1, r0)
            goto L_0x023c
        L_0x0238:
            int r3 = r3 + 1
            goto L_0x000b
        L_0x023c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afc.D(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    public n6g E(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean z = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = (Context) this.a;
        boolean z2 = context.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & 268435456) != 0) {
            z = true;
        }
        if (z2 && !z) {
            return k(context, intent, z);
        }
        rz3 rz3 = new rz3(context, 4, intent);
        gr grVar = (gr) this.b;
        return gwf.c(rz3, grVar).k(grVar, new qa5(context, intent, z, 0));
    }

    public void F() {
        try {
            ((FileLock) this.b).release();
            ((FileChannel) this.a).close();
        } catch (IOException unused) {
        }
    }

    public void G(lhd lhd, av3 av3, h87 h87) {
        String str;
        mfd mfd = (mfd) ((s16) this.b).invoke();
        if (mfd == null) {
            h87.invoke(new IllegalStateException("Signaling is not ready or released"));
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", (Object) "get-participant-list-chunk");
        jSONObject.put("count", 0);
        int i = t86.$EnumSwitchMapping$0[hr1.t(1)];
        if (i == 1) {
            str = "GRID";
        } else if (i == 2) {
            str = "SIDE";
        } else if (i == 3) {
            str = "ADMIN";
        } else {
            throw new NoWhenBranchMatchedException();
        }
        jSONObject.put("listType", (Object) str);
        w2d w2d = (w2d) lhd.b;
        if (w2d instanceof v2d) {
            jSONObject.put("roomId", ((v2d) w2d).a);
        }
        mfd.j(jSONObject, new uw0(this, lhd, h87, av3), new qs(this, h87, 5));
    }

    public void H(boolean z) {
        kv4 kv4 = (kv4) ((vt4) this.b).a.b;
        if (kv4.Y != z) {
            if (kv4.c != null) {
                pt4 a2 = pt4.a();
                iv4 iv4 = kv4.c;
                a2.getClass();
                e07.o(iv4, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a2.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a2.b.remove(iv4);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            kv4.Y = z;
            if (z) {
                kv4.a(kv4.a, pt4.a().b());
            }
        }
    }

    public void I(int i, int i2, int i3, int i4) {
        CardView cardView = (CardView) this.b;
        cardView.o.set(i, i2, i3, i4);
        Rect rect = cardView.c;
        CardView.a(cardView, i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    public void a(Object obj) {
        ((wx7) this.a).a(obj);
    }

    public void accept(Object obj) {
        mn4 c2;
        Uri uri = (Uri) obj;
        Iterator it = ((r10) this.a).g.iterator();
        while (it.hasNext()) {
            mn8 mn8 = (mn8) ((vz) it.next());
            jj7 jj7 = mn8.A0;
            if (jj7 != null && jj7.v() == 1) {
                o10 u = mn8.A0.u(0);
                j10 j10 = u.a;
                j10 j102 = j10.o;
                if (j10 == j102 || ete.L(u)) {
                    if (TextUtils.equals(u.q, ((o10) this.b).q) && mn8.A0.v() == 1) {
                        o10 u2 = mn8.A0.u(0);
                        if ((u2.a == j102 || ete.L(u2)) && (c2 = mn8.o.c(0)) != null) {
                            ywa a2 = a06.a.a();
                            a2.e = tr6.a(mn8.Q0.a(u2));
                            a2.l = c2.X;
                            c2.i(a2.a());
                        }
                    }
                }
            }
        }
    }

    public void b() {
        ((wx7) this.a).b();
    }

    public void c(m25 m25) {
        CaptureResult captureResult = (CaptureResult) this.b;
        afc.super.c(m25);
        try {
            Integer num = (Integer) captureResult.get(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                m25.d(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
        }
        Long l = (Long) captureResult.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        ArrayList arrayList = m25.a;
        if (l != null) {
            m25.c("ExposureTime", String.valueOf(((double) l.longValue()) / ((double) TimeUnit.SECONDS.toNanos(1))), arrayList);
        }
        Float f = (Float) captureResult.get(CaptureResult.LENS_APERTURE);
        if (f != null) {
            m25.c("FNumber", String.valueOf(f.floatValue()), arrayList);
        }
        Integer num2 = (Integer) captureResult.get(CaptureResult.SENSOR_SENSITIVITY);
        if (num2 != null) {
            Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
            if (num3 != null) {
                num2 = Integer.valueOf(num2.intValue() * ((int) (((float) num3.intValue()) / 100.0f)));
            }
            int intValue = num2.intValue();
            m25.c("SensitivityType", String.valueOf(3), arrayList);
            m25.c("PhotographicSensitivity", String.valueOf(Math.min(65535, intValue)), arrayList);
        }
        Float f2 = (Float) captureResult.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f2 != null) {
            long floatValue = (long) (f2.floatValue() * 1000.0f);
            m25.c("FocalLength", floatValue + "/1000", arrayList);
        }
        Integer num4 = (Integer) captureResult.get(CaptureResult.CONTROL_AWB_MODE);
        if (num4 != null) {
            int t = hr1.t(num4.intValue() == 0 ? 2 : 1);
            m25.c("WhiteBalance", t != 0 ? t != 1 ? null : String.valueOf(1) : String.valueOf(0), arrayList);
        }
    }

    public void d(xi4 xi4) {
        bj4.e((AtomicReference) this.b, xi4);
    }

    public s9e e() {
        return (s9e) this.a;
    }

    public us1 f() {
        Integer num = (Integer) ((CaptureResult) this.b).get(CaptureResult.CONTROL_AWB_STATE);
        us1 us1 = us1.a;
        if (num == null) {
            return us1;
        }
        int intValue = num.intValue();
        return intValue != 0 ? intValue != 1 ? intValue != 2 ? intValue != 3 ? us1 : us1.X : us1.o : us1.c : us1.b;
    }

    public int g() {
        Integer num = (Integer) ((CaptureResult) this.b).get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return 1;
        }
        int intValue = num.intValue();
        if (intValue == 0 || intValue == 1) {
            return 2;
        }
        if (intValue != 2) {
            return (intValue == 3 || intValue == 4) ? 4 : 1;
        }
        return 3;
    }

    public Object get() {
        return new b39((Context) ((Provider) this.a).get(), (ew3) ((Provider) this.b).get());
    }

    public long getTimestamp() {
        Long l = (Long) ((CaptureResult) this.b).get(CaptureResult.SENSOR_TIMESTAMP);
        if (l == null) {
            return -1;
        }
        return l.longValue();
    }

    public void h(File file) {
        k64 g = m64.g((m64) this.b, file);
        if (g != null && g.b == ".cnt") {
            ((ArrayList) this.a).add(new j64(file, g.c));
        }
    }

    public void j(y0c y0c, xbc xbc) {
        ((yv1) this.a).resumeWith(xbc);
    }

    public void l(File file) {
    }

    public ss1 m() {
        Integer num = (Integer) ((CaptureResult) this.b).get(CaptureResult.CONTROL_AE_STATE);
        ss1 ss1 = ss1.a;
        if (num == null) {
            return ss1;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return ss1.b;
        }
        if (intValue != 1) {
            if (intValue == 2) {
                return ss1.X;
            }
            if (intValue == 3) {
                return ss1.Y;
            }
            if (intValue == 4) {
                return ss1.o;
            }
            if (intValue != 5) {
                return ss1;
            }
        }
        return ss1.c;
    }

    public void n(File file) {
    }

    public CaptureResult o() {
        return (CaptureResult) this.b;
    }

    public void onCameraSwitchDone(boolean z) {
        at1 at1 = (at1) this.b;
        String str = (String) this.a;
        xwb xwb = at1.e;
        xwb.log("CameraCapturerAdapter", "onCameraSwitchDone, new camera: " + str + ", is front: " + z);
        synchronized (at1.g) {
            at1.h = str;
            at1.i = z;
            at1.j = false;
        }
        Iterator it = at1.f.iterator();
        while (it.hasNext()) {
            ((jl7) it.next()).i(at1, true);
        }
    }

    public void onCameraSwitchError(String str) {
        at1 at1 = (at1) this.b;
        at1.e.reportException("CameraCapturerAdapter", "Error on camera switch", new IllegalStateException(rf0.h("onCameraSwitchError, ", str)));
        synchronized (at1.g) {
            at1.j = false;
        }
        Iterator it = at1.f.iterator();
        while (it.hasNext()) {
            ((jl7) it.next()).i(at1, false);
        }
    }

    public void onError(Throwable th) {
        ((wx7) this.a).onError(th);
    }

    public int p() {
        Integer num = (Integer) ((CaptureResult) this.b).get(CaptureResult.CONTROL_AE_MODE);
        if (num == null) {
            return 1;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return 2;
        }
        if (intValue == 1) {
            return 3;
        }
        if (intValue == 2) {
            return 4;
        }
        if (intValue == 3) {
            return 5;
        }
        if (intValue != 4) {
            return intValue != 5 ? 1 : 7;
        }
        return 6;
    }

    public PointF q() {
        cf1 cf1 = ((v75) this.a).g;
        WindowManager.LayoutParams layoutParams = null;
        ViewGroup.LayoutParams layoutParams2 = cf1 != null ? cf1.getLayoutParams() : null;
        if (layoutParams2 instanceof WindowManager.LayoutParams) {
            layoutParams = (WindowManager.LayoutParams) layoutParams2;
        }
        return layoutParams != null ? new PointF((float) layoutParams.x, (float) layoutParams.y) : kjd.y(((cf1) this.b).getContext());
    }

    public void r(y0c y0c, IOException iOException) {
        yv1 yv1 = (yv1) this.a;
        if (!yv1.isCancelled()) {
            IOException iOException2 = (IOException) this.b;
            if (iOException2 != null) {
                iOException2.initCause(iOException);
            }
            if (iOException2 != null) {
                iOException = iOException2;
            }
            yv1.resumeWith(new kcc(iOException));
        }
    }

    public ts1 s() {
        Integer num = (Integer) ((CaptureResult) this.b).get(CaptureResult.CONTROL_AF_STATE);
        ts1 ts1 = ts1.a;
        if (num == null) {
            return ts1;
        }
        switch (num.intValue()) {
            case 0:
                return ts1.b;
            case 1:
            case 3:
                return ts1.c;
            case 2:
                return ts1.o;
            case 4:
                return ts1.Y;
            case 5:
                return ts1.Z;
            case 6:
                return ts1.X;
            default:
                return ts1;
        }
    }

    public int t() {
        Integer num = (Integer) ((CaptureResult) this.b).get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return 1;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1 || intValue == 2) {
                return 3;
            }
            if (intValue == 3 || intValue == 4) {
                return 4;
            }
            if (intValue != 5) {
                return 1;
            }
        }
        return 2;
    }

    public int u() {
        Integer num = (Integer) ((CaptureResult) this.b).get(CaptureResult.CONTROL_AWB_MODE);
        if (num == null) {
            return 1;
        }
        switch (num.intValue()) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            default:
                return 1;
        }
    }

    public KeyListener v(KeyListener keyListener) {
        if (!(!(keyListener instanceof NumberKeyListener))) {
            return keyListener;
        }
        ((vt4) this.b).a.getClass();
        if (keyListener instanceof gu4) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new gu4(keyListener);
    }

    public Integer w(BigInteger bigInteger, BigInteger bigInteger2) {
        if (!(bigInteger2 == null || bigInteger == null)) {
            BigInteger bigInteger3 = (BigInteger) this.a;
            BigInteger bigInteger4 = (BigInteger) this.b;
            this.a = bigInteger;
            this.b = bigInteger2;
            if (!(bigInteger3 == null || bigInteger4 == null)) {
                if (bigInteger3.compareTo(bigInteger) > 0 || bigInteger4.compareTo(bigInteger2) > 0) {
                    this.a = null;
                    this.b = null;
                } else {
                    BigInteger subtract = bigInteger.subtract(bigInteger3);
                    BigInteger subtract2 = bigInteger2.subtract(bigInteger4);
                    if (subtract.compareTo(BigInteger.ZERO) <= 0) {
                        return null;
                    }
                    int floatValue = (int) ((subtract2.floatValue() * ((float) 100)) / subtract.floatValue());
                    dz6 dz6 = new dz6(0, 100, 1);
                    if (!dz6.isEmpty()) {
                        Integer num = 0;
                        if (floatValue < num.intValue()) {
                            Integer num2 = 0;
                            floatValue = num2.intValue();
                        } else {
                            int i = dz6.b;
                            if (floatValue > Integer.valueOf(i).intValue()) {
                                floatValue = Integer.valueOf(i).intValue();
                            }
                        }
                        return Integer.valueOf(floatValue);
                    }
                    throw new IllegalArgumentException("Cannot coerce value to an empty range: " + dz6 + '.');
                }
            }
        }
        return null;
    }

    public void x(float f, float f2) {
        Context context;
        v75 v75 = (v75) this.a;
        cf1 cf1 = v75.g;
        WindowManager windowManager = null;
        ViewGroup.LayoutParams layoutParams = cf1 != null ? cf1.getLayoutParams() : null;
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.x = (int) f;
            layoutParams2.y = (int) f2;
        } else {
            layoutParams2 = null;
        }
        cf1 cf12 = (cf1) this.b;
        udd.q("FakePipController", "update call local pip");
        if (layoutParams2 == null) {
            udd.q("FakePipController", "update call local pip was skip due to layout params are null");
            return;
        }
        try {
            cf1 cf13 = v75.g;
            if (!(cf13 == null || (context = cf13.getContext()) == null)) {
                windowManager = ek8.F(context);
            }
            if (windowManager != null) {
                windowManager.updateViewLayout(cf12, layoutParams2);
            }
        } catch (IllegalArgumentException e) {
            udd.s("FakePipController", "can't update call local pip", e);
        }
    }

    public synchronized Map y() {
        try {
            if (((Map) this.b) == null) {
                this.b = Collections.unmodifiableMap(new HashMap((HashMap) this.a));
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return (Map) this.b;
    }

    public void z(List list) {
        zud zud = (zud) ((r7e) this.b).getValue();
        ArrayList arrayList = new ArrayList(q23.H(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            osd osd = (osd) it.next();
            arrayList.add(new ftd(0, osd.a, osd.b, osd.c, osd.o, osd.X, osd.Y, osd.Z, osd.w0, osd.x0, osd.y0, osd.z0, osd.A0, osd.B0, osd.C0, osd.D0));
        }
        aec aec = zud.a;
        aec.b();
        aec.c();
        try {
            zud.b.B(arrayList);
            aec.r();
        } finally {
            aec.l();
        }
    }

    public /* synthetic */ afc(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ afc(Object obj, Object obj2, boolean z) {
        this.b = obj;
        this.a = obj2;
    }

    public afc(EditText editText) {
        this.a = editText;
        this.b = new vt4(editText, false);
    }

    public afc(Context context, int i) {
        switch (i) {
            case 6:
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(bm3.F(wlb.materialCalendarStyle, context, MaterialCalendar.class.getCanonicalName()).data, xvb.MaterialCalendar);
                hk9.f(context, obtainStyledAttributes.getResourceId(xvb.MaterialCalendar_dayStyle, 0));
                hk9.f(context, obtainStyledAttributes.getResourceId(xvb.MaterialCalendar_dayInvalidStyle, 0));
                hk9.f(context, obtainStyledAttributes.getResourceId(xvb.MaterialCalendar_daySelectedStyle, 0));
                hk9.f(context, obtainStyledAttributes.getResourceId(xvb.MaterialCalendar_dayTodayStyle, 0));
                ColorStateList i2 = wx3.i(context, obtainStyledAttributes, xvb.MaterialCalendar_rangeFillColor);
                this.a = hk9.f(context, obtainStyledAttributes.getResourceId(xvb.MaterialCalendar_yearStyle, 0));
                hk9.f(context, obtainStyledAttributes.getResourceId(xvb.MaterialCalendar_yearSelectedStyle, 0));
                this.b = hk9.f(context, obtainStyledAttributes.getResourceId(xvb.MaterialCalendar_yearTodayStyle, 0));
                new Paint().setColor(i2.getDefaultColor());
                obtainStyledAttributes.recycle();
                return;
            default:
                this.a = context;
                this.b = new gr(2);
                return;
        }
    }

    public afc(int i) {
        switch (i) {
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /*20*/:
                this.a = new HashMap();
                return;
            default:
                this.a = new AtomicBoolean(false);
                return;
        }
    }
}
