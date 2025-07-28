package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import org.apache.http.HttpHost;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: smc  reason: default package */
public final class smc implements j26, dld, i13, s1e, i75, x89, nbc, dg9 {
    public static final smc X = new smc(3);
    public static final smc Y = new smc(4);
    public static final smc Z = new smc(5);
    public static final smc b = new smc(1);
    public static final smc c = new smc(2);
    public static final smc o = new smc(3);
    public static smc w0;
    public final /* synthetic */ int a;

    public /* synthetic */ smc(int i) {
        this.a = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: wr0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: wr0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: wr0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: wr0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: wr0} */
    /* JADX WARNING: type inference failed for: r10v1, types: [wr0, java.lang.Object] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r17, int r18, int r19, java.lang.String r20, boolean r21, boolean r22, boolean r23, boolean r24, int r25) {
        /*
            r0 = r17
            r1 = r20
            r2 = r25 & 1
            r3 = 0
            if (r2 == 0) goto L_0x000b
            r2 = r3
            goto L_0x000d
        L_0x000b:
            r2 = r18
        L_0x000d:
            r4 = r25 & 2
            if (r4 == 0) goto L_0x0016
            int r4 = r17.length()
            goto L_0x0018
        L_0x0016:
            r4 = r19
        L_0x0018:
            r5 = r25 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r3
            goto L_0x0020
        L_0x001e:
            r5 = r21
        L_0x0020:
            r6 = r25 & 16
            if (r6 == 0) goto L_0x0026
            r6 = r3
            goto L_0x0028
        L_0x0026:
            r6 = r22
        L_0x0028:
            r7 = r25 & 32
            if (r7 == 0) goto L_0x002e
            r7 = r3
            goto L_0x0030
        L_0x002e:
            r7 = r23
        L_0x0030:
            r8 = r25 & 64
            if (r8 == 0) goto L_0x0036
            r8 = r3
            goto L_0x0038
        L_0x0036:
            r8 = r24
        L_0x0038:
            r9 = r2
        L_0x0039:
            if (r9 >= r4) goto L_0x0112
            int r10 = r0.codePointAt(r9)
            r11 = 32
            r12 = 128(0x80, float:1.794E-43)
            r13 = 43
            r14 = 37
            r15 = 127(0x7f, float:1.78E-43)
            if (r10 < r11) goto L_0x006f
            if (r10 == r15) goto L_0x006f
            if (r10 < r12) goto L_0x0051
            if (r8 == 0) goto L_0x006f
        L_0x0051:
            char r12 = (char) r10
            boolean r12 = h0e.S(r1, r12)
            if (r12 != 0) goto L_0x006f
            if (r10 != r14) goto L_0x0064
            if (r5 == 0) goto L_0x006f
            if (r6 == 0) goto L_0x0064
            boolean r12 = k(r9, r4, r0)
            if (r12 == 0) goto L_0x006f
        L_0x0064:
            if (r10 != r13) goto L_0x0069
            if (r7 == 0) goto L_0x0069
            goto L_0x006f
        L_0x0069:
            int r10 = java.lang.Character.charCount(r10)
            int r9 = r9 + r10
            goto L_0x0039
        L_0x006f:
            wr0 r10 = new wr0
            r10.<init>()
            r10.z0(r2, r9, r0)
            r2 = 0
        L_0x0078:
            if (r9 >= r4) goto L_0x010d
            int r12 = r0.codePointAt(r9)
            if (r5 == 0) goto L_0x0094
            r14 = 9
            if (r12 == r14) goto L_0x0091
            r14 = 10
            if (r12 == r14) goto L_0x0091
            r14 = 12
            if (r12 == r14) goto L_0x0091
            r14 = 13
            if (r12 == r14) goto L_0x0091
            goto L_0x0094
        L_0x0091:
            r13 = 128(0x80, float:1.794E-43)
            goto L_0x00ca
        L_0x0094:
            if (r12 != r13) goto L_0x00a7
            if (r7 == 0) goto L_0x00a7
            if (r5 == 0) goto L_0x009d
            java.lang.String r14 = "+"
            goto L_0x009f
        L_0x009d:
            java.lang.String r14 = "%2B"
        L_0x009f:
            int r13 = r14.length()
            r10.z0(r3, r13, r14)
            goto L_0x0091
        L_0x00a7:
            if (r12 < r11) goto L_0x00cd
            if (r12 == r15) goto L_0x00cd
            r13 = 128(0x80, float:1.794E-43)
            if (r12 < r13) goto L_0x00b1
            if (r8 == 0) goto L_0x00cf
        L_0x00b1:
            char r14 = (char) r12
            boolean r14 = h0e.S(r1, r14)
            if (r14 != 0) goto L_0x00cf
            r14 = 37
            if (r12 != r14) goto L_0x00c7
            if (r5 == 0) goto L_0x00cf
            if (r6 == 0) goto L_0x00c7
            boolean r14 = k(r9, r4, r0)
            if (r14 != 0) goto L_0x00c7
            goto L_0x00cf
        L_0x00c7:
            r10.B0(r12)
        L_0x00ca:
            r11 = 37
            goto L_0x0100
        L_0x00cd:
            r13 = 128(0x80, float:1.794E-43)
        L_0x00cf:
            if (r2 != 0) goto L_0x00d6
            wr0 r2 = new wr0
            r2.<init>()
        L_0x00d6:
            r2.B0(r12)
        L_0x00d9:
            boolean r14 = r2.B()
            if (r14 != 0) goto L_0x00ca
            byte r14 = r2.readByte()
            r3 = r14 & 255(0xff, float:3.57E-43)
            r11 = 37
            r10.u0(r11)
            char[] r16 = sm6.j
            int r3 = r3 >> 4
            r3 = r3 & 15
            char r3 = r16[r3]
            r10.u0(r3)
            r3 = r14 & 15
            char r3 = r16[r3]
            r10.u0(r3)
            r3 = 0
            r11 = 32
            goto L_0x00d9
        L_0x0100:
            int r3 = java.lang.Character.charCount(r12)
            int r9 = r9 + r3
            r14 = r11
            r3 = 0
            r11 = 32
            r13 = 43
            goto L_0x0078
        L_0x010d:
            java.lang.String r0 = r10.p0()
            goto L_0x0116
        L_0x0112:
            java.lang.String r0 = r0.substring(r2, r4)
        L_0x0116:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.smc.a(java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, int):java.lang.String");
    }

    public static LinearLayout h(Context context, Collection collection, u16 u16) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            pq3 pq3 = (pq3) it.next();
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setOnClickListener(new ub((Object) u16, 23, (Object) pq3));
            Integer num = pq3.d;
            s59 s59 = km4.y0;
            if (num != null) {
                int intValue = num.intValue();
                ImageView imageView = new ImageView(frameLayout.getContext());
                imageView.setImageResource(intValue);
                Integer num2 = pq3.e;
                if (num2 != null) {
                    imageView.setImageTintList(ColorStateList.valueOf(s59.r(imageView).i(num2.intValue())));
                }
                float f = (float) 24;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
                layoutParams.gravity = 8388627;
                layoutParams.setMarginStart(a24.X(((float) 4) * dh4.c().getDisplayMetrics().density));
                frameLayout.addView(imageView, layoutParams);
                urd.B(new c3(pq3, imageView, (Continuation) null, 10), frameLayout);
            }
            TextView textView = new TextView(frameLayout.getContext());
            nte.k.b(textView, yq4.b);
            textView.setSingleLine();
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setTextColor(s59.r(textView).getText().e);
            textView.setText(pq3.b.a(textView.getContext()));
            Integer num3 = pq3.c;
            if (num3 != null) {
                textView.setTextColor(s59.r(textView).i(num3.intValue()));
            }
            urd.B(new z9((Object) pq3, (Continuation) null, 8, false), textView);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 8388627;
            layoutParams2.setMarginStart(a24.X((pq3.d != null ? (float) 44 : (float) 4) * dh4.c().getDisplayMetrics().density));
            layoutParams2.setMarginEnd(a24.X(((float) 4) * dh4.c().getDisplayMetrics().density));
            float f2 = (float) 12;
            layoutParams2.topMargin = a24.X(dh4.c().getDisplayMetrics().density * f2);
            layoutParams2.bottomMargin = a24.X(f2 * dh4.c().getDisplayMetrics().density);
            frameLayout.addView(textView, layoutParams2);
            linearLayout.addView(frameLayout, -1, -2);
        }
        return linearLayout;
    }

    public static int i(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 3213448) {
            if (hashCode == 99617003 && str.equals("https")) {
                return 443;
            }
        } else if (str.equals(HttpHost.DEFAULT_SCHEME_NAME)) {
            return 80;
        }
        return -1;
    }

    public static smc j() {
        if (w0 == null) {
            w0 = new smc(16);
        }
        return w0;
    }

    public static boolean k(int i, int i2, String str) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && nze.q(str.charAt(i + 1)) != -1 && nze.q(str.charAt(i3)) != -1;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [wr0, java.lang.Object] */
    public static String l(int i, String str, int i2, int i3, boolean z) {
        int i4;
        int i5;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        int i6 = i;
        while (i4 < i2) {
            char charAt = str.charAt(i4);
            if (charAt == '%' || (charAt == '+' && z)) {
                ? obj = new Object();
                obj.z0(i, i4, str);
                while (i4 < i2) {
                    int codePointAt = str.codePointAt(i4);
                    if (codePointAt == 37 && (i5 = i4 + 2) < i2) {
                        int q = nze.q(str.charAt(i4 + 1));
                        int q2 = nze.q(str.charAt(i5));
                        if (!(q == -1 || q2 == -1)) {
                            obj.u0((q << 4) + q2);
                            i4 = Character.charCount(codePointAt) + i5;
                        }
                    } else if (codePointAt == 43 && z) {
                        obj.u0(32);
                        i4++;
                    }
                    obj.B0(codePointAt);
                    i4 += Character.charCount(codePointAt);
                }
                return obj.p0();
            }
            i6 = i4 + 1;
        }
        return str.substring(i, i2);
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [xz6] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m(android.content.Context r2, android.net.Uri r3, defpackage.fca r4, defpackage.uy1 r5, int r6) {
        /*
            int r0 = one.me.android.MainActivity.e1
            r0 = r6 & 2
            r1 = 0
            if (r0 == 0) goto L_0x0008
            r3 = r1
        L_0x0008:
            r0 = r6 & 4
            if (r0 == 0) goto L_0x000d
            r4 = r1
        L_0x000d:
            r6 = r6 & 8
            if (r6 == 0) goto L_0x0018
            xz6 r5 = new xz6
            r6 = 9
            r5.<init>(r6)
        L_0x0018:
            android.content.Intent r6 = new android.content.Intent
            java.lang.Class<one.me.android.MainActivity> r0 = one.me.android.MainActivity.class
            r6.<init>(r2, r0)
            if (r3 == 0) goto L_0x0022
            r1 = r3
        L_0x0022:
            java.lang.String r3 = "deep_link"
            r6.putExtra(r3, r1)
            java.lang.String r3 = "snackbar"
            r6.putExtra(r3, r4)
            r5.invoke(r6)
            r2.startActivity(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.smc.m(android.content.Context, android.net.Uri, fca, uy1, int):void");
    }

    public static ArrayList n(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int Z2 = h0e.Z(str, '&', i, false, 4);
            if (Z2 == -1) {
                Z2 = str.length();
            }
            int Z3 = h0e.Z(str, '=', i, false, 4);
            if (Z3 == -1 || Z3 > Z2) {
                arrayList.add(str.substring(i, Z2));
                arrayList.add((Object) null);
            } else {
                arrayList.add(str.substring(i, Z3));
                arrayList.add(str.substring(Z3 + 1, Z2));
            }
            i = Z2 + 1;
        }
        return arrayList;
    }

    public static uxb o(int i) {
        Object obj;
        pz4 pz4 = uxb.D0;
        pz4.getClass();
        u1 u1Var = new u1(0, pz4);
        while (true) {
            if (!u1Var.hasNext()) {
                obj = null;
                break;
            }
            obj = u1Var.next();
            if (((uxb) obj).ordinal() == i) {
                break;
            }
        }
        return (uxb) obj;
    }

    public bpe B(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    public void M(vtc vtc) {
        throw new UnsupportedOperationException();
    }

    public Object apply(Object obj) {
        f3f a2;
        switch (this.a) {
            case 1:
                qmc qmc = (qmc) obj;
                return ((nbe) ((mbe) y93.g.getValue())).a();
            default:
                hm4 hm4 = (hm4) obj;
                zl4 zl4 = hm4.a;
                yl4 yl4 = new yl4(zl4.a, zl4.b);
                l10 l10 = hm4.e;
                if (l10 == null) {
                    a2 = null;
                } else {
                    l10 l102 = new l10(1);
                    l102.a = l10.a;
                    l102.c = l10.c;
                    l102.b = l10.b;
                    l102.d = l10.d;
                    a2 = l102.a();
                }
                f3f f3f = a2;
                return new fm4(yl4, hm4.b, hm4.c, hm4.d, f3f);
        }
    }

    public boolean b(xu5 xu5) {
        String str = xu5.n;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    public boolean c(String str) {
        System.loadLibrary(str);
        return true;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [kv2, u1e, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public u1e d(xu5 r13) {
        /*
            r12 = this;
            r12 = 1
            r0 = 0
            r1 = -1
            java.lang.String r2 = r13.n
            if (r2 == 0) goto L_0x0123
            java.util.List r13 = r13.q
            int r3 = r2.hashCode()
            switch(r3) {
                case -1351681404: goto L_0x0060;
                case -1248334819: goto L_0x0055;
                case -1026075066: goto L_0x004a;
                case -1004728940: goto L_0x003f;
                case 691401887: goto L_0x0034;
                case 822864842: goto L_0x0029;
                case 1668750253: goto L_0x001e;
                case 1693976202: goto L_0x0013;
                default: goto L_0x0010;
            }
        L_0x0010:
            r3 = r1
            goto L_0x006a
        L_0x0013:
            java.lang.String r3 = "application/ttml+xml"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x001c
            goto L_0x0010
        L_0x001c:
            r3 = 7
            goto L_0x006a
        L_0x001e:
            java.lang.String r3 = "application/x-subrip"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x0027
            goto L_0x0010
        L_0x0027:
            r3 = 6
            goto L_0x006a
        L_0x0029:
            java.lang.String r3 = "text/x-ssa"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x0032
            goto L_0x0010
        L_0x0032:
            r3 = 5
            goto L_0x006a
        L_0x0034:
            java.lang.String r3 = "application/x-quicktime-tx3g"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x003d
            goto L_0x0010
        L_0x003d:
            r3 = 4
            goto L_0x006a
        L_0x003f:
            java.lang.String r3 = "text/vtt"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x0048
            goto L_0x0010
        L_0x0048:
            r3 = 3
            goto L_0x006a
        L_0x004a:
            java.lang.String r3 = "application/x-mp4-vtt"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x0053
            goto L_0x0010
        L_0x0053:
            r3 = 2
            goto L_0x006a
        L_0x0055:
            java.lang.String r3 = "application/pgs"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x005e
            goto L_0x0010
        L_0x005e:
            r3 = r12
            goto L_0x006a
        L_0x0060:
            java.lang.String r3 = "application/dvbsubs"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x0069
            goto L_0x0010
        L_0x0069:
            r3 = r0
        L_0x006a:
            switch(r3) {
                case 0: goto L_0x009f;
                case 1: goto L_0x0097;
                case 2: goto L_0x008f;
                case 3: goto L_0x0087;
                case 4: goto L_0x0081;
                case 5: goto L_0x007b;
                case 6: goto L_0x0075;
                case 7: goto L_0x006f;
                default: goto L_0x006d;
            }
        L_0x006d:
            goto L_0x0123
        L_0x006f:
            vse r12 = new vse
            r12.<init>()
            return r12
        L_0x0075:
            z0e r12 = new z0e
            r12.<init>()
            return r12
        L_0x007b:
            nnd r12 = new nnd
            r12.<init>(r13)
            return r12
        L_0x0081:
            bte r12 = new bte
            r12.<init>(r13)
            return r12
        L_0x0087:
            v4b r12 = new v4b
            r13 = 15
            r12.<init>((int) r13)
            return r12
        L_0x008f:
            wwc r12 = new wwc
            r13 = 18
            r12.<init>((int) r13)
            return r12
        L_0x0097:
            nxc r12 = new nxc
            r13 = 11
            r12.<init>((int) r13)
            return r12
        L_0x009f:
            kv2 r2 = new kv2
            r2.<init>()
            ija r3 = new ija
            java.lang.Object r13 = r13.get(r0)
            byte[] r13 = (byte[]) r13
            r3.<init>(r13)
            int r13 = r3.A()
            int r3 = r3.A()
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r2.a = r4
            android.graphics.Paint$Style r5 = android.graphics.Paint.Style.FILL_AND_STROKE
            r4.setStyle(r5)
            android.graphics.PorterDuffXfermode r5 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SRC
            r5.<init>(r6)
            r4.setXfermode(r5)
            r5 = 0
            r4.setPathEffect(r5)
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r2.b = r4
            android.graphics.Paint$Style r6 = android.graphics.Paint.Style.FILL
            r4.setStyle(r6)
            android.graphics.PorterDuffXfermode r6 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r7 = android.graphics.PorterDuff.Mode.DST_OVER
            r6.<init>(r7)
            r4.setXfermode(r6)
            r4.setPathEffect(r5)
            android.graphics.Canvas r4 = new android.graphics.Canvas
            r4.<init>()
            r2.c = r4
            iq4 r4 = new iq4
            r8 = 0
            r9 = 719(0x2cf, float:1.008E-42)
            r6 = 719(0x2cf, float:1.008E-42)
            r7 = 575(0x23f, float:8.06E-43)
            r10 = 0
            r11 = 575(0x23f, float:8.06E-43)
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r2.o = r4
            hq4 r4 = new hq4
            r5 = -8421505(0xffffffffff7f7f7f, float:-3.3961514E38)
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int[] r1 = new int[]{r0, r1, r6, r5}
            int[] r5 = defpackage.kv2.g()
            int[] r6 = defpackage.kv2.h()
            r4.<init>(r0, r1, r5, r6)
            r2.X = r4
            sq4 r0 = new sq4
            r0.<init>(r13, r3, r12)
            r2.Y = r0
            return r2
        L_0x0123:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "Unsupported MIME type: "
            java.lang.String r13 = defpackage.rf0.h(r13, r2)
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.smc.d(xu5):u1e");
    }

    public int e(xu5 xu5) {
        String str = xu5.n;
        if (str != null) {
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c2 = 7;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                case 1:
                case 2:
                    return 2;
                case 3:
                    return 1;
                case 4:
                    return 2;
                case 5:
                case 6:
                case 7:
                    return 1;
            }
        }
        throw new IllegalArgumentException(rf0.h("Unsupported MIME type: ", str));
    }

    public Object f(ws8 ws8) {
        switch (this.a) {
            case 13:
                return Integer.valueOf(jjd.I(ws8));
            default:
                int K = jjd.K(ws8);
                ym8 ym8 = null;
                if (K == 0) {
                    return null;
                }
                long j = 0;
                for (int i = 0; i < K; i++) {
                    String z0 = ws8.z0();
                    z0.getClass();
                    if (z0.equals(ApiProtocol.PARAM_CHAT_ID)) {
                        j = ws8.w0();
                    } else if (!z0.equals("message")) {
                        ws8.z();
                    } else {
                        ym8 = hhd.H(ws8);
                    }
                }
                return new b61(j, ym8);
        }
    }

    public void g(Object obj) {
        ((Bitmap) obj).recycle();
    }

    public int p(Context context, String str) {
        return gr4.a(context, str);
    }

    public lbe q(ws8 ws8) {
        int i;
        String str;
        if (!ws8.m()) {
            return null;
        }
        try {
            i = jjd.K(ws8);
        } catch (Throwable th) {
            udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = uzc.a.iterator();
            while (it.hasNext()) {
                ((ny9) it.next()).getClass();
                ny9.a(th);
            }
            int t = hr1.t(m4b.a);
            if (t == 0) {
                i = 0;
            } else if (t != 1) {
                throw new NoWhenBranchMatchedException();
            } else {
                throw th;
            }
        }
        if (i == 0) {
            return null;
        }
        String str2 = null;
        String str3 = null;
        for (int i2 = 0; i2 < i; i2++) {
            try {
                str = jjd.M(ws8);
            } catch (Throwable th2) {
                udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                Iterator it2 = uzc.a.iterator();
                while (it2.hasNext()) {
                    ((ny9) it2.next()).getClass();
                    ny9.a(th2);
                }
                int t2 = hr1.t(m4b.a);
                if (t2 == 0) {
                    str = null;
                } else if (t2 != 1) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    throw th2;
                }
            }
            if (str != null) {
                if (str.equals("url")) {
                    try {
                        str2 = jjd.M(ws8);
                    } catch (Throwable th3) {
                        udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                        Iterator it3 = uzc.a.iterator();
                        while (it3.hasNext()) {
                            ((ny9) it3.next()).getClass();
                            ny9.a(th3);
                        }
                        int t3 = hr1.t(m4b.a);
                        if (t3 == 0) {
                            str2 = null;
                        } else if (t3 != 1) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            throw th3;
                        }
                    }
                } else if (str.equals("query_id")) {
                    try {
                        str3 = jjd.M(ws8);
                    } catch (Throwable th4) {
                        udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                        Iterator it4 = uzc.a.iterator();
                        while (it4.hasNext()) {
                            ((ny9) it4.next()).getClass();
                            ny9.a(th4);
                        }
                        int t4 = hr1.t(m4b.a);
                        if (t4 == 0) {
                            str3 = null;
                        } else if (t4 != 1) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            throw th4;
                        }
                    }
                } else {
                    try {
                        ws8.z();
                    } catch (Throwable th5) {
                        udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th5);
                        Iterator it5 = uzc.a.iterator();
                        while (it5.hasNext()) {
                            ((ny9) it5.next()).getClass();
                            ny9.a(th5);
                        }
                        int t5 = hr1.t(m4b.a);
                        if (t5 != 0) {
                            if (t5 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th5;
                        }
                    }
                }
            }
        }
        return new dkf(str2, str3);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:31:0x005c=Splitter:B:31:0x005c, B:47:0x008d=Splitter:B:47:0x008d, B:18:0x003f=Splitter:B:18:0x003f} */
    public int r(android.content.Context r11, java.lang.String r12, boolean r13) {
        /*
            r10 = this;
            java.lang.Class<gr4> r10 = gr4.class
            monitor-enter(r10)     // Catch:{ all -> 0x00bc }
            java.lang.Boolean r0 = gr4.c     // Catch:{ all -> 0x004c }
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L_0x00af
            android.content.Context r0 = r11.getApplicationContext()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x00a7 }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x00a7 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r4 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r4 = r4.getName()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x00a7 }
            java.lang.Class r0 = r0.loadClass(r4)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x00a7 }
            java.lang.String r4 = "sClassLoader"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r4)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x00a7 }
            java.lang.Class r4 = r0.getDeclaringClass()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x00a7 }
            monitor-enter(r4)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x00a7 }
            java.lang.Object r5 = r0.get(r3)     // Catch:{ all -> 0x0037 }
            java.lang.ClassLoader r5 = (java.lang.ClassLoader) r5     // Catch:{ all -> 0x0037 }
            java.lang.ClassLoader r6 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0037 }
            if (r5 != r6) goto L_0x003a
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0037 }
            goto L_0x00a3
        L_0x0037:
            r0 = move-exception
            goto L_0x00a5
        L_0x003a:
            if (r5 == 0) goto L_0x0042
            gr4.d(r5)     // Catch:{ LoadingException -> 0x003f }
        L_0x003f:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0037 }
            goto L_0x00a3
        L_0x0042:
            boolean r5 = gr4.e(r11)     // Catch:{ all -> 0x0037 }
            if (r5 != 0) goto L_0x004f
            monitor-exit(r4)     // Catch:{ all -> 0x0037 }
            monitor-exit(r10)     // Catch:{ all -> 0x004c }
            goto L_0x0196
        L_0x004c:
            r12 = move-exception
            goto L_0x019d
        L_0x004f:
            boolean r5 = gr4.e     // Catch:{ all -> 0x0037 }
            if (r5 != 0) goto L_0x009a
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0037 }
            boolean r6 = r5.equals(r3)     // Catch:{ all -> 0x0037 }
            if (r6 == 0) goto L_0x005c
            goto L_0x009a
        L_0x005c:
            int r6 = gr4.c(r11, r12, r13, r1)     // Catch:{ LoadingException -> 0x0090 }
            java.lang.String r7 = gr4.d     // Catch:{ LoadingException -> 0x0090 }
            if (r7 == 0) goto L_0x008d
            boolean r7 = r7.isEmpty()     // Catch:{ LoadingException -> 0x0090 }
            if (r7 == 0) goto L_0x006b
            goto L_0x008d
        L_0x006b:
            java.lang.ClassLoader r7 = r1g.I()     // Catch:{ LoadingException -> 0x0090 }
            if (r7 == 0) goto L_0x0072
            goto L_0x0080
        L_0x0072:
            dalvik.system.DelegateLastClassLoader r7 = new dalvik.system.DelegateLastClassLoader     // Catch:{ LoadingException -> 0x0090 }
            java.lang.String r8 = gr4.d     // Catch:{ LoadingException -> 0x0090 }
            a24.o(r8)     // Catch:{ LoadingException -> 0x0090 }
            java.lang.ClassLoader r9 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x0090 }
            r7.<init>(r8, r9)     // Catch:{ LoadingException -> 0x0090 }
        L_0x0080:
            gr4.d(r7)     // Catch:{ LoadingException -> 0x0090 }
            r0.set(r3, r7)     // Catch:{ LoadingException -> 0x0090 }
            gr4.c = r5     // Catch:{ LoadingException -> 0x0090 }
            monitor-exit(r4)     // Catch:{ all -> 0x0037 }
            monitor-exit(r10)     // Catch:{ all -> 0x004c }
        L_0x008a:
            r2 = r6
            goto L_0x0196
        L_0x008d:
            monitor-exit(r4)     // Catch:{ all -> 0x0037 }
            monitor-exit(r10)     // Catch:{ all -> 0x004c }
            goto L_0x008a
        L_0x0090:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0037 }
            r0.set(r3, r5)     // Catch:{ all -> 0x0037 }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0037 }
            goto L_0x00a3
        L_0x009a:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0037 }
            r0.set(r3, r5)     // Catch:{ all -> 0x0037 }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0037 }
        L_0x00a3:
            monitor-exit(r4)     // Catch:{ all -> 0x0037 }
            goto L_0x00ad
        L_0x00a5:
            monitor-exit(r4)     // Catch:{ all -> 0x0037 }
            throw r0     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x00a7 }
        L_0x00a7:
            r0 = move-exception
            r0.toString()     // Catch:{ all -> 0x004c }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x004c }
        L_0x00ad:
            gr4.c = r0     // Catch:{ all -> 0x004c }
        L_0x00af:
            monitor-exit(r10)     // Catch:{ all -> 0x004c }
            boolean r10 = r0.booleanValue()     // Catch:{ all -> 0x00bc }
            if (r10 == 0) goto L_0x00c5
            int r2 = gr4.c(r11, r12, r13, r2)     // Catch:{ LoadingException -> 0x00bf }
            goto L_0x0196
        L_0x00bc:
            r10 = move-exception
            goto L_0x019f
        L_0x00bf:
            r10 = move-exception
            r10.getMessage()     // Catch:{ all -> 0x00bc }
            goto L_0x0196
        L_0x00c5:
            p5g r4 = gr4.f(r11)     // Catch:{ all -> 0x00bc }
            if (r4 != 0) goto L_0x00cd
            goto L_0x0196
        L_0x00cd:
            android.os.Parcel r10 = r4.G0()     // Catch:{ RemoteException -> 0x014b }
            r0 = 6
            android.os.Parcel r10 = r4.k(r10, r0)     // Catch:{ RemoteException -> 0x014b }
            int r0 = r10.readInt()     // Catch:{ RemoteException -> 0x014b }
            r10.recycle()     // Catch:{ RemoteException -> 0x014b }
            r10 = 3
            if (r0 < r10) goto L_0x014d
            java.lang.ThreadLocal r10 = gr4.h     // Catch:{ RemoteException -> 0x014b }
            java.lang.Object r0 = r10.get()     // Catch:{ RemoteException -> 0x014b }
            h5g r0 = (h5g) r0     // Catch:{ RemoteException -> 0x014b }
            if (r0 == 0) goto L_0x00f4
            android.database.Cursor r0 = r0.a     // Catch:{ RemoteException -> 0x014b }
            if (r0 == 0) goto L_0x00f4
            int r2 = r0.getInt(r2)     // Catch:{ RemoteException -> 0x014b }
            goto L_0x0196
        L_0x00f4:
            ks9 r5 = new ks9     // Catch:{ RemoteException -> 0x014b }
            r5.<init>(r11)     // Catch:{ RemoteException -> 0x014b }
            rt0 r0 = gr4.i     // Catch:{ RemoteException -> 0x014b }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x014b }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ RemoteException -> 0x014b }
            long r8 = r0.longValue()     // Catch:{ RemoteException -> 0x014b }
            r6 = r12
            r7 = r13
            un6 r12 = r4.L0(r5, r6, r7, r8)     // Catch:{ RemoteException -> 0x014b }
            java.lang.Object r12 = ks9.L0(r12)     // Catch:{ RemoteException -> 0x014b }
            android.database.Cursor r12 = (android.database.Cursor) r12     // Catch:{ RemoteException -> 0x014b }
            if (r12 == 0) goto L_0x0143
            boolean r13 = r12.moveToFirst()     // Catch:{ RemoteException -> 0x013d, all -> 0x013b }
            if (r13 != 0) goto L_0x011a
            goto L_0x0143
        L_0x011a:
            int r13 = r12.getInt(r2)     // Catch:{ RemoteException -> 0x013d, all -> 0x013b }
            if (r13 <= 0) goto L_0x0133
            java.lang.Object r10 = r10.get()     // Catch:{ RemoteException -> 0x013d, all -> 0x013b }
            h5g r10 = (h5g) r10     // Catch:{ RemoteException -> 0x013d, all -> 0x013b }
            if (r10 == 0) goto L_0x012f
            android.database.Cursor r0 = r10.a     // Catch:{ RemoteException -> 0x013d, all -> 0x013b }
            if (r0 != 0) goto L_0x012f
            r10.a = r12     // Catch:{ RemoteException -> 0x013d, all -> 0x013b }
            goto L_0x0130
        L_0x012f:
            r1 = r2
        L_0x0130:
            if (r1 == 0) goto L_0x0133
            goto L_0x0134
        L_0x0133:
            r3 = r12
        L_0x0134:
            if (r3 == 0) goto L_0x0139
            r3.close()     // Catch:{ all -> 0x00bc }
        L_0x0139:
            r2 = r13
            goto L_0x0196
        L_0x013b:
            r10 = move-exception
            goto L_0x013f
        L_0x013d:
            r10 = move-exception
            goto L_0x0141
        L_0x013f:
            r3 = r12
            goto L_0x0197
        L_0x0141:
            r3 = r12
            goto L_0x018e
        L_0x0143:
            if (r12 == 0) goto L_0x0196
            r12.close()     // Catch:{ all -> 0x00bc }
            goto L_0x0196
        L_0x0149:
            r10 = move-exception
            goto L_0x0197
        L_0x014b:
            r10 = move-exception
            goto L_0x018e
        L_0x014d:
            r1 = 2
            if (r0 != r1) goto L_0x0170
            ks9 r10 = new ks9     // Catch:{ RemoteException -> 0x014b }
            r10.<init>(r11)     // Catch:{ RemoteException -> 0x014b }
            android.os.Parcel r0 = r4.G0()     // Catch:{ RemoteException -> 0x014b }
            e2g.c(r0, r10)     // Catch:{ RemoteException -> 0x014b }
            r0.writeString(r12)     // Catch:{ RemoteException -> 0x014b }
            r0.writeInt(r13)     // Catch:{ RemoteException -> 0x014b }
            r10 = 5
            android.os.Parcel r10 = r4.k(r0, r10)     // Catch:{ RemoteException -> 0x014b }
            int r12 = r10.readInt()     // Catch:{ RemoteException -> 0x014b }
            r10.recycle()     // Catch:{ RemoteException -> 0x014b }
        L_0x016e:
            r2 = r12
            goto L_0x0196
        L_0x0170:
            ks9 r0 = new ks9     // Catch:{ RemoteException -> 0x014b }
            r0.<init>(r11)     // Catch:{ RemoteException -> 0x014b }
            android.os.Parcel r1 = r4.G0()     // Catch:{ RemoteException -> 0x014b }
            e2g.c(r1, r0)     // Catch:{ RemoteException -> 0x014b }
            r1.writeString(r12)     // Catch:{ RemoteException -> 0x014b }
            r1.writeInt(r13)     // Catch:{ RemoteException -> 0x014b }
            android.os.Parcel r10 = r4.k(r1, r10)     // Catch:{ RemoteException -> 0x014b }
            int r12 = r10.readInt()     // Catch:{ RemoteException -> 0x014b }
            r10.recycle()     // Catch:{ RemoteException -> 0x014b }
            goto L_0x016e
        L_0x018e:
            r10.getMessage()     // Catch:{ all -> 0x0149 }
            if (r3 == 0) goto L_0x0196
            r3.close()     // Catch:{ all -> 0x00bc }
        L_0x0196:
            return r2
        L_0x0197:
            if (r3 == 0) goto L_0x019c
            r3.close()     // Catch:{ all -> 0x00bc }
        L_0x019c:
            throw r10     // Catch:{ all -> 0x00bc }
        L_0x019d:
            monitor-exit(r10)     // Catch:{ all -> 0x004c }
            throw r12     // Catch:{ all -> 0x00bc }
        L_0x019f:
            a24.o(r11)     // Catch:{ Exception -> 0x01a2 }
        L_0x01a2:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.smc.r(android.content.Context, java.lang.String, boolean):int");
    }

    public void w() {
        throw new UnsupportedOperationException();
    }
}
