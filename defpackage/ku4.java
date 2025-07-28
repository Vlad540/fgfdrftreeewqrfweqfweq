package defpackage;

import android.graphics.drawable.Drawable;
import java.util.List;

/* renamed from: ku4  reason: default package */
public final class ku4 implements pg7 {
    public final Drawable X;
    public final long Y;
    public final int Z;
    public final int a;
    public final int b;
    public final CharSequence c;
    public final List o;
    public final long w0;

    public ku4(int i, int i2, CharSequence charSequence, List list, Drawable drawable, long j) {
        this.a = i;
        this.b = i2;
        this.c = charSequence;
        this.o = list;
        this.X = drawable;
        this.Y = j;
        this.Z = p9a.a;
        this.w0 = j != 0 ? (Long.MAX_VALUE - Math.abs(j)) - ((long) i) : (long) i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r6 = (defpackage.ku4) r6;
        r1 = r6.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof defpackage.ku4
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            ku4 r6 = (defpackage.ku4) r6
            int r1 = r6.a
            int r3 = r5.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            int r1 = r5.b
            int r3 = r6.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            java.lang.CharSequence r1 = r5.c
            java.lang.CharSequence r3 = r6.c
            boolean r1 = hhd.f(r1, r3)
            if (r1 != 0) goto L_0x0025
            return r2
        L_0x0025:
            java.util.List r1 = r5.o
            java.util.List r3 = r6.o
            boolean r1 = hhd.f(r1, r3)
            if (r1 != 0) goto L_0x0030
            return r2
        L_0x0030:
            android.graphics.drawable.Drawable r1 = r5.X
            android.graphics.drawable.Drawable r3 = r6.X
            boolean r1 = hhd.f(r1, r3)
            if (r1 != 0) goto L_0x003b
            return r2
        L_0x003b:
            long r3 = r5.Y
            long r5 = r6.Y
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x0044
            return r2
        L_0x0044:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ku4.equals(java.lang.Object):boolean");
    }

    public final long getItemId() {
        return this.w0;
    }

    public final int hashCode() {
        int f = c3d.f(this.o, me4.f(this.c, c3d.d(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
        Drawable drawable = this.X;
        return Long.hashCode(this.Y) + ((f + (drawable == null ? 0 : drawable.hashCode())) * 31);
    }

    public final int l() {
        return this.Z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmojiModel(groupIndex=");
        sb.append(this.a);
        sb.append(", itemIndex=");
        sb.append(this.b);
        sb.append(", defaultValue=");
        sb.append(this.c);
        sb.append(", values=");
        sb.append(this.o);
        sb.append(", drawable=");
        sb.append(this.X);
        sb.append(", animojiId=");
        return wn6.k(sb, this.Y, ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ku4(int i, int i2, CharSequence charSequence, List list, Drawable drawable, long j, int i3) {
        this(i, i2, charSequence, (i3 & 8) != 0 ? hw4.a : list, drawable, (i3 & 32) != 0 ? 0 : j);
    }
}
