package defpackage;

import java.util.Locale;

/* renamed from: cn7  reason: default package */
public enum cn7 {
    SEND,
    EXCEPTION(r2),
    SEND_ACK,
    QUEUE,
    ERROR(r2),
    RECEIVE,
    NOTIF;
    
    public final tn7 a;
    public final String b;

    /* access modifiers changed from: public */
    cn7(tn7 tn7) {
        this.a = tn7;
        this.b = name().toLowerCase(Locale.ROOT);
    }
}
