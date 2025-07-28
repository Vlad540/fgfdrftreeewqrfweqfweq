package defpackage;

/* renamed from: n14  reason: default package */
public class n14 implements dke {
    public final long a;
    public boolean b;
    public final Object c;

    public n14(long j) {
        this.a = j;
        this.b = true;
        this.c = new gz3(1, this);
    }

    public dke a() {
        return new n14(((dke) this.c).a(), this.a);
    }

    public boolean hasNext() {
        return !this.b && ((dke) this.c).hasNext();
    }

    public long next() {
        oyb.k(hasNext());
        long next = ((dke) this.c).next();
        if (this.a <= next) {
            this.b = true;
        }
        return next;
    }

    public n14(dke dke, long j) {
        this.c = dke;
        this.a = j;
    }
}
