package defpackage;

/* renamed from: vpe  reason: default package */
public final class vpe implements Comparable {
    public final Runnable a;
    public final long b;
    public final int c;
    public volatile boolean o;

    public vpe(Runnable runnable, Long l, int i) {
        this.a = runnable;
        this.b = l.longValue();
        this.c = i;
    }

    public final int compareTo(Object obj) {
        vpe vpe = (vpe) obj;
        int compare = Long.compare(this.b, vpe.b);
        return compare == 0 ? Integer.compare(this.c, vpe.c) : compare;
    }
}
