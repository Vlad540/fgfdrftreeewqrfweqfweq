package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.recyclerview.widget.RecyclerView;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: hwf  reason: default package */
public abstract class hwf {
    public static final x3a a = new x3a(28, (Object) "DISK_USAGE");
    public static final s59 b = new Object();
    public static int c = 3;

    public static lg7 a(List list) {
        lg7 lg7 = (lg7) list;
        lg7.e();
        lg7.c = true;
        return lg7.b > 0 ? lg7 : lg7.o;
    }

    public static final int b(RecyclerView recyclerView, int i, int i2) {
        int width = (recyclerView.getWidth() - recyclerView.getPaddingLeft()) - recyclerView.getPaddingRight();
        if (width <= 0) {
            width = (recyclerView.getContext().getResources().getDisplayMetrics().widthPixels - recyclerView.getPaddingLeft()) - recyclerView.getPaddingRight();
        }
        int i3 = width - (i * i2);
        int i4 = 1;
        int i5 = i2 - 1;
        if (i5 >= 1) {
            i4 = i5;
        }
        return i3 / i4;
    }

    public static lg7 c() {
        return new lg7(10);
    }

    public static void d(Bitmap bitmap, int i) {
        int i2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[(width * height)];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int[] iArr2 = new int[12544];
        int i3 = 25;
        int i4 = 1;
        for (int i5 = 1; i5 < 256; i5++) {
            for (int i6 = 0; i6 < 49; i6++) {
                iArr2[i3] = i5;
                i3++;
            }
        }
        int[] iArr3 = new int[Math.max(width, height)];
        int i7 = i;
        int i8 = 0;
        while (i8 < i7) {
            int i9 = 0;
            while (true) {
                i2 = 24;
                if (i9 >= height) {
                    break;
                }
                int i10 = width * i9;
                i9++;
                int i11 = (i9 * width) - i4;
                int i12 = width + 24;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                for (int i17 = -24; i17 < i12; i17++) {
                    int i18 = i10 + i17;
                    if (i18 < i10) {
                        i18 = i10;
                    } else if (i18 > i11) {
                        i18 = i11;
                    }
                    int i19 = iArr[i18];
                    i13 += (i19 >> 16) & 255;
                    i14 += (i19 >> 8) & 255;
                    i15 += i19 & 255;
                    i16 += i19 >>> 24;
                    if (i17 >= 24) {
                        iArr3[i17 - 24] = (iArr2[i16] << 24) | (iArr2[i13] << 16) | (iArr2[i14] << 8) | iArr2[i15];
                        int i20 = (i17 - 48) + i10;
                        if (i20 < i10) {
                            i20 = i10;
                        } else if (i20 > i11) {
                            i20 = i11;
                        }
                        int i21 = iArr[i20];
                        i13 -= (i21 >> 16) & 255;
                        i14 -= (i21 >> 8) & 255;
                        i15 -= i21 & 255;
                        i16 -= i21 >>> 24;
                    }
                }
                System.arraycopy(iArr3, 0, iArr, i10, width);
                i4 = 1;
            }
            int i22 = 0;
            int i23 = 0;
            while (i23 < width) {
                int i24 = ((height - 1) * width) + i23;
                int i25 = i2 * width;
                int i26 = 48 * width;
                int i27 = i23 - i25;
                int i28 = i22;
                int i29 = i28;
                int i30 = i29;
                int i31 = i30;
                int i32 = i31;
                while (i27 <= i24 + i25) {
                    int i33 = iArr[i27 < i23 ? i23 : i27 > i24 ? i24 : i27];
                    i28 += (i33 >> 16) & 255;
                    i29 += (i33 >> 8) & 255;
                    i30 += i33 & 255;
                    i2 = 24;
                    i31 += i33 >>> 24;
                    if (i27 - i25 >= i23) {
                        iArr3[i32] = (iArr2[i31] << 24) | (iArr2[i28] << 16) | (iArr2[i29] << 8) | iArr2[i30];
                        i32++;
                        int i34 = i27 - i26;
                        if (i34 < i23) {
                            i34 = i23;
                        } else if (i34 > i24) {
                            i34 = i24;
                        }
                        int i35 = iArr[i34];
                        i28 -= (i35 >> 16) & 255;
                        i29 -= (i35 >> 8) & 255;
                        i30 -= i35 & 255;
                        i2 = 24;
                        i31 -= i35 >>> 24;
                    }
                    i27 += width;
                }
                int i36 = i23;
                for (int i37 = 0; i37 < height; i37++) {
                    iArr[i36] = iArr3[i37];
                    i36 += width;
                }
                i23++;
                i22 = 0;
            }
            i8++;
            i4 = 1;
        }
        bitmap.setPixels(iArr, 0, width, 0, 0, width, height);
    }

    public static int e(int i, int i2, Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [sn1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, lbc] */
    public static vn1 f(tn1 tn1) {
        ? obj = new Object();
        obj.c = new Object();
        vn1 vn1 = new vn1(obj);
        obj.b = vn1;
        obj.a = tn1.getClass();
        try {
            String z = tn1.z(obj);
            if (z != null) {
                obj.a = z;
            }
        } catch (Exception e) {
            vn1.b.j(e);
        }
        return vn1;
    }

    public static jn g(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        jn jnVar;
        if (i(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new jn((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                jnVar = jn.m(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception unused) {
                jnVar = null;
            }
            if (jnVar != null) {
                return jnVar;
            }
        }
        return new jn((Shader) null, (ColorStateList) null, 0);
    }

    public static String h(TypedArray typedArray, int i, int i2) {
        String string = typedArray.getString(i);
        return string == null ? typedArray.getString(i2) : string;
    }

    public static boolean i(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x017e, code lost:
        if (r0.equals("video/mp2t") == false) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int j(java.lang.String r21) {
        /*
            r0 = r21
            r1 = 14
            r2 = 13
            r3 = 12
            r4 = 11
            r6 = 9
            r7 = 8
            r8 = 7
            r9 = 6
            r10 = 5
            r11 = 4
            r12 = 3
            java.lang.String r13 = "audio/flac"
            java.lang.String r14 = "audio/wav"
            java.lang.String r15 = "audio/mpeg"
            r16 = 2
            r17 = 1
            r18 = 0
            r19 = -1
            if (r0 != 0) goto L_0x0024
            return r19
        L_0x0024:
            java.util.ArrayList r20 = defpackage.b49.a
            int r20 = r21.hashCode()
            switch(r20) {
                case -1007807498: goto L_0x0048;
                case -586683234: goto L_0x003c;
                case 187090231: goto L_0x0030;
                default: goto L_0x002d;
            }
        L_0x002d:
            r5 = r19
            goto L_0x0053
        L_0x0030:
            java.lang.String r5 = "audio/mp3"
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L_0x0039
            goto L_0x002d
        L_0x0039:
            r5 = r16
            goto L_0x0053
        L_0x003c:
            java.lang.String r5 = "audio/x-wav"
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L_0x0045
            goto L_0x002d
        L_0x0045:
            r5 = r17
            goto L_0x0053
        L_0x0048:
            java.lang.String r5 = "audio/x-flac"
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L_0x0051
            goto L_0x002d
        L_0x0051:
            r5 = r18
        L_0x0053:
            switch(r5) {
                case 0: goto L_0x005b;
                case 1: goto L_0x0059;
                case 2: goto L_0x0057;
                default: goto L_0x0056;
            }
        L_0x0056:
            goto L_0x005c
        L_0x0057:
            r0 = r15
            goto L_0x005c
        L_0x0059:
            r0 = r14
            goto L_0x005c
        L_0x005b:
            r0 = r13
        L_0x005c:
            int r5 = r0.hashCode()
            switch(r5) {
                case -2123537834: goto L_0x018f;
                case -1662384011: goto L_0x0182;
                case -1662384007: goto L_0x0178;
                case -1662095187: goto L_0x016b;
                case -1606874997: goto L_0x015e;
                case -1487394660: goto L_0x0151;
                case -1248337486: goto L_0x0144;
                case -1004728940: goto L_0x0137;
                case -387023398: goto L_0x0129;
                case -43467528: goto L_0x011b;
                case 13915911: goto L_0x010d;
                case 187078296: goto L_0x00ff;
                case 187078297: goto L_0x00f1;
                case 187078669: goto L_0x00e3;
                case 187090232: goto L_0x00d6;
                case 187091926: goto L_0x00c9;
                case 187099443: goto L_0x00be;
                case 1331848029: goto L_0x00b1;
                case 1503095341: goto L_0x00a4;
                case 1504578661: goto L_0x0097;
                case 1504619009: goto L_0x008c;
                case 1504831518: goto L_0x0081;
                case 1505118770: goto L_0x0074;
                case 2039520277: goto L_0x0067;
                default: goto L_0x0063;
            }
        L_0x0063:
            r16 = r19
            goto L_0x019b
        L_0x0067:
            java.lang.String r5 = "video/x-matroska"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0070
            goto L_0x0063
        L_0x0070:
            r16 = 23
            goto L_0x019b
        L_0x0074:
            java.lang.String r5 = "audio/webm"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x007d
            goto L_0x0063
        L_0x007d:
            r16 = 22
            goto L_0x019b
        L_0x0081:
            boolean r0 = r0.equals(r15)
            if (r0 != 0) goto L_0x0088
            goto L_0x0063
        L_0x0088:
            r16 = 21
            goto L_0x019b
        L_0x008c:
            boolean r0 = r0.equals(r13)
            if (r0 != 0) goto L_0x0093
            goto L_0x0063
        L_0x0093:
            r16 = 20
            goto L_0x019b
        L_0x0097:
            java.lang.String r5 = "audio/eac3"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00a0
            goto L_0x0063
        L_0x00a0:
            r16 = 19
            goto L_0x019b
        L_0x00a4:
            java.lang.String r5 = "audio/3gpp"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00ad
            goto L_0x0063
        L_0x00ad:
            r16 = 18
            goto L_0x019b
        L_0x00b1:
            java.lang.String r5 = "video/mp4"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00ba
            goto L_0x0063
        L_0x00ba:
            r16 = 17
            goto L_0x019b
        L_0x00be:
            boolean r0 = r0.equals(r14)
            if (r0 != 0) goto L_0x00c5
            goto L_0x0063
        L_0x00c5:
            r16 = 16
            goto L_0x019b
        L_0x00c9:
            java.lang.String r5 = "audio/ogg"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00d2
            goto L_0x0063
        L_0x00d2:
            r16 = 15
            goto L_0x019b
        L_0x00d6:
            java.lang.String r5 = "audio/mp4"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00df
            goto L_0x0063
        L_0x00df:
            r16 = r1
            goto L_0x019b
        L_0x00e3:
            java.lang.String r5 = "audio/amr"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00ed
            goto L_0x0063
        L_0x00ed:
            r16 = r2
            goto L_0x019b
        L_0x00f1:
            java.lang.String r5 = "audio/ac4"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00fb
            goto L_0x0063
        L_0x00fb:
            r16 = r3
            goto L_0x019b
        L_0x00ff:
            java.lang.String r5 = "audio/ac3"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0109
            goto L_0x0063
        L_0x0109:
            r16 = r4
            goto L_0x019b
        L_0x010d:
            java.lang.String r5 = "video/x-flv"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0117
            goto L_0x0063
        L_0x0117:
            r16 = 10
            goto L_0x019b
        L_0x011b:
            java.lang.String r5 = "application/webm"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0125
            goto L_0x0063
        L_0x0125:
            r16 = r6
            goto L_0x019b
        L_0x0129:
            java.lang.String r5 = "audio/x-matroska"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0133
            goto L_0x0063
        L_0x0133:
            r16 = r7
            goto L_0x019b
        L_0x0137:
            java.lang.String r5 = "text/vtt"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0141
            goto L_0x0063
        L_0x0141:
            r16 = r8
            goto L_0x019b
        L_0x0144:
            java.lang.String r5 = "application/mp4"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x014e
            goto L_0x0063
        L_0x014e:
            r16 = r9
            goto L_0x019b
        L_0x0151:
            java.lang.String r5 = "image/jpeg"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x015b
            goto L_0x0063
        L_0x015b:
            r16 = r10
            goto L_0x019b
        L_0x015e:
            java.lang.String r5 = "audio/amr-wb"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0168
            goto L_0x0063
        L_0x0168:
            r16 = r11
            goto L_0x019b
        L_0x016b:
            java.lang.String r5 = "video/webm"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0175
            goto L_0x0063
        L_0x0175:
            r16 = r12
            goto L_0x019b
        L_0x0178:
            java.lang.String r5 = "video/mp2t"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x019b
            goto L_0x0063
        L_0x0182:
            java.lang.String r5 = "video/mp2p"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x018c
            goto L_0x0063
        L_0x018c:
            r16 = r17
            goto L_0x019b
        L_0x018f:
            java.lang.String r5 = "audio/eac3-joc"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0199
            goto L_0x0063
        L_0x0199:
            r16 = r18
        L_0x019b:
            switch(r16) {
                case 0: goto L_0x01ae;
                case 1: goto L_0x01ab;
                case 2: goto L_0x01aa;
                case 3: goto L_0x01a9;
                case 4: goto L_0x01a8;
                case 5: goto L_0x01a7;
                case 6: goto L_0x01a6;
                case 7: goto L_0x01a5;
                case 8: goto L_0x01a9;
                case 9: goto L_0x01a9;
                case 10: goto L_0x01a4;
                case 11: goto L_0x01ae;
                case 12: goto L_0x01a3;
                case 13: goto L_0x01a8;
                case 14: goto L_0x01a6;
                case 15: goto L_0x01a2;
                case 16: goto L_0x01a1;
                case 17: goto L_0x01a6;
                case 18: goto L_0x01a8;
                case 19: goto L_0x01ae;
                case 20: goto L_0x01a0;
                case 21: goto L_0x019f;
                case 22: goto L_0x01a9;
                case 23: goto L_0x01a9;
                default: goto L_0x019e;
            }
        L_0x019e:
            return r19
        L_0x019f:
            return r8
        L_0x01a0:
            return r11
        L_0x01a1:
            return r3
        L_0x01a2:
            return r6
        L_0x01a3:
            return r17
        L_0x01a4:
            return r10
        L_0x01a5:
            return r2
        L_0x01a6:
            return r7
        L_0x01a7:
            return r1
        L_0x01a8:
            return r12
        L_0x01a9:
            return r9
        L_0x01aa:
            return r4
        L_0x01ab:
            r0 = 10
            return r0
        L_0x01ae:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hwf.j(java.lang.String):int");
    }

    public static int k(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        return (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) ? 14 : -1;
    }

    public static boolean l(int i, String str) {
        return c <= i || Log.isLoggable(str, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ce, code lost:
        if (r12 == null) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00ff, code lost:
        r12 = me.leolin.shortcutbadger.BuildConfig.FLAVOR;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0100, code lost:
        r9 = new rr8(r9, r12);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static tr8 m(ws8 r15) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "payloadCatching catch error"
            java.lang.String r2 = "ServerPayload/PayloadCatching"
            r3 = 1
            r4 = 0
            int r5 = defpackage.jjd.K(r15)     // Catch:{ all -> 0x000d }
            goto L_0x003c
        L_0x000d:
            r5 = move-exception
            defpackage.udd.S(r2, r1, r5)
            java.util.concurrent.CopyOnWriteArraySet r6 = uzc.a
            java.util.Iterator r6 = r6.iterator()
        L_0x0017:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x002a
            java.lang.Object r7 = r6.next()
            ny9 r7 = (defpackage.ny9) r7
            r7.getClass()
            defpackage.ny9.a(r5)
            goto L_0x0017
        L_0x002a:
            int r6 = m4b.a
            int r6 = defpackage.hr1.t(r6)
            if (r6 == 0) goto L_0x003b
            if (r6 == r3) goto L_0x003a
            kotlin.NoWhenBranchMatchedException r15 = new kotlin.NoWhenBranchMatchedException
            r15.<init>()
            throw r15
        L_0x003a:
            throw r5
        L_0x003b:
            r5 = r4
        L_0x003c:
            r6 = 0
            r7 = 0
            r9 = r6
            r10 = r7
        L_0x0041:
            if (r4 >= r5) goto L_0x013d
            java.lang.String r12 = defpackage.jjd.M(r15)     // Catch:{ all -> 0x0048 }
            goto L_0x0077
        L_0x0048:
            r12 = move-exception
            defpackage.udd.S(r2, r1, r12)
            java.util.concurrent.CopyOnWriteArraySet r13 = uzc.a
            java.util.Iterator r13 = r13.iterator()
        L_0x0052:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x0065
            java.lang.Object r14 = r13.next()
            ny9 r14 = (defpackage.ny9) r14
            r14.getClass()
            defpackage.ny9.a(r12)
            goto L_0x0052
        L_0x0065:
            int r13 = m4b.a
            int r13 = defpackage.hr1.t(r13)
            if (r13 == 0) goto L_0x0076
            if (r13 == r3) goto L_0x0075
            kotlin.NoWhenBranchMatchedException r15 = new kotlin.NoWhenBranchMatchedException
            r15.<init>()
            throw r15
        L_0x0075:
            throw r12
        L_0x0076:
            r12 = r6
        L_0x0077:
            java.lang.String r13 = "userId"
            boolean r13 = defpackage.hhd.f(r12, r13)
            if (r13 == 0) goto L_0x00c0
            java.lang.Long r10 = java.lang.Long.valueOf(r7)
            long r11 = defpackage.jjd.J(r15, r7)     // Catch:{ all -> 0x008c }
            java.lang.Long r10 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x008c }
            goto L_0x00ba
        L_0x008c:
            r11 = move-exception
            defpackage.udd.S(r2, r1, r11)
            java.util.concurrent.CopyOnWriteArraySet r12 = uzc.a
            java.util.Iterator r12 = r12.iterator()
        L_0x0096:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x00a9
            java.lang.Object r13 = r12.next()
            ny9 r13 = (defpackage.ny9) r13
            r13.getClass()
            defpackage.ny9.a(r11)
            goto L_0x0096
        L_0x00a9:
            int r12 = m4b.a
            int r12 = defpackage.hr1.t(r12)
            if (r12 == 0) goto L_0x00ba
            if (r12 == r3) goto L_0x00b9
            kotlin.NoWhenBranchMatchedException r15 = new kotlin.NoWhenBranchMatchedException
            r15.<init>()
            throw r15
        L_0x00b9:
            throw r11
        L_0x00ba:
            long r10 = r10.longValue()
            goto L_0x0139
        L_0x00c0:
            java.lang.String r13 = "reaction"
            boolean r12 = defpackage.hhd.f(r12, r13)
            if (r12 == 0) goto L_0x0107
            wr8 r9 = wr8.c
            java.lang.String r12 = defpackage.jjd.M(r15)     // Catch:{ all -> 0x00d1 }
            if (r12 != 0) goto L_0x0100
            goto L_0x00ff
        L_0x00d1:
            r12 = move-exception
            defpackage.udd.S(r2, r1, r12)
            java.util.concurrent.CopyOnWriteArraySet r13 = uzc.a
            java.util.Iterator r13 = r13.iterator()
        L_0x00db:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x00ee
            java.lang.Object r14 = r13.next()
            ny9 r14 = (defpackage.ny9) r14
            r14.getClass()
            defpackage.ny9.a(r12)
            goto L_0x00db
        L_0x00ee:
            int r13 = m4b.a
            int r13 = defpackage.hr1.t(r13)
            if (r13 == 0) goto L_0x00ff
            if (r13 == r3) goto L_0x00fe
            kotlin.NoWhenBranchMatchedException r15 = new kotlin.NoWhenBranchMatchedException
            r15.<init>()
            throw r15
        L_0x00fe:
            throw r12
        L_0x00ff:
            r12 = r0
        L_0x0100:
            rr8 r13 = new rr8
            r13.<init>(r9, r12)
            r9 = r13
            goto L_0x0139
        L_0x0107:
            r15.z()     // Catch:{ all -> 0x010b }
            goto L_0x0139
        L_0x010b:
            r12 = move-exception
            defpackage.udd.S(r2, r1, r12)
            java.util.concurrent.CopyOnWriteArraySet r13 = uzc.a
            java.util.Iterator r13 = r13.iterator()
        L_0x0115:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x0128
            java.lang.Object r14 = r13.next()
            ny9 r14 = (defpackage.ny9) r14
            r14.getClass()
            defpackage.ny9.a(r12)
            goto L_0x0115
        L_0x0128:
            int r13 = m4b.a
            int r13 = defpackage.hr1.t(r13)
            if (r13 == 0) goto L_0x0139
            if (r13 == r3) goto L_0x0138
            kotlin.NoWhenBranchMatchedException r15 = new kotlin.NoWhenBranchMatchedException
            r15.<init>()
            throw r15
        L_0x0138:
            throw r12
        L_0x0139:
            int r4 = r4 + 1
            goto L_0x0041
        L_0x013d:
            tr8 r15 = new tr8
            if (r9 == 0) goto L_0x0145
            r15.<init>(r10, r9)
            return r15
        L_0x0145:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "reaction is null"
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hwf.m(ws8):tr8");
    }

    public static void n(PackageInfo packageInfo, File file) {
        DataOutputStream dataOutputStream;
        try {
            dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
            return;
        } catch (IOException unused) {
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static TypedArray o(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static void r(t67 t67, Object obj) {
        if (obj == null || (obj instanceof String)) {
            String str = (String) obj;
            t1 t1Var = (t1) t67;
            if (str != null) {
                t1Var.i(str);
            } else {
                t1Var.c0();
            }
        } else if (obj == JSONObject.NULL) {
            t67.c0();
        } else if (obj instanceof Boolean) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            t1 t1Var2 = (t1) t67;
            t1Var2.getClass();
            t1Var2.a(String.valueOf(booleanValue));
        } else if ((obj instanceof Double) || (obj instanceof Float)) {
            ((t1) t67).d(((Number) obj).doubleValue());
        } else if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof Byte)) {
            long longValue = ((Number) obj).longValue();
            t1 t1Var3 = (t1) t67;
            t1Var3.getClass();
            t1Var3.a(Long.toString(longValue));
        } else if (obj instanceof JSONObject) {
            s(t67, (JSONObject) obj);
        } else if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            t67.u();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                r(t67, jSONArray.opt(i));
            }
            t67.t();
        } else {
            throw new IllegalArgumentException("Don't know how to write " + obj);
        }
    }

    public static void s(t67 t67, JSONObject jSONObject) {
        t67.s();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            t67.g0(next);
            r(t67, jSONObject.opt(next));
        }
        t67.q();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, e3] */
    public static final e3 t() {
        ? obj = new Object();
        obj.a = new AtomicReference((Object) null);
        return obj;
    }

    public static final nf1 u(uxb uxb, boolean z) {
        int ordinal = uxb.ordinal();
        switch (uxb.ordinal()) {
            case 0:
                return new nf1(ordinal, new hge(r1a.t0));
            case 1:
                return new nf1(ordinal, new hge(r1a.r0));
            case 2:
                return new nf1(ordinal, new hge(r1a.C0));
            case 3:
                return new nf1(ordinal, new hge(r1a.u0));
            case 4:
                return new nf1(ordinal, new hge(r1a.s0));
            case 5:
                return new nf1(ordinal, new hge(r1a.z0));
            case 6:
                return new nf1(ordinal, new hge(r1a.A0));
            case 7:
                return new nf1(ordinal, new hge(r1a.B0));
            case 8:
                return new nf1(ordinal, new hge(r1a.y0));
            case 9:
                return new nf1(ordinal, new hge(r1a.x0));
            case 10:
                return new nf1(ordinal, z ? new hge(r1a.w0) : new hge(r1a.v0));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final void w(bve bve) {
        bve.e(v40.class, new cl(6));
    }

    public static final void x(bve bve) {
        bve.e(i5a.class, new y7b(27));
    }

    public static final void y(bve bve) {
        bve.c(z24.class, new w8d(5));
        bve.e(yv3.class, new n5b(27));
        bve.e(mqa.class, new n5b(28));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0244, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0251, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:?, code lost:
        r5.addSuppressed(r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:186:0x0230, B:202:0x024d] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01ba A[SYNTHETIC, Splitter:B:139:0x01ba] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x028f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e1 A[SYNTHETIC, Splitter:B:55:0x00e1] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x014c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void z(android.content.Context r17, java.util.concurrent.Executor r18, defpackage.tab r19, boolean r20) {
        /*
            r1 = r17
            r8 = r19
            android.content.Context r0 = r17.getApplicationContext()
            java.lang.String r2 = r0.getPackageName()
            android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo()
            android.content.res.AssetManager r9 = r0.getAssets()
            java.io.File r0 = new java.io.File
            java.lang.String r3 = r3.sourceDir
            r0.<init>(r3)
            java.lang.String r6 = r0.getName()
            android.content.pm.PackageManager r0 = r17.getPackageManager()
            r11 = 0
            android.content.pm.PackageInfo r12 = r0.getPackageInfo(r2, r11)     // Catch:{ NameNotFoundException -> 0x0298 }
            java.io.File r13 = r17.getFilesDir()
            r14 = 0
            r15 = 1
            if (r20 != 0) goto L_0x0079
            java.io.File r0 = new java.io.File
            java.lang.String r3 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
            r0.<init>(r13, r3)
            boolean r3 = r0.exists()
            if (r3 != 0) goto L_0x003f
            r0 = r11
            goto L_0x006d
        L_0x003f:
            java.io.DataInputStream r3 = new java.io.DataInputStream     // Catch:{ IOException -> 0x006c }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ IOException -> 0x006c }
            r4.<init>(r0)     // Catch:{ IOException -> 0x006c }
            r3.<init>(r4)     // Catch:{ IOException -> 0x006c }
            long r4 = r3.readLong()     // Catch:{ all -> 0x0060 }
            r3.close()     // Catch:{ IOException -> 0x006c }
            long r10 = r12.lastUpdateTime
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0058
            r0 = r15
            goto L_0x0059
        L_0x0058:
            r0 = 0
        L_0x0059:
            if (r0 == 0) goto L_0x006d
            r3 = 2
            r8.d(r3, r14)
            goto L_0x006d
        L_0x0060:
            r0 = move-exception
            r4 = r0
            r3.close()     // Catch:{ all -> 0x0066 }
            goto L_0x006b
        L_0x0066:
            r0 = move-exception
            r3 = r0
            r4.addSuppressed(r3)     // Catch:{ IOException -> 0x006c }
        L_0x006b:
            throw r4     // Catch:{ IOException -> 0x006c }
        L_0x006c:
            r0 = 0
        L_0x006d:
            if (r0 != 0) goto L_0x0070
            goto L_0x0079
        L_0x0070:
            r17.getPackageName()
            r2 = 0
            defpackage.hfb.c(r1, r2)
            goto L_0x0297
        L_0x0079:
            r17.getPackageName()
            int r0 = android.os.Build.VERSION.SDK_INT
            java.io.File r10 = new java.io.File
            java.io.File r3 = new java.io.File
            java.lang.String r4 = "/data/misc/profiles/cur/0"
            r3.<init>(r4, r2)
            java.lang.String r2 = "primary.prof"
            r10.<init>(r3, r2)
            ur3 r11 = new ur3
            java.lang.String r7 = "dexopt/baseline.prof"
            r2 = r11
            r3 = r9
            r4 = r18
            r5 = r19
            r16 = r7
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.Object r2 = r11.d
            byte[] r2 = (byte[]) r2
            if (r2 != 0) goto L_0x00ad
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 3
            r11.t(r2, r0)
        L_0x00aa:
            r4 = r15
            goto L_0x028c
        L_0x00ad:
            boolean r0 = r10.exists()
            r3 = 4
            if (r0 == 0) goto L_0x00be
            boolean r0 = r10.canWrite()
            if (r0 != 0) goto L_0x00c1
            r11.t(r3, r14)
            goto L_0x00aa
        L_0x00be:
            r10.createNewFile()     // Catch:{ IOException -> 0x0288 }
        L_0x00c1:
            r11.a = r15
            byte[] r4 = defpackage.n1g.d
            r5 = 6
            r0 = r16
            java.io.FileInputStream r0 = r11.r(r9, r0)     // Catch:{ FileNotFoundException -> 0x00d5, IOException -> 0x00ce }
            r6 = r0
            goto L_0x00db
        L_0x00ce:
            r0 = move-exception
            r6 = r0
            r7 = 7
            r8.d(r7, r6)
            goto L_0x00da
        L_0x00d5:
            r0 = move-exception
            r6 = r0
            r8.d(r5, r6)
        L_0x00da:
            r6 = r14
        L_0x00db:
            java.lang.String r7 = "Invalid magic"
            r10 = 8
            if (r6 == 0) goto L_0x013b
            byte[] r0 = defpackage.am7.y(r6, r3)     // Catch:{ IOException -> 0x0120, IllegalStateException -> 0x0105 }
            boolean r0 = java.util.Arrays.equals(r4, r0)     // Catch:{ IOException -> 0x0120, IllegalStateException -> 0x0105 }
            if (r0 == 0) goto L_0x0109
            byte[] r0 = defpackage.am7.y(r6, r3)     // Catch:{ IOException -> 0x0120, IllegalStateException -> 0x0105 }
            java.lang.Object r5 = r11.f     // Catch:{ IOException -> 0x0120, IllegalStateException -> 0x0105 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x0120, IllegalStateException -> 0x0105 }
            bg4[] r5 = defpackage.n1g.R(r6, r0, r5)     // Catch:{ IOException -> 0x0120, IllegalStateException -> 0x0105 }
            r6.close()     // Catch:{ IOException -> 0x00fb }
            goto L_0x012d
        L_0x00fb:
            r0 = move-exception
            r6 = r0
            r15 = 7
            r8.d(r15, r6)
            goto L_0x012d
        L_0x0102:
            r0 = move-exception
        L_0x0103:
            r1 = r0
            goto L_0x0130
        L_0x0105:
            r0 = move-exception
            goto L_0x010f
        L_0x0107:
            r15 = 7
            goto L_0x0122
        L_0x0109:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0120, IllegalStateException -> 0x0105 }
            r0.<init>(r7)     // Catch:{ IOException -> 0x0120, IllegalStateException -> 0x0105 }
            throw r0     // Catch:{ IOException -> 0x0120, IllegalStateException -> 0x0105 }
        L_0x010f:
            r8.d(r10, r0)     // Catch:{ all -> 0x011d }
            r6.close()     // Catch:{ IOException -> 0x0116 }
            goto L_0x012c
        L_0x0116:
            r0 = move-exception
            r5 = r0
            r15 = 7
        L_0x0119:
            r8.d(r15, r5)
            goto L_0x012c
        L_0x011d:
            r0 = move-exception
            r15 = 7
            goto L_0x0103
        L_0x0120:
            r0 = move-exception
            goto L_0x0107
        L_0x0122:
            r8.d(r15, r0)     // Catch:{ all -> 0x0102 }
            r6.close()     // Catch:{ IOException -> 0x0129 }
            goto L_0x012c
        L_0x0129:
            r0 = move-exception
            r5 = r0
            goto L_0x0119
        L_0x012c:
            r5 = r14
        L_0x012d:
            r11.g = r5
            goto L_0x013b
        L_0x0130:
            r6.close()     // Catch:{ IOException -> 0x0134 }
            goto L_0x013a
        L_0x0134:
            r0 = move-exception
            r2 = r0
            r3 = 7
            r8.d(r3, r2)
        L_0x013a:
            throw r1
        L_0x013b:
            java.lang.Object r0 = r11.g
            bg4[] r0 = (defpackage.bg4[]) r0
            if (r0 == 0) goto L_0x01a2
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 34
            if (r5 <= r6) goto L_0x0148
            goto L_0x01a2
        L_0x0148:
            switch(r5) {
                case 31: goto L_0x014c;
                case 32: goto L_0x014c;
                case 33: goto L_0x014c;
                case 34: goto L_0x014c;
                default: goto L_0x014b;
            }
        L_0x014b:
            goto L_0x01a2
        L_0x014c:
            java.lang.String r5 = "dexopt/baseline.profm"
            java.io.FileInputStream r5 = r11.r(r9, r5)     // Catch:{ FileNotFoundException -> 0x0174, IOException -> 0x0171, IllegalStateException -> 0x016f }
            if (r5 == 0) goto L_0x0189
            byte[] r6 = defpackage.n1g.e     // Catch:{ all -> 0x0176 }
            byte[] r9 = defpackage.am7.y(r5, r3)     // Catch:{ all -> 0x0176 }
            boolean r6 = java.util.Arrays.equals(r6, r9)     // Catch:{ all -> 0x0176 }
            if (r6 == 0) goto L_0x0179
            byte[] r3 = defpackage.am7.y(r5, r3)     // Catch:{ all -> 0x0176 }
            bg4[] r0 = defpackage.n1g.O(r5, r3, r2, r0)     // Catch:{ all -> 0x0176 }
            r11.g = r0     // Catch:{ all -> 0x0176 }
            r5.close()     // Catch:{ FileNotFoundException -> 0x0174, IOException -> 0x0171, IllegalStateException -> 0x016f }
            r0 = r11
            goto L_0x019f
        L_0x016f:
            r0 = move-exception
            goto L_0x018f
        L_0x0171:
            r0 = move-exception
            r2 = 7
            goto L_0x0195
        L_0x0174:
            r0 = move-exception
            goto L_0x0199
        L_0x0176:
            r0 = move-exception
            r2 = r0
            goto L_0x017f
        L_0x0179:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0176 }
            r0.<init>(r7)     // Catch:{ all -> 0x0176 }
            throw r0     // Catch:{ all -> 0x0176 }
        L_0x017f:
            r5.close()     // Catch:{ all -> 0x0183 }
            goto L_0x0188
        L_0x0183:
            r0 = move-exception
            r3 = r0
            r2.addSuppressed(r3)     // Catch:{ FileNotFoundException -> 0x0174, IOException -> 0x0171, IllegalStateException -> 0x016f }
        L_0x0188:
            throw r2     // Catch:{ FileNotFoundException -> 0x0174, IOException -> 0x0171, IllegalStateException -> 0x016f }
        L_0x0189:
            if (r5 == 0) goto L_0x019e
            r5.close()     // Catch:{ FileNotFoundException -> 0x0174, IOException -> 0x0171, IllegalStateException -> 0x016f }
            goto L_0x019e
        L_0x018f:
            r11.g = r14
            r8.d(r10, r0)
            goto L_0x019e
        L_0x0195:
            r8.d(r2, r0)
            goto L_0x019e
        L_0x0199:
            r2 = 9
            r8.d(r2, r0)
        L_0x019e:
            r0 = r14
        L_0x019f:
            if (r0 == 0) goto L_0x01a2
            r11 = r0
        L_0x01a2:
            java.lang.Object r0 = r11.c
            r2 = r0
            tab r2 = (defpackage.tab) r2
            java.lang.Object r0 = r11.g
            bg4[] r0 = (defpackage.bg4[]) r0
            java.lang.String r3 = "This device doesn't support aot. Did you call deviceSupportsAotProfile()?"
            if (r0 == 0) goto L_0x0201
            java.lang.Object r5 = r11.d
            byte[] r5 = (byte[]) r5
            if (r5 != 0) goto L_0x01b6
            goto L_0x0201
        L_0x01b6:
            boolean r6 = r11.a
            if (r6 == 0) goto L_0x01fb
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x01d7, IllegalStateException -> 0x01d5 }
            r6.<init>()     // Catch:{ IOException -> 0x01d7, IllegalStateException -> 0x01d5 }
            r6.write(r4)     // Catch:{ all -> 0x01da }
            r6.write(r5)     // Catch:{ all -> 0x01da }
            boolean r0 = defpackage.n1g.a0(r6, r5, r0)     // Catch:{ all -> 0x01da }
            if (r0 != 0) goto L_0x01dd
            r0 = 5
            r2.d(r0, r14)     // Catch:{ all -> 0x01da }
            r11.g = r14     // Catch:{ all -> 0x01da }
            r6.close()     // Catch:{ IOException -> 0x01d7, IllegalStateException -> 0x01d5 }
            goto L_0x0201
        L_0x01d5:
            r0 = move-exception
            goto L_0x01f1
        L_0x01d7:
            r0 = move-exception
            r4 = 7
            goto L_0x01f5
        L_0x01da:
            r0 = move-exception
            r4 = r0
            goto L_0x01e7
        L_0x01dd:
            byte[] r0 = r6.toByteArray()     // Catch:{ all -> 0x01da }
            r11.h = r0     // Catch:{ all -> 0x01da }
            r6.close()     // Catch:{ IOException -> 0x01d7, IllegalStateException -> 0x01d5 }
            goto L_0x01f8
        L_0x01e7:
            r6.close()     // Catch:{ all -> 0x01eb }
            goto L_0x01f0
        L_0x01eb:
            r0 = move-exception
            r5 = r0
            r4.addSuppressed(r5)     // Catch:{ IOException -> 0x01d7, IllegalStateException -> 0x01d5 }
        L_0x01f0:
            throw r4     // Catch:{ IOException -> 0x01d7, IllegalStateException -> 0x01d5 }
        L_0x01f1:
            r2.d(r10, r0)
            goto L_0x01f8
        L_0x01f5:
            r2.d(r4, r0)
        L_0x01f8:
            r11.g = r14
            goto L_0x0201
        L_0x01fb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0201:
            java.lang.Object r0 = r11.h
            byte[] r0 = (byte[]) r0
            if (r0 != 0) goto L_0x020b
            r2 = 0
            r4 = 1
            goto L_0x0277
        L_0x020b:
            boolean r2 = r11.a
            if (r2 == 0) goto L_0x0282
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ FileNotFoundException -> 0x0267, IOException -> 0x0264 }
            r2.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0267, IOException -> 0x0264 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x0257 }
            java.lang.Object r0 = r11.e     // Catch:{ all -> 0x0257 }
            java.io.File r0 = (java.io.File) r0     // Catch:{ all -> 0x0257 }
            r3.<init>(r0)     // Catch:{ all -> 0x0257 }
            r0 = 512(0x200, float:7.175E-43)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x024a }
        L_0x0221:
            int r4 = r2.read(r0)     // Catch:{ all -> 0x024a }
            if (r4 <= 0) goto L_0x022c
            r5 = 0
            r3.write(r0, r5, r4)     // Catch:{ all -> 0x024a }
            goto L_0x0221
        L_0x022c:
            r4 = 1
            r11.t(r4, r14)     // Catch:{ all -> 0x0247 }
            r3.close()     // Catch:{ all -> 0x0244 }
            r2.close()     // Catch:{ FileNotFoundException -> 0x0241, IOException -> 0x023e }
            r11.h = r14
            r11.g = r14
            r2 = r4
            goto L_0x0277
        L_0x023c:
            r0 = move-exception
            goto L_0x027d
        L_0x023e:
            r0 = move-exception
        L_0x023f:
            r2 = 7
            goto L_0x026a
        L_0x0241:
            r0 = move-exception
        L_0x0242:
            r2 = 6
            goto L_0x0272
        L_0x0244:
            r0 = move-exception
        L_0x0245:
            r3 = r0
            goto L_0x025a
        L_0x0247:
            r0 = move-exception
        L_0x0248:
            r5 = r0
            goto L_0x024d
        L_0x024a:
            r0 = move-exception
            r4 = 1
            goto L_0x0248
        L_0x024d:
            r3.close()     // Catch:{ all -> 0x0251 }
            goto L_0x0256
        L_0x0251:
            r0 = move-exception
            r3 = r0
            r5.addSuppressed(r3)     // Catch:{ all -> 0x0244 }
        L_0x0256:
            throw r5     // Catch:{ all -> 0x0244 }
        L_0x0257:
            r0 = move-exception
            r4 = 1
            goto L_0x0245
        L_0x025a:
            r2.close()     // Catch:{ all -> 0x025e }
            goto L_0x0263
        L_0x025e:
            r0 = move-exception
            r2 = r0
            r3.addSuppressed(r2)     // Catch:{ FileNotFoundException -> 0x0241, IOException -> 0x023e }
        L_0x0263:
            throw r3     // Catch:{ FileNotFoundException -> 0x0241, IOException -> 0x023e }
        L_0x0264:
            r0 = move-exception
            r4 = 1
            goto L_0x023f
        L_0x0267:
            r0 = move-exception
            r4 = 1
            goto L_0x0242
        L_0x026a:
            r11.t(r2, r0)     // Catch:{ all -> 0x023c }
        L_0x026d:
            r11.h = r14
            r11.g = r14
            goto L_0x0276
        L_0x0272:
            r11.t(r2, r0)     // Catch:{ all -> 0x023c }
            goto L_0x026d
        L_0x0276:
            r2 = 0
        L_0x0277:
            if (r2 == 0) goto L_0x028d
            n(r12, r13)
            goto L_0x028d
        L_0x027d:
            r11.h = r14
            r11.g = r14
            throw r0
        L_0x0282:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0288:
            r4 = r15
            r11.t(r3, r14)
        L_0x028c:
            r2 = 0
        L_0x028d:
            if (r2 == 0) goto L_0x0293
            if (r20 == 0) goto L_0x0293
            r11 = r4
            goto L_0x0294
        L_0x0293:
            r11 = 0
        L_0x0294:
            defpackage.hfb.c(r1, r11)
        L_0x0297:
            return
        L_0x0298:
            r0 = move-exception
            r2 = r0
            r3 = 7
            r8.d(r3, r2)
            r2 = 0
            defpackage.hfb.c(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hwf.z(android.content.Context, java.util.concurrent.Executor, tab, boolean):void");
    }

    public abstract void p(int i);

    public abstract void q(Typeface typeface, boolean z);

    public abstract void v();
}
