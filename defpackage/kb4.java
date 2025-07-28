package defpackage;

/* renamed from: kb4  reason: default package */
public final class kb4 implements Comparable {
    public final boolean a;
    public final boolean b;

    public kb4(int i, xu5 xu5) {
        this.a = (xu5.e & 1) == 0 ? false : true;
        this.b = qi0.o(i, false);
    }

    public final int compareTo(Object obj) {
        kb4 kb4 = (kb4) obj;
        return g63.a.d(this.b, kb4.b).d(this.a, kb4.a).f();
    }
}
