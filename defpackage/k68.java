package defpackage;

/* renamed from: k68  reason: default package */
public interface k68 extends pg7 {
    boolean g(pg7 pg7) {
        if (!(pg7 instanceof k68)) {
            return false;
        }
        k68 k68 = (k68) pg7;
        return j() == k68.j() && h() == k68.h();
    }

    long h();

    long j();

    String x();
}
