package defpackage;

/* renamed from: av7  reason: default package */
public final class av7 {
    public final dm7 a;
    public final long b;
    public final long c;
    public final ev7 d;
    public final String e;
    public final String f;
    public final float g;
    public final boolean h;
    public final boolean i;
    public final long j;
    public final boolean k;
    public final String l;

    public av7(zu7 zu7) {
        this.a = zu7.a;
        this.b = zu7.b;
        this.c = zu7.c;
        this.d = zu7.d;
        this.e = zu7.e;
        this.f = zu7.f;
        this.g = zu7.g;
        this.h = zu7.h;
        this.i = zu7.i;
        this.j = zu7.j;
        this.k = zu7.k;
        this.l = zu7.l;
    }

    public final zu7 a() {
        zu7 zu7 = new zu7(this.a);
        zu7.b = this.b;
        zu7.c = this.c;
        zu7.d = this.d;
        zu7.e = this.e;
        zu7.f = this.f;
        zu7.g = this.g;
        zu7.h = this.h;
        zu7.i = this.i;
        zu7.j = this.j;
        zu7.k = this.k;
        zu7.l = this.l;
        return zu7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarkerData{location=");
        sb.append(this.a);
        sb.append(", contactId=");
        sb.append(this.b);
        sb.append(", messageId=");
        sb.append(this.c);
        sb.append(", markerWeight=");
        sb.append(this.d);
        sb.append(", title='");
        sb.append(this.e);
        sb.append("', address='");
        sb.append(this.f);
        sb.append("', distance=");
        sb.append(this.g);
        sb.append(", live=");
        sb.append(this.h);
        sb.append(", decoding=");
        sb.append(this.i);
        sb.append(", date=");
        sb.append(this.j);
        sb.append(", active=");
        sb.append(this.k);
        sb.append(", deviceId='");
        return wn6.l(sb, this.l, "'}");
    }
}
