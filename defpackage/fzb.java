package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: fzb  reason: default package */
public final class fzb implements pg7 {
    public final int X = thc.b;
    public final long Y;
    public final long a;
    public final ryb b;
    public final Drawable c;
    public final boolean o;

    public fzb(long j, ryb ryb, Drawable drawable, boolean z) {
        this.a = j;
        this.b = ryb;
        this.c = drawable;
        this.o = z;
        this.Y = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzb)) {
            return false;
        }
        fzb fzb = (fzb) obj;
        return this.a == fzb.a && hhd.f(this.b, fzb.b) && hhd.f(this.c, fzb.c) && this.o == fzb.o;
    }

    public final long getItemId() {
        return this.Y;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31;
        Drawable drawable = this.c;
        return Boolean.hashCode(this.o) + ((hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31);
    }

    public final int l() {
        return this.X;
    }

    public final String toString() {
        return "ReactionModel(animojiId=" + this.a + ", reaction=" + this.b + ", reactionDrawable=" + this.c + ", selected=" + this.o + ")";
    }
}
