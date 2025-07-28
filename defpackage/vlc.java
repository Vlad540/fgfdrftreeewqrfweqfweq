package defpackage;

import java.util.List;

/* renamed from: vlc  reason: default package */
public final class vlc {
    public final List a;
    public final List b;
    public final List c;
    public final int d;
    public final int e;
    public final int f;

    public vlc(List list, List list2, List list3, int i, int i2, int i3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = i;
        this.e = i2;
        this.f = i3;
    }

    public final String toString() {
        Object obj = this.b.get(this.e);
        Object obj2 = this.c.get(this.f);
        return "ScheduledSendPickerData(currentHour=" + obj + ", currentMinute=" + obj2 + ")";
    }
}
