package defpackage;

/* renamed from: j92  reason: default package */
public final class j92 {
    public final t97 a;
    public final t97 b;
    public final String c = j92.class.getName();

    public j92(t97 t97, t97 t972) {
        this.a = t97;
        this.b = t972;
    }

    public static void a(j92 j92, long j, long j2, long j3, long j4, md4 md4) {
        j92 j922 = j92;
        j92.getClass();
        StringBuilder j5 = m4b.j("from: chatId = ", j, ", time = ", ez3.T(Long.valueOf(j3)));
        j5.append(", chatAccessToken=");
        j5.append(true);
        udd.q(j922.c, j5.toString());
        sce.b((sce) j922.b.getValue(), new e92(((lqc) ((qac) j922.a.getValue())).n(), j, j2, j3, j4, (String) null, 0, 40, 0, md4, 3776));
    }

    public static long b(j92 j92, long j, long j2, long j3, long j4, long j5, md4 md4) {
        j92 j922 = j92;
        j92.getClass();
        String T = ez3.T(Long.valueOf(j3));
        String T2 = ez3.T(Long.valueOf(j4));
        StringBuilder j6 = m4b.j("from-to: chatId = ", j, ", time = ", T);
        j6.append(", backwardTime = ");
        j6.append(T2);
        j6.append(", chatAccessToken=");
        j6.append(true);
        udd.q(j922.c, j6.toString());
        return sce.b((sce) j922.b.getValue(), new e92(((lqc) ((qac) j922.a.getValue())).n(), j, j2, j3, j5, (String) null, 40, 40, j4, md4, 3200));
    }

    public static long c(j92 j92, long j, long j2, long j3, long j4, long j5, md4 md4) {
        j92 j922 = j92;
        j92.getClass();
        String T = ez3.T(Long.valueOf(j3));
        String T2 = ez3.T(Long.valueOf(j4));
        StringBuilder j6 = m4b.j("to: chatId = ", j, ", time = ", T);
        j6.append(", backwardTime = ");
        j6.append(T2);
        j6.append(", chatAccessToken=");
        j6.append(true);
        udd.q(j922.c, j6.toString());
        return sce.b((sce) j922.b.getValue(), new e92(((lqc) ((qac) j922.a.getValue())).n(), j, j2, j3, j5, (String) null, 0, 40, j4, md4, 3264));
    }
}
