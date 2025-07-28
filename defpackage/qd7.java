package defpackage;

/* renamed from: qd7  reason: default package */
public final class qd7 extends kh0 {
    public final zc6 X;
    public final s2f Y;
    public final Long Z;
    public final Long b;
    public final long c;
    public final gn3 o;
    public final String w0;

    public qd7(long j, Long l, long j2, gn3 gn3, zc6 zc6, s2f s2f, Long l2, String str) {
        super(j);
        this.b = l;
        this.c = j2;
        this.o = gn3;
        this.X = zc6;
        this.Y = s2f;
        this.Z = l2;
        this.w0 = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LinkInfoEvent{chatId=");
        sb.append(this.b);
        sb.append(", messageId=");
        sb.append(this.c);
        sb.append(", contactSearchResult=");
        sb.append(this.o);
        sb.append(", groupChatInfo=");
        sb.append(this.X);
        sb.append(", videoConference=");
        sb.append(this.Y);
        sb.append(", stickerSetId=");
        sb.append(this.Z);
        sb.append(", startPayload='");
        return wn6.l(sb, this.w0, "'}");
    }
}
