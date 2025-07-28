package defpackage;

import java.util.BitSet;
import java.util.List;

/* renamed from: zb1  reason: default package */
public final class zb1 extends ac1 {
    public final List b;
    public final ws7 c;
    public final bga o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zb1(hmd hmd) {
        super(raf.a);
        bga bga = null;
        List list = hmd != null ? hmd.a : null;
        list = list == null ? hw4.a : list;
        ws7 ws7 = hmd != null ? hmd.b : null;
        bga = hmd != null ? hmd.c : bga;
        this.b = list;
        this.c = ws7;
        this.o = bga;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zb1)) {
            return false;
        }
        zb1 zb1 = (zb1) obj;
        return hhd.f(this.b, zb1.b) && hhd.f(this.c, zb1.c) && hhd.f(this.o, zb1.o);
    }

    public final long getItemId() {
        return 111;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        int i = 0;
        ws7 ws7 = this.c;
        int hashCode2 = (hashCode + (ws7 == null ? 0 : ws7.hashCode())) * 31;
        bga bga = this.o;
        if (bga != null) {
            i = bga.hashCode();
        }
        return hashCode2 + i;
    }

    public final int l() {
        return 111;
    }

    public final Object n(Object obj) {
        zb1 zb1 = (pg7) obj;
        u2 u2Var = null;
        zb1 zb12 = zb1 instanceof zb1 ? zb1 : null;
        if (zb12 != null) {
            u2Var = new u2(7);
            BitSet bitSet = (BitSet) u2Var.b;
            boolean z = false;
            bitSet.set(0, !hhd.f(this.b, zb12.b));
            if (!hhd.f(this.c, zb12.c) || !hhd.f(this.o, zb12.o)) {
                z = true;
            }
            bitSet.set(1, z);
        }
        return u2Var;
    }

    public final String toString() {
        return "Speaker(opponentsPages=" + this.b + ", mainOpponentState=" + this.c + ", opponentPipState=" + this.o + ")";
    }
}
