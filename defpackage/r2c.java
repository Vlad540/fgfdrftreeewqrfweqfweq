package defpackage;

import java.io.Serializable;

/* renamed from: r2c  reason: default package */
public enum r2c implements Serializable {
    UNKNOWN(0),
    EMOJI(1),
    STICKER(2),
    GIF(3),
    ANIMOJI(4);
    
    public final int a;

    /* access modifiers changed from: public */
    r2c(int i) {
        this.a = i;
    }
}
