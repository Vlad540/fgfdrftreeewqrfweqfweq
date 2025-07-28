package defpackage;

import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: bh5  reason: default package */
public final class bh5 {
    public final Signature a;
    public final Cipher b;
    public final Mac c;

    public bh5(Signature signature) {
        this.a = signature;
        this.b = null;
        this.c = null;
    }

    public bh5(Cipher cipher) {
        this.b = cipher;
        this.a = null;
        this.c = null;
    }

    public bh5(Mac mac) {
        this.c = mac;
        this.b = null;
        this.a = null;
    }
}
