package defpackage;

import java.util.List;

/* renamed from: a4b  reason: default package */
public final class a4b extends jh0 {
    public static final uae X = new uae("privacy.restricted", (String) null, (String) null);
    public final long c;
    public final List o;

    public a4b(long j, List list) {
        super(X);
        this.c = j;
        this.o = list;
    }

    public final String toString() {
        return "PrivacyRestrictedError{chatId=" + this.c + ", contactIds=" + this.o + '}';
    }
}
