package defpackage;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.List;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: ate  reason: default package */
public final class ate extends ahd {
    public final yze B0 = new yze(3, false);
    public final boolean C0;
    public final int D0;
    public final int E0;
    public final String F0;
    public final float G0;
    public final int H0;

    public ate(List list) {
        String str = "sans-serif";
        boolean z = false;
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.D0 = bArr[24];
            this.E0 = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.F0 = "Serif".equals(new String(bArr, 43, bArr.length - 43, f22.c)) ? "serif" : str;
            int i = bArr[25] * 20;
            this.H0 = i;
            z = (bArr[0] & 32) != 0 ? true : z;
            this.C0 = z;
            if (z) {
                this.G0 = mze.i(((float) ((bArr[11] & 255) | ((bArr[10] & 255) << 8))) / ((float) i), 0.0f, 0.95f);
            } else {
                this.G0 = 0.85f;
            }
        } else {
            this.D0 = 0;
            this.E0 = -1;
            this.F0 = str;
            this.C0 = false;
            this.G0 = 0.85f;
            this.H0 = -1;
        }
    }

    public static void g(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    public static void h(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = true;
            boolean z2 = (i & 1) != 0;
            boolean z3 = (i & 2) != 0;
            if (z2) {
                if (z3) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z3) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            if ((i & 4) == 0) {
                z = false;
            }
            if (z) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (!z && !z2 && !z3) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
            }
        }
    }

    public final g1e b(int i, byte[] bArr, boolean z) {
        String str;
        int i2;
        int i3;
        yze yze = this.B0;
        yze.F(i, bArr);
        if (yze.c() >= 2) {
            int A = yze.A();
            if (A == 0) {
                str = BuildConfig.FLAVOR;
            } else {
                if (yze.c() >= 2) {
                    byte[] bArr2 = yze.a;
                    int i4 = yze.b;
                    char c = (char) ((bArr2[i4 + 1] & 255) | ((bArr2[i4] & 255) << 8));
                    if (c == 65279 || c == 65534) {
                        str = yze.t(A, f22.f);
                    }
                }
                str = yze.t(A, f22.c);
            }
            if (str.isEmpty()) {
                return cte.b;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
            h(spannableStringBuilder2, this.D0, 0, 0, spannableStringBuilder.length(), 16711680);
            g(spannableStringBuilder2, this.E0, -1, 0, spannableStringBuilder.length(), 16711680);
            int length = spannableStringBuilder.length();
            String str2 = this.F0;
            if (str2 != "sans-serif") {
                spannableStringBuilder.setSpan(new TypefaceSpan(str2), 0, length, 16711713);
            }
            float f = this.G0;
            while (yze.c() >= 8) {
                int i5 = yze.b;
                int h = yze.h();
                int h2 = yze.h();
                if (h2 == 1937013100) {
                    if (yze.c() >= 2) {
                        int A2 = yze.A();
                        int i6 = 0;
                        while (i6 < A2) {
                            if (yze.c() >= 12) {
                                int A3 = yze.A();
                                int A4 = yze.A();
                                yze.I(2);
                                int v = yze.v();
                                yze.I(1);
                                int h3 = yze.h();
                                if (A4 > spannableStringBuilder.length()) {
                                    spannableStringBuilder.length();
                                    A4 = spannableStringBuilder.length();
                                }
                                int i7 = A4;
                                if (A3 >= i7) {
                                    i3 = i6;
                                    i2 = A2;
                                } else {
                                    SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder;
                                    int i8 = i7;
                                    int i9 = A3;
                                    i3 = i6;
                                    int i10 = i8;
                                    i2 = A2;
                                    h(spannableStringBuilder3, v, this.D0, A3, i10, 0);
                                    g(spannableStringBuilder3, h3, this.E0, A3, i10, 0);
                                }
                                i6 = i3 + 1;
                                A2 = i2;
                            } else {
                                throw new Exception("Unexpected subtitle format.");
                            }
                        }
                        continue;
                    } else {
                        throw new Exception("Unexpected subtitle format.");
                    }
                } else if (h2 == 1952608120 && this.C0) {
                    if (yze.c() >= 2) {
                        f = mze.i(((float) yze.A()) / ((float) this.H0), 0.0f, 0.95f);
                    } else {
                        throw new Exception("Unexpected subtitle format.");
                    }
                }
                yze.H(i5 + h);
            }
            tw3 tw3 = r1;
            tw3 tw32 = new tw3(spannableStringBuilder, (Layout.Alignment) null, (Layout.Alignment) null, (Bitmap) null, f, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
            return new cte(tw3);
        }
        throw new Exception("Unexpected subtitle format.");
    }
}
