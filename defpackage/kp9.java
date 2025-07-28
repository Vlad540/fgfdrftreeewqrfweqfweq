package defpackage;

/* renamed from: kp9  reason: default package */
public final class kp9 {
    public final boolean a;
    public final String b;
    public final int c;
    public final boolean d;
    public final boolean e;

    public kp9(boolean z, String str, int i, boolean z2, boolean z3) {
        this.a = z;
        this.b = str;
        this.c = i;
        this.d = z2;
        this.e = z3;
    }

    public final String toString() {
        return "Settings{notify=" + this.a + ", ringtone='" + this.b + "', led=" + this.c + ", vibrate=" + this.d + ", maxPriority=" + this.e + '}';
    }
}
