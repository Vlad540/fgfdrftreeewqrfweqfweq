package defpackage;

import java.util.Objects;

/* renamed from: gze  reason: default package */
public final class gze {
    public final Boolean a;
    public final Long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Boolean h;
    public final Integer i;
    public final Integer j;
    public final Integer k;
    public final Boolean l;
    public final Boolean m;
    public final Boolean n;
    public final int o;
    public final int p;
    public final fze q;
    public final int r;
    public final int s;
    public final Boolean t;
    public final Boolean u;
    public final int v;

    public gze(eze eze) {
        this.a = eze.a;
        this.b = eze.b;
        this.c = eze.c;
        this.d = eze.d;
        this.e = eze.e;
        this.f = eze.f;
        this.g = eze.g;
        this.h = eze.h;
        this.i = eze.i;
        this.j = eze.j;
        this.k = eze.k;
        this.l = eze.l;
        this.m = eze.m;
        this.n = eze.n;
        this.o = eze.o;
        this.p = eze.p;
        this.q = eze.q;
        this.r = eze.r;
        this.s = eze.s;
        this.t = eze.t;
        this.u = eze.u;
        this.v = eze.v;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gze.class != obj.getClass()) {
            return false;
        }
        gze gze = (gze) obj;
        return Objects.equals(this.a, gze.a) && Objects.equals(this.b, gze.b) && Objects.equals(this.c, gze.c) && Objects.equals(this.d, gze.d) && Objects.equals(this.e, gze.e) && Objects.equals(this.f, gze.f) && Objects.equals(this.g, gze.g) && Objects.equals(this.h, gze.h) && Objects.equals(this.i, gze.i) && Objects.equals(this.j, gze.j) && Objects.equals(this.k, gze.k) && Objects.equals(this.l, gze.l) && Objects.equals(this.m, gze.m) && Objects.equals(this.n, gze.n) && this.o == gze.o && this.p == gze.p && this.q == gze.q && this.r == gze.r && this.s == gze.s && Objects.equals(this.t, gze.t) && Objects.equals(this.u, gze.u) && this.v == gze.v;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, hr1.a(this.o), hr1.a(this.p), this.q, hr1.a(this.r), hr1.a(this.s), this.t, this.u, hr1.a(this.v)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserSettings{pushNewContacts=");
        sb.append(this.a);
        sb.append(", dontDustirbUntil=");
        sb.append(this.b);
        sb.append(", dialogsPushNotification='");
        sb.append(this.c);
        sb.append("', chatsPushNotification='");
        sb.append(this.d);
        sb.append("', pushSound='");
        sb.append(this.e);
        sb.append("', dialogsPushSound='");
        sb.append(this.f);
        sb.append("', chatsPushSound='");
        sb.append(this.g);
        sb.append("', hiddenOnline=");
        sb.append(this.h);
        sb.append(", led=");
        sb.append(this.i);
        sb.append(", dialogsLed=");
        sb.append(this.j);
        sb.append(", chatsLed=");
        sb.append(this.k);
        sb.append(", vibration=");
        sb.append(this.l);
        sb.append(", dialogsVibration=");
        sb.append(this.m);
        sb.append(", chatsVibration=");
        sb.append(this.n);
        sb.append(", chatsInvite=");
        sb.append(sxe.t(this.o));
        sb.append(", incomingCall=");
        sb.append(sxe.t(this.p));
        sb.append(", inactiveTtl=");
        sb.append(this.q);
        sb.append(", groupChatCallNotificationStatus=");
        int i2 = this.r;
        sb.append(i2 != 1 ? i2 != 2 ? "null" : "OFF" : "ON");
        sb.append(", suggestStickersStatus=");
        int i3 = this.s;
        sb.append(i3 != 1 ? i3 != 2 ? "null" : "OFF" : "ON");
        sb.append(", audioTranscriptionEnabled=");
        sb.append(this.t);
        sb.append(", safeMode=");
        sb.append(this.u);
        sb.append(", searchByPhone=");
        sb.append(sxe.t(this.v));
        sb.append("}");
        return sb.toString();
    }
}
