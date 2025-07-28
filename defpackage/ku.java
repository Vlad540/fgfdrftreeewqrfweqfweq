package defpackage;

/* renamed from: ku  reason: default package */
public final class ku extends hhd {
    public final /* synthetic */ lu e;

    public ku(lu luVar) {
        this.e = luVar;
    }

    public final int B() {
        return this.e.b.size();
    }

    public final int C() {
        return this.e.a.size();
    }

    public final boolean e(int i, int i2) {
        lu luVar = this.e;
        Object obj = luVar.a.get(i);
        Object obj2 = luVar.b.get(i2);
        if (obj != null && obj2 != null) {
            return ((urd) luVar.X.b.c).c(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    public final boolean g(int i, int i2) {
        lu luVar = this.e;
        Object obj = luVar.a.get(i);
        Object obj2 = luVar.b.get(i2);
        return (obj == null || obj2 == null) ? obj == null && obj2 == null : ((urd) luVar.X.b.c).d(obj, obj2);
    }

    public final Object z(int i, int i2) {
        lu luVar = this.e;
        Object obj = luVar.a.get(i);
        Object obj2 = luVar.b.get(i2);
        if (obj != null && obj2 != null) {
            return ((urd) luVar.X.b.c).s(obj, obj2);
        }
        throw new AssertionError();
    }
}
