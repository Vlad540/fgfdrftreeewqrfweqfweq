package defpackage;

/* renamed from: lpe  reason: default package */
public class lpe implements lt0 {
    public final ws6 A0;
    public final int B0;
    public final ws6 C0;
    public final int D0;
    public final int E0;
    public final int F0;
    public final ws6 G0;
    public final ws6 H0;
    public final int I0;
    public final boolean J0;
    public final boolean K0;
    public final boolean L0;
    public final hpe M0;
    public final gt6 N0;
    public final int X;
    public final int Y;
    public final int Z;
    public final int a;
    public final int b;
    public final int c;
    public final int o;
    public final int w0;
    public final int x0;
    public final int y0;
    public final boolean z0;

    static {
        new lpe(new jpe());
    }

    public lpe(jpe jpe) {
        this.a = jpe.a;
        this.b = jpe.b;
        this.c = jpe.c;
        this.o = jpe.d;
        this.X = jpe.e;
        this.Y = jpe.f;
        this.Z = jpe.g;
        this.w0 = jpe.h;
        this.x0 = jpe.i;
        this.y0 = jpe.j;
        this.z0 = jpe.k;
        this.A0 = jpe.l;
        this.B0 = jpe.m;
        this.C0 = jpe.n;
        this.D0 = jpe.o;
        this.E0 = jpe.p;
        this.F0 = jpe.q;
        this.G0 = jpe.r;
        this.H0 = jpe.s;
        this.I0 = jpe.t;
        this.J0 = jpe.u;
        this.K0 = jpe.v;
        this.L0 = jpe.w;
        this.M0 = jpe.x;
        this.N0 = jpe.y;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        lpe lpe = (lpe) obj;
        return this.a == lpe.a && this.b == lpe.b && this.c == lpe.c && this.o == lpe.o && this.X == lpe.X && this.Y == lpe.Y && this.Z == lpe.Z && this.w0 == lpe.w0 && this.z0 == lpe.z0 && this.x0 == lpe.x0 && this.y0 == lpe.y0 && this.A0.equals(lpe.A0) && this.B0 == lpe.B0 && this.C0.equals(lpe.C0) && this.D0 == lpe.D0 && this.E0 == lpe.E0 && this.F0 == lpe.F0 && this.G0.equals(lpe.G0) && this.H0.equals(lpe.H0) && this.I0 == lpe.I0 && this.J0 == lpe.J0 && this.K0 == lpe.K0 && this.L0 == lpe.L0 && this.M0.equals(lpe.M0) && this.N0.equals(lpe.N0);
    }

    public int hashCode() {
        int hashCode = this.A0.hashCode();
        int hashCode2 = this.C0.hashCode();
        int hashCode3 = this.G0.hashCode();
        int hashCode4 = this.H0.hashCode();
        return ((this.M0.a.hashCode() + ((((((((((hashCode4 + ((hashCode3 + ((((((((hashCode2 + ((((hashCode + ((((((((((((((((((((((this.a + 31) * 31) + this.b) * 31) + this.c) * 31) + this.o) * 31) + this.X) * 31) + this.Y) * 31) + this.Z) * 31) + this.w0) * 31) + (this.z0 ? 1 : 0)) * 31) + this.x0) * 31) + this.y0) * 31)) * 31) + this.B0) * 31)) * 31) + this.D0) * 31) + this.E0) * 31) + this.F0) * 31)) * 31)) * 31) + this.I0) * 31) + (this.J0 ? 1 : 0)) * 31) + (this.K0 ? 1 : 0)) * 31) + (this.L0 ? 1 : 0)) * 31)) * 31) + this.N0.hashCode();
    }
}
