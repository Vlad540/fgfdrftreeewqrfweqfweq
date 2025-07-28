package defpackage;

/* renamed from: to7  reason: default package */
public final class to7 extends kh0 {
    public final zb9 X;
    public final boolean b;
    public final boolean c;
    public final boolean o;

    public to7(long j, boolean z, boolean z2, boolean z3, zb9 zb9) {
        super(j);
        this.b = z;
        this.c = z2;
        this.o = z3;
        this.X = zb9;
    }

    public final String toString() {
        int i = this.X.d;
        return "LoginEvent(requestId=" + this.a + ", isFirstLogin=" + this.b + ", hasNewMessages=" + this.c + ", videoChatHistory=" + this.o + ", chats=" + i + ")";
    }
}
