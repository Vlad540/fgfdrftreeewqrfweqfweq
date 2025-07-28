package defpackage;

import android.net.Uri;
import java.util.BitSet;

/* renamed from: y75  reason: default package */
public final class y75 implements pg7 {
    public final CharSequence X;
    public final CharSequence Y;
    public final boolean Z;
    public final long a;
    public final Uri b;
    public final boolean c;
    public final boolean o;
    public final CharSequence w0;

    public y75(long j, Uri uri, boolean z, boolean z2, CharSequence charSequence, CharSequence charSequence2, boolean z3, CharSequence charSequence3) {
        this.a = j;
        this.b = uri;
        this.c = z;
        this.o = z2;
        this.X = charSequence;
        this.Y = charSequence2;
        this.Z = z3;
        this.w0 = charSequence3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y75)) {
            return false;
        }
        y75 y75 = (y75) obj;
        return this.a == y75.a && hhd.f(this.b, y75.b) && this.c == y75.c && this.o == y75.o && hhd.f(this.X, y75.X) && hhd.f(this.Y, y75.Y) && this.Z == y75.Z && hhd.f(this.w0, y75.w0);
    }

    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        int i = 0;
        Uri uri = this.b;
        int f = me4.f(this.X, th2.f(th2.f((hashCode + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.c), 31, this.o), 31);
        CharSequence charSequence = this.Y;
        if (charSequence != null) {
            i = charSequence.hashCode();
        }
        return this.w0.hashCode() + th2.f((f + i) * 31, 31, this.Z);
    }

    public final int l() {
        int i = this.Z ? f2a.u : f2a.v;
        int i2 = qp2.a;
        return i;
    }

    public final Object n(Object obj) {
        y75 y75 = (pg7) obj;
        u2 u2Var = null;
        y75 y752 = y75 instanceof y75 ? y75 : null;
        if (y752 != null) {
            u2Var = new u2(7);
            boolean f = hhd.f(this.b, y752.b);
            boolean z = true;
            BitSet bitSet = (BitSet) u2Var.b;
            bitSet.set(0, !f);
            bitSet.set(1, this.c != y752.c);
            bitSet.set(2, !hhd.f(this.X, y752.X));
            bitSet.set(3, !hhd.f(this.Y, y752.Y));
            bitSet.set(4, this.Z != y752.Z);
            bitSet.set(5, !hhd.f(this.w0, y752.w0));
            if (this.o == y752.o) {
                z = false;
            }
            bitSet.set(6, z);
        }
        return u2Var;
    }

    public final String toString() {
        return "FakeChatModel(contactId=" + this.a + ", avatar=" + this.b + ", isOnline=" + this.c + ", isVerified=" + this.o + ", title=" + this.X + ", subtitle=" + this.Y + ", isRegistered=" + this.Z + ", abbreviation=" + this.w0 + ")";
    }
}
