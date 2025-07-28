package defpackage;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.Arrays;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: tw3  reason: default package */
public final class tw3 implements lt0 {
    public static final tw3 G0 = new tw3(BuildConfig.FLAVOR, (Layout.Alignment) null, (Layout.Alignment) null, (Bitmap) null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    public static final no3 H0 = new no3(8);
    public final boolean A0;
    public final int B0;
    public final int C0;
    public final float D0;
    public final int E0;
    public final float F0;
    public final float X;
    public final int Y;
    public final int Z;
    public final CharSequence a;
    public final Layout.Alignment b;
    public final Layout.Alignment c;
    public final Bitmap o;
    public final float w0;
    public final int x0;
    public final float y0;
    public final float z0;

    public tw3(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6) {
        CharSequence charSequence2 = charSequence;
        Bitmap bitmap2 = bitmap;
        if (charSequence2 == null) {
            bitmap.getClass();
        } else {
            swb.e(bitmap2 == null);
        }
        if (charSequence2 instanceof Spanned) {
            this.a = SpannedString.valueOf(charSequence);
        } else if (charSequence2 != null) {
            this.a = charSequence.toString();
        } else {
            this.a = null;
        }
        this.b = alignment;
        this.c = alignment2;
        this.o = bitmap2;
        this.X = f;
        this.Y = i;
        this.Z = i2;
        this.w0 = f2;
        this.x0 = i3;
        this.y0 = f4;
        this.z0 = f5;
        this.A0 = z;
        this.B0 = i5;
        this.C0 = i4;
        this.D0 = f3;
        this.E0 = i6;
        this.F0 = f6;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, rw3] */
    public final rw3 a() {
        ? obj = new Object();
        obj.a = this.a;
        obj.b = this.o;
        obj.c = this.b;
        obj.d = this.c;
        obj.e = this.X;
        obj.f = this.Y;
        obj.g = this.Z;
        obj.h = this.w0;
        obj.i = this.x0;
        obj.j = this.C0;
        obj.k = this.D0;
        obj.l = this.y0;
        obj.m = this.z0;
        obj.n = this.A0;
        obj.o = this.B0;
        obj.p = this.E0;
        obj.q = this.F0;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tw3.class != obj.getClass()) {
            return false;
        }
        tw3 tw3 = (tw3) obj;
        if (TextUtils.equals(this.a, tw3.a) && this.b == tw3.b && this.c == tw3.c) {
            Bitmap bitmap = tw3.o;
            Bitmap bitmap2 = this.o;
            if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                if (this.X == tw3.X && this.Y == tw3.Y && this.Z == tw3.Z && this.w0 == tw3.w0 && this.x0 == tw3.x0 && this.y0 == tw3.y0 && this.z0 == tw3.z0 && this.A0 == tw3.A0 && this.B0 == tw3.B0 && this.C0 == tw3.C0 && this.D0 == tw3.D0 && this.E0 == tw3.E0 && this.F0 == tw3.F0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.o, Float.valueOf(this.X), Integer.valueOf(this.Y), Integer.valueOf(this.Z), Float.valueOf(this.w0), Integer.valueOf(this.x0), Float.valueOf(this.y0), Float.valueOf(this.z0), Boolean.valueOf(this.A0), Integer.valueOf(this.B0), Integer.valueOf(this.C0), Float.valueOf(this.D0), Integer.valueOf(this.E0), Float.valueOf(this.F0)});
    }
}
