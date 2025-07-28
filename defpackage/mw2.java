package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: mw2  reason: default package */
public final class mw2 extends kh0 {
    public final md4 X;
    public final jh0 Y;
    public final boolean Z;
    public final Collection b;
    public final boolean c;
    public final boolean o;
    public final Set w0;

    public mw2(List list, boolean z) {
        this(list, z, false, (md4) null, (a4b) null, 124);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mw2)) {
            return false;
        }
        mw2 mw2 = (mw2) obj;
        return hhd.f(this.b, mw2.b) && this.c == mw2.c && this.o == mw2.o && this.X == mw2.X && hhd.f(this.Y, mw2.Y) && this.Z == mw2.Z && hhd.f(this.w0, mw2.w0);
    }

    public final int hashCode() {
        int hashCode = (this.X.hashCode() + th2.f(th2.f(this.b.hashCode() * 31, 31, this.c), 31, this.o)) * 31;
        jh0 jh0 = this.Y;
        return this.w0.hashCode() + th2.f((hashCode + (jh0 == null ? 0 : jh0.hashCode())) * 31, 31, this.Z);
    }

    public final String toString() {
        return "ChatsUpdateEvent(chatIds=" + this.b + ", orderChange=" + this.c + ", initialDataLoaded=" + this.o + ", itemType=" + this.X + ", error=" + this.Y + ", replaceDuplicate=" + this.Z + ", chatServerIds=" + this.w0 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mw2(Collection collection, boolean z, boolean z2, md4 md4, a4b a4b, int i) {
        this(collection, z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? md4.REGULAR : md4, (i & 16) != 0 ? null : a4b, false, qw4.a);
    }

    public mw2(Collection collection, boolean z, boolean z2, md4 md4, jh0 jh0, boolean z3, Set set) {
        this.b = collection;
        this.c = z;
        this.o = z2;
        this.X = md4;
        this.Y = jh0;
        this.Z = z3;
        this.w0 = set;
    }

    public mw2(zb9 zb9) {
        this(Collections.unmodifiableList(lp.U(zb9)), true, false, (md4) null, (a4b) null, 124);
    }
}
