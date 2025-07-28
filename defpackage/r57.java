package defpackage;

/* renamed from: r57  reason: default package */
public final class r57 {
    public static final r57 d = new r57();
    public final t57 a;
    public final hk9 b;
    public final u5g c = new u5g(12);

    public r57() {
        t57 t57 = new t57();
        hk9 hk9 = ct0.c;
        this.a = t57;
        this.b = hk9;
    }

    public final Object a(l77 l77, String str) {
        ope ope = !this.a.o ? new ope(str) : new ope(str);
        Object u = new b9(this, yuf.OBJ, ope, l77.d(), (mv0) null).u(l77);
        if (ope.m() == 10) {
            return u;
        }
        ope.v(ope, "Expected EOF after parsing, but had " + ((String) ope.c).charAt(ope.b - 1) + " instead", 0, (String) null, 6);
        throw null;
    }

    public final String b(l77 l77, Object obj) {
        char[] cArr;
        og0 og0 = new og0(0, 9);
        t12 t12 = t12.c;
        synchronized (t12) {
            lr lrVar = (lr) t12.b;
            cArr = null;
            char[] cArr2 = (char[]) (lrVar.isEmpty() ? null : lrVar.k());
            if (cArr2 != null) {
                t12.a -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        og0.c = cArr;
        try {
            new ur3(this.a.e ? new m83(og0, this) : new xp0(og0), this, yuf.OBJ, new ur3[yuf.w0.getSize()]).l(l77, obj);
            return og0.toString();
        } finally {
            og0.A();
        }
    }
}
