package defpackage;

/* renamed from: g25  reason: default package */
public final class g25 implements pg7 {
    public final int X;
    public final boolean Y;
    public final boolean Z;
    public final String a;
    public final int b;
    public final long c;
    public final int o;
    public final long w0;

    public g25(String str, int i, int i2, long j, boolean z, boolean z2, int i3) {
        this.a = str;
        this.b = i;
        this.c = j;
        this.o = i2;
        this.X = i3;
        this.Y = z;
        this.Z = z2;
        this.w0 = (long) str.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g25)) {
            return false;
        }
        g25 g25 = (g25) obj;
        return hhd.f(this.a, g25.a) && this.b == g25.b && this.c == g25.c && this.o == g25.o && this.X == g25.X && this.Y == g25.Y && this.Z == g25.Z;
    }

    public final long getItemId() {
        return this.w0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.Z) + th2.f(c3d.d(this.X, c3d.d(this.o, sxe.m(c3d.d(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31), 31), 31, this.Y);
    }

    public final int l() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExecutorState(name=");
        sb.append(this.a);
        sb.append(", numberOfIdleThreads=");
        sb.append(this.b);
        sb.append(", completedTasksCount=");
        sb.append(this.c);
        sb.append(", activeTasksCount=");
        sb.append(this.o);
        sb.append(", tasksInQueue=");
        sb.append(this.X);
        sb.append(", shutdown=");
        sb.append(this.Y);
        sb.append(", terminated=");
        return hr1.j(sb, this.Z, ")");
    }
}
