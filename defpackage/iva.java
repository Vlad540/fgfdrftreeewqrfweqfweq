package defpackage;

/* renamed from: iva  reason: default package */
public final class iva extends u2 {
    public static final iva c = new u2(8);

    public static a34 Z1(long j, long j2, boolean z) {
        StringBuilder j3 = m4b.j(":chats?id=", j, "&type=", z ? "local" : "server");
        j3.append("&message_id=");
        j3.append(j2);
        return new a34(j3.toString());
    }
}
