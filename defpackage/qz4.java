package defpackage;

import java.util.Arrays;

/* renamed from: qz4  reason: default package */
public final class qz4 implements l77 {
    public final Enum[] a;
    public final syc b;
    public final r7e c = new r7e(new gz3(6, this));

    public qz4(Enum[] enumArr, nz4 nz4) {
        this.a = enumArr;
        this.b = nz4;
    }

    public final Object a(b9 b9Var) {
        int q = b9Var.q(d());
        Enum[] enumArr = this.a;
        if (q >= 0 && q < enumArr.length) {
            return enumArr[q];
        }
        throw new IllegalArgumentException(q + " is not among valid " + d().a() + " enum values, values size is " + enumArr.length);
    }

    public final void b(ur3 ur3, Object obj) {
        Enum enumR = (Enum) obj;
        Enum[] enumArr = this.a;
        int a0 = cs.a0(enumArr, enumR);
        if (a0 != -1) {
            ur3.g(d(), a0);
            return;
        }
        throw new IllegalArgumentException(enumR + " is not a valid enum " + d().a() + ", must be one of " + Arrays.toString(enumArr));
    }

    public final syc d() {
        return (syc) this.c.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + d().a() + '>';
    }
}
