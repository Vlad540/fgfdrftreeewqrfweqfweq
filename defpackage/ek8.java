package defpackage;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Insets;
import android.net.Uri;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.Spannable;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.WindowInsets;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import org.xmlpull.v1.XmlPullParser;
import ru.ok.android.commons.app.ApplicationProvider;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ek8  reason: default package */
public abstract class ek8 {
    public static final int[] X = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] Y = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] Z = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final sj0 a = new sj0(0);
    public static final String[] b = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] c = {44100, 48000, 32000};
    public static final int[] o = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] w0 = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};
    public static final String[] x0 = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] y0 = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] z0 = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static int A(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (!((i & -2097152) == -2097152) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i6 = c[i5];
        if (i2 == 2) {
            i6 /= 2;
        } else if (i2 == 0) {
            i6 /= 4;
        }
        int i7 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? o[i4 - 1] : X[i4 - 1]) * 12) / i6) + i7) * 4;
        }
        int i8 = i2 == 3 ? i3 == 2 ? Y[i4 - 1] : Z[i4 - 1] : w0[i4 - 1];
        int i9 = 144;
        if (i2 == 3) {
            return ((i8 * 144) / i6) + i7;
        }
        if (i3 == 1) {
            i9 = 72;
        }
        return ((i9 * i8) / i6) + i7;
    }

    public static final View B(t97 t97) {
        if (L(t97)) {
            return (View) t97.getValue();
        }
        return null;
    }

    public static final int C(t97 t97) {
        if (t97.a()) {
            return ((View) t97.getValue()).getMeasuredHeight();
        }
        return 0;
    }

    public static final int D(t97 t97) {
        if (t97.a()) {
            return ((View) t97.getValue()).getMeasuredWidth();
        }
        return 0;
    }

    public static Object E(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return ht0.a(bundle, str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static final WindowManager F(Context context) {
        return (WindowManager) context.getSystemService("window");
    }

    public static final void G(Context context, String str) {
        if (str.length() != 0) {
            try {
                Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(str);
                Linkify.addLinks(newSpannable, 1);
                URLSpan[] uRLSpanArr = (URLSpan[]) newSpannable.getSpans(0, newSpannable.length(), URLSpan.class);
                if (true ^ (uRLSpanArr.length == 0)) {
                    if (uRLSpanArr.length != 0) {
                        str = uRLSpanArr[0].getURL();
                    } else {
                        throw new NoSuchElementException("Array is empty.");
                    }
                }
            } catch (Throwable unused) {
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            try {
                context.startActivity(intent);
            } catch (ActivityNotFoundException e) {
                e.getMessage();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006e, code lost:
        r11 = r10.f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0078, code lost:
        r11 = r8.f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void H(int r17, ff3 r18, ghb r19, boolean r20) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r0.m
            if (r3 == 0) goto L_0x000b
            return
        L_0x000b:
            boolean r3 = r0 instanceof gf3
            if (r3 != 0) goto L_0x0024
            boolean r3 = r18.z()
            if (r3 == 0) goto L_0x0024
            boolean r3 = k(r18)
            if (r3 == 0) goto L_0x0024
            sj0 r3 = new sj0
            r4 = 0
            r3.<init>(r4)
            gf3.V(r0, r1, r3)
        L_0x0024:
            r3 = 2
            me3 r3 = r0.i(r3)
            r4 = 4
            me3 r4 = r0.i(r4)
            int r5 = r3.d()
            int r6 = r4.d()
            java.util.HashSet r7 = r3.a
            r9 = 0
            if (r7 == 0) goto L_0x0103
            boolean r3 = r3.c
            if (r3 == 0) goto L_0x0103
            java.util.Iterator r3 = r7.iterator()
        L_0x0043:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x0103
            java.lang.Object r7 = r3.next()
            me3 r7 = (me3) r7
            ff3 r13 = r7.d
            int r14 = r17 + 1
            boolean r15 = k(r13)
            boolean r16 = r13.z()
            if (r16 == 0) goto L_0x0068
            if (r15 == 0) goto L_0x0068
            sj0 r8 = new sj0
            r10 = 0
            r8.<init>(r10)
            gf3.V(r13, r1, r8)
        L_0x0068:
            me3 r8 = r13.I
            me3 r10 = r13.K
            if (r7 != r8) goto L_0x0076
            me3 r11 = r10.f
            if (r11 == 0) goto L_0x0076
            boolean r11 = r11.c
            if (r11 != 0) goto L_0x0080
        L_0x0076:
            if (r7 != r10) goto L_0x0082
            me3 r11 = r8.f
            if (r11 == 0) goto L_0x0082
            boolean r11 = r11.c
            if (r11 == 0) goto L_0x0082
        L_0x0080:
            r11 = 1
            goto L_0x0083
        L_0x0082:
            r11 = r9
        L_0x0083:
            int[] r12 = r13.p0
            r12 = r12[r9]
            r9 = 3
            if (r12 != r9) goto L_0x00be
            if (r15 == 0) goto L_0x008d
            goto L_0x00be
        L_0x008d:
            if (r12 != r9) goto L_0x00c4
            int r7 = r13.v
            if (r7 < 0) goto L_0x00c4
            int r7 = r13.u
            if (r7 < 0) goto L_0x00c4
            int r7 = r13.g0
            r8 = 8
            if (r7 == r8) goto L_0x00a8
            int r7 = r13.r
            if (r7 != 0) goto L_0x00c4
            float r7 = r13.W
            r8 = 0
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x00c4
        L_0x00a8:
            boolean r7 = r13.x()
            if (r7 != 0) goto L_0x00c4
            boolean r7 = r13.F
            if (r7 != 0) goto L_0x00c4
            if (r11 == 0) goto L_0x00c4
            boolean r7 = r13.x()
            if (r7 != 0) goto L_0x00c4
            W(r14, r0, r1, r13, r2)
            goto L_0x00c4
        L_0x00be:
            boolean r9 = r13.z()
            if (r9 == 0) goto L_0x00c7
        L_0x00c4:
            r9 = 0
            goto L_0x0043
        L_0x00c7:
            if (r7 != r8) goto L_0x00de
            me3 r9 = r10.f
            if (r9 != 0) goto L_0x00de
            int r7 = r8.e()
            int r7 = r7 + r5
            int r8 = r13.q()
            int r8 = r8 + r7
            r13.J(r7, r8)
            H(r14, r13, r1, r2)
            goto L_0x00c4
        L_0x00de:
            if (r7 != r10) goto L_0x00f7
            me3 r7 = r8.f
            if (r7 != 0) goto L_0x00f7
            int r7 = r10.e()
            int r7 = r5 - r7
            int r8 = r13.q()
            int r8 = r7 - r8
            r13.J(r8, r7)
            H(r14, r13, r1, r2)
            goto L_0x00c4
        L_0x00f7:
            if (r11 == 0) goto L_0x00c4
            boolean r7 = r13.x()
            if (r7 != 0) goto L_0x00c4
            V(r14, r13, r1, r2)
            goto L_0x00c4
        L_0x0103:
            boolean r3 = r0 instanceof bd6
            if (r3 == 0) goto L_0x0108
            return
        L_0x0108:
            java.util.HashSet r3 = r4.a
            if (r3 == 0) goto L_0x01e3
            boolean r4 = r4.c
            if (r4 == 0) goto L_0x01e3
            java.util.Iterator r3 = r3.iterator()
        L_0x0114:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x01e3
            java.lang.Object r4 = r3.next()
            me3 r4 = (me3) r4
            ff3 r5 = r4.d
            r7 = 1
            int r8 = r17 + 1
            boolean r7 = k(r5)
            boolean r9 = r5.z()
            if (r9 == 0) goto L_0x013a
            if (r7 == 0) goto L_0x013a
            sj0 r9 = new sj0
            r10 = 0
            r9.<init>(r10)
            gf3.V(r5, r1, r9)
        L_0x013a:
            me3 r9 = r5.I
            me3 r10 = r5.K
            if (r4 != r9) goto L_0x0148
            me3 r11 = r10.f
            if (r11 == 0) goto L_0x0148
            boolean r11 = r11.c
            if (r11 != 0) goto L_0x0152
        L_0x0148:
            if (r4 != r10) goto L_0x0154
            me3 r11 = r9.f
            if (r11 == 0) goto L_0x0154
            boolean r11 = r11.c
            if (r11 == 0) goto L_0x0154
        L_0x0152:
            r11 = 1
            goto L_0x0155
        L_0x0154:
            r11 = 0
        L_0x0155:
            int[] r12 = r5.p0
            r13 = 0
            r12 = r12[r13]
            r14 = 3
            if (r12 != r14) goto L_0x015f
            if (r7 == 0) goto L_0x0163
        L_0x015f:
            r7 = 8
            r12 = 0
            goto L_0x019c
        L_0x0163:
            if (r12 != r14) goto L_0x0199
            int r4 = r5.v
            if (r4 < 0) goto L_0x0199
            int r4 = r5.u
            if (r4 < 0) goto L_0x0199
            int r4 = r5.g0
            r7 = 8
            if (r4 == r7) goto L_0x0181
            int r4 = r5.r
            if (r4 != 0) goto L_0x017f
            float r4 = r5.W
            r12 = 0
            int r4 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r4 != 0) goto L_0x0114
            goto L_0x0182
        L_0x017f:
            r12 = 0
            goto L_0x0114
        L_0x0181:
            r12 = 0
        L_0x0182:
            boolean r4 = r5.x()
            if (r4 != 0) goto L_0x0114
            boolean r4 = r5.F
            if (r4 != 0) goto L_0x0114
            if (r11 == 0) goto L_0x0114
            boolean r4 = r5.x()
            if (r4 != 0) goto L_0x0114
            W(r8, r0, r1, r5, r2)
            goto L_0x0114
        L_0x0199:
            r7 = 8
            goto L_0x017f
        L_0x019c:
            boolean r15 = r5.z()
            if (r15 == 0) goto L_0x01a4
            goto L_0x0114
        L_0x01a4:
            if (r4 != r9) goto L_0x01bc
            me3 r15 = r10.f
            if (r15 != 0) goto L_0x01bc
            int r4 = r9.e()
            int r4 = r4 + r6
            int r9 = r5.q()
            int r9 = r9 + r4
            r5.J(r4, r9)
            H(r8, r5, r1, r2)
            goto L_0x0114
        L_0x01bc:
            if (r4 != r10) goto L_0x01d6
            me3 r4 = r9.f
            if (r4 != 0) goto L_0x01d6
            int r4 = r10.e()
            int r4 = r6 - r4
            int r9 = r5.q()
            int r9 = r4 - r9
            r5.J(r9, r4)
            H(r8, r5, r1, r2)
            goto L_0x0114
        L_0x01d6:
            if (r11 == 0) goto L_0x0114
            boolean r4 = r5.x()
            if (r4 != 0) goto L_0x0114
            V(r8, r5, r1, r2)
            goto L_0x0114
        L_0x01e3:
            r1 = 1
            r0.m = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ek8.H(int, ff3, ghb, boolean):void");
    }

    public static final void I(ViewStub viewStub, View view, s16 s16) {
        if (!K(viewStub)) {
            ViewGroup viewGroup = (ViewGroup) viewStub.getParent();
            int indexOfChild = viewGroup.indexOfChild(viewStub);
            viewGroup.removeViewInLayout(viewStub);
            ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
            layoutParams.height = view.getLayoutParams().height;
            layoutParams.width = view.getLayoutParams().width;
            view.setId(viewStub.getId());
            viewGroup.addView(view, indexOfChild, layoutParams);
            if (s16 != null) {
                s16.invoke();
            }
        }
    }

    public static boolean J(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    public static final boolean K(ViewStub viewStub) {
        return viewStub.getParent() == null;
    }

    public static final boolean L(t97 t97) {
        return t97.a() && ((View) t97.getValue()).getVisibility() == 0;
    }

    public static ArrayList M(Collection collection, j26 j26) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object apply : collection) {
            try {
                arrayList.add(j26.apply(apply));
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        return arrayList;
    }

    public static xu5[] N(ArrayList arrayList) {
        int size = arrayList.size();
        xu5[] xu5Arr = new xu5[size];
        int i = 0;
        while (i < size) {
            xu5 xu5 = ((n58) arrayList.get(i)).a;
            if (xu5 != null) {
                xu5Arr[i] = xu5;
                i++;
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        return xu5Arr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005e, code lost:
        if (r8 == -1) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static n69 Q(java.lang.String r20) {
        /*
            r0 = 1
            org.xmlpull.v1.XmlPullParserFactory r1 = org.xmlpull.v1.XmlPullParserFactory.newInstance()
            org.xmlpull.v1.XmlPullParser r1 = r1.newPullParser()
            java.io.StringReader r2 = new java.io.StringReader
            r3 = r20
            r2.<init>(r3)
            r1.setInput(r2)
            r1.next()
            java.lang.String r2 = "x:xmpmeta"
            boolean r3 = n06.v(r1, r2)
            r4 = 0
            if (r3 == 0) goto L_0x00cd
            po5 r3 = ws6.b
            e8c r3 = e8c.X
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r5
        L_0x0029:
            r1.next()
            java.lang.String r9 = "rdf:Description"
            boolean r9 = n06.v(r1, r9)
            if (r9 == 0) goto L_0x0099
            java.lang.String[] r3 = x0
            r7 = 0
            r8 = r7
        L_0x0038:
            r9 = 4
            if (r8 >= r9) goto L_0x0098
            r10 = r3[r8]
            java.lang.String r10 = n06.n(r1, r10)
            if (r10 == 0) goto L_0x0096
            int r3 = java.lang.Integer.parseInt(r10)
            if (r3 != r0) goto L_0x0098
            java.lang.String[] r3 = y0
            r8 = r7
        L_0x004c:
            if (r8 >= r9) goto L_0x0063
            r10 = r3[r8]
            java.lang.String r10 = n06.n(r1, r10)
            if (r10 == 0) goto L_0x0061
            long r8 = java.lang.Long.parseLong(r10)
            r10 = -1
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x0064
            goto L_0x0063
        L_0x0061:
            int r8 = r8 + r0
            goto L_0x004c
        L_0x0063:
            r8 = r5
        L_0x0064:
            java.lang.String[] r3 = z0
        L_0x0066:
            r10 = 2
            if (r7 >= r10) goto L_0x0090
            r10 = r3[r7]
            java.lang.String r10 = n06.n(r1, r10)
            if (r10 == 0) goto L_0x008e
            long r12 = java.lang.Long.parseLong(r10)
            l69 r3 = new l69
            r15 = 0
            r18 = 0
            java.lang.String r17 = "image/jpeg"
            r14 = r3
            r14.<init>(r15, r17, r18)
            l69 r7 = new l69
            java.lang.String r14 = "video/mp4"
            r11 = r7
            r11.<init>(r12, r14, r15)
            e8c r3 = ws6.o(r3, r7)
            goto L_0x0094
        L_0x008e:
            int r7 = r7 + r0
            goto L_0x0066
        L_0x0090:
            po5 r3 = ws6.b
            e8c r3 = e8c.X
        L_0x0094:
            r7 = r8
            goto L_0x00ba
        L_0x0096:
            int r8 = r8 + r0
            goto L_0x0038
        L_0x0098:
            return r4
        L_0x0099:
            java.lang.String r9 = "Container:Directory"
            boolean r9 = n06.v(r1, r9)
            if (r9 == 0) goto L_0x00aa
            java.lang.String r3 = "Container"
            java.lang.String r9 = "Item"
            e8c r3 = S(r1, r3, r9)
            goto L_0x00ba
        L_0x00aa:
            java.lang.String r9 = "GContainer:Directory"
            boolean r9 = n06.v(r1, r9)
            if (r9 == 0) goto L_0x00ba
            java.lang.String r3 = "GContainer"
            java.lang.String r9 = "GContainerItem"
            e8c r3 = S(r1, r3, r9)
        L_0x00ba:
            boolean r9 = n06.t(r1, r2)
            if (r9 == 0) goto L_0x0029
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x00c7
            return r4
        L_0x00c7:
            n69 r0 = new n69
            r0.<init>(r7, r3)
            return r0
        L_0x00cd:
            java.lang.String r0 = "Couldn't find xmp metadata"
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r4, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ek8.Q(java.lang.String):n69");
    }

    public static e8c S(XmlPullParser xmlPullParser, String str, String str2) {
        ts6 i = ws6.i();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (n06.v(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String n = n06.n(xmlPullParser, concat3);
                String n2 = n06.n(xmlPullParser, concat4);
                String n3 = n06.n(xmlPullParser, concat5);
                String n4 = n06.n(xmlPullParser, concat6);
                if (n == null || n2 == null) {
                    return e8c.X;
                }
                i.a(new l69(n3 != null ? Long.parseLong(n3) : 0, n, n4 != null ? Long.parseLong(n4) : 0));
            }
        } while (!n06.t(xmlPullParser, concat2));
        return i.j();
    }

    public static final void T(View view, Runnable runnable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            runnable.run();
            return;
        }
        Handler handler = view.getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(runnable);
        } else {
            view.post(runnable);
        }
    }

    public static void U(List list) {
        if (!list.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(list);
            list.clear();
            list.addAll(linkedHashSet);
        }
    }

    public static void V(int i, ff3 ff3, ghb ghb, boolean z) {
        float f = ff3.d0;
        me3 me3 = ff3.I;
        int d = me3.f.d();
        me3 me32 = ff3.K;
        int d2 = me32.f.d();
        int e = me3.e() + d;
        int e2 = d2 - me32.e();
        if (d == d2) {
            f = 0.5f;
        } else {
            d = e;
            d2 = e2;
        }
        int q = ff3.q();
        int i2 = (d2 - d) - q;
        if (d > d2) {
            i2 = (d - d2) - q;
        }
        int i3 = ((int) (i2 > 0 ? (f * ((float) i2)) + 0.5f : f * ((float) i2))) + d;
        int i4 = i3 + q;
        if (d > d2) {
            i4 = i3 - q;
        }
        ff3.J(i3, i4);
        H(i + 1, ff3, ghb, z);
    }

    public static void W(int i, ff3 ff3, ghb ghb, ff3 ff32, boolean z) {
        float f = ff32.d0;
        me3 me3 = ff32.I;
        int e = me3.e() + me3.f.d();
        me3 me32 = ff32.K;
        int d = me32.f.d() - me32.e();
        if (d >= e) {
            int q = ff32.q();
            if (ff32.g0 != 8) {
                int i2 = ff32.r;
                if (i2 == 2) {
                    q = (int) (ff32.d0 * 0.5f * ((float) (ff3 instanceof gf3 ? ff3.q() : ff3.T.q())));
                } else if (i2 == 0) {
                    q = d - e;
                }
                q = Math.max(ff32.u, q);
                int i3 = ff32.v;
                if (i3 > 0) {
                    q = Math.min(i3, q);
                }
            }
            int i4 = e + ((int) ((f * ((float) ((d - e) - q))) + 0.5f));
            ff32.J(i4, q + i4);
            H(i + 1, ff32, ghb, z);
        }
    }

    public static void X(int i, ff3 ff3, ghb ghb) {
        float f = ff3.e0;
        me3 me3 = ff3.J;
        int d = me3.f.d();
        me3 me32 = ff3.L;
        int d2 = me32.f.d();
        int e = me3.e() + d;
        int e2 = d2 - me32.e();
        if (d == d2) {
            f = 0.5f;
        } else {
            d = e;
            d2 = e2;
        }
        int k = ff3.k();
        int i2 = (d2 - d) - k;
        if (d > d2) {
            i2 = (d - d2) - k;
        }
        int i3 = (int) (i2 > 0 ? (f * ((float) i2)) + 0.5f : f * ((float) i2));
        int i4 = d + i3;
        int i5 = i4 + k;
        if (d > d2) {
            i4 = d - i3;
            i5 = i4 - k;
        }
        ff3.K(i4, i5);
        f0(i + 1, ff3, ghb);
    }

    public static void Y(int i, ff3 ff3, ghb ghb, ff3 ff32) {
        float f = ff32.e0;
        me3 me3 = ff32.J;
        int e = me3.e() + me3.f.d();
        me3 me32 = ff32.L;
        int d = me32.f.d() - me32.e();
        if (d >= e) {
            int k = ff32.k();
            if (ff32.g0 != 8) {
                int i2 = ff32.s;
                if (i2 == 2) {
                    k = (int) (f * 0.5f * ((float) (ff3 instanceof gf3 ? ff3.k() : ff3.T.k())));
                } else if (i2 == 0) {
                    k = d - e;
                }
                k = Math.max(ff32.x, k);
                int i3 = ff32.y;
                if (i3 > 0) {
                    k = Math.min(i3, k);
                }
            }
            int i4 = e + ((int) ((f * ((float) ((d - e) - k))) + 0.5f));
            ff32.K(i4, k + i4);
            f0(i + 1, ff32, ghb);
        }
    }

    public static ArrayList Z(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        arrayList.addAll(collection);
        ArrayList arrayList2 = new ArrayList();
        if (arrayList.size() <= 0 || arrayList.size() > 1000) {
            while (arrayList.size() != 0) {
                List subList = arrayList.subList(0, arrayList.size() <= 1000 ? arrayList.size() : 1000);
                ArrayList arrayList3 = new ArrayList(subList.size());
                arrayList3.addAll(subList);
                subList.clear();
                arrayList2.add(arrayList3);
            }
        } else {
            arrayList2.add(arrayList);
        }
        return arrayList2;
    }

    public static void a0(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static final void b(int i, String str) {
        if (i < 0) {
            throw new RuntimeException(wn6.i("Unable to locate '", str, "' in program"));
        }
    }

    public static final long b0(long j) {
        int i = zp4.o;
        boolean z = j > 0;
        if (z) {
            return zp4.e(zp4.h(j, mt0.Q(999999, eq4.b)));
        }
        if (!z) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void c(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            iu7.f(16);
            throw new RuntimeException(me4.i(str, ": glError 0x", d8.F(16, ((long) glGetError) & 4294967295L)));
        }
    }

    public static boolean c0(nv9 nv9, bw9 bw9, j26 j26) {
        if (!(nv9 instanceof q3e)) {
            return false;
        }
        try {
            Object obj = ((q3e) nv9).get();
            if (obj == null) {
                cw4.a(bw9);
                return true;
            }
            try {
                Object apply = j26.apply(obj);
                Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
                q3e q3e = (nv9) apply;
                if (q3e instanceof q3e) {
                    try {
                        Object obj2 = q3e.get();
                        if (obj2 == null) {
                            cw4.a(bw9);
                            return true;
                        }
                        lv9 lv9 = new lv9(bw9, obj2);
                        bw9.d(lv9);
                        lv9.run();
                    } catch (Throwable th) {
                        a0(th);
                        cw4.b(th, bw9);
                        return true;
                    }
                } else {
                    q3e.a(bw9);
                }
                return true;
            } catch (Throwable th2) {
                a0(th2);
                cw4.b(th2, bw9);
                return true;
            }
        } catch (Throwable th3) {
            a0(th3);
            cw4.b(th3, bw9);
            return true;
        }
    }

    public static final void d(ViewGroup viewGroup, View view, Integer num) {
        if (view.getParent() == null) {
            viewGroup.addView(view, num != null ? num.intValue() : -1);
        }
    }

    public static final void d0(bve bve) {
        bve.c(z24.class, new lq9(25));
        bve.e(p8b.class, new n5b(3));
        bve.e(i5b.class, new y7b(0));
        Class<pf4> cls = pf4.class;
        bve.c(cls, new lq9(26));
        bve.c(cls, new lq9(27));
        bve.c(cls, new lq9(28));
        bve.c(cls, new lq9(29));
        bve.e(ia.class, new n5b(4));
    }

    public static final void e0(bve bve) {
        bve.c(pf4.class, new w8d(4));
    }

    public static boolean f(Iterable iterable, v1b v1b) {
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (Object test : iterable) {
            try {
                if (v1b.test(test)) {
                    return true;
                }
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006c, code lost:
        r10 = r15.f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0076, code lost:
        r10 = r9.f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void f0(int r16, ff3 r17, ghb r18) {
        /*
            r0 = r17
            r1 = r18
            boolean r2 = r0.n
            if (r2 == 0) goto L_0x0009
            return
        L_0x0009:
            boolean r2 = r0 instanceof gf3
            if (r2 != 0) goto L_0x0022
            boolean r2 = r17.z()
            if (r2 == 0) goto L_0x0022
            boolean r2 = k(r17)
            if (r2 == 0) goto L_0x0022
            sj0 r2 = new sj0
            r3 = 0
            r2.<init>(r3)
            gf3.V(r0, r1, r2)
        L_0x0022:
            r2 = 3
            me3 r3 = r0.i(r2)
            r4 = 5
            me3 r4 = r0.i(r4)
            int r5 = r3.d()
            int r6 = r4.d()
            java.util.HashSet r7 = r3.a
            r8 = 1
            if (r7 == 0) goto L_0x0102
            boolean r3 = r3.c
            if (r3 == 0) goto L_0x0102
            java.util.Iterator r3 = r7.iterator()
        L_0x0041:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x0102
            java.lang.Object r7 = r3.next()
            me3 r7 = (me3) r7
            ff3 r12 = r7.d
            int r13 = r16 + 1
            boolean r14 = k(r12)
            boolean r15 = r12.z()
            if (r15 == 0) goto L_0x0066
            if (r14 == 0) goto L_0x0066
            sj0 r15 = new sj0
            r9 = 0
            r15.<init>(r9)
            gf3.V(r12, r1, r15)
        L_0x0066:
            me3 r9 = r12.J
            me3 r15 = r12.L
            if (r7 != r9) goto L_0x0074
            me3 r10 = r15.f
            if (r10 == 0) goto L_0x0074
            boolean r10 = r10.c
            if (r10 != 0) goto L_0x007e
        L_0x0074:
            if (r7 != r15) goto L_0x0080
            me3 r10 = r9.f
            if (r10 == 0) goto L_0x0080
            boolean r10 = r10.c
            if (r10 == 0) goto L_0x0080
        L_0x007e:
            r10 = r8
            goto L_0x0081
        L_0x0080:
            r10 = 0
        L_0x0081:
            int[] r11 = r12.p0
            r11 = r11[r8]
            if (r11 != r2) goto L_0x00bb
            if (r14 == 0) goto L_0x008a
            goto L_0x00bb
        L_0x008a:
            if (r11 != r2) goto L_0x0041
            int r7 = r12.y
            if (r7 < 0) goto L_0x0041
            int r7 = r12.x
            if (r7 < 0) goto L_0x0041
            int r7 = r12.g0
            r9 = 8
            if (r7 == r9) goto L_0x00a5
            int r7 = r12.s
            if (r7 != 0) goto L_0x0041
            float r7 = r12.W
            r9 = 0
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L_0x0041
        L_0x00a5:
            boolean r7 = r12.y()
            if (r7 != 0) goto L_0x0041
            boolean r7 = r12.F
            if (r7 != 0) goto L_0x0041
            if (r10 == 0) goto L_0x0041
            boolean r7 = r12.y()
            if (r7 != 0) goto L_0x0041
            Y(r13, r0, r1, r12)
            goto L_0x0041
        L_0x00bb:
            boolean r11 = r12.z()
            if (r11 == 0) goto L_0x00c3
            goto L_0x0041
        L_0x00c3:
            if (r7 != r9) goto L_0x00db
            me3 r11 = r15.f
            if (r11 != 0) goto L_0x00db
            int r7 = r9.e()
            int r7 = r7 + r5
            int r9 = r12.k()
            int r9 = r9 + r7
            r12.K(r7, r9)
            f0(r13, r12, r1)
            goto L_0x0041
        L_0x00db:
            if (r7 != r15) goto L_0x00f5
            me3 r7 = r9.f
            if (r7 != 0) goto L_0x00f5
            int r7 = r15.e()
            int r7 = r5 - r7
            int r9 = r12.k()
            int r9 = r7 - r9
            r12.K(r9, r7)
            f0(r13, r12, r1)
            goto L_0x0041
        L_0x00f5:
            if (r10 == 0) goto L_0x0041
            boolean r7 = r12.y()
            if (r7 != 0) goto L_0x0041
            X(r13, r12, r1)
            goto L_0x0041
        L_0x0102:
            boolean r3 = r0 instanceof bd6
            if (r3 == 0) goto L_0x0107
            return
        L_0x0107:
            java.util.HashSet r3 = r4.a
            if (r3 == 0) goto L_0x01df
            boolean r4 = r4.c
            if (r4 == 0) goto L_0x01df
            java.util.Iterator r3 = r3.iterator()
        L_0x0113:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x01df
            java.lang.Object r4 = r3.next()
            me3 r4 = (me3) r4
            ff3 r5 = r4.d
            int r7 = r16 + 1
            boolean r9 = k(r5)
            boolean r10 = r5.z()
            if (r10 == 0) goto L_0x0138
            if (r9 == 0) goto L_0x0138
            sj0 r10 = new sj0
            r11 = 0
            r10.<init>(r11)
            gf3.V(r5, r1, r10)
        L_0x0138:
            me3 r10 = r5.J
            me3 r11 = r5.L
            if (r4 != r10) goto L_0x0146
            me3 r12 = r11.f
            if (r12 == 0) goto L_0x0146
            boolean r12 = r12.c
            if (r12 != 0) goto L_0x0150
        L_0x0146:
            if (r4 != r11) goto L_0x0152
            me3 r12 = r10.f
            if (r12 == 0) goto L_0x0152
            boolean r12 = r12.c
            if (r12 == 0) goto L_0x0152
        L_0x0150:
            r12 = r8
            goto L_0x0153
        L_0x0152:
            r12 = 0
        L_0x0153:
            int[] r13 = r5.p0
            r13 = r13[r8]
            if (r13 != r2) goto L_0x015b
            if (r9 == 0) goto L_0x015f
        L_0x015b:
            r9 = 8
            r13 = 0
            goto L_0x0198
        L_0x015f:
            if (r13 != r2) goto L_0x0195
            int r4 = r5.y
            if (r4 < 0) goto L_0x0195
            int r4 = r5.x
            if (r4 < 0) goto L_0x0195
            int r4 = r5.g0
            r9 = 8
            if (r4 == r9) goto L_0x017d
            int r4 = r5.s
            if (r4 != 0) goto L_0x017b
            float r4 = r5.W
            r13 = 0
            int r4 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r4 != 0) goto L_0x0113
            goto L_0x017e
        L_0x017b:
            r13 = 0
            goto L_0x0113
        L_0x017d:
            r13 = 0
        L_0x017e:
            boolean r4 = r5.y()
            if (r4 != 0) goto L_0x0113
            boolean r4 = r5.F
            if (r4 != 0) goto L_0x0113
            if (r12 == 0) goto L_0x0113
            boolean r4 = r5.y()
            if (r4 != 0) goto L_0x0113
            Y(r7, r0, r1, r5)
            goto L_0x0113
        L_0x0195:
            r9 = 8
            goto L_0x017b
        L_0x0198:
            boolean r14 = r5.z()
            if (r14 == 0) goto L_0x01a0
            goto L_0x0113
        L_0x01a0:
            if (r4 != r10) goto L_0x01b8
            me3 r14 = r11.f
            if (r14 != 0) goto L_0x01b8
            int r4 = r10.e()
            int r4 = r4 + r6
            int r10 = r5.k()
            int r10 = r10 + r4
            r5.K(r4, r10)
            f0(r7, r5, r1)
            goto L_0x0113
        L_0x01b8:
            if (r4 != r11) goto L_0x01d2
            me3 r4 = r10.f
            if (r4 != 0) goto L_0x01d2
            int r4 = r11.e()
            int r4 = r6 - r4
            int r10 = r5.k()
            int r10 = r4 - r10
            r5.K(r10, r4)
            f0(r7, r5, r1)
            goto L_0x0113
        L_0x01d2:
            if (r12 == 0) goto L_0x0113
            boolean r4 = r5.y()
            if (r4 != 0) goto L_0x0113
            X(r7, r5, r1)
            goto L_0x0113
        L_0x01df:
            r3 = 6
            me3 r3 = r0.i(r3)
            java.util.HashSet r4 = r3.a
            if (r4 == 0) goto L_0x0254
            boolean r4 = r3.c
            if (r4 == 0) goto L_0x0254
            int r4 = r3.d()
            java.util.HashSet r3 = r3.a
            java.util.Iterator r3 = r3.iterator()
        L_0x01f6:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0254
            java.lang.Object r5 = r3.next()
            me3 r5 = (me3) r5
            ff3 r6 = r5.d
            int r7 = r16 + 1
            boolean r9 = k(r6)
            boolean r10 = r6.z()
            if (r10 == 0) goto L_0x021b
            if (r9 == 0) goto L_0x021b
            sj0 r10 = new sj0
            r11 = 0
            r10.<init>(r11)
            gf3.V(r6, r1, r10)
        L_0x021b:
            int[] r10 = r6.p0
            r10 = r10[r8]
            if (r10 != r2) goto L_0x0223
            if (r9 == 0) goto L_0x01f6
        L_0x0223:
            boolean r9 = r6.z()
            if (r9 == 0) goto L_0x022a
            goto L_0x01f6
        L_0x022a:
            me3 r9 = r6.M
            if (r5 != r9) goto L_0x01f6
            int r5 = r5.e()
            int r5 = r5 + r4
            boolean r10 = r6.E
            if (r10 != 0) goto L_0x0238
            goto L_0x0250
        L_0x0238:
            int r10 = r6.a0
            int r10 = r5 - r10
            int r11 = r6.V
            int r11 = r11 + r10
            r6.Z = r10
            me3 r12 = r6.J
            r12.l(r10)
            me3 r10 = r6.L
            r10.l(r11)
            r9.l(r5)
            r6.l = r8
        L_0x0250:
            f0(r7, r6, r1)
            goto L_0x01f6
        L_0x0254:
            r0.n = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ek8.f0(int, ff3, ghb):void");
    }

    public static final void g(View view, sy6 sy6, u16 u16) {
        up0 up0 = sy6.b;
        int i = up0 != null ? up0.b : 0;
        int i2 = i == 0 ? -1 : uy6.$EnumSwitchMapping$0[hr1.t(i)];
        if (i2 == -1 || i2 == 1) {
            new rrd(view, sy6, u16);
        } else if (i2 == 2) {
            new hf(view, sy6, u16);
        } else if (i2 == 3) {
            new gf(view, sy6, 1, u16, 40);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public static void g0(Parcel parcel, int i, Bundle bundle) {
        if (bundle != null) {
            int n0 = n0(parcel, i);
            parcel.writeBundle(bundle);
            o0(parcel, n0);
        }
    }

    public static void h(View view) {
        g(view, new sy6(3, (up0) null, 2), (u16) null);
    }

    public static void h0(Parcel parcel, int i, Float f) {
        if (f != null) {
            p0(parcel, i, 4);
            parcel.writeFloat(f.floatValue());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void i(kotlin.coroutines.Continuation r4) {
        /*
            boolean r0 = r4 instanceof id4
            if (r0 == 0) goto L_0x0013
            r0 = r4
            id4 r0 = (id4) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x0018
        L_0x0013:
            id4 r0 = new id4
            r0.<init>(r4)
        L_0x0018:
            java.lang.Object r4 = r0.o
            pu3 r1 = pu3.a
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 == r3) goto L_0x002b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L_0x002b:
            wx3.H(r4)
            goto L_0x0047
        L_0x002f:
            wx3.H(r4)
            r0.X = r3
            zv1 r4 = new zv1
            kotlin.coroutines.Continuation r0 = urd.y(r0)
            r4.<init>(r3, r0)
            r4.n()
            java.lang.Object r4 = r4.m()
            if (r4 != r1) goto L_0x0047
            return
        L_0x0047:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ek8.i(kotlin.coroutines.Continuation):void");
    }

    public static void i0(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder != null) {
            int n0 = n0(parcel, i);
            parcel.writeStrongBinder(iBinder);
            o0(parcel, n0);
        }
    }

    public static final int j(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        c("glCreateShader type=" + i);
        GLES20.glShaderSource(glCreateShader, str);
        c("glShaderSource");
        GLES20.glCompileShader(glCreateShader);
        c("glCompileShader");
        int[] iArr = {1};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
        udd.s("j", "Could not compile shader " + i + ": " + glGetShaderInfoLog, (Throwable) null);
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public static void j0(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable != null) {
            int n0 = n0(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            o0(parcel, n0);
        }
    }

    public static boolean k(ff3 ff3) {
        int[] iArr = ff3.p0;
        int i = iArr[0];
        int i2 = iArr[1];
        gf3 gf3 = ff3.T;
        gf3 gf32 = gf3 != null ? gf3 : null;
        if (gf32 != null) {
            int i3 = gf32.p0[0];
        }
        if (gf32 != null) {
            int i4 = gf32.p0[1];
        }
        boolean z = i == 1 || ff3.A() || i == 2 || (i == 3 && ff3.r == 0 && ff3.W == 0.0f && ff3.t(0)) || (i == 3 && ff3.r == 1 && ff3.u(0, ff3.q()));
        boolean z2 = i2 == 1 || ff3.B() || i2 == 2 || (i2 == 3 && ff3.s == 0 && ff3.W == 0.0f && ff3.t(1)) || (i2 == 3 && ff3.s == 1 && ff3.u(1, ff3.k()));
        if (ff3.W <= 0.0f || (!z && !z2)) {
            return z && z2;
        }
        return true;
    }

    public static void k0(Parcel parcel, int i, String str) {
        if (str != null) {
            int n0 = n0(parcel, i);
            parcel.writeString(str);
            o0(parcel, n0);
        }
    }

    public static pq3 l(k22 k22) {
        switch (k22.ordinal()) {
            case 0:
                return new pq3(f2a.x, (mge) new hge(rhc.j), Integer.valueOf(phc.c), Integer.valueOf(j9a.G), 4);
            case 1:
                return new pq3(f2a.L, (mge) new hge(rhc.w), Integer.valueOf(phc.c), Integer.valueOf(j9a.G), 4);
            case 2:
                return new pq3(f2a.w, (mge) new hge(rhc.t), Integer.valueOf(phc.D1), Integer.valueOf(j9a.G), 4);
            case 3:
                return new pq3(f2a.K, (mge) new hge(rhc.u), Integer.valueOf(phc.B1), Integer.valueOf(j9a.G), 4);
            case 4:
                return new pq3(f2a.H, (mge) new hge(rhc.s), Integer.valueOf(phc.l1), Integer.valueOf(j9a.G), 4);
            case 5:
                return new pq3(f2a.G, (mge) new hge(rhc.r), Integer.valueOf(phc.l1), Integer.valueOf(j9a.G), 4);
            case 6:
                return new pq3(f2a.J, (mge) new hge(rhc.v), Integer.valueOf(phc.u1), Integer.valueOf(j9a.G), 4);
            case 7:
                return new pq3(f2a.P, (mge) new hge(rhc.B), Integer.valueOf(phc.v1), Integer.valueOf(j9a.G), 4);
            case 8:
                return new pq3(f2a.F, (mge) new hge(rhc.q), Integer.valueOf(j9a.J), Integer.valueOf(phc.C), Integer.valueOf(j9a.F));
            case 9:
                return new pq3(f2a.F, (mge) new hge(rhc.p), Integer.valueOf(j9a.J), Integer.valueOf(phc.C), Integer.valueOf(j9a.F));
            case 10:
                return new pq3(f2a.F, (mge) new hge(rhc.C), Integer.valueOf(j9a.J), Integer.valueOf(phc.C), Integer.valueOf(j9a.F));
            case 11:
                return new pq3(f2a.D, (mge) new hge(rhc.n), Integer.valueOf(j9a.J), Integer.valueOf(phc.x), Integer.valueOf(j9a.F));
            case Protos.Attaches.Attach.PRESENT /*12*/:
            case 13:
                return new pq3(f2a.E, (mge) new hge(rhc.o), Integer.valueOf(j9a.J), Integer.valueOf(phc.x), Integer.valueOf(j9a.F));
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new pq3(f2a.y, (mge) new hge(rhc.k), Integer.valueOf(j9a.J), Integer.valueOf(phc.T), Integer.valueOf(j9a.F));
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new pq3(f2a.M, (mge) new hge(rhc.y), Integer.valueOf(phc.l), Integer.valueOf(j9a.G), 4);
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK /*16*/:
                return new pq3(qhc.a, (mge) new hge(rhc.x), Integer.valueOf(phc.N0), Integer.valueOf(j9a.G), 4);
            case LangUtils.HASH_SEED /*17*/:
                return new pq3(f2a.z, (mge) new hge(rhc.l), Integer.valueOf(phc.C0), Integer.valueOf(j9a.G), 4);
            case 18:
                return new pq3(f2a.O, (mge) new hge(rhc.A), Integer.valueOf(j9a.J), Integer.valueOf(phc.o1), Integer.valueOf(j9a.F));
            case 19:
                return new pq3(f2a.N, (mge) new hge(rhc.z), Integer.valueOf(j9a.J), Integer.valueOf(phc.x), Integer.valueOf(j9a.F));
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /*20*/:
                return new pq3(f2a.A, (mge) new hge(rhc.m), Integer.valueOf(j9a.J), Integer.valueOf(phc.x), Integer.valueOf(j9a.F));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static void l0(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr != null) {
            int n0 = n0(parcel, i);
            parcel.writeInt(r0);
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    int dataPosition = parcel.dataPosition();
                    parcel.writeInt(1);
                    int dataPosition2 = parcel.dataPosition();
                    parcelable.writeToParcel(parcel, i2);
                    int dataPosition3 = parcel.dataPosition();
                    parcel.setDataPosition(dataPosition);
                    parcel.writeInt(dataPosition3 - dataPosition2);
                    parcel.setDataPosition(dataPosition3);
                }
            }
            o0(parcel, n0);
        }
    }

    public static ArrayList m(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (long valueOf : jArr) {
            arrayList.add(Long.valueOf(valueOf));
        }
        return arrayList;
    }

    public static void m0(Parcel parcel, List list, int i) {
        if (list != null) {
            int n0 = n0(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    int dataPosition = parcel.dataPosition();
                    parcel.writeInt(1);
                    int dataPosition2 = parcel.dataPosition();
                    parcelable.writeToParcel(parcel, 0);
                    int dataPosition3 = parcel.dataPosition();
                    parcel.setDataPosition(dataPosition);
                    parcel.writeInt(dataPosition3 - dataPosition2);
                    parcel.setDataPosition(dataPosition3);
                }
            }
            o0(parcel, n0);
        }
    }

    public static long[] n(List list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = ((Long) list.get(i)).longValue();
        }
        return jArr;
    }

    public static int n0(Parcel parcel, int i) {
        parcel.writeInt(i | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static nv4 o(f55 f55) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = f55.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (f55.s(i2, elapsedRealtime)) {
                i++;
            }
        }
        return new nv4(1, 0, length, i, 1);
    }

    public static void o0(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    public static boolean p(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i < str.length()) {
                    char charAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt != '(') {
                        if (charAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                            break;
                        }
                    } else {
                        i2++;
                    }
                    i++;
                    i3 = i4;
                } else if (i2 == 0) {
                    return hhd.f(h0e.B0(str.substring(1, str.length() - 1)).toString(), str2);
                }
            }
        }
        return false;
    }

    public static void p0(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    public static final Object q(long j, Continuation continuation) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        jue jue = jue.a;
        if (i <= 0) {
            return jue;
        }
        zv1 zv1 = new zv1(1, urd.y(continuation));
        zv1.n();
        if (j < Long.MAX_VALUE) {
            z(zv1.getContext()).scheduleResumeAfterDelay(j, zv1);
        }
        Object m = zv1.m();
        return m == pu3.a ? m : jue;
    }

    public static final Object r(long j, Continuation continuation) {
        Object q = q(b0(j), continuation);
        return q == pu3.a ? q : jue.a;
    }

    public static List s(Iterable iterable, v1b v1b) {
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            try {
                if (v1b.test(next)) {
                    arrayList.add(next);
                }
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        return arrayList;
    }

    public static final View t(View view, int i) {
        if (view.getId() == i) {
            return view;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                View view2 = (View) parent;
                if (view2.getId() == i) {
                    return view2;
                }
            }
        }
        return null;
    }

    public static Object u(Iterable iterable) {
        if (iterable == null) {
            return null;
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Application w() {
        Application application = ApplicationProvider.a;
        if (application != null) {
            return application;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public static final Integer x(View view) {
        Insets e;
        if (Build.VERSION.SDK_INT >= 30) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null || (e = rootWindowInsets.getInsets(8)) == null) {
                return null;
            }
            return Integer.valueOf(e.bottom);
        }
        WindowInsets rootWindowInsets2 = view.getRootWindowInsets();
        if (rootWindowInsets2 != null) {
            return Integer.valueOf(rootWindowInsets2.getSystemWindowInsetBottom());
        }
        return null;
    }

    public static final hd4 z(hu3 hu3) {
        hd4 hd4 = hu3.get(cqc.c);
        hd4 hd42 = hd4 instanceof hd4 ? hd4 : null;
        return hd42 == null ? p74.a : hd42;
    }

    public abstract View O(int i);

    public abstract boolean P();
}
