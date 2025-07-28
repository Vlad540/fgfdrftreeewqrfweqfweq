package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.work.WorkRequest;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import one.me.sdk.uikit.common.button.OneMeButton;
import org.xmlpull.v1.XmlPullParser;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndReason;

/* renamed from: xy6  reason: default package */
public abstract class xy6 {
    public static Context a;
    public static Boolean b;
    public static final long[] c = {WorkRequest.MIN_BACKOFF_MILLIS, 15000};
    public static volatile mt7 d = new Object();
    public static final gu6 e = new gu6(15);
    public static final /* synthetic */ int f = 0;

    public static Bitmap A(Context context, int i) {
        int i2;
        switch (i) {
            case 0:
                i2 = o9a.a;
                break;
            case 1:
                i2 = o9a.b;
                break;
            case 2:
                i2 = o9a.m;
                break;
            case 3:
                i2 = o9a.s;
                break;
            case 4:
                i2 = o9a.t;
                break;
            case 5:
                i2 = o9a.u;
                break;
            case 6:
                i2 = o9a.v;
                break;
            case 7:
                i2 = o9a.w;
                break;
            case 8:
                i2 = o9a.x;
                break;
            case 9:
                i2 = o9a.y;
                break;
            case 10:
                i2 = o9a.c;
                break;
            case 11:
                i2 = o9a.d;
                break;
            case 12:
                i2 = o9a.e;
                break;
            case 13:
                i2 = o9a.f;
                break;
            case 14:
                i2 = o9a.g;
                break;
            case 15:
                i2 = o9a.h;
                break;
            case 16:
                i2 = o9a.i;
                break;
            case 17:
                i2 = o9a.j;
                break;
            case 18:
                i2 = o9a.k;
                break;
            case 19:
                i2 = o9a.l;
                break;
            case SavedMessagesIconDrawable.SMALL_ICON_SIZE:
                i2 = o9a.n;
                break;
            case 21:
                i2 = o9a.o;
                break;
            case 22:
                i2 = o9a.p;
                break;
            case 23:
                i2 = o9a.q;
                break;
            default:
                i2 = o9a.r;
                break;
        }
        Drawable n = am7.n(context, i2);
        if (n instanceof BitmapDrawable) {
            return ((BitmapDrawable) n).getBitmap();
        }
        return null;
    }

    public static View B(Context context, jea jea, lea lea) {
        if (jea instanceof gea) {
            View oneMeButton = new OneMeButton(context, (AttributeSet) null);
            oneMeButton.d(Integer.valueOf(((gea) jea).a), true);
            a24.Z(oneMeButton, 300, new wfc(9, (Object) jea));
            return oneMeButton;
        } else if (jea instanceof hea) {
            hea hea = (hea) jea;
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageDrawable(gq3.b(context, hea.a));
            int X = a24.X(((float) hea.b) * dh4.c().getDisplayMetrics().density);
            imageView.setPadding(X, X, X, X);
            float f2 = (float) 32;
            imageView.setLayoutParams(new ViewGroup.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f2 * dh4.c().getDisplayMetrics().density)));
            imageView.setOutlineProvider(new eu3(hea.c * dh4.c().getDisplayMetrics().density));
            a24.Z(imageView, 300, new wfc(10, (Object) hea));
            return imageView;
        } else if (jea instanceof iea) {
            raa raa = new raa(context);
            raa.setPadding(0, 0, 0, 0);
            raa.setListener(new duf((Object) raa, (Object) lea, (Object) jea));
            return raa;
        } else if (jea == null) {
            return null;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final int C(float f2) {
        return f2 >= ((float) 16) ? 2 : 1;
    }

    public static void a(Appendable appendable, Object obj, u16 u16) {
        if (u16 != null) {
            appendable.append((CharSequence) u16.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(String.valueOf(obj));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0283, code lost:
        if (r2.d == r7) goto L_0x0287;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0109, code lost:
        if (r4.d == r13) goto L_0x010d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0334  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0440 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x04aa A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x0584  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x0586  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x059b  */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x059e  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x05a4  */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x0674  */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x06bb  */
    /* JADX WARNING: Removed duplicated region for block: B:401:0x06bd  */
    /* JADX WARNING: Removed duplicated region for block: B:404:0x06c8  */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x06cb  */
    /* JADX WARNING: Removed duplicated region for block: B:408:0x06d1  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x06d4  */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x06d8  */
    /* JADX WARNING: Removed duplicated region for block: B:416:0x06e8  */
    /* JADX WARNING: Removed duplicated region for block: B:432:0x0113 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(defpackage.gf3 r36, defpackage.id7 r37, java.util.ArrayList r38, int r39) {
        /*
            r0 = r36
            r10 = r37
            r11 = r38
            r12 = 2
            if (r39 != 0) goto L_0x0012
            int r1 = r0.z0
            jy1[] r2 = r0.C0
            r14 = r1
            r15 = r2
            r16 = 0
            goto L_0x001a
        L_0x0012:
            int r1 = r0.A0
            jy1[] r2 = r0.B0
            r14 = r1
            r15 = r2
            r16 = r12
        L_0x001a:
            r9 = 0
        L_0x001b:
            if (r9 >= r14) goto L_0x0714
            r1 = r15[r9]
            boolean r2 = r1.q
            ff3 r8 = r1.a
            r3 = 3
            r4 = 1
            r7 = 8
            r17 = 0
            if (r2 != 0) goto L_0x0155
            int r2 = r1.l
            int r6 = r2 * 2
            r13 = r8
            r20 = r13
            r18 = 0
        L_0x0034:
            if (r18 != 0) goto L_0x011f
            int r5 = r1.i
            int r5 = r5 + r4
            r1.i = r5
            ff3[] r5 = r13.m0
            r5[r2] = r17
            ff3[] r5 = r13.l0
            r5[r2] = r17
            int r5 = r13.g0
            me3[] r4 = r13.Q
            if (r5 == r7) goto L_0x00ec
            r13.j(r2)
            r5 = r4[r6]
            r5.e()
            int r5 = r6 + 1
            r23 = r4[r5]
            r23.e()
            r23 = r4[r6]
            r23.e()
            r5 = r4[r5]
            r5.e()
            ff3 r5 = r1.b
            if (r5 != 0) goto L_0x0068
            r1.b = r13
        L_0x0068:
            r1.d = r13
            int[] r5 = r13.p0
            r5 = r5[r2]
            if (r5 != r3) goto L_0x00ec
            int[] r7 = r13.t
            r7 = r7[r2]
            if (r7 == 0) goto L_0x007e
            if (r7 == r3) goto L_0x007e
            if (r7 != r12) goto L_0x007b
            goto L_0x007e
        L_0x007b:
            r25 = r9
            goto L_0x00d0
        L_0x007e:
            int r12 = r1.j
            r22 = 1
            int r12 = r12 + 1
            r1.j = r12
            float[] r12 = r13.k0
            r12 = r12[r2]
            r21 = 0
            int r24 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
            if (r24 <= 0) goto L_0x0095
            float r3 = r1.k
            float r3 = r3 + r12
            r1.k = r3
        L_0x0095:
            int r3 = r13.g0
            r25 = r9
            r9 = 8
            if (r3 == r9) goto L_0x00c0
            r3 = 3
            if (r5 != r3) goto L_0x00c0
            if (r7 == 0) goto L_0x00a4
            if (r7 != r3) goto L_0x00c0
        L_0x00a4:
            r3 = 0
            int r5 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x00ad
            r3 = 1
            r1.n = r3
            goto L_0x00b0
        L_0x00ad:
            r3 = 1
            r1.o = r3
        L_0x00b0:
            java.util.ArrayList r3 = r1.h
            if (r3 != 0) goto L_0x00bb
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1.h = r3
        L_0x00bb:
            java.util.ArrayList r3 = r1.h
            r3.add(r13)
        L_0x00c0:
            ff3 r3 = r1.f
            if (r3 != 0) goto L_0x00c6
            r1.f = r13
        L_0x00c6:
            ff3 r3 = r1.g
            if (r3 == 0) goto L_0x00ce
            ff3[] r3 = r3.l0
            r3[r2] = r13
        L_0x00ce:
            r1.g = r13
        L_0x00d0:
            if (r2 != 0) goto L_0x00de
            int r3 = r13.r
            if (r3 == 0) goto L_0x00d7
            goto L_0x00e9
        L_0x00d7:
            int r3 = r13.u
            if (r3 != 0) goto L_0x00e9
            int r3 = r13.v
            goto L_0x00e9
        L_0x00de:
            int r3 = r13.s
            if (r3 == 0) goto L_0x00e3
            goto L_0x00e9
        L_0x00e3:
            int r3 = r13.x
            if (r3 != 0) goto L_0x00e9
            int r3 = r13.y
        L_0x00e9:
            r3 = r20
            goto L_0x00ef
        L_0x00ec:
            r25 = r9
            goto L_0x00e9
        L_0x00ef:
            if (r3 == r13) goto L_0x00f5
            ff3[] r3 = r3.m0
            r3[r2] = r13
        L_0x00f5:
            int r3 = r6 + 1
            r3 = r4[r3]
            me3 r3 = r3.f
            if (r3 == 0) goto L_0x010b
            ff3 r3 = r3.d
            me3[] r4 = r3.Q
            r4 = r4[r6]
            me3 r4 = r4.f
            if (r4 == 0) goto L_0x010b
            ff3 r4 = r4.d
            if (r4 == r13) goto L_0x010d
        L_0x010b:
            r3 = r17
        L_0x010d:
            if (r3 == 0) goto L_0x0110
            goto L_0x0113
        L_0x0110:
            r3 = r13
            r18 = 1
        L_0x0113:
            r20 = r13
            r9 = r25
            r4 = 1
            r7 = 8
            r12 = 2
            r13 = r3
            r3 = 3
            goto L_0x0034
        L_0x011f:
            r25 = r9
            ff3 r3 = r1.b
            if (r3 == 0) goto L_0x012c
            me3[] r3 = r3.Q
            r3 = r3[r6]
            r3.e()
        L_0x012c:
            ff3 r3 = r1.d
            if (r3 == 0) goto L_0x0139
            int r6 = r6 + 1
            me3[] r3 = r3.Q
            r3 = r3[r6]
            r3.e()
        L_0x0139:
            r1.c = r13
            if (r2 != 0) goto L_0x0144
            boolean r2 = r1.m
            if (r2 == 0) goto L_0x0144
            r1.e = r13
            goto L_0x0146
        L_0x0144:
            r1.e = r8
        L_0x0146:
            boolean r2 = r1.o
            if (r2 == 0) goto L_0x0150
            boolean r2 = r1.n
            if (r2 == 0) goto L_0x0150
            r2 = 1
            goto L_0x0151
        L_0x0150:
            r2 = 0
        L_0x0151:
            r1.p = r2
            r2 = 1
            goto L_0x0158
        L_0x0155:
            r25 = r9
            r2 = r4
        L_0x0158:
            r1.q = r2
            if (r11 == 0) goto L_0x016d
            boolean r2 = r11.contains(r8)
            if (r2 == 0) goto L_0x0163
            goto L_0x016d
        L_0x0163:
            r30 = r14
            r31 = r15
            r23 = r25
            r19 = 0
            goto L_0x0707
        L_0x016d:
            ff3 r12 = r1.c
            ff3 r13 = r1.b
            ff3 r9 = r1.d
            ff3 r2 = r1.e
            float r3 = r1.k
            int[] r4 = r0.p0
            r4 = r4[r39]
            r7 = 2
            if (r4 != r7) goto L_0x0180
            r4 = 1
            goto L_0x0181
        L_0x0180:
            r4 = 0
        L_0x0181:
            if (r39 != 0) goto L_0x01a0
            int r5 = r2.i0
            r6 = 1
            if (r5 != 0) goto L_0x018b
            r22 = 1
            goto L_0x018d
        L_0x018b:
            r22 = 0
        L_0x018d:
            if (r5 != r6) goto L_0x0192
            r18 = r6
            goto L_0x0194
        L_0x0192:
            r18 = 0
        L_0x0194:
            if (r5 != r7) goto L_0x0198
            r5 = r6
            goto L_0x0199
        L_0x0198:
            r5 = 0
        L_0x0199:
            r26 = r3
            r7 = r8
            r20 = r22
        L_0x019e:
            r6 = 0
            goto L_0x01bc
        L_0x01a0:
            r6 = 1
            int r5 = r2.j0
            if (r5 != 0) goto L_0x01a8
            r18 = r6
            goto L_0x01aa
        L_0x01a8:
            r18 = 0
        L_0x01aa:
            if (r5 != r6) goto L_0x01ae
            r6 = 1
            goto L_0x01af
        L_0x01ae:
            r6 = 0
        L_0x01af:
            if (r5 != r7) goto L_0x01b3
            r5 = 1
            goto L_0x01b4
        L_0x01b3:
            r5 = 0
        L_0x01b4:
            r26 = r3
            r7 = r8
            r20 = r18
            r18 = r6
            goto L_0x019e
        L_0x01bc:
            me3[] r3 = r0.Q
            if (r6 != 0) goto L_0x029c
            me3[] r11 = r7.Q
            r11 = r11[r16]
            if (r5 == 0) goto L_0x01c9
            r27 = 1
            goto L_0x01cb
        L_0x01c9:
            r27 = 4
        L_0x01cb:
            int r28 = r11.e()
            r29 = r6
            int[] r6 = r7.p0
            r30 = r14
            r14 = r6[r39]
            r31 = r15
            r15 = 3
            if (r14 != r15) goto L_0x01e4
            int[] r14 = r7.t
            r14 = r14[r39]
            if (r14 != 0) goto L_0x01e4
            r14 = 1
            goto L_0x01e5
        L_0x01e4:
            r14 = 0
        L_0x01e5:
            me3 r15 = r11.f
            if (r15 == 0) goto L_0x01f1
            if (r7 == r8) goto L_0x01f1
            int r15 = r15.e()
            int r28 = r15 + r28
        L_0x01f1:
            r15 = r28
            if (r5 == 0) goto L_0x01fe
            if (r7 == r8) goto L_0x01fe
            if (r7 == r13) goto L_0x01fe
            r28 = r2
            r27 = 8
            goto L_0x0200
        L_0x01fe:
            r28 = r2
        L_0x0200:
            me3 r2 = r11.f
            if (r2 == 0) goto L_0x023e
            if (r7 != r13) goto L_0x0213
            r32 = r8
            nld r8 = r11.i
            nld r2 = r2.i
            r33 = r1
            r1 = 6
            r10.f(r8, r2, r15, r1)
            goto L_0x0220
        L_0x0213:
            r33 = r1
            r32 = r8
            nld r1 = r11.i
            nld r2 = r2.i
            r8 = 8
            r10.f(r1, r2, r15, r8)
        L_0x0220:
            if (r14 == 0) goto L_0x0226
            if (r5 != 0) goto L_0x0226
            r27 = 5
        L_0x0226:
            if (r7 != r13) goto L_0x0232
            if (r5 == 0) goto L_0x0232
            boolean[] r1 = r7.S
            boolean r1 = r1[r39]
            if (r1 == 0) goto L_0x0232
            r1 = 5
            goto L_0x0234
        L_0x0232:
            r1 = r27
        L_0x0234:
            nld r2 = r11.i
            me3 r8 = r11.f
            nld r8 = r8.i
            r10.e(r2, r8, r15, r1)
            goto L_0x0242
        L_0x023e:
            r33 = r1
            r32 = r8
        L_0x0242:
            me3[] r1 = r7.Q
            if (r4 == 0) goto L_0x026f
            int r2 = r7.g0
            r8 = 8
            if (r2 == r8) goto L_0x0261
            r2 = r6[r39]
            r6 = 3
            if (r2 != r6) goto L_0x0261
            int r2 = r16 + 1
            r2 = r1[r2]
            nld r2 = r2.i
            r6 = r1[r16]
            nld r6 = r6.i
            r8 = 0
            r11 = 5
            r10.f(r2, r6, r8, r11)
            goto L_0x0262
        L_0x0261:
            r8 = 0
        L_0x0262:
            r2 = r1[r16]
            nld r2 = r2.i
            r3 = r3[r16]
            nld r3 = r3.i
            r6 = 8
            r10.f(r2, r3, r8, r6)
        L_0x026f:
            int r2 = r16 + 1
            r1 = r1[r2]
            me3 r1 = r1.f
            if (r1 == 0) goto L_0x0285
            ff3 r1 = r1.d
            me3[] r2 = r1.Q
            r2 = r2[r16]
            me3 r2 = r2.f
            if (r2 == 0) goto L_0x0285
            ff3 r2 = r2.d
            if (r2 == r7) goto L_0x0287
        L_0x0285:
            r1 = r17
        L_0x0287:
            if (r1 == 0) goto L_0x028d
            r7 = r1
            r6 = r29
            goto L_0x028e
        L_0x028d:
            r6 = 1
        L_0x028e:
            r11 = r38
            r2 = r28
            r14 = r30
            r15 = r31
            r8 = r32
            r1 = r33
            goto L_0x01bc
        L_0x029c:
            r33 = r1
            r28 = r2
            r32 = r8
            r30 = r14
            r31 = r15
            if (r9 == 0) goto L_0x0303
            me3[] r1 = r12.Q
            int r2 = r16 + 1
            r1 = r1[r2]
            me3 r1 = r1.f
            if (r1 == 0) goto L_0x0303
            me3[] r1 = r9.Q
            r1 = r1[r2]
            int[] r6 = r9.p0
            r6 = r6[r39]
            r7 = 3
            if (r6 != r7) goto L_0x02d9
            int[] r6 = r9.t
            r6 = r6[r39]
            if (r6 != 0) goto L_0x02d9
            if (r5 != 0) goto L_0x02d9
            me3 r6 = r1.f
            ff3 r7 = r6.d
            if (r7 != r0) goto L_0x02d9
            nld r7 = r1.i
            nld r6 = r6.i
            int r8 = r1.e()
            int r8 = -r8
            r11 = 5
            r10.e(r7, r6, r8, r11)
            goto L_0x02ef
        L_0x02d9:
            r11 = 5
            if (r5 == 0) goto L_0x02ef
            me3 r6 = r1.f
            ff3 r7 = r6.d
            if (r7 != r0) goto L_0x02ef
            nld r7 = r1.i
            nld r6 = r6.i
            int r8 = r1.e()
            int r8 = -r8
            r14 = 4
            r10.e(r7, r6, r8, r14)
        L_0x02ef:
            nld r6 = r1.i
            me3[] r7 = r12.Q
            r2 = r7[r2]
            me3 r2 = r2.f
            nld r2 = r2.i
            int r1 = r1.e()
            int r1 = -r1
            r7 = 6
            r10.g(r6, r2, r1, r7)
            goto L_0x0304
        L_0x0303:
            r11 = 5
        L_0x0304:
            if (r4 == 0) goto L_0x031b
            int r1 = r16 + 1
            r2 = r3[r1]
            nld r2 = r2.i
            me3[] r3 = r12.Q
            r1 = r3[r1]
            nld r3 = r1.i
            int r1 = r1.e()
            r4 = 8
            r10.f(r2, r3, r1, r4)
        L_0x031b:
            r1 = r33
            java.util.ArrayList r2 = r1.h
            if (r2 == 0) goto L_0x043a
            int r3 = r2.size()
            r4 = 1
            if (r3 <= r4) goto L_0x043a
            boolean r6 = r1.n
            if (r6 == 0) goto L_0x0334
            boolean r6 = r1.p
            if (r6 != 0) goto L_0x0334
            int r6 = r1.j
            float r6 = (float) r6
            goto L_0x0336
        L_0x0334:
            r6 = r26
        L_0x0336:
            r14 = r17
            r7 = 0
            r8 = 0
        L_0x033a:
            if (r8 >= r3) goto L_0x043a
            java.lang.Object r15 = r2.get(r8)
            ff3 r15 = (defpackage.ff3) r15
            float[] r4 = r15.k0
            r4 = r4[r39]
            r21 = 0
            int r24 = (r4 > r21 ? 1 : (r4 == r21 ? 0 : -1))
            me3[] r11 = r15.Q
            if (r24 >= 0) goto L_0x036b
            boolean r4 = r1.p
            if (r4 == 0) goto L_0x0364
            int r0 = r16 + 1
            r0 = r11[r0]
            nld r0 = r0.i
            r4 = r11[r16]
            nld r4 = r4.i
            r11 = 0
            r15 = 4
            r10.e(r0, r4, r11, r15)
            r24 = r15
            goto L_0x0382
        L_0x0364:
            r24 = 4
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x0368:
            r21 = 0
            goto L_0x036e
        L_0x036b:
            r24 = 4
            goto L_0x0368
        L_0x036e:
            int r26 = (r4 > r21 ? 1 : (r4 == r21 ? 0 : -1))
            if (r26 != 0) goto L_0x038c
            int r0 = r16 + 1
            r0 = r11[r0]
            nld r0 = r0.i
            r4 = r11[r16]
            nld r4 = r4.i
            r11 = 0
            r15 = 8
            r10.e(r0, r4, r11, r15)
        L_0x0382:
            r29 = r2
            r27 = r3
            r19 = r11
            r21 = 0
            goto L_0x042e
        L_0x038c:
            r19 = 0
            if (r14 == 0) goto L_0x0420
            me3[] r14 = r14.Q
            r0 = r14[r16]
            nld r0 = r0.i
            int r27 = r16 + 1
            r14 = r14[r27]
            nld r14 = r14.i
            r29 = r2
            r2 = r11[r16]
            nld r2 = r2.i
            r11 = r11[r27]
            nld r11 = r11.i
            r27 = r3
            as r3 = r37.l()
            r33 = r15
            r15 = 0
            r3.b = r15
            int r21 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r21 == 0) goto L_0x03bb
            int r21 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r21 != 0) goto L_0x03c3
        L_0x03bb:
            r26 = r4
            r4 = r15
            r15 = 1065353216(0x3f800000, float:1.0)
            r21 = 0
            goto L_0x0408
        L_0x03c3:
            r21 = 0
            int r34 = (r7 > r21 ? 1 : (r7 == r21 ? 0 : -1))
            if (r34 != 0) goto L_0x03d8
            or r2 = r3.d
            r7 = 1065353216(0x3f800000, float:1.0)
            r2.j(r0, r7)
            or r0 = r3.d
            r0.j(r14, r15)
        L_0x03d5:
            r26 = r4
            goto L_0x041c
        L_0x03d8:
            r15 = 1065353216(0x3f800000, float:1.0)
            if (r26 != 0) goto L_0x03e9
            or r0 = r3.d
            r0.j(r2, r15)
            or r0 = r3.d
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.j(r11, r2)
            goto L_0x03d5
        L_0x03e9:
            float r7 = r7 / r6
            float r26 = r4 / r6
            float r7 = r7 / r26
            r26 = r4
            or r4 = r3.d
            r4.j(r0, r15)
            or r0 = r3.d
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.j(r14, r4)
            or r0 = r3.d
            r0.j(r11, r7)
            or r0 = r3.d
            float r4 = -r7
            r0.j(r2, r4)
            goto L_0x041c
        L_0x0408:
            or r7 = r3.d
            r7.j(r0, r15)
            or r0 = r3.d
            r0.j(r14, r4)
            or r0 = r3.d
            r0.j(r11, r15)
            or r0 = r3.d
            r0.j(r2, r4)
        L_0x041c:
            r10.c(r3)
            goto L_0x042a
        L_0x0420:
            r29 = r2
            r27 = r3
            r26 = r4
            r33 = r15
            r21 = 0
        L_0x042a:
            r7 = r26
            r14 = r33
        L_0x042e:
            int r8 = r8 + 1
            r3 = r27
            r2 = r29
            r4 = 1
            r11 = 5
            r0 = r36
            goto L_0x033a
        L_0x043a:
            r19 = 0
            r24 = 4
            if (r13 == 0) goto L_0x0447
            if (r13 == r9) goto L_0x0444
            if (r5 == 0) goto L_0x0447
        L_0x0444:
            r0 = r32
            goto L_0x044f
        L_0x0447:
            r14 = r9
            r15 = r25
            r0 = r32
            r11 = 2
            goto L_0x04a8
        L_0x044f:
            me3[] r0 = r0.Q
            r0 = r0[r16]
            me3[] r1 = r12.Q
            int r2 = r16 + 1
            r1 = r1[r2]
            me3 r0 = r0.f
            if (r0 == 0) goto L_0x0461
            nld r0 = r0.i
            r3 = r0
            goto L_0x0463
        L_0x0461:
            r3 = r17
        L_0x0463:
            me3 r0 = r1.f
            if (r0 == 0) goto L_0x046b
            nld r0 = r0.i
            r6 = r0
            goto L_0x046d
        L_0x046b:
            r6 = r17
        L_0x046d:
            me3[] r0 = r13.Q
            r0 = r0[r16]
            if (r9 == 0) goto L_0x0477
            me3[] r1 = r9.Q
            r1 = r1[r2]
        L_0x0477:
            if (r3 == 0) goto L_0x04a0
            if (r6 == 0) goto L_0x04a0
            if (r39 != 0) goto L_0x0483
            r2 = r28
            float r2 = r2.d0
        L_0x0481:
            r5 = r2
            goto L_0x0488
        L_0x0483:
            r2 = r28
            float r2 = r2.e0
            goto L_0x0481
        L_0x0488:
            int r4 = r0.e()
            int r8 = r1.e()
            nld r2 = r0.i
            nld r7 = r1.i
            r0 = 7
            r1 = r37
            r11 = 2
            r14 = r9
            r15 = r25
            r9 = r0
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x04a4
        L_0x04a0:
            r14 = r9
            r15 = r25
            r11 = 2
        L_0x04a4:
            r23 = r15
            goto L_0x06ad
        L_0x04a8:
            if (r20 == 0) goto L_0x058d
            if (r13 == 0) goto L_0x058d
            int r2 = r1.j
            if (r2 <= 0) goto L_0x04b7
            int r1 = r1.i
            if (r1 != r2) goto L_0x04b7
            r22 = 1
            goto L_0x04b9
        L_0x04b7:
            r22 = r19
        L_0x04b9:
            r8 = r13
            r9 = r8
        L_0x04bb:
            if (r9 == 0) goto L_0x04a4
            ff3[] r1 = r9.m0
            r1 = r1[r39]
            r7 = r1
        L_0x04c2:
            if (r7 == 0) goto L_0x04cf
            int r1 = r7.g0
            r6 = 8
            if (r1 != r6) goto L_0x04d1
            ff3[] r1 = r7.m0
            r7 = r1[r39]
            goto L_0x04c2
        L_0x04cf:
            r6 = 8
        L_0x04d1:
            if (r7 != 0) goto L_0x04dd
            if (r9 != r14) goto L_0x04d6
            goto L_0x04dd
        L_0x04d6:
            r21 = r7
            r23 = r8
            r11 = r9
            goto L_0x057e
        L_0x04dd:
            me3[] r1 = r9.Q
            r2 = r1[r16]
            nld r3 = r2.i
            me3 r4 = r2.f
            if (r4 == 0) goto L_0x04ea
            nld r4 = r4.i
            goto L_0x04ec
        L_0x04ea:
            r4 = r17
        L_0x04ec:
            if (r8 == r9) goto L_0x04f7
            me3[] r4 = r8.Q
            int r5 = r16 + 1
            r4 = r4[r5]
            nld r4 = r4.i
            goto L_0x0506
        L_0x04f7:
            if (r9 != r13) goto L_0x0506
            me3[] r4 = r0.Q
            r4 = r4[r16]
            me3 r4 = r4.f
            if (r4 == 0) goto L_0x0504
            nld r4 = r4.i
            goto L_0x0506
        L_0x0504:
            r4 = r17
        L_0x0506:
            int r2 = r2.e()
            int r5 = r16 + 1
            r21 = r1[r5]
            int r21 = r21.e()
            if (r7 == 0) goto L_0x051b
            me3[] r6 = r7.Q
            r6 = r6[r16]
            nld r11 = r6.i
            goto L_0x0528
        L_0x051b:
            me3[] r6 = r12.Q
            r6 = r6[r5]
            me3 r6 = r6.f
            if (r6 == 0) goto L_0x0526
            nld r11 = r6.i
            goto L_0x0528
        L_0x0526:
            r11 = r17
        L_0x0528:
            r1 = r1[r5]
            nld r1 = r1.i
            if (r6 == 0) goto L_0x0534
            int r6 = r6.e()
            int r21 = r6 + r21
        L_0x0534:
            me3[] r6 = r8.Q
            r6 = r6[r5]
            int r6 = r6.e()
            int r6 = r6 + r2
            if (r3 == 0) goto L_0x04d6
            if (r4 == 0) goto L_0x04d6
            if (r11 == 0) goto L_0x04d6
            if (r1 == 0) goto L_0x04d6
            if (r9 != r13) goto L_0x0550
            me3[] r2 = r13.Q
            r2 = r2[r16]
            int r2 = r2.e()
            r6 = r2
        L_0x0550:
            if (r9 != r14) goto L_0x055c
            me3[] r2 = r14.Q
            r2 = r2[r5]
            int r2 = r2.e()
            r21 = r2
        L_0x055c:
            if (r22 == 0) goto L_0x0561
            r24 = 8
            goto L_0x0563
        L_0x0561:
            r24 = 5
        L_0x0563:
            r5 = 1056964608(0x3f000000, float:0.5)
            r25 = r1
            r1 = r37
            r2 = r3
            r3 = r4
            r4 = r6
            r23 = 8
            r6 = r11
            r11 = r7
            r7 = r25
            r23 = r8
            r8 = r21
            r21 = r11
            r11 = r9
            r9 = r24
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x057e:
            int r1 = r11.g0
            r9 = 8
            if (r1 == r9) goto L_0x0586
            r8 = r11
            goto L_0x0588
        L_0x0586:
            r8 = r23
        L_0x0588:
            r9 = r21
            r11 = 2
            goto L_0x04bb
        L_0x058d:
            r9 = 8
            if (r18 == 0) goto L_0x04a4
            if (r13 == 0) goto L_0x04a4
            int r2 = r1.j
            if (r2 <= 0) goto L_0x059e
            int r1 = r1.i
            if (r1 != r2) goto L_0x059e
            r22 = 1
            goto L_0x05a0
        L_0x059e:
            r22 = r19
        L_0x05a0:
            r8 = r13
            r11 = r8
        L_0x05a2:
            if (r11 == 0) goto L_0x0659
            ff3[] r1 = r11.m0
            r1 = r1[r39]
        L_0x05a8:
            if (r1 == 0) goto L_0x05b3
            int r2 = r1.g0
            if (r2 != r9) goto L_0x05b3
            ff3[] r1 = r1.m0
            r1 = r1[r39]
            goto L_0x05a8
        L_0x05b3:
            if (r11 == r13) goto L_0x0646
            if (r11 == r14) goto L_0x0646
            if (r1 == 0) goto L_0x0646
            if (r1 != r14) goto L_0x05be
            r7 = r17
            goto L_0x05bf
        L_0x05be:
            r7 = r1
        L_0x05bf:
            me3[] r1 = r11.Q
            r2 = r1[r16]
            nld r3 = r2.i
            me3[] r4 = r8.Q
            int r5 = r16 + 1
            r4 = r4[r5]
            nld r4 = r4.i
            int r2 = r2.e()
            r6 = r1[r5]
            int r6 = r6.e()
            if (r7 == 0) goto L_0x05eb
            me3[] r1 = r7.Q
            r1 = r1[r16]
            nld r9 = r1.i
            r21 = r7
            me3 r7 = r1.f
            if (r7 == 0) goto L_0x05e8
            nld r7 = r7.i
            goto L_0x0601
        L_0x05e8:
            r7 = r17
            goto L_0x0601
        L_0x05eb:
            r21 = r7
            me3[] r7 = r14.Q
            r7 = r7[r16]
            if (r7 == 0) goto L_0x05f6
            nld r9 = r7.i
            goto L_0x05f8
        L_0x05f6:
            r9 = r17
        L_0x05f8:
            r1 = r1[r5]
            nld r1 = r1.i
            r35 = r7
            r7 = r1
            r1 = r35
        L_0x0601:
            if (r1 == 0) goto L_0x060b
            int r1 = r1.e()
            int r1 = r1 + r6
            r23 = r1
            goto L_0x060d
        L_0x060b:
            r23 = r6
        L_0x060d:
            me3[] r1 = r8.Q
            r1 = r1[r5]
            int r1 = r1.e()
            int r5 = r1 + r2
            if (r22 == 0) goto L_0x061c
            r25 = 8
            goto L_0x061e
        L_0x061c:
            r25 = r24
        L_0x061e:
            if (r3 == 0) goto L_0x063d
            if (r4 == 0) goto L_0x063d
            if (r9 == 0) goto L_0x063d
            if (r7 == 0) goto L_0x063d
            r6 = 1056964608(0x3f000000, float:0.5)
            r1 = r37
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r9
            r26 = r8
            r8 = r23
            r23 = r15
            r15 = 8
            r9 = r25
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0643
        L_0x063d:
            r26 = r8
            r23 = r15
            r15 = 8
        L_0x0643:
            r1 = r21
            goto L_0x064b
        L_0x0646:
            r26 = r8
            r23 = r15
            r15 = r9
        L_0x064b:
            int r2 = r11.g0
            if (r2 == r15) goto L_0x0651
            r8 = r11
            goto L_0x0653
        L_0x0651:
            r8 = r26
        L_0x0653:
            r11 = r1
            r9 = r15
            r15 = r23
            goto L_0x05a2
        L_0x0659:
            r23 = r15
            me3[] r1 = r13.Q
            r1 = r1[r16]
            me3[] r0 = r0.Q
            r0 = r0[r16]
            me3 r0 = r0.f
            me3[] r2 = r14.Q
            int r3 = r16 + 1
            r11 = r2[r3]
            me3[] r2 = r12.Q
            r2 = r2[r3]
            me3 r15 = r2.f
            r9 = 5
            if (r0 == 0) goto L_0x0681
            if (r13 == r14) goto L_0x0683
            nld r2 = r1.i
            nld r0 = r0.i
            int r1 = r1.e()
            r10.e(r2, r0, r1, r9)
        L_0x0681:
            r0 = r9
            goto L_0x069d
        L_0x0683:
            if (r15 == 0) goto L_0x0681
            nld r2 = r1.i
            nld r3 = r0.i
            int r4 = r1.e()
            nld r6 = r11.i
            nld r7 = r15.i
            int r8 = r11.e()
            r5 = 1056964608(0x3f000000, float:0.5)
            r1 = r37
            r0 = r9
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x069d:
            if (r15 == 0) goto L_0x06ad
            if (r13 == r14) goto L_0x06ad
            nld r1 = r11.i
            nld r2 = r15.i
            int r3 = r11.e()
            int r3 = -r3
            r10.e(r1, r2, r3, r0)
        L_0x06ad:
            if (r20 != 0) goto L_0x06b1
            if (r18 == 0) goto L_0x0707
        L_0x06b1:
            if (r13 == 0) goto L_0x0707
            if (r13 == r14) goto L_0x0707
            me3[] r0 = r13.Q
            r1 = r0[r16]
            if (r14 != 0) goto L_0x06bd
            r9 = r13
            goto L_0x06be
        L_0x06bd:
            r9 = r14
        L_0x06be:
            int r2 = r16 + 1
            me3[] r3 = r9.Q
            r4 = r3[r2]
            me3 r5 = r1.f
            if (r5 == 0) goto L_0x06cb
            nld r5 = r5.i
            goto L_0x06cd
        L_0x06cb:
            r5 = r17
        L_0x06cd:
            me3 r6 = r4.f
            if (r6 == 0) goto L_0x06d4
            nld r6 = r6.i
            goto L_0x06d6
        L_0x06d4:
            r6 = r17
        L_0x06d6:
            if (r12 == r9) goto L_0x06e6
            me3[] r6 = r12.Q
            r6 = r6[r2]
            me3 r6 = r6.f
            if (r6 == 0) goto L_0x06e4
            nld r6 = r6.i
            r17 = r6
        L_0x06e4:
            r6 = r17
        L_0x06e6:
            if (r13 != r9) goto L_0x06ea
            r4 = r0[r2]
        L_0x06ea:
            if (r5 == 0) goto L_0x0707
            if (r6 == 0) goto L_0x0707
            int r0 = r1.e()
            r2 = r3[r2]
            int r8 = r2.e()
            nld r2 = r1.i
            nld r7 = r4.i
            r9 = 5
            r11 = 1056964608(0x3f000000, float:0.5)
            r1 = r37
            r3 = r5
            r4 = r0
            r5 = r11
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0707:
            int r9 = r23 + 1
            r12 = 2
            r0 = r36
            r11 = r38
            r14 = r30
            r15 = r31
            goto L_0x001b
        L_0x0714:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xy6.b(gf3, id7, java.util.ArrayList, int):void");
    }

    public static final void c(View view) {
        char c2 = 1;
        if (view.getContext().getResources().getConfiguration().getLayoutDirection() != 1) {
            c2 = 2;
        }
        int i = 1;
        if (c2 != 1) {
            if (c2 == 2) {
                i = 0;
            } else {
                throw null;
            }
        }
        view.setLayoutDirection(i);
    }

    public static final Layout d(Context context, p97 p97, CharSequence charSequence, int i, TextPaint textPaint, u16 u16) {
        Context context2 = context;
        int i2 = i;
        u16 u162 = u16;
        int C = C(textPaint.getTextSize() / context.getResources().getDisplayMetrics().density);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.append(8288);
        spannableStringBuilder.append(" ");
        spannableStringBuilder.setSpan(new c1f(context2, C, false, u162), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        int c2 = p97.b(p97, spannableStringBuilder, textPaint, i, Integer.MAX_VALUE, 48).getLineCount() > 1 ? i2 - me4.c((float) sxe.f(C), dh4.c().getDisplayMetrics().density, a24.X(((float) sxe.i(C)) * dh4.c().getDisplayMetrics().density)) : i2;
        int i3 = c2;
        Layout b2 = p97.b(p97, spannableStringBuilder, textPaint, c2, 1, 48);
        if (i3 == i2) {
            return b2;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(b2.getText().subSequence(0, b2.getEllipsisStart(0) + 1));
        spannableStringBuilder2.append(8288);
        spannableStringBuilder2.append(" ");
        spannableStringBuilder2.setSpan(new c1f(context2, C, false, u162), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
        return p97.b(p97, spannableStringBuilder2, textPaint, i, 1, 48);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = r3.getClass().getName();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void e(java.lang.StringBuilder r2, java.lang.Object r3) {
        /*
            if (r3 != 0) goto L_0x0008
            java.lang.String r3 = "null"
            r2.append(r3)
            goto L_0x003f
        L_0x0008:
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getSimpleName()
            int r1 = r0.length()
            if (r1 > 0) goto L_0x002c
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            r1 = 46
            int r1 = r0.lastIndexOf(r1)
            if (r1 <= 0) goto L_0x002c
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)
        L_0x002c:
            r2.append(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r2.append(r0)
            int r3 = java.lang.System.identityHashCode(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xy6.e(java.lang.StringBuilder, java.lang.Object):void");
    }

    public static int f(Context context) {
        int i;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Point point = new Point();
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getSize(point);
        }
        int i2 = point.x;
        int sqrt = (int) Math.sqrt(Math.pow((double) point.y, 2.0d) + Math.pow((double) i2, 2.0d));
        Canvas canvas = new Canvas();
        int min = Math.min(canvas.getMaximumBitmapWidth(), canvas.getMaximumBitmapHeight());
        if (min > 0) {
            sqrt = Math.min(sqrt, min);
        }
        try {
            i = wx3.l();
        } catch (Exception unused) {
            i = 0;
        }
        return i > 0 ? Math.min(sqrt, i) : sqrt;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void g(android.graphics.drawable.StateListDrawable r3, pda r4) {
        /*
            r0 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r0 = new int[]{r0}
            int r0 = r3.findStateDrawableIndex(r0)
            android.graphics.drawable.Drawable r0 = r3.getStateDrawable(r0)
            boolean r1 = r0 instanceof one.me.sdk.richvector.EnhancedVectorDrawable
            r2 = 0
            if (r1 == 0) goto L_0x0017
            one.me.sdk.richvector.EnhancedVectorDrawable r0 = (one.me.sdk.richvector.EnhancedVectorDrawable) r0
            goto L_0x0018
        L_0x0017:
            r0 = r2
        L_0x0018:
            if (r0 != 0) goto L_0x001b
            return
        L_0x001b:
            r1 = -16842912(0xfffffffffefeff60, float:-1.6947495E38)
            int[] r1 = new int[]{r1}
            int r1 = r3.findStateDrawableIndex(r1)
            android.graphics.drawable.Drawable r3 = r3.getStateDrawable(r1)
            boolean r1 = r3 instanceof android.graphics.drawable.GradientDrawable
            if (r1 == 0) goto L_0x0031
            r2 = r3
            android.graphics.drawable.GradientDrawable r2 = (android.graphics.drawable.GradientDrawable) r2
        L_0x0031:
            if (r2 != 0) goto L_0x0034
            return
        L_0x0034:
            r4.getIcon()
            r3 = -16745729(0xffffffffff007aff, float:-1.7077982E38)
            java.lang.String r1 = "circle_background"
            defpackage.xs7.P(r0, r1, r3)
            r3 = 2
            float r3 = (float) r3
            android.content.res.Resources r0 = dh4.c()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r3 = r3 * r0
            int r3 = defpackage.a24.X(r3)
            r0e r4 = r4.h()
            int r4 = r4.j
            r2.setStroke(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xy6.g(android.graphics.drawable.StateListDrawable, pda):void");
    }

    public static void h(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static float i(float f2, float f3, float f4) {
        return f2 < f3 ? f3 : f2 > f4 ? f4 : f2;
    }

    public static int j(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static void k(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r2 = (defpackage.p02) r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final v2b l(defpackage.pj5 r6) {
        /*
            r0 = 0
            r1 = 5
            h02 r2 = defpackage.i02.l
            r2.getClass()
            h02 r2 = defpackage.h02.a
            boolean r2 = r6 instanceof defpackage.p02
            if (r2 == 0) goto L_0x0024
            r2 = r6
            p02 r2 = (defpackage.p02) r2
            pj5 r3 = r2.k()
            if (r3 == 0) goto L_0x0024
            v2b r6 = new v2b
            r4 = -3
            int r5 = r2.b
            if (r5 == r4) goto L_0x001e
            r4 = -2
        L_0x001e:
            hu3 r2 = r2.a
            r6.<init>(r3, r2, r0, r1)
            return r6
        L_0x0024:
            v2b r2 = new v2b
            bw4 r3 = defpackage.bw4.a
            r2.<init>(r6, r3, r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xy6.l(pj5):v2b");
    }

    public static t73 m(String str, String str2) {
        u90 u90 = new u90(str, str2);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(pjb.a(u90.class));
        return new t73((String) null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new zx1(15, (Object) u90), hashSet3);
    }

    public static StateListDrawable n(Context context) {
        EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(context, mnb.ic_check_filled_24);
        s59 s59 = km4.y0;
        s59.n(context).g();
        xs7.P(enhancedVectorDrawable, "circle_background", -16745729);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        float f2 = (float) 24;
        gradientDrawable.setSize(a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f2 * dh4.c().getDisplayMetrics().density));
        gradientDrawable.setColor(0);
        gradientDrawable.setStroke(a24.X(((float) 2) * dh4.c().getDisplayMetrics().density), s59.n(context).g().h().j);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, enhancedVectorDrawable);
        stateListDrawable.addState(new int[]{-16842912}, gradientDrawable);
        return stateListDrawable;
    }

    public static t73 o(String str, yc5 yc5) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(pjb.a(u90.class));
        for (Class cls : new Class[0]) {
            n06.j(cls, "Null interface");
            hashSet.add(pjb.a(cls));
        }
        oe4 a2 = oe4.a(Context.class);
        if (!hashSet.contains(a2.a)) {
            hashSet2.add(a2);
            return new t73((String) null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new e44(str, 18, yc5), hashSet3);
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public static String p(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static final ConversationEndReason q(wfd wfd) {
        switch (wfd == null ? -1 : nfd.$EnumSwitchMapping$0[wfd.ordinal()]) {
            case -1:
                return null;
            case 1:
                return ConversationEndReason.Canceled.INSTANCE;
            case 2:
                return ConversationEndReason.Rejected.INSTANCE;
            case 3:
                return ConversationEndReason.Hangup.INSTANCE;
            case 4:
                return ConversationEndReason.Missed.INSTANCE;
            case 5:
                return ConversationEndReason.SignalingTimeout.INSTANCE;
            case 6:
                return ConversationEndReason.Busy.INSTANCE;
            case 7:
                return new ConversationEndReason.Error(new RuntimeException("Closed by the server error"));
            case 8:
                return ConversationEndReason.RemovedFromCall.INSTANCE;
            case 9:
                return ConversationEndReason.AcceptedOnAnotherDevice.INSTANCE;
            case 10:
                return ConversationEndReason.EndedForAll.INSTANCE;
            case 11:
                return ConversationEndReason.CallTimeout.INSTANCE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static lq6 r(InputStream inputStream) {
        int i;
        mq6 mq6 = (mq6) mq6.d.getValue();
        int i2 = mq6.a;
        byte[] bArr = new byte[i2];
        if (inputStream.markSupported()) {
            try {
                inputStream.mark(i2);
                i = swb.J(inputStream, bArr, i2);
            } finally {
                inputStream.reset();
            }
        } else {
            i = swb.J(inputStream, bArr, i2);
        }
        lq6 a2 = mq6.c.a(i, bArr);
        boolean equals = a2.equals(o84.m);
        lq6 lq6 = lq6.c;
        if (equals) {
            a2 = lq6;
        }
        if (a2 != lq6) {
            return a2;
        }
        List<kq6> list = mq6.b;
        if (list == null) {
            return lq6;
        }
        for (kq6 a3 : list) {
            lq6 a4 = a3.a(i, bArr);
            if (a4 != lq6) {
                return a4;
            }
        }
        return lq6;
    }

    public static final int s(View view) {
        return w(view) ? view.getRight() : view.getLeft();
    }

    public static ArrayList t(Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r2 = r4.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean u(ru.ok.android.api.core.ApiInvocationException r4) {
        /*
            r0 = 102(0x66, float:1.43E-43)
            r1 = 1
            int r2 = r4.a
            if (r2 == r0) goto L_0x0027
            r0 = 103(0x67, float:1.44E-43)
            if (r2 == r0) goto L_0x0027
            r0 = 100
            r3 = 0
            if (r2 != r0) goto L_0x0026
            java.lang.String r0 = "session_key"
            java.lang.String r2 = r4.b
            if (r2 == 0) goto L_0x001d
            boolean r2 = defpackage.h0e.R(r2, r0, r3)
            if (r2 != r1) goto L_0x001d
            goto L_0x0027
        L_0x001d:
            java.lang.String r4 = r4.c
            boolean r4 = defpackage.hhd.f(r4, r0)
            if (r4 == 0) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r1 = r3
        L_0x0027:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xy6.u(ru.ok.android.api.core.ApiInvocationException):boolean");
    }

    public static boolean v(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static final boolean w(View view) {
        return view.getContext().getResources().getConfiguration().getLayoutDirection() == 1;
    }

    public static boolean x(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    public static boolean y(XmlPullParser xmlPullParser, String str) {
        return x(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static final void z(int i, int i2, int i3, int i4, View view, View view2) {
        if (w(view)) {
            view.layout(view2.getMeasuredWidth() - i3, i2, view2.getMeasuredWidth() - i, i4);
        } else {
            view.layout(i, i2, i3, i4);
        }
    }
}
