package defpackage;

import java.util.List;

/* renamed from: j93  reason: default package */
public final class j93 {
    public ws6 a;
    public lk9 b;
    public qs4 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public boolean h;

    public j93(List list, lk9 lk9, qs4 qs4, boolean z, boolean z2, boolean z3, int i, boolean z4) {
        oyb.c("Audio transmuxing and audio track forcing are not allowed together.", !z2 || !z);
        this.a = ws6.j(list);
        this.b = lk9;
        this.c = qs4;
        this.e = z2;
        this.f = z3;
        this.d = z;
        this.g = i;
        this.h = z4;
    }

    public j93 a() {
        ws6 ws6 = this.a;
        boolean z = this.f;
        int i = this.g;
        return new j93(ws6, this.b, this.c, this.d, this.e, z, i, this.h && i == 0);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [j93, java.lang.Object] */
    public j93 b() {
        ? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = this.h;
        return obj;
    }

    public void c(List list) {
        oyb.c("The composition must contain at least one EditedMediaItemSequence.", !list.isEmpty());
        this.a = ws6.j(list);
    }
}
