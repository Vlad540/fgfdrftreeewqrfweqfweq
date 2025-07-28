package defpackage;

/* renamed from: jb4  reason: default package */
public final class jb4 implements Comparable {
    public final boolean a;
    public final boolean b;

    public jb4(vu5 vu5, int i) {
        this.a = (vu5.o & 1) == 0 ? false : true;
        this.b = ac4.d(i, false);
    }

    public final int compareTo(Object obj) {
        jb4 jb4 = (jb4) obj;
        return g63.a.d(this.b, jb4.b).d(this.a, jb4.a).f();
    }
}
