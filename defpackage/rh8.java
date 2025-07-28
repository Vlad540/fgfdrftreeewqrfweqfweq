package defpackage;

/* renamed from: rh8  reason: default package */
public abstract class rh8 implements pg7 {
    public final boolean g(pg7 pg7) {
        if (!(pg7 instanceof rh8)) {
            return false;
        }
        rh8 rh8 = (rh8) pg7;
        return j() == rh8.j() && h() == rh8.h();
    }

    public abstract long h();

    public abstract long j();
}
