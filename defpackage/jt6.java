package defpackage;

/* renamed from: jt6  reason: default package */
public final class jt6 extends gt6 {
    public final /* synthetic */ kt6 o;

    public jt6(kt6 kt6) {
        this.o = kt6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r3 = (java.util.Map.Entry) r3;
        r2 = r2.o.get(r3.getKey());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean contains(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L_0x001e
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r0 = r3.getKey()
            kt6 r2 = r2.o
            java.lang.Object r2 = r2.get(r0)
            if (r2 == 0) goto L_0x001e
            java.lang.Object r3 = r3.getValue()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x001e
            r1 = 1
        L_0x001e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jt6.contains(java.lang.Object):boolean");
    }

    public final boolean f() {
        return this.o.g();
    }

    public final rue g() {
        return a().listIterator(0);
    }

    public final int hashCode() {
        return this.o.hashCode();
    }

    public final ws6 k() {
        return new it6(this);
    }

    public final boolean l() {
        this.o.getClass();
        return false;
    }

    public final int size() {
        return this.o.Y.size();
    }
}
