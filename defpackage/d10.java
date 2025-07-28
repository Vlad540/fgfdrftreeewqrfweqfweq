package defpackage;

import java.util.HashMap;

/* renamed from: d10  reason: default package */
public final class d10 {
    public final /* synthetic */ int a;
    public float b;
    public float c;
    public float d;
    public float e;

    public /* synthetic */ d10() {
        this.a = 1;
    }

    public HashMap a() {
        HashMap hashMap = new HashMap();
        hashMap.put("x1", Float.valueOf(this.b));
        hashMap.put("y1", Float.valueOf(this.c));
        hashMap.put("x2", Float.valueOf(this.d));
        hashMap.put("y2", Float.valueOf(this.e));
        return hashMap;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "{x1=" + this.b + ", y1=" + this.c + ", x2=" + this.d + ", y2=" + this.e + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ d10(float f, float f2, float f3, float f4, int i) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }
}
